package xsna;

import com.vk.subscription.api.SubscribeStatus;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class voh0 implements izs {
    public final /* synthetic */ woh0 b;
    public final /* synthetic */ SubscribeStatus c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ voh0(woh0 woh0Var, SubscribeStatus subscribeStatus, int i, int i2) {
        this.b = woh0Var;
        this.c = subscribeStatus;
        this.d = i;
        this.e = i2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        this.b.getClass();
        int i = (this.d == 0 || this.c.value == 5 || this.e > 0) ? 1 : 4;
        SubscribeStatus.Companion.getClass();
        return SubscribeStatus.a.b(i);
    }
}
