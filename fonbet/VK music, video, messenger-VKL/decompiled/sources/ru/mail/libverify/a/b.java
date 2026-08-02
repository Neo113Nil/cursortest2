package ru.mail.libverify.a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ru.ok.tracer.manifest.TracerLiteManifest;

/* loaded from: classes11.dex */
public final class b implements TracerLiteManifest {
    @Override // ru.ok.tracer.manifest.BaseTracerManifest
    @NonNull
    public final String appToken() {
        return "p7YouXkJA3IqGeEJ9kKXT6qKQBvOjWZvC5nOT2VMBiG0";
    }

    @Override // ru.ok.tracer.manifest.BaseTracerManifest
    @Nullable
    public final String buildUuid() {
        return "7cf6e940-64c4-11f1-b8ef-667eddae46c1";
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
        return "ru.mail.libverify";
    }

    @Override // ru.ok.tracer.manifest.BaseTracerManifest
    @NonNull
    public final String versionName() {
        return "2.18.2";
    }
}
