package defpackage;

import android.content.Context;
import android.net.Uri;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.go.image.api.domain.models.ImageModel$Tag$Theme;

/* loaded from: classes.dex */
public final class j7x0 extends ib5 {
    public final ju6 a;
    public final Context b;
    public final pwy0 c;

    public j7x0(ju6 ju6Var, Context context, pwy0 pwy0Var) {
        this.a = ju6Var;
        this.b = context;
        this.c = pwy0Var;
    }

    @Override // defpackage.ib5
    public final String a(obv obvVar) {
        String str;
        String c = ((not) this.a).c();
        ImageModel$Tag$Theme imageModel$Tag$Theme = obvVar.c;
        int i = obvVar.d;
        if (imageModel$Tag$Theme == null || i <= 0) {
            if (imageModel$Tag$Theme == null) {
                imageModel$Tag$Theme = vez0.X(this.c.getThemeType());
            }
            Integer valueOf = Integer.valueOf(i);
            if (i <= 0) {
                valueOf = null;
            }
            obvVar = obv.a(obvVar, imageModel$Tag$Theme, valueOf != null ? valueOf.intValue() : this.b.getResources().getDisplayMetrics().densityDpi, 1);
        }
        Uri.Builder appendQueryParameter = Uri.parse(c).buildUpon().appendPath("getimage").appendQueryParameter("tag", obvVar.b).appendQueryParameter("size_hint", String.valueOf(obvVar.d));
        ImageModel$Tag$Theme imageModel$Tag$Theme2 = obvVar.c;
        if (imageModel$Tag$Theme2 != null) {
            int i2 = hb5.a[imageModel$Tag$Theme2.ordinal()];
            if (i2 == 1) {
                str = "light";
            } else {
                if (i2 != 2) {
                    w511.b();
                    return null;
                }
                str = "dark";
            }
            appendQueryParameter.appendQueryParameter(DivkitThemeChangeListener.THEME_VARIABLE_NAME, str);
        }
        return appendQueryParameter.appendQueryParameter("file_format", "default").toString();
    }
}
