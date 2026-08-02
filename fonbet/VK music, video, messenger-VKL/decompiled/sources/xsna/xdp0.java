package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ru.ok.tracer.manifest.TracerManifest;

/* compiled from: TracerApplicationManifest.java */
/* loaded from: classes7.dex */
public final class xdp0 implements TracerManifest {
    @Override // ru.ok.tracer.manifest.BaseTracerManifest
    @NonNull
    public final String appToken() {
        return "Y2EZ8uSPZfZnH9FczSTpPnDKu8nY0vlm7TrBkE2GnbA0";
    }

    @Override // ru.ok.tracer.manifest.TracerManifest
    @NonNull
    public final String applicationId() {
        return "com.vkontakte.android";
    }

    @Override // ru.ok.tracer.manifest.BaseTracerManifest
    @Nullable
    public final String buildUuid() {
        return "45cf1720-86ad-11f1-9103-4cc0265513bb";
    }

    @Override // ru.ok.tracer.manifest.BaseTracerManifest
    public final String environment() {
        return "armUpload";
    }

    @Override // ru.ok.tracer.manifest.BaseTracerManifest
    public final boolean isDisabled() {
        return false;
    }

    @Override // ru.ok.tracer.manifest.TracerManifest
    public final long longVersionCode() {
        return 56120L;
    }

    @Override // ru.ok.tracer.manifest.BaseTracerManifest
    @NonNull
    public final String namespace() {
        return "com.vkontakte.android";
    }

    @Override // ru.ok.tracer.manifest.BaseTracerManifest
    @NonNull
    public final String versionName() {
        return "8.188.1";
    }
}
