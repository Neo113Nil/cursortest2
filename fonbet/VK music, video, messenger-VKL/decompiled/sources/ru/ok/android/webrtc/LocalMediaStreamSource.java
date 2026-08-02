package ru.ok.android.webrtc;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.webrtc.AudioTrack;
import org.webrtc.RtpSender;
import org.webrtc.Size;
import org.webrtc.VideoTrack;
import ru.ok.android.webrtc.mediarecord.ScreenShareRecord;
import ru.ok.android.webrtc.mediarecord.VideoRecord;
import ru.ok.android.webrtc.protocol.RtcTransport;
import ru.ok.android.webrtc.screenshare.ScreenCapturePermissionProvider;

/* loaded from: classes9.dex */
public interface LocalMediaStreamSource {

    public interface DataChannelScreenCaptureHolder {
        void onDataChannelScreenCapturerBound();

        void onDataChannelScreenCapturerUnbound();
    }

    public interface EventListener {
        void onLocalMediaStreamChanged(@NonNull LocalMediaStream localMediaStream);
    }

    public interface LocalMediaStream {
        void addEventListener(EventListener eventListener);

        void applyDataChannelScreenShare(MutableMediaSettings mutableMediaSettings, ScreenCapturePermissionProvider screenCapturePermissionProvider);

        void applyFastScreenShare(MutableMediaSettings mutableMediaSettings, ScreenCapturePermissionProvider screenCapturePermissionProvider);

        void bindTracksWith(RtpSender rtpSender, RtpSender rtpSender2);

        AudioTrack getAudioShareTrack();

        AudioTrack getAudioTrack();

        VideoRecord getCameraRecord();

        VideoTrack getCameraTrack();

        Size getCameraVideoSize();

        ScreenShareRecord getScreenShareRecord();

        VideoTrack getScreenShareTrack();

        int getScreenShareVideoHeight();

        int getScreenShareVideoWidth();

        String getStreamId();

        void initDataChannelScreenShareSender(@NonNull DataChannelScreenCaptureHolder dataChannelScreenCaptureHolder, RtcTransport rtcTransport);

        void releaseDataChannelScreenShareSender(@NonNull DataChannelScreenCaptureHolder dataChannelScreenCaptureHolder);

        void removeEventListener(EventListener eventListener);
    }

    public interface OnScreenSizeChangedListener {
        void onScreenSizeChanged(int i, int i2);
    }

    public interface ScreenCaptureStateListener {
        void onScreenCaptureStarted(boolean z);

        void onScreenCaptureStopped(boolean z);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface VideoCaptureState {
        public static final int BACK_CAMERA = 2;
        public static final int FRONT_CAMERA = 1;
        public static final int NOT_STARTED = 0;
        public static final int SCREEN = 3;
    }

    @Nullable
    LocalMediaStream getMediaStream();

    int getVideoCaptureState();
}
