package com.cloudwebrtc.webrtc.record;

import android.media.AudioTrack;
import java.nio.ByteBuffer;
import org.webrtc.audio.JavaAudioDeviceModule;

/* loaded from: classes10.dex */
public final class AudioTrackInterceptor extends AudioTrack {
    private final JavaAudioDeviceModule.SamplesReadyCallback callback;
    public final AudioTrack originalTrack;

    public AudioTrackInterceptor(AudioTrack audioTrack, JavaAudioDeviceModule.SamplesReadyCallback samplesReadyCallback) {
        super(0, 44200, 4, 2, 128, 1);
        this.originalTrack = audioTrack;
        this.callback = samplesReadyCallback;
    }

    @Override // android.media.AudioTrack
    public int getBufferCapacityInFrames() {
        return this.originalTrack.getBufferCapacityInFrames();
    }

    @Override // android.media.AudioTrack
    public int getBufferSizeInFrames() {
        return this.originalTrack.getBufferSizeInFrames();
    }

    @Override // android.media.AudioTrack
    public int getPlayState() {
        return this.originalTrack.getPlayState();
    }

    @Override // android.media.AudioTrack
    public int getPlaybackHeadPosition() {
        return this.originalTrack.getPlaybackHeadPosition();
    }

    @Override // android.media.AudioTrack
    public int getUnderrunCount() {
        return this.originalTrack.getUnderrunCount();
    }

    @Override // android.media.AudioTrack
    public void play() throws IllegalStateException {
        this.originalTrack.play();
    }

    @Override // android.media.AudioTrack
    public void release() {
        this.originalTrack.release();
    }

    @Override // android.media.AudioTrack
    public void stop() throws IllegalStateException {
        this.originalTrack.stop();
    }

    @Override // android.media.AudioTrack
    public int write(ByteBuffer byteBuffer, int i, int i2) {
        byte[] bArr = new byte[i];
        int position = byteBuffer.position();
        byteBuffer.get(bArr, 0, i);
        byteBuffer.position(position);
        this.callback.onWebRtcAudioRecordSamplesReady(new JavaAudioDeviceModule.AudioSamples(this.originalTrack.getAudioFormat(), this.originalTrack.getChannelCount(), this.originalTrack.getSampleRate(), bArr));
        return this.originalTrack.write(byteBuffer, i, i2);
    }

    @Override // android.media.AudioTrack
    public int write(byte[] bArr, int i, int i2) {
        this.callback.onWebRtcAudioRecordSamplesReady(new JavaAudioDeviceModule.AudioSamples(this.originalTrack.getAudioFormat(), this.originalTrack.getChannelCount(), this.originalTrack.getSampleRate(), bArr));
        return this.originalTrack.write(bArr, i, i2);
    }
}
