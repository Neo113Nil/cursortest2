package io.opentelemetry.api.trace;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class SpanKind {
    private static final /* synthetic */ SpanKind[] $VALUES;
    public static final SpanKind CLIENT;
    public static final SpanKind CONSUMER;
    public static final SpanKind INTERNAL;
    public static final SpanKind PRODUCER;
    public static final SpanKind SERVER;

    static {
        SpanKind spanKind = new SpanKind("INTERNAL", 0);
        INTERNAL = spanKind;
        SpanKind spanKind2 = new SpanKind(SignalingProtocol.TOPOLOGY_SERVER, 1);
        SERVER = spanKind2;
        SpanKind spanKind3 = new SpanKind("CLIENT", 2);
        CLIENT = spanKind3;
        SpanKind spanKind4 = new SpanKind(SignalingProtocol.PEER_CONNECTION_KIND_PRODUCER, 3);
        PRODUCER = spanKind4;
        SpanKind spanKind5 = new SpanKind(SignalingProtocol.PEER_CONNECTION_KIND_CONSUMER, 4);
        CONSUMER = spanKind5;
        $VALUES = new SpanKind[]{spanKind, spanKind2, spanKind3, spanKind4, spanKind5};
    }

    public SpanKind() {
        throw null;
    }

    public static SpanKind valueOf(String str) {
        return (SpanKind) Enum.valueOf(SpanKind.class, str);
    }

    public static SpanKind[] values() {
        return (SpanKind[]) $VALUES.clone();
    }
}
