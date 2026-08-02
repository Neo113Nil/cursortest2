package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ru.ok.tracer.manifest.TracerLiteManifest;

/* loaded from: classes11.dex */
public final class hep0 implements TracerLiteManifest {
    @Override // ru.ok.tracer.manifest.BaseTracerManifest
    @NonNull
    public final String appToken() {
        return "yGYNC7uaDuYx2TlRRuEuya6DTj7T6BYlGtQK8UJu6uSe";
    }

    @Override // ru.ok.tracer.manifest.BaseTracerManifest
    @Nullable
    public final String buildUuid() {
        return "0cda5d60-6fe4-11f1-97ea-fd04850a9543";
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
        return "ru.rustore.sdk.pushclient";
    }

    @Override // ru.ok.tracer.manifest.BaseTracerManifest
    @NonNull
    public final String versionName() {
        return "7.4.0-rc01";
    }
}
