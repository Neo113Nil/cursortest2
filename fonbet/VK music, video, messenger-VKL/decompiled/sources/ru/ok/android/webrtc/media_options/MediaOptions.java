package ru.ok.android.webrtc.media_options;

import xsna.zcl;

/* compiled from: MediaOptions.kt */
/* loaded from: classes9.dex */
public final class MediaOptions {
    private final MediaOptionState audioState;
    private final MediaOptionState movieSharingState;
    private final MediaOptionState screenshareState;
    private final MediaOptionState videoState;

    public MediaOptions() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ MediaOptions copy$default(MediaOptions mediaOptions, MediaOptionState mediaOptionState, MediaOptionState mediaOptionState2, MediaOptionState mediaOptionState3, MediaOptionState mediaOptionState4, int i, Object obj) {
        if ((i & 1) != 0) {
            mediaOptionState = mediaOptions.audioState;
        }
        if ((i & 2) != 0) {
            mediaOptionState2 = mediaOptions.videoState;
        }
        if ((i & 4) != 0) {
            mediaOptionState3 = mediaOptions.screenshareState;
        }
        if ((i & 8) != 0) {
            mediaOptionState4 = mediaOptions.movieSharingState;
        }
        return mediaOptions.copy(mediaOptionState, mediaOptionState2, mediaOptionState3, mediaOptionState4);
    }

    public final MediaOptionState component1() {
        return this.audioState;
    }

    public final MediaOptionState component2() {
        return this.videoState;
    }

    public final MediaOptionState component3() {
        return this.screenshareState;
    }

    public final MediaOptionState component4() {
        return this.movieSharingState;
    }

    public final MediaOptions copy(MediaOptionState mediaOptionState, MediaOptionState mediaOptionState2, MediaOptionState mediaOptionState3, MediaOptionState mediaOptionState4) {
        return new MediaOptions(mediaOptionState, mediaOptionState2, mediaOptionState3, mediaOptionState4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaOptions)) {
            return false;
        }
        MediaOptions mediaOptions = (MediaOptions) obj;
        return this.audioState == mediaOptions.audioState && this.videoState == mediaOptions.videoState && this.screenshareState == mediaOptions.screenshareState && this.movieSharingState == mediaOptions.movieSharingState;
    }

    public final MediaOptionState getAudioState() {
        return this.audioState;
    }

    public final MediaOptionState getMovieSharingState() {
        return this.movieSharingState;
    }

    public final MediaOptionState getScreenshareState() {
        return this.screenshareState;
    }

    public final MediaOptionState getVideoState() {
        return this.videoState;
    }

    public int hashCode() {
        return this.movieSharingState.hashCode() + ((this.screenshareState.hashCode() + ((this.videoState.hashCode() + (this.audioState.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return "MediaOptions(audioState=" + this.audioState + ", videoState=" + this.videoState + ", screenshareState=" + this.screenshareState + ", movieSharingState=" + this.movieSharingState + ")";
    }

    public MediaOptions(MediaOptionState mediaOptionState) {
        this(mediaOptionState, null, null, null, 14, null);
    }

    public MediaOptions(MediaOptionState mediaOptionState, MediaOptionState mediaOptionState2) {
        this(mediaOptionState, mediaOptionState2, null, null, 12, null);
    }

    public MediaOptions(MediaOptionState mediaOptionState, MediaOptionState mediaOptionState2, MediaOptionState mediaOptionState3) {
        this(mediaOptionState, mediaOptionState2, mediaOptionState3, null, 8, null);
    }

    public MediaOptions(MediaOptionState mediaOptionState, MediaOptionState mediaOptionState2, MediaOptionState mediaOptionState3, MediaOptionState mediaOptionState4) {
        this.audioState = mediaOptionState;
        this.videoState = mediaOptionState2;
        this.screenshareState = mediaOptionState3;
        this.movieSharingState = mediaOptionState4;
    }

    public /* synthetic */ MediaOptions(MediaOptionState mediaOptionState, MediaOptionState mediaOptionState2, MediaOptionState mediaOptionState3, MediaOptionState mediaOptionState4, int i, zcl zclVar) {
        this((i & 1) != 0 ? MediaOptionState.UNMUTED : mediaOptionState, (i & 2) != 0 ? MediaOptionState.UNMUTED : mediaOptionState2, (i & 4) != 0 ? MediaOptionState.UNMUTED : mediaOptionState3, (i & 8) != 0 ? MediaOptionState.UNMUTED : mediaOptionState4);
    }
}
