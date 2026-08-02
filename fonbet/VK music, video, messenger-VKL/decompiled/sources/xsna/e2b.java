package xsna;

import android.content.Context;
import android.database.Cursor;
import android.os.Trace;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class e2b implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ e2b(Context context, Context context2, String str, fxe fxeVar, izs izsVar) {
        this.d = fxeVar;
        this.e = context;
        this.c = str;
        this.f = context2;
        this.g = izsVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        lj30 lj30Var;
        switch (this.b) {
            case 0:
                String[] strArr = (String[]) this.e;
                String str = (String) this.d;
                gkx0 gkx0Var = (gkx0) this.f;
                g2b g2bVar = (g2b) this.g;
                e0w e0wVar = (e0w) obj;
                Cursor d = e0wVar.d(this.c, strArr);
                ArrayList arrayList = new ArrayList(d.getCount());
                Trace.beginSection(ndp0.f("Cursor.forEach"));
                try {
                    try {
                        if (d.moveToFirst()) {
                            while (!d.isAfterLast()) {
                                g2bVar.f.getClass();
                                arrayList.add(w1b.b(d));
                                d.moveToNext();
                            }
                        }
                        Trace.endSection();
                        d = e0wVar.d(str, strArr);
                        ArrayList arrayList2 = new ArrayList(d.getCount());
                        Trace.beginSection(ndp0.f("Cursor.forEach"));
                        try {
                            try {
                                if (d.moveToFirst()) {
                                    while (!d.isAfterLast()) {
                                        g2bVar.f.getClass();
                                        arrayList2.add(w1b.b(d));
                                        d.moveToNext();
                                    }
                                }
                                Trace.endSection();
                                lj30 lj30Var2 = null;
                                if (arrayList.isEmpty()) {
                                    lj30Var = null;
                                } else {
                                    lj30Var = (lj30) arrayList.get(0);
                                    lj30 lj30Var3 = (lj30) j5g.b0(1, arrayList);
                                    if (epx.f(gkx0Var, lj30Var.h)) {
                                        lj30Var = lj30Var3;
                                    }
                                }
                                if (!arrayList2.isEmpty()) {
                                    lj30 lj30Var4 = (lj30) arrayList2.get(0);
                                    lj30Var2 = epx.f(gkx0Var, lj30Var4.h) ? (lj30) j5g.b0(1, arrayList2) : lj30Var4;
                                }
                                return new uz50(lj30Var, lj30Var2);
                            } finally {
                                d.close();
                            }
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    } finally {
                    }
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            default:
                ((fxe) this.d).d((Context) this.e, (Context) this.f, null, this.c, (izs) this.g);
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
        }
    }

    public /* synthetic */ e2b(String str, String[] strArr, String str2, gkx0 gkx0Var, g2b g2bVar) {
        this.c = str;
        this.e = strArr;
        this.d = str2;
        this.f = gkx0Var;
        this.g = g2bVar;
    }
}
