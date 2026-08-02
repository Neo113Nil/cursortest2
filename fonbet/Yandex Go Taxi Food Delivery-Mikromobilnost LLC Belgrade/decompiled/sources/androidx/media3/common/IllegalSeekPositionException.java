package androidx.media3.common;

import defpackage.a9z0;
import defpackage.kzc0;

/* loaded from: classes10.dex */
public final class IllegalSeekPositionException extends IllegalStateException {
    public final long positionMs;
    public final a9z0 timeline;
    public final int windowIndex;

    public IllegalSeekPositionException(kzc0 kzc0Var, int i, long j) {
        this.timeline = kzc0Var;
        this.windowIndex = i;
        this.positionMs = j;
    }
}
