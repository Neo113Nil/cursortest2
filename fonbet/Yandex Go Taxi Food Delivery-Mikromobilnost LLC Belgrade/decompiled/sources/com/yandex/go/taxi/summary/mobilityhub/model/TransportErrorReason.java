package com.yandex.go.taxi.summary.mobilityhub.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/model/TransportErrorReason;", "", "NoDestination", "NoSource", "LoadingError", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TransportErrorReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransportErrorReason[] $VALUES;
    public static final TransportErrorReason LoadingError;
    public static final TransportErrorReason NoDestination;
    public static final TransportErrorReason NoSource;

    static {
        TransportErrorReason transportErrorReason = new TransportErrorReason("NoDestination", 0);
        NoDestination = transportErrorReason;
        TransportErrorReason transportErrorReason2 = new TransportErrorReason("NoSource", 1);
        NoSource = transportErrorReason2;
        TransportErrorReason transportErrorReason3 = new TransportErrorReason("LoadingError", 2);
        LoadingError = transportErrorReason3;
        TransportErrorReason[] transportErrorReasonArr = {transportErrorReason, transportErrorReason2, transportErrorReason3};
        $VALUES = transportErrorReasonArr;
        $ENTRIES = a.a(transportErrorReasonArr);
    }

    public static TransportErrorReason valueOf(String str) {
        return (TransportErrorReason) Enum.valueOf(TransportErrorReason.class, str);
    }

    public static TransportErrorReason[] values() {
        return (TransportErrorReason[]) $VALUES.clone();
    }
}
