package xsna;

import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: StreamingJsonEncoder.kt */
/* loaded from: classes8.dex */
public final class hpm0 {
    public static final Set<SerialDescriptor> a = rl3.y0(new SerialDescriptor[]{nxp0.b, sxp0.b, yvp0.b, zxp0.b});

    public static final boolean a(SerialDescriptor serialDescriptor) {
        return serialDescriptor.isInline() && a.contains(serialDescriptor);
    }
}
