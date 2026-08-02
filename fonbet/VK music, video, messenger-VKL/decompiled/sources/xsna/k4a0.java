package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.FragmentActivity;
import com.vk.auth.validation.VkPhoneValidationErrorReason;
import com.vk.auth.validation.internal.PhoneValidationContract$SkipBehaviour;
import com.vk.auth.validation.internal.PhoneValidationContract$ValidationDialogMetaInfo;
import com.vk.dto.common.ImageSizeKey;
import com.vk.superapp.bridges.LogoutReason;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.bridges.dto.VkAlertData;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.c4a0;
import xsna.dw20;
import xsna.eeu0;
import xsna.egn0;

/* compiled from: PhoneValidationView.kt */
/* loaded from: classes15.dex */
public final class k4a0 implements dhg {
    public final FragmentActivity b;
    public final c4a0 c;
    public final CharSequence d;
    public final wzs<dw20.b, String, s3q0> e;
    public final e750 f = new e750(3);

    /* compiled from: PhoneValidationView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PhoneValidationContract$SkipBehaviour.values().length];
            try {
                iArr[PhoneValidationContract$SkipBehaviour.LOGOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PhoneValidationContract$SkipBehaviour.UNLINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PhoneValidationContract$SkipBehaviour.NOTHING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public k4a0(FragmentActivity fragmentActivity, c4a0 c4a0Var, CharSequence charSequence, hd4 hd4Var) {
        this.b = fragmentActivity;
        this.c = c4a0Var;
        this.d = charSequence;
        this.e = hd4Var;
    }

    @Override // xsna.dhg
    public final ehg Mb() {
        return new wcl(this.b);
    }

    public final void a(String str, izs<? super VkAlertData.a, s3q0> izsVar) {
        FragmentActivity fragmentActivity = this.b;
        VkAlertData.b bVar = new VkAlertData.b(fragmentActivity.getString(R.string.vk_auth_error), str, (VkAlertData.DialogType) null, new VkAlertData.a(fragmentActivity.getString(R.string.vk_ok), null), (VkAlertData.a) null, 52);
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        (superappUiRouterBridge != null ? superappUiRouterBridge : null).O(fragmentActivity, bVar, new b(izsVar));
    }

    public final void b(final PhoneValidationContract$ValidationDialogMetaInfo phoneValidationContract$ValidationDialogMetaInfo) {
        String str;
        PhoneValidationContract$SkipBehaviour phoneValidationContract$SkipBehaviour = phoneValidationContract$ValidationDialogMetaInfo.e;
        hz20 hz20Var = new hz20() { // from class: xsna.j4a0
            @Override // xsna.hz20
            public final void a(int i) {
                c4a0 c4a0Var = k4a0.this.c;
                final PhoneValidationContract$ValidationDialogMetaInfo phoneValidationContract$ValidationDialogMetaInfo2 = phoneValidationContract$ValidationDialogMetaInfo;
                String str2 = phoneValidationContract$ValidationDialogMetaInfo2.b;
                String str3 = phoneValidationContract$ValidationDialogMetaInfo2.c;
                if (i == -3) {
                    c4a0Var.e(phoneValidationContract$ValidationDialogMetaInfo2);
                    return;
                }
                if (i != -2) {
                    if (i != -1) {
                        return;
                    }
                    c4a0Var.h(str3, str2, true, phoneValidationContract$ValidationDialogMetaInfo2.d);
                    return;
                }
                PhoneValidationContract$SkipBehaviour phoneValidationContract$SkipBehaviour2 = phoneValidationContract$ValidationDialogMetaInfo2.e;
                if (phoneValidationContract$SkipBehaviour2 == PhoneValidationContract$SkipBehaviour.NOTHING) {
                    c4a0Var.e(phoneValidationContract$ValidationDialogMetaInfo2);
                    return;
                }
                g4a0 g4a0Var = c4a0Var.e;
                int i2 = c4a0.a.$EnumSwitchMapping$0[phoneValidationContract$SkipBehaviour2.ordinal()];
                if (i2 == 1) {
                    wdx0 wdx0Var = e370.f;
                    if (wdx0Var == null) {
                        wdx0Var = null;
                    }
                    egn0.a.a(wdx0Var, LogoutReason.PHONE_VALIDATION_DECLINED, null, 6);
                    g4a0Var.a(new nij(com.vk.registration.funnels.b.a, 4));
                    c4a0Var.c.invoke(VkPhoneValidationErrorReason.LOGOUT);
                    return;
                }
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c4a0Var.g(str2, new vex(c4a0Var, 18), new n99(1, c4a0Var, c4a0.class, "showValidatePhoneError", "showValidatePhoneError(Ljava/lang/Throwable;)V", 0, 8));
                    return;
                }
                g4a0Var.a(new kun(com.vk.registration.funnels.b.a, 3));
                k4a0 k4a0Var = c4a0Var.d;
                final k4a0 k4a0Var2 = k4a0Var != null ? k4a0Var : null;
                FragmentActivity fragmentActivity = k4a0Var2.b;
                String replace = str3.replace(ImageSizeKey.SIZE_KEY_BASE, (char) 183);
                if (replace == null) {
                    replace = "";
                }
                eeu0.a aVar = new eeu0.a(hnj.a(fragmentActivity));
                aVar.setTitle(fragmentActivity.getString(R.string.vk_service_validation_confirmation_unlink_warning_title, replace));
                aVar.a.f = fragmentActivity.getString(R.string.vk_service_validation_confirmation_unlink_warning);
                aVar.setPositiveButton(R.string.vk_service_validation_confirmation_ok, new DialogInterface.OnClickListener() { // from class: xsna.h4a0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        c4a0 c4a0Var2 = k4a0.this.c;
                        c4a0Var2.g(phoneValidationContract$ValidationDialogMetaInfo2.b, new g880(c4a0Var2, 3), new n99(1, c4a0Var2, c4a0.class, "showValidatePhoneError", "showValidatePhoneError(Ljava/lang/Throwable;)V", 0, 8));
                    }
                });
                aVar.setNegativeButton(R.string.vk_service_validation_confirmation_cancel, new i4a0(k4a0Var2, 0));
                aVar.m();
            }
        };
        FragmentActivity fragmentActivity = this.b;
        Context a2 = hnj.a(fragmentActivity);
        String replace = phoneValidationContract$ValidationDialogMetaInfo.c.replace(ImageSizeKey.SIZE_KEY_BASE, (char) 183);
        Drawable e = enj.e(R.drawable.vk_icon_phone_outline_56, R.attr.vk_ui_icon_accent, a2);
        Drawable e2 = enj.e(R.drawable.vk_icon_cancel_20, R.attr.vk_ui_icon_medium, a2);
        dw20.b bVar = new dw20.b(a2, null);
        cbq.a(bVar);
        dw20.b bVar2 = (dw20.b) ((dw20.b) ((dw20.b) dw20.a.R(bVar.M0().N(e).w0(fragmentActivity.getString(R.string.vk_service_validation_confirmation_title, replace)), this.d, 0, 0, 6)).i0(R.string.vk_service_validation_confirmation_confirm, hz20Var).o()).X(new pw(22, this, phoneValidationContract$ValidationDialogMetaInfo)).w();
        int[] iArr = a.$EnumSwitchMapping$0;
        int i = iArr[phoneValidationContract$SkipBehaviour.ordinal()];
        if (i == 1 || i == 2) {
            dw20.b p = bVar2.q(false).p(false);
            dw20.b U = p.h(p.c.getString(R.string.vk_service_validation_confirmation_change_number), hz20Var).U(R.string.vk_service_validation_confirmation_unlink_action, hz20Var);
            U.getClass();
            U.d.w1 = true;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            ((dw20.b) bVar2.q(true).p(true).U(R.string.vk_service_validation_confirmation_change_number, hz20Var).F(e2, null)).b0(new g22(22, this, phoneValidationContract$ValidationDialogMetaInfo));
        }
        int i2 = iArr[phoneValidationContract$SkipBehaviour.ordinal()];
        if (i2 == 1) {
            str = "PhoneConfirmationRequired";
        } else if (i2 == 2) {
            str = "PhoneConfirmationRequiredOtherwiseUnbind";
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "PhoneConfirmationOptional";
        }
        this.e.invoke(bVar2, str);
    }

    public final io.reactivex.rxjava3.core.x c(io.reactivex.rxjava3.internal.operators.single.b0 b0Var) {
        return bug0.e(b0Var, this.b, this.f, 2);
    }

    /* compiled from: PhoneValidationView.kt */
    public static final class b implements SuperappUiRouterBridge.d {
        public final /* synthetic */ izs<VkAlertData.a, s3q0> a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(izs<? super VkAlertData.a, s3q0> izsVar) {
            this.a = izsVar;
        }

        @Override // com.vk.superapp.bridges.SuperappUiRouterBridge.d
        public final void a(VkAlertData.a aVar) {
            this.a.invoke(aVar);
        }

        @Override // com.vk.superapp.bridges.SuperappUiRouterBridge.d
        public final void onDismiss() {
        }
    }
}
