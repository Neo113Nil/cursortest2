package xsna;

import com.vk.superapp.auth.js.bridge.api.events.GetAuthToken$Error;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonUnknownError;
import xsna.g2y;
import xsna.g7g0;

/* compiled from: GetAuthTokenDelegate.kt */
/* loaded from: classes6.dex */
public final class ypt {
    public final m2y a;
    public final g2y.a b;
    public final awz c;
    public final w1n0 d;
    public final rvp e;

    /* compiled from: GetAuthTokenDelegate.kt */
    public static final class a {
        public final g7g0.a a;
        public final String b;

        public a(g7g0.a aVar, String str) {
            this.a = aVar;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AuthTokenContext(params=");
            sb.append(this.a);
            sb.append(", requestId=");
            return ho8.a(sb, this.b, ')');
        }
    }

    public ypt(m2y m2yVar, g2y.a aVar, awz awzVar, w1n0 w1n0Var, rvp rvpVar) {
        this.a = m2yVar;
        this.b = aVar;
        this.c = awzVar;
        this.d = w1n0Var;
        this.e = rvpVar;
    }

    public static void b(rvp rvpVar, Responses$ClientError responses$ClientError) {
        rvpVar.a(GetAuthToken$Error.Data.Type.CLIENT_ERROR, null, responses$ClientError);
    }

    public final void a(a aVar, izs<? super a, s3q0> izsVar) {
        try {
            g7g0 g7g0Var = new g7g0();
            qro0.c(new xo00(aVar.a, g7g0Var, new ma(14, this, aVar), new l22(16, this, aVar), new jl4(8, izsVar, aVar)));
        } catch (Exception e) {
            par0.a.getClass();
            par0.d(e);
            b(this.e, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNKNOWN_ERROR, null, new Responses$ReasonUnknownError(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131064, null), aVar.b, 1, null));
        }
    }
}
