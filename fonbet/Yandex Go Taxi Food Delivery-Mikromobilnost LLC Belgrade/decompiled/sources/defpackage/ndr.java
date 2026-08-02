package defpackage;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* loaded from: classes10.dex */
public class ndr extends i16 {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(khx.a);

    @Override // defpackage.khx
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.i16
    public final Bitmap c(b16 b16Var, Bitmap bitmap, int i, int i2) {
        return sw01.b(b16Var, bitmap, i, i2);
    }

    @Override // defpackage.khx
    public final boolean equals(Object obj) {
        return obj instanceof ndr;
    }

    @Override // defpackage.khx
    public final int hashCode() {
        return 1572326941;
    }
}
