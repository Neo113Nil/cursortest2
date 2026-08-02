package xsna;

import android.graphics.drawable.Drawable;
import com.facebook.animated.gif.GifImage;
import com.facebook.fresco.animation.bitmap.BitmapAnimationBackend;
import com.vk.imageloader.ImageScreenSize;
import java.lang.reflect.Field;

/* compiled from: AnimatedDrawableFactoryDelegate.kt */
/* loaded from: classes2.dex */
public final class fj2 implements tjo {
    public final tjo a;

    public fj2(tjo tjoVar) {
        this.a = tjoVar;
    }

    @Override // xsna.tjo
    public final Drawable a(svf svfVar) {
        pk2 x = ((pvf) svfVar).x();
        if (x == null) {
            throw new IllegalArgumentException("image can't be null");
        }
        Drawable a = this.a.a(new pvf(new wk2(x), 0));
        if (a == null) {
            return null;
        }
        int h = ImageScreenSize.VERY_BIG.h();
        if ((x.getWidth() < h && x.getHeight() < h) || !(x instanceof GifImage)) {
            return a;
        }
        aj2 aj2Var = a instanceof aj2 ? (aj2) a : null;
        ym2 ym2Var = aj2Var != null ? aj2Var.b : null;
        an2 an2Var = ym2Var instanceof an2 ? (an2) ym2Var : null;
        BitmapAnimationBackend bitmapAnimationBackend = an2Var != null ? an2Var.b : null;
        Field declaredField = BitmapAnimationBackend.class.getDeclaredField("mBitmapFrameRenderer");
        declaredField.setAccessible(true);
        declaredField.set(bitmapAnimationBackend, new hc7((gc7) declaredField.get(bitmapAnimationBackend)));
        return a;
    }

    @Override // xsna.tjo
    public final boolean b(svf svfVar) {
        return this.a.b(svfVar);
    }
}
