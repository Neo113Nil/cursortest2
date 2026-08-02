package xsna;

import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: AdderUtil.java */
@IgnoreJRERequirement
/* loaded from: classes8.dex */
public final class wp0 {
    public static final boolean a;

    static {
        boolean z;
        try {
            Class.forName("java.util.concurrent.atomic.DoubleAdder");
            Class.forName("java.util.concurrent.atomic.LongAdder");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
    }
}
