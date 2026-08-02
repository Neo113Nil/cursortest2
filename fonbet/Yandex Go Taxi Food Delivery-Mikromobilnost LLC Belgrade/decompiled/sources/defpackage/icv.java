package defpackage;

import android.util.Size;
import java.util.List;

/* loaded from: classes10.dex */
public interface icv extends ybi0 {
    public static final x34 m2 = new x34("camerax.core.imageOutput.targetAspectRatio", m83.class, null);
    public static final x34 n2;
    public static final x34 o2;
    public static final x34 q2;
    public static final x34 r2;
    public static final x34 s2;
    public static final x34 t2;
    public static final x34 u2;
    public static final x34 w2;
    public static final x34 z2;

    static {
        Class cls = Integer.TYPE;
        n2 = new x34("camerax.core.imageOutput.targetRotation", cls, null);
        o2 = new x34("camerax.core.imageOutput.appTargetRotation", cls, null);
        q2 = new x34("camerax.core.imageOutput.mirrorMode", cls, null);
        r2 = new x34("camerax.core.imageOutput.targetResolution", Size.class, null);
        s2 = new x34("camerax.core.imageOutput.defaultResolution", Size.class, null);
        t2 = new x34("camerax.core.imageOutput.maxResolution", Size.class, null);
        u2 = new x34("camerax.core.imageOutput.supportedResolutions", List.class, null);
        w2 = new x34("camerax.core.imageOutput.resolutionSelector", bsj0.class, null);
        z2 = new x34("camerax.core.imageOutput.customOrderedResolutions", List.class, null);
    }

    static void v(icv icvVar) {
        boolean d = icvVar.d(m2);
        boolean z = ((Size) icvVar.g(r2, null)) != null;
        if (d && z) {
            ny61.g("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        } else if (icvVar.s() != null) {
            if (d || z) {
                ny61.g("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    default int n(int i) {
        return ((Integer) g(n2, Integer.valueOf(i))).intValue();
    }

    default bsj0 s() {
        return (bsj0) g(w2, null);
    }
}
