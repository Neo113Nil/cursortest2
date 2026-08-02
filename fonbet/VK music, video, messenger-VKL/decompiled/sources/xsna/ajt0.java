package xsna;

import com.vk.libvideo.api.subtitles.SubtitlesConfigurationMode;

/* compiled from: VideoSubtitlesRepository.kt */
/* loaded from: classes2.dex */
public final class ajt0 {
    public static final m1n0 b = new m1n0(true, null);
    public static final m1n0 c = new m1n0(false, null);
    public final bpn0 a = new bpn0(new w0o0(6));

    /* compiled from: VideoSubtitlesRepository.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SubtitlesConfigurationMode.values().length];
            try {
                iArr[SubtitlesConfigurationMode.FROM_PERSISTENT_STORAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SubtitlesConfigurationMode.ALWAYS_DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SubtitlesConfigurationMode.ALWAYS_ENABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
