package com.google.ar.core;

import android.content.Context;
import android.net.Uri;
import com.google.ar.core.Anchor;
import com.google.ar.core.Config;
import com.google.ar.core.HostCloudAnchorFuture;
import com.google.ar.core.ResolveCloudAnchorFuture;
import com.google.ar.core.VpsAvailabilityFuture;
import com.google.ar.core.exceptions.CameraNotAvailableException;
import com.google.ar.core.exceptions.PlaybackFailedException;
import com.google.ar.core.exceptions.RecordingFailedException;
import com.google.ar.core.exceptions.UnavailableApkTooOldException;
import com.google.ar.core.exceptions.UnavailableArcoreNotInstalledException;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableSdkTooOldException;
import defpackage.ny61;
import defpackage.unr0;
import defpackage.w511;
import defpackage.yx61;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* loaded from: classes11.dex */
public class Session {
    private static final String TAG = "ARCore-Session";
    final a0 faceCache;
    final long nativeSymbolTableHandle;
    long nativeWrapperHandle;
    private SharedCamera sharedCamera;

    public enum Feature {
        FRONT_CAMERA(1),
        SHARED_CAMERA(1000);

        final int nativeCode;

        Feature(int i) {
            this.nativeCode = i;
        }
    }

    public enum FeatureMapQuality {
        INSUFFICIENT(0),
        SUFFICIENT(1),
        GOOD(2);

        final int nativeCode;

        FeatureMapQuality(int i) {
            this.nativeCode = i;
        }

        public static FeatureMapQuality forNumber(int i) {
            for (FeatureMapQuality featureMapQuality : values()) {
                if (featureMapQuality.nativeCode == i) {
                    return featureMapQuality;
                }
            }
            yx61.f(a0.a((byte) 53, i, "Unexpected value for native FeatureMapQuality, value="));
            return null;
        }
    }

