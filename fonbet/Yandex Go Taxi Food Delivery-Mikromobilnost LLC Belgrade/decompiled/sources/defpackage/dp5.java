package defpackage;

import android.text.TextUtils;
import java.util.Locale;

/* loaded from: classes10.dex */
public final class dp5 {
    public boolean a;
    public int b;
    public wvb1 c;

    public dp5() {
        Locale locale = Locale.getDefault();
        wvb1 wvb1Var = fp5.d;
        this.a = TextUtils.getLayoutDirectionFromLocale(locale) == 1;
        this.c = fp5.d;
        this.b = 2;
    }

    public final fp5 a() {
        return (this.b == 2 && this.c == fp5.d) ? this.a ? fp5.h : fp5.g : new fp5(this.a, this.b, this.c);
    }
}
