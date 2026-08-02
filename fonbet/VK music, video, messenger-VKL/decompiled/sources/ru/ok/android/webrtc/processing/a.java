package ru.ok.android.webrtc.processing;

import android.os.SystemClock;
import java.util.Objects;
import ru.ok.android.external.sdk.MicSampleListener;

/* loaded from: classes9.dex */
public final class a {
    public final MicSampleListener a;
    public final long b;
    public long c = SystemClock.elapsedRealtime();

    public a(MicSampleListener micSampleListener, long j) {
        this.a = micSampleListener;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
