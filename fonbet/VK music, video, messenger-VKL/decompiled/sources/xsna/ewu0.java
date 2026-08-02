package xsna;

import android.graphics.drawable.Animatable;
import xsna.chs;

/* compiled from: VkFrescoImage.kt */
/* loaded from: classes17.dex */
public final class ewu0 implements kqj<mjw> {
    public final /* synthetic */ wh50<chs> b;
    public final /* synthetic */ wh50<Integer> c;
    public final /* synthetic */ int d;

    public ewu0(wh50<chs> wh50Var, wh50<Integer> wh50Var2, int i) {
        this.b = wh50Var;
        this.c = wh50Var2;
        this.d = i;
    }

    @Override // xsna.kqj
    public final /* bridge */ /* synthetic */ void a(Object obj, String str) {
    }

    @Override // xsna.kqj
    public final void b(String str, Throwable th) {
        uh50 C;
        wh50<Integer> wh50Var = this.c;
        wh50<chs> wh50Var2 = this.b;
        dak0 j = qak0.j();
        uh50 uh50Var = j instanceof uh50 ? (uh50) j : null;
        if (uh50Var == null || (C = uh50Var.C(null, null)) == null) {
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        }
        try {
            dak0 j2 = C.j();
            try {
                if (fwu0.i(wh50Var) < this.d) {
                    wh50Var.setValue(Integer.valueOf(wh50Var.getValue().intValue() + 1));
                } else {
                    wh50Var2.setValue(new chs.b(str, th));
                    wh50Var.setValue(0);
                    s3q0 s3q0Var = s3q0.a;
                }
                C.w().a();
            } finally {
                dak0.q(j2);
            }
        } finally {
        }
    }

    @Override // xsna.kqj
    public final void d(String str) {
        this.b.setValue(new chs.a(str));
    }

    @Override // xsna.kqj
    public final void e(String str, mjw mjwVar, Animatable animatable) {
        mjw mjwVar2 = mjwVar;
        int width = mjwVar2 != null ? mjwVar2.getWidth() : 0;
        int height = mjwVar2 != null ? mjwVar2.getHeight() : 0;
        this.c.setValue(0);
        this.b.setValue(new chs.e(str, width, height));
    }

    @Override // xsna.kqj
    public final void f(Object obj, String str) {
        this.b.setValue(new chs.c(str));
    }

    @Override // xsna.kqj
    public final void c(String str, Throwable th) {
    }
}
