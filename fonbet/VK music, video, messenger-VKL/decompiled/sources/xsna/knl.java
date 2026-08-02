package xsna;

import com.vk.api.generated.auth.dto.AuthGetSilentTokensResponseDto;
import com.vk.api.generated.auth.dto.AuthServiceUserValueDto;
import com.vk.api.generated.auth.dto.AuthSilentTokenDto;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: DefaultSuperappApi.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class knl extends FunctionReferenceImpl implements izs<AuthGetSilentTokensResponseDto, List<? extends qbu0>> {
    public static final knl b = new knl(1, rbu0.class, "toDomainModel", "toDomainModel(Lcom/vk/api/generated/auth/dto/AuthGetSilentTokensResponseDto;)Ljava/util/List;", 1);

    @Override // xsna.izs
    public final List<? extends qbu0> invoke(AuthGetSilentTokensResponseDto authGetSilentTokensResponseDto) {
        ArrayList arrayList;
        List<AuthSilentTokenDto> d = authGetSilentTokensResponseDto.d();
        int i = 10;
        ArrayList arrayList2 = new ArrayList(c5g.u(d, 10));
        for (AuthSilentTokenDto authSilentTokenDto : d) {
            String B = authSilentTokenDto.B();
            Integer C = authSilentTokenDto.C();
            int intValue = C != null ? C.intValue() : 0;
            String F = authSilentTokenDto.F();
            if (F == null) {
                F = "";
            }
            String str = F;
            String g = authSilentTokenDto.g();
            String i2 = authSilentTokenDto.i();
            String j = authSilentTokenDto.j();
            String o = authSilentTokenDto.o();
            String l = authSilentTokenDto.l();
            String n = authSilentTokenDto.n();
            List<AuthServiceUserValueDto> u = authSilentTokenDto.u();
            if (u != null) {
                List<AuthServiceUserValueDto> list = u;
                arrayList = new ArrayList(c5g.u(list, i));
                for (AuthServiceUserValueDto authServiceUserValueDto : list) {
                    arrayList.add(new f65(authServiceUserValueDto.d(), authServiceUserValueDto.e()));
                }
            } else {
                arrayList = null;
            }
            arrayList2.add(new qbu0(B, intValue, str, g, i2, j, o, l, n, arrayList));
            i = 10;
        }
        return arrayList2;
    }
}
