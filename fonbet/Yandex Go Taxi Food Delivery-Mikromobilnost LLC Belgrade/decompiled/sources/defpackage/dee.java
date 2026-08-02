package defpackage;

import java.util.WeakHashMap;

/* loaded from: classes9.dex */
public final class dee {
    public final bpl a;
    public final mw5 b;
    public mw5 c;
    public tol d;
    public final float e;

    public dee(bpl bplVar, mw5 mw5Var) {
        this.a = bplVar;
        this.b = mw5Var;
        this.e = bplVar.getLayout().getResources().getDisplayMetrics().density;
    }

    public final void a() {
        tol tolVar = this.d;
        bpl bplVar = this.a;
        if (tolVar != null) {
            WeakHashMap weakHashMap = tolVar.b;
            if (weakHashMap.remove(bplVar) != null) {
                WeakHashMap weakHashMap2 = tolVar.c;
                weakHashMap2.put(bplVar, Integer.valueOf(((Number) weakHashMap2.getOrDefault(bplVar, 0)).intValue() + 1));
            }
            tolVar.a.remove(bplVar);
            bplVar.toContentMode();
            if (weakHashMap.isEmpty()) {
                tolVar.b();
            }
        }
        bplVar.setPlaceholderHeight(0);
        this.c = null;
        this.d = null;
    }

    public final void b(omk omkVar, zmk zmkVar, tls tlsVar) {
        mw5 mw5Var = this.c;
        if (mw5Var == null) {
            mw5Var = this.b;
        }
        boolean z = mw5Var instanceof y93;
        bpl bplVar = this.a;
        if (z) {
            int b = m810.b(((y93) mw5Var).a * this.e);
            bplVar.setPlaceholderHeight(b >= 0 ? b : 0);
            r3 = 1;
        } else {
            bplVar.setPlaceholderHeight(0);
        }
        tol tolVar = this.d;
        if (tolVar != null) {
            WeakHashMap weakHashMap = tolVar.a;
            Boolean bool = Boolean.TRUE;
            weakHashMap.put(bplVar, bool);
            tolVar.b.put(bplVar, bool);
            bplVar.toPlaceholderMode();
        }
        if (r3 != 0) {
            bplVar.setDataAsync(omkVar, zmkVar, new ga1(tolVar, this, tlsVar, 3));
            return;
        }
        bplVar.setData(omkVar, zmkVar);
        if (tolVar != null) {
            tolVar.a(bplVar);
        }
        if (tlsVar != null) {
            tlsVar.invoke(bplVar.getDivView());
        }
    }
}
