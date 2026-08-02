package yads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

/* loaded from: classes10.dex */
public final class r41 extends qp2 {
    public static final Object y = new Object();
    public final Object s;
    public vq2 t;
    public final Bitmap.Config u;
    public final int v;
    public final int w;
    public final ImageView.ScaleType x;

    public r41(String str, g41 g41Var, int i, int i2, ImageView.ScaleType scaleType, Bitmap.Config config, h41 h41Var) {
        super(0, str, h41Var);
        this.s = new Object();
        a(new qe0(2.0f, 1000, 2));
        this.t = g41Var;
        this.u = config;
        this.v = i;
        this.w = i2;
        this.x = scaleType;
    }

    @Override // yads.qp2
    public final void a() {
        super.a();
        synchronized (this.s) {
            this.t = null;
        }
    }

    public final wq2 b(g92 g92Var) {
        Bitmap decodeByteArray;
        byte[] bArr = g92Var.b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.v == 0 && this.w == 0) {
            options.inPreferredConfig = this.u;
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            int a = a(this.v, this.w, i, i2, this.x);
            int a2 = a(this.w, this.v, i2, i, this.x);
            options.inJustDecodeBounds = false;
            float f = 1.0f;
            while (true) {
                float f2 = 2.0f * f;
                if (f2 > Math.min(i / a, i2 / a2)) {
                    break;
                }
                f = f2;
            }
            options.inSampleSize = (int) f;
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (decodeByteArray != null && (decodeByteArray.getWidth() > a || decodeByteArray.getHeight() > a2)) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeByteArray, a, a2, true);
                decodeByteArray.recycle();
                decodeByteArray = createScaledBitmap;
            }
        }
        return decodeByteArray == null ? new wq2(new nc2(g92Var)) : new wq2(decodeByteArray, x11.a(g92Var));
    }

    @Override // yads.qp2
    public final int f() {
        return 1;
    }

    @Override // yads.qp2
    public final void a(Object obj) {
        vq2 vq2Var;
        Bitmap bitmap = (Bitmap) obj;
        synchronized (this.s) {
            vq2Var = this.t;
        }
        if (vq2Var != null) {
            vq2Var.a(bitmap);
        }
    }

    public static int a(int i, int i2, int i3, int i4, ImageView.ScaleType scaleType) {
        if (i != 0 || i2 != 0) {
            if (scaleType != ImageView.ScaleType.FIT_XY) {
                if (i == 0) {
                    return (int) (i3 * (i2 / i4));
                }
                if (i2 == 0) {
                    return i;
                }
                double d = i4 / i3;
                if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                    double d2 = i2;
                    return ((double) i) * d < d2 ? (int) (d2 / d) : i;
                }
                double d3 = i2;
                return ((double) i) * d > d3 ? (int) (d3 / d) : i;
            }
            if (i != 0) {
                return i;
            }
        }
        return i3;
    }

    @Override // yads.qp2
    public final wq2 a(g92 g92Var) {
        wq2 b;
        synchronized (y) {
            try {
                try {
                    b = b(g92Var);
                } catch (OutOfMemoryError e) {
                    int length = g92Var.b.length;
                    boolean z = pn3.a;
                    return new wq2(new nc2(e));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }
}
