package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ldi2;", "", "Companion", "ai2", "bi2", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class di2 {
    public static final bi2 Companion = new bi2();
    public final x9t0 a;
    public final x9t0 b;
    public final x9t0 c;
    public final int d;
    public final long e;
    public final cei0 f;

    public /* synthetic */ di2(int i, x9t0 x9t0Var, x9t0 x9t0Var2, x9t0 x9t0Var3, int i2, long j, cei0 cei0Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = x9t0Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = x9t0Var2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = x9t0Var3;
        }
        if ((i & 8) == 0) {
            this.d = 1;
        } else {
            this.d = i2;
        }
        if ((i & 16) == 0) {
            this.e = 0L;
        } else {
            this.e = j;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = cei0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof di2)) {
            return false;
        }
        di2 di2Var = (di2) obj;
        return jl40.l(this.a, di2Var.a) && jl40.l(this.b, di2Var.b) && jl40.l(this.c, di2Var.c) && this.d == di2Var.d && this.e == di2Var.e && jl40.l(this.f, di2Var.f);
    }

    public final int hashCode() {
        x9t0 x9t0Var = this.a;
        int hashCode = (x9t0Var == null ? 0 : x9t0Var.hashCode()) * 31;
        x9t0 x9t0Var2 = this.b;
        int hashCode2 = (hashCode + (x9t0Var2 == null ? 0 : x9t0Var2.hashCode())) * 31;
        x9t0 x9t0Var3 = this.c;
        int c = qv10.c(oyr.b(this.d, (hashCode2 + (x9t0Var3 == null ? 0 : x9t0Var3.hashCode())) * 31, 31), 31, this.e);
        cei0 cei0Var = this.f;
        return c + (cei0Var != null ? cei0Var.hashCode() : 0);
    }

    public final String toString() {
        return "AnimationInfo(source=" + this.a + ", firstFrame=" + this.b + ", lastFrame=" + this.c + ", loopCount=" + this.d + ", delay=" + this.e + ", analytics=" + this.f + Extension.C_BRAKE;
    }

    public di2() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = 1;
        this.e = 0L;
        this.f = null;
    }
}
