package one.video.player;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DashMediaChunkType.kt */
/* loaded from: classes8.dex */
public final class DashMediaChunkType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DashMediaChunkType[] $VALUES;
    public static final DashMediaChunkType AUDIO;
    public static final DashMediaChunkType TEXT;
    public static final DashMediaChunkType VIDEO;

    static {
        DashMediaChunkType dashMediaChunkType = new DashMediaChunkType(SignalingProtocol.MEDIA_OPTION_VIDEO, 0);
        VIDEO = dashMediaChunkType;
        DashMediaChunkType dashMediaChunkType2 = new DashMediaChunkType(SignalingProtocol.MEDIA_OPTION_AUDIO, 1);
        AUDIO = dashMediaChunkType2;
        DashMediaChunkType dashMediaChunkType3 = new DashMediaChunkType("TEXT", 2);
        TEXT = dashMediaChunkType3;
        DashMediaChunkType[] dashMediaChunkTypeArr = {dashMediaChunkType, dashMediaChunkType2, dashMediaChunkType3};
        $VALUES = dashMediaChunkTypeArr;
        $ENTRIES = new asp(dashMediaChunkTypeArr);
    }

    public DashMediaChunkType() {
        throw null;
    }

    public static DashMediaChunkType valueOf(String str) {
        return (DashMediaChunkType) Enum.valueOf(DashMediaChunkType.class, str);
    }

    public static DashMediaChunkType[] values() {
        return (DashMediaChunkType[]) $VALUES.clone();
    }
}
