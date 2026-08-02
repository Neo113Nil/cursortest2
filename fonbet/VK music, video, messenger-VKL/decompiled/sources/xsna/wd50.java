package xsna;

import com.vk.music.player.domain.state.LyricsMode;

/* compiled from: MusicTrackPlayerSkinRenderer.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class wd50 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[LyricsMode.values().length];
        try {
            iArr[LyricsMode.LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LyricsMode.PLACEHOLDER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LyricsMode.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[LyricsMode.CONTENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
