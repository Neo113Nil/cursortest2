package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import java.util.Arrays;

/* compiled from: BlurPostProcessor.kt */
/* loaded from: classes12.dex */
public final class ug7 extends mk6 {
    public final Context d;
    public final int c = 25;
    public final int e = 3;
    public final ppj0 f = new ppj0(String.format(null, "IntrinsicBlur;%d", Arrays.copyOf(new Object[]{25}, 1)));

    public ug7(Context context) {
        this.d = context;
    }

    @Override // xsna.mk6, xsna.ktc0
    public final ww8 a() {
        return this.f;
    }

    @Override // xsna.mk6
    public final void d(Bitmap bitmap) {
        if (!bitmap.isMutable()) {
            throw new IllegalArgumentException();
        }
        if (!(((float) bitmap.getHeight()) <= 2048.0f)) {
            throw new IllegalArgumentException();
        }
        if (!(((float) bitmap.getWidth()) <= 2048.0f)) {
            throw new IllegalArgumentException();
        }
        int i = this.c;
        if (!(i > 0 && i <= 25)) {
            throw new IllegalArgumentException();
        }
        int i2 = this.e;
        if (!(i2 > 0)) {
            throw new IllegalArgumentException();
        }
        try {
            s1v.g(i2, i, bitmap);
        } catch (OutOfMemoryError e) {
            ahq.d("IterativeBoxBlurFilter", String.format(null, "OOM: %d iterations on %dx%d with %d radius", Arrays.copyOf(new Object[]{Integer.valueOf(i2), Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), Integer.valueOf(i)}, 4)));
            throw e;
        }
    }

    @Override // xsna.mk6
    public final void e(Bitmap bitmap, Bitmap bitmap2) {
        Context context = this.d;
        int i = this.c;
        if (!(i > 0 && i <= 25)) {
            throw new IllegalArgumentException();
        }
        RenderScript renderScript = null;
        try {
            RenderScript create = RenderScript.create(context);
            if (create == null) {
                throw new IllegalStateException("Required value was null.");
            }
            try {
                ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
                Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap2);
                if (createFromBitmap == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                Allocation createFromBitmap2 = Allocation.createFromBitmap(create, bitmap);
                if (createFromBitmap2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                create2.setRadius(i);
                create2.setInput(createFromBitmap);
                create2.forEach(createFromBitmap2);
                createFromBitmap2.copyTo(bitmap);
                create2.destroy();
                createFromBitmap.destroy();
                createFromBitmap2.destroy();
                create.destroy();
            } catch (Throwable th) {
                th = th;
                renderScript = create;
                if (renderScript != null) {
                    renderScript.destroy();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
