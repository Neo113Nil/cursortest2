package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

/* loaded from: classes10.dex */
public final class hoc implements n7s {
    public final int a;
    public final Bitmap.CompressFormat b;

    public hoc(int i) {
        this.a = i;
        this.b = i != 1 ? i != 3 ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.PNG;
    }

    @Override // defpackage.n7s
    public final void a(Context context, byte[] bArr, ByteArrayOutputStream byteArrayOutputStream, int i, int i2, int i3, int i4, boolean z, int i5) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inSampleSize = i5;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        float width = decodeByteArray.getWidth();
        float height = decodeByteArray.getHeight();
        qgb1.b("src width = " + width);
        qgb1.b("src height = " + height);
        float b = k7b1.b(decodeByteArray, i, i2);
        qgb1.b("scale = " + b);
        float f = width / b;
        float f2 = height / b;
        qgb1.b("dst width = " + f);
        qgb1.b("dst height = " + f2);
        Bitmap h = k7b1.h(Bitmap.createScaledBitmap(decodeByteArray, (int) f, (int) f2, true), i4);
        Bitmap.CompressFormat compressFormat = this.b;
        h.compress(compressFormat, i3, byteArrayOutputStream2);
        byte[] byteArray = byteArrayOutputStream2.toByteArray();
        if (!z || compressFormat != Bitmap.CompressFormat.JPEG) {
            byteArrayOutputStream.write(byteArray);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
        byteArrayOutputStream3.write(byteArray);
        byteArrayOutputStream.write(new tlo(bArr).a(context, byteArrayOutputStream3).toByteArray());
    }

    @Override // defpackage.n7s
    public final void b(Context context, String str, OutputStream outputStream, int i, int i2, int i3, int i4, boolean z, int i5, int i6) {
        if (i6 <= 0) {
            return;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = false;
            options.inPreferredConfig = Bitmap.Config.RGB_565;
            options.inSampleSize = i5;
            byte[] c = k7b1.c(BitmapFactory.decodeFile(str, options), i, i2, i3, i4, this.a);
            if (!z || this.b != Bitmap.CompressFormat.JPEG) {
                outputStream.write(c);
                return;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(c);
            outputStream.write(new tlo(str).a(context, byteArrayOutputStream).toByteArray());
        } catch (OutOfMemoryError unused) {
            System.gc();
            b(context, str, outputStream, i, i2, i3, i4, z, i5 * 2, i6 - 1);
        }
    }

    public final int c() {
        return this.a;
    }
}
