package com.yandex.go.network_metrics;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/go/network_metrics/Status;", "", "Enqueue", "ProxyStart", "ProxyEnd", "DnsStart", "DnsEnd", "ConnectStart", "ConnectEnd", "ConnectFailed", "Request", "ResponseHeaders", "ResponseReceived", "Failure", "Cancelled", "ParsingEnd", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Status {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Status[] $VALUES;
    public static final Status Cancelled;
    public static final Status ConnectEnd;
    public static final Status ConnectFailed;
    public static final Status ConnectStart;
    public static final Status DnsEnd;
    public static final Status DnsStart;
    public static final Status Enqueue;
    public static final Status Failure;
    public static final Status ParsingEnd;
    public static final Status ProxyEnd;
    public static final Status ProxyStart;
    public static final Status Request;
    public static final Status ResponseHeaders;
    public static final Status ResponseReceived;

    static {
        Status status = new Status("Enqueue", 0);
        Enqueue = status;
        Status status2 = new Status("ProxyStart", 1);
        ProxyStart = status2;
        Status status3 = new Status("ProxyEnd", 2);
        ProxyEnd = status3;
        Status status4 = new Status("DnsStart", 3);
        DnsStart = status4;
        Status status5 = new Status("DnsEnd", 4);
        DnsEnd = status5;
        Status status6 = new Status("ConnectStart", 5);
        ConnectStart = status6;
        Status status7 = new Status("ConnectEnd", 6);
        ConnectEnd = status7;
        Status status8 = new Status("ConnectFailed", 7);
        ConnectFailed = status8;
        Status status9 = new Status("Request", 8);
        Request = status9;
        Status status10 = new Status("ResponseHeaders", 9);
        ResponseHeaders = status10;
        Status status11 = new Status("ResponseReceived", 10);
        ResponseReceived = status11;
        Status status12 = new Status("Failure", 11);
        Failure = status12;
        Status status13 = new Status("Cancelled", 12);
        Cancelled = status13;
        Status status14 = new Status("ParsingEnd", 13);
        ParsingEnd = status14;
        Status[] statusArr = {status, status2, status3, status4, status5, status6, status7, status8, status9, status10, status11, status12, status13, status14};
        $VALUES = statusArr;
        $ENTRIES = kotlin.enums.a.a(statusArr);
    }

    public static Status valueOf(String str) {
        return (Status) Enum.valueOf(Status.class, str);
    }

    public static Status[] values() {
        return (Status[]) $VALUES.clone();
    }
}
