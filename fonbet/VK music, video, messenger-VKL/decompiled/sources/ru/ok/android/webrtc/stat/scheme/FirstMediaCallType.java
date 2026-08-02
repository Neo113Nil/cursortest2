package ru.ok.android.webrtc.stat.scheme;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class FirstMediaCallType {
    public static final FirstMediaCallType DIRECT_INCOMING;
    public static final FirstMediaCallType DIRECT_JOIN;
    public static final FirstMediaCallType DIRECT_OUTGOING;
    public static final FirstMediaCallType NONE;
    public static final FirstMediaCallType SERVER_CHANGE_TOPOLOGY;
    public static final FirstMediaCallType SERVER_INCOMING;
    public static final FirstMediaCallType SERVER_JOIN;
    public static final /* synthetic */ FirstMediaCallType[] b;
    public static final /* synthetic */ zrp c;
    public final String a;

    static {
        FirstMediaCallType firstMediaCallType = new FirstMediaCallType("NONE", 0, "");
        NONE = firstMediaCallType;
        FirstMediaCallType firstMediaCallType2 = new FirstMediaCallType("DIRECT_OUTGOING", 1, "direct_outgoing");
        DIRECT_OUTGOING = firstMediaCallType2;
        FirstMediaCallType firstMediaCallType3 = new FirstMediaCallType("DIRECT_INCOMING", 2, "direct_incoming");
        DIRECT_INCOMING = firstMediaCallType3;
        FirstMediaCallType firstMediaCallType4 = new FirstMediaCallType("SERVER_INCOMING", 3, "server_incoming");
        SERVER_INCOMING = firstMediaCallType4;
        FirstMediaCallType firstMediaCallType5 = new FirstMediaCallType("SERVER_JOIN", 4, "server_join_server");
        SERVER_JOIN = firstMediaCallType5;
        FirstMediaCallType firstMediaCallType6 = new FirstMediaCallType("SERVER_CHANGE_TOPOLOGY", 5, "server_change_topology");
        SERVER_CHANGE_TOPOLOGY = firstMediaCallType6;
        FirstMediaCallType firstMediaCallType7 = new FirstMediaCallType("DIRECT_JOIN", 6, "direct_join");
        DIRECT_JOIN = firstMediaCallType7;
        FirstMediaCallType[] firstMediaCallTypeArr = {firstMediaCallType, firstMediaCallType2, firstMediaCallType3, firstMediaCallType4, firstMediaCallType5, firstMediaCallType6, firstMediaCallType7};
        b = firstMediaCallTypeArr;
        c = new asp(firstMediaCallTypeArr);
    }

    public FirstMediaCallType(String str, int i, String str2) {
        this.a = str2;
    }

    public static zrp<FirstMediaCallType> getEntries() {
        return c;
    }

    public static FirstMediaCallType valueOf(String str) {
        return (FirstMediaCallType) Enum.valueOf(FirstMediaCallType.class, str);
    }

    public static FirstMediaCallType[] values() {
        return (FirstMediaCallType[]) b.clone();
    }

    public final String getKey() {
        return this.a;
    }
}
