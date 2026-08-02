package xsna;

import com.vk.stat.scheme.CommonAudioStat$AudioListeningEvent;

/* compiled from: VkMxAnalyticsMapper.kt */
/* loaded from: classes3.dex */
public final class j6v0 {

    /* compiled from: VkMxAnalyticsMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommonAudioStat$AudioListeningEvent.Type.values().length];
            try {
                iArr[CommonAudioStat$AudioListeningEvent.Type.PLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommonAudioStat$AudioListeningEvent.Type.STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
