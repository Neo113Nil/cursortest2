package xsna;

import java.util.ArrayList;

/* compiled from: SystemIdInfoDao.kt */
/* loaded from: classes.dex */
public interface hqn0 {
    default void a(svx0 svx0Var) {
        d(svx0Var.b, svx0Var.a);
    }

    ArrayList b();

    default gqn0 c(svx0 svx0Var) {
        return f(svx0Var.b, svx0Var.a);
    }

    void d(int i, String str);

    void e(gqn0 gqn0Var);

    gqn0 f(int i, String str);

    void g(String str);
}
