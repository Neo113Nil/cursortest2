package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import yads.ab3;
import yads.wh3;
import yads.za3;

/* loaded from: classes7.dex */
public final class o281 implements z971 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public o281(Context context, i581 i581Var) {
        this.a = 2;
        this.b = context.getApplicationContext();
        k781 k781Var = i581Var.a;
        long j = k781Var.B;
        ArrayList arrayList = k781Var.w;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if ("progress".equals(((tz61) next).a)) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            tz61 tz61Var = (tz61) it2.next();
            ab3 ab3Var = tz61Var.c;
            fp81 fp81Var = null;
            if (ab3Var != null) {
                za3 za3Var = za3.b;
                za3 za3Var2 = ab3Var.b;
                Long valueOf = za3Var == za3Var2 ? Long.valueOf((long) ab3Var.c) : za3.c == za3Var2 ? Long.valueOf((long) ((ab3Var.c / 100.0f) * j)) : null;
                if (valueOf != null) {
                    fp81Var = new fp81(tz61Var.b, valueOf.longValue());
                }
            }
            if (fp81Var != null) {
                arrayList3.add(fp81Var);
            }
        }
        this.c = new ArrayList(arrayList3);
    }

    @Override // defpackage.z971
    public final void c(long j, long j2) {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                if (j != 0) {
                    Iterator it = ((ArrayList) obj2).iterator();
                    while (it.hasNext()) {
                        zy71 zy71Var = (zy71) it.next();
                        if (zy71Var.b * j <= j2) {
                            ((hv81) obj).a.c(zy71Var.a);
                            it.remove();
                        }
                    }
                    break;
                }
                break;
            case 1:
                View d = ((yp61) ((i971) ((aj31) obj2).b).b).d();
                boolean z = (d == null || sj71.e(d) || sj71.b(d) < 50) ? false : true;
                eq71 eq71Var = ((bc71) obj).a;
                if (!z) {
                    if (eq71Var.e()) {
                        eq71Var.f();
                        break;
                    }
                } else if (!eq71Var.e() && !eq71Var.j && !eq71Var.k) {
                    eq71Var.a.j(true);
                    break;
                }
                break;
            default:
                Iterator it2 = ((ArrayList) obj2).iterator();
                while (it2.hasNext()) {
                    fp81 fp81Var = (fp81) it2.next();
                    if (fp81Var.b <= j2) {
                        vv71 a = vv71.c.a((Context) obj);
                        a.b.b(new yi71(a.a, fp81Var.a, new s581()));
                        it2.remove();
                    }
                }
                break;
        }
    }

    public o281(bc71 bc71Var, i971 i971Var) {
        this.a = 1;
        aj31 aj31Var = new aj31(28, i971Var);
        this.b = bc71Var;
        this.c = aj31Var;
    }

    public o281(hv81 hv81Var) {
        this.a = 0;
        this.b = hv81Var;
        this.c = scc.i(new zy71(wh3.b, 0.25f), new zy71(wh3.c, 0.5f), new zy71(wh3.d, 0.75f));
    }
}
