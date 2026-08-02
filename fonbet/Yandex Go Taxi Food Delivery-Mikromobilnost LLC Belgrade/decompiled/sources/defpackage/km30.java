package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* loaded from: classes6.dex */
public final class km30 {
    public static final km30 e = new km30(null, "", "", "");
    public final String a;
    public final String b;
    public final String c;
    public final u92 d;

    public km30(Drawable drawable, String str, String str2, String str3) {
        Bitmap e0;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = (drawable == null || (e0 = ffx.e0(drawable)) == null) ? null : new u92(e0);
    }
}
