package xsna;

import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;

/* compiled from: ClipsPlaylistUiBottomSheet.kt */
/* loaded from: classes16.dex */
public final class cre implements m0q0 {
    public final /* synthetic */ ClipsPlaylist b;

    public cre(ClipsPlaylist clipsPlaylist) {
        this.b = clipsPlaylist;
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.f = new SchemeStat$EventItem(SchemeStat$EventItem.Type.PLAYLIST, Long.valueOf(r2.b), Long.valueOf(this.b.f.b), null, null, null, 56, null);
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_PLAYLIST_BOTTOMSHEET;
    }
}
