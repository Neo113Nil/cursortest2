package ru.ok.android.externcalls.sdk.ml.model;

import java.util.Set;
import xsna.zcl;

/* compiled from: ModelSpec.kt */
/* loaded from: classes9.dex */
public final class ModelSpec {
    private final long minFileSize;
    private final Set<ExtensionRule> requiredExtensions;

    /* JADX WARN: Multi-variable type inference failed */
    public ModelSpec(Set<? extends ExtensionRule> set, long j) {
        this.requiredExtensions = set;
        this.minFileSize = j;
    }

    public final long getMinFileSize() {
        return this.minFileSize;
    }

    public final Set<ExtensionRule> getRequiredExtensions() {
        return this.requiredExtensions;
    }

    public /* synthetic */ ModelSpec(Set set, long j, int i, zcl zclVar) {
        this(set, (i & 2) != 0 ? 1L : j);
    }
}
