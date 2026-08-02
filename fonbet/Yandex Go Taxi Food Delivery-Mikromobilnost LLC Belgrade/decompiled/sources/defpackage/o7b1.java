package defpackage;

import android.graphics.Bitmap;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* loaded from: classes15.dex */
public abstract class o7b1 {
    public static final long a(ByteArrayInputStream byteArrayInputStream, int i) {
        long j = 0;
        if (i > 8) {
            ny61.g("Could not read a number of more than 8 bytes.");
            return 0L;
        }
        for (int i2 = 0; i2 < i; i2++) {
            int read = byteArrayInputStream.read();
            if (read < 0) {
                throw new IOException("Missing length bytes: Expected " + i + ", got " + i2 + '.');
            }
            j = (j << 8) | read;
        }
        return j;
    }

    public static final byte[] b(ByteArrayInputStream byteArrayInputStream) {
        int a = (int) a(byteArrayInputStream, (int) (Math.ceil(Math.log(65535.0d) / z6e.a) / 8.0d));
        byte[] bArr = new byte[a];
        try {
            int read = byteArrayInputStream.read(bArr);
            if (read == a) {
                return bArr;
            }
            throw new IOException("Incomplete data. Expected " + a + " bytes, had " + read + '.');
        } catch (IOException e) {
            dac.g("Error while reading variable-length data", e);
            return null;
        }
    }

    public static final Bitmap c(Bitmap bitmap) {
        float min = Math.min(100.0f / bitmap.getWidth(), 100.0f / bitmap.getHeight());
        if (min > 1.0f) {
            min = 1.0f;
        }
        return Bitmap.createScaledBitmap(bitmap, y6i0.d((int) (bitmap.getWidth() * min), 1, 100), y6i0.d((int) (bitmap.getHeight() * min), 1, 100), true);
    }

    public static final f530 d(f530 f530Var) {
        return fnq0.b(f530Var, false, new tyo0(23));
    }
}
