package xsna;

import com.vk.api.generated.auth.dto.AuthBirthdayDto;
import com.vk.api.generated.auth.dto.AuthSignupFieldsValuesDto;
import com.vk.api.generated.auth.dto.AuthUserDto;
import com.vk.api.generated.auth.dto.AuthValidatePhoneConfirmResponseDto;
import com.vk.api.generated.auth.dto.AuthValidateSignupParamsDto;
import com.vk.superapp.api.dto.auth.VkAuthProfileInfo;
import com.vk.superapp.api.dto.auth.validatephoneconfirm.NextStep;
import com.vk.superapp.api.dto.auth.validatephoneconfirm.PasswordScreen;
import com.vk.superapp.core.api.models.SignUpField;
import com.vk.superapp.core.api.models.SignUpIncompleteBirthday;
import com.vk.superapp.core.api.models.SignUpIncompleteFieldsModel;
import com.vk.superapp.core.api.models.SignUpParams;
import com.vk.superapp.core.api.models.VkGender;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: DefaultSuperappApi.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class jnl extends FunctionReferenceImpl implements izs<AuthValidatePhoneConfirmResponseDto, vbu0> {
    public static final jnl b = new jnl(1, com.vk.superapp.api.dto.auth.validatephoneconfirm.a.class, "toDomain", "toDomain(Lcom/vk/api/generated/auth/dto/AuthValidatePhoneConfirmResponseDto;)Lcom/vk/superapp/api/dto/auth/validatephoneconfirm/VkAuthConfirmResponse;", 1);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.ArrayList] */
    @Override // xsna.izs
    public final vbu0 invoke(AuthValidatePhoneConfirmResponseDto authValidatePhoneConfirmResponseDto) {
        VkAuthProfileInfo vkAuthProfileInfo;
        PasswordScreen passwordScreen;
        List list;
        List list2;
        SignUpParams signUpParams;
        SignUpIncompleteFieldsModel signUpIncompleteFieldsModel;
        AuthValidatePhoneConfirmResponseDto authValidatePhoneConfirmResponseDto2 = authValidatePhoneConfirmResponseDto;
        String l = authValidatePhoneConfirmResponseDto2.l();
        AuthUserDto i = authValidatePhoneConfirmResponseDto2.i();
        if (i != null) {
            String e = i.e();
            String i2 = i.i();
            boolean f = i.f();
            String k = i.k();
            String j = i.j();
            if (j == null) {
                j = "";
            }
            Boolean d = i.d();
            boolean booleanValue = d != null ? d.booleanValue() : false;
            Boolean g = i.g();
            vkAuthProfileInfo = new VkAuthProfileInfo(e, i2, f, k, j, booleanValue, g != null ? g.booleanValue() : false);
        } else {
            vkAuthProfileInfo = null;
        }
        AuthValidatePhoneConfirmResponseDto.HidePasswordDto f2 = authValidatePhoneConfirmResponseDto2.f();
        if (f2 != null) {
            int i3 = f2.i();
            PasswordScreen.Companion.getClass();
            passwordScreen = PasswordScreen.a.a(i3);
        } else {
            passwordScreen = PasswordScreen.SHOW;
        }
        List<String> n = authValidatePhoneConfirmResponseDto2.n();
        if (n != null) {
            List<String> list3 = n;
            SignUpField.a aVar = SignUpField.Companion;
            list = new ArrayList(c5g.u(list3, 10));
            for (String str : list3) {
                aVar.getClass();
                list.add(SignUpField.a.a(str));
            }
        } else {
            list = EmptyList.b;
        }
        List<String> C = authValidatePhoneConfirmResponseDto2.C();
        if (C != null) {
            List<String> list4 = C;
            SignUpField.a aVar2 = SignUpField.Companion;
            list2 = new ArrayList(c5g.u(list4, 10));
            for (String str2 : list4) {
                aVar2.getClass();
                list2.add(SignUpField.a.a(str2));
            }
        } else {
            list2 = EmptyList.b;
        }
        String B = authValidatePhoneConfirmResponseDto2.B();
        if (B == null) {
            B = "";
        }
        AuthValidateSignupParamsDto p = authValidatePhoneConfirmResponseDto2.p();
        if (p != null) {
            Integer d2 = p.d();
            signUpParams = new SignUpParams(d2 != null ? d2.intValue() : 8);
        } else {
            signUpParams = new SignUpParams(8);
        }
        SignUpParams signUpParams2 = signUpParams;
        Boolean e2 = authValidatePhoneConfirmResponseDto2.e();
        boolean booleanValue2 = e2 != null ? e2.booleanValue() : false;
        AuthSignupFieldsValuesDto o = authValidatePhoneConfirmResponseDto2.o();
        if (o != null) {
            AuthBirthdayDto e3 = o.e();
            SignUpIncompleteBirthday signUpIncompleteBirthday = e3 != null ? new SignUpIncompleteBirthday(e3.d(), e3.e(), e3.f()) : null;
            String d3 = o.d();
            String str3 = d3 == null ? "" : d3;
            String g2 = o.g();
            String str4 = g2 == null ? "" : g2;
            String j2 = o.j();
            String str5 = j2 == null ? "" : j2;
            AuthSignupFieldsValuesDto.GenderDto i4 = o.i();
            VkGender.a aVar3 = VkGender.Companion;
            Integer valueOf = i4 != null ? Integer.valueOf(i4.i()) : null;
            aVar3.getClass();
            signUpIncompleteFieldsModel = new SignUpIncompleteFieldsModel(signUpIncompleteBirthday, str3, str4, str5, VkGender.a.a(valueOf), o.f());
        } else {
            signUpIncompleteFieldsModel = null;
        }
        AuthValidatePhoneConfirmResponseDto.NextStepDto g3 = authValidatePhoneConfirmResponseDto2.g();
        NextStep.a aVar4 = NextStep.Companion;
        String i5 = g3 != null ? g3.i() : null;
        aVar4.getClass();
        NextStep a = NextStep.a.a(i5);
        Boolean k2 = authValidatePhoneConfirmResponseDto2.k();
        return new vbu0(l, vkAuthProfileInfo, passwordScreen, list, list2, B, null, signUpParams2, booleanValue2, signUpIncompleteFieldsModel, a, k2 != null ? k2.booleanValue() : false, authValidatePhoneConfirmResponseDto2.j(), authValidatePhoneConfirmResponseDto2.u(), authValidatePhoneConfirmResponseDto2.d());
    }
}
