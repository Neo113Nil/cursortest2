package xsna;

import io.opentelemetry.api.common.AttributeType;

/* compiled from: SemConvAttributes.java */
/* loaded from: classes8.dex */
public final class rfi0 {
    public static final xfx a;
    public static final xfx b;
    public static final xfx c;
    public static final xfx d;
    public static final xfx e;

    static {
        AttributeType attributeType = AttributeType.STRING;
        a = xfx.a(attributeType, "otel.component.type");
        b = xfx.a(attributeType, "otel.component.name");
        c = xfx.a(attributeType, "error.type");
        xfx.a(attributeType, "server.address");
        AttributeType attributeType2 = AttributeType.LONG;
        xfx.a(attributeType2, "server.port");
        xfx.a(attributeType, "rpc.response.status_code");
        xfx.a(attributeType2, "http.response.status_code");
        d = xfx.a(attributeType, "otel.span.parent.origin");
        e = xfx.a(attributeType, "otel.span.sampling_result");
    }
}
