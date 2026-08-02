package one.video.cast.manager.status;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MediaRouteConnectStatus.kt */
/* loaded from: classes8.dex */
public final class MediaRouteConnectStatus {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MediaRouteConnectStatus[] $VALUES;
    public static final MediaRouteConnectStatus CONNECTED;
    public static final MediaRouteConnectStatus CONNECTING;
    public static final MediaRouteConnectStatus NOT_CONNECTED;
    public static final MediaRouteConnectStatus NO_DEVICES_AVAILABLE;

    static {
        MediaRouteConnectStatus mediaRouteConnectStatus = new MediaRouteConnectStatus("NO_DEVICES_AVAILABLE", 0);
        NO_DEVICES_AVAILABLE = mediaRouteConnectStatus;
        MediaRouteConnectStatus mediaRouteConnectStatus2 = new MediaRouteConnectStatus("NOT_CONNECTED", 1);
        NOT_CONNECTED = mediaRouteConnectStatus2;
        MediaRouteConnectStatus mediaRouteConnectStatus3 = new MediaRouteConnectStatus("CONNECTING", 2);
        CONNECTING = mediaRouteConnectStatus3;
        MediaRouteConnectStatus mediaRouteConnectStatus4 = new MediaRouteConnectStatus("CONNECTED", 3);
        CONNECTED = mediaRouteConnectStatus4;
        MediaRouteConnectStatus[] mediaRouteConnectStatusArr = {mediaRouteConnectStatus, mediaRouteConnectStatus2, mediaRouteConnectStatus3, mediaRouteConnectStatus4};
        $VALUES = mediaRouteConnectStatusArr;
        $ENTRIES = new asp(mediaRouteConnectStatusArr);
    }

    public MediaRouteConnectStatus() {
        throw null;
    }

    public static MediaRouteConnectStatus valueOf(String str) {
        return (MediaRouteConnectStatus) Enum.valueOf(MediaRouteConnectStatus.class, str);
    }

    public static MediaRouteConnectStatus[] values() {
        return (MediaRouteConnectStatus[]) $VALUES.clone();
    }
}
