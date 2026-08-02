package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.net.Uri;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: CustomVirtualBackgroundImageUploadConverter.kt */
/* loaded from: classes7.dex */
public final class epk {
    public static final k9x a = new k9x(400, 2000, 1);

    public static Uri a(Context context, Uri uri) {
        float max;
        int i;
        int attributeInt;
        int height;
        int i2;
        InputStream openInputStream = context.getContentResolver().openInputStream(uri);
        if (openInputStream == null) {
            throw new IOException("Can't load image options");
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(openInputStream, null, options);
            openInputStream.close();
            k9x k9xVar = a;
            int i3 = k9xVar.b;
            int i4 = k9xVar.b;
            int i5 = k9xVar.c;
            int i6 = options.outWidth;
            if (i3 <= i6 && i6 <= i5 && i3 <= (i2 = options.outHeight) && i2 <= i5) {
                return uri;
            }
            if (i6 < 200 || options.outHeight < 200) {
                throw new RuntimeException("Image is too small");
            }
            options.inSampleSize = kd7.a(2000, 2000, options);
            options.inJustDecodeBounds = false;
            openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream != null) {
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream, null, options);
                    openInputStream.close();
                    if (decodeStream != null) {
                        int width = decodeStream.getWidth();
                        if (i4 > width || width > i5 || i4 > (height = decodeStream.getHeight()) || height > i5) {
                            if (decodeStream.getWidth() < 200 || decodeStream.getHeight() < 200) {
                                throw new RuntimeException("Image is too small");
                            }
                            if (decodeStream.getWidth() < 400 || decodeStream.getHeight() < 400) {
                                float f = 400;
                                max = Math.max(f / decodeStream.getWidth(), f / decodeStream.getHeight());
                            } else {
                                float f2 = 2000;
                                max = Math.min(f2 / decodeStream.getWidth(), f2 / decodeStream.getHeight());
                            }
                            decodeStream = Bitmap.createScaledBitmap(decodeStream, Math.max(400, (int) (decodeStream.getWidth() * max)), Math.max(400, (int) (decodeStream.getHeight() * max)), true);
                        }
                        Bitmap b = (decodeStream.getWidth() > 2000 || decodeStream.getHeight() > 2000) ? kd7.b(decodeStream, Math.min(decodeStream.getWidth(), 2000), Math.min(decodeStream.getHeight(), 2000), false, false) : decodeStream;
                        if (b != null) {
                            decodeStream = b;
                        }
                        openInputStream = context.getContentResolver().openInputStream(uri);
                        if (openInputStream != null) {
                            try {
                                attributeInt = new ExifInterface(openInputStream).getAttributeInt("Orientation", 0);
                            } catch (IOException unused) {
                            } catch (Throwable th) {
                            }
                            if (attributeInt == 3) {
                                i = 180;
                            } else if (attributeInt != 6) {
                                if (attributeInt == 8) {
                                    i = atv0.b;
                                }
                                i = 0;
                            } else {
                                i = 90;
                            }
                            openInputStream.close();
                        } else {
                            i = 0;
                        }
                        Bitmap k = kd7.k(decodeStream, i, false);
                        if (k != null) {
                            decodeStream = k;
                        }
                        File s = com.vk.core.files.a.s();
                        FileOutputStream fileOutputStream = new FileOutputStream(s);
                        try {
                            decodeStream.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                            fileOutputStream.close();
                            return Uri.fromFile(s);
                        } finally {
                        }
                    }
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
            throw new IOException("Can't load image");
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }
}
