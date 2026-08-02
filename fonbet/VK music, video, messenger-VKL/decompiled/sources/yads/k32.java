package yads;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class k32 {
    public static Float a(String str) {
        if (str != null) {
            try {
                return Float.valueOf(Float.parseFloat(str));
            } catch (NumberFormatException unused) {
                String.format("Could not parse rating value. Rating value is %s", Arrays.copyOf(new Object[]{str}, 1));
            }
        }
        return null;
    }
}
