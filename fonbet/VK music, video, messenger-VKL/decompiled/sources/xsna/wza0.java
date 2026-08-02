package xsna;

import com.vk.music.player.api.PlayerBottomSheetStateHolder;

/* compiled from: PlayerBottomSheetStateHolderImpl.kt */
/* loaded from: classes.dex */
public final class wza0 implements PlayerBottomSheetStateHolder {
    public PlayerBottomSheetStateHolder.State a;

    @Override // com.vk.music.player.api.PlayerBottomSheetStateHolder
    public final PlayerBottomSheetStateHolder.State getState() {
        return this.a;
    }

    @Override // com.vk.music.player.api.PlayerBottomSheetStateHolder
    public final void setState(int i) {
        this.a = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? PlayerBottomSheetStateHolder.State.STATE_HIDDEN : PlayerBottomSheetStateHolder.State.STATE_HIDDEN : PlayerBottomSheetStateHolder.State.STATE_COLLAPSED : PlayerBottomSheetStateHolder.State.STATE_EXPANDED : PlayerBottomSheetStateHolder.State.STATE_SETTLING : PlayerBottomSheetStateHolder.State.STATE_DRAGGING;
    }
}