    public Session(Context context, Set<Feature> set) throws UnavailableArcoreNotInstalledException, UnavailableApkTooOldException, UnavailableSdkTooOldException, UnavailableDeviceNotCompatibleException, IllegalArgumentException {
        this.faceCache = new a0();
        this.sharedCamera = null;
        System.loadLibrary("arcore_sdk_jni");
        int[] iArr = new int[set.size() + 1];
        Iterator<Feature> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().nativeCode;
            i++;
        }
        iArr[i] = 0;
        long nativeCreateSessionAndWrapperWithFeatures = nativeCreateSessionAndWrapperWithFeatures(context, iArr);
        this.nativeWrapperHandle = nativeCreateSessionAndWrapperWithFeatures;
        this.nativeSymbolTableHandle = nativeGetSymbolTable(nativeCreateSessionAndWrapperWithFeatures);
        if (set.contains(Feature.SHARED_CAMERA)) {
            this.sharedCamera = new SharedCamera(this);
        }
        loadDynamicSymbolsAfterSessionCreate();
    }

    @Deprecated
    public static Session createForSharedCamera(Context context) throws UnavailableArcoreNotInstalledException, UnavailableApkTooOldException, UnavailableSdkTooOldException, UnavailableDeviceNotCompatibleException {
        return new Session(context, EnumSet.of(Feature.SHARED_CAMERA));
    }

    public static ByteBuffer directByteBufferOrDefault(ByteBuffer byteBuffer) {
        return byteBuffer == null ? ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder()) : byteBuffer.order(ByteOrder.nativeOrder());
    }

    public static void loadDynamicSymbolsAfterSessionCreate() {
        ArImage.nativeLoadSymbols();
        ImageMetadata.nativeLoadSymbols();
    }

    private native long[] nativeAcquireAllAnchors(long j);

    private native long nativeAcquireEarth(long j);

    private native int nativeCheckModuleAvailability(long j, int i);

    private native void nativeCloseSession(long j);

    private native void nativeConfigure(long j, long j2);

    private native long nativeCreateAnchor(long j, Pose pose);

    private static native long nativeCreateSessionAndWrapperWithFeatures(Context context, int[] iArr) throws UnavailableArcoreNotInstalledException, UnavailableApkTooOldException, UnavailableSdkTooOldException, UnavailableDeviceNotCompatibleException;

    public static native long nativeCreateSessionWrapperFromHandle(long j, long j2);

    private native int nativeEstimateFeatureMapQualityForHosting(long j, Pose pose);

    private native long nativeGetCameraConfig(long j);

    private native void nativeGetConfig(long j, long j2);

    private native int nativeGetPlaybackStatus(long j);

    private native void nativeGetRandomAccessStats(long j, long j2);

    private native int nativeGetRecordingStatus(long j);

    private native long[] nativeGetSupportedCameraConfigs(long j);

    private native long[] nativeGetSupportedCameraConfigsWithFilter(long j, long j2);

    private native long nativeGetSymbolTable(long j);

    private native long nativeHostCloudAnchor(long j, long j2);

    private native long[] nativeHostCloudAnchorAsync(long j, long j2, int i, HostCloudAnchorFuture.CallbackWrapper callbackWrapper);

    private native long nativeHostCloudAnchorWithTtl(long j, long j2, int i);

    private native boolean nativeIsSupported(long j, long j2);

    private native void nativePause(long j);

    private native void nativeRequestModuleInstallDeferred(long j, int[] iArr);

    private native void nativeRequestModuleInstallImmediate(long j, int[] iArr);

    private native long nativeResolveCloudAnchor(long j, String str);

    private native long[] nativeResolveCloudAnchorAsync(long j, String str, ResolveCloudAnchorFuture.CallbackWrapper callbackWrapper);

    private native void nativeResume(long j);

    private native int nativeSetCameraConfig(long j, long j2);

    private native void nativeSetCameraTextureName(long j, int i);

    private native void nativeSetCameraTextureNames(long j, int[] iArr);

    private native void nativeSetDisplayGeometry(long j, int i, int i2, int i3);

    private native void nativeSetPlaybackDataset(long j, String str);

    private native void nativeSetPlaybackDatasetUri(long j, String str);

    private native void nativeStartRecording(long j, long j2);

    private native void nativeStopRecording(long j);

    private native void nativeUpdate(long j, long j2);

    private void pauseSharedCameraIfInUse() {
        SharedCamera sharedCamera = this.sharedCamera;
        if (sharedCamera != null) {
            sharedCamera.pause();
        }
    }

    public static void throwExceptionFromArStatus(String str, int i, String[] strArr, int[] iArr) throws Exception {
        int i2;
        for (ah ahVar : ah.values()) {
            if (ahVar.G == i) {
                Class cls = ahVar.H;
                if (cls == null) {
                    return;
                }
                if (strArr == null || iArr == null || (i2 = strArr.length) != iArr.length) {
                    i2 = 0;
                }
                String str2 = ahVar.I;
                if (str2 == null && str == null) {
                    throw ((Exception) cls.getConstructor(null).newInstance(null));
                }
                if (str2 != null) {
                    str = str == null ? str2 : str2.concat(str);
                }
                Exception exc = (Exception) ahVar.H.getConstructor(String.class).newInstance(str);
                StackTraceElement[] stackTrace = exc.getStackTrace();
                StackTraceElement[] stackTraceElementArr = new StackTraceElement[stackTrace.length + i2];
                int i3 = 0;
                while (i3 < i2) {
                    stackTraceElementArr[i3] = new StackTraceElement("ARCore", "native", strArr[i3], iArr[i3]);
                    i3++;
                }
                for (StackTraceElement stackTraceElement : stackTrace) {
                    stackTraceElementArr[i3] = stackTraceElement;
                    i3++;
                }
                exc.setStackTrace(stackTraceElementArr);
                throw exc;
            }
        }
        yx61.f(unr0.m(i, "Unexpected error code: ", new StringBuilder(String.valueOf(i).length() + 23)));
    }

    public VpsAvailabilityFuture checkVpsAvailabilityAsync(double d, double d2, Consumer<VpsAvailability> consumer) {
        long[] nativeCheckVpsAvailabilityAsync = nativeCheckVpsAvailabilityAsync(this.nativeWrapperHandle, d, d2, consumer != null ? new VpsAvailabilityFuture.CallbackWrapper(consumer) : null);
        return new VpsAvailabilityFuture(this, nativeCheckVpsAvailabilityAsync[0], nativeCheckVpsAvailabilityAsync[1]);
    }

    public void close() {
        nativeCloseSession(this.nativeWrapperHandle);
    }

    public void configure(Config config) {
        nativeConfigure(this.nativeWrapperHandle, config.nativeHandle);
    }

    public Collection<Anchor> convertNativeAnchorsToCollection(long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(new Anchor(j, this));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public List<CameraConfig> convertNativeCameraConfigsToCollection(long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(new CameraConfig(this, j));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Collection<TrackData> convertNativeTrackDataToCollection(long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(new TrackData(j, this));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public <T extends Trackable> Collection<T> convertNativeTrackablesToCollection(Class<T> cls, long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            Trackable createTrackable = createTrackable(j);
            if (createTrackable != null) {
                arrayList.add(cls.cast(createTrackable));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Anchor createAnchor(Pose pose) {
        return new Anchor(nativeCreateAnchor(this.nativeWrapperHandle, pose), this);
    }

    public Trackable createTrackable(long j) {
        ai aiVar;
        int internalGetType = TrackableBase.internalGetType(this.nativeWrapperHandle, j);
        ai[] values = ai.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                aiVar = null;
                break;
            }
            aiVar = values[i];
            if (aiVar.k == internalGetType) {
                break;
            }
            i++;
        }
        if (aiVar == null) {
            TrackableBase.internalReleaseNativeHandle(this.nativeSymbolTableHandle, j);
            return null;
        }
        switch (aiVar.ordinal()) {
            case 0:
            case 1:
                return null;
            case 2:
                return new Plane(j, this);
            case 3:
                return new Point(j, this);
            case 4:
                return new AugmentedImage(j, this);
            case 5:
                a0 a0Var = this.faceCache;
                synchronized (a0Var) {
                    Map map = a0Var.a;
                    Long valueOf = Long.valueOf(j);
                    AugmentedFace augmentedFace = (AugmentedFace) ((LinkedHashMap) map).get(valueOf);
                    if (augmentedFace != null) {
                        return augmentedFace;
                    }
                    AugmentedFace augmentedFace2 = new AugmentedFace(j, this);
                    ((HashMap) a0Var.a).put(valueOf, augmentedFace2);
                    return augmentedFace2;
                }
            case 6:
                return new StreetscapeGeometry(j, this);
            case 7:
                return getEarth();
            case 8:
                return new DepthPoint(j, this);
            case 9:
                return new InstantPlacementPoint(j, this);
            default:
                throw null;
        }
    }

    public FeatureMapQuality estimateFeatureMapQualityForHosting(Pose pose) {
        return FeatureMapQuality.forNumber(nativeEstimateFeatureMapQualityForHosting(this.nativeWrapperHandle, pose));
    }

    public void finalize() throws Throwable {
        long j = this.nativeWrapperHandle;
        if (j != 0) {
            nativeDestroySessionWrapper(j);
            this.nativeWrapperHandle = 0L;
        }
        super.finalize();
    }

    public Collection<Anchor> getAllAnchors() {
        return convertNativeAnchorsToCollection(nativeAcquireAllAnchors(this.nativeWrapperHandle));
    }

    public <T extends Trackable> Collection<T> getAllTrackables(Class<T> cls) {
        ai a = ai.a(cls);
        return a == ai.b ? Collections.EMPTY_LIST : convertNativeTrackablesToCollection(cls, nativeAcquireAllTrackables(this.nativeWrapperHandle, a.k));
    }

    public CameraConfig getCameraConfig() {
        return new CameraConfig(this, nativeGetCameraConfig(this.nativeWrapperHandle));
    }

    public Config getConfig() {
        Config config = new Config(this);
        getConfig(config);
        return config;
    }

    public Earth getEarth() {
        long nativeAcquireEarth = nativeAcquireEarth(this.nativeWrapperHandle);
        if (nativeAcquireEarth != 0) {
            return new Earth(nativeAcquireEarth, this);
        }
        return null;
    }

    public PlaybackStatus getPlaybackStatus() {
        return PlaybackStatus.forNumber(nativeGetPlaybackStatus(this.nativeWrapperHandle));
    }

    public RecordingStatus getRecordingStatus() {
        return RecordingStatus.forNumber(nativeGetRecordingStatus(this.nativeWrapperHandle));
    }

    public SharedCamera getSharedCamera() {
        SharedCamera sharedCamera = this.sharedCamera;
        if (sharedCamera != null) {
            return sharedCamera;
        }
        ny61.r("Shared camera is not in use, please create session using new Session(context, EnumSet.of(Session.Feature.SHARED_CAMERA)).");
        return null;
    }

    public List<CameraConfig> getSupportedCameraConfigs(CameraConfigFilter cameraConfigFilter) {
        if (cameraConfigFilter == null) {
            w511.q();
            return null;
        }
        long[] nativeGetSupportedCameraConfigsWithFilter = nativeGetSupportedCameraConfigsWithFilter(this.nativeWrapperHandle, cameraConfigFilter.nativeHandle);
        ArrayList arrayList = new ArrayList(nativeGetSupportedCameraConfigsWithFilter.length);
        for (long j : nativeGetSupportedCameraConfigsWithFilter) {
            arrayList.add(new CameraConfig(this, j));
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Deprecated
    public Anchor hostCloudAnchor(Anchor anchor) {
        return new Anchor(nativeHostCloudAnchor(this.nativeWrapperHandle, anchor.nativeHandle), this);
    }

    public HostCloudAnchorFuture hostCloudAnchorAsync(Anchor anchor, int i, BiConsumer<String, Anchor.CloudAnchorState> biConsumer) {
        long[] nativeHostCloudAnchorAsync = nativeHostCloudAnchorAsync(this.nativeWrapperHandle, anchor.nativeHandle, i, biConsumer != null ? new HostCloudAnchorFuture.CallbackWrapper(biConsumer) : null);
        return new HostCloudAnchorFuture(this, nativeHostCloudAnchorAsync[0], nativeHostCloudAnchorAsync[1]);
    }

    @Deprecated
    public Anchor hostCloudAnchorWithTtl(Anchor anchor, int i) {
        return new Anchor(nativeHostCloudAnchorWithTtl(this.nativeWrapperHandle, anchor.nativeHandle, i), this);
    }

    public boolean isDepthModeSupported(Config.DepthMode depthMode) {
        return nativeIsDepthModeSupported(this.nativeWrapperHandle, depthMode.nativeCode);
    }

    public boolean isGeospatialModeSupported(Config.GeospatialMode geospatialMode) {
        return nativeIsGeospatialModeSupported(this.nativeWrapperHandle, geospatialMode.nativeCode);
    }

    public boolean isImageStabilizationModeSupported(Config.ImageStabilizationMode imageStabilizationMode) {
        return nativeIsImageStabilizationModeSupported(this.nativeWrapperHandle, imageStabilizationMode.nativeCode);
    }

    public boolean isSemanticModeSupported(Config.SemanticMode semanticMode) {
        return nativeIsSemanticModeSupported(this.nativeWrapperHandle, semanticMode.nativeCode);
    }

    public boolean isSharedCameraUsed() {
        return this.sharedCamera != null;
    }

    @Deprecated
    public boolean isSupported(Config config) {
        return nativeIsSupported(this.nativeWrapperHandle, config.nativeHandle);
    }

    public native long[] nativeAcquireAllTrackables(long j, int i);

    public native long[] nativeCheckVpsAvailabilityAsync(long j, double d, double d2, VpsAvailabilityFuture.CallbackWrapper callbackWrapper);

    public native void nativeDestroySessionWrapper(long j);

    public native long nativeGetSessionNativeHandle(long j);

    public native boolean nativeIsDepthModeSupported(long j, int i);

    public native boolean nativeIsGeospatialModeSupported(long j, int i);

    public native boolean nativeIsImageStabilizationModeSupported(long j, int i);

    public native boolean nativeIsSemanticModeSupported(long j, int i);

    public native long nativeReleaseSessionOwnership(long j);

    public void pause() {
        pauseSharedCameraIfInUse();
        nativePause(this.nativeWrapperHandle);
    }

    @Deprecated
    public Anchor resolveCloudAnchor(String str) {
        return new Anchor(nativeResolveCloudAnchor(this.nativeWrapperHandle, str), this);
    }

    public ResolveCloudAnchorFuture resolveCloudAnchorAsync(String str, BiConsumer<Anchor, Anchor.CloudAnchorState> biConsumer) {
        long[] nativeResolveCloudAnchorAsync = nativeResolveCloudAnchorAsync(this.nativeWrapperHandle, str, biConsumer != null ? new ResolveCloudAnchorFuture.CallbackWrapper(this, biConsumer) : null);
        return new ResolveCloudAnchorFuture(this, nativeResolveCloudAnchorAsync[0], nativeResolveCloudAnchorAsync[1]);
    }

    public void resume() throws CameraNotAvailableException {
        nativeResume(this.nativeWrapperHandle);
    }

    public void setCameraConfig(CameraConfig cameraConfig) {
        nativeSetCameraConfig(this.nativeWrapperHandle, cameraConfig.nativeHandle);
    }

    public void setCameraTextureName(int i) {
        nativeSetCameraTextureName(this.nativeWrapperHandle, i);
    }

    public void setCameraTextureNames(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            ny61.g("textureIds must be an array with at least 1 entry.");
        } else {
            nativeSetCameraTextureNames(this.nativeWrapperHandle, iArr);
        }
    }

    public void setDisplayGeometry(int i, int i2, int i3) {
        nativeSetDisplayGeometry(this.nativeWrapperHandle, i, i2, i3);
    }

    @Deprecated
    public void setPlaybackDataset(String str) throws PlaybackFailedException {
        nativeSetPlaybackDataset(this.nativeWrapperHandle, str);
    }

    public void setPlaybackDatasetUri(Uri uri) throws PlaybackFailedException {
        nativeSetPlaybackDatasetUri(this.nativeWrapperHandle, uri.toString());
    }

    public void startRecording(RecordingConfig recordingConfig) throws RecordingFailedException {
        if (recordingConfig != null) {
            nativeStartRecording(this.nativeWrapperHandle, recordingConfig.nativeHandle);
        } else {
            w511.q();
        }
    }

    public void stopRecording() throws RecordingFailedException {
        nativeStopRecording(this.nativeWrapperHandle);
    }

    public Frame update() throws CameraNotAvailableException {
        Frame frame = new Frame(this);
        nativeUpdate(this.nativeWrapperHandle, frame.nativeHandle);
        return frame;
    }

    public void getConfig(Config config) {
        nativeGetConfig(this.nativeWrapperHandle, config.nativeHandle);
    }

    @Deprecated
    public List<CameraConfig> getSupportedCameraConfigs() {
        return convertNativeCameraConfigsToCollection(nativeGetSupportedCameraConfigs(this.nativeWrapperHandle));
    }

    public Session(long j) {
        this.faceCache = new a0();
        this.sharedCamera = null;
        this.nativeWrapperHandle = j;
        this.nativeSymbolTableHandle = nativeGetSymbolTable(j);
    }

    public Session(Context context) throws UnavailableArcoreNotInstalledException, UnavailableApkTooOldException, UnavailableSdkTooOldException, UnavailableDeviceNotCompatibleException {
        this(context, EnumSet.noneOf(Feature.class));
    }

    public Session() {
        this.faceCache = new a0();
        this.sharedCamera = null;
        this.nativeWrapperHandle = 0L;
        this.nativeSymbolTableHandle = 0L;
    }

    public static void throwExceptionFromArStatus(int i) throws Exception {
        throwExceptionFromArStatus(null, i, null, null);
    }
}
