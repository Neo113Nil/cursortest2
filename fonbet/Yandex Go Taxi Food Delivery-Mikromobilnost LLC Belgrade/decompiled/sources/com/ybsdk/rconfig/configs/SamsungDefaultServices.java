package com.ybsdk.rconfig.configs;

import defpackage.k4o;
import defpackage.tje;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/rconfig/configs/SamsungDefaultServices;", "", "", "packageName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "serviceId", "b", "TEST_APP", "YB_APP_DEV", "YB_APP_PROD", "GO", "MARKET", "PRO", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
final class SamsungDefaultServices {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SamsungDefaultServices[] $VALUES;
    public static final SamsungDefaultServices GO;
    public static final SamsungDefaultServices MARKET;
    public static final SamsungDefaultServices PRO;
    public static final SamsungDefaultServices TEST_APP;
    public static final SamsungDefaultServices YB_APP_DEV;
    public static final SamsungDefaultServices YB_APP_PROD;
    private final String packageName;
    private final String serviceId;

    static {
        SamsungDefaultServices samsungDefaultServices = new SamsungDefaultServices("TEST_APP", 0, "ru.yandex.fintech.wallettestapp", "356f6071c4bd41d7bd4dbf");
        TEST_APP = samsungDefaultServices;
        SamsungDefaultServices samsungDefaultServices2 = new SamsungDefaultServices("YB_APP_DEV", 1, tje.q(tje.V0), "11d07ab41bb346f68a66b8");
        YB_APP_DEV = samsungDefaultServices2;
        SamsungDefaultServices samsungDefaultServices3 = new SamsungDefaultServices("YB_APP_PROD", 2, tje.q(tje.d2), "8aad474099524309aa2cc4");
        YB_APP_PROD = samsungDefaultServices3;
        SamsungDefaultServices samsungDefaultServices4 = new SamsungDefaultServices("GO", 3, "ru.yandex.taxi", "c61270ef6cd54c8d99318f");
        GO = samsungDefaultServices4;
        SamsungDefaultServices samsungDefaultServices5 = new SamsungDefaultServices("MARKET", 4, "ru.beru.android", "ce015b995fc04ff6a1ff76");
        MARKET = samsungDefaultServices5;
        SamsungDefaultServices samsungDefaultServices6 = new SamsungDefaultServices("PRO", 5, "ru.yandex.taximeter", "2a947382ae9a47a0a31e05");
        PRO = samsungDefaultServices6;
        SamsungDefaultServices[] samsungDefaultServicesArr = {samsungDefaultServices, samsungDefaultServices2, samsungDefaultServices3, samsungDefaultServices4, samsungDefaultServices5, samsungDefaultServices6};
        $VALUES = samsungDefaultServicesArr;
        $ENTRIES = kotlin.enums.a.a(samsungDefaultServicesArr);
    }

    public SamsungDefaultServices(String str, int i, String str2, String str3) {
        this.packageName = str2;
        this.serviceId = str3;
    }

    public static SamsungDefaultServices valueOf(String str) {
        return (SamsungDefaultServices) Enum.valueOf(SamsungDefaultServices.class, str);
    }

    public static SamsungDefaultServices[] values() {
        return (SamsungDefaultServices[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* renamed from: b, reason: from getter */
    public final String getServiceId() {
        return this.serviceId;
    }
}
