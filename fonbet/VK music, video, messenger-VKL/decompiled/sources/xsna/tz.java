package xsna;

import com.vk.catalog2.feature.music.holders.OfflineHeaderRemoveAllVh;
import com.vk.channels.api.Channel;
import com.vk.friends.recommendations.impl.presentation.FriendsRecommendationsFragment;
import com.vk.sharing.im_engine_impl.BaseSharingExternalActivity;
import com.vk.superapp.browser.internal.ui.shortcats.a;
import java.util.List;
import xsna.drz;
import xsna.jv60;
import xsna.r070;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class tz implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tz(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        int i2 = 4;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((a.d) obj2).invoke(obj);
                break;
            case 1:
                ((oo1) obj2).invoke(obj);
                break;
            case 2:
                ((mt2) obj2).invoke(obj);
                break;
            case 3:
                ((iz0) obj2).invoke(obj);
                break;
            case 4:
                ((io.reactivex.rxjava3.subjects.d) obj2).onNext((ndw) obj);
                break;
            case 5:
                BaseSharingExternalActivity.h hVar = (BaseSharingExternalActivity.h) obj2;
                BaseSharingExternalActivity baseSharingExternalActivity = BaseSharingExternalActivity.this;
                String str = hVar.e;
                int i3 = BaseSharingExternalActivity.Z;
                baseSharingExternalActivity.M3(str, (List) obj);
                break;
            case 6:
                ((iz0) obj2).invoke(obj);
                break;
            case 7:
                com.vk.channels.impl.channel_screen.footer.d dVar = (com.vk.channels.impl.channel_screen.footer.d) obj2;
                dVar.q(new s53(i2, dVar, (Channel) obj));
                break;
            case 8:
                ((mt2) obj2).invoke(obj);
                break;
            case 9:
                ((com.vk.channels.impl.list.b) obj2).s().b((Throwable) obj, new l35(4));
                break;
            case 10:
                ((iz0) obj2).invoke(obj);
                break;
            case 11:
                ((vd1) obj2).invoke(obj);
                break;
            case 12:
                ((iz0) obj2).invoke(obj);
                break;
            case 13:
                ((iz0) obj2).invoke(obj);
                break;
            case 14:
                psm psmVar = (psm) obj2;
                sxp sxpVar = (sxp) obj;
                if (!(sxpVar instanceof nc80) && !(sxpVar instanceof oc80)) {
                    if (!(sxpVar instanceof i980) && !(sxpVar instanceof l980)) {
                        if (sxpVar instanceof ua80) {
                            psmVar.q(new nk0(12, psmVar, sxpVar));
                            break;
                        }
                    } else {
                        psmVar.r(new r3h(psmVar, 7));
                        break;
                    }
                } else {
                    di6.l(psmVar, psmVar.i.a().m(io.reactivex.rxjava3.schedulers.a.b()), new js1(psmVar, 25), 1);
                    break;
                }
                break;
            case 15:
                ((e4n) obj2).e((h4n) obj);
                break;
            case 16:
                ((iz0) obj2).invoke(obj);
                break;
            case 17:
                com.vk.folders.impl.configure.d dVar2 = (com.vk.folders.impl.configure.d) obj2;
                dVar2.q(new oh3(16, dVar2, (drz.a) obj));
                break;
            case 18:
                int i4 = FriendsRecommendationsFragment.b0;
                ((vd1) obj2).invoke(obj);
                break;
            case 19:
                ((cws) obj2).invoke(obj);
                break;
            case 20:
                ((vd1) obj2).invoke(obj);
                break;
            case 21:
                ((cws) obj2).invoke(obj);
                break;
            case 22:
                ((cws) obj2).invoke(obj);
                break;
            case 23:
                ((vd1) obj2).invoke(obj);
                break;
            case 24:
                ((cws) obj2).invoke(obj);
                break;
            case 25:
                ((cws) obj2).invoke(obj);
                break;
            case 26:
                uj60 uj60Var = (uj60) obj2;
                if (((qz60) uj60Var.b.getCurrentState()).h.c <= 3) {
                    uj60Var.e(jv60.a.b.C3149b.a);
                    uj60Var.a(r070.e.f.b);
                    break;
                }
                break;
            case 27:
                qcy<Object>[] qcyVarArr = OfflineHeaderRemoveAllVh.j;
                ((sh3) obj2).invoke(obj);
                break;
            case 28:
                ((c2k) obj2).invoke(obj);
                break;
            default:
                ((sh3) obj2).invoke(obj);
                break;
        }
    }
}
