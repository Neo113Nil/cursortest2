package ru.ok.android.webrtc.media_options.internal;

import java.util.EnumMap;
import java.util.Map;
import ru.ok.android.webrtc.media_options.MediaOption;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import ru.ok.android.webrtc.media_options.MediaOptions;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class MutableMediaOptions {
    public MediaOptionState a;
    public MediaOptionState b;
    public MediaOptionState c;
    public MediaOptionState d;

    public MutableMediaOptions() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ MutableMediaOptions copy$default(MutableMediaOptions mutableMediaOptions, MediaOptionState mediaOptionState, MediaOptionState mediaOptionState2, MediaOptionState mediaOptionState3, MediaOptionState mediaOptionState4, int i, Object obj) {
        if ((i & 1) != 0) {
            mediaOptionState = mutableMediaOptions.a;
        }
        if ((i & 2) != 0) {
            mediaOptionState2 = mutableMediaOptions.b;
        }
        if ((i & 4) != 0) {
            mediaOptionState3 = mutableMediaOptions.c;
        }
        if ((i & 8) != 0) {
            mediaOptionState4 = mutableMediaOptions.d;
        }
        return mutableMediaOptions.copy(mediaOptionState, mediaOptionState2, mediaOptionState3, mediaOptionState4);
    }

    public final MediaOptionState component1() {
        return this.a;
    }

    public final MediaOptionState component2() {
        return this.b;
    }

    public final MediaOptionState component3() {
        return this.c;
    }

    public final MediaOptionState component4() {
        return this.d;
    }

    public final MutableMediaOptions copy(MediaOptionState mediaOptionState, MediaOptionState mediaOptionState2, MediaOptionState mediaOptionState3, MediaOptionState mediaOptionState4) {
        return new MutableMediaOptions(mediaOptionState, mediaOptionState2, mediaOptionState3, mediaOptionState4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MutableMediaOptions)) {
            return false;
        }
        MutableMediaOptions mutableMediaOptions = (MutableMediaOptions) obj;
        return this.a == mutableMediaOptions.a && this.b == mutableMediaOptions.b && this.c == mutableMediaOptions.c && this.d == mutableMediaOptions.d;
    }

    public final MediaOptionState getAudioState() {
        return this.a;
    }

    public final Map<MediaOption, MediaOptionState> getDiff(MutableMediaOptions mutableMediaOptions) {
        EnumMap enumMap = new EnumMap(MediaOption.class);
        MediaOptionState mediaOptionState = this.a;
        if (mediaOptionState != mutableMediaOptions.a) {
            enumMap.put((EnumMap) MediaOption.AUDIO, (MediaOption) mediaOptionState);
        }
        MediaOptionState mediaOptionState2 = this.b;
        if (mediaOptionState2 != mutableMediaOptions.b) {
            enumMap.put((EnumMap) MediaOption.VIDEO, (MediaOption) mediaOptionState2);
        }
        MediaOptionState mediaOptionState3 = this.c;
        if (mediaOptionState3 != mutableMediaOptions.c) {
            enumMap.put((EnumMap) MediaOption.SCREEN_SHARING, (MediaOption) mediaOptionState3);
        }
        MediaOptionState mediaOptionState4 = this.d;
        if (mediaOptionState4 != mutableMediaOptions.d) {
            enumMap.put((EnumMap) MediaOption.MOVIE_SHARING, (MediaOption) mediaOptionState4);
        }
        return enumMap;
    }

    public final MediaOptionState getMovieSharingState() {
        return this.d;
    }

    public final MediaOptionState getScreenshareState() {
        return this.c;
    }

    public final MediaOptionState getVideoState() {
        return this.b;
    }

    public int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final void setAudioState(MediaOptionState mediaOptionState) {
        this.a = mediaOptionState;
    }

    public final void setMovieSharingState(MediaOptionState mediaOptionState) {
        this.d = mediaOptionState;
    }

    public final void setScreenshareState(MediaOptionState mediaOptionState) {
        this.c = mediaOptionState;
    }

    public final void setVideoState(MediaOptionState mediaOptionState) {
        this.b = mediaOptionState;
    }

    public final Map<MediaOption, MediaOptionState> toMap() {
        EnumMap enumMap = new EnumMap(MediaOption.class);
        enumMap.put((EnumMap) MediaOption.AUDIO, (MediaOption) this.a);
        enumMap.put((EnumMap) MediaOption.VIDEO, (MediaOption) this.b);
        enumMap.put((EnumMap) MediaOption.SCREEN_SHARING, (MediaOption) this.c);
        enumMap.put((EnumMap) MediaOption.MOVIE_SHARING, (MediaOption) this.d);
        return enumMap;
    }

    public final MediaOptions toMediaOptions() {
        return new MediaOptions(this.a, this.b, this.c, this.d);
    }

    public String toString() {
        return "MutableMediaOptions(audioState=" + this.a + ", videoState=" + this.b + ", screenshareState=" + this.c + ", movieSharingState=" + this.d + ")";
    }

    public MutableMediaOptions(MediaOptionState mediaOptionState, MediaOptionState mediaOptionState2, MediaOptionState mediaOptionState3, MediaOptionState mediaOptionState4) {
        this.a = mediaOptionState;
        this.b = mediaOptionState2;
        this.c = mediaOptionState3;
        this.d = mediaOptionState4;
    }

    public /* synthetic */ MutableMediaOptions(MediaOptionState mediaOptionState, MediaOptionState mediaOptionState2, MediaOptionState mediaOptionState3, MediaOptionState mediaOptionState4, int i, zcl zclVar) {
        this((i & 1) != 0 ? MediaOptionState.UNMUTED : mediaOptionState, (i & 2) != 0 ? MediaOptionState.UNMUTED : mediaOptionState2, (i & 4) != 0 ? MediaOptionState.UNMUTED : mediaOptionState3, (i & 8) != 0 ? MediaOptionState.UNMUTED : mediaOptionState4);
    }

    public MutableMediaOptions(MutableMediaOptions mutableMediaOptions) {
        this(mutableMediaOptions.a, mutableMediaOptions.b, mutableMediaOptions.c, mutableMediaOptions.d);
    }

    public MutableMediaOptions(MediaOptions mediaOptions) {
        this(mediaOptions.getAudioState(), mediaOptions.getVideoState(), mediaOptions.getScreenshareState(), mediaOptions.getMovieSharingState());
    }
}
