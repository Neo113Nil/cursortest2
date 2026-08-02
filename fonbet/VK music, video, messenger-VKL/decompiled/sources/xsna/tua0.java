package xsna;

import android.graphics.Typeface;

/* compiled from: PlatformTypefaces.android.kt */
/* loaded from: classes11.dex */
public final class tua0 {
    public static Typeface a(String str, b6s b6sVar, int i) {
        if (i == 0 && epx.f(b6sVar, b6s.h) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), b6sVar.b, i == 1);
    }
}
