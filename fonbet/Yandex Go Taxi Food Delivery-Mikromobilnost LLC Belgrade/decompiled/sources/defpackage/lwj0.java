package defpackage;

import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;

/* loaded from: classes9.dex */
public abstract class lwj0 {
    public final qn11 b(Class cls) {
        un11 un11Var;
        zn11 a = getA();
        if (a == null || (un11Var = (un11) a.a.get(cls)) == null) {
            return null;
        }
        return un11Var.a;
    }

    public final n96 c(Class cls) {
        zn11 a = getA();
        if (a != null) {
            un11 un11Var = (un11) a.a.get(cls);
            n96 n96Var = (n96) (un11Var != null ? un11Var.a : null);
            if (n96Var != null && n96Var.b()) {
                return (n96) cls.cast(n96Var);
            }
        }
        return null;
    }

    public final qn11 d(qn11 qn11Var) {
        qn11 b = b(qn11Var.getClass());
        return b == null ? qn11Var : b;
    }

    /* renamed from: e */
    public abstract zn11 getA();

    public final boolean f(SimpleBooleanExperiment simpleBooleanExperiment) {
        String id = simpleBooleanExperiment.getId();
        zn11 a = getA();
        if (a != null) {
            return a.a(id);
        }
        return false;
    }
}
