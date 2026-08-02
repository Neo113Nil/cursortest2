package androidx.compose.animation.core;

import com.google.ar.core.ImageMetadata;
import defpackage.bts;
import defpackage.ci9;
import defpackage.did;
import defpackage.fid;
import defpackage.gl11;
import defpackage.gtq0;
import defpackage.j0;
import defpackage.jj2;
import defpackage.jl40;
import defpackage.jx31;
import defpackage.m3u0;
import defpackage.oz40;
import defpackage.qar;
import defpackage.sb2;
import defpackage.sls;
import defpackage.tls;
import defpackage.twt0;
import defpackage.wls;
import defpackage.y7m;
import defpackage.zpn;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class b {
    public static final twt0 a = sb2.G(0.0f, 0.0f, 7, null);
    public static final twt0 b;
    public static final twt0 c;

    static {
        Map map = jx31.a;
        b = sb2.G(0.0f, 0.0f, 3, new y7m(0.4f));
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        c = sb2.G(0.0f, 0.0f, 3, 1);
    }

    public static final m3u0 a(float f, qar qarVar, String str, tls tlsVar, fid fidVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            qarVar = b;
        }
        qar qarVar2 = qarVar;
        if ((i2 & 4) != 0) {
            str = "DpAnimation";
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            tlsVar = null;
        }
        int i3 = i << 6;
        return c(new y7m(f), gtq0.h, qarVar2, null, str2, tlsVar, fidVar, (i & 14) | ((i << 3) & 896) | (57344 & i3) | (i3 & ImageMetadata.JPEG_GPS_COORDINATES), 8);
    }

    public static final m3u0 b(float f, jj2 jj2Var, String str, tls tlsVar, fid fidVar, int i, int i2) {
        jj2 jj2Var2;
        int i3 = i2 & 2;
        twt0 twt0Var = a;
        if (i3 != 0) {
            jj2Var = twt0Var;
        }
        if ((i2 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        tls tlsVar2 = (i2 & 16) != 0 ? null : tlsVar;
        if (jj2Var == twt0Var) {
            bts btsVar = (bts) fidVar;
            btsVar.e0(1144115775);
            boolean b2 = btsVar.b(0.01f);
            Object Q = btsVar.Q();
            if (b2 || Q == did.a) {
                Q = sb2.G(0.0f, 0.0f, 3, Float.valueOf(0.01f));
                btsVar.o0(Q);
            }
            btsVar.t(false);
            jj2Var2 = (twt0) Q;
        } else {
            bts btsVar2 = (bts) fidVar;
            btsVar2.e0(1144225701);
            btsVar2.t(false);
            jj2Var2 = jj2Var;
        }
        int i4 = i << 3;
        return c(Float.valueOf(f), gtq0.f, jj2Var2, null, str2, tlsVar2, fidVar, (i & 14) | (57344 & i4) | (i4 & ImageMetadata.JPEG_GPS_COORDINATES), 0);
    }

    public static final m3u0 c(Object obj, gl11 gl11Var, jj2 jj2Var, Float f, String str, tls tlsVar, fid fidVar, int i, int i2) {
        if ((i2 & 8) != 0) {
            f = null;
        }
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        Object obj2 = did.a;
        if (Q == obj2) {
            Q = androidx.compose.runtime.f.j(null);
            btsVar.o0(Q);
        }
        oz40 oz40Var = (oz40) Q;
        Object Q2 = btsVar.Q();
        if (Q2 == obj2) {
            Q2 = new a(obj, gl11Var, f, str);
            btsVar.o0(Q2);
        }
        a aVar = (a) Q2;
        oz40 n = androidx.compose.runtime.f.n(tlsVar, btsVar);
        if (f != null && (jj2Var instanceof twt0)) {
            twt0 twt0Var = (twt0) jj2Var;
            if (!jl40.l(twt0Var.c, f)) {
                jj2Var = new twt0(twt0Var.a, twt0Var.b, f);
            }
        }
        oz40 n2 = androidx.compose.runtime.f.n(jj2Var, btsVar);
        Object Q3 = btsVar.Q();
        if (Q3 == obj2) {
            Q3 = sb2.a(-1, null, null, 6);
            btsVar.o0(Q3);
        }
        ci9 ci9Var = (ci9) Q3;
        boolean e = btsVar.e(ci9Var) | ((((i & 14) ^ 6) > 4 && btsVar.e(obj)) || (i & 6) == 4);
        Object Q4 = btsVar.Q();
        if (e || Q4 == obj2) {
            Q4 = new j0(26, ci9Var, obj);
            btsVar.o0(Q4);
        }
        zpn.i((sls) Q4, btsVar);
        boolean e2 = btsVar.e(ci9Var) | btsVar.e(aVar) | btsVar.k(n2) | btsVar.k(n);
        Object Q5 = btsVar.Q();
        if (e2 || Q5 == obj2) {
            Object animateAsStateKt$animateValueAsState$3$1 = new AnimateAsStateKt$animateValueAsState$3$1(ci9Var, aVar, n2, n, null);
            btsVar.o0(animateAsStateKt$animateValueAsState$3$1);
            Q5 = animateAsStateKt$animateValueAsState$3$1;
        }
        zpn.e(btsVar, (wls) Q5, ci9Var);
        m3u0 m3u0Var = (m3u0) oz40Var.getValue();
        return m3u0Var == null ? aVar.d : m3u0Var;
    }
}
