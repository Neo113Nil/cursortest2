package defpackage;

import java.util.ArrayDeque;

/* loaded from: classes10.dex */
public class fvu implements q430 {
    public static final ce70 b = ce70.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");
    public final l430 a;

    public static class a implements r430 {
        public final l430 a = new l430(500);

        @Override // defpackage.r430
        public final q430 a(ul40 ul40Var) {
            return new fvu(this.a);
        }
    }

    public fvu(l430 l430Var) {
        this.a = l430Var;
    }

    @Override // defpackage.q430
    public final p430 a(Object obj, int i, int i2, mg70 mg70Var) {
        cit citVar = (cit) obj;
        l430 l430Var = this.a;
        if (l430Var != null) {
            j430 j430Var = l430Var.a;
            k430 a2 = k430.a(citVar);
            Object c = j430Var.c(a2);
            ArrayDeque arrayDeque = k430.b;
            synchronized (arrayDeque) {
                arrayDeque.offer(a2);
            }
            cit citVar2 = (cit) c;
            if (citVar2 == null) {
                j430Var.f(k430.a(citVar), citVar);
            } else {
                citVar = citVar2;
            }
        }
        return new p430(citVar, new mwu(citVar, ((Integer) mg70Var.c(b)).intValue()));
    }

    @Override // defpackage.q430
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }

    public fvu() {
        this(null);
    }
}
