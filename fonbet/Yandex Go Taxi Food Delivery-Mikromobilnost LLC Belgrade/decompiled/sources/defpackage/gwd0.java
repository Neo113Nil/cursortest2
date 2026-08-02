package defpackage;

import androidx.compose.ui.input.pointer.PointerEventPass;

/* loaded from: classes.dex */
public interface gwd0 extends cqh {
    default boolean A0() {
        return false;
    }

    default long B() {
        int i = wyz0.b;
        return wdz.i();
    }

    default void C0() {
        D();
    }

    void D();

    void m0(tvd0 tvd0Var, PointerEventPass pointerEventPass, long j);

    default void o() {
    }

    default void onDensityChange() {
        D();
    }
}
