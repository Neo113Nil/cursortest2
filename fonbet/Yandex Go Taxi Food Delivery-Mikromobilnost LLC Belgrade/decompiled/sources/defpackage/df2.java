package defpackage;

import android.graphics.ImageDecoder;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class df2 implements rtj0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ df2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.rtj0
    public final otj0 a(Object obj, int i, int i2, mg70 mg70Var) {
        switch (this.a) {
            case 0:
                return h0w.i(ImageDecoder.createSource((ByteBuffer) obj), i, i2, mg70Var);
            case 1:
                return h0w.i(ImageDecoder.createSource(g77.b((InputStream) obj)), i, i2, mg70Var);
            default:
                return h16.c((b16) this.b, ((tzt0) ((lgt) obj)).b());
        }
    }

    @Override // defpackage.rtj0
    public final boolean b(Object obj, mg70 mg70Var) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ImageHeaderParser$ImageType p = k4b1.p((ArrayList) ((h0w) obj2).b, (ByteBuffer) obj);
                if (p == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && p == ImageHeaderParser$ImageType.ANIMATED_AVIF)) {
                    break;
                }
                break;
            case 1:
                h0w h0wVar = (h0w) obj2;
                ImageHeaderParser$ImageType o = k4b1.o((ArrayList) h0wVar.b, (InputStream) obj, (g63) h0wVar.c);
                if (o == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && o == ImageHeaderParser$ImageType.ANIMATED_AVIF)) {
                    break;
                }
                break;
            default:
                break;
        }
        return true;
    }
}
