package defpackage;

import java.lang.reflect.Method;

/* loaded from: classes9.dex */
public final class pc90 extends d6z {
    public final /* synthetic */ int f;
    public final Method g;
    public final int h;

    public /* synthetic */ pc90(Method method, int i, int i2) {
        this.f = i2;
        this.g = method;
        this.h = i;
    }

    @Override // defpackage.d6z
    public final void c(q5j0 q5j0Var, Object obj) {
        int i = this.f;
        int i2 = this.h;
        Method method = this.g;
        switch (i) {
            case 0:
                meu meuVar = (meu) obj;
                if (meuVar == null) {
                    throw udq0.J(method, i2, "Headers parameter must not be null.", new Object[0]);
                }
                keu keuVar = q5j0Var.f;
                keuVar.getClass();
                int size = meuVar.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ooc.h(keuVar, meuVar.b(i3), meuVar.f(i3));
                }
                return;
            default:
                if (obj == null) {
                    throw udq0.J(method, i2, "@Url parameter is null.", new Object[0]);
                }
                q5j0Var.c = obj.toString();
                return;
        }
    }
}
