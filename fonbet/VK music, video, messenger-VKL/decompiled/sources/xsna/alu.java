package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: GroupHideWarningApiCmd.kt */
/* loaded from: classes2.dex */
public final class alu extends nx2<s3q0> {
    public final long b;
    public final int c;

    public alu(long j, int i) {
        this.b = j;
        this.c = i;
    }

    @Override // xsna.nx2
    public final s3q0 f(l7r0 l7r0Var) {
        l7r0Var.e(bz2.n(new zqu().v(this.c, new UserId(this.b)), new p60(26)));
        return s3q0.a;
    }
}
