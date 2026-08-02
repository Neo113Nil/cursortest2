package android.support.v4.media.session;

import android.media.Rating;
import android.media.session.MediaController;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import defpackage.ny61;

/* loaded from: classes10.dex */
class MediaControllerCompat$TransportControlsApi21 extends a {
    protected final MediaController.TransportControls mControlsFwk;

    public MediaControllerCompat$TransportControlsApi21(MediaController.TransportControls transportControls) {
        this.mControlsFwk = transportControls;
    }

    public void fastForward() {
        this.mControlsFwk.fastForward();
    }

    public void pause() {
        this.mControlsFwk.pause();
    }

    public void play() {
        this.mControlsFwk.play();
    }

    public void playFromMediaId(String str, Bundle bundle) {
        this.mControlsFwk.playFromMediaId(str, bundle);
    }

    public void playFromSearch(String str, Bundle bundle) {
        this.mControlsFwk.playFromSearch(str, bundle);
    }

    public void playFromUri(Uri uri, Bundle bundle) {
        if (uri == null || Uri.EMPTY.equals(uri)) {
            ny61.g("You must specify a non-empty Uri for playFromUri.");
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("android.support.v4.media.session.action.ARGUMENT_URI", uri);
        bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
        sendCustomAction("android.support.v4.media.session.action.PLAY_FROM_URI", bundle2);
    }

    public void prepare() {
        sendCustomAction("android.support.v4.media.session.action.PREPARE", (Bundle) null);
    }

    public void prepareFromMediaId(String str, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID", str);
        bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
        sendCustomAction("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID", bundle2);
    }

    public void prepareFromSearch(String str, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putString("android.support.v4.media.session.action.ARGUMENT_QUERY", str);
        bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
        sendCustomAction("android.support.v4.media.session.action.PREPARE_FROM_SEARCH", bundle2);
    }

    public void prepareFromUri(Uri uri, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("android.support.v4.media.session.action.ARGUMENT_URI", uri);
        bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
        sendCustomAction("android.support.v4.media.session.action.PREPARE_FROM_URI", bundle2);
    }

    public void rewind() {
        this.mControlsFwk.rewind();
    }

    public void seekTo(long j) {
        this.mControlsFwk.seekTo(j);
    }

    public void sendCustomAction(PlaybackStateCompat.CustomAction customAction, Bundle bundle) {
        b.a(bundle, customAction.getAction());
        this.mControlsFwk.sendCustomAction(customAction.getAction(), bundle);
    }

    public void setCaptioningEnabled(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED", z);
        sendCustomAction("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED", bundle);
    }

    public void setPlaybackSpeed(float f) {
        if (f == 0.0f) {
            ny61.g("speed must not be zero");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", f);
        sendCustomAction("android.support.v4.media.session.action.SET_PLAYBACK_SPEED", bundle);
    }

    public void setRating(RatingCompat ratingCompat, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("android.support.v4.media.session.action.ARGUMENT_RATING", ratingCompat);
        bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
        sendCustomAction("android.support.v4.media.session.action.SET_RATING", bundle2);
    }

    public void setRepeatMode(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE", i);
        sendCustomAction("android.support.v4.media.session.action.SET_REPEAT_MODE", bundle);
    }

    public void setShuffleMode(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE", i);
        sendCustomAction("android.support.v4.media.session.action.SET_SHUFFLE_MODE", bundle);
    }

    public void skipToNext() {
        this.mControlsFwk.skipToNext();
    }

    public void skipToPrevious() {
        this.mControlsFwk.skipToPrevious();
    }

    public void skipToQueueItem(long j) {
        this.mControlsFwk.skipToQueueItem(j);
    }

    public void stop() {
        this.mControlsFwk.stop();
    }

    public void sendCustomAction(String str, Bundle bundle) {
        b.a(bundle, str);
        this.mControlsFwk.sendCustomAction(str, bundle);
    }

    public void setRating(RatingCompat ratingCompat) {
        this.mControlsFwk.setRating(ratingCompat != null ? (Rating) ratingCompat.getRating() : null);
    }
}
