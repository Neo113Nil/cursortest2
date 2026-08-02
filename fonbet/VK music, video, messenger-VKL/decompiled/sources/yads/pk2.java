package yads;

import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes10.dex */
public final class pk2 {
    public static String a(long j) {
        long ceil = (long) Math.ceil(j / 1000);
        return String.format(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(ceil / 60), Long.valueOf(ceil % 60)}, 2));
    }
}
