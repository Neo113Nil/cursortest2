package ru.ok.android.webrtc;

import ru.ok.android.annotation.CallExperimentalApi;
import xsna.zcl;

@CallExperimentalApi
/* loaded from: classes9.dex */
public final class CameraToggles {
    public final boolean a;

    public CameraToggles() {
        this(false, 1, null);
    }

    public static /* synthetic */ CameraToggles copy$default(CameraToggles cameraToggles, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = cameraToggles.a;
        }
        return cameraToggles.copy(z);
    }

    public final boolean component1() {
        return this.a;
    }

    public final CameraToggles copy(boolean z) {
        return new CameraToggles(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CameraToggles) && this.a == ((CameraToggles) obj).a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final boolean isCrashOnCameraCloseRequired() {
        return this.a;
    }

    public String toString() {
        return com.vk.movika.sdk.android.defaultplayer.interactive.c.a("CameraToggles(isCrashOnCameraCloseRequired=", ")", this.a);
    }

    public CameraToggles(boolean z) {
        this.a = z;
    }

    public /* synthetic */ CameraToggles(boolean z, int i, zcl zclVar) {
        this((i & 1) != 0 ? false : z);
    }
}
