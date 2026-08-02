package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ru.ok.tracer.manifest.TracerLiteManifest;

/* compiled from: TracerLibraryManifest.java */
/* loaded from: classes.dex */
public final class dep0 implements TracerLiteManifest {
    @Override // ru.ok.tracer.manifest.BaseTracerManifest
    @NonNull
    public final String appToken() {
        return "h30u5FIXtK1xIcgqjOteRmuAb4wrMV9uyLr9nAN9fBq0";
    }

    @Override // ru.ok.tracer.manifest.BaseTracerManifest
    @Nullable
    public final String buildUuid() {
        return null;
    }

    @Override // ru.ok.tracer.manifest.BaseTracerManifest
    public final String environment() {
        return "release";
    }

    @Override // ru.ok.tracer.manifest.BaseTracerManifest
    public final boolean isDisabled() {
        return false;
    }

    @Override // ru.ok.tracer.manifest.BaseTracerManifest
    @NonNull
    public final String namespace() {
        return "com.vk.push.pushsdk";
    }

    @Override // ru.ok.tracer.manifest.BaseTracerManifest
    @NonNull
    public final String versionName() {
        return "7.4.0-rc01";
    }
}
