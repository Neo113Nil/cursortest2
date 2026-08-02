package xsna;

import android.animation.Animator;
import androidx.annotation.NonNull;
import com.google.android.material.progressindicator.a;
import java.util.ArrayList;
import xsna.qlo;

/* compiled from: IndeterminateAnimatorDelegate.java */
/* loaded from: classes13.dex */
public abstract class otw<T extends Animator> {
    public ptw a;
    public final ArrayList b = new ArrayList();

    public otw(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            this.b.add(new qlo.a());
        }
    }

    public static float b(int i, int i2, int i3) {
        return (i - i2) / i3;
    }

    public abstract void a();

    public abstract void c();

    public abstract void d(@NonNull a.c cVar);

    public abstract void e();

    public abstract void f();

    public abstract void g();
}
