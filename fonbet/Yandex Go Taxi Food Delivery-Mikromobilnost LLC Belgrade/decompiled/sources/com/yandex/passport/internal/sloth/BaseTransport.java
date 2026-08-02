package com.yandex.passport.internal.sloth;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/passport/internal/sloth/BaseTransport;", "", "WIFI", "CELLULAR", "ETHERNET", "BLUETOOTH", "WIFI_AWARE", "LOWPAN", "UNDEFINED", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BaseTransport {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BaseTransport[] $VALUES;
    public static final BaseTransport BLUETOOTH;
    public static final BaseTransport CELLULAR;
    public static final BaseTransport ETHERNET;
    public static final BaseTransport LOWPAN;
    public static final BaseTransport UNDEFINED;
    public static final BaseTransport WIFI;
    public static final BaseTransport WIFI_AWARE;

    static {
        BaseTransport baseTransport = new BaseTransport("WIFI", 0);
        WIFI = baseTransport;
        BaseTransport baseTransport2 = new BaseTransport("CELLULAR", 1);
        CELLULAR = baseTransport2;
        BaseTransport baseTransport3 = new BaseTransport("ETHERNET", 2);
        ETHERNET = baseTransport3;
        BaseTransport baseTransport4 = new BaseTransport("BLUETOOTH", 3);
        BLUETOOTH = baseTransport4;
        BaseTransport baseTransport5 = new BaseTransport("WIFI_AWARE", 4);
        WIFI_AWARE = baseTransport5;
        BaseTransport baseTransport6 = new BaseTransport("LOWPAN", 5);
        LOWPAN = baseTransport6;
        BaseTransport baseTransport7 = new BaseTransport("UNDEFINED", 6);
        UNDEFINED = baseTransport7;
        BaseTransport[] baseTransportArr = {baseTransport, baseTransport2, baseTransport3, baseTransport4, baseTransport5, baseTransport6, baseTransport7};
        $VALUES = baseTransportArr;
        $ENTRIES = kotlin.enums.a.a(baseTransportArr);
    }

    public static BaseTransport valueOf(String str) {
        return (BaseTransport) Enum.valueOf(BaseTransport.class, str);
    }

    public static BaseTransport[] values() {
        return (BaseTransport[]) $VALUES.clone();
    }
}
