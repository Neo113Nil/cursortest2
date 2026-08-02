package xsna;

import android.net.NetworkRequest;

/* compiled from: NetworkRequestCompat.kt */
/* loaded from: classes12.dex */
public final class x460 {
    public static b560 a(int[] iArr, int[] iArr2) {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i : iArr) {
            try {
                builder.addCapability(i);
            } catch (IllegalArgumentException unused) {
                m100 c = m100.c();
                int i2 = b560.b;
                int i3 = b560.b;
                c.getClass();
            }
        }
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = c560.a[i4];
            if (!rl3.E(i5, iArr)) {
                try {
                    builder.removeCapability(i5);
                } catch (IllegalArgumentException unused2) {
                    m100 c2 = m100.c();
                    int i6 = b560.b;
                    int i7 = b560.b;
                    c2.getClass();
                }
            }
        }
        for (int i8 : iArr2) {
            builder.addTransportType(i8);
        }
        return new b560(builder.build());
    }
}
