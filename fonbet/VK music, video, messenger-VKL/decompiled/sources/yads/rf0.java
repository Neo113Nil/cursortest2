package yads;

import kotlin.jvm.internal.Lambda;
import xsna.izs;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class rf0 extends Lambda implements izs {
    public final /* synthetic */ z1 b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf0(z1 z1Var, long j) {
        super(1);
        this.b = z1Var;
        this.c = j;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        this.b.a(this.c);
        return s3q0.a;
    }
}
