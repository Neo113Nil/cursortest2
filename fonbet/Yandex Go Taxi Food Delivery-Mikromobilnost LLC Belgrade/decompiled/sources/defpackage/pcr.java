package defpackage;

import android.content.Context;
import androidx.datastore.core.b;
import androidx.datastore.core.h;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class pcr implements wvf0 {
    public final /* synthetic */ int a;
    public final m3w b;
    public final yvf0 c;

    public pcr(wvf0 wvf0Var, m3w m3wVar) {
        this.a = 2;
        this.c = wvf0Var;
        this.b = m3wVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        m3w m3wVar = this.b;
        yvf0 yvf0Var = this.c;
        switch (i) {
            case 0:
                Context context = (Context) m3wVar.b;
                fse fseVar = (fse) yvf0Var.get();
                xw91 xw91Var = xw91.E;
                dxf0 dxf0Var = new dxf0(new dsg(20));
                ike a = bvf0.a(fseVar);
                ku2 ku2Var = new ku2(context, 9);
                EmptyList emptyList = EmptyList.a;
                try {
                    System.loadLibrary("datastore_shared_counter");
                    return h.b(xw91Var, dxf0Var, emptyList, a, ku2Var);
                } catch (SecurityException | UnsatisfiedLinkError unused) {
                    return b.a(new n1r(xw91Var, ku2Var), dxf0Var, emptyList, a);
                }
            case 1:
                return new q5f0((Context) m3wVar.b, (by21) yvf0Var.get());
            default:
                return new fwi0((d03) yvf0Var.get(), (fse) m3wVar.b);
        }
    }

    public /* synthetic */ pcr(m3w m3wVar, wvf0 wvf0Var, int i) {
        this.a = i;
        this.b = m3wVar;
        this.c = wvf0Var;
    }
}
