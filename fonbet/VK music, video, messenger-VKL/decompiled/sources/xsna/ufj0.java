package xsna;

import android.graphics.Color;
import kotlin.text.Regex;

/* compiled from: ShortVideoChallengeStyleToChallengeStyleMapper.kt */
/* loaded from: classes3.dex */
public final class ufj0 {
    public static final Regex a = new Regex("^([0-9a-fA-F]{6}|[0-9a-fA-F]{8})$");

    public static Integer a(String str) {
        if (str.length() == 0) {
            return null;
        }
        if (drm0.d0(str, '#')) {
            return Integer.valueOf(Color.parseColor(str));
        }
        if (a.f(str)) {
            return io.reactivex.rxjava3.internal.operators.mixed.n.a("#", str);
        }
        return null;
    }
}
