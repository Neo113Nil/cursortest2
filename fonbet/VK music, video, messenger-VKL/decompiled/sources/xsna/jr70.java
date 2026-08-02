package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: ObserverModifierNode.kt */
/* loaded from: classes11.dex */
public final class jr70 implements l590 {
    public static final a c = a.i;
    public final hr70 b;

    /* compiled from: ObserverModifierNode.kt */
    public static final class a extends Lambda implements izs<jr70, s3q0> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final s3q0 invoke(jr70 jr70Var) {
            jr70 jr70Var2 = jr70Var;
            if (jr70Var2.d1()) {
                jr70Var2.b.D1();
            }
            return s3q0.a;
        }
    }

    public jr70(hr70 hr70Var) {
        this.b = hr70Var;
    }

    @Override // xsna.l590
    public final boolean d1() {
        return this.b.z().o;
    }
}
