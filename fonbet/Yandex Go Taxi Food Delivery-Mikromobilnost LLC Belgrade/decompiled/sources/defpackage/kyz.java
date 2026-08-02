package defpackage;

import com.yandex.go.payments.data.model.response.CoopAccountUiDto;
import ru.yandex.taxi.gopayments.dto.SharedAccountType;

/* loaded from: classes13.dex */
public final class kyz {
    public final crg a;
    public final zuj0 b;
    public final xdf c;

    public kyz(crg crgVar, zuj0 zuj0Var, xdf xdfVar) {
        this.a = crgVar;
        this.b = zuj0Var;
        this.c = xdfVar;
    }

    public final snr0 a(CoopAccountUiDto coopAccountUiDto) {
        String h;
        if (!evu0.J(coopAccountUiDto.a)) {
            qmr0 qmr0Var = SharedAccountType.Companion;
            String str = coopAccountUiDto.b;
            qmr0Var.getClass();
            SharedAccountType a = qmr0.a(str);
            if (a != SharedAccountType.UNKNOWN) {
                if (coopAccountUiDto.d) {
                    h = coopAccountUiDto.f;
                } else {
                    h = ((avj0) this.b).h(kyh0.shared_payment_inactive_default_error);
                }
                String str2 = h;
                String str3 = coopAccountUiDto.a;
                boolean z = coopAccountUiDto.d;
                boolean l = jl40.l(coopAccountUiDto.e, "owner");
                CoopAccountUiDto.Details details = coopAccountUiDto.c;
                return new snr0(str3, null, a, str2, z, l, true, new rnr0(details.a, details.b, null));
            }
        }
        return null;
    }
}
