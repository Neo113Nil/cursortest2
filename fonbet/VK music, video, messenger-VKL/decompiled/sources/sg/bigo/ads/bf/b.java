package sg.bigo.ads.bf;

import android.content.Context;
import androidx.annotation.NonNull;
import sg.bigo.ads.common.utils.s;

/* loaded from: classes9.dex */
public final class b {
    @NonNull
    public static sg.bigo.ads.an.a a(@NonNull Context context) {
        long a = s.a.a(15);
        sg.bigo.ads.an.a a2 = a.a(context);
        if (a2 == null) {
            try {
                a2 = c.a(context, a);
            } catch (Exception unused) {
            }
        }
        return a2 == null ? new sg.bigo.ads.an.a("", true) : a2;
    }
}
