package xsna;

import kotlin.Lazy;
import xsna.jm50;

/* compiled from: DiscoverSimilarFeedMviItemTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class z7n extends evg0<l8n, on50, v8n, z8n, j8n, t7n> {
    public final rq60 f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z7n(qn60 qn60Var, pn60 pn60Var, com.vk.channels.impl.channel_screen.send_msg.c cVar, Lazy lazy, Lazy lazy2, Lazy lazy3, nn50 nn50Var) {
        super(r7, nn50Var);
        jm50.a aVar = jm50.a.a;
        this.f = new rq60(qn60Var, pn60Var, cVar, lazy, lazy2, lazy3, aVar, new y7n(this));
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        return this.f.d(((v8n) hn50Var).b);
    }
}
