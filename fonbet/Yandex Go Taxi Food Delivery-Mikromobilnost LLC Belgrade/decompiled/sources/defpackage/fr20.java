package defpackage;

import com.yandex.mob.okhttp.metrics.MobCallStatus;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class fr20 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MobCallStatus.values().length];
        try {
            iArr[MobCallStatus.ProxyStart.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MobCallStatus.ProxyEnd.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MobCallStatus.DnsStart.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MobCallStatus.DnsEnd.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[MobCallStatus.ConnectStart.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[MobCallStatus.ConnectEnd.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[MobCallStatus.ConnectFailed.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[MobCallStatus.Request.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[MobCallStatus.ResponseHeaders.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[MobCallStatus.ResponseReceived.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[MobCallStatus.Failure.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[MobCallStatus.Cancelled.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        a = iArr;
    }
}
