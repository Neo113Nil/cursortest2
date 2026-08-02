package defpackage;

import androidx.compose.runtime.f;
import kotlin.a;
import ru.yandex.taxi.delivery.d;
import ru.yandex.taxi.logistics.sdk.dashboard.storage.c;

/* loaded from: classes5.dex */
public final class as4 extends a151 {
    public final cs4 b;
    public final gzh c;
    public final v8e d;
    public final i3y e;
    public final pb f;
    public final pb g;

    public as4(cs4 cs4Var, gzh gzhVar, v8e v8eVar, c cVar, zch zchVar) {
        super("banner-carousel");
        this.b = cs4Var;
        this.c = gzhVar;
        this.d = v8eVar;
        this.e = a.a(new f02(13, this));
        this.f = new pb((d) zchVar.a, 12);
        this.g = new pb(cVar.b, 11);
    }

    @Override // defpackage.a151
    public final void a(final n351 n351Var, fid fidVar, final int i) {
        int i2;
        aii0 v;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1245057633);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(n351Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(this) ? 32 : 16;
        }
        final int i3 = 0;
        final int i4 = 1;
        if (!btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar.Y();
        } else {
            if (!(n351Var instanceof hs4)) {
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls(this) { // from class: yr4
                        public final /* synthetic */ as4 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i3;
                            zy11 zy11Var = zy11.a;
                            int i6 = i;
                            n351 n351Var2 = n351Var;
                            as4 as4Var = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    as4Var.a(n351Var2, fidVar2, vng.O(i6 | 1));
                                    break;
                                default:
                                    as4Var.a(n351Var2, fidVar2, vng.O(i6 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            ((ru.yandex.taxi.logistics.sdk.promotions.api.a) this.e.getValue()).a(e(), btsVar, 72);
        }
        v = btsVar.v();
        if (v != null) {
            wlsVar = new wls(this) { // from class: yr4
                public final /* synthetic */ as4 b;

                {
                    this.b = this;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    zy11 zy11Var = zy11.a;
                    int i6 = i;
                    n351 n351Var2 = n351Var;
                    as4 as4Var = this.b;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            as4Var.a(n351Var2, fidVar2, vng.O(i6 | 1));
                            break;
                        default:
                            as4Var.a(n351Var2, fidVar2, vng.O(i6 | 1));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }

    @Override // defpackage.a151
    public final boolean b(fid fidVar) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(-1704678947);
        boolean booleanValue = ((Boolean) f.b(((ru.yandex.taxi.logistics.sdk.promotions.api.a) this.e.getValue()).c, btsVar).getValue()).booleanValue();
        btsVar.t(false);
        return booleanValue;
    }

    @Override // defpackage.a151
    public final void c() {
        bvf0.j(((ru.yandex.taxi.logistics.sdk.promotions.api.a) this.e.getValue()).d, null);
    }

    @Override // defpackage.a151
    public final void d(n351 n351Var) {
        if (n351Var instanceof hs4) {
            ((ru.yandex.taxi.logistics.sdk.promotions.api.a) this.e.getValue()).c(e());
        }
    }

    public final or4 e() {
        return new or4(new mr4(this.f, this.g, new g92(2, null), null, null), new ryh(26, this), this.c);
    }
}
