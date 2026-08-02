package android.support.v4.media;

import android.media.browse.MediaBrowser;
import android.os.Binder;
import android.os.Bundle;
import defpackage.ab10;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class MediaBrowserCompat$SubscriptionCallback {
    public WeakReference c;
    public final Binder b = new Binder();
    public final MediaBrowser.SubscriptionCallback a = new SubscriptionCallbackApi26();

    public class SubscriptionCallbackApi21 extends MediaBrowser.SubscriptionCallback {
        public SubscriptionCallbackApi21() {
        }

        public List<MediaBrowserCompat$MediaItem> applyOptions(List<MediaBrowserCompat$MediaItem> list, Bundle bundle) {
            if (list == null) {
                return null;
            }
            int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
            int i2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
            if (i == -1 && i2 == -1) {
                return list;
            }
            int i3 = i2 * i;
            int i4 = i3 + i2;
            if (i < 0 || i2 < 1 || i3 >= list.size()) {
                return Collections.EMPTY_LIST;
            }
            if (i4 > list.size()) {
                i4 = list.size();
            }
            return list.subList(i3, i4);
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list) {
            WeakReference weakReference = MediaBrowserCompat$SubscriptionCallback.this.c;
            ab10 ab10Var = weakReference == null ? null : (ab10) weakReference.get();
            if (ab10Var == null) {
                MediaBrowserCompat$SubscriptionCallback mediaBrowserCompat$SubscriptionCallback = MediaBrowserCompat$SubscriptionCallback.this;
                MediaBrowserCompat$MediaItem.fromMediaItemList(list);
                mediaBrowserCompat$SubscriptionCallback.getClass();
                return;
            }
            List<MediaBrowserCompat$MediaItem> fromMediaItemList = MediaBrowserCompat$MediaItem.fromMediaItemList(list);
            ArrayList arrayList = ab10Var.a;
            ArrayList arrayList2 = ab10Var.b;
            for (int i = 0; i < arrayList.size(); i++) {
                Bundle bundle = (Bundle) arrayList2.get(i);
                MediaBrowserCompat$SubscriptionCallback mediaBrowserCompat$SubscriptionCallback2 = MediaBrowserCompat$SubscriptionCallback.this;
                if (bundle == null) {
                    mediaBrowserCompat$SubscriptionCallback2.getClass();
                } else {
                    applyOptions(fromMediaItemList, bundle);
                    mediaBrowserCompat$SubscriptionCallback2.getClass();
                }
            }
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public void onError(String str) {
            MediaBrowserCompat$SubscriptionCallback.this.getClass();
        }
    }

    public class SubscriptionCallbackApi26 extends SubscriptionCallbackApi21 {
        public SubscriptionCallbackApi26() {
            super();
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list, Bundle bundle) {
            android.support.v4.media.session.c.a(bundle);
            MediaBrowserCompat$SubscriptionCallback mediaBrowserCompat$SubscriptionCallback = MediaBrowserCompat$SubscriptionCallback.this;
            MediaBrowserCompat$MediaItem.fromMediaItemList(list);
            mediaBrowserCompat$SubscriptionCallback.getClass();
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public void onError(String str, Bundle bundle) {
            android.support.v4.media.session.c.a(bundle);
            MediaBrowserCompat$SubscriptionCallback.this.getClass();
        }
    }
}
