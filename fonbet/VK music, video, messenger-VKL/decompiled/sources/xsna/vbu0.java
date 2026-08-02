package xsna;

import com.vk.api.generated.auth.dto.AuthValidateRegistrationConfirmTextsDto;
import com.vk.superapp.api.dto.auth.VkAuthProfileInfo;
import com.vk.superapp.api.dto.auth.validatephoneconfirm.NextStep;
import com.vk.superapp.api.dto.auth.validatephoneconfirm.PasswordScreen;
import com.vk.superapp.core.api.models.SignUpField;
import com.vk.superapp.core.api.models.SignUpIncompleteFieldsModel;
import com.vk.superapp.core.api.models.SignUpParams;
import java.util.List;

/* compiled from: VkAuthConfirmResponse.kt */
/* loaded from: classes6.dex */
public final class vbu0 {
    public final String a;
    public final VkAuthProfileInfo b;
    public final PasswordScreen c;
    public final List<SignUpField> d;
    public final List<SignUpField> e;
    public final String f;
    public final String g;
    public final SignUpParams h;
    public final boolean i;
    public final SignUpIncompleteFieldsModel j;
    public final NextStep k;
    public final boolean l;
    public final AuthValidateRegistrationConfirmTextsDto m;
    public final String n;
    public final String o;

    /* JADX WARN: Multi-variable type inference failed */
    public vbu0(String str, VkAuthProfileInfo vkAuthProfileInfo, PasswordScreen passwordScreen, List<? extends SignUpField> list, List<? extends SignUpField> list2, String str2, String str3, SignUpParams signUpParams, boolean z, SignUpIncompleteFieldsModel signUpIncompleteFieldsModel, NextStep nextStep, boolean z2, AuthValidateRegistrationConfirmTextsDto authValidateRegistrationConfirmTextsDto, String str4, String str5) {
        this.a = str;
        this.b = vkAuthProfileInfo;
        this.c = passwordScreen;
        this.d = list;
        this.e = list2;
        this.f = str2;
        this.g = str3;
        this.h = signUpParams;
        this.i = z;
        this.j = signUpIncompleteFieldsModel;
        this.k = nextStep;
        this.l = z2;
        this.m = authValidateRegistrationConfirmTextsDto;
        this.n = str4;
        this.o = str5;
    }

    public final boolean a() {
        return this.c == PasswordScreen.SHOW;
    }

    public final boolean b() {
        return this.i;
    }

    public final NextStep c() {
        return this.k;
    }

    public final PasswordScreen d() {
        return this.c;
    }

    public final VkAuthProfileInfo e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vbu0)) {
            return false;
        }
        vbu0 vbu0Var = (vbu0) obj;
        return epx.f(this.a, vbu0Var.a) && epx.f(this.b, vbu0Var.b) && this.c == vbu0Var.c && epx.f(this.d, vbu0Var.d) && epx.f(this.e, vbu0Var.e) && epx.f(this.f, vbu0Var.f) && epx.f(this.g, vbu0Var.g) && epx.f(this.h, vbu0Var.h) && this.i == vbu0Var.i && epx.f(this.j, vbu0Var.j) && this.k == vbu0Var.k && this.l == vbu0Var.l && epx.f(this.m, vbu0Var.m) && epx.f(this.n, vbu0Var.n) && epx.f(this.o, vbu0Var.o);
    }

    public final AuthValidateRegistrationConfirmTextsDto f() {
        return this.m;
    }

    public final String g() {
        return this.o;
    }

    public final String h() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        VkAuthProfileInfo vkAuthProfileInfo = this.b;
        int a = urd0.a(fw3.a(fw3.a((this.c.hashCode() + ((hashCode + (vkAuthProfileInfo == null ? 0 : vkAuthProfileInfo.hashCode())) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        int b = qoy.b(shy.a(this.h.b, (a + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.i);
        SignUpIncompleteFieldsModel signUpIncompleteFieldsModel = this.j;
        int hashCode2 = (b + (signUpIncompleteFieldsModel == null ? 0 : signUpIncompleteFieldsModel.hashCode())) * 31;
        NextStep nextStep = this.k;
        int b2 = qoy.b((hashCode2 + (nextStep == null ? 0 : nextStep.hashCode())) * 31, 31, this.l);
        AuthValidateRegistrationConfirmTextsDto authValidateRegistrationConfirmTextsDto = this.m;
        int hashCode3 = (b2 + (authValidateRegistrationConfirmTextsDto == null ? 0 : authValidateRegistrationConfirmTextsDto.hashCode())) * 31;
        String str2 = this.n;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.o;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean i() {
        return this.l;
    }

    public final String j() {
        return this.a;
    }

    public final List<SignUpField> k() {
        return this.d;
    }

    public final SignUpIncompleteFieldsModel l() {
        return this.j;
    }

    public final SignUpParams m() {
        return this.h;
    }

    public final List<SignUpField> n() {
        return this.e;
    }

    public final String o() {
        return this.n;
    }

    public final boolean p() {
        return this.c == PasswordScreen.SKIP;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkAuthConfirmResponse(sid=");
        sb.append(this.a);
        sb.append(", profile=");
        sb.append(this.b);
        sb.append(", passwordScreenLogic=");
        sb.append(this.c);
        sb.append(", signUpFields=");
        sb.append(this.d);
        sb.append(", signUpSkippableFields=");
        sb.append(this.e);
        sb.append(", restrictedSubject=");
        sb.append(this.f);
        sb.append(", hash=");
        sb.append(this.g);
        sb.append(", signUpParams=");
        sb.append(this.h);
        sb.append(", canSkipPassword=");
        sb.append(this.i);
        sb.append(", signUpIncompleteFieldsModel=");
        sb.append(this.j);
        sb.append(", nextStep=");
        sb.append(this.k);
        sb.append(", showRegistrationConfirm=");
        sb.append(this.l);
        sb.append(", registrationConfirmTexts=");
        sb.append(this.m);
        sb.append(", signupRestrictedReason=");
        sb.append(this.n);
        sb.append(", restoreHash=");
        return ho8.a(sb, this.o, ')');
    }
}
