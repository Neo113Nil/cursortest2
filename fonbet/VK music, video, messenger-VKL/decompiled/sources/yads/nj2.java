package yads;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.LinkedHashMap;

/* loaded from: classes10.dex */
public final class nj2 {
    public final xr a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;

    public /* synthetic */ nj2(Context context) {
        this(new xr(context, 0));
    }

    public final Bitmap a(x41 x41Var) {
        String str = x41Var.c;
        Bitmap bitmap = (Bitmap) this.b.get(str);
        if (bitmap != null) {
            return bitmap;
        }
        tb3 tb3Var = x92.d.a(this.a.a).c;
        String str2 = x41Var.c;
        Bitmap a = tb3Var.a(str2);
        if (a != null && a.getWidth() == 1 && a.getHeight() == 1) {
            a = Bitmap.createScaledBitmap(a, x41Var.a, x41Var.b, false);
            tb3Var.a(str2, a);
        }
        if (a == null) {
            return null;
        }
        this.b.put(str, a);
        return a;
    }

    public nj2(xr xrVar) {
        this.a = xrVar;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
    }
}
