package xsna;

import com.vk.im.engine.models.messages.Msg;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: MsgEditedDiffLpTask.kt */
/* loaded from: classes2.dex */
public final class pi30 extends e500 {
    public final w2w c;
    public final int d;
    public final int e;
    public final long f;
    public ArrayList g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pi30(w2w w2wVar, int i, int i2, long j) {
        super(r0.toString());
        StringBuilder sb = new StringBuilder("MsgEditedDiffLpTask(");
        sb.append(i == i2 ? lhg.a(i, "cmid=") : efz.a(i, i2, "cmids=", ".."));
        sb.append(",d=");
        sb.append(f9t.K(j));
        sb.append(')');
        this.c = w2wVar;
        this.d = i;
        this.e = i2;
        this.f = j;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        ArrayList arrayList = this.g;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Msg msg = (Msg) it.next();
                if (msg.Nb()) {
                    z300Var.g(msg.c);
                    z300Var.j(msg.b, msg.c);
                    z300Var.i(msg.b, msg.c);
                }
            }
        }
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        d040 o = this.c.I0().o();
        int i = this.d;
        int i2 = this.e;
        long j = this.f;
        o.k(i, i2, j);
        this.g = zik0.g(o.I0(j, j5g.O0(new k9x(i, i2, 1))));
    }
}
