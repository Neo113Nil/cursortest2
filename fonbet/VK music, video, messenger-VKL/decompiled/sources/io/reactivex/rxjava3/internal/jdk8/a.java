package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.v;
import io.reactivex.rxjava3.functions.l;
import java.util.Objects;
import java.util.Optional;

/* compiled from: ObservableMapOptional.java */
/* loaded from: classes8.dex */
public final class a<T, R> extends q<R> {
    public final q<T> b;
    public final l<? super T, Optional<? extends R>> c;

    /* compiled from: ObservableMapOptional.java */
    /* renamed from: io.reactivex.rxjava3.internal.jdk8.a$a, reason: collision with other inner class name */
    public static final class C2117a<T, R> extends io.reactivex.rxjava3.internal.observers.a<T, R> {
        public final l<? super T, Optional<? extends R>> g;

        public C2117a(v<? super R> vVar, l<? super T, Optional<? extends R>> lVar) {
            super(vVar);
            this.g = lVar;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(T t) {
            if (this.e) {
                return;
            }
            int i = this.f;
            v<? super R> vVar = this.b;
            if (i != 0) {
                vVar.onNext(null);
                return;
            }
            try {
                Optional<? extends R> apply = this.g.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null Optional");
                Optional<? extends R> optional = apply;
                if (optional.isPresent()) {
                    vVar.onNext(optional.get());
                }
            } catch (Throwable th) {
                b(th);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.l
        public final R poll() throws Throwable {
            Optional<? extends R> optional;
            do {
                T poll = this.d.poll();
                if (poll == null) {
                    return null;
                }
                Optional<? extends R> apply = this.g.apply(poll);
                Objects.requireNonNull(apply, "The mapper returned a null Optional");
                optional = apply;
            } while (!optional.isPresent());
            return optional.get();
        }
    }

    public a(q<T> qVar, l<? super T, Optional<? extends R>> lVar) {
        this.b = qVar;
        this.c = lVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(v<? super R> vVar) {
        this.b.subscribe(new C2117a(vVar, this.c));
    }
}
