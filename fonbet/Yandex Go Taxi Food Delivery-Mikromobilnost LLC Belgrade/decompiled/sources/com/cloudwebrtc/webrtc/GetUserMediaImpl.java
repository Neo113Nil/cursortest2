package com.cloudwebrtc.webrtc;

import android.app.Activity;
import android.app.Fragment;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.hardware.camera2.CameraManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.provider.MediaStore;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import com.cloudwebrtc.webrtc.audio.AudioSwitchManager;
import com.cloudwebrtc.webrtc.audio.AudioUtils;
import com.cloudwebrtc.webrtc.audio.LocalAudioTrack;
import com.cloudwebrtc.webrtc.record.AudioChannel;
import com.cloudwebrtc.webrtc.record.AudioSamplesInterceptor;
import com.cloudwebrtc.webrtc.record.MediaRecorderImpl;
import com.cloudwebrtc.webrtc.record.OutputAudioSamplesInterceptor;
import com.cloudwebrtc.webrtc.utils.Callback;
import com.cloudwebrtc.webrtc.utils.ConstraintsArray;
import com.cloudwebrtc.webrtc.utils.ConstraintsMap;
import com.cloudwebrtc.webrtc.utils.EglUtils;
import com.cloudwebrtc.webrtc.utils.MediaConstraintsUtils;
import com.cloudwebrtc.webrtc.utils.ObjectType;
import com.cloudwebrtc.webrtc.utils.PermissionUtils;
import com.cloudwebrtc.webrtc.video.LocalVideoTrack;
import com.cloudwebrtc.webrtc.video.VideoCapturerInfo;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.da20;
import defpackage.g8e;
import defpackage.qft;
import defpackage.unr0;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.webrtc.AudioSource;
import org.webrtc.AudioTrack;
import org.webrtc.Camera1Capturer;
import org.webrtc.Camera1Enumerator;
import org.webrtc.Camera1Helper;
import org.webrtc.Camera2Capturer;
import org.webrtc.Camera2Enumerator;
import org.webrtc.Camera2Helper;
import org.webrtc.CameraEnumerator;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.MediaConstraints;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.Size;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoCapturer;
import org.webrtc.VideoSource;
import org.webrtc.VideoTrack;
import org.webrtc.audio.JavaAudioDeviceModule;

/* loaded from: classes10.dex */
public class GetUserMediaImpl {
    private static final int CAPTURE_PERMISSION_REQUEST_CODE = 1;
    private static final int DEFAULT_FPS = 30;
    private static final int DEFAULT_HEIGHT = 720;
    private static final int DEFAULT_WIDTH = 1280;
    private static final String GRANT_RESULTS = "GRANT_RESULT";
    private static final String PERMISSIONS = "PERMISSION";
    private static final String PERMISSION_AUDIO = "android.permission.RECORD_AUDIO";
    private static final String PERMISSION_SCREEN = "android.permission.MediaProjection";
    private static final String PERMISSION_VIDEO = "android.permission.CAMERA";
    private static final String PROJECTION_DATA = "PROJECTION_DATA";
    private static final String REQUEST_CODE = "REQUEST_CODE";
    private static final String RESULT_RECEIVER = "RESULT_RECEIVER";
    static final String TAG = "FlutterWebRTCPlugin";
    static final int minAPILevel = 21;
    private final Context applicationContext;
    JavaAudioDeviceModule audioDeviceModule;
    private boolean isTorchOn;
    private final StateProvider stateProvider;
    private final Map<String, VideoCapturerInfoEx> mVideoCapturers = new HashMap();
    private final Map<String, SurfaceTextureHelper> mSurfaceTextureHelpers = new HashMap();
    final AudioSamplesInterceptor inputSamplesInterceptor = new AudioSamplesInterceptor();
    private OutputAudioSamplesInterceptor outputSamplesInterceptor = null;
    private final SparseArray<MediaRecorderImpl> mediaRecorders = new SparseArray<>();
    private AudioDeviceInfo preferredInput = null;
    private Intent mediaProjectionData = null;
    private boolean isFacing = true;

