package androidx.compose.animation;

import com.google.ar.core.ImageMetadata;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.gl11;
import defpackage.jj2;
import defpackage.ldc;
import defpackage.m3u0;
import defpackage.sb2;
import defpackage.tls;
import defpackage.twt0;

/* loaded from: classes10.dex */
public abstract class m {
    public static final twt0 a = sb2.G(0.0f, 0.0f, 7, null);

    public static final m3u0 a(long j, jj2 jj2Var, String str, fid fidVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            jj2Var = a;
        }
        jj2 jj2Var2 = jj2Var;
        if ((i2 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        bts btsVar = (bts) fidVar;
        boolean k = btsVar.k(ldc.f(j));
        Object Q = btsVar.Q();
        if (k || Q == did.a) {
            tls tlsVar = h.a;
            Q = (gl11) ColorVectorConverterKt$ColorToVector$1.w.invoke(ldc.f(j));
            btsVar.o0(Q);
        }
        int i3 = i << 6;
        return androidx.compose.animation.core.b.c(new ldc(j), (gl11) Q, jj2Var2, null, str2, null, btsVar, (i & 14) | ((i << 3) & 896) | (57344 & i3) | (i3 & ImageMetadata.JPEG_GPS_COORDINATES), 8);
    }
}
