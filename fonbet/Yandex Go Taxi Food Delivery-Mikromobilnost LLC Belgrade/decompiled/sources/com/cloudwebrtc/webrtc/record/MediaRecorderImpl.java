package com.cloudwebrtc.webrtc.record;

import android.util.Log;
import com.cloudwebrtc.webrtc.utils.EglUtils;
import defpackage.w511;
import java.io.File;
import org.webrtc.VideoTrack;

/* loaded from: classes10.dex */
public class MediaRecorderImpl {
    private static final String TAG = "MediaRecorderImpl";
    private final AudioSamplesInterceptor audioInterceptor;
    private final Integer id;
    private boolean isRunning = false;
    private File recordFile;
    private VideoFileRenderer videoFileRenderer;
    private final VideoTrack videoTrack;

    public MediaRecorderImpl(Integer num, VideoTrack videoTrack, AudioSamplesInterceptor audioSamplesInterceptor) {
        this.id = num;
        this.videoTrack = videoTrack;
        this.audioInterceptor = audioSamplesInterceptor;
    }

    public File getRecordFile() {
        return this.recordFile;
    }

    public void startRecording(File file) throws Exception {
        this.recordFile = file;
        if (this.isRunning) {
            return;
        }
        this.isRunning = true;
        file.getParentFile().mkdirs();
        if (this.videoTrack == null) {
            Log.e(TAG, "Video track is null");
            if (this.audioInterceptor == null) {
                return;
            }
            w511.s("Audio-only recording not implemented yet");
            return;
        }
        VideoFileRenderer videoFileRenderer = new VideoFileRenderer(file.getAbsolutePath(), EglUtils.getRootEglBaseContext(), this.audioInterceptor != null);
        this.videoFileRenderer = videoFileRenderer;
        this.videoTrack.addSink(videoFileRenderer);
        AudioSamplesInterceptor audioSamplesInterceptor = this.audioInterceptor;
        if (audioSamplesInterceptor != null) {
            audioSamplesInterceptor.attachCallback(this.id, this.videoFileRenderer);
        }
    }

    public void stopRecording() {
        VideoFileRenderer videoFileRenderer;
        this.isRunning = false;
        AudioSamplesInterceptor audioSamplesInterceptor = this.audioInterceptor;
        if (audioSamplesInterceptor != null) {
            audioSamplesInterceptor.detachCallback(this.id);
        }
        VideoTrack videoTrack = this.videoTrack;
        if (videoTrack == null || (videoFileRenderer = this.videoFileRenderer) == null) {
            return;
        }
        videoTrack.removeSink(videoFileRenderer);
        this.videoFileRenderer.release();
        this.videoFileRenderer = null;
    }
}
