package xsna;

import com.vk.api.sdk.exceptions.SectionTemporaryUnavailableException;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import io.jsonwebtoken.JwtParser;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.h2i0;

/* compiled from: SectionTemporaryUnavailableChainCall.kt */
/* loaded from: classes.dex */
public final class e2i0<T> extends ara<T> {
    public static final /* synthetic */ qcy<Object>[] g;
    public final z1p0 b;
    public final bxe0 c;
    public final afg0 d;
    public final hcw e;
    public final bpn0 f;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(e2i0.class, "section", "getSection()Ljava/lang/String;", 0);
        fpf0.a.getClass();
        g = new qcy[]{propertyReference1Impl};
    }

    public e2i0(l7r0 l7r0Var, String str, z1p0 z1p0Var, bxe0 bxe0Var) {
        super(l7r0Var);
        this.b = z1p0Var;
        this.c = bxe0Var;
        this.d = new afg0(str);
        this.e = l7r0Var.a.e;
        this.f = new bpn0(new hy6(this, 10));
    }

    @Override // xsna.ara
    public final T a(zqa zqaVar) {
        hcw hcwVar = this.e;
        z1p0 z1p0Var = this.b;
        if (z1p0Var.b(c()).i().longValue() > 0) {
            throw new SectionTemporaryUnavailableException(c(), (String) this.f.getValue());
        }
        try {
            T t = (T) this.c.a(zqaVar);
            String c = c();
            vx5 vx5Var = z1p0Var.a;
            if (vx5Var.a.containsKey(c)) {
                vx5Var.a.remove(c);
            }
            String c2 = c();
            if (hcwVar.a.remove(c2)) {
                a1w a1wVar = q1w.a;
                if (a1wVar == null) {
                    a1wVar = null;
                }
                a1wVar.x(new h2i0.a(c2));
            }
            return t;
        } catch (VKApiExecutionException e) {
            if (e.c0()) {
                z1p0Var.a(c(), "SectionUnavailable");
                String c3 = c();
                if (hcwVar.a.add(c3)) {
                    a1w a1wVar2 = q1w.a;
                    (a1wVar2 != null ? a1wVar2 : null).x(new h2i0.b(c3));
                }
                b(e, (String) this.f.getValue());
            }
            throw e;
        }
    }

    public final String c() {
        qcy<Object> qcyVar = g[0];
        String str = this.d.a;
        return brm0.B(str, "execute", false) ? str : drm0.l0(str, JwtParser.SEPARATOR_CHAR);
    }
}
