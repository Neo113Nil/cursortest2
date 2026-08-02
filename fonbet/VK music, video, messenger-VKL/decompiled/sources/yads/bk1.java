package yads;

import java.util.Locale;
import java.util.UUID;
import xsna.brm0;

/* loaded from: classes10.dex */
public final class bk1 {
    public static String a() {
        return brm0.y(UUID.randomUUID().toString(), "-", "").toLowerCase(Locale.ROOT);
    }
}
