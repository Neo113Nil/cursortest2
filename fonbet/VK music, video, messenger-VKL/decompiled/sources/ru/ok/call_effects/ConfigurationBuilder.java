package ru.ok.call_effects;

import xsna.zcl;

/* compiled from: Configuration.kt */
/* loaded from: classes9.dex */
public final class ConfigurationBuilder implements Configuration {
    private final boolean shouldHandleGesturesRecognition;
    private final boolean shouldUseDirtyModeInGestureRecognition;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ConfigurationBuilder() {
        this(r2, r2, 3, null);
        boolean z = false;
    }

    @Override // ru.ok.call_effects.Configuration
    public boolean isGesturesRecognitionDirtyModeEnabled() {
        return this.shouldUseDirtyModeInGestureRecognition;
    }

    @Override // ru.ok.call_effects.Configuration
    public boolean isGesturesRecognitionEnabled() {
        return this.shouldHandleGesturesRecognition;
    }

    public ConfigurationBuilder(boolean z, boolean z2) {
        this.shouldHandleGesturesRecognition = z;
        this.shouldUseDirtyModeInGestureRecognition = z2;
    }

    public /* synthetic */ ConfigurationBuilder(boolean z, boolean z2, int i, zcl zclVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
