package xsna;

import android.content.Context;
import android.os.Build;

/* compiled from: FontFamilyResolver.android.kt */
/* loaded from: classes11.dex */
public final class y4s {
    public static final w4s a(Context context) {
        return new w4s(new v82(context), new x82(Build.VERSION.SDK_INT >= 31 ? c6s.a.a(context) : 0));
    }
}
