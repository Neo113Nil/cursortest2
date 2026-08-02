package xsna;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: RtlHelper.kt */
/* loaded from: classes17.dex */
public final class xpg0 {
    public static final bpn0 a = new bpn0(new ek(28));

    public static final CharSequence a(CharSequence charSequence) {
        if (b()) {
            if (charSequence == null || charSequence.length() <= 0) {
                return null;
            }
            return TextUtils.concat("\u200e", charSequence, "\u200e");
        }
        if (charSequence == null || charSequence.length() <= 0) {
            return null;
        }
        return TextUtils.concat("\u200f", charSequence, "\u200f");
    }

    public static final boolean b() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return context.getResources().getConfiguration().getLayoutDirection() == 0;
    }
}
