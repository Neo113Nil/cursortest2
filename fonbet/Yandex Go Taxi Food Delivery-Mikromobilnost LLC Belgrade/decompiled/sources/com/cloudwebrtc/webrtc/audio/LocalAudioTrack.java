package com.cloudwebrtc.webrtc.audio;

import android.os.SystemClock;
import com.cloudwebrtc.webrtc.LocalTrack;
import defpackage.ny61;
import defpackage.oyr;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.webrtc.AudioTrack;
import org.webrtc.AudioTrackSink;
import org.webrtc.audio.JavaAudioDeviceModule;

/* loaded from: classes10.dex */
public class LocalAudioTrack extends LocalTrack implements JavaAudioDeviceModule.SamplesReadyCallback {
    final List<AudioTrackSink> sinks;

    public LocalAudioTrack(AudioTrack audioTrack) {
        super(audioTrack);
        this.sinks = new ArrayList();
    }

    private int getBytesPerSample(int i) {
        int i2 = 1;
        if (i != 1 && i != 2) {
            if (i != 3) {
                i2 = 4;
                if (i != 4) {
                    if (i != 13) {
                        ny61.g(oyr.i(i, "Bad audio format "));
                        return 0;
                    }
                }
            }
            return i2;
        }
        return 2;
    }

    public void addSink(AudioTrackSink audioTrackSink) {
        synchronized (this.sinks) {
            this.sinks.add(audioTrackSink);
        }
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.SamplesReadyCallback
    public void onWebRtcAudioRecordSamplesReady(JavaAudioDeviceModule.AudioSamples audioSamples) {
        int bytesPerSample = getBytesPerSample(audioSamples.getAudioFormat()) * 8;
        int sampleRate = audioSamples.getSampleRate() / 100;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (this.sinks) {
            try {
                Iterator<AudioTrackSink> it = this.sinks.iterator();
                while (it.hasNext()) {
                    it.next().onData(ByteBuffer.wrap(audioSamples.getData()), bytesPerSample, audioSamples.getSampleRate(), audioSamples.getChannelCount(), sampleRate, elapsedRealtime);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void removeSink(AudioTrackSink audioTrackSink) {
        synchronized (this.sinks) {
            this.sinks.remove(audioTrackSink);
        }
    }
}
