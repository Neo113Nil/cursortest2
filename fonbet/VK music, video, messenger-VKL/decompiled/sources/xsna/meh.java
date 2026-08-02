package xsna;

import android.view.View;
import com.vk.catalog2.feature.music.ui.holder.MusicOfflineWrapperVh;
import com.vk.external.miniapp.net.app.WebApiApplication;
import xsna.g0x0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class meh implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ meh(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.d;
        boolean z = this.c;
        switch (i) {
            case 0:
                neh nehVar = (neh) obj2;
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) obj;
                if (z) {
                    nehVar.c.b(cVar);
                }
                break;
            case 1:
                View view = ((MusicOfflineWrapperVh) obj2).d;
                if (view != null) {
                    view.setAlpha(z ? 1.0f : 0.64f);
                }
                break;
            case 2:
                ihu0 ihu0Var = (ihu0) obj2;
                WebApiApplication v = ihu0Var.e.v();
                if (v != null) {
                    v.R = Boolean.valueOf(z);
                }
                ((xfu0) ihu0Var.g.invoke()).f(Boolean.valueOf(z));
                break;
            case 3:
                l7k0 l7k0Var = (l7k0) obj2;
                tgi0 tgi0Var = (tgi0) obj;
                if (z) {
                    qgi0.j(tgi0Var, 0);
                }
                pis0 pis0Var = new pis0(l7k0Var, 14);
                qcy<Object>[] qcyVarArr = qgi0.a;
                tgi0Var.a(wfi0.v, new ck(null, pis0Var));
                break;
            default:
                j0x0 j0x0Var = (j0x0) obj2;
                if (z) {
                    j0x0Var.T(new g0x0.a.f(true));
                } else {
                    j0x0Var.T(new g0x0.a.d());
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ meh(boolean z, Object obj, int i) {
        this.b = i;
        this.c = z;
        this.d = obj;
    }
}
