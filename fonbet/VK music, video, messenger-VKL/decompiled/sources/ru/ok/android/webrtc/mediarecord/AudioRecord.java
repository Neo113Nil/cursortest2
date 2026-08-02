package ru.ok.android.webrtc.mediarecord;

import org.webrtc.AudioSource;
import org.webrtc.AudioTrack;
import org.webrtc.MediaConstraints;
import org.webrtc.MediaStream;
import org.webrtc.PeerConnectionFactory;
import ru.ok.android.webrtc.RTCLog;

/* loaded from: classes9.dex */
public final class AudioRecord extends MediaRecord<AudioTrack, AudioSource> {
    public final PeerConnectionFactory f;

    public AudioRecord(PeerConnectionFactory peerConnectionFactory, String str, MediaStream mediaStream, RTCLog rTCLog) {
        super(str, mediaStream, rTCLog);
        this.f = peerConnectionFactory;
    }

    public String toString() {
        return "OkSdkAudioRecord";
    }

    @Override // ru.ok.android.webrtc.mediarecord.MediaRecord
    public void afterCreateTrack(MediaStream mediaStream, AudioTrack audioTrack) {
        if (mediaStream != null) {
            mediaStream.addTrack(audioTrack);
        }
    }

    @Override // ru.ok.android.webrtc.mediarecord.MediaRecord
    public void beforeRemoveTrack(MediaStream mediaStream, AudioTrack audioTrack) {
        if (mediaStream != null) {
            mediaStream.removeTrack(audioTrack);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.ok.android.webrtc.mediarecord.MediaRecord
    public AudioSource createSource() {
        return this.f.createAudioSource(new MediaConstraints());
    }

    @Override // ru.ok.android.webrtc.mediarecord.MediaRecord
    public AudioTrack createTrack(String str, AudioSource audioSource) {
        return this.f.createAudioTrack(str, audioSource);
    }
}
