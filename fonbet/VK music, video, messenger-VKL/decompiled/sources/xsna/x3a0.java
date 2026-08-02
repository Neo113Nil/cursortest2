package xsna;

import com.vk.auth.main.AuthStatSender;
import com.vk.auth.validation.VkPhoneValidationErrorReason;
import com.vk.auth.validation.internal.PhoneValidationContract$SkipBehaviour;
import com.vk.auth.validation.internal.PhoneValidationContract$ValidationDialogMetaInfo;

/* compiled from: PhoneValidationOfferPresenter.kt */
/* loaded from: classes15.dex */
public final class x3a0 extends p66<y3a0> {
    public final g4a0 A;
    public final pqz B;
    public final PhoneValidationContract$ValidationDialogMetaInfo x;
    public final ctu0 y;
    public final io.reactivex.rxjava3.disposables.b z = new io.reactivex.rxjava3.disposables.b();

    /* compiled from: PhoneValidationOfferPresenter.kt */
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

    public x3a0(PhoneValidationContract$ValidationDialogMetaInfo phoneValidationContract$ValidationDialogMetaInfo, ctu0 ctu0Var) {
        this.x = phoneValidationContract$ValidationDialogMetaInfo;
        this.y = ctu0Var;
        g4a0 g4a0Var = new g4a0();
        this.A = g4a0Var;
        this.B = new pqz(13);
        g4a0Var.a = phoneValidationContract$ValidationDialogMetaInfo.e == PhoneValidationContract$SkipBehaviour.NOTHING;
        g4a0Var.a(new mij(com.vk.registration.funnels.b.a, 6));
    }

    @Override // xsna.z55
    public final AuthStatSender.Screen g0() {
        return AuthStatSender.Screen.VERIFICATION_ASK_NUMBER;
    }

    public final void y0(VkPhoneValidationErrorReason vkPhoneValidationErrorReason) {
        String str = this.x.b;
        com.vk.movika.sdk.android.defaultplayer.container.e eVar = new com.vk.movika.sdk.android.defaultplayer.container.e(18, this, vkPhoneValidationErrorReason);
        wq20 wq20Var = new wq20(this, 14);
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        this.z.b(mnh0.C(new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(vdx0Var.e().a(str).m(io.reactivex.rxjava3.android.schedulers.a.b()), new x150(new uv20(this, 16), 2)), new mtb(this, 3)), this.s, new zf1(23, eVar, this), new ux40(wq20Var, 11), null));
    }
}
