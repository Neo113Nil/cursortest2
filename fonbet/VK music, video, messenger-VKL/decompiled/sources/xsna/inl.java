package xsna;

import com.vk.api.generated.auth.dto.AuthGetCredentialsForServiceMultiResponseDto;
import com.vk.api.generated.auth.dto.AuthSilentTokenDto;
import com.vk.api.generated.auth.dto.AuthSilentTokenIndexedDto;
import com.vk.api.generated.auth.dto.AuthSilentTokenIndexedErrorDto;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: DefaultSuperappApi.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class inl extends FunctionReferenceImpl implements izs<AuthGetCredentialsForServiceMultiResponseDto, j35> {
    public static final inl b = new inl(1, i35.class, "toDomainModel", "toDomainModel(Lcom/vk/api/generated/auth/dto/AuthGetCredentialsForServiceMultiResponseDto;)Lcom/vk/superapp/api/dto/auth/serviceauthmulti/AuthGetCredentialsForServiceMultiResponseModel;", 1);

    @Override // xsna.izs
    public final j35 invoke(AuthGetCredentialsForServiceMultiResponseDto authGetCredentialsForServiceMultiResponseDto) {
        AuthGetCredentialsForServiceMultiResponseDto authGetCredentialsForServiceMultiResponseDto2 = authGetCredentialsForServiceMultiResponseDto;
        List<AuthSilentTokenIndexedDto> e = authGetCredentialsForServiceMultiResponseDto2.e();
        ArrayList arrayList = new ArrayList(c5g.u(e, 10));
        for (AuthSilentTokenIndexedDto authSilentTokenIndexedDto : e) {
            int d = authSilentTokenIndexedDto.d();
            AuthSilentTokenDto e2 = authSilentTokenIndexedDto.e();
            arrayList.add(new i65(d, new j65(e2.B(), e2.g(), e2.i(), e2.F(), e2.C(), e2.f(), e2.o(), e2.l(), e2.n(), e2.p(), e2.j(), e2.e(), e2.D(), e2.d(), e2.G(), e2.k())));
        }
        List<AuthSilentTokenIndexedErrorDto> d2 = authGetCredentialsForServiceMultiResponseDto2.d();
        ArrayList arrayList2 = new ArrayList(c5g.u(d2, 10));
        for (AuthSilentTokenIndexedErrorDto authSilentTokenIndexedErrorDto : d2) {
            arrayList2.add(new h65(authSilentTokenIndexedErrorDto.d(), authSilentTokenIndexedErrorDto.getDescription()));
        }
        return new j35(arrayList, arrayList2);
    }
}
