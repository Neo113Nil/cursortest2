package defpackage;

import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class kwc0 {
    public static Typeface a(String str, lzr lzrVar, int i) {
        if (i == 0 && jl40.l(lzrVar, lzr.D) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), lzrVar.a, i == 1);
    }
}
