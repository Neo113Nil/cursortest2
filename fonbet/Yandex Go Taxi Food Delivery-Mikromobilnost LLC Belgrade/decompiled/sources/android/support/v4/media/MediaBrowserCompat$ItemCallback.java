package android.support.v4.media;

import android.media.browse.MediaBrowser;

/* loaded from: classes10.dex */
public abstract class MediaBrowserCompat$ItemCallback {
    public final MediaBrowser.ItemCallback a = new ItemCallbackApi23();

    public class ItemCallbackApi23 extends MediaBrowser.ItemCallback {
        public ItemCallbackApi23() {
        }

        @Override // android.media.browse.MediaBrowser.ItemCallback
        public void onError(String str) {
            MediaBrowserCompat$ItemCallback.this.getClass();
        }

        @Override // android.media.browse.MediaBrowser.ItemCallback
        public void onItemLoaded(MediaBrowser.MediaItem mediaItem) {
            MediaBrowserCompat$ItemCallback mediaBrowserCompat$ItemCallback = MediaBrowserCompat$ItemCallback.this;
            MediaBrowserCompat$MediaItem.fromMediaItem(mediaItem);
            mediaBrowserCompat$ItemCallback.getClass();
        }
    }
}
