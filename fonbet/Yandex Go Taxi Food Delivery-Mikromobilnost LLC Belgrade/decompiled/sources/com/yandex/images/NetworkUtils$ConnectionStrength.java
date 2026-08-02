package com.yandex.images;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public final class NetworkUtils$ConnectionStrength {
    private static final /* synthetic */ NetworkUtils$ConnectionStrength[] $VALUES;
    public static final NetworkUtils$ConnectionStrength ETHERNET;
    public static final NetworkUtils$ConnectionStrength MOBILE_2G;
    public static final NetworkUtils$ConnectionStrength MOBILE_3G;
    public static final NetworkUtils$ConnectionStrength MOBILE_4G;
    public static final NetworkUtils$ConnectionStrength UNKNOWN;
    public static final NetworkUtils$ConnectionStrength WIRELESS;

    static {
        NetworkUtils$ConnectionStrength networkUtils$ConnectionStrength = new NetworkUtils$ConnectionStrength("UNKNOWN", 0);
        UNKNOWN = networkUtils$ConnectionStrength;
        NetworkUtils$ConnectionStrength networkUtils$ConnectionStrength2 = new NetworkUtils$ConnectionStrength("MOBILE_2G", 1);
        MOBILE_2G = networkUtils$ConnectionStrength2;
        NetworkUtils$ConnectionStrength networkUtils$ConnectionStrength3 = new NetworkUtils$ConnectionStrength("MOBILE_3G", 2);
        MOBILE_3G = networkUtils$ConnectionStrength3;
        NetworkUtils$ConnectionStrength networkUtils$ConnectionStrength4 = new NetworkUtils$ConnectionStrength("MOBILE_4G", 3);
        MOBILE_4G = networkUtils$ConnectionStrength4;
        NetworkUtils$ConnectionStrength networkUtils$ConnectionStrength5 = new NetworkUtils$ConnectionStrength("WIRELESS", 4);
        WIRELESS = networkUtils$ConnectionStrength5;
        NetworkUtils$ConnectionStrength networkUtils$ConnectionStrength6 = new NetworkUtils$ConnectionStrength("ETHERNET", 5);
        ETHERNET = networkUtils$ConnectionStrength6;
        $VALUES = new NetworkUtils$ConnectionStrength[]{networkUtils$ConnectionStrength, networkUtils$ConnectionStrength2, networkUtils$ConnectionStrength3, networkUtils$ConnectionStrength4, networkUtils$ConnectionStrength5, networkUtils$ConnectionStrength6};
    }

    public static NetworkUtils$ConnectionStrength valueOf(String str) {
        return (NetworkUtils$ConnectionStrength) Enum.valueOf(NetworkUtils$ConnectionStrength.class, str);
    }

    public static NetworkUtils$ConnectionStrength[] values() {
        return (NetworkUtils$ConnectionStrength[]) $VALUES.clone();
    }
}
