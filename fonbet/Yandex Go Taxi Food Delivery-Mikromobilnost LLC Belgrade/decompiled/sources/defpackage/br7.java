package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes10.dex */
public interface br7 extends co7, si21 {
    gq60 a();

    @Override // defpackage.co7
    default qp7 b() {
        return l();
    }

    @Override // defpackage.co7
    default ar7 c() {
        return f();
    }

    default void d(jp7 jp7Var) {
    }

    ar7 f();

    default boolean g() {
        return c().d() == 0;
    }

    void h(ArrayList arrayList);

    default void i() {
    }

    default void j(boolean z) {
    }

    qp7 l();

    default jp7 m() {
        return np7.a;
    }

    default void n(boolean z) {
    }

    void o(Collection collection);

    default boolean q() {
        return true;
    }

    euy release();
}
