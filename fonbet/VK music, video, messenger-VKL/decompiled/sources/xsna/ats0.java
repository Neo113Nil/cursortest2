package xsna;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: VideoMediaSessionCallbackDispatcher.kt */
/* loaded from: classes3.dex */
public final class ats0 extends MediaSessionCompat.Callback {
    public final CopyOnWriteArraySet<MediaSessionCompat.Callback> a = new CopyOnWriteArraySet<>();

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((MediaSessionCompat.Callback) it.next()).onCommand(str, bundle, resultReceiver);
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((MediaSessionCompat.Callback) it.next()).onCustomAction(str, bundle);
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onFastForward() {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((MediaSessionCompat.Callback) it.next()).onFastForward();
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        Iterator<T> it = this.a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= ((MediaSessionCompat.Callback) it.next()).onMediaButtonEvent(intent);
        }
        return z;
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPause() {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((MediaSessionCompat.Callback) it.next()).onPause();
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPlay() {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((MediaSessionCompat.Callback) it.next()).onPlay();
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((MediaSessionCompat.Callback) it.next()).onPlayFromMediaId(str, bundle);
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPlayFromSearch(String str, Bundle bundle) {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((MediaSessionCompat.Callback) it.next()).onPrepareFromSearch(str, bundle);
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((MediaSessionCompat.Callback) it.next()).onPlayFromUri(uri, bundle);
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPrepare() {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((MediaSessionCompat.Callback) it.next()).onPrepare();
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((MediaSessionCompat.Callback) it.next()).onPrepareFromMediaId(str, bundle);
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((MediaSessionCompat.Callback) it.next()).onPrepareFromSearch(str, bundle);
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((MediaSessionCompat.Callback) it.next()).onPrepareFromUri(uri, bundle);
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onRewind() {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((MediaSessionCompat.Callback) it.next()).onRewind();
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onSeekTo(long j) {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((MediaSessionCompat.Callback) it.next()).onSeekTo(j);
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onSetPlaybackSpeed(float f) {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((MediaSessionCompat.Callback) it.next()).onSetPlaybackSpeed(f);
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onSetRating(RatingCompat ratingCompat) {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((MediaSessionCompat.Callback) it.next()).onSetRating(ratingCompat);
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onSkipToNext() {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((MediaSessionCompat.Callback) it.next()).onSkipToNext();
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onSkipToPrevious() {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((MediaSessionCompat.Callback) it.next()).onSkipToPrevious();
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onSkipToQueueItem(long j) {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((MediaSessionCompat.Callback) it.next()).onSkipToQueueItem(j);
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onStop() {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((MediaSessionCompat.Callback) it.next()).onStop();
        }
    }
}
