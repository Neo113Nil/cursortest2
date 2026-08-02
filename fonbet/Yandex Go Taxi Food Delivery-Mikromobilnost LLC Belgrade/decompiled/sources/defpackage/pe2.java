package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.yandex.images.FadingDrawable;
import com.yandex.images.ImageManager$From;

/* loaded from: classes15.dex */
public final class pe2 implements gb4 {
    public final ImageManager$From a;
    public final Drawable b;
    public final Bitmap c;
    public boolean w;

    public pe2(ImageManager$From imageManager$From, Drawable drawable, Bitmap bitmap) {
        this.a = imageManager$From;
        this.b = drawable;
        this.c = bitmap;
        bitmap.prepareToDraw();
    }

    @Override // defpackage.gb4
    public final Drawable a(Context context) {
        FadingDrawable fadingDrawable = new FadingDrawable(context, this.c, this.b, this.a, this.w);
        this.w = true;
        return fadingDrawable;
    }
}