    /* renamed from: com.cloudwebrtc.webrtc.GetUserMediaImpl$7, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] $SwitchMap$com$cloudwebrtc$webrtc$utils$ObjectType;

        static {
            int[] iArr = new int[ObjectType.values().length];
            $SwitchMap$com$cloudwebrtc$webrtc$utils$ObjectType = iArr;
            try {
                iArr[ObjectType.Boolean.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$cloudwebrtc$webrtc$utils$ObjectType[ObjectType.Map.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public interface IsCameraEnabled {
        boolean isEnabled(String str);
    }

    public static class ScreenRequestPermissionsFragment extends Fragment {
        private ResultReceiver resultReceiver = null;
        private int requestCode = 0;
        private final int resultCode = 0;

        private void checkSelfPermissions(boolean z) {
            Activity activity = getActivity();
            Bundle arguments = getArguments();
            this.resultReceiver = (ResultReceiver) arguments.getParcelable(GetUserMediaImpl.RESULT_RECEIVER);
            int i = arguments.getInt(GetUserMediaImpl.REQUEST_CODE);
            this.requestCode = i;
            requestStart(activity, i);
        }

        private void finish() {
            Activity activity = getActivity();
            if (activity != null) {
                activity.getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
            }
        }

        @Override // android.app.Fragment
        public void onActivityResult(int i, int i2, Intent intent) {
            super.onActivityResult(i, i2, intent);
            if (i2 != -1) {
                finish();
                Bundle bundle = new Bundle();
                bundle.putString(GetUserMediaImpl.PERMISSIONS, GetUserMediaImpl.PERMISSION_SCREEN);
                bundle.putInt(GetUserMediaImpl.GRANT_RESULTS, i2);
                this.resultReceiver.send(i, bundle);
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString(GetUserMediaImpl.PERMISSIONS, GetUserMediaImpl.PERMISSION_SCREEN);
            bundle2.putInt(GetUserMediaImpl.GRANT_RESULTS, i2);
            bundle2.putParcelable(GetUserMediaImpl.PROJECTION_DATA, intent);
            this.resultReceiver.send(i, bundle2);
            finish();
        }

        @Override // android.app.Fragment
        public void onResume() {
            super.onResume();
            checkSelfPermissions(true);
        }

        public void requestStart(Activity activity, int i) {
            startActivityForResult(((MediaProjectionManager) activity.getSystemService("media_projection")).createScreenCaptureIntent(), i);
        }
    }

    public static class VideoCapturerInfoEx extends VideoCapturerInfo {
        public CameraEventsHandler cameraEventsHandler;
    }

    public GetUserMediaImpl(StateProvider stateProvider, Context context) {
        this.stateProvider = stateProvider;
        this.applicationContext = context;
    }

    private void addDefaultAudioConstraints(MediaConstraints mediaConstraints) {
        mediaConstraints.optional.add(new MediaConstraints.KeyValuePair("googNoiseSuppression", "true"));
        mediaConstraints.optional.add(new MediaConstraints.KeyValuePair("googEchoCancellation", "true"));
        mediaConstraints.optional.add(new MediaConstraints.KeyValuePair("echoCancellation", "true"));
        mediaConstraints.optional.add(new MediaConstraints.KeyValuePair("googEchoCancellation2", "true"));
        mediaConstraints.optional.add(new MediaConstraints.KeyValuePair("googDAEchoCancellation", "true"));
    }

    private Pair<String, VideoCapturer> createVideoCapturer(CameraEnumerator cameraEnumerator, boolean z, String str, CameraEventsHandler cameraEventsHandler) {
        String[] deviceNames = cameraEnumerator.getDeviceNames();
        if (str != null && !str.equals("")) {
            int length = deviceNames.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                String str2 = deviceNames[i];
                if (str2.equals(str)) {
                    CameraVideoCapturer createCapturer = cameraEnumerator.createCapturer(str2, cameraEventsHandler);
                    if (createCapturer != null) {
                        return new Pair<>(str2, createCapturer);
                    }
                } else {
                    i++;
                }
            }
        }
        String str3 = z ? "front" : "back";
        for (String str4 : deviceNames) {
            if (cameraEnumerator.isFrontFacing(str4) == z) {
                CameraVideoCapturer createCapturer2 = cameraEnumerator.createCapturer(str4, cameraEventsHandler);
                if (createCapturer2 != null) {
                    return new Pair<>(str4, createCapturer2);
                }
                Log.e("FlutterWebRTCPlugin", unr0.p("Create ", str3, " camera ", str4, " failed"));
            }
        }
        if (deviceNames.length > 0) {
            return new Pair<>(deviceNames[0], cameraEnumerator.createCapturer(deviceNames[0], cameraEventsHandler));
        }
        return null;
    }

    private Integer getConstrainInt(ConstraintsMap constraintsMap, String str) {
        if (constraintsMap == null) {
            return null;
        }
        ObjectType type = constraintsMap.getType(str);
        ObjectType objectType = ObjectType.Number;
        if (type == objectType) {
            try {
                return Integer.valueOf(constraintsMap.getInt(str));
            } catch (Exception unused) {
                return Integer.valueOf((int) Math.round(constraintsMap.getDouble(str)));
            }
        }
        if (constraintsMap.getType(str) == ObjectType.String) {
            try {
                return Integer.valueOf(Integer.parseInt(constraintsMap.getString(str)));
            } catch (Exception unused2) {
                return Integer.valueOf((int) Math.round(Double.parseDouble(constraintsMap.getString(str))));
            }
        }
        if (constraintsMap.getType(str) != ObjectType.Map) {
            return null;
        }
        ConstraintsMap map = constraintsMap.getMap(str);
        if (constraintsMap.getType("ideal") == objectType) {
            return Integer.valueOf(map.getInt("ideal"));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getDisplayMedia(da20 da20Var, MediaStream mediaStream, Intent intent) {
        OrientationAwareScreenCapturer orientationAwareScreenCapturer = new OrientationAwareScreenCapturer(intent, new MediaProjection.Callback() { // from class: com.cloudwebrtc.webrtc.GetUserMediaImpl.5
            @Override // android.media.projection.MediaProjection.Callback
            public void onStop() {
                super.onStop();
            }
        });
        PeerConnectionFactory peerConnectionFactory = this.stateProvider.getPeerConnectionFactory();
        VideoSource createVideoSource = peerConnectionFactory.createVideoSource(true);
        orientationAwareScreenCapturer.initialize(SurfaceTextureHelper.create(Thread.currentThread().getName() + "_texture_screen_thread", EglUtils.getRootEglBaseContext()), this.applicationContext, createVideoSource.getCapturerObserver());
        Display defaultDisplay = ((WindowManager) this.applicationContext.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        VideoCapturerInfoEx videoCapturerInfoEx = new VideoCapturerInfoEx();
        int i = point.x;
        videoCapturerInfoEx.width = i;
        int i2 = point.y;
        videoCapturerInfoEx.height = i2;
        videoCapturerInfoEx.fps = 30;
        videoCapturerInfoEx.isScreenCapture = true;
        videoCapturerInfoEx.capturer = orientationAwareScreenCapturer;
        orientationAwareScreenCapturer.startCapture(i, i2, 30);
        String nextTrackUUID = this.stateProvider.getNextTrackUUID();
        this.mVideoCapturers.put(nextTrackUUID, videoCapturerInfoEx);
        VideoTrack createVideoTrack = peerConnectionFactory.createVideoTrack(nextTrackUUID, createVideoSource);
        ConstraintsArray constraintsArray = new ConstraintsArray();
        ConstraintsArray constraintsArray2 = new ConstraintsArray();
        ConstraintsMap constraintsMap = new ConstraintsMap();
        if (createVideoTrack != null) {
            String id = createVideoTrack.id();
            LocalVideoTrack localVideoTrack = new LocalVideoTrack(createVideoTrack);
            createVideoSource.setVideoProcessor(localVideoTrack);
            this.stateProvider.putLocalTrack(id, localVideoTrack);
            ConstraintsMap constraintsMap2 = new ConstraintsMap();
            String kind = createVideoTrack.kind();
            constraintsMap2.putBoolean(BackendConfig.Restrictions.ENABLED, createVideoTrack.enabled());
            constraintsMap2.putString("id", id);
            constraintsMap2.putString("kind", kind);
            constraintsMap2.putString("label", kind);
            constraintsMap2.putString("readyState", createVideoTrack.state().toString());
            constraintsMap2.putBoolean("remote", false);
            constraintsArray2.pushMap(constraintsMap2);
            mediaStream.addTrack(createVideoTrack);
        }
        String id2 = mediaStream.getId();
        this.stateProvider.putLocalStream(id2, mediaStream);
        constraintsMap.putString("streamId", id2);
        constraintsMap.putArray("audioTracks", constraintsArray.toArrayList());
        constraintsMap.putArray("videoTracks", constraintsArray2.toArrayList());
        da20Var.success(constraintsMap.toMap());
    }

    private String getFacingMode(ConstraintsMap constraintsMap) {
        if (constraintsMap == null) {
            return null;
        }
        return constraintsMap.getString("facingMode");
    }

    private String getSourceIdConstraint(ConstraintsMap constraintsMap) {
        if (constraintsMap != null && constraintsMap.hasKey("deviceId")) {
            return constraintsMap.getString("deviceId");
        }
        if (constraintsMap == null || !constraintsMap.hasKey("optional") || constraintsMap.getType("optional") != ObjectType.Array) {
            return null;
        }
        ConstraintsArray array = constraintsMap.getArray("optional");
        int size = array.size();
        for (int i = 0; i < size; i++) {
            if (array.getType(i) == ObjectType.Map) {
                ConstraintsMap map = array.getMap(i);
                if (map.hasKey("sourceId") && map.getType("sourceId") == ObjectType.String) {
                    return map.getString("sourceId");
                }
            }
        }
        return null;
    }

    private ConstraintsMap getUserAudio(ConstraintsMap constraintsMap, MediaStream mediaStream) {
        String sourceIdConstraint;
        AudioSwitchManager.instance.start();
        MediaConstraints mediaConstraints = new MediaConstraints();
        if (constraintsMap.getType(MediaStreamTrack.AUDIO_TRACK_KIND) == ObjectType.Boolean) {
            addDefaultAudioConstraints(mediaConstraints);
            sourceIdConstraint = null;
        } else {
            mediaConstraints = MediaConstraintsUtils.parseMediaConstraints(constraintsMap.getMap(MediaStreamTrack.AUDIO_TRACK_KIND));
            sourceIdConstraint = getSourceIdConstraint(constraintsMap.getMap(MediaStreamTrack.AUDIO_TRACK_KIND));
        }
        Log.i("FlutterWebRTCPlugin", "getUserMedia(audio): " + mediaConstraints);
        String nextTrackUUID = this.stateProvider.getNextTrackUUID();
        PeerConnectionFactory peerConnectionFactory = this.stateProvider.getPeerConnectionFactory();
        AudioSource createAudioSource = peerConnectionFactory.createAudioSource(mediaConstraints);
        if (sourceIdConstraint != null) {
            try {
                setPreferredInputDevice(sourceIdConstraint);
            } catch (Exception e) {
                Log.e("FlutterWebRTCPlugin", "setPreferredInputDevice failed", e);
            }
        }
        AudioTrack createAudioTrack = peerConnectionFactory.createAudioTrack(nextTrackUUID, createAudioSource);
        mediaStream.addTrack(createAudioTrack);
        this.stateProvider.putLocalTrack(createAudioTrack.id(), new LocalAudioTrack(createAudioTrack));
        ConstraintsMap constraintsMap2 = new ConstraintsMap();
        constraintsMap2.putBoolean(BackendConfig.Restrictions.ENABLED, createAudioTrack.enabled());
        constraintsMap2.putString("id", createAudioTrack.id());
        constraintsMap2.putString("kind", MediaStreamTrack.AUDIO_TRACK_KIND);
        constraintsMap2.putString("label", createAudioTrack.id());
        constraintsMap2.putString("readyState", createAudioTrack.state().toString());
        constraintsMap2.putBoolean("remote", false);
        if (sourceIdConstraint == null) {
            sourceIdConstraint = "" + getPreferredInputDevice(this.preferredInput);
        }
        ConstraintsMap constraintsMap3 = new ConstraintsMap();
        constraintsMap3.putString("deviceId", sourceIdConstraint);
        constraintsMap3.putString("kind", "audioinput");
        constraintsMap3.putBoolean("autoGainControl", true);
        constraintsMap3.putBoolean("echoCancellation", true);
        constraintsMap3.putBoolean("noiseSuppression", true);
        constraintsMap3.putInt("channelCount", 1);
        constraintsMap3.putInt("latency", 0);
        constraintsMap2.putMap("settings", constraintsMap3.toMap());
        return constraintsMap2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        r8.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        r7 = r10.videoTracks.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        if (r7.hasNext() == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        r8 = r7.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (r8 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        r8.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
    
        resultError("getUserMedia", "Failed to create new track.", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0023, code lost:
    
        if (r8 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r2 != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
    
        r7 = r10.audioTracks.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002f, code lost:
    
        if (r7.hasNext() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        r8 = r7.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        if (r8 == null) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void getUserMedia(ConstraintsMap constraintsMap, da20 da20Var, MediaStream mediaStream, List<String> list) {
        ConstraintsMap[] constraintsMapArr = new ConstraintsMap[2];
        if (list.contains(PERMISSION_AUDIO)) {
            ConstraintsMap userAudio = getUserAudio(constraintsMap, mediaStream);
            constraintsMapArr[0] = userAudio;
        }
        if (list.contains(PERMISSION_VIDEO)) {
            ConstraintsMap userVideo = getUserVideo(constraintsMap, mediaStream);
            constraintsMapArr[1] = userVideo;
        }
        ConstraintsArray constraintsArray = new ConstraintsArray();
        ConstraintsArray constraintsArray2 = new ConstraintsArray();
        ConstraintsMap constraintsMap2 = new ConstraintsMap();
        for (int i = 0; i < 2; i++) {
            ConstraintsMap constraintsMap3 = constraintsMapArr[i];
            if (constraintsMap3 != null) {
                if (constraintsMap3.getString("kind").equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                    constraintsArray.pushMap(constraintsMap3);
                } else {
                    constraintsArray2.pushMap(constraintsMap3);
                }
            }
        }
        String id = mediaStream.getId();
        this.stateProvider.putLocalStream(id, mediaStream);
        constraintsMap2.putString("streamId", id);
        constraintsMap2.putArray("audioTracks", constraintsArray.toArrayList());
        constraintsMap2.putArray("videoTracks", constraintsArray2.toArrayList());
        da20Var.success(constraintsMap2.toMap());
    }

    private ConstraintsMap getUserVideo(ConstraintsMap constraintsMap, MediaStream mediaStream) {
        ConstraintsMap constraintsMap2;
        ConstraintsMap constraintsMap3;
        String str;
        Size size;
        ObjectType type = constraintsMap.getType(MediaStreamTrack.VIDEO_TRACK_KIND);
        ObjectType objectType = ObjectType.Map;
        if (type == objectType) {
            constraintsMap2 = constraintsMap.getMap(MediaStreamTrack.VIDEO_TRACK_KIND);
            constraintsMap3 = (constraintsMap2.hasKey("mandatory") && constraintsMap2.getType("mandatory") == objectType) ? constraintsMap2.getMap("mandatory") : null;
        } else {
            constraintsMap2 = null;
            constraintsMap3 = null;
        }
        Log.i("FlutterWebRTCPlugin", "getUserMedia(video): " + constraintsMap2);
        CameraEnumerator camera2Enumerator = Camera2Enumerator.isSupported(this.applicationContext) ? new Camera2Enumerator(this.applicationContext) : new Camera1Enumerator(false);
        String facingMode = getFacingMode(constraintsMap2);
        this.isFacing = facingMode == null || !facingMode.equals(WebViewActivity.KEY_ENVIRONMENT);
        String sourceIdConstraint = getSourceIdConstraint(constraintsMap2);
        CameraEventsHandler cameraEventsHandler = new CameraEventsHandler();
        Pair<String, VideoCapturer> createVideoCapturer = createVideoCapturer(camera2Enumerator, this.isFacing, sourceIdConstraint, cameraEventsHandler);
        if (createVideoCapturer == null) {
            return null;
        }
        String str2 = (String) createVideoCapturer.first;
        VideoCapturer videoCapturer = (VideoCapturer) createVideoCapturer.second;
        if (facingMode == null && camera2Enumerator.isFrontFacing(str2)) {
            facingMode = "user";
        } else if (facingMode == null && camera2Enumerator.isBackFacing(str2)) {
            facingMode = WebViewActivity.KEY_ENVIRONMENT;
        }
        PeerConnectionFactory peerConnectionFactory = this.stateProvider.getPeerConnectionFactory();
        VideoSource createVideoSource = peerConnectionFactory.createVideoSource(false);
        SurfaceTextureHelper create = SurfaceTextureHelper.create(Thread.currentThread().getName() + "_texture_camera_thread", EglUtils.getRootEglBaseContext());
        if (create == null) {
            Log.e("FlutterWebRTCPlugin", "surfaceTextureHelper is null");
            return null;
        }
        videoCapturer.initialize(create, this.applicationContext, createVideoSource.getCapturerObserver());
        VideoCapturerInfoEx videoCapturerInfoEx = new VideoCapturerInfoEx();
        Integer constrainInt = getConstrainInt(constraintsMap2, "width");
        int intValue = constrainInt != null ? constrainInt.intValue() : (constraintsMap3 == null || !constraintsMap3.hasKey("minWidth")) ? 1280 : constraintsMap3.getInt("minWidth");
        Integer constrainInt2 = getConstrainInt(constraintsMap2, "height");
        int intValue2 = constrainInt2 != null ? constrainInt2.intValue() : (constraintsMap3 == null || !constraintsMap3.hasKey("minHeight")) ? DEFAULT_HEIGHT : constraintsMap3.getInt("minHeight");
        String str3 = facingMode;
        Integer constrainInt3 = getConstrainInt(constraintsMap2, "frameRate");
        int intValue3 = constrainInt3 != null ? constrainInt3.intValue() : (constraintsMap3 == null || !constraintsMap3.hasKey("minFrameRate")) ? 30 : constraintsMap3.getInt("minFrameRate");
        videoCapturerInfoEx.width = intValue;
        videoCapturerInfoEx.height = intValue2;
        videoCapturerInfoEx.fps = intValue3;
        videoCapturerInfoEx.capturer = videoCapturer;
        videoCapturerInfoEx.cameraName = str2;
        if (videoCapturer instanceof Camera1Capturer) {
            size = Camera1Helper.findClosestCaptureFormat(Camera1Helper.getCameraId(str2), intValue, intValue2);
            str = "frameRate";
        } else if (videoCapturer instanceof Camera2Capturer) {
            str = "frameRate";
            size = Camera2Helper.findClosestCaptureFormat((CameraManager) this.applicationContext.getSystemService("camera"), str2, intValue, intValue2);
        } else {
            str = "frameRate";
            size = null;
        }
        if (size != null) {
            videoCapturerInfoEx.width = size.width;
            videoCapturerInfoEx.height = size.height;
        }
        videoCapturerInfoEx.cameraEventsHandler = cameraEventsHandler;
        videoCapturer.startCapture(intValue, intValue2, intValue3);
        cameraEventsHandler.waitForCameraOpen();
        String nextTrackUUID = this.stateProvider.getNextTrackUUID();
        this.mVideoCapturers.put(nextTrackUUID, videoCapturerInfoEx);
        this.mSurfaceTextureHelpers.put(nextTrackUUID, create);
        VideoTrack createVideoTrack = peerConnectionFactory.createVideoTrack(nextTrackUUID, createVideoSource);
        mediaStream.addTrack(createVideoTrack);
        LocalVideoTrack localVideoTrack = new LocalVideoTrack(createVideoTrack);
        createVideoSource.setVideoProcessor(localVideoTrack);
        this.stateProvider.putLocalTrack(createVideoTrack.id(), localVideoTrack);
        ConstraintsMap constraintsMap4 = new ConstraintsMap();
        constraintsMap4.putBoolean(BackendConfig.Restrictions.ENABLED, createVideoTrack.enabled());
        constraintsMap4.putString("id", createVideoTrack.id());
        constraintsMap4.putString("kind", MediaStreamTrack.VIDEO_TRACK_KIND);
        constraintsMap4.putString("label", createVideoTrack.id());
        constraintsMap4.putString("readyState", createVideoTrack.state().toString());
        constraintsMap4.putBoolean("remote", false);
        ConstraintsMap constraintsMap5 = new ConstraintsMap();
        constraintsMap5.putString("deviceId", str2);
        constraintsMap5.putString("kind", "videoinput");
        constraintsMap5.putInt("width", videoCapturerInfoEx.width);
        constraintsMap5.putInt("height", videoCapturerInfoEx.height);
        constraintsMap5.putInt(str, videoCapturerInfoEx.fps);
        if (str3 != null) {
            constraintsMap5.putString("facingMode", str3);
        }
        constraintsMap4.putMap("settings", constraintsMap5.toMap());
        return constraintsMap4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$requestPermissions$0(ArrayList arrayList, Callback callback, Callback callback2, String[] strArr, int[] iArr) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (iArr[i] == 0) {
                arrayList2.add(str);
            } else {
                arrayList3.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!arrayList2.contains((String) it.next())) {
                callback.invoke(arrayList3);
                return;
            }
        }
        callback2.invoke(arrayList2);
    }

    private void requestPermissions(ArrayList<String> arrayList, Callback callback, Callback callback2) {
        qft qftVar = new qft(arrayList, callback2, callback, 0);
        PermissionUtils.requestPermissions(this.stateProvider.getApplicationContext(), this.stateProvider.getActivity(), (String[]) arrayList.toArray(new String[arrayList.size()]), qftVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void resultError(String str, String str2, da20 da20Var) {
        da20Var.error(str, g8e.p(str, "(): ", str2), null);
    }

    public VideoCapturerInfoEx getCapturerInfo(String str) {
        return this.mVideoCapturers.get(str);
    }

    public int getPreferredInputDevice(AudioDeviceInfo audioDeviceInfo) {
        if (audioDeviceInfo == null) {
            return -1;
        }
        AudioDeviceInfo[] devices = ((AudioManager) this.applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)).getDevices(1);
        for (int i = 0; i < devices.length; i++) {
            if (devices[i].getId() == audioDeviceInfo.getId()) {
                return i;
            }
        }
        return -1;
    }

    public void reStartCamera(IsCameraEnabled isCameraEnabled) {
        for (Map.Entry<String, VideoCapturerInfoEx> entry : this.mVideoCapturers.entrySet()) {
            if (!entry.getValue().isScreenCapture && isCameraEnabled.isEnabled(entry.getKey())) {
                entry.getValue().capturer.startCapture(entry.getValue().width, entry.getValue().height, entry.getValue().fps);
            }
        }
    }

    public void removeVideoCapturer(String str) {
        VideoCapturerInfoEx videoCapturerInfoEx = this.mVideoCapturers.get(str);
        try {
            if (videoCapturerInfoEx != null) {
                try {
                    videoCapturerInfoEx.capturer.stopCapture();
                    CameraEventsHandler cameraEventsHandler = videoCapturerInfoEx.cameraEventsHandler;
                    if (cameraEventsHandler != null) {
                        cameraEventsHandler.waitForCameraClosed();
                    }
                    videoCapturerInfoEx.capturer.dispose();
                    this.mVideoCapturers.remove(str);
                    SurfaceTextureHelper surfaceTextureHelper = this.mSurfaceTextureHelpers.get(str);
                    if (surfaceTextureHelper != null) {
                        surfaceTextureHelper.stopListening();
                        surfaceTextureHelper.dispose();
                        this.mSurfaceTextureHelpers.remove(str);
                    }
                } catch (InterruptedException unused) {
                    Log.e("FlutterWebRTCPlugin", "removeVideoCapturer() Failed to stop video capturer");
                    videoCapturerInfoEx.capturer.dispose();
                    this.mVideoCapturers.remove(str);
                    SurfaceTextureHelper surfaceTextureHelper2 = this.mSurfaceTextureHelpers.get(str);
                    if (surfaceTextureHelper2 != null) {
                        surfaceTextureHelper2.stopListening();
                        surfaceTextureHelper2.dispose();
                        this.mSurfaceTextureHelpers.remove(str);
                    }
                }
            }
        } catch (Throwable th) {
            videoCapturerInfoEx.capturer.dispose();
            this.mVideoCapturers.remove(str);
            SurfaceTextureHelper surfaceTextureHelper3 = this.mSurfaceTextureHelpers.get(str);
            if (surfaceTextureHelper3 != null) {
                surfaceTextureHelper3.stopListening();
                surfaceTextureHelper3.dispose();
                this.mSurfaceTextureHelpers.remove(str);
            }
            throw th;
        }
    }

    public void requestCapturePermission(final da20 da20Var) {
        screenRequestPermissions(new ResultReceiver(new Handler(Looper.getMainLooper())) { // from class: com.cloudwebrtc.webrtc.GetUserMediaImpl.1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle bundle) {
                if (bundle.getInt(GetUserMediaImpl.GRANT_RESULTS) != -1) {
                    da20Var.success(Boolean.FALSE);
                    return;
                }
                GetUserMediaImpl.this.mediaProjectionData = (Intent) bundle.getParcelable(GetUserMediaImpl.PROJECTION_DATA);
                da20Var.success(Boolean.TRUE);
            }
        });
    }

    public void screenRequestPermissions(ResultReceiver resultReceiver) {
        this.mediaProjectionData = null;
        Activity activity = this.stateProvider.getActivity();
        if (activity == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable(RESULT_RECEIVER, resultReceiver);
        bundle.putInt(REQUEST_CODE, 1);
        ScreenRequestPermissionsFragment screenRequestPermissionsFragment = new ScreenRequestPermissionsFragment();
        screenRequestPermissionsFragment.setArguments(bundle);
        try {
            activity.getFragmentManager().beginTransaction().add(screenRequestPermissionsFragment, ScreenRequestPermissionsFragment.class.getName()).commit();
        } catch (IllegalStateException unused) {
        }
    }

    public void setPreferredInputDevice(String str) {
        AudioDeviceInfo[] devices = ((AudioManager) this.applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)).getDevices(1);
        if (devices.length > 0) {
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (str.equals(AudioUtils.getAudioDeviceId(audioDeviceInfo))) {
                    this.preferredInput = audioDeviceInfo;
                    this.audioDeviceModule.setPreferredInputDevice(audioDeviceInfo);
                    return;
                }
            }
        }
    }

    public void startRecordingToFile(String str, Integer num, VideoTrack videoTrack, AudioChannel audioChannel) throws Exception {
        AudioSamplesInterceptor audioSamplesInterceptor;
        if (audioChannel == AudioChannel.INPUT) {
            audioSamplesInterceptor = this.inputSamplesInterceptor;
        } else if (audioChannel == AudioChannel.OUTPUT) {
            if (this.outputSamplesInterceptor == null) {
                this.outputSamplesInterceptor = new OutputAudioSamplesInterceptor(this.audioDeviceModule);
            }
            audioSamplesInterceptor = this.outputSamplesInterceptor;
        } else {
            audioSamplesInterceptor = null;
        }
        MediaRecorderImpl mediaRecorderImpl = new MediaRecorderImpl(num, videoTrack, audioSamplesInterceptor);
        mediaRecorderImpl.startRecording(new File(str));
        this.mediaRecorders.append(num.intValue(), mediaRecorderImpl);
    }

    public void stopRecording(Integer num) {
        MediaRecorderImpl mediaRecorderImpl = this.mediaRecorders.get(num.intValue());
        if (mediaRecorderImpl != null) {
            mediaRecorderImpl.stopRecording();
            this.mediaRecorders.remove(num.intValue());
            File recordFile = mediaRecorderImpl.getRecordFile();
            if (recordFile != null) {
                ContentValues contentValues = new ContentValues(3);
                contentValues.put("title", recordFile.getName());
                contentValues.put("mime_type", "video/mp4");
                contentValues.put("_data", recordFile.getAbsolutePath());
                this.applicationContext.getContentResolver().insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
            }
        }
    }

    public void switchCamera(final String str, final da20 da20Var) {
        VideoCapturer videoCapturer = this.mVideoCapturers.get(str).capturer;
        if (videoCapturer == null) {
            resultError("switchCamera", g8e.o("Video capturer not found for id: ", str), da20Var);
            return;
        }
        CameraEnumerator camera2Enumerator = Camera2Enumerator.isSupported(this.applicationContext) ? new Camera2Enumerator(this.applicationContext) : new Camera1Enumerator(false);
        for (String str2 : camera2Enumerator.getDeviceNames()) {
            if (camera2Enumerator.isFrontFacing(str2) == (!this.isFacing)) {
                ((CameraVideoCapturer) videoCapturer).switchCamera(new CameraVideoCapturer.CameraSwitchHandler() { // from class: com.cloudwebrtc.webrtc.GetUserMediaImpl.6
                    @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
                    public void onCameraSwitchDone(boolean z) {
                        GetUserMediaImpl.this.isFacing = !r0.isFacing;
                        da20Var.success(Boolean.valueOf(z));
                    }

                    @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
                    public void onCameraSwitchError(String str3) {
                        GetUserMediaImpl.resultError("switchCamera", "Switching camera failed: " + str, da20Var);
                    }
                }, str2);
                return;
            }
        }
        resultError("switchCamera", g8e.o("Switching camera failed: ", str), da20Var);
    }

    public void getUserMedia(final ConstraintsMap constraintsMap, final da20 da20Var, final MediaStream mediaStream) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (constraintsMap.hasKey(MediaStreamTrack.AUDIO_TRACK_KIND)) {
            int i = AnonymousClass7.$SwitchMap$com$cloudwebrtc$webrtc$utils$ObjectType[constraintsMap.getType(MediaStreamTrack.AUDIO_TRACK_KIND).ordinal()];
            if (i != 1) {
                if (i == 2) {
                    arrayList.add(PERMISSION_AUDIO);
                }
            } else if (constraintsMap.getBoolean(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                arrayList.add(PERMISSION_AUDIO);
            }
        }
        if (constraintsMap.hasKey(MediaStreamTrack.VIDEO_TRACK_KIND)) {
            int i2 = AnonymousClass7.$SwitchMap$com$cloudwebrtc$webrtc$utils$ObjectType[constraintsMap.getType(MediaStreamTrack.VIDEO_TRACK_KIND).ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    arrayList.add(PERMISSION_VIDEO);
                }
            } else if (constraintsMap.getBoolean(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                arrayList.add(PERMISSION_VIDEO);
            }
        }
        if (arrayList.isEmpty()) {
            resultError("getUserMedia", "TypeError, constraints requests no media types", da20Var);
        } else {
            requestPermissions(arrayList, new Callback() { // from class: com.cloudwebrtc.webrtc.GetUserMediaImpl.2
                @Override // com.cloudwebrtc.webrtc.utils.Callback
                public void invoke(Object... objArr) {
                    GetUserMediaImpl.this.getUserMedia(constraintsMap, da20Var, mediaStream, (List) objArr[0]);
                }
            }, new Callback() { // from class: com.cloudwebrtc.webrtc.GetUserMediaImpl.3
                @Override // com.cloudwebrtc.webrtc.utils.Callback
                public void invoke(Object... objArr) {
                    GetUserMediaImpl.resultError("getUserMedia", "DOMException, NotAllowedError", da20Var);
                }
            });
        }
    }

    public void getDisplayMedia(ConstraintsMap constraintsMap, final da20 da20Var, final MediaStream mediaStream) {
        Intent intent = this.mediaProjectionData;
        if (intent == null) {
            screenRequestPermissions(new ResultReceiver(new Handler(Looper.getMainLooper())) { // from class: com.cloudwebrtc.webrtc.GetUserMediaImpl.4
                @Override // android.os.ResultReceiver
                public void onReceiveResult(int i, Bundle bundle) {
                    Intent intent2 = (Intent) bundle.getParcelable(GetUserMediaImpl.PROJECTION_DATA);
                    if (bundle.getInt(GetUserMediaImpl.GRANT_RESULTS) != -1) {
                        GetUserMediaImpl.resultError("screenRequestPermissions", "User didn't give permission to capture the screen.", da20Var);
                    } else {
                        GetUserMediaImpl.this.getDisplayMedia(da20Var, mediaStream, intent2);
                    }
                }
            });
        } else {
            getDisplayMedia(da20Var, mediaStream, intent);
        }
    }
}
