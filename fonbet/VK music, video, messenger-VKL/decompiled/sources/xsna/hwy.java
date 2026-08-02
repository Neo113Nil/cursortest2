package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: LazyRefreshOnAuthChangeImproved.kt */
/* loaded from: classes.dex */
public abstract class hwy<T> implements i7f0<Object, T> {
    public final epf b;
    public final gpf c;
    public volatile UserId d;
    public volatile T e;
    public volatile T f;

    public hwy(epf epfVar, gpf gpfVar) {
        this.b = epfVar;
        this.c = gpfVar;
        this.d = UserId.d;
        this.d = gpfVar.a();
    }

    public abstract T a();

    @Override // xsna.i7f0
    public final T getValue(Object obj, qcy<?> qcyVar) {
        boolean d = this.b.d();
        UserId a = this.c.a();
        if (d && !epx.f(a, this.d)) {
            this.d = a;
            this.e = null;
        }
        T t = d ? this.e : this.f;
        if (t == null) {
            t = a();
            if (d) {
                this.e = t;
                return t;
            }
            this.f = t;
        }
        return t;
    }
}
