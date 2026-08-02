package defpackage;

import com.ybsdk.common.DeviceIdProvider;
import com.ybsdk.network.Api;
import ru.yandex.taxi.activity.ContentContainer$ZOrder;

/* loaded from: classes.dex */
public final class lej implements v7p {
    public final /* synthetic */ int a;
    public final eqh b;

    public /* synthetic */ lej(eqh eqhVar, int i) {
        this.a = i;
        this.b = eqhVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        eqh eqhVar = this.b;
        switch (i) {
            case 0:
                return new kej((ow) eqhVar.get());
            case 1:
                return new oir((mir) eqhVar.get());
            case 2:
                return grw.a((t0k0) eqhVar.get());
            case 3:
                return new rx2((pho) eqhVar.get());
            case 4:
                return (Api) ((t0k0) eqhVar.get()).b(Api.class);
            case 5:
                return new a980(i5m.a(eqhVar));
            case 6:
                return new iv90((ow) eqhVar.get());
            case 7:
                return new ob0(9, (c2d0) eqhVar.get());
            case 8:
                return ((y030) eqhVar.get()).a(ContentContainer$ZOrder.IMPORTANT);
            case 9:
                return new n0g0(i5m.a(eqhVar));
            case 10:
                return new dxf0((DeviceIdProvider) eqhVar.get());
            case 11:
                return ((v9g) eqhVar.get()).b.l();
            default:
                return new fd61((po21) eqhVar.get());
        }
    }

    public /* synthetic */ lej(Object obj, eqh eqhVar, int i) {
        this.a = i;
        this.b = eqhVar;
    }
}
