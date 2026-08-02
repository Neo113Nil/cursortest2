package defpackage;

import androidx.work.BackoffPolicy;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes.dex */
public abstract class aa51 {
    public boolean a;
    public UUID b = UUID.randomUUID();
    public fa51 c;
    public final Set d;

    public aa51(Class cls) {
        this.c = new fa51(this.b.toString(), (WorkInfo$State) null, cls.getName(), (String) null, (ong) null, (ong) null, 0L, 0L, 0L, (k8e) null, 0, (BackoffPolicy) null, 0L, 0L, 0L, 0L, false, (OutOfQuotaPolicy) null, 0, 0L, 0, 0, (String) null, (Boolean) null, 33554426);
        this.d = u4r0.d(cls.getName());
    }

    public final ba51 a() {
        List W;
        ba51 b = b();
        k8e k8eVar = this.c.j;
        boolean z = !k8eVar.i.isEmpty() || k8eVar.e || k8eVar.c || k8eVar.d;
        fa51 fa51Var = this.c;
        if (fa51Var.q) {
            if (z) {
                ny61.g("Expedited jobs only support network and storage constraints");
                return null;
            }
            if (fa51Var.g > 0) {
                ny61.g("Expedited jobs cannot be delayed");
                return null;
            }
        }
        String str = fa51Var.x;
        if (str == null) {
            W = evu0.W(fa51Var.c, new String[]{Extension.DOT_CHAR}, (r2 & 4) != 0 ? 0 : 2);
            String str2 = W.size() == 1 ? (String) W.get(0) : (String) a.Z(W);
            if (str2.length() > 127) {
                str2 = gvu0.A0(HProv.PP_VERSION_TIMESTAMP, str2);
            }
            fa51Var.x = str2;
        } else if (str.length() > 127) {
            this.c.x = gvu0.A0(HProv.PP_VERSION_TIMESTAMP, str);
        }
        UUID randomUUID = UUID.randomUUID();
        this.b = randomUUID;
        String uuid = randomUUID.toString();
        fa51 fa51Var2 = this.c;
        this.c = new fa51(uuid, fa51Var2.b, fa51Var2.c, fa51Var2.d, new ong(fa51Var2.e), new ong(fa51Var2.f), fa51Var2.g, fa51Var2.h, fa51Var2.i, new k8e(fa51Var2.j), fa51Var2.k, fa51Var2.l, fa51Var2.m, fa51Var2.n, fa51Var2.o, fa51Var2.p, fa51Var2.q, fa51Var2.r, fa51Var2.s, fa51Var2.u, fa51Var2.v, fa51Var2.w, fa51Var2.x, fa51Var2.y, 524288);
        return b;
    }

    public abstract ba51 b();

    public abstract aa51 c();

    public final aa51 d(BackoffPolicy backoffPolicy) {
        this.a = true;
        fa51 fa51Var = this.c;
        fa51Var.l = backoffPolicy;
        fa51Var.m = y6i0.f(10000L, 10000L, 18000000L);
        return c();
    }

    public final aa51 e(long j) {
        this.c.g = j;
        if (ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED - System.currentTimeMillis() > this.c.g) {
            return c();
        }
        ny61.g("The given initial delay is too large and will cause an overflow!");
        return null;
    }
}
