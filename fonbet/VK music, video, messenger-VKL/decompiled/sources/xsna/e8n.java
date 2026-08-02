package xsna;

import kotlin.Lazy;
import xsna.jm50;

/* compiled from: DiscoverSimilarFeedMviOptionsTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class e8n extends evg0<l8n, on50, x8n, z8n, j8n, t7n> {
    public final a9n f;
    public final kr60 g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e8n(com.vk.channels.impl.channel_screen.send_msg.c cVar, Lazy lazy, Lazy lazy2, bpn0 bpn0Var, Lazy lazy3, nn50 nn50Var) {
        super(r6, nn50Var);
        jm50.a aVar = jm50.a.a;
        this.f = new a9n();
        this.g = new kr60(cVar, lazy, lazy2, bpn0Var, lazy3, aVar, new d8n(this));
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        return this.g.d(((x8n) hn50Var).b);
    }
}
