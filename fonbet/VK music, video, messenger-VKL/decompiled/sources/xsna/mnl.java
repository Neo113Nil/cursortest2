package xsna;

import com.vk.api.generated.auth.dto.AuthValidatePhoneCheckResponseDto;
import com.vk.superapp.api.dto.auth.validatephonecheck.AuthValidatePhoneCheckResponse;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: DefaultSuperappApi.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class mnl extends FunctionReferenceImpl implements izs<AuthValidatePhoneCheckResponseDto, AuthValidatePhoneCheckResponse> {
    public static final mnl b = new mnl(1, w65.class, "toDomainModel", "toDomainModel(Lcom/vk/api/generated/auth/dto/AuthValidatePhoneCheckResponseDto;)Lcom/vk/superapp/api/dto/auth/validatephonecheck/AuthValidatePhoneCheckResponse;", 1);

    @Override // xsna.izs
    public final AuthValidatePhoneCheckResponse invoke(AuthValidatePhoneCheckResponseDto authValidatePhoneCheckResponseDto) {
        AuthValidatePhoneCheckResponseDto authValidatePhoneCheckResponseDto2 = authValidatePhoneCheckResponseDto;
        int f = authValidatePhoneCheckResponseDto2.f();
        String d = authValidatePhoneCheckResponseDto2.d();
        if (d == null) {
            d = "";
        }
        String e = authValidatePhoneCheckResponseDto2.e();
        return new AuthValidatePhoneCheckResponse(f, d, e != null ? e : "");
    }
}
