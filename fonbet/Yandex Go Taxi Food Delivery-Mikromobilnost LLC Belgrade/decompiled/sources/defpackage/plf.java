package defpackage;

import android.content.Context;
import android.net.Uri;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes15.dex */
public final class plf {
    public final Context a;
    public final pwy0 b;

    public plf(Context context, pwy0 pwy0Var) {
        this.a = context;
        this.b = pwy0Var;
    }

    public final void a(Uri uri) {
        int i = this.b.getThemeType() == ThemeType.DARK ? 2 : 1;
        slf slfVar = new slf();
        slfVar.g = false;
        slfVar.a.putExtra("androidx.browser.customtabs.extra.COLOR_SCHEME", i);
        try {
            slfVar.a().a(this.a, uri);
        } catch (Exception e) {
            jst.e.k(e, "Failed to open chrome custom tab");
        }
    }
}
