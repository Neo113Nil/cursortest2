package xsna;

import android.graphics.drawable.Animatable;
import java.lang.reflect.Method;
import xsna.d7d0;

/* compiled from: VKImageDrawable.kt */
/* loaded from: classes2.dex */
public final class dcr0 extends fc6<mjw> {
    public final /* synthetic */ ccr0 c;

    public dcr0(ccr0 ccr0Var) {
        this.c = ccr0Var;
    }

    @Override // xsna.fc6, xsna.kqj
    public final void b(String str, Throwable th) {
        ccr0 ccr0Var = this.c;
        d7d0.a aVar = ccr0Var.k;
        if (aVar != null) {
            aVar.b(str, th);
        }
        ccr0Var.l = 0;
        int i = ccr0Var.o;
        if (i < 3) {
            ccr0Var.o = i + 1;
            dlo dloVar = ccr0Var.h.e;
            if (dloVar != null) {
                ccr0Var.g.reset();
                try {
                    Method declaredMethod = ce.class.getDeclaredMethod("C", null);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(dloVar, null);
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // xsna.fc6, xsna.kqj
    public final void d(String str) {
        d7d0.a aVar = this.c.k;
        if (aVar != null) {
            aVar.onCancel(str);
        }
    }

    @Override // xsna.fc6, xsna.kqj
    public final void e(String str, Object obj, Animatable animatable) {
        mjw mjwVar = (mjw) obj;
        int width = mjwVar != null ? mjwVar.getWidth() : 0;
        ccr0 ccr0Var = this.c;
        ccr0Var.l = width;
        int height = mjwVar != null ? mjwVar.getHeight() : 0;
        d7d0.a aVar = ccr0Var.k;
        if (aVar != null) {
            aVar.t(ccr0Var.l, height, str);
        }
    }

    @Override // xsna.fc6, xsna.kqj
    public final void f(Object obj, String str) {
    }
}
