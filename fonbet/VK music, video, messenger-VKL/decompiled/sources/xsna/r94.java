package xsna;

import io.opentelemetry.api.common.AttributeType;

/* compiled from: AttributesBuilder.java */
/* loaded from: classes11.dex */
public interface r94 {
    default lk3 a(long j, String str) {
        lk3 lk3Var = (lk3) this;
        lk3Var.f(xfx.a(AttributeType.LONG, str), Long.valueOf(j));
        return lk3Var;
    }

    default lk3 b(String str, String str2) {
        lk3 lk3Var = (lk3) this;
        lk3Var.f(xfx.a(AttributeType.STRING, str), str2);
        return lk3Var;
    }

    default lk3 c(double d, String str) {
        lk3 lk3Var = (lk3) this;
        lk3Var.f(xfx.a(AttributeType.DOUBLE, str), Double.valueOf(d));
        return lk3Var;
    }

    default lk3 d(String str, boolean z) {
        lk3 lk3Var = (lk3) this;
        lk3Var.f(xfx.a(AttributeType.BOOLEAN, str), Boolean.valueOf(z));
        return lk3Var;
    }
}
