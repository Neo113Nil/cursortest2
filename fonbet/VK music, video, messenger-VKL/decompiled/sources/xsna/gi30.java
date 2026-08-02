package xsna;

import com.vk.im.engine.models.messages.Msg;
import java.util.Collection;

/* compiled from: MsgDeleteDiffLpTask.kt */
/* loaded from: classes2.dex */
public final class gi30 extends e500 {
    public final w2w c;
    public final int d;
    public final int e;
    public final long f;
    public final int g;
    public Collection<? extends Msg> h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gi30(w2w w2wVar, int i, int i2, long j, int i3) {
        super(r0.toString());
        StringBuilder sb = new StringBuilder("MsgDeleteDiffLpTask(");
        sb.append(i == i2 ? lhg.a(i, "cmid=") : efz.a(i, i2, "cmids=", ".."));
        sb.append(",d=");
        sb.append(f9t.K(j));
        sb.append(')');
        this.c = w2wVar;
        this.d = i;
        this.e = i2;
        this.f = j;
        this.g = i3;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        Collection<? extends Msg> collection = this.h;
        if (collection != null) {
            for (Msg msg : collection) {
                if (msg.Nb()) {
                    long j = this.f;
                    z300Var.g(j);
                    z300Var.d(msg.d, j);
                }
            }
        }
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        this.c.I0().u(new pb00(this, 6));
    }
}
