package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public abstract class e5b1 {
    public static final void a(f530 f530Var, float f, int i, float f2, Object obj, tls tlsVar, fid fidVar, int i2) {
        bts btsVar;
        f530 f530Var2;
        float f3;
        float f4;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1971264604);
        int i3 = i2 | 54 | (btsVar2.c(i) ? 256 : 128) | HProv.ALG_TYPE_SECURECHANNEL | (btsVar2.e(obj) ? 16384 : 8192) | (btsVar2.e(tlsVar) ? 131072 : 65536);
        if (btsVar2.V(i3 & 1, (74899 & i3) != 74898)) {
            boolean k = btsVar2.k(obj);
            Object Q = btsVar2.Q();
            if (k || Q == did.a) {
                Q = new qkp0();
                tlsVar.invoke(Q);
                btsVar2.o0(Q);
            }
            qkp0 qkp0Var = (qkp0) Q;
            c530 c530Var = c530.a;
            btsVar = btsVar2;
            xab1.a(ljs0.c(c530Var, 1.0f), null, wwg.S(566971662, true, new nkp0(16.0f, 8.0f, i, obj, qkp0Var), btsVar2), btsVar, HProv.ALG_TYPE_SECURECHANNEL, 6);
            f530Var2 = c530Var;
            f3 = 16.0f;
            f4 = 8.0f;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
            f3 = f;
            f4 = f2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new tn4(f530Var2, f3, i, f4, obj, tlsVar, i2);
        }
    }

    public static final float b(float f, float f2, float f3) {
        return cjb1.d(f, f2, f3);
    }

    public static void c(ImageView imageView, ColorStateList colorStateList) {
        imageView.setImageTintList(colorStateList);
    }

    public static void d(ImageView imageView, PorterDuff.Mode mode) {
        imageView.setImageTintMode(mode);
    }
}
