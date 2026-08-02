package xsna;

import android.util.Log;
import com.ironsource.X3;
import java.nio.ByteBuffer;

/* compiled from: RtmpHelper.java */
/* loaded from: classes3.dex */
public final class hqg0 {

    /* compiled from: RtmpHelper.java */
    public static class a extends Exception {
    }

    public static int a(int i, ByteBuffer byteBuffer) {
        return (byteBuffer.get(i + 2) & 255) | ((byteBuffer.get(i) & 255) << 16) | ((byteBuffer.get(i + 1) & 255) << 8);
    }

    public static int b(int i, ByteBuffer byteBuffer) {
        return (byteBuffer.get(i + 3) & 255) | ((byteBuffer.get(i) & 255) << 24) | ((byteBuffer.get(i + 1) & 255) << 16) | ((byteBuffer.get(i + 2) & 255) << 8);
    }

    public static String c(int i, ByteBuffer byteBuffer) throws a {
        if (byteBuffer.position() - i < 3) {
            Log.e("RtmpHelper", "rtmp_get_field_name buffer too small[" + (byteBuffer.position() - i) + X3.j.e);
            throw new a();
        }
        if (byteBuffer.get(i) == 0 && byteBuffer.get(i + 1) == 0) {
            if (byteBuffer.get(i + 2) == 9) {
                return null;
            }
            Log.e("RtmpHelper", "object end expected");
            throw new a();
        }
        int i2 = ((byteBuffer.get(i) & 255) << 8) | (byteBuffer.get(i + 1) & 255);
        if (i2 + 2 <= byteBuffer.limit()) {
            return new String(byteBuffer.array(), i + 2, i2);
        }
        throw new a();
    }

    public static void d(int i, ByteBuffer byteBuffer) throws a {
        if (byteBuffer.get(i) == 5) {
            return;
        }
        Log.e("RtmpHelper", "rtmp_read_null buffer not null[" + ((int) byteBuffer.get(i)) + X3.j.e);
        throw new a();
    }

    public static double e(int i, ByteBuffer byteBuffer) throws a {
        if (byteBuffer.position() - i < 9) {
            Log.e("RtmpHelper", "rtmp_read_number buffer too small[" + (byteBuffer.position() - i) + X3.j.e);
            throw new a();
        }
        if (byteBuffer.get(i) == 0) {
            return byteBuffer.getDouble(i + 1);
        }
        Log.e("RtmpHelper", "rtmp_read_number buffer not number[" + ((int) byteBuffer.get(i)) + X3.j.e);
        throw new a();
    }

    public static void f(int i, ByteBuffer byteBuffer) throws a {
        if (byteBuffer.get(i) == 3) {
            return;
        }
        Log.e("RtmpHelper", "object not foubd[" + ((int) byteBuffer.get(i)) + X3.j.e);
        throw new a();
    }

    public static String g(int i, ByteBuffer byteBuffer) throws a {
        if (byteBuffer.position() - i < 3) {
            Log.e("RtmpHelper", "rtmp_read_string buffer too small[" + (byteBuffer.position() - i) + X3.j.e);
            throw new a();
        }
        if (byteBuffer.get(i) == 2) {
            int i2 = ((byteBuffer.get(i + 1) & 255) << 8) | (byteBuffer.get(i + 2) & 255);
            if (i2 + 3 <= byteBuffer.limit()) {
                return new String(byteBuffer.array(), i + 3, i2);
            }
            throw new a();
        }
        Log.e("RtmpHelper", "rtmp_read_string buffer not string[" + ((int) byteBuffer.get(i)) + X3.j.e);
        throw new a();
    }

    public static void h(int i, int i2, byte[] bArr) {
        bArr[i] = (byte) (i2 >> 16);
        bArr[i + 1] = (byte) (i2 >> 8);
        bArr[i + 2] = (byte) i2;
    }

    public static void i(int i, int i2, byte[] bArr) {
        bArr[i + 3] = (byte) i2;
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i] = (byte) (i2 >> 24);
    }

    public static void j(String str, ByteBuffer byteBuffer) {
        byteBuffer.put((byte) (str.length() >> 8));
        byteBuffer.put((byte) (str.length() & 255));
        byteBuffer.put(str.getBytes());
    }

    public static void k(String str, ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 2);
        byteBuffer.put((byte) (str.length() >> 8));
        byteBuffer.put((byte) (str.length() & 255));
        byteBuffer.put(str.getBytes());
    }

    public static void l(int i, ByteBuffer byteBuffer) {
        if (i >= byteBuffer.position()) {
            byteBuffer.position(0);
            return;
        }
        int position = byteBuffer.position() - i;
        for (int i2 = 0; i2 < position; i2++) {
            byteBuffer.put(i2, byteBuffer.get(i + i2));
        }
        byteBuffer.position(position);
    }
}
