package xsna;

import java.util.ArrayList;

/* compiled from: FragmentTransitionSupport.java */
/* loaded from: classes12.dex */
public final class kds extends ymp0 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ jds f;

    public kds(jds jdsVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f = jdsVar;
        this.b = obj;
        this.c = arrayList;
        this.d = obj2;
        this.e = arrayList2;
    }

    @Override // xsna.ymp0, xsna.vlp0.i
    public final void onTransitionEnd(vlp0 vlp0Var) {
        vlp0Var.removeListener(this);
    }

    @Override // xsna.ymp0, xsna.vlp0.i
    public final void onTransitionStart(vlp0 vlp0Var) {
        jds jdsVar = this.f;
        Object obj = this.b;
        if (obj != null) {
            jdsVar.A(obj, this.c, null);
        }
        Object obj2 = this.d;
        if (obj2 != null) {
            jdsVar.A(obj2, this.e, null);
        }
    }
}
