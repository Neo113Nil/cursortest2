package com.google.ar.core;

import defpackage.yx61;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes11.dex */
public class Config {
    private static final String TAG = "ARCore-Config";
    long nativeHandle;
    final long nativeSymbolTableHandle;
    final Session session;

    public enum AugmentedFaceMode {
        DISABLED(0),
        MESH3D(2);

        final int nativeCode;

        AugmentedFaceMode(int i) {
            this.nativeCode = i;
        }

        public static AugmentedFaceMode forNumber(int i) {
            for (AugmentedFaceMode augmentedFaceMode : values()) {
                if (augmentedFaceMode.nativeCode == i) {
                    return augmentedFaceMode;
                }
            }
            yx61.f(a0.a((byte) 53, i, "Unexpected value for native AugmentedFaceMode, value="));
            return null;
        }
    }

    public enum CloudAnchorMode {
        DISABLED(0),
        ENABLED(1);

        final int nativeCode;

        CloudAnchorMode(int i) {
            this.nativeCode = i;
        }

        public static CloudAnchorMode forNumber(int i) {
            for (CloudAnchorMode cloudAnchorMode : values()) {
                if (cloudAnchorMode.nativeCode == i) {
                    return cloudAnchorMode;
                }
            }
            yx61.f(a0.a((byte) 53, i, "Unexpected value for native AnchorHostingMode, value="));
            return null;
        }
    }

    public enum DepthMode {
        DISABLED(0),
        AUTOMATIC(1),
        RAW_DEPTH_ONLY(3);

        final int nativeCode;

        DepthMode(int i) {
            this.nativeCode = i;
        }

        public static DepthMode forNumber(int i) {
            for (DepthMode depthMode : values()) {
                if (depthMode.nativeCode == i) {
                    return depthMode;
                }
            }
            yx61.f(a0.a(Alerts.alert_certificate_expired, i, "Unexpected value for native DepthMode, value="));
            return null;
        }
    }

    public enum FlashMode {
        OFF(0),
        TORCH(2);

        final int nativeCode;

        FlashMode(int i) {
            this.nativeCode = i;
        }

        public static FlashMode forNumber(int i) {
            for (FlashMode flashMode : values()) {
                if (flashMode.nativeCode == i) {
                    return flashMode;
                }
            }
            yx61.f(a0.a(Alerts.alert_certificate_expired, i, "Unexpected value for native FlashMode, value="));
            return null;
        }
    }

    public enum FocusMode {
        FIXED(0),
        AUTO(1);

        final int nativeCode;

        FocusMode(int i) {
            this.nativeCode = i;
        }

        public static FocusMode forNumber(int i) {
            for (FocusMode focusMode : values()) {
                if (focusMode.nativeCode == i) {
                    return focusMode;
                }
            }
            yx61.f(a0.a(Alerts.alert_certificate_expired, i, "Unexpected value for native FocusMode, value="));
            return null;
        }
    }

    public enum GeospatialMode {
        DISABLED(0),
        ENABLED(2);

        final int nativeCode;

        GeospatialMode(int i) {
            this.nativeCode = i;
        }

        public static GeospatialMode forNumber(int i) {
            for (GeospatialMode geospatialMode : values()) {
                if (geospatialMode.nativeCode == i) {
                    return geospatialMode;
                }
            }
            yx61.f(a0.a(Alerts.alert_decode_error, i, "Unexpected value for native GeospatialMode, value="));
            return null;
        }
    }

    public enum ImageStabilizationMode {
        OFF(0),
        EIS(1);

        final int nativeCode;

        ImageStabilizationMode(int i) {
            this.nativeCode = i;
        }

        public static ImageStabilizationMode forNumber(int i) {
            for (ImageStabilizationMode imageStabilizationMode : values()) {
                if (imageStabilizationMode.nativeCode == i) {
                    return imageStabilizationMode;
                }
            }
            yx61.f(a0.a((byte) 58, i, "Unexpected value for native ImageStabilizationMode, value="));
            return null;
        }
    }

    public enum InstantPlacementMode {
        DISABLED(0),
        LOCAL_Y_UP(2);

