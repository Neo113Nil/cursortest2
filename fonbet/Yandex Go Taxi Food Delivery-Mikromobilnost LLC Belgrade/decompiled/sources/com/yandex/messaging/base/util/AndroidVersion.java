package com.yandex.messaging.base.util;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/yandex/messaging/base/util/AndroidVersion;", "", "", "apiLevel", CA20Status.STATUS_USER_I, "a", "()I", "", "versionString", "Ljava/lang/String;", "getVersionString", "()Ljava/lang/String;", "codeName", "getCodeName", "UNKNOWN", "ANDROID_5", "ANDROID_5_1", "ANDROID_6", "ANDROID_7", "ANDROID_7_1", "ANDROID_8", "ANDROID_8_1", "ANDROID_9", "ANDROID_10", "ANDROID_11", "FUTURE", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AndroidVersion {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AndroidVersion[] $VALUES;
    public static final AndroidVersion ANDROID_10;
    public static final AndroidVersion ANDROID_11;
    public static final AndroidVersion ANDROID_5;
    public static final AndroidVersion ANDROID_5_1;
    public static final AndroidVersion ANDROID_6;
    public static final AndroidVersion ANDROID_7;
    public static final AndroidVersion ANDROID_7_1;
    public static final AndroidVersion ANDROID_8;
    public static final AndroidVersion ANDROID_8_1;
    public static final AndroidVersion ANDROID_9;
    public static final AndroidVersion FUTURE;
    public static final AndroidVersion UNKNOWN;
    private final int apiLevel;
    private final String codeName;
    private final String versionString;

    static {
        AndroidVersion androidVersion = new AndroidVersion(0, 0, "UNKNOWN", "unknown", "unknown");
        UNKNOWN = androidVersion;
        AndroidVersion androidVersion2 = new AndroidVersion(1, 21, "ANDROID_5", "5.0", "Lollipop");
        ANDROID_5 = androidVersion2;
        AndroidVersion androidVersion3 = new AndroidVersion(2, 22, "ANDROID_5_1", "5.1", "Lollipop MR1");
        ANDROID_5_1 = androidVersion3;
        AndroidVersion androidVersion4 = new AndroidVersion(3, 23, "ANDROID_6", "6.0", "Marshmallow");
        ANDROID_6 = androidVersion4;
        AndroidVersion androidVersion5 = new AndroidVersion(4, 24, "ANDROID_7", "7.0", "Nougat");
        ANDROID_7 = androidVersion5;
        AndroidVersion androidVersion6 = new AndroidVersion(5, 25, "ANDROID_7_1", "7.1", "Nougat MR1");
        ANDROID_7_1 = androidVersion6;
        AndroidVersion androidVersion7 = new AndroidVersion(6, 26, "ANDROID_8", "8.0", "Oreo");
        ANDROID_8 = androidVersion7;
        AndroidVersion androidVersion8 = new AndroidVersion(7, 27, "ANDROID_8_1", "8.1", "Oreo MR1");
        ANDROID_8_1 = androidVersion8;
        AndroidVersion androidVersion9 = new AndroidVersion(8, 28, "ANDROID_9", "9.0", "Pie");
        ANDROID_9 = androidVersion9;
        AndroidVersion androidVersion10 = new AndroidVersion(9, 29, "ANDROID_10", "10.0", CA20Status.STATUS_REQUEST_Q);
        ANDROID_10 = androidVersion10;
        AndroidVersion androidVersion11 = new AndroidVersion(10, 30, "ANDROID_11", "11.0", "R");
        ANDROID_11 = androidVersion11;
        AndroidVersion androidVersion12 = new AndroidVersion(11, 999, "FUTURE", "future", "FUTURE");
        FUTURE = androidVersion12;
        AndroidVersion[] androidVersionArr = {androidVersion, androidVersion2, androidVersion3, androidVersion4, androidVersion5, androidVersion6, androidVersion7, androidVersion8, androidVersion9, androidVersion10, androidVersion11, androidVersion12};
        $VALUES = androidVersionArr;
        $ENTRIES = a.a(androidVersionArr);
    }

    public AndroidVersion(int i, int i2, String str, String str2, String str3) {
        this.apiLevel = i2;
        this.versionString = str2;
        this.codeName = str3;
    }

    public static AndroidVersion valueOf(String str) {
        return (AndroidVersion) Enum.valueOf(AndroidVersion.class, str);
    }

    public static AndroidVersion[] values() {
        return (AndroidVersion[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getApiLevel() {
        return this.apiLevel;
    }
}
