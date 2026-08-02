package com.cloudwebrtc.webrtc.audio;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.webrtc.ExternalAudioProcessingFactory;

/* loaded from: classes10.dex */
public class AudioProcessingAdapter implements ExternalAudioProcessingFactory.AudioProcessing {
    List<ExternalAudioFrameProcessing> audioProcessors = new ArrayList();

    public interface ExternalAudioFrameProcessing {
        void initialize(int i, int i2);

        void process(int i, int i2, ByteBuffer byteBuffer);

        void reset(int i);
    }

    public void addProcessor(ExternalAudioFrameProcessing externalAudioFrameProcessing) {
        synchronized (this.audioProcessors) {
            this.audioProcessors.add(externalAudioFrameProcessing);
        }
    }

    @Override // org.webrtc.ExternalAudioProcessingFactory.AudioProcessing
    public void initialize(int i, int i2) {
        synchronized (this.audioProcessors) {
            try {
                Iterator<ExternalAudioFrameProcessing> it = this.audioProcessors.iterator();
                while (it.hasNext()) {
                    it.next().initialize(i, i2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.webrtc.ExternalAudioProcessingFactory.AudioProcessing
    public void process(int i, int i2, ByteBuffer byteBuffer) {
        synchronized (this.audioProcessors) {
            try {
                Iterator<ExternalAudioFrameProcessing> it = this.audioProcessors.iterator();
                while (it.hasNext()) {
                    it.next().process(i, i2, byteBuffer);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void removeProcessor(ExternalAudioFrameProcessing externalAudioFrameProcessing) {
        synchronized (this.audioProcessors) {
            this.audioProcessors.remove(externalAudioFrameProcessing);
        }
    }

    @Override // org.webrtc.ExternalAudioProcessingFactory.AudioProcessing
    public void reset(int i) {
        synchronized (this.audioProcessors) {
            try {
                Iterator<ExternalAudioFrameProcessing> it = this.audioProcessors.iterator();
                while (it.hasNext()) {
                    it.next().reset(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
