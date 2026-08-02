package defpackage;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;

/* loaded from: classes10.dex */
public final class ayr {
    public final AssetManager d;
    public final cz40 a = new cz40();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public String e = ".ttf";

    public ayr(Drawable.Callback callback, zxr zxrVar) {
        if (callback instanceof View) {
            this.d = ((View) callback).getContext().getAssets();
        } else {
            lgz.b("LottieDrawable must be inside of a view for images to work.");
            this.d = null;
        }
    }

    public final Typeface a(xxr xxrVar) {
        String str = xxrVar.a;
        String str2 = xxrVar.c;
        cz40 cz40Var = this.a;
        cz40Var.a = str;
        cz40Var.b = str2;
        HashMap hashMap = this.b;
        Typeface typeface = (Typeface) hashMap.get(cz40Var);
        if (typeface != null) {
            return typeface;
        }
        String str3 = xxrVar.a;
        HashMap hashMap2 = this.c;
        Typeface typeface2 = (Typeface) hashMap2.get(str3);
        if (typeface2 == null && (typeface2 = xxrVar.d) == null) {
            typeface2 = Typeface.createFromAsset(this.d, "fonts/" + str3 + this.e);
            hashMap2.put(str3, typeface2);
        }
        boolean contains = str2.contains("Italic");
        boolean contains2 = str2.contains("Bold");
        int i = (contains && contains2) ? 3 : contains ? 2 : contains2 ? 1 : 0;
        if (typeface2.getStyle() != i) {
            typeface2 = Typeface.create(typeface2, i);
        }
        hashMap.put(cz40Var, typeface2);
        return typeface2;
    }

    public final void b(String str) {
        this.e = str;
    }

    public final void c(zxr zxrVar) {
    }
}
