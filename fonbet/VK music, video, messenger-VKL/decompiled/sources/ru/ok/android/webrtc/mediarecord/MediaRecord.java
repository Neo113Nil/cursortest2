package ru.ok.android.webrtc.mediarecord;

import org.webrtc.MediaSource;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.RtpSender;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.utils.MiscHelper;

/* loaded from: classes9.dex */
public abstract class MediaRecord<T extends MediaStreamTrack, S extends MediaSource> {
    public final String a;
    public final MediaStream b;
    public final RTCLog c;
    public MediaSource d;
    public MediaStreamTrack e;

    public MediaRecord(String str, MediaStream mediaStream, RTCLog rTCLog) {
        this.a = str;
        this.b = mediaStream;
        this.c = rTCLog;
    }

    public abstract void afterCreateTrack(MediaStream mediaStream, T t);

    public abstract void beforeRemoveTrack(MediaStream mediaStream, T t);

    public abstract S createSource();

    public abstract T createTrack(String str, S s);

    public final boolean getEnabled() {
        MediaStreamTrack mediaStreamTrack = this.e;
        if (mediaStreamTrack != null) {
            return mediaStreamTrack.enabled();
        }
        return false;
    }

    public final RTCLog getLog() {
        return this.c;
    }

    public String getLogTag() {
        return getClass().getSimpleName();
    }

    public final S getSource() {
        return (S) this.d;
    }

    public final T getTrack() {
        return (T) this.e;
    }

    public final void init() {
        if (this.e != null) {
            this.c.log(getLogTag(), this + ": An attempt to create track, while got one, ignore");
            return;
        }
        if (this.d != null) {
            this.c.log(getLogTag(), this + ": An attempt to create source, while got one, ignore");
            return;
        }
        S createSource = createSource();
        this.d = createSource;
        T createTrack = createSource != null ? createTrack(this.a, createSource) : null;
        this.e = createTrack;
        if (createTrack != null) {
            afterCreateTrack(this.b, createTrack);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void release() {
        MediaStreamTrack mediaStreamTrack = this.e;
        if (mediaStreamTrack != null) {
            beforeRemoveTrack(this.b, mediaStreamTrack);
        }
        MediaStreamTrack mediaStreamTrack2 = this.e;
        if (mediaStreamTrack2 != null) {
            mediaStreamTrack2.dispose();
            this.c.log(getLogTag(), this + ": " + MiscHelper.identity2(mediaStreamTrack2) + " was disposed");
        }
        this.e = null;
        MediaSource mediaSource = this.d;
        if (mediaSource != null) {
            mediaSource.dispose();
            this.c.log(getLogTag(), this + ": " + MiscHelper.identity2(mediaSource) + " was disposed");
        }
        this.d = null;
    }

    public final void setEnabled(boolean z) {
        MediaStreamTrack mediaStreamTrack = this.e;
        if (mediaStreamTrack != null) {
            mediaStreamTrack.setEnabled(z);
        }
    }

    public final void updateSender(RtpSender rtpSender) {
        MediaStreamTrack mediaStreamTrack = this.e;
        if (rtpSender == null || mediaStreamTrack == null || rtpSender.track() == mediaStreamTrack) {
            return;
        }
        this.c.log(getLogTag(), this + ": bind " + MiscHelper.identity2(mediaStreamTrack) + " with " + MiscHelper.identity2(rtpSender));
        rtpSender.setTrack(mediaStreamTrack, false);
    }
}
