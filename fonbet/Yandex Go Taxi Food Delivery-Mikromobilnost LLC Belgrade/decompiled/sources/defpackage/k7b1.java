package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.yandex.go.design.compose.input.InputState;
import java.io.ByteArrayOutputStream;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class k7b1 {
    public static final void a(x9q0 x9q0Var, tls tlsVar, f530 f530Var, boolean z, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2019130817);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(x9q0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.a(z) ? 2048 : 1024;
        }
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            c530 c530Var = c530.a;
            f7b1.a(an91.m(c530Var, 4.0f, 0.0f, 2), wwg.S(-1447111629, true, new y740(25, x9q0Var, tlsVar), btsVar), btsVar, 48);
            if (z) {
                btsVar.e0(-908515259);
                yrl.c(null, null, btsVar, 0, 7);
                btsVar.t(false);
            } else {
                btsVar.e0(-908486429);
                btsVar.t(false);
            }
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gi0(x9q0Var, tlsVar, f530Var2, z, i, 21);
        }
    }

    public static final float b(Bitmap bitmap, int i, int i2) {
        float width = bitmap.getWidth() / i;
        float height = bitmap.getHeight() / i2;
        g();
        g();
        return Math.max(1.0f, Math.min(width, height));
    }

    public static final byte[] c(Bitmap bitmap, int i, int i2, int i3, int i4, int i5) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        g();
        g();
        float b = b(bitmap, i, i2);
        g();
        g();
        g();
        h(Bitmap.createScaledBitmap(bitmap, (int) (width / b), (int) (height / b), true), i4).compress(i5 != 1 ? i5 != 3 ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.PNG, i3, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static final boolean d(InputState inputState) {
        return inputState == InputState.EmptyFocused || inputState == InputState.EmptyUnfocused;
    }

    public static final boolean e(InputState inputState) {
        return inputState == InputState.ErrorUnfocused || inputState == InputState.ErrorFocused;
    }

    public static final boolean f(InputState inputState) {
        return inputState == InputState.ErrorFocused || inputState == InputState.EmptyFocused || inputState == InputState.FillFocused;
    }

    public static final void g() {
        if (b9v.c) {
            System.out.getClass();
        }
    }

    public static final Bitmap h(Bitmap bitmap, int i) {
        if (i % 360 == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(i);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
    }
}
