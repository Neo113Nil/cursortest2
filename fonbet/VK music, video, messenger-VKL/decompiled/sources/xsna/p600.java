package xsna;

import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* compiled from: LooperBasedState.kt */
/* loaded from: classes15.dex */
public final class p600<T> implements htk0<T> {
    public static final a d;
    public static final /* synthetic */ qcy<Object>[] e;
    public final Handler a;
    public final HashSet b = new HashSet();
    public final b c;

    /* compiled from: LooperBasedState.kt */
    public static final class a {
    }

    /* compiled from: Delegates.kt */
    public static final class b extends wq70<T> {
        public final /* synthetic */ p600 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, p600 p600Var) {
            super(obj);
            this.b = p600Var;
        }

        @Override // xsna.wq70
        public final void afterChange(qcy<?> qcyVar, T t, T t2) {
            if (epx.f(t, t2)) {
                return;
            }
            Iterator it = this.b.b.iterator();
            while (it.hasNext()) {
                ((izs) it.next()).invoke(t2);
            }
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(p600.class, "value", "getValue()Ljava/lang/Object;", 0);
        fpf0.a.getClass();
        e = new qcy[]{mutablePropertyReference1Impl};
        d = new a();
    }

    public p600(T t, Looper looper) {
        this.a = new Handler(looper);
        this.c = new b(t, this);
    }

    @Override // xsna.htk0
    public final void a(izs<? super T, s3q0> izsVar) {
        this.a.post(new kw6(this, izsVar));
    }

    @Override // xsna.htk0
    public final void b(izs<? super T, s3q0> izsVar) {
        this.a.post(new i6k(this, izsVar));
    }

    @Override // xsna.htk0
    public final T get() {
        return this.c.getValue(this, e[0]);
    }

    @Override // xsna.htk0
    public final void update(T t) {
        this.a.post(new v9j(3, this, t));
    }
}
