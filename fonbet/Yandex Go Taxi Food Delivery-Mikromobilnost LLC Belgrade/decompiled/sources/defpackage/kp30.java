package defpackage;

import android.content.Context;
import com.yandex.go.masstransit.sdk.externalservice.api.mosmetro_otp.router.MosmetroOtpEntryPointSource;
import com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_auth_onboarding.b;
import com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.c;
import com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.repository.a;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.masstransit.domain.h;

/* loaded from: classes12.dex */
public final class kp30 {
    public static zy11 a(up30 up30Var, b bVar, op30 op30Var) {
        Object value;
        String str;
        boolean l = jl40.l(up30Var, rp30.a);
        zy11 zy11Var = zy11.a;
        if (l) {
            ((np30) ((uk10) op30Var).a).r(new qu(9));
            return zy11Var;
        }
        if (!jl40.l(up30Var, sp30.a)) {
            if (!(up30Var instanceof qp30)) {
                if (!(up30Var instanceof tp30)) {
                    w511.b();
                    return null;
                }
                ((a60) ((y50) ((np30) ((uk10) op30Var).a).J.b)).c(((tp30) up30Var).a, v770.c);
                return zy11Var;
            }
            y830 y830Var = ((qp30) up30Var).a;
            r0 r0Var = bVar.a;
            do {
                value = r0Var.getValue();
                str = y830Var.a;
            } while (!r0Var.k(value, new vp30(str != null ? mja1.a(str, null, 6) : null, y830Var.b, y830Var.c, y830Var.d, y830Var.e)));
            return zy11Var;
        }
        np30 np30Var = (np30) ((uk10) op30Var).a;
        boj0 boj0Var = np30Var.M;
        MosmetroOtpEntryPointSource mosmetroOtpEntryPointSource = MosmetroOtpEntryPointSource.DETAIL_CARD;
        m1p m1pVar = (m1p) ((h410) boj0Var.b).c.getValue();
        Context context = (Context) boj0Var.c;
        w030 w030Var = (w030) boj0Var.w;
        x830 x830Var = (x830) boj0Var.x;
        h hVar = (h) boj0Var.y;
        b7z0 b7z0Var = (b7z0) boj0Var.z;
        m1pVar.getClass();
        boolean z = false;
        abe abeVar = new abe(context, z, z);
        a aVar = new a((k930) m1pVar.b.getValue());
        np30Var.z(new com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.b(context, w030Var, aVar, new com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.h(aVar, new fa30(x830Var, abeVar), b7z0Var), new c(aVar), hVar, x830Var), new mp30(np30Var));
        return zy11Var;
    }
}
