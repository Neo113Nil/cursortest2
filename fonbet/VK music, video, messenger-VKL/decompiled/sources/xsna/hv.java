package xsna;

import android.content.Context;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.channels.impl.list.g;
import com.vk.dto.common.id.UserId;
import com.vk.friends.recommendations.impl.presentation.FriendsImportFragment;
import com.vk.home.HomeFragment2;
import com.vk.newsfeed.impl.fragments.BottomSheetCommentsFragment;
import com.vk.sharing.api.dto.Target;
import com.vk.sharing.im_engine_impl.BaseSharingExternalActivity;
import com.vk.stickers.views.gift.AnimatedGiftView;
import com.vkontakte.android.R;
import java.util.List;
import xsna.drz;
import xsna.nzl;
import xsna.v3j;
import xsna.ygb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class hv implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hv(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = 7;
        switch (this.b) {
            case 0:
                fw fwVar = (fw) this.c;
                int intValue = ((Integer) obj).intValue();
                Context context = fwVar.a.i0.getContext();
                cmf0.d(context, fwVar.a.i0.getWindow(), context.getString(intValue), false, (56 & 16) != 0 ? iah0.a(88) : 0, (56 & 32) != 0);
                break;
            case 1:
                ((com.vk.movika.sdk.base.observable.o) this.c).invoke(obj);
                break;
            case 2:
                com.vk.movika.sdk.base.observable.o oVar = (com.vk.movika.sdk.base.observable.o) this.c;
                int i2 = AnimatedGiftView.g;
                oVar.invoke(obj);
                break;
            case 3:
                ((sy4) this.c).invoke(obj);
                break;
            case 4:
                BaseSharingExternalActivity baseSharingExternalActivity = (BaseSharingExternalActivity) this.c;
                nbj0 nbj0Var = (nbj0) obj;
                int i3 = BaseSharingExternalActivity.Z;
                if (nbj0Var instanceof gcj0) {
                    gcj0 gcj0Var = (gcj0) nbj0Var;
                    Throwable th = gcj0Var.a;
                    VKApiExecutionException vKApiExecutionException = th instanceof VKApiExecutionException ? (VKApiExecutionException) th : null;
                    cvk.w((vKApiExecutionException == null || vKApiExecutionException.s() != 7 || vKApiExecutionException.x()) ? j03.g(baseSharingExternalActivity.i, gcj0Var.a, R.string.sharing_job_call_message_toast_fail) : baseSharingExternalActivity.getString(R.string.vkim_msg_write_disabled_sender_kicked), false);
                    UserId userId = new UserId(gcj0Var.b.longValue());
                    ecj0 ecj0Var = baseSharingExternalActivity.P;
                    if (ecj0Var != null) {
                        ecj0Var.d(userId);
                    }
                    List<Target> g = fkq0.b(userId) ? baseSharingExternalActivity.O.g() : baseSharingExternalActivity.O.f();
                    for (int i4 = 0; i4 < g.size(); i4++) {
                        Target target = g.get(i4);
                        if (userId.equals(target.c)) {
                            target.g = false;
                            baseSharingExternalActivity.K2(target, i4);
                        }
                    }
                    break;
                }
                break;
            case 5:
                ((com.vk.movika.sdk.base.observable.o) this.c).invoke(obj);
                break;
            case 6:
                r78 r78Var = (r78) this.c;
                nzl.a aVar = BottomSheetCommentsFragment.f1;
                r78Var.invoke(obj);
                break;
            case 7:
                ((com.vk.movika.sdk.base.observable.o) this.c).invoke(obj);
                break;
            case 8:
                ((mo1) this.c).invoke(obj);
                break;
            case 9:
                com.vk.channels.impl.list.b bVar = (com.vk.channels.impl.list.b) this.c;
                ygb.a aVar2 = (ygb.a) obj;
                bVar.o = aVar2.a.c;
                if (bVar.r.compareAndSet(false, true)) {
                    io.reactivex.rxjava3.subjects.j jVar = bVar.c;
                    bVar.g();
                    jVar.onNext(new bhb(aVar2.b.a));
                } else {
                    bVar.q(new com.vk.im.ui.fragments.b(aVar2, 21));
                }
                bVar.n(new g.c(aVar2.a.g));
                break;
            case 10:
                ((cq3) this.c).invoke(obj);
                break;
            case 11:
                ((mo1) this.c).invoke(obj);
                break;
            case 12:
                ((r8) this.c).invoke(obj);
                break;
            case 13:
                ((cfg) this.c).invoke(obj);
                break;
            case 14:
                ((v3j.a) this.c).invoke(obj);
                break;
            case 15:
                ((com.vk.movika.sdk.base.observable.o) this.c).invoke(obj);
                break;
            case 16:
                ((whe) this.c).invoke(obj);
                break;
            case 17:
                ((com.vk.movika.sdk.base.observable.o) this.c).invoke(obj);
                break;
            case 18:
                ((kdn) this.c).invoke(obj);
                break;
            case 19:
                ((mo1) this.c).invoke(obj);
                break;
            case 20:
                ((kdn) this.c).invoke(obj);
                break;
            case 21:
                ((cq3) this.c).invoke(obj);
                break;
            case 22:
                pzr pzrVar = (pzr) this.c;
                pzrVar.q(new wqb(i, (drz.a) obj, pzrVar));
                break;
            case 23:
                kdn kdnVar = (kdn) this.c;
                int i5 = FriendsImportFragment.a0;
                kdnVar.invoke(obj);
                break;
            case 24:
                ((kdn) this.c).invoke(obj);
                break;
            case 25:
                ((kdn) this.c).invoke(obj);
                break;
            case 26:
                lw3 lw3Var = (lw3) this.c;
                int i6 = HomeFragment2.x0;
                lw3Var.invoke(obj);
                break;
            case 27:
                ((kdn) this.c).invoke(obj);
                break;
            case 28:
                ((kdn) this.c).invoke(obj);
                break;
            default:
                ((s8) this.c).invoke(obj);
                break;
        }
    }
}
