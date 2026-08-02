package defpackage;

import com.yandex.div.state.db.StateEntry;
import flex.logger.FlexLogLevel;
import flex.network.cache.impl.b;
import flex.network.cache.parsing.CacheMode;
import java.io.InputStream;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public final class glv implements jp50 {
    public final oy2 a;
    public final yvi0 b;
    public final hlv c;
    public final cot d;
    public final qc20 e;
    public final nfh f;
    public final zjr g;
    public final b h;

    public glv(oy2 oy2Var, sls slsVar, zcx zcxVar) {
        this.a = oy2Var;
        yvi0 yvi0Var = new yvi0((uo11) new olv());
        this.b = yvi0Var;
        hlv hlvVar = new hlv();
        this.c = hlvVar;
        cot cotVar = new cot(new olv());
        this.d = cotVar;
        qc20 qc20Var = new qc20((uo11) new olv());
        this.e = qc20Var;
        nfh nfhVar = new nfh(CacheMode.IN_MEMORY, slsVar);
        this.f = nfhVar;
        this.g = new zjr(xfz.b(glv.class.getSimpleName()));
        this.h = new b(yvi0Var, cotVar, hlvVar, oy2Var, nfhVar, ke7.a, slsVar, qc20Var, zcxVar);
    }

    public final void a(String str, Object obj, p7j0 p7j0Var, s610 s610Var, j820 j820Var) {
        StackTraceElement stackTraceElement;
        String str2;
        this.c.b(obj, str);
        String str3 = p7j0Var.a;
        ((am2) this.b.a).n(evu0.Q("/", str3), s610Var);
        this.d.k(str, j820Var);
        i3y a = xfz.a(new Pair(StateEntry.COLUMN_PATH, str3), new Pair("patchParams", p7j0Var.c), new Pair(kju0.j, j820Var), new Pair("headKey", str));
        zjr zjrVar = this.g;
        s7s0 s7s0Var = zjrVar.c.a;
        boolean booleanValue = Boolean.FALSE.booleanValue();
        tjr tjrVar = tjr.d;
        if (booleanValue && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
            String fileName = stackTraceElement.getFileName();
            if (fileName == null) {
                fileName = "No file info";
            }
            String methodName = stackTraceElement.getMethodName();
            int lineNumber = stackTraceElement.getLineNumber();
            Integer valueOf = Integer.valueOf(lineNumber);
            if (lineNumber <= 0) {
                valueOf = null;
            }
            if (valueOf == null || (str2 = valueOf.toString()) == null) {
                str2 = "No line info";
            }
            tjrVar = new tjr(fileName, methodName, str2);
        }
        zjrVar.d(FlexLogLevel.DEBUG, "Successfully saved head-request to in-memory cache", a, EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
    }

    @Override // defpackage.jp50
    public final void delete(p7j0 p7j0Var) {
        this.h.delete(p7j0Var);
    }

    @Override // defpackage.jp50
    public final void invalidate() {
        this.h.invalidate();
    }

    @Override // defpackage.jp50
    public final kc7 load(p7j0 p7j0Var, tls tlsVar) {
        return this.h.load(p7j0Var, tlsVar);
    }

    @Override // defpackage.jp50
    public final dyg save(n8j0 n8j0Var, boolean z, InputStream inputStream, tls tlsVar) {
        return this.h.save(n8j0Var, z, inputStream, tlsVar);
    }
}
