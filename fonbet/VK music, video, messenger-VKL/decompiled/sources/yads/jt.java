package yads;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import java.util.Comparator;
import xsna.d2z0;

/* loaded from: classes10.dex */
public final class jt {
    public static final Comparator c = new d2z0();
    public final o20 a;
    public final int b;

    public jt(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f, int i, float f2, int i2, boolean z, int i3, int i4) {
        n20 b = new n20().a(spannableStringBuilder).a(alignment).a(f).a(i).b(f2).b(i2).b();
        if (z) {
            b.c(i3);
        }
        this.a = b.a();
        this.b = i4;
    }
}
