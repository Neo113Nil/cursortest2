package defpackage;

import android.view.View;
import androidx.compose.runtime.snapshots.a;
import java.io.InputStream;

/* loaded from: classes9.dex */
public final /* synthetic */ class he7 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;

    public /* synthetic */ he7(ie7 ie7Var, tls tlsVar) {
        this.a = 0;
        this.b = tlsVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                kg90 kg90Var = (kg90) tlsVar.invoke((InputStream) obj);
                if (kg90Var instanceof jg90) {
                    return new cyg(kg90Var);
                }
                if (kg90Var instanceof ig90) {
                    return new byg(kg90Var);
                }
                w511.b();
                return null;
            case 1:
                return (wys) tlsVar.invoke((View) obj);
            case 2:
                i2t0 i2t0Var = (i2t0) tlsVar.invoke((a) obj);
                synchronized (q2t0.c) {
                    q2t0.d = q2t0.d.f(i2t0Var.g());
                }
                return i2t0Var;
            case 3:
                tlsVar.invoke(obj);
                return zy11.a;
            default:
                tlsVar.invoke((String) obj);
                return zy11.a;
        }
    }

    public /* synthetic */ he7(int i, tls tlsVar) {
        this.a = i;
        this.b = tlsVar;
    }
}
