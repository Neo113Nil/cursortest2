package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.auth.modal.base.ModalAuthInfo;
import com.vk.auth.ui.consent.ConsentScreenInfo;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.bridges.dto.VkAlertData;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MvkAuthFragment.kt */
/* loaded from: classes15.dex */
public final class do50 extends fv20<Object> {
    public static final /* synthetic */ int D1 = 0;

    /* compiled from: MvkAuthFragment.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            do50 do50Var = (do50) this.receiver;
            int i = do50.D1;
            do50Var.co();
            return s3q0.a;
        }
    }

    /* compiled from: MvkAuthFragment.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((do50) this.receiver).G8();
            return s3q0.a;
        }
    }

    /* compiled from: MvkAuthFragment.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((do50) this.receiver).G8();
            return s3q0.a;
        }
    }

    public do50() {
        Vn(new a(0, this, do50.class, "finishActivityIfRequired", "finishActivityIfRequired()V", 0));
    }

    @Override // xsna.dw20, xsna.jv20
    public final void G8() {
        hide();
        co();
    }

    @Override // xsna.dhg
    public final ehg Mb() {
        return new wcl(requireContext());
    }

    @Override // xsna.fv20
    public final hv20 bo(Context context, fv20 fv20Var) {
        return new eo50(context, this);
    }

    @Override // xsna.fv20
    public final ModalAuthInfo fo() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return (ModalAuthInfo) arguments.getParcelable("info");
        }
        return null;
    }

    @Override // xsna.fv20
    public final int io() {
        return R.string.vk_mvk_auth_title;
    }

    public final void jo() {
        com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
        String str = fo().d;
        SchemeStatSak$EventScreen schemeStatSak$EventScreen = SchemeStatSak$EventScreen.ENTRY_ASK_CONFIRM;
        ConsentScreenInfo consentScreenInfo = fo().p;
        Integer num = consentScreenInfo != null ? consentScreenInfo.b : null;
        coe0 coe0Var = coe0.b;
        boolean a2 = coe0.a();
        bVar.getClass();
        com.vk.registration.funnels.b.z(bVar, SchemeStatSak$EventScreen.ALERT_AUTH_SUCCESS, com.vk.registration.funnels.b.b(str, schemeStatSak$EventScreen, String.valueOf(num), a2), schemeStatSak$EventScreen, null, 24);
        Context requireContext = requireContext();
        b bVar2 = new b(0, this, do50.class, "closeModal", "closeModal()V", 0);
        c cVar = new c(0, this, do50.class, "closeModal", "closeModal()V", 0);
        VkAlertData.b bVar3 = new VkAlertData.b(requireContext.getString(R.string.vk_mvk_auth_success_title), requireContext.getString(R.string.vk_mvk_auth_success_message), (VkAlertData.DialogType) null, new VkAlertData.a(requireContext.getString(R.string.vk_ok), null), (VkAlertData.a) null, 52);
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        (superappUiRouterBridge != null ? superappUiRouterBridge : null).O(e3m.h(requireContext), bVar3, new qr1(cVar, bVar2));
    }

    @Override // xsna.arf0
    public final SchemeStatSak$EventScreen u5() {
        return SchemeStatSak$EventScreen.ENTRY_ASK_CONFIRM;
    }
}
