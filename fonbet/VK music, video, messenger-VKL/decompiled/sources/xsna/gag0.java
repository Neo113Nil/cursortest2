package xsna;

import io.opentelemetry.api.common.AttributeType;
import java.util.Objects;
import java.util.logging.Logger;

/* compiled from: Resource.java */
/* loaded from: classes8.dex */
public abstract class gag0 {
    public static final qn5 a;

    static {
        Logger logger = Logger.getLogger(gag0.class.getName());
        AttributeType attributeType = AttributeType.STRING;
        xfx a2 = xfx.a(attributeType, "service.name");
        xfx a3 = xfx.a(attributeType, "telemetry.sdk.language");
        xfx a4 = xfx.a(attributeType, "telemetry.sdk.name");
        xfx a5 = xfx.a(attributeType, "telemetry.sdk.version");
        qn5 b = b(null, jk3.e);
        qn5 b2 = b(null, q94.j(a2, "unknown_service:java"));
        String str = b2.b;
        lk3 lk3Var = new lk3();
        lk3Var.f(a4, "opentelemetry");
        lk3Var.f(a3, "java");
        lk3Var.f(a5, "1.60.1");
        qn5 b3 = b(null, lk3Var.e());
        String str2 = b3.b;
        if (b3 != b) {
            lk3 lk3Var2 = new lk3();
            lk3Var2.g(b2.c);
            lk3Var2.g(b3.c);
            if (str2 == null) {
                b2 = b(str, lk3Var2.e());
            } else if (str == null) {
                b2 = b(str2, lk3Var2.e());
            } else if (str2.equals(str)) {
                b2 = b(str, lk3Var2.e());
            } else {
                logger.info("Attempting to merge Resources with different schemaUrls. The resulting Resource will have no schemaUrl assigned. Schema 1: " + str + " Schema 2: " + str2);
                b2 = b(null, lk3Var2.e());
            }
        }
        a = b2;
    }

    public static fr9 a() {
        fr9 fr9Var = new fr9();
        fr9Var.b = new lk3();
        return fr9Var;
    }

    public static qn5 b(String str, q94 q94Var) {
        Objects.requireNonNull(q94Var, "attributes");
        q94Var.forEach(new fag0());
        return new qn5(str, q94Var);
    }

    public static qn5 d() {
        return a;
    }

    public abstract q94 c();

    public abstract String e();
}
