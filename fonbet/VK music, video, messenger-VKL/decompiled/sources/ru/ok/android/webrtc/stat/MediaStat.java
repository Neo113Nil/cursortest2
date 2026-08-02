package ru.ok.android.webrtc.stat;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import ru.ok.android.webrtc.protocol.screenshare.recv.ScreenshareRecvStat;
import ru.ok.android.webrtc.utils.AudioProcessor;

/* loaded from: classes9.dex */
public final class MediaStat {
    public long a;
    public final AudioProcessor audioProcessor = new AudioProcessor();
    public final b b = new b();
    public final b c = new b();
    public long d;
    public long e;
    public long f;
    public long g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public long m;
    public long n;
    public ScreenshareRecvStat screenshareRecvStat;

    @NonNull
    public String getAudioCodecName() {
        return !TextUtils.isEmpty(this.j) ? this.j : "unknown";
    }

    public long getAudioPacketsLost() {
        return this.e;
    }

    public long getAudioPacketsSent() {
        return this.g;
    }

    public long getAudioRtt() {
        return this.n;
    }

    @NonNull
    public String getAudioSsrc() {
        return !TextUtils.isEmpty(this.h) ? this.h : "";
    }

    public double getReceiveBitrate() {
        return this.c.b.a.getValue() + this.c.a.a.getValue();
    }

    public double getSentBitrate() {
        return this.b.b.a.getValue() + this.b.a.a.getValue();
    }

    @NonNull
    public String getVideoCodecImplName() {
        return !TextUtils.isEmpty(this.l) ? this.l : "unknown";
    }

    public String getVideoCodecName() {
        return this.k;
    }

    public long getVideoPacketsLost() {
        return this.d;
    }

    public long getVideoPacketsSent() {
        return this.f;
    }

    public long getVideoRtt() {
        return this.m;
    }

    @NonNull
    public String getVideoSsrc() {
        return !TextUtils.isEmpty(this.i) ? this.i : "";
    }

    public boolean hasBytes() {
        return (this.c.c == 0 && this.b.c == 0) ? false : true;
    }

    public void setAudioPacketsSent(long j) {
        this.g = j;
    }

    public void setAudioRtt(long j) {
        this.n = j;
    }

    public void setScreenshareRecvStat(ScreenshareRecvStat screenshareRecvStat) {
        this.screenshareRecvStat = screenshareRecvStat;
    }

    public void setVideoCodecName(String str) {
        this.k = str;
    }

    public void setVideoPacketsSent(long j) {
        this.f = j;
    }

    public void setVideoRtt(long j) {
        this.m = j;
    }

    public String toDbgString() {
        StringBuilder sb = new StringBuilder("[ssrc]\n audio: ");
        sb.append(this.h);
        sb.append("\n video: ");
        sb.append(this.i);
        sb.append("\n[stamps]\n audio: ");
        sb.append(this.a);
        sb.append("\n bytes: ");
        sb.append(Math.max(this.c.c, this.b.c));
        sb.append("\n[audio]\n bytes: ");
        sb.append(this.c.a.c + this.b.a.c);
        sb.append("\n bitrate: ");
        sb.append(this.b.a.a.getValue() + this.c.a.a.getValue());
        sb.append("\n packets: lost: ");
        sb.append(this.e);
        sb.append(" total: ");
        sb.append(this.g);
        sb.append("\n codec: ");
        sb.append(this.j);
        sb.append("\n processor: ");
        sb.append(this.audioProcessor.isSilence());
        sb.append(DomExceptionUtils.SEPARATOR);
        sb.append(this.audioProcessor.getAverageAudioLevel());
        sb.append(DomExceptionUtils.SEPARATOR);
        sb.append(this.audioProcessor.getLastAudioLevel());
        sb.append("\n rtt: ");
        sb.append(this.n);
        sb.append("\n[video]\n bytes: ");
        sb.append(this.c.b.c + this.b.b.c);
        sb.append("\n bitrate: ");
        sb.append(this.b.b.a.getValue() + this.c.b.a.getValue());
        sb.append("\n packets: lost: ");
        sb.append(this.d);
        sb.append(" total: ");
        sb.append(this.f);
        sb.append("\n codec: ");
        sb.append(this.k);
        sb.append("\n impl: ");
        sb.append(this.l);
        sb.append("\n rtt: ");
        sb.append(this.m);
        sb.append("\n[dcss-recv] \n");
        ScreenshareRecvStat screenshareRecvStat = this.screenshareRecvStat;
        sb.append(screenshareRecvStat == null ? null : screenshareRecvStat.toDebugString());
        return sb.toString();
    }
}
