package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import java.util.Set;
import xsna.svh0;

/* compiled from: AnyClassIndex.kt */
/* loaded from: classes4.dex */
public final class nw2 implements svh0<a, Object> {
    public final ph50<Class<? extends Object>, qh50<Object>> a = new ph50<>(16);

    /* compiled from: AnyClassIndex.kt */
    public static final class a extends svh0.a {
        public final Class<? extends NewsEntry> a;

        public a(Class<? extends NewsEntry> cls) {
            this.a = cls;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Key(klass=" + this.a + ')';
        }
    }

    @Override // xsna.svh0
    public final Set<Object> a(a aVar) {
        qh50<Object> d = this.a.d(aVar.a);
        if (d != null) {
            return new fzi0(d);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.svh0
    public final void add(Object obj) {
        Class<?> cls = obj.getClass();
        qh50 qh50Var = new qh50((Object) null);
        ph50<Class<? extends Object>, qh50<Object>> ph50Var = this.a;
        qh50 qh50Var2 = (qh50) ph50Var.e(cls, qh50Var);
        qh50Var2.e(obj);
        if (ph50Var.b(cls)) {
            return;
        }
        ph50Var.p(cls, qh50Var2);
    }

    @Override // xsna.svh0
    public final void clear() {
        this.a.h();
    }

    @Override // xsna.svh0
    public final void remove(Object obj) {
        ph50<Class<? extends Object>, qh50<Object>> ph50Var = this.a;
        Object[] objArr = ph50Var.c;
        long[] jArr = ph50Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        ((qh50) objArr[(i << 3) + i3]).m(obj);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
