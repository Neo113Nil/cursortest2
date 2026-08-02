package com.apollographql.apollo3.network.ws;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/apollographql/apollo3/network/ws/WsFrameType;", "", "Text", "Binary", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class WsFrameType {
    private static final /* synthetic */ WsFrameType[] $VALUES;
    public static final WsFrameType Binary;
    public static final WsFrameType Text;

    static {
        WsFrameType wsFrameType = new WsFrameType("Text", 0);
        Text = wsFrameType;
        WsFrameType wsFrameType2 = new WsFrameType("Binary", 1);
        Binary = wsFrameType2;
        $VALUES = new WsFrameType[]{wsFrameType, wsFrameType2};
    }

    public static WsFrameType valueOf(String str) {
        return (WsFrameType) Enum.valueOf(WsFrameType.class, str);
    }

    public static WsFrameType[] values() {
        return (WsFrameType[]) $VALUES.clone();
    }
}
