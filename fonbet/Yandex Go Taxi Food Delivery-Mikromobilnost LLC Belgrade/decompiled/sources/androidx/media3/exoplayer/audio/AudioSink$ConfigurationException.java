package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;

/* loaded from: classes10.dex */
public final class AudioSink$ConfigurationException extends Exception {
    public final androidx.media3.common.a format;

    public AudioSink$ConfigurationException(AudioProcessor$UnhandledAudioFormatException audioProcessor$UnhandledAudioFormatException, androidx.media3.common.a aVar) {
        super(audioProcessor$UnhandledAudioFormatException);
        this.format = aVar;
    }

    public AudioSink$ConfigurationException(String str, androidx.media3.common.a aVar) {
        super(str);
        this.format = aVar;
    }
}
