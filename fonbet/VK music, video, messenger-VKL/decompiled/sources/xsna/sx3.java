package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.ironsource.C4490p6;
import com.ironsource.Ya;
import com.vk.auth.verification.base.states.CodeState;
import com.vk.auth.verification.base.ui.VkCheckEditText;
import com.vk.auth.verification.libverify.LibverifyPresenter;
import com.vk.catalog2.common.ui.mvp.holder.video.AuthorsCatalogRootVh;
import com.vk.clips.interests.impl.ui.ClipsInterestsFragment;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vk.photos.ui.profile.ProfileMainPhotosFragment;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.stickers.bottomsheets.StickersBottomSheetDialog;
import ru.ok.media.AsyncDNSResolver;
import ru.ok.tracer.opentelemetry.record.TracerOpenTelemetryRecorderProvider;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class sx3 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sx3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                AsyncDNSResolver.start$lambda$4((AsyncDNSResolver) obj);
                break;
            case 1:
                AuthorsCatalogRootVh authorsCatalogRootVh = (AuthorsCatalogRootVh) obj;
                g3a.a(authorsCatalogRootVh.q, authorsCatalogRootVh);
                break;
            case 2:
                ynb.j((ynb) obj);
                break;
            case 3:
                int i2 = ClipsInterestsFragment.Y;
                ((ClipsInterestsFragment) obj).fo(-1);
                break;
            case 4:
                lnj lnjVar = ((fpj) obj).f;
                if (lnjVar != null) {
                    View view = lnjVar.c;
                    if (!lnjVar.c()) {
                        lnjVar.a();
                        lnjVar.d = f4m.e(lnjVar.a).exactCenterY() <= f4m.e(view).exactCenterY();
                        myt0.a(view, new n7(lnjVar, 19));
                        break;
                    }
                }
                break;
            case 5:
                ((gzs) obj).invoke();
                break;
            case 6:
                break;
            case 7:
                LibverifyPresenter libverifyPresenter = (LibverifyPresenter) obj;
                CodeState codeState = libverifyPresenter.W;
                if (codeState instanceof CodeState.MessengerLoading) {
                    par0.a.getClass();
                    par0.a("[LibverifyPresenter] messengerLoadingTimeout, switching to MessengerRegistration");
                    CodeState.MessengerLoading messengerLoading = (CodeState.MessengerLoading) codeState;
                    libverifyPresenter.L0(new CodeState.MessengerRegistration(messengerLoading.e, messengerLoading.f, messengerLoading.g));
                    libverifyPresenter.N0();
                    libverifyPresenter.E.e();
                    RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                    frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.MESSENGER_SIGN_UP_PROMO, null, null, null, null, null, null, 254);
                    break;
                }
                break;
            case 8:
                ((ydz) obj).c();
                break;
            case 9:
                kyd0 kyd0Var = ((ProfileMainPhotosFragment) obj).y0;
                if (kyd0Var != null) {
                    new lca0(kyd0Var.f, kyd0Var.m.size(), kyd0Var.m.size()).l(kyd0Var.c);
                    break;
                }
                break;
            case 10:
                m6f0 m6f0Var = (m6f0) obj;
                m6f0Var.a.h(Integer.valueOf(m6f0Var.n));
                break;
            case 11:
                int i3 = osf0.q1;
                bpn0 bpn0Var = t65.a;
                VkCheckEditText vkCheckEditText = ((osf0) obj).o1;
                if (vkCheckEditText == null) {
                    vkCheckEditText = null;
                }
                t65.a(vkCheckEditText.getSelectedCellView());
                break;
            case 12:
                int i4 = StickersBottomSheetDialog.a0;
                ((StickersBottomSheetDialog) obj).tn();
                break;
            case 13:
                TracerOpenTelemetryRecorderProvider.scheduleExport$lambda$1((TracerOpenTelemetryRecorderProvider) obj);
                break;
            case 14:
                ModalBottomSheetBehavior<ViewGroup> modalBottomSheetBehavior = ((nw20) obj).i;
                if (modalBottomSheetBehavior != null) {
                    modalBottomSheetBehavior.O(3);
                    break;
                }
                break;
            case 15:
                Ya.e((Ya) obj);
                break;
            default:
                C4490p6.a((C4490p6) obj);
                break;
        }
    }
}
