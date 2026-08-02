package com.yandex.mob.okhttp.metrics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/mob/okhttp/metrics/MobCallStatus;", "", "Enqueue", "ProxyStart", "ProxyEnd", "DnsStart", "DnsEnd", "ConnectStart", "ConnectEnd", "ConnectFailed", "Request", "ResponseHeaders", "ResponseReceived", "Failure", "Cancelled", "ParsingEnd", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MobCallStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MobCallStatus[] $VALUES;
    public static final MobCallStatus Cancelled;
    public static final MobCallStatus ConnectEnd;
    public static final MobCallStatus ConnectFailed;
    public static final MobCallStatus ConnectStart;
    public static final MobCallStatus DnsEnd;
    public static final MobCallStatus DnsStart;
    public static final MobCallStatus Enqueue;
    public static final MobCallStatus Failure;
    public static final MobCallStatus ParsingEnd;
    public static final MobCallStatus ProxyEnd;
    public static final MobCallStatus ProxyStart;
    public static final MobCallStatus Request;
    public static final MobCallStatus ResponseHeaders;
    public static final MobCallStatus ResponseReceived;

    static {
        MobCallStatus mobCallStatus = new MobCallStatus("Enqueue", 0);
        Enqueue = mobCallStatus;
        MobCallStatus mobCallStatus2 = new MobCallStatus("ProxyStart", 1);
        ProxyStart = mobCallStatus2;
        MobCallStatus mobCallStatus3 = new MobCallStatus("ProxyEnd", 2);
        ProxyEnd = mobCallStatus3;
        MobCallStatus mobCallStatus4 = new MobCallStatus("DnsStart", 3);
        DnsStart = mobCallStatus4;
        MobCallStatus mobCallStatus5 = new MobCallStatus("DnsEnd", 4);
        DnsEnd = mobCallStatus5;
        MobCallStatus mobCallStatus6 = new MobCallStatus("ConnectStart", 5);
        ConnectStart = mobCallStatus6;
        MobCallStatus mobCallStatus7 = new MobCallStatus("ConnectEnd", 6);
        ConnectEnd = mobCallStatus7;
        MobCallStatus mobCallStatus8 = new MobCallStatus("ConnectFailed", 7);
        ConnectFailed = mobCallStatus8;
        MobCallStatus mobCallStatus9 = new MobCallStatus("Request", 8);
        Request = mobCallStatus9;
        MobCallStatus mobCallStatus10 = new MobCallStatus("ResponseHeaders", 9);
        ResponseHeaders = mobCallStatus10;
        MobCallStatus mobCallStatus11 = new MobCallStatus("ResponseReceived", 10);
        ResponseReceived = mobCallStatus11;
        MobCallStatus mobCallStatus12 = new MobCallStatus("Failure", 11);
        Failure = mobCallStatus12;
        MobCallStatus mobCallStatus13 = new MobCallStatus("Cancelled", 12);
        Cancelled = mobCallStatus13;
        MobCallStatus mobCallStatus14 = new MobCallStatus("ParsingEnd", 13);
        ParsingEnd = mobCallStatus14;
        MobCallStatus[] mobCallStatusArr = {mobCallStatus, mobCallStatus2, mobCallStatus3, mobCallStatus4, mobCallStatus5, mobCallStatus6, mobCallStatus7, mobCallStatus8, mobCallStatus9, mobCallStatus10, mobCallStatus11, mobCallStatus12, mobCallStatus13, mobCallStatus14};
        $VALUES = mobCallStatusArr;
        $ENTRIES = a.a(mobCallStatusArr);
    }

    public static MobCallStatus valueOf(String str) {
        return (MobCallStatus) Enum.valueOf(MobCallStatus.class, str);
    }

    public static MobCallStatus[] values() {
        return (MobCallStatus[]) $VALUES.clone();
    }
}
