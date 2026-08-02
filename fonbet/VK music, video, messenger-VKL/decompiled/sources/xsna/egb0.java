package xsna;

import com.vk.music.podcast.api.menu.PodcastMenuItem;
import java.util.List;

/* compiled from: PodcastAvailableMenuItemsImpl.kt */
/* loaded from: classes3.dex */
public final class egb0 implements dgb0 {
    @Override // xsna.dgb0
    public final List<PodcastMenuItem> get() {
        return e43.l(PodcastMenuItem.AddToBookFavorites, PodcastMenuItem.GoToPost, PodcastMenuItem.GoToAuthor, PodcastMenuItem.SubscribeToAuthor, PodcastMenuItem.Share, PodcastMenuItem.CopyLink);
    }
}
