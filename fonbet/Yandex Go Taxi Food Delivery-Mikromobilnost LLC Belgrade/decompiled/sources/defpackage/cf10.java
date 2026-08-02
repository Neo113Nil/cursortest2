package defpackage;

import android.support.v4.media.session.MediaSessionCompat$Callback;
import android.support.v4.media.session.PlaybackStateCompat;

/* loaded from: classes10.dex */
public interface cf10 {
    MediaSessionCompat$Callback getCallback();

    PlaybackStateCompat getPlaybackState();

    void setCurrentControllerInfo(hf10 hf10Var);
}
