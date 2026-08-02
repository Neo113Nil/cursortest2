package xsna;

import java.util.List;
import xsna.fxj0;

/* compiled from: AvatarSizeKey.kt */
/* loaded from: classes.dex */
public final class js5 {
    public static final List<String> a = e43.l("photo_50", "photo_100", "photo_200_orig", "photo_200", "photo_400_orig", "photo_400", "photo_max", "photo_max_orig", "photo_small", "photo_rec", "photo_medium", "photo_medium_rec", "photo_big");

    public static final String a(int i, String str) {
        String a2 = cqm0.a(str);
        if (a2 != null) {
            return fxj0.a.a(ixj0.j(i, 480), a2);
        }
        return null;
    }
}
