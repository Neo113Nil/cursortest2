package xsna;

import java.time.Instant;
import java.util.Arrays;
import java.util.Optional;
import one.video.calls.sdk_private.aF;

/* compiled from: GlobalPacketAssembler.java */
/* loaded from: classes8.dex */
public final class mny0 {
    public gjy0[] a;
    public volatile rny0[] b;
    public volatile aF[] c;

    /* compiled from: GlobalPacketAssembler.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[aF.values().length];
            a = iArr;
            try {
                iArr[aF.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[aF.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[aF.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public final Optional<Instant> a() {
        return Arrays.stream(this.c).map(new dx6(this, 1)).map(new uqk(3)).filter(new vqk(1)).findFirst();
    }
}
