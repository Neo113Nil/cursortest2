package defpackage;

import java.util.Locale;
import kotlinx.serialization.KSerializer;

/* loaded from: classes9.dex */
public final class d5v0 {
    public static String a(int i, int i2) {
        if (i == 0) {
            return "A".toLowerCase(Locale.US);
        }
        if (i == i2 - 1) {
            return "B".toLowerCase(Locale.US);
        }
        return "MID".toLowerCase(Locale.US) + i;
    }

    public final KSerializer serializer() {
        return c5v0.a;
    }
}
