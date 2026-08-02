package xsna;

import io.opentelemetry.api.common.AttributeType;

/* compiled from: ExceptionAttributeResolver.java */
/* loaded from: classes8.dex */
public interface n1q {
    public static final xfx a;
    public static final xfx b;
    public static final xfx c;

    static {
        AttributeType attributeType = AttributeType.STRING;
        a = xfx.a(attributeType, "exception.type");
        b = xfx.a(attributeType, "exception.message");
        c = xfx.a(attributeType, "exception.stacktrace");
    }
}
