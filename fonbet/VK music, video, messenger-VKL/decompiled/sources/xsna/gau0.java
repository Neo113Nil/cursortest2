package xsna;

import com.vk.network.eventhub.api.EventHubServiceUrlBuilder;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class gau0 implements gzs {
    public final /* synthetic */ qng b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ gau0(qng qngVar, boolean z) {
        this.b = qngVar;
        this.c = z;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        qng qngVar = this.b;
        boolean z = this.c;
        String str = qngVar.b;
        if (str == null) {
            str = "eh.".concat("vk.com");
        }
        o260 o260Var = d260.a;
        if (o260Var == null) {
            o260Var = null;
        }
        String a = o260Var.l.a();
        EventHubServiceUrlBuilder.Format format = EventHubServiceUrlBuilder.Format.JSON;
        long j = qngVar.c;
        vx2.a.getClass();
        return new EventHubServiceUrlBuilder(str, a, format, j, vx2.b, vx2.b().a.g, z);
    }
}
