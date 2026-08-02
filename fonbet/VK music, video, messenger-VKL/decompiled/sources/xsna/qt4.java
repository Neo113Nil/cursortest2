package xsna;

import com.vk.media.pipeline.audio.AudioPcm;
import java.nio.ByteBuffer;

/* compiled from: AudioProcessor.kt */
/* loaded from: classes3.dex */
public interface qt4 {
    AudioPcm a(AudioPcm audioPcm);

    void flush();

    ByteBuffer getOutput();

    void queueInput(ByteBuffer byteBuffer);
}
