package yads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import kotlin.Lazy;
import kotlin.Result;
import xsna.bpn0;
import xsna.brm0;
import xsna.drm0;
import xsna.jw5;

/* loaded from: classes10.dex */
public final class tj2 {
    public static final Lazy a = new bpn0(sj2.b);

    public static Bitmap a(String str) {
        Object failure;
        try {
            byte[] decode = Base64.decode(drm0.U(str, "data:image/png;base64,"), 0);
            if (!brm0.B(str, "data:image/png;base64,", false)) {
                decode = decode.length == 0 ? new byte[0] : jw5.x((byte[]) a.getValue(), decode);
            }
            failure = decode.length == 0 ? null : BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return (Bitmap) (failure instanceof Result.Failure ? null : failure);
    }
}
