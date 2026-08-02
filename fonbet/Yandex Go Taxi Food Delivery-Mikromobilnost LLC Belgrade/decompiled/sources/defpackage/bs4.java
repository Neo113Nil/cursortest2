package defpackage;

import androidx.compose.runtime.f;
import kotlin.a;

/* loaded from: classes5.dex */
public final class bs4 extends o15 {
    public final cs4 b;
    public final gzh c;
    public final String d;
    public final v0k e;
    public final i3y f;
    public final pb g;

    public bs4(cs4 cs4Var, gzh gzhVar, String str, f4l0 f4l0Var, v0k v0kVar) {
        super("banner-carousel");
        this.b = cs4Var;
        this.c = gzhVar;
        this.d = str;
        this.e = v0kVar;
        this.f = a.a(new f02(14, this));
        this.g = new pb(f4l0Var.d(), 13);
    }

    @Override // defpackage.a151
    public final boolean b(fid fidVar) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(1098898238);
        boolean booleanValue = ((Boolean) f.b(((ru.yandex.taxi.logistics.sdk.promotions.api.a) this.f.getValue()).c, btsVar).getValue()).booleanValue();
        btsVar.t(false);
        return booleanValue;
    }

    @Override // defpackage.a151
    public final void c() {
        bvf0.j(((ru.yandex.taxi.logistics.sdk.promotions.api.a) this.f.getValue()).d, null);
    }

    @Override // defpackage.a151
    public final void d(n351 n351Var) {
        if (n351Var instanceof pr4) {
            ((ru.yandex.taxi.logistics.sdk.promotions.api.a) this.f.getValue()).c(f((pr4) n351Var));
        }
    }

    @Override // defpackage.o15
    public final void e(final n351 n351Var, fid fidVar, final int i) {
        int i2;
        aii0 v;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(676076282);
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
            if (!(n351Var instanceof pr4)) {
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls(this) { // from class: zr4
                        public final /* synthetic */ bs4 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i3;
                            zy11 zy11Var = zy11.a;
                            int i6 = i;
                            n351 n351Var2 = n351Var;
                            bs4 bs4Var = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    bs4Var.e(n351Var2, fidVar2, vng.O(i6 | 1));
                                    break;
                                default:
                                    bs4Var.e(n351Var2, fidVar2, vng.O(i6 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            ((ru.yandex.taxi.logistics.sdk.promotions.api.a) this.f.getValue()).a(f((pr4) n351Var), btsVar, 72);
        }
        v = btsVar.v();
        if (v != null) {
            wlsVar = new wls(this) { // from class: zr4
                public final /* synthetic */ bs4 b;

                {
                    this.b = this;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    zy11 zy11Var = zy11.a;
                    int i6 = i;
                    n351 n351Var2 = n351Var;
                    bs4 bs4Var = this.b;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            bs4Var.e(n351Var2, fidVar2, vng.O(i6 | 1));
                            break;
                        default:
                            bs4Var.e(n351Var2, fidVar2, vng.O(i6 | 1));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }

    public final or4 f(pr4 pr4Var) {
        return new or4(new mr4(this.g, new g92(2, new ubp0(this.d, pr4Var.d)), this.e.a, pr4Var.e, pr4Var.f), pr4Var.c, this.c);
    }
}
