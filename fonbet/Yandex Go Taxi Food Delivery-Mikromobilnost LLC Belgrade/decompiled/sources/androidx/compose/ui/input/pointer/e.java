package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tvd0;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public abstract class e {
    public static final void a(long j, tls tlsVar) {
        MotionEvent obtain = MotionEvent.obtain(j, j, 3, 0.0f, 0.0f, 0);
        obtain.setSource(0);
        ((PointerInteropFilter$pointerInputFilter$1$onCancel$1) tlsVar).invoke(obtain);
        obtain.recycle();
    }

    public static final void b(tvd0 tvd0Var, long j, tls tlsVar) {
        d(tvd0Var, j, tlsVar, true);
    }

    public static final void c(tvd0 tvd0Var, long j, tls tlsVar) {
        d(tvd0Var, j, tlsVar, false);
    }

    public static final void d(tvd0 tvd0Var, long j, tls tlsVar, boolean z) {
        MotionEvent c = tvd0Var.c();
        if (c == null) {
            ny61.g("The PointerEvent receiver cannot have a null MotionEvent.");
            return;
        }
        int action = c.getAction();
        if (z) {
            c.setAction(3);
        }
        int i = (int) (j >> 32);
        float f = -Float.intBitsToFloat(i);
        int i2 = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        c.offsetLocation(f, -Float.intBitsToFloat(i2));
        tlsVar.invoke(c);
        c.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        c.setAction(action);
    }
}
