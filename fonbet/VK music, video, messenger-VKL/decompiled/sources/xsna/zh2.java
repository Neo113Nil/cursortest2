package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: AnimatedContent.kt */
/* loaded from: classes11.dex */
public final class zh2 extends Lambda implements yzs<ep10, zo10, o6j, dp10> {
    final /* synthetic */ llj $specOnEnter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh2(llj lljVar) {
        super(3);
        this.$specOnEnter = lljVar;
    }

    @Override // xsna.yzs
    public final dp10 invoke(ep10 ep10Var, zo10 zo10Var, o6j o6jVar) {
        tra0 N = zo10Var.N(o6jVar.a);
        return ep10Var.Q(N.b, N.c, jgp.b, new yh2(N, this.$specOnEnter));
    }
}
