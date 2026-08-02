package xsna;

import com.vk.music.stickyplayer.presentation.components.PlayerSheetTab;
import java.util.Collections;

/* compiled from: MusicWithBottomPlayer.kt */
/* loaded from: classes3.dex */
public final class ag50 implements gzs<wow<PlayerSheetTab>> {
    public final /* synthetic */ wh50 b;

    public ag50(wh50 wh50Var) {
        this.b = wh50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final wow<PlayerSheetTab> invoke() {
        return new wow<>(((Boolean) this.b.getValue()).booleanValue() ? e43.l(PlayerSheetTab.QUEUE, PlayerSheetTab.LYRICS) : Collections.singletonList(PlayerSheetTab.LYRICS));
    }
}
