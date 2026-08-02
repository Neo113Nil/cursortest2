package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.util.Log;
import defpackage.va10;

/* loaded from: classes10.dex */
public final class e {
    public static final boolean b = Log.isLoggable("MediaBrowserCompat", 3);
    public final va10 a;

    public e(final Context context, final ComponentName componentName, final MediaBrowserCompat$ConnectionCallback mediaBrowserCompat$ConnectionCallback) {
        final Bundle bundle = null;
        this.a = new MediaBrowserCompat$MediaBrowserImplApi23(context, componentName, mediaBrowserCompat$ConnectionCallback, bundle) { // from class: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi26
            @Override // android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21
            public void subscribe(String str, Bundle bundle2, MediaBrowserCompat$SubscriptionCallback mediaBrowserCompat$SubscriptionCallback) {
                if (this.mServiceBinderWrapper != null && this.mServiceVersion >= 2) {
                    super.subscribe(str, bundle2, mediaBrowserCompat$SubscriptionCallback);
                    return;
                }
                MediaBrowser mediaBrowser = this.mBrowserFwk;
                if (bundle2 == null) {
                    mediaBrowser.subscribe(str, mediaBrowserCompat$SubscriptionCallback.a);
                } else {
                    mediaBrowser.subscribe(str, bundle2, mediaBrowserCompat$SubscriptionCallback.a);
                }
            }

            @Override // android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21
            public void unsubscribe(String str, MediaBrowserCompat$SubscriptionCallback mediaBrowserCompat$SubscriptionCallback) {
                if (this.mServiceBinderWrapper != null && this.mServiceVersion >= 2) {
                    super.unsubscribe(str, mediaBrowserCompat$SubscriptionCallback);
                    return;
                }
                MediaBrowser mediaBrowser = this.mBrowserFwk;
                if (mediaBrowserCompat$SubscriptionCallback == null) {
                    mediaBrowser.unsubscribe(str);
                } else {
                    mediaBrowser.unsubscribe(str, mediaBrowserCompat$SubscriptionCallback.a);
                }
            }
        };
    }
}
