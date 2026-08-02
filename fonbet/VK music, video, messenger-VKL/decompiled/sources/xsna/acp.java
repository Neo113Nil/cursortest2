package xsna;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.ui.modal.VkModal;
import com.vk.core.ui.modal.b;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.id.UserId;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.toggle.anonymous.SakFeatures;
import com.vk.toggle.b;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Pair;
import xsna.c5v0;
import xsna.tlo0;
import xsna.ybp;

/* compiled from: EmailActualizationRouterImpl.kt */
/* loaded from: classes18.dex */
public final class acp implements zbp {
    public final wbp a;
    public io.reactivex.rxjava3.subjects.i<ybp> b;

    public acp(wbp wbpVar) {
        this.a = wbpVar;
    }

    public static boolean c(io.reactivex.rxjava3.subjects.i iVar) {
        Object obj = iVar.b.get();
        Object obj2 = io.reactivex.rxjava3.subjects.i.g;
        if (obj != obj2 || iVar.d == 0) {
            return iVar.b.get() == obj2 && iVar.e != null;
        }
        return true;
    }

    @Override // xsna.zbp
    public final void a(Context context, String str, boolean z) {
        String str2 = z ? "email_actualization_add" : "email_actualization_change";
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        superappUiRouterBridge.h0(context, str, on00.f(new Pair("flow_service", str2)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if (r0 == null) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0134  */
    @Override // xsna.zbp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final io.reactivex.rxjava3.core.x b(UserId userId, String str, String str2) {
        tlo0.a aVar;
        int i;
        tlo0 h;
        tlo0.a aVar2;
        int i2;
        tlo0.f fVar;
        c5v0.a aVar3;
        FragmentActivity activity = this.a.getActivity();
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            if (activity != null && activity.isChangingConfigurations()) {
                io.reactivex.rxjava3.subjects.i<ybp> iVar = this.b;
                if (iVar != null) {
                    io.reactivex.rxjava3.subjects.i<ybp> iVar2 = c(iVar) ? null : iVar;
                    if (iVar2 != null) {
                        return iVar2;
                    }
                }
                return io.reactivex.rxjava3.core.x.k(ybp.a.a);
            }
            ybp.a aVar4 = ybp.a.a;
            io.reactivex.rxjava3.subjects.i<ybp> iVar3 = this.b;
            if (iVar3 != null) {
                if (c(iVar3)) {
                    iVar3 = null;
                }
                if (iVar3 != null) {
                    iVar3.onSuccess(aVar4);
                }
            }
            this.b = null;
            return io.reactivex.rxjava3.core.x.k(aVar4);
        }
        io.reactivex.rxjava3.subjects.i<ybp> iVar4 = this.b;
        if (iVar4 != null) {
            if (c(iVar4)) {
                iVar4 = null;
            }
        }
        iVar4 = new io.reactivex.rxjava3.subjects.i<>();
        this.b = iVar4;
        io.reactivex.rxjava3.subjects.i<ybp> iVar5 = iVar4;
        UserId.b bVar = UserId.c;
        pj1 pj1Var = new pj1(1, this, acp.class, "handleResult", "handleResult(Lcom/vk/emailactualization/api/domain/EmailActualizationResult;)V", 0, 8);
        Context a = hnj.a(activity);
        ubp ubpVar = new ubp(a, activity, str, str2, userId, pj1Var);
        ubpVar.j = false;
        if (ubpVar.f) {
            ubpVar.a().j(userId);
        } else {
            ubpVar.a().g(userId);
        }
        VkModal.Mode mode = VkModal.Mode.Card;
        c5v0.c.b bVar2 = new c5v0.c.b(new gko(R.drawable.vk_icon_illustration_vkid_envelope_letter_120h), null, null, 12);
        SakFeatures.b.getClass();
        b.d i3 = SakFeatures.c.i(SakFeatures.Type.SAK_EMAIL_ACTUALIZATION);
        boolean f = epx.f(i3 != null ? i3.c.toString() : null, "1");
        boolean z = ubpVar.f;
        if (z) {
            tlo0.a aVar5 = tlo0.Companion;
            String str3 = str == null ? "" : str;
            aVar5.getClass();
            h = tlo0.a.c(R.string.vk_email_actualization_has_email_title, str3);
        } else {
            if (z || !f) {
                aVar = tlo0.Companion;
                i = R.string.vk_email_actualization_add_title;
            } else {
                aVar = tlo0.Companion;
                i = R.string.vk_email_actualization_add_title_b;
            }
            h = tq.h(aVar, i);
        }
        boolean z2 = ubpVar.f;
        if (z2 && f) {
            aVar2 = tlo0.Companion;
            i2 = R.string.vk_email_actualization_has_email_subtitle_b;
        } else if (z2) {
            aVar2 = tlo0.Companion;
            i2 = R.string.vk_email_actualization_has_email_subtitle;
        } else {
            if ((!z2 && f) || z2) {
                fVar = null;
                c5v0.b bVar3 = new c5v0.b(4, h, fVar);
                if (ubpVar.f) {
                    aVar3 = new c5v0.a(new c5v0.a.C2643a(tq.h(tlo0.Companion, R.string.vk_email_actualization_button_add), new rbp(0, ubpVar, ubp.class, "onAddEmailClick", "onAddEmailClick()V", 0), null, VkButton.Mode.Primary, VkButton.Appearance.Accent, false, Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE), (c5v0.a.C2643a) null, 6);
                } else {
                    tlo0.f h2 = tq.h(tlo0.Companion, R.string.vk_email_actualization_button_yes);
                    VkButton.Mode mode2 = VkButton.Mode.Secondary;
                    VkButton.Appearance appearance = VkButton.Appearance.Accent;
                    aVar3 = new c5v0.a(new c5v0.a.C2643a(h2, new tbp(0, ubpVar, ubp.class, "actualizeEmail", "actualizeEmail()V", 0), null, mode2, appearance, false, Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE), new c5v0.a.C2643a(new tlo0.f(R.string.vk_email_actualization_button_change), new sbp(0, ubpVar, ubp.class, "onChangeEmailClick", "onChangeEmailClick()V", 0), null, mode2, appearance, false, Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE), true);
                }
                VkModal vkModal = new VkModal(mode, new b.a.C0790b(bVar2, bVar3, null, aVar3, 20), new i3b(0, ubpVar, ubp.class, "onDismiss", "onDismiss()V", 0, 4), true, 4);
                vkModal.g = new lp1(1, ubpVar, ubp.class, "onViewCreated", "onViewCreated(Landroid/view/View;)V", 0, 8);
                vkModal.b(a, "EmailActualizationBottomSheet");
                ubpVar.h = vkModal;
                return iVar5;
            }
            aVar2 = tlo0.Companion;
            i2 = R.string.vk_email_actualization_add_subtitle;
        }
        fVar = tq.h(aVar2, i2);
        c5v0.b bVar32 = new c5v0.b(4, h, fVar);
        if (ubpVar.f) {
        }
        VkModal vkModal2 = new VkModal(mode, new b.a.C0790b(bVar2, bVar32, null, aVar3, 20), new i3b(0, ubpVar, ubp.class, "onDismiss", "onDismiss()V", 0, 4), true, 4);
        vkModal2.g = new lp1(1, ubpVar, ubp.class, "onViewCreated", "onViewCreated(Landroid/view/View;)V", 0, 8);
        vkModal2.b(a, "EmailActualizationBottomSheet");
        ubpVar.h = vkModal2;
        return iVar5;
    }
}
