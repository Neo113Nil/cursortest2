package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import ru.yandex.taxi.common_models.net.TextMetaStyle;

/* loaded from: classes12.dex */
public final class pya {
    public final r820 a;

    public pya(r820 r820Var) {
        this.a = r820Var;
    }

    public final g2a a(Context context, TextMetaStyle textMetaStyle, float f) {
        hhs0 a = this.a.a(textMetaStyle);
        Integer num = (Integer) a.b;
        Typeface b = num != null ? wuj0.b(num.intValue(), context) : null;
        if (b == null) {
            b = Typeface.DEFAULT_BOLD;
        }
        Integer num2 = (Integer) a.c;
        if (num2 != null) {
            f = num2.intValue();
        }
        return new g2a(b, f);
    }
}
