package io.appmetrica.analytics.coreutils.internal.toggle;

/* loaded from: classes8.dex */
public final class OuterStateToggle extends SimpleThreadSafeToggle {
    public OuterStateToggle(boolean z, String str) {
        super(z, str);
    }

    public final void update(boolean z) {
        updateState(z);
    }
}
