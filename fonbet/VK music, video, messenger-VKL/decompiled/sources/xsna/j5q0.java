package xsna;

import java.util.ArrayList;

/* compiled from: UnreadReactionsLpTask.kt */
/* loaded from: classes2.dex */
public final class j5q0 extends e500 {
    public final w2w c;
    public final long d;
    public final ArrayList e;

    public j5q0(w2w w2wVar, long j, ArrayList arrayList) {
        super("UnreadReactionsLpTask");
        this.c = w2wVar;
        this.d = j;
        this.e = arrayList;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        z300Var.g(this.d);
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        hpm c = sn.c(this.c);
        dhl0<com.vk.im.engine.models.dialogs.b, Long> dhl0Var = c.c;
        long j = this.d;
        Long valueOf = Long.valueOf(j);
        ArrayList arrayList = this.e;
        dhl0Var.a(valueOf, new iz0(arrayList, 25), new rfm(j, arrayList, c));
    }
}
