package com.yandex.passport.data.network.core;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/passport/data/network/core/DataEvents;", "", "DeviceAuthorizationCommit", "DeviceAuthorizationSubmit", "SendAuthToTrack", "GetDeviceCode", "passport-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DataEvents {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DataEvents[] $VALUES;
    public static final DataEvents DeviceAuthorizationCommit;
    public static final DataEvents DeviceAuthorizationSubmit;
    public static final DataEvents GetDeviceCode;
    public static final DataEvents SendAuthToTrack;

    static {
        DataEvents dataEvents = new DataEvents("DeviceAuthorizationCommit", 0);
        DeviceAuthorizationCommit = dataEvents;
        DataEvents dataEvents2 = new DataEvents("DeviceAuthorizationSubmit", 1);
        DeviceAuthorizationSubmit = dataEvents2;
        DataEvents dataEvents3 = new DataEvents("SendAuthToTrack", 2);
        SendAuthToTrack = dataEvents3;
        DataEvents dataEvents4 = new DataEvents("GetDeviceCode", 3);
        GetDeviceCode = dataEvents4;
        DataEvents[] dataEventsArr = {dataEvents, dataEvents2, dataEvents3, dataEvents4};
        $VALUES = dataEventsArr;
        $ENTRIES = kotlin.enums.a.a(dataEventsArr);
    }

    public static DataEvents valueOf(String str) {
        return (DataEvents) Enum.valueOf(DataEvents.class, str);
    }

    public static DataEvents[] values() {
        return (DataEvents[]) $VALUES.clone();
    }
}
