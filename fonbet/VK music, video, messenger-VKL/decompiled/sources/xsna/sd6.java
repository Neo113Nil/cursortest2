package xsna;

import com.google.android.gms.internal.location.zzbp;
import com.vk.core.exceptions.DisposableException;
import com.vk.im.ui.fragments.ImRequestsFragment;
import xsna.el50;
import xsna.izz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class sd6 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sd6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                td6 td6Var = (td6) obj;
                izz izzVar = (izz) td6Var;
                zzbp zzbpVar = izzVar.h;
                if (zzbpVar != null) {
                    izz.b bVar = izzVar.i;
                    if (bVar == null) {
                        bVar = null;
                    }
                    zzbpVar.removeLocationUpdates(bVar);
                }
                nlz0 nlz0Var = td6Var.d;
                (nlz0Var != null ? nlz0Var : null).n();
                break;
            case 1:
                com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.b bVar2 = (com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.b) obj;
                el50.a.b(bVar2, new lbe(bVar2, 8));
                break;
            case 2:
                ((eqh) obj).e.b(null);
                break;
            case 3:
                ((drz) obj).onDestroy();
                break;
            case 4:
                qcy<Object>[] qcyVarArr = ImRequestsFragment.Z;
                g9e0 g9e0Var = ((ImRequestsFragment) obj).Y;
                qcy<Object> qcyVar = ImRequestsFragment.Z[0];
                ((bzb0) g9e0Var.b()).a();
                break;
            case 5:
                ((qdw) obj).f.e();
                break;
            case 6:
                yp80 yp80Var = (yp80) obj;
                if (yp80Var != null) {
                    yp80Var.onError(new DisposableException());
                    break;
                }
                break;
            default:
                ((com.vk.voip.ui.hint.a) obj).c();
                break;
        }
    }
}
