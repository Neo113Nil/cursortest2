package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.yandex.div.core.images.BitmapSource;

/* loaded from: classes.dex */
public final class otk extends btk {
    public final btk a;
    public final Context b;
    public final /* synthetic */ ptk c;

    public otk(ptk ptkVar, btk btkVar, Context context) {
        this.c = ptkVar;
        this.a = btkVar;
        this.b = context;
    }

    @Override // defpackage.btk
    public final String a() {
        return this.a.a();
    }

    @Override // defpackage.btk
    public final void d(Throwable th) {
        this.a.d(th);
    }

    @Override // defpackage.btk
    public final void e() {
        this.a.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r2.getIntrinsicHeight() > r4) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r2.getHeight() > r1) goto L8;
     */
    @Override // defpackage.btk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(r8 r8Var) {
        r8 r8Var2;
        boolean z = r8Var instanceof thk;
        ptk ptkVar = this.c;
        if (z) {
            thk thkVar = (thk) r8Var;
            Bitmap bitmap = thkVar.c;
            int width = bitmap.getWidth();
            int i = ptkVar.e;
            if (width <= i) {
                r8Var2 = thkVar;
            }
            r8Var2 = new thk(h(bitmap), (BitmapSource) r8Var.b);
        } else {
            if (!(r8Var instanceof uhk)) {
                w511.b();
                return;
            }
            uhk uhkVar = (uhk) r8Var;
            Drawable drawable = uhkVar.c;
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int i2 = ptkVar.e;
            if (intrinsicWidth <= i2) {
                r8Var2 = uhkVar;
            }
            int intrinsicWidth2 = drawable.getIntrinsicWidth();
            int i3 = ptkVar.e;
            if (intrinsicWidth2 > i3 || drawable.getIntrinsicHeight() > i3) {
                int intrinsicWidth3 = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                float max = ptkVar.e / Math.max(intrinsicWidth3, intrinsicHeight);
                Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth3, intrinsicHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                drawable.setBounds(0, 0, intrinsicWidth3, intrinsicHeight);
                drawable.draw(canvas);
                drawable = new BitmapDrawable(this.b.getResources(), Bitmap.createScaledBitmap(createBitmap, (int) (intrinsicWidth3 * max), (int) (intrinsicHeight * max), true));
            }
            r8Var2 = new uhk(drawable, (BitmapSource) r8Var.b);
        }
        this.a.f(r8Var2);
    }

    @Override // defpackage.btk
    public final void g(bd7 bd7Var) {
        Bitmap a = bd7Var.a();
        int width = a.getWidth();
        int i = this.c.e;
        if (width > i || a.getHeight() > i) {
            bd7Var = new bd7(h(bd7Var.a()), bd7Var.b(), bd7Var.c(), bd7Var.d());
        }
        this.a.g(bd7Var);
    }

    public final Bitmap h(Bitmap bitmap) {
        float max = this.c.e / Math.max(bitmap.getWidth(), bitmap.getHeight());
        return Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * max), (int) (bitmap.getHeight() * max), true);
    }
}
