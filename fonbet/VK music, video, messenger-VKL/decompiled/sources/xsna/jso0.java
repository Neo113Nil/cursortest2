package xsna;

import android.graphics.Bitmap;
import android.util.Base64;
import android.util.Size;
import com.unity3d.services.UnityAdsConstants;
import java.nio.ByteBuffer;
import xsna.hso0;

/* compiled from: ThumbHashEncoder.kt */
/* loaded from: classes2.dex */
public final class jso0 {
    public static String a(Bitmap bitmap) {
        int i;
        hso0.a aVar;
        bpn0 bpn0Var = i0q0.a;
        float max = Math.max(bitmap.getWidth(), bitmap.getHeight());
        float f = 100;
        Size size = new Size((int) ((bitmap.getWidth() / max) * f), (int) (f * (bitmap.getHeight() / max)));
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, size.getWidth(), size.getHeight(), true);
        Bitmap.Config config = createScaledBitmap.getConfig();
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        Bitmap copy = config != config2 ? createScaledBitmap.copy(config2, false) : createScaledBitmap;
        ByteBuffer allocate = ByteBuffer.allocate(copy.getHeight() * copy.getRowBytes());
        copy.copyPixelsToBuffer(allocate);
        byte[] array = allocate.array();
        int width = createScaledBitmap.getWidth();
        int height = createScaledBitmap.getHeight();
        if (width > 100 || height > 100) {
            throw new IllegalArgumentException(width + "x" + height + " doesn't fit in 100x100");
        }
        int i2 = 0;
        int i3 = 0;
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        while (true) {
            i = width * height;
            if (i2 >= i) {
                break;
            }
            float f6 = (array[i3 + 3] & 255) / 255.0f;
            float f7 = f6 / 255.0f;
            f3 += (array[i3] & 255) * f7;
            f4 += (array[i3 + 1] & 255) * f7;
            f5 = (f7 * (array[i3 + 2] & 255)) + f5;
            f2 += f6;
            i2++;
            i3 += 4;
        }
        if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f3 /= f2;
            f4 /= f2;
            f5 /= f2;
        }
        boolean z = f2 < ((float) i);
        int i4 = z ? 5 : 7;
        int max2 = Math.max(1, Math.round((i4 * width) / Math.max(width, height)));
        int max3 = Math.max(1, Math.round((i4 * height) / Math.max(width, height)));
        float[] fArr = new float[i];
        float[] fArr2 = new float[i];
        float[] fArr3 = new float[i];
        boolean z2 = z;
        float[] fArr4 = new float[i];
        int i5 = 0;
        int i6 = 0;
        while (i5 < i) {
            int i7 = i5;
            float f8 = (array[i6 + 3] & 255) / 255.0f;
            float f9 = 1.0f - f8;
            float f10 = f8 / 255.0f;
            float f11 = ((array[i6] & 255) * f10) + (f3 * f9);
            float f12 = ((array[i6 + 1] & 255) * f10) + (f4 * f9);
            float f13 = (f10 * (array[i6 + 2] & 255)) + (f9 * f5);
            float f14 = f11 + f12;
            fArr[i7] = (f14 + f13) / 3.0f;
            fArr2[i7] = (f14 / 2.0f) - f13;
            fArr3[i7] = f11 - f12;
            fArr4[i7] = f8;
            i5 = i7 + 1;
            i6 += 4;
        }
        hso0.a aVar2 = new hso0.a(Math.max(3, max2), Math.max(3, max3));
        aVar2.a(fArr, width, height);
        hso0.a aVar3 = new hso0.a(3, 3);
        aVar3.a(fArr2, width, height);
        hso0.a aVar4 = new hso0.a(3, 3);
        aVar4.a(fArr3, width, height);
        if (z2) {
            aVar = new hso0.a(5, 5);
            aVar.a(fArr4, width, height);
        } else {
            aVar = null;
        }
        boolean z3 = width > height;
        int round = Math.round(aVar2.c * 63.0f) | (Math.round((aVar3.c * 31.5f) + 31.5f) << 6) | (Math.round((aVar4.c * 31.5f) + 31.5f) << 12) | (Math.round(aVar2.e * 31.0f) << 18) | (z2 ? 8388608 : 0);
        if (z3) {
            max2 = max3;
        }
        int round2 = (z3 ? 32768 : 0) | max2 | (Math.round(aVar3.e * 63.0f) << 3) | (Math.round(aVar4.e * 63.0f) << 9);
        int i8 = z2 ? 6 : 5;
        byte[] bArr = new byte[(((((aVar2.d.length + aVar3.d.length) + aVar4.d.length) + (z2 ? aVar.d.length : 0)) + 1) / 2) + i8];
        bArr[0] = (byte) round;
        bArr[1] = (byte) (round >> 8);
        bArr[2] = (byte) (round >> 16);
        bArr[3] = (byte) round2;
        bArr[4] = (byte) (round2 >> 8);
        if (z2) {
            bArr[5] = (byte) (Math.round(aVar.c * 15.0f) | (Math.round(aVar.e * 15.0f) << 4));
        }
        int b = aVar4.b(i8, aVar3.b(i8, aVar2.b(i8, 0, bArr), bArr), bArr);
        if (z2) {
            aVar.b(i8, b, bArr);
        }
        if (!createScaledBitmap.equals(bitmap)) {
            createScaledBitmap.recycle();
        }
        if (!copy.equals(createScaledBitmap)) {
            copy.recycle();
        }
        return Base64.encodeToString(bArr, 3);
    }
}
