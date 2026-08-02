package com.google.ar.core.exceptions;

/* loaded from: classes11.dex */
public class GooglePlayServicesLocationLibraryNotLinkedException extends UnsupportedConfigurationException {
    public GooglePlayServicesLocationLibraryNotLinkedException(String str) {
        super("The Google Fused Location Provider for Android classes must be linked into the app's binary when calling Session.configure() with Geospatial mode enabled (Config.GeospatialMode.ENABLED). ".concat(String.valueOf(str)));
    }

    public GooglePlayServicesLocationLibraryNotLinkedException() {
        this("");
    }
}
