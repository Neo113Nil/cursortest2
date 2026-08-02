package defpackage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;
import com.yandex.plus.home.internal.di.i;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes8.dex */
public final /* synthetic */ class ild0 implements q {
    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        ReentrantLock reentrantLock = i.a;
        int i = jld0.a[event.ordinal()];
        if (i == 1) {
            i.b.lock();
            try {
                i.b(i.f, true);
            } finally {
            }
        } else {
            if (i != 2) {
                return;
            }
            i.b.lock();
            try {
                i.b(i.f, false);
            } finally {
            }
        }
    }
}
