package xsna;

import com.vk.api.generated.auth.dto.AuthValidateRegistrationConfirmTextsDto;
import com.vk.auth.main.AfterPhoneReuseVerificationWay;
import com.vk.auth.main.AuthStatSender;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.screendata.VkExistingProfileScreenData;
import com.vk.superapp.api.dto.auth.VkAuthProfileInfo;
import com.vkontakte.android.R;

/* compiled from: ExistingProfilePresenter.kt */
/* loaded from: classes15.dex */
public final class w4q extends zi6<y4q> {
    public final boolean A;
    public final VkAuthProfileInfo B;
    public final boolean C;
    public final VkExistingProfileScreenData.SignUpRestrictedReason D;
    public final String E;
    public final AfterPhoneReuseVerificationWay F;
    public final AuthValidateRegistrationConfirmTextsDto G;
    public final boolean H;
    public final bm01 I;
    public String y = "";
    public final String z;

    /* compiled from: ExistingProfilePresenter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkExistingProfileScreenData.SignUpRestrictedReason.values().length];
            try {
                iArr[VkExistingProfileScreenData.SignUpRestrictedReason.EMAIL_ALREADY_USED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public w4q(VkExistingProfileScreenData vkExistingProfileScreenData) {
        this.z = vkExistingProfileScreenData.b;
        this.A = vkExistingProfileScreenData.d;
        this.B = vkExistingProfileScreenData.c;
        this.C = vkExistingProfileScreenData.f;
        this.D = vkExistingProfileScreenData.h;
        this.E = vkExistingProfileScreenData.i;
        this.F = vkExistingProfileScreenData.j;
        AuthValidateRegistrationConfirmTextsDto authValidateRegistrationConfirmTextsDto = vkExistingProfileScreenData.g;
        this.G = authValidateRegistrationConfirmTextsDto;
        this.H = authValidateRegistrationConfirmTextsDto != null;
        SignUpDataHolder signUpDataHolder = this.p;
        this.I = new bm01((signUpDataHolder == null ? null : signUpDataHolder).K);
    }

    public final void A0() {
        y4q y4qVar = (y4q) this.a;
        if (y4qVar != null) {
            y4qVar.H2();
        }
        y4q y4qVar2 = (y4q) this.a;
        if (y4qVar2 != null) {
            y4qVar2.i3(this.A && this.y.length() == 0);
        }
    }

    @Override // xsna.z55
    public final AuthStatSender.Screen g0() {
        return AuthStatSender.Screen.EXISTING_PROFILE;
    }

    @Override // xsna.zi6
    public final void y0() {
        y4q y4qVar = (y4q) this.a;
        if (y4qVar != null) {
            y4qVar.Fk(this.b.getString(R.string.vk_auth_incorrect_login_message));
        }
    }

    public final boolean z0(gzs<s3q0> gzsVar) {
        String a2 = this.I.a();
        if (a2 == null) {
            return false;
        }
        gzsVar.invoke();
        SignUpDataHolder signUpDataHolder = this.p;
        if (signUpDataHolder == null) {
            signUpDataHolder = null;
        }
        String str = signUpDataHolder.o;
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        this.t.b(mnh0.B(w0(vdx0Var.e().u(a2, str).a0(io.reactivex.rxjava3.android.schedulers.a.b()), true), this.s, new iie(this, 13), new fj1(24), null));
        return true;
    }
}
