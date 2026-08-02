package com.google.ar.core;

import com.google.ar.core.exceptions.AnchorNotSupportedForHostingException;
import com.google.ar.core.exceptions.CameraNotAvailableException;
import com.google.ar.core.exceptions.CloudAnchorsNotConfiguredException;
import com.google.ar.core.exceptions.DataInvalidFormatException;
import com.google.ar.core.exceptions.DataUnsupportedVersionException;
import com.google.ar.core.exceptions.DeadlineExceededException;
import com.google.ar.core.exceptions.FatalException;
import com.google.ar.core.exceptions.FineLocationPermissionNotGrantedException;
import com.google.ar.core.exceptions.GooglePlayServicesLocationLibraryNotLinkedException;
import com.google.ar.core.exceptions.ImageInsufficientQualityException;
import com.google.ar.core.exceptions.MetadataNotFoundException;
import com.google.ar.core.exceptions.MissingGlContextException;
import com.google.ar.core.exceptions.NotTrackingException;
import com.google.ar.core.exceptions.NotYetAvailableException;
import com.google.ar.core.exceptions.PlaybackFailedException;
import com.google.ar.core.exceptions.RecordingFailedException;
import com.google.ar.core.exceptions.ResourceExhaustedException;
import com.google.ar.core.exceptions.SessionNotPausedException;
import com.google.ar.core.exceptions.SessionPausedException;
import com.google.ar.core.exceptions.SessionUnsupportedException;
import com.google.ar.core.exceptions.TextureNotSetException;
import com.google.ar.core.exceptions.UnavailableApkTooOldException;
import com.google.ar.core.exceptions.UnavailableArcoreNotInstalledException;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableSdkTooOldException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import com.google.ar.core.exceptions.UnsupportedConfigurationException;

/* loaded from: classes11.dex */
enum ah {
    a(null, "SUCCESS", null),
    b(IllegalArgumentException.class, "ERROR_INVALID_ARGUMENT", null),
    c(FatalException.class, "ERROR_FATAL", null),
    d(SessionPausedException.class, "ERROR_SESSION_PAUSED", null),
    e(SessionNotPausedException.class, "ERROR_SESSION_NOT_PAUSED", null),
    f(NotTrackingException.class, "ERROR_NOT_TRACKING", null),
    g(TextureNotSetException.class, "ERROR_TEXTURE_NOT_SET", null),
    h(MissingGlContextException.class, "ERROR_MISSING_GL_CONTEXT", null),
    i(UnsupportedConfigurationException.class, "ERROR_UNSUPPORTED_CONFIGURATION", null),
    j(FineLocationPermissionNotGrantedException.class, "ERROR_FINE_LOCATION_PERMISSION_NOT_GRANTED", null),
    k(GooglePlayServicesLocationLibraryNotLinkedException.class, "ERROR_GOOGLE_PLAY_SERVICES_LOCATION_LIBRARY_NOT_LINKED", null),
    l(SecurityException.class, "ERROR_CAMERA_PERMISSION_NOT_GRANTED", "Camera permission is not granted"),
    m(DeadlineExceededException.class, "ERROR_DEADLINE_EXCEEDED", null),
    n(ResourceExhaustedException.class, "ERROR_RESOURCE_EXHAUSTED", null),
    o(NotYetAvailableException.class, "ERROR_NOT_YET_AVAILABLE", null),
    p(CameraNotAvailableException.class, "ERROR_CAMERA_NOT_AVAILABLE", null),
    q(AnchorNotSupportedForHostingException.class, "ERROR_ANCHOR_NOT_SUPPORTED_FOR_HOSTING", null),
    r(ImageInsufficientQualityException.class, "ERROR_IMAGE_INSUFFICIENT_QUALITY", null),
    s(DataInvalidFormatException.class, "ERROR_DATA_INVALID_FORMAT", null),
    t(DataUnsupportedVersionException.class, "ERROR_DATA_UNSUPPORTED_VERSION", null),
    u(IllegalStateException.class, "ERROR_ILLEGAL_STATE", null),
    v(RecordingFailedException.class, "ERROR_RECORDING_FAILED", null),
    w(PlaybackFailedException.class, "ERROR_PLAYBACK_FAILED", null),
    x(SessionUnsupportedException.class, "ERROR_SESSION_UNSUPPORTED", null),
    y(MetadataNotFoundException.class, "ERROR_METADATA_NOT_FOUND", null),
    z(CloudAnchorsNotConfiguredException.class, "ERROR_CLOUD_ANCHORS_NOT_CONFIGURED", null),
    A(SecurityException.class, "ERROR_INTERNET_PERMISSION_NOT_GRANTED", "Internet permission is not granted"),
    B(UnavailableArcoreNotInstalledException.class, "UNAVAILABLE_ARCORE_NOT_INSTALLED", null),
    C(UnavailableDeviceNotCompatibleException.class, "UNAVAILABLE_DEVICE_NOT_COMPATIBLE", null),
    D(UnavailableApkTooOldException.class, "UNAVAILABLE_APK_TOO_OLD", null),
    E(UnavailableSdkTooOldException.class, "UNAVAILABLE_SDK_TOO_OLD", null),
    F(UnavailableUserDeclinedInstallationException.class, "UNAVAILABLE_USER_DECLINED_INSTALLATION", null);

    final int G;
    final Class H;
    final String I;

    ah(Class cls, String str, String str2) {
        this.G = r2;
        this.H = cls;
        this.I = str2;
    }
}
