package defpackage;

import android.content.ClipboardManager;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Bundle;
import androidx.compose.foundation.interaction.a;
import androidx.compose.runtime.f;
import androidx.media3.common.util.GlUtil$GlException;
import com.google.android.gms.gcm.Task;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class lxa1 {
    public static final void a(e0m0 e0m0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-117541330);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(e0m0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 32 : 16;
        }
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.j(evu0.k0(e0m0Var.d).toString());
                btsVar2.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            Object Q2 = btsVar2.Q();
            if (Q2 == o430Var) {
                Q2 = f.j(Boolean.FALSE);
                btsVar2.o0(Q2);
            }
            oz40 oz40Var2 = (oz40) Q2;
            Object Q3 = btsVar2.Q();
            if (Q3 == o430Var) {
                Q3 = ly3.i(btsVar2);
            }
            zx40 zx40Var = (zx40) Q3;
            if (((Boolean) a.c(zx40Var, btsVar2).getValue()).booleanValue()) {
                tlsVar.invoke(a0m0.a);
            }
            Object Q4 = btsVar2.Q();
            if (Q4 == o430Var) {
                Q4 = new bgc(12);
                btsVar2.o0(Q4);
            }
            btsVar = btsVar2;
            cx20.a(null, null, tnb1.e(null, (sls) Q4, btsVar2, 5), null, null, false, false, wwg.S(-443555452, true, new wg0(28, tlsVar), btsVar2), wwg.S(1774596284, true, new vg0((Object) e0m0Var, (Object) oz40Var, (Object) oz40Var2, tlsVar, (Object) zx40Var, 12), btsVar2), btsVar, 113246208, HProv.PP_PASSWD_TERM);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lt90(e0m0Var, tlsVar, i, 25);
        }
    }

    public static void b(int i, int i2) {
        GLES20.glBindTexture(i, i2);
        c();
        GLES20.glTexParameteri(i, Task.EXTRAS_LIMIT_BYTES, 9729);
        c();
        GLES20.glTexParameteri(i, 10241, 9729);
        c();
        GLES20.glTexParameteri(i, 10242, 33071);
        c();
        GLES20.glTexParameteri(i, 10243, 33071);
        c();
    }

    public static void c() {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = oyr.r(new StringBuilder("error code: 0x"), glGetError);
            }
            sb.append("glError: ");
            sb.append(gluErrorString);
            z = true;
        }
        if (z) {
            throw new GlUtil$GlException(sb.toString());
        }
    }

    public static void d(String str, boolean z) {
        if (!z) {
            throw new GlUtil$GlException(str);
        }
    }

    public static final void e(ClipboardManager clipboardManager) {
        clipboardManager.clearPrimaryClip();
    }

    public static FloatBuffer f(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    public static void g(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    public static Object h(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        String canonicalName = cls.getCanonicalName();
        ny61.r(oyr.t(b64.v("Invalid conditional user property field type. '", str, "' expected [", canonicalName, "] but was ["), obj2.getClass().getCanonicalName(), "]"));
        return null;
    }
}
