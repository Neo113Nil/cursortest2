package defpackage;

import android.os.Handler;
import com.yandex.messaging.paging.PagedLoader$LoadState;
import com.yandex.messaging.paging.PagedLoader$LoadType;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public final class b890 {
    public final x790 a;
    public final Handler b;
    public final int c;
    public final int d;
    public final ArrayList e = new ArrayList();
    public PagedLoader$LoadState f;
    public PagedLoader$LoadState g;
    public PagedLoader$LoadState h;
    public int i;
    public int j;
    public WeakReference k;

    public b890(x790 x790Var, Handler handler, int i, int i2) {
        this.a = x790Var;
        this.b = handler;
        this.c = i;
        this.d = i2;
        PagedLoader$LoadState pagedLoader$LoadState = PagedLoader$LoadState.IDLE;
        this.f = pagedLoader$LoadState;
        this.g = pagedLoader$LoadState;
        this.h = pagedLoader$LoadState;
    }

    public final void a() {
        this.a.b();
        PagedLoader$LoadState pagedLoader$LoadState = this.f;
        PagedLoader$LoadState pagedLoader$LoadState2 = PagedLoader$LoadState.LOADING;
        if (pagedLoader$LoadState == pagedLoader$LoadState2) {
            this.f = PagedLoader$LoadState.IDLE;
        }
        if (this.g == pagedLoader$LoadState2) {
            this.g = PagedLoader$LoadState.IDLE;
        }
        if (this.h == pagedLoader$LoadState2) {
            this.h = PagedLoader$LoadState.IDLE;
        }
    }

    public final void b() {
        if (this.f != PagedLoader$LoadState.IDLE) {
            return;
        }
        f(PagedLoader$LoadType.INIT, PagedLoader$LoadState.LOADING);
        this.a.a(new qgg(System.currentTimeMillis(), this, 3));
    }

    public final void c(int i) {
        int i2 = this.d;
        int i3 = i2 - i;
        int size = (i + i2) - this.e.size();
        int max = Math.max(i3, this.i);
        this.i = max;
        if (max > 0) {
            e();
        }
        int max2 = Math.max(size, this.j);
        this.j = max2;
        if (max2 > 0) {
            d();
        }
    }

    public final void d() {
        if (this.g != PagedLoader$LoadState.IDLE) {
            return;
        }
        f(PagedLoader$LoadType.APPEND, PagedLoader$LoadState.LOADING);
        Object obj = this.e.get(r0.size() - 1);
        x790 x790Var = this.a;
        x790Var.e(x790Var.c(obj), this.c, new yj70(this));
    }

    public final void e() {
        if (this.h != PagedLoader$LoadState.IDLE) {
            return;
        }
        f(PagedLoader$LoadType.PREPEND, PagedLoader$LoadState.LOADING);
        Object obj = this.e.get(0);
        x790 x790Var = this.a;
        x790Var.d(x790Var.c(obj), this.c, new aq80(this));
    }

    public final void f(PagedLoader$LoadType pagedLoader$LoadType, PagedLoader$LoadState pagedLoader$LoadState) {
        int i = a890.a[pagedLoader$LoadType.ordinal()];
        if (i == 1) {
            this.f = pagedLoader$LoadState;
        } else if (i == 2) {
            this.g = pagedLoader$LoadState;
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            this.h = pagedLoader$LoadState;
        }
        this.b.post(new ud30(8, this, pagedLoader$LoadType, pagedLoader$LoadState));
    }

    public final void g(z790 z790Var) {
        z790 z790Var2;
        z790 z790Var3;
        z790 z790Var4;
        WeakReference weakReference = new WeakReference(z790Var);
        this.k = weakReference;
        PagedLoader$LoadType pagedLoader$LoadType = PagedLoader$LoadType.INIT;
        z790 z790Var5 = (z790) weakReference.get();
        if (z790Var5 != null) {
            z790Var5.a(new ArrayList(this.e));
        }
        PagedLoader$LoadState pagedLoader$LoadState = this.f;
        WeakReference weakReference2 = this.k;
        if (weakReference2 != null && (z790Var4 = (z790) weakReference2.get()) != null) {
            z790Var4.b(pagedLoader$LoadType, pagedLoader$LoadState);
        }
        PagedLoader$LoadType pagedLoader$LoadType2 = PagedLoader$LoadType.PREPEND;
        PagedLoader$LoadState pagedLoader$LoadState2 = this.h;
        WeakReference weakReference3 = this.k;
        if (weakReference3 != null && (z790Var3 = (z790) weakReference3.get()) != null) {
            z790Var3.b(pagedLoader$LoadType2, pagedLoader$LoadState2);
        }
        PagedLoader$LoadType pagedLoader$LoadType3 = PagedLoader$LoadType.APPEND;
        PagedLoader$LoadState pagedLoader$LoadState3 = this.g;
        WeakReference weakReference4 = this.k;
        if (weakReference4 == null || (z790Var2 = (z790) weakReference4.get()) == null) {
            return;
        }
        z790Var2.b(pagedLoader$LoadType3, pagedLoader$LoadState3);
    }
}
