package xsna;

import android.content.Context;
import com.vkontakte.android.R;
import java.util.Locale;

/* compiled from: StickerSearchUtils.kt */
/* loaded from: classes5.dex */
public final class a6l0 {
    public static final String[] a;

    static {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        a = context.getResources().getStringArray(R.array.prepositions_exceptions);
    }

    public static final String a(String str) {
        String replace = str.toLowerCase(Locale.ROOT).replace((char) 1105, (char) 1077);
        while (drm0.D(replace, "  ", false)) {
            replace = brm0.y(replace, "  ", " ");
        }
        return z23.c("^\\s+", replace, "");
    }
}
