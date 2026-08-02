package defpackage;

import ru.yandex.taxi.map_common.map.n;

/* loaded from: classes9.dex */
public final class cl00 implements lz60 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ cl00(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.lz60
    public final void g() {
        switch (this.a) {
            case 0:
                ((n) ((h3y) this.b).get()).m();
                break;
            default:
                ((u6) this.b).g();
                break;
        }
    }

    @Override // defpackage.s150
    public final String getName() {
        switch (this.a) {
            case 0:
                return "MapKitLcpInitStarter";
            default:
                return "OaidLcpListener";
        }
    }
}
