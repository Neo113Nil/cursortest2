package xsna;

import android.annotation.SuppressLint;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import com.mbridge.msdk.foundation.download.Command;

/* compiled from: DrawableProperties.kt */
/* loaded from: classes.dex */
public final class bko {
    public boolean b;
    public ColorFilter c;
    public int a = -1;
    public int d = -1;
    public int e = -1;

    @SuppressLint({Command.HTTP_HEADER_RANGE})
    public final void a(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        int i = this.a;
        if (i != -1) {
            drawable.setAlpha(i);
        }
        if (this.b) {
            drawable.setColorFilter(this.c);
        }
        int i2 = this.d;
        if (i2 != -1) {
            drawable.setDither(i2 != 0);
        }
        int i3 = this.e;
        if (i3 != -1) {
            drawable.setFilterBitmap(i3 != 0);
        }
    }
}
