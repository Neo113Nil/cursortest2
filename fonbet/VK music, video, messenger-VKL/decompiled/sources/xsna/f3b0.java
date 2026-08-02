package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.music.stickyplayer.presentation.components.ParentBottomSheetState;

/* compiled from: StickyMusicPlayerContentView.kt */
/* loaded from: classes3.dex */
public final class f3b0 {
    public final wh50 a = androidx.compose.runtime.k.b(new anr(0, 0, 0, 0));
    public final kg50 b = androidx.compose.runtime.d.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public final wh50 c = androidx.compose.runtime.k.b(new s7k0(0));
    public final wh50 d = androidx.compose.runtime.k.b(ParentBottomSheetState.EXPANDED);

    public final ParentBottomSheetState a() {
        return (ParentBottomSheetState) ((zak0) this.d).getValue();
    }

    public final s7k0 b() {
        return (s7k0) ((zak0) this.c).getValue();
    }

    public final zpx0 c() {
        return (zpx0) ((zak0) this.a).getValue();
    }
}
