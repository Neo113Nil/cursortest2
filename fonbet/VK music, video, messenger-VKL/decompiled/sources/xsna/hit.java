package xsna;

import com.vk.api.generated.email.dto.EmailCreationResponseDto;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: GeneratedSuperappApi.kt */
/* loaded from: classes6.dex */
public final class hit implements dfn0 {
    public final bpn0 a = new bpn0(new vi0(20));

    /* compiled from: GeneratedSuperappApi.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<EmailCreationResponseDto, gcp> {
        @Override // xsna.izs
        public final gcp invoke(EmailCreationResponseDto emailCreationResponseDto) {
            EmailCreationResponseDto emailCreationResponseDto2 = emailCreationResponseDto;
            ((hcp) this.receiver).getClass();
            return new gcp(emailCreationResponseDto2.d(), emailCreationResponseDto2.f(), emailCreationResponseDto2.e());
        }
    }

    /* compiled from: GeneratedSuperappApi.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<EmailCreationResponseDto, gcp> {
        @Override // xsna.izs
        public final gcp invoke(EmailCreationResponseDto emailCreationResponseDto) {
            EmailCreationResponseDto emailCreationResponseDto2 = emailCreationResponseDto;
            ((hcp) this.receiver).getClass();
            return new gcp(emailCreationResponseDto2.d(), emailCreationResponseDto2.f(), emailCreationResponseDto2.e());
        }
    }

    @Override // xsna.dfn0
    public final io.reactivex.rxjava3.core.x a(String str, String str2, boolean z) {
        try {
            ufx ufxVar = new ufx("email.create", new w11(16), new at(18));
            ufxVar.g(2, 31, "username", str);
            ufxVar.i("ads_acceptance", z);
            bx2 e = e370.e(ufxVar);
            e.n = str2;
            e.o = null;
            return rdx0.B(e).l(new pj4(new b(1, (hcp) this.a.getValue(), hcp.class, "map", "map(Lcom/vk/api/generated/email/dto/EmailCreationResponseDto;)Lcom/vk/superapp/api/dto/email/EmailCreationResponse;", 0), 23));
        } catch (Exception e2) {
            return io.reactivex.rxjava3.core.x.i(e2);
        }
    }

    @Override // xsna.dfn0
    public final io.reactivex.rxjava3.core.x<gcp> b(String str, String str2) {
        try {
            ufx ufxVar = new ufx("email.canCreate", new bt(13), new ct(11));
            ufxVar.g(2, 31, "username", str);
            bx2 e = e370.e(ufxVar);
            e.n = str2;
            e.o = null;
            return rdx0.B(e).l(new z8(new a(1, (hcp) this.a.getValue(), hcp.class, "map", "map(Lcom/vk/api/generated/email/dto/EmailCreationResponseDto;)Lcom/vk/superapp/api/dto/email/EmailCreationResponse;", 0), 17));
        } catch (Exception e2) {
            return io.reactivex.rxjava3.core.x.i(e2);
        }
    }
}
