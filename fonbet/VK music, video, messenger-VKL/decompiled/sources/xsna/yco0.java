package xsna;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: TextContextMenuGesturesModifier.kt */
/* loaded from: classes11.dex */
final class yco0 extends d730<zco0> {
    public final SuspendLambda a;

    /* JADX WARN: Multi-variable type inference failed */
    public yco0(wzs<? super ov70, ? super spj<? super s3q0>, ? extends Object> wzsVar) {
        this.a = (SuspendLambda) wzsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yco0) {
            return this.a == ((yco0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        SuspendLambda suspendLambda = this.a;
        if (suspendLambda != null) {
            return suspendLambda.hashCode();
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, xsna.wzs] */
    @Override // xsna.d730
    public final zco0 r() {
        return new zco0(this.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, xsna.wzs<? super xsna.ov70, ? super xsna.spj<? super xsna.s3q0>, ? extends java.lang.Object>] */
    @Override // xsna.d730
    public final void s(zco0 zco0Var) {
        zco0Var.r = this.a;
    }
}
