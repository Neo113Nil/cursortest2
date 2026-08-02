package xsna;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import xsna.c1z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public abstract class o0z0 {
    public static Bitmap a(String str) {
        byte[] decode = Base64.decode(str, 0);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = 420;
        options.inTargetDensity = c1z0.a.b;
        return BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
    }
}
