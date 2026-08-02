package xsna;

import com.vk.dto.common.id.UserId;
import xsna.nhd;

/* compiled from: LazyRefreshOnAuthChange.kt */
/* loaded from: classes16.dex */
public final class gwy<T> implements i7f0<Object, T> {
    public final nhd.a b;
    public final nhd.b c;
    public final gzs<T> d;
    public volatile UserId e;
    public volatile T f;
    public volatile T g;

    public gwy(nhd.a aVar, nhd.b bVar, gzs gzsVar) {
        this.b = aVar;
        this.c = bVar;
        this.d = gzsVar;
        this.e = UserId.d;
        this.e = (UserId) bVar.invoke();
    }

    @Override // xsna.i7f0
    public final T getValue(Object obj, qcy<?> qcyVar) {
        boolean booleanValue = ((Boolean) this.b.invoke()).booleanValue();
        UserId userId = (UserId) this.c.invoke();
        if (booleanValue && !epx.f(userId, this.e)) {
            this.e = userId;
            this.f = null;
        }
        T t = booleanValue ? this.f : this.g;
        if (t == null) {
            t = this.d.invoke();
            if (booleanValue) {
                this.f = t;
                return t;
            }
            this.g = t;
        }
        return t;
    }
}
