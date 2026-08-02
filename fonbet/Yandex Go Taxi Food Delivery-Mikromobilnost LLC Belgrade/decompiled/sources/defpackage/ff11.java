package defpackage;

import com.airbnb.lottie.model.content.ShapeTrimPath$Type;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ff11 implements uee, e35 {
    public final boolean a;
    public final ArrayList b = new ArrayList();
    public final ShapeTrimPath$Type c;
    public final kor d;
    public final kor e;
    public final kor f;

    public ff11(l35 l35Var, t0j0 t0j0Var) {
        this.a = t0j0Var.f();
        this.c = t0j0Var.e();
        kor I = t0j0Var.d().I();
        this.d = I;
        kor I2 = t0j0Var.b().I();
        this.e = I2;
        kor I3 = t0j0Var.c().I();
        this.f = I3;
        l35Var.c(I);
        l35Var.c(I2);
        l35Var.c(I3);
        I.a(this);
        I2.a(this);
        I3.a(this);
    }

    public final void a(e35 e35Var) {
        this.b.add(e35Var);
    }

    @Override // defpackage.e35
    public final void d() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            ((e35) arrayList.get(i)).d();
            i++;
        }
    }

    @Override // defpackage.uee
    public final void e(List list, List list2) {
    }
}