        final int nativeCode;

        InstantPlacementMode(int i) {
            this.nativeCode = i;
        }

        public static InstantPlacementMode forNumber(int i) {
            for (InstantPlacementMode instantPlacementMode : values()) {
                if (instantPlacementMode.nativeCode == i) {
                    return instantPlacementMode;
                }
            }
            yx61.f(a0.a((byte) 56, i, "Unexpected value for native InstantPlacementMode, value="));
            return null;
        }
    }

    public enum LightEstimationMode {
        DISABLED(0),
        AMBIENT_INTENSITY(1),
        ENVIRONMENTAL_HDR(2);

        final int nativeCode;

        LightEstimationMode(int i) {
            this.nativeCode = i;
        }

        public static LightEstimationMode forNumber(int i) {
            for (LightEstimationMode lightEstimationMode : values()) {
                if (lightEstimationMode.nativeCode == i) {
                    return lightEstimationMode;
                }
            }
            yx61.f(a0.a((byte) 55, i, "Unexpected value for native LightEstimationMode, value="));
            return null;
        }
    }

    public enum PlaneFindingMode {
        DISABLED(0),
        HORIZONTAL(1),
        VERTICAL(2),
        HORIZONTAL_AND_VERTICAL(3);

        final int nativeCode;

        PlaneFindingMode(int i) {
            this.nativeCode = i;
        }

        public static PlaneFindingMode forNumber(int i) {
            for (PlaneFindingMode planeFindingMode : values()) {
                if (planeFindingMode.nativeCode == i) {
                    return planeFindingMode;
                }
            }
            yx61.f(a0.a((byte) 52, i, "Unexpected value for native PlaneFindingMode, value="));
            return null;
        }
    }

    public enum SemanticMode {
        DISABLED(0),
        ENABLED(1);

        final int nativeCode;

        SemanticMode(int i) {
            this.nativeCode = i;
        }

        public static SemanticMode forNumber(int i) {
            for (SemanticMode semanticMode : values()) {
                if (semanticMode.nativeCode == i) {
                    return semanticMode;
                }
            }
            yx61.f(a0.a((byte) 48, i, "Unexpected value for native SemanticMode, value="));
            return null;
        }
    }

    public enum StreetscapeGeometryMode {
        DISABLED(0),
        ENABLED(1);

        final int nativeCode;

        StreetscapeGeometryMode(int i) {
            this.nativeCode = i;
        }

        public static StreetscapeGeometryMode forNumber(int i) {
            for (StreetscapeGeometryMode streetscapeGeometryMode : values()) {
                if (streetscapeGeometryMode.nativeCode == i) {
                    return streetscapeGeometryMode;
                }
            }
            yx61.f(a0.a((byte) 59, i, "Unexpected value for native StreetscapeGeometryMode, value="));
            return null;
        }
    }

    public enum TextureUpdateMode {
        BIND_TO_TEXTURE_EXTERNAL_OES(0),
        EXPOSE_HARDWARE_BUFFER(1);

        final int nativeCode;

        TextureUpdateMode(int i) {
            this.nativeCode = i;
        }

        public static TextureUpdateMode forNumber(int i) {
            for (TextureUpdateMode textureUpdateMode : values()) {
                if (textureUpdateMode.nativeCode == i) {
                    return textureUpdateMode;
                }
            }
            yx61.f(a0.a((byte) 53, i, "Unexpected value for native TextureUpdateMode, value="));
            return null;
        }
    }

    public enum UpdateMode {
        BLOCKING(0),
        LATEST_CAMERA_IMAGE(1);

        final int nativeCode;

        UpdateMode(int i) {
            this.nativeCode = i;
        }

        public static UpdateMode forNumber(int i) {
            for (UpdateMode updateMode : values()) {
                if (updateMode.nativeCode == i) {
                    return updateMode;
                }
            }
            yx61.f(a0.a(Alerts.alert_certificate_unknown, i, "Unexpected value for native UpdateMode, value="));
            return null;
        }
    }

    public Config(Session session) {
        this.session = session;
        this.nativeHandle = nativeCreate(session.nativeWrapperHandle);
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }

