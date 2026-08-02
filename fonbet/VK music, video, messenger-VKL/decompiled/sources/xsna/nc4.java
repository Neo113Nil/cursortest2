package xsna;

import android.media.AudioAttributes;
import android.os.Build;
import androidx.annotation.Nullable;

/* compiled from: AudioAttributes.java */
/* loaded from: classes12.dex */
public final class nc4 {
    public static final nc4 c = new nc4(1);
    public final int a;

    @Nullable
    public AudioAttributes b;

    static {
        cq.h(0, 1, 2, 3, 4);
        y2r0.L(5);
        y2r0.L(6);
    }

    public nc4(int i) {
        this.a = i;
    }

    public final AudioAttributes a() {
        if (this.b == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(this.a);
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                usage.setAllowedCapturePolicy(1);
                usage.setHapticChannelsMuted(true);
            }
            if (i >= 32) {
                usage.setSpatializationBehavior(0);
                usage.setIsContentSpatialized(false);
            }
            this.b = usage.build();
        }
        return this.b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && nc4.class == obj.getClass() && this.a == ((nc4) obj).a;
    }

    public final int hashCode() {
        return ((((506447 + this.a) * 31) + 1) * 29791) + 1;
    }
}
