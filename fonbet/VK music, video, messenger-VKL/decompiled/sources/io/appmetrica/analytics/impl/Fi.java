package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ironsource.C4217a2;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class Fi extends C5255vn {
    public final Ei d;
    public final ICommonExecutor e;

    public Fi(@NonNull C4927j5 c4927j5, @NonNull Ul ul, @NonNull ICommonExecutor iCommonExecutor) {
        super(c4927j5, ul);
        this.d = new Ei(this);
        this.e = iCommonExecutor;
    }

    @Override // io.appmetrica.analytics.impl.C5255vn
    public final void a() {
        this.e.remove(this.d);
    }

    @Override // io.appmetrica.analytics.impl.C5255vn
    public final void f() {
        this.b.a();
        C5224uh c5224uh = (C5224uh) ((C4927j5) this.a).k.a();
        if (c5224uh.k.a(c5224uh.j)) {
            String str = c5224uh.m;
            if (TextUtils.isEmpty(str) || C4217a2.f.equals(str)) {
                return;
            }
            try {
                a(C4859ge.a((C4927j5) this.a));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.C5255vn
    public final void g() {
        this.e.executeDelayed(this.d, TimeUnit.SECONDS.toMillis(1L));
    }

    public final void h() {
        if (this.c.get()) {
            return;
        }
        this.e.remove(this.d);
        if (((C5224uh) ((C4927j5) this.a).k.a()).g > 0) {
            this.e.executeDelayed(this.d, TimeUnit.SECONDS.toMillis(((C5224uh) ((C4927j5) this.a).k.a()).g));
        }
    }
}
