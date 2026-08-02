package defpackage;

import android.graphics.Rect;
import android.util.Range;
import androidx.camera.core.impl.Timebase;
import androidx.lifecycle.v;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public interface ar7 {
    Object A(String str);

    default void B(m2v m2vVar) {
        wp81.b = m2vVar;
    }

    v a();

    Set b();

    String c();

    int d();

    void e(Executor executor, uo7 uo7Var);

    void f(uo7 uo7Var);

    List g(Range range);

    default ar7 getImplementation() {
        return this;
    }

    boolean h();

    int i(int i);

    izn j();

    v k();

    Set l();

    int m();

    Rect n();

    Object o();

    boolean p();

    a73 q();

    List r(int i);

    Set s();

    boolean t();

    v u();

    gvo v();

    Timebase w();

    default xs7 x() {
        ws7 ws7Var = new ws7();
        zq7 zq7Var = new zq7(this, 0);
        LinkedHashSet linkedHashSet = ws7Var.a;
        linkedHashSet.add(zq7Var);
        linkedHashSet.add(new nby(d()));
        return ws7Var.a();
    }

    String y();

    List z();
}
