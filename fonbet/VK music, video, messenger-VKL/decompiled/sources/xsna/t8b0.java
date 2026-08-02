package xsna;

import com.vk.catalog2.feature.music.holders.playlist.MusicPlaylistVkTileVh;
import com.vk.core.view.components.tile.VkTile;
import kotlin.LazyThreadSafetyMode;

/* compiled from: PlaylistDownloadingViewController.kt */
/* loaded from: classes16.dex */
public final class t8b0 {
    public final VkTile a;
    public final Object b;

    public t8b0(VkTile vkTile, MusicPlaylistVkTileVh.b bVar) {
        this.a = vkTile;
        this.b = msy.a(LazyThreadSafetyMode.NONE, new pw(25, this, bVar));
    }
}
