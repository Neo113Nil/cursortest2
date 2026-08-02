package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;

/* loaded from: classes2.dex */
public abstract class mm91 {
    public static final String[] a = {"🐶️", "🐱️", "🐭️", "🐹️", "🐰️", "🦊️", "🐻️", "🐼️", "🐨️", "🐯️", "🦁️", "🐮️", "🐷️", "🐽️", "🐸️", "🐵️", "🙈️", "🙉️", "🙊️", "🐒️", "🐔️", "🐧️", "🐦️", "🐤️", "🐣️", "🐥️", "🦆️", "🦅️", "🦉️", "🦇️", "🐺️", "🐗️", "🐴️", "🦄️", "🐝️", "🐛️", "🦋️", "🐌️", "🐚️", "🐞️", "🐜️", "🕷️", "🕸️", "🐢️", "🐍️", "🦎️", "🦂️", "🦀️", "🦑️", "🐙️", "🦐️", "🐠️", "🐟️", "🐡️", "🐬️", "🦈️", "🐳️", "🐋️", "🐊️", "🐆️", "🐅️", "🐃️", "🐂️", "🐄️", "🦌️", "🐪️", "🐫️", "🐘️", "🦏️", "🦍️", "🐎️", "🐖️", "🐐️", "🐏️", "🐑️", "🐕️", "🐩️", "🐈️", "🐓️", "🦃️", "🕊️", "🐇️", "🐁️", "🐀️", "🐿️", "🐾️", "🐉️", "🐲️", "🌵️", "🎄️", "🌲️", "🌳️", "🌴️", "🌱️", "🌿️", "☘️", "🍀️", "🎍️", "🎋️", "🍃️", "🍂️", "🍁️", "🍄️", "🌾️", "💐️", "🌷️", "🌹️", "🥀️", "🌻️", "🌼️", "🌸️", "🌺️", "🌎️", "🌍️", "🌏️", "🌕️", "🌖️", "🌗️", "🌘️", "🌑️", "🌒️", "🌓️", "🌔️", "🌚️", "🌝️", "🌞️", "🌛️", "🌜️", "🌙️", "💫️", "⭐️", "🌟️", "✨️", "⚡️", "🔥️", "💥️", "☄️", "☀️", "🌤️", "⛅️", "🌥️", "🌦️", "🌈️", "☁️", "🌧️", "⛈️", "🌩️", "🌨️", "☃️", "⛄️", "❄️", "🌬️", "💨️", "🌪️", "🌫️", "🌊️", "💧️", "💦️", "☔"};

    public static final RippleDrawable a(Drawable drawable, int i, float f, float f2, float f3, float f4) {
        return new RippleDrawable(ColorStateList.valueOf(i), drawable, (f == 0.0f && f2 == 0.0f && f3 == 0.0f && f4 == 0.0f) ? null : new ShapeDrawable(nbb1.a(f, f2, f3, f4)));
    }

    public static /* synthetic */ RippleDrawable b(Drawable drawable, int i, float f, float f2, float f3, float f4, int i2) {
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 16) != 0) {
            f4 = 0.0f;
        }
        return a(drawable, i, f, f2, f3, f4);
    }
}
