package xsna;

import com.vk.log.L;
import com.vk.toggle.b;

/* compiled from: LazyCacheFeatureStorage.kt */
/* loaded from: classes11.dex */
public final class eqy<T> {
    public final gzs<b.d> a;
    public final izs<String, T> b;
    public String c;
    public volatile T d;
    public volatile boolean e;

    /* JADX WARN: Multi-variable type inference failed */
    public eqy(gzs<? extends b.d> gzsVar, izs<? super String, ? extends T> izsVar) {
        this.a = gzsVar;
        this.b = izsVar;
    }

    public final synchronized void a() {
        this.c = null;
        this.d = null;
        this.e = false;
    }

    public final synchronized T b() {
        b.d invoke = this.a.invoke();
        String obj = invoke != null ? invoke.c.toString() : null;
        this.e = true;
        if (obj == null) {
            this.c = null;
            this.d = null;
            L.e("Net config is empty!");
            return null;
        }
        if (!invoke.a) {
            return null;
        }
        if (obj.equals(this.c)) {
            return this.d;
        }
        this.c = obj;
        try {
            T invoke2 = this.b.invoke(obj);
            StringBuilder sb = new StringBuilder("New [");
            T t = this.d;
            sb.append(t != null ? fpf0.a(t.getClass()).l() : null);
            sb.append("] config: ");
            sb.append(invoke2);
            L.e(sb.toString());
            this.d = invoke2;
            return invoke2;
        } catch (Throwable th) {
            L.j(th, "Error while parsing Toggle config = ".concat(obj));
            return null;
        }
    }

    public final T c() {
        return this.e ^ true ? b() : this.d;
    }

    public eqy(b.a aVar, izs<? super String, ? extends T> izsVar) {
        this(new ag6(aVar, 4), izsVar);
    }
}
