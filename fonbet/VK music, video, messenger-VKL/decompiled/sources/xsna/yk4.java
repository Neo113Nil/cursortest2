package xsna;

import com.vk.music.stickyplayer.presentation.components.PlayerSheetTab;
import java.util.Collections;
import kotlin.collections.EmptyList;

/* compiled from: AudioBookWithBottomPlayer.kt */
/* loaded from: classes3.dex */
public final class yk4 implements gzs<wow<PlayerSheetTab>> {
    public final /* synthetic */ wh50 b;

    public yk4(wh50 wh50Var) {
        this.b = wh50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final wow<PlayerSheetTab> invoke() {
        return new wow<>(((Boolean) this.b.getValue()).booleanValue() ? Collections.singletonList(PlayerSheetTab.QUEUE) : EmptyList.b);
    }
}