    private static native long nativeCreate(long j);

    private static native void nativeDestroy(long j, long j2);

    private native int nativeGetAugmentedFaceMode(long j, long j2);

    private native long nativeGetAugmentedImageDatabase(long j, long j2);

    private native int nativeGetCloudAnchorMode(long j, long j2);

    private native int nativeGetDepthMode(long j, long j2);

    private native int nativeGetFlashMode(long j, long j2);

    private native int nativeGetFocusMode(long j, long j2);

    private native int nativeGetGeospatialMode(long j, long j2, long j3);

    private native int nativeGetImageStabilizationMode(long j, long j2);

    private native int nativeGetInstantPlacementMode(long j, long j2);

    private native int nativeGetLightEstimationMode(long j, long j2);

    private native int nativeGetPlaneFindingMode(long j, long j2);

    private native int nativeGetSemanticMode(long j, long j2);

    private native int nativeGetStreetscapeGeometryMode(long j, long j2, long j3);

    private native int nativeGetTextureUpdateMode(long j, long j2);

    private native int nativeGetUpdateMode(long j, long j2);

    private native void nativeSetAugmentedFaceMode(long j, long j2, int i);

    private native void nativeSetAugmentedImageDatabase(long j, long j2, long j3);

    private native void nativeSetCloudAnchorMode(long j, long j2, int i);

    private native void nativeSetDepthMode(long j, long j2, int i);

    private native void nativeSetFlashMode(long j, long j2, int i);

    private native void nativeSetFocusMode(long j, long j2, int i);

    private native void nativeSetGeospatialMode(long j, long j2, long j3, int i);

    private native void nativeSetImageStabilizationMode(long j, long j2, int i);

    private native void nativeSetInstantPlacementMode(long j, long j2, int i);

    private native void nativeSetLightEstimationMode(long j, long j2, int i);

    private native void nativeSetPlaneFindingMode(long j, long j2, int i);

    private native void nativeSetSemanticMode(long j, long j2, int i);

    private native void nativeSetStreetscapeGeometryMode(long j, long j2, long j3, int i);

    private native void nativeSetTextureUpdateMode(long j, long j2, int i);

    private native void nativeSetUpdateMode(long j, long j2, int i);

