package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Base64;
import java.nio.ByteBuffer;

/* loaded from: classes15.dex */
public final class n0z0 extends zn50 {
    @Override // defpackage.zn50
    public final boolean a(xn50 xn50Var) {
        return jl40.l(xn50Var.b.getScheme(), "thumbhash");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    @Override // defpackage.zn50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ht10 c(xn50 xn50Var) {
        Bitmap bitmap;
        byte[] bArr;
        int i;
        int i2;
        Uri uri = xn50Var.b;
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            ny61.g(unr0.n(uri, "No thumbhash in uri: "));
            return null;
        }
        try {
            wz5 b = m0z0.b(Base64.decode(lastPathSegment, 10));
            bArr = b.c;
            i = b.a;
            i2 = b.b;
        } catch (Exception unused) {
        }
        if (i > 0 && i2 > 0 && bArr.length == i * i2 * 4) {
            bitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            bitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
            if (bitmap == null) {
                return new ht10(bitmap, (byte[]) null);
            }
            ny61.g(unr0.n(uri, "Failed to decode thumbhash from uri: "));
            return null;
        }
        bitmap = null;
        if (bitmap == null) {
        }
    }

    @Override // defpackage.zn50
    public final boolean d() {
        return true;
    }
}
