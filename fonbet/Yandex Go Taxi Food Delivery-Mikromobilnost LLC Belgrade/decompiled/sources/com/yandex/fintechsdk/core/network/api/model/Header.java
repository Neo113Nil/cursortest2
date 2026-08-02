package com.yandex.fintechsdk.core.network.api.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.yandex.video.m3.list_player_manager.impl.image.GlideBitmapDownloader;
import ru.yandex.video.m3.ott.data.net.impl.ExtFunctionsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b*\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+¨\u0006,"}, d2 = {"Lcom/yandex/fintechsdk/core/network/api/model/Header;", "", "", "key", "Ljava/lang/String;", "a", "()Ljava/lang/String;", GlideBitmapDownloader.ACCEPT_HEADER, "AcceptLanguage", "Authorization", "Bst", "ClientApp", "ClientVersion", "Connection", "ContentType", "DivkitVersion", "Dpop", "FlexVersion", "MerchantClientId", "MerchantFeatures", "MerchantId", "OAuthToken", "PassportPartition", "PayboxScenario", "PayDeviceId", "PayFormId", "PayGaid", "PlatformVersion", "QuickPayActivated", "RequestId", "RealIp", "RegionId", "SdkPlatform", "SdkRegion", "SdkType", "SdkVersion", "ServiceToken", "SessionId", "TovarischBaseUrl", "Uid", "UniversalLink", "UserAgent", "YaConsumerAuthorization", "YbsdkVersion", "api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class Header {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Header[] $VALUES;
    public static final Header Accept;
    public static final Header AcceptLanguage;
    public static final Header Authorization;
    public static final Header Bst;
    public static final Header ClientApp;
    public static final Header ClientVersion;
    public static final Header Connection;
    public static final Header ContentType;
    public static final Header DivkitVersion;
    public static final Header Dpop;
    public static final Header FlexVersion;
    public static final Header MerchantClientId;
    public static final Header MerchantFeatures;
    public static final Header MerchantId;
    public static final Header OAuthToken;
    public static final Header PassportPartition;
    public static final Header PayDeviceId;
    public static final Header PayFormId;
    public static final Header PayGaid;
    public static final Header PayboxScenario;
    public static final Header PlatformVersion;
    public static final Header QuickPayActivated;
    public static final Header RealIp;
    public static final Header RegionId;
    public static final Header RequestId;
    public static final Header SdkPlatform;
    public static final Header SdkRegion;
    public static final Header SdkType;
    public static final Header SdkVersion;
    public static final Header ServiceToken;
    public static final Header SessionId;
    public static final Header TovarischBaseUrl;
    public static final Header Uid;
    public static final Header UniversalLink;
    public static final Header UserAgent;
    public static final Header YaConsumerAuthorization;
    public static final Header YbsdkVersion;
    private final String key;

    static {
        Header header = new Header(GlideBitmapDownloader.ACCEPT_HEADER, 0, GlideBitmapDownloader.ACCEPT_HEADER);
        Accept = header;
        Header header2 = new Header("AcceptLanguage", 1, "Accept-Language");
        AcceptLanguage = header2;
        Header header3 = new Header("Authorization", 2, "Authorization");
        Authorization = header3;
        Header header4 = new Header("Bst", 3, "X-BST");
        Bst = header4;
        Header header5 = new Header("ClientApp", 4, "X-Client-App");
        ClientApp = header5;
        Header header6 = new Header("ClientVersion", 5, "X-Client-Version");
        ClientVersion = header6;
        Header header7 = new Header("Connection", 6, "Connection");
        Connection = header7;
        Header header8 = new Header("ContentType", 7, "Content-Type");
        ContentType = header8;
        Header header9 = new Header("DivkitVersion", 8, "X-Divkit-Version");
        DivkitVersion = header9;
        Header header10 = new Header("Dpop", 9, "DPoP");
        Dpop = header10;
        Header header11 = new Header("FlexVersion", 10, "X-Flex-Version");
        FlexVersion = header11;
        Header header12 = new Header("MerchantClientId", 11, "X-Merchant-Client-ID");
        MerchantClientId = header12;
        Header header13 = new Header("MerchantFeatures", 12, "X-Merchant-Features");
        MerchantFeatures = header13;
        Header header14 = new Header("MerchantId", 13, "X-Merchant-ID");
        MerchantId = header14;
        Header header15 = new Header("OAuthToken", 14, "X-Oauth-Token");
        OAuthToken = header15;
        Header header16 = new Header("PassportPartition", 15, "X-Passport-Partition");
        PassportPartition = header16;
        Header header17 = new Header("PayboxScenario", 16, "X-Paybox-Scenario");
        PayboxScenario = header17;
        Header header18 = new Header("PayDeviceId", 17, "X-Pay-DeviceID");
        PayDeviceId = header18;
        Header header19 = new Header("PayFormId", 18, "X-Pay-Form-ID");
        PayFormId = header19;
        Header header20 = new Header("PayGaid", 19, "X-Pay-GAID");
        PayGaid = header20;
        Header header21 = new Header("PlatformVersion", 20, "X-Platform-Version");
        PlatformVersion = header21;
        Header header22 = new Header("QuickPayActivated", 21, "X-Quick-Pay-Activated");
        QuickPayActivated = header22;
        Header header23 = new Header("RequestId", 22, "X-Request-Id");
        RequestId = header23;
        Header header24 = new Header("RealIp", 23, "X-Real-IP");
        RealIp = header24;
        Header header25 = new Header("RegionId", 24, "X-Region-Id");
        RegionId = header25;
        Header header26 = new Header("SdkPlatform", 25, "X-SDK-Platform");
        SdkPlatform = header26;
        Header header27 = new Header("SdkRegion", 26, "X-Fintech-SDK-Region");
        SdkRegion = header27;
        Header header28 = new Header("SdkType", 27, "X-SDK-Type");
        SdkType = header28;
        Header header29 = new Header("SdkVersion", 28, "X-SDK-Version");
        SdkVersion = header29;
        Header header30 = new Header("ServiceToken", 29, "X-Service-Token");
        ServiceToken = header30;
        Header header31 = new Header("SessionId", 30, "X-Pay-Session-ID");
        SessionId = header31;
        Header header32 = new Header("TovarischBaseUrl", 31, "X-Tovarisch-Base-Url");
        TovarischBaseUrl = header32;
        Header header33 = new Header("Uid", 32, "X-Uid");
        Uid = header33;
        Header header34 = new Header("UniversalLink", 33, "X-Universal-Link");
        UniversalLink = header34;
        Header header35 = new Header("UserAgent", 34, ExtFunctionsKt.HEADER_USER_AGENT);
        UserAgent = header35;
        Header header36 = new Header("YaConsumerAuthorization", 35, "Ya-Consumer-Authorization");
        YaConsumerAuthorization = header36;
        Header header37 = new Header("YbsdkVersion", 36, "X-YBSDK-Version");
        YbsdkVersion = header37;
        Header[] headerArr = {header, header2, header3, header4, header5, header6, header7, header8, header9, header10, header11, header12, header13, header14, header15, header16, header17, header18, header19, header20, header21, header22, header23, header24, header25, header26, header27, header28, header29, header30, header31, header32, header33, header34, header35, header36, header37};
        $VALUES = headerArr;
        $ENTRIES = a.a(headerArr);
    }

    public Header(String str, int i, String str2) {
        this.key = str2;
    }

    public static Header valueOf(String str) {
        return (Header) Enum.valueOf(Header.class, str);
    }

    public static Header[] values() {
        return (Header[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getKey() {
        return this.key;
    }
}
