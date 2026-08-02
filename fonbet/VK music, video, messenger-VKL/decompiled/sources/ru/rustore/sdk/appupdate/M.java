package ru.rustore.sdk.appupdate;

import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import xsna.ctj0;
import xsna.d5o0;
import xsna.fwj0;
import xsna.izs;
import xsna.qs6;
import xsna.s3q0;

/* loaded from: classes9.dex */
public final class M {

    public static final class a extends Lambda implements izs<Throwable, s3q0> {
        public final /* synthetic */ d5o0<T>.a a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d5o0<T>.a aVar) {
            super(1);
            this.a = aVar;
        }

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            this.a.a(th);
            return s3q0.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class b<T> extends Lambda implements izs<T, s3q0> {
        public final /* synthetic */ d5o0<T>.a a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d5o0<T>.a aVar) {
            super(1);
            this.a = aVar;
        }

        @Override // xsna.izs
        public final s3q0 invoke(Object obj) {
            this.a.b(obj);
            return s3q0.a;
        }
    }

    public static final <T> d5o0<T> a(ctj0<T> ctj0Var) {
        d5o0 d5o0Var = new d5o0();
        Pair pair = new Pair(d5o0Var, new d5o0.a());
        d5o0<T> d5o0Var2 = (d5o0) pair.d();
        d5o0.a aVar = (d5o0.a) pair.g();
        fwj0 fwj0Var = new fwj0(new a(aVar), new b(aVar));
        ctj0Var.a(fwj0Var);
        d5o0Var2.a(new qs6(fwj0Var, 22), null);
        return d5o0Var2;
    }
}
