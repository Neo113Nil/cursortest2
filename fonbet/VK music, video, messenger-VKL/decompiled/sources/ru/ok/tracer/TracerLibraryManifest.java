package ru.ok.tracer;

import ru.ok.tracer.manifest.TracerLiteManifest;

/* compiled from: TracerLibraryManifest.kt */
/* loaded from: classes11.dex */
public final class TracerLibraryManifest implements TracerLiteManifest {
    @Override // ru.ok.tracer.manifest.BaseTracerManifest
    public String appToken() {
        return BuildConfig.LIBRARY_TOKEN;
    }

    @Override // ru.ok.tracer.manifest.BaseTracerManifest
    public String buildUuid() {
        return null;
    }

    @Override // ru.ok.tracer.manifest.BaseTracerManifest
    public String environment() {
        return "release";
    }

    @Override // ru.ok.tracer.manifest.BaseTracerManifest
    public String namespace() {
        return BuildConfig.LIBRARY_PACKAGE_NAME;
    }

    @Override // ru.ok.tracer.manifest.BaseTracerManifest
    public String versionName() {
        return "1.3.3";
    }
}
