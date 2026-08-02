package yads;

import java.util.UUID;

/* loaded from: classes10.dex */
public interface nk0 {
    static void a(nk0 nk0Var, nk0 nk0Var2) {
        if (nk0Var == nk0Var2) {
            return;
        }
        if (nk0Var2 != null) {
            nk0Var2.b(null);
        }
        if (nk0Var != null) {
            nk0Var.a((pk0) null);
        }
    }

    void a(pk0 pk0Var);

    boolean a();

    boolean a(String str);

    UUID b();

    void b(pk0 pk0Var);

    mk0 c();

    k20 d();

    int getState();
}