    public void finalize() throws Throwable {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeDestroy(this.nativeSymbolTableHandle, j);
        }
        super.finalize();
    }

    public AugmentedFaceMode getAugmentedFaceMode() {
        return AugmentedFaceMode.forNumber(nativeGetAugmentedFaceMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public AugmentedImageDatabase getAugmentedImageDatabase() {
        return new AugmentedImageDatabase(this.session, nativeGetAugmentedImageDatabase(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public CloudAnchorMode getCloudAnchorMode() {
        return CloudAnchorMode.forNumber(nativeGetCloudAnchorMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public DepthMode getDepthMode() {
        return DepthMode.forNumber(nativeGetDepthMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public FlashMode getFlashMode() {
        return FlashMode.forNumber(nativeGetFlashMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public FocusMode getFocusMode() {
        return FocusMode.forNumber(nativeGetFocusMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public GeospatialMode getGeospatialMode() {
        return GeospatialMode.forNumber(nativeGetGeospatialMode(this.nativeSymbolTableHandle, this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public ImageStabilizationMode getImageStabilizationMode() {
        return ImageStabilizationMode.forNumber(nativeGetImageStabilizationMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public InstantPlacementMode getInstantPlacementMode() {
        return InstantPlacementMode.forNumber(nativeGetInstantPlacementMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public LightEstimationMode getLightEstimationMode() {
        return LightEstimationMode.forNumber(nativeGetLightEstimationMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public PlaneFindingMode getPlaneFindingMode() {
        return PlaneFindingMode.forNumber(nativeGetPlaneFindingMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public SemanticMode getSemanticMode() {
        return SemanticMode.forNumber(nativeGetSemanticMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public StreetscapeGeometryMode getStreetscapeGeometryMode() {
        return StreetscapeGeometryMode.forNumber(nativeGetStreetscapeGeometryMode(this.nativeSymbolTableHandle, this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public TextureUpdateMode getTextureUpdateMode() {
        return TextureUpdateMode.forNumber(nativeGetTextureUpdateMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public UpdateMode getUpdateMode() {
        return UpdateMode.forNumber(nativeGetUpdateMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public Config setAugmentedFaceMode(AugmentedFaceMode augmentedFaceMode) {
        nativeSetAugmentedFaceMode(this.session.nativeWrapperHandle, this.nativeHandle, augmentedFaceMode.nativeCode);
        return this;
    }

    public Config setAugmentedImageDatabase(AugmentedImageDatabase augmentedImageDatabase) {
        nativeSetAugmentedImageDatabase(this.session.nativeWrapperHandle, this.nativeHandle, augmentedImageDatabase == null ? 0L : augmentedImageDatabase.nativeHandle);
        return this;
    }

    public Config setCloudAnchorMode(CloudAnchorMode cloudAnchorMode) {
        nativeSetCloudAnchorMode(this.session.nativeWrapperHandle, this.nativeHandle, cloudAnchorMode.nativeCode);
        return this;
    }

    public Config setDepthMode(DepthMode depthMode) {
        nativeSetDepthMode(this.session.nativeWrapperHandle, this.nativeHandle, depthMode.nativeCode);
        return this;
    }

    public Config setFlashMode(FlashMode flashMode) {
        nativeSetFlashMode(this.session.nativeWrapperHandle, this.nativeHandle, flashMode.nativeCode);
        return this;
    }

    public Config setFocusMode(FocusMode focusMode) {
        nativeSetFocusMode(this.session.nativeWrapperHandle, this.nativeHandle, focusMode.nativeCode);
        return this;
    }

    public Config setGeospatialMode(GeospatialMode geospatialMode) {
        nativeSetGeospatialMode(this.nativeSymbolTableHandle, this.session.nativeWrapperHandle, this.nativeHandle, geospatialMode.nativeCode);
        return this;
    }

    public Config setImageStabilizationMode(ImageStabilizationMode imageStabilizationMode) {
        nativeSetImageStabilizationMode(this.session.nativeWrapperHandle, this.nativeHandle, imageStabilizationMode.nativeCode);
        return this;
    }

    public Config setInstantPlacementMode(InstantPlacementMode instantPlacementMode) {
        nativeSetInstantPlacementMode(this.session.nativeWrapperHandle, this.nativeHandle, instantPlacementMode.nativeCode);
        return this;
    }

    public Config setLightEstimationMode(LightEstimationMode lightEstimationMode) {
        nativeSetLightEstimationMode(this.session.nativeWrapperHandle, this.nativeHandle, lightEstimationMode.nativeCode);
        return this;
    }

    public Config setPlaneFindingMode(PlaneFindingMode planeFindingMode) {
        nativeSetPlaneFindingMode(this.session.nativeWrapperHandle, this.nativeHandle, planeFindingMode.nativeCode);
        return this;
    }

    public Config setSemanticMode(SemanticMode semanticMode) {
        nativeSetSemanticMode(this.session.nativeWrapperHandle, this.nativeHandle, semanticMode.nativeCode);
        return this;
    }

    public Config setStreetscapeGeometryMode(StreetscapeGeometryMode streetscapeGeometryMode) {
        nativeSetStreetscapeGeometryMode(this.nativeSymbolTableHandle, this.session.nativeWrapperHandle, this.nativeHandle, streetscapeGeometryMode.nativeCode);
        return this;
    }

    public Config setTextureUpdateMode(TextureUpdateMode textureUpdateMode) {
        nativeSetTextureUpdateMode(this.session.nativeWrapperHandle, this.nativeHandle, textureUpdateMode.nativeCode);
        return this;
    }

    public Config setUpdateMode(UpdateMode updateMode) {
        nativeSetUpdateMode(this.session.nativeWrapperHandle, this.nativeHandle, updateMode.nativeCode);
        return this;
    }

    public Config() {
        this.session = null;
        this.nativeHandle = 0L;
        this.nativeSymbolTableHandle = 0L;
    }

    public Config(Session session, long j) {
        this.session = session;
        this.nativeHandle = j;
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }
}
