package xsna;

import com.vk.newsfeed.posting.additional_settings.data.AdditionalSettingsConfiguration;
import com.vk.newsfeed.posting.additional_settings.data.AdvertisingOrd;
import com.vk.newsfeed.posting.additional_settings.domain.model.AdditionalSettingsState;
import com.vk.newsfeed.posting.additional_settings.domain.model.author.WallOwner;
import kotlin.NoWhenBranchMatchedException;
import xsna.kq0;
import xsna.ks0;
import xsna.sr0;

/* compiled from: AdditionalSettingsFeature.kt */
/* loaded from: classes4.dex */
public final class jr0 extends wk50<ls0, AdditionalSettingsState, kq0, sr0> {
    public final rr0 f;
    public final zlc0 g;
    public final hs0 h;
    public final ibc0 i;
    public final f4z j;
    public final bpn0 k;

    public jr0(rr0 rr0Var, zlc0 zlc0Var, hs0 hs0Var, ibc0 ibc0Var, kq0 kq0Var) {
        super(kq0Var, hs0Var);
        this.f = rr0Var;
        this.g = zlc0Var;
        this.h = hs0Var;
        this.i = ibc0Var;
        this.j = new f4z();
        this.k = new bpn0(new defpackage.j(this, 6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wk50
    public final void N(AdditionalSettingsState additionalSettingsState, kq0 kq0Var) {
        Boolean bool;
        AdditionalSettingsState additionalSettingsState2 = additionalSettingsState;
        kq0 kq0Var2 = kq0Var;
        if (kq0Var2 instanceof kq0.k) {
            rr0 rr0Var = this.f;
            boolean z = rr0Var.b;
            boolean z2 = rr0Var.c;
            WallOwner wallOwner = rr0Var.g;
            boolean z3 = rr0Var.f;
            T(new sr0.e(rr0Var.h, wallOwner, rr0Var.i, rr0Var.l, rr0Var.m, rr0Var.n, z, z2, rr0Var.a, rr0Var.d, rr0Var.e, z3, rr0Var.j, rr0Var.k));
            return;
        }
        if (kq0Var2 instanceof kq0.m) {
            T(new sr0.f(((kq0.m) kq0Var2).b));
            return;
        }
        boolean z4 = kq0Var2 instanceof kq0.b;
        ibc0 ibc0Var = this.i;
        f4z f4zVar = this.j;
        if (z4) {
            kq0.b bVar = (kq0.b) kq0Var2;
            boolean z5 = bVar.b;
            ibc0Var.x().h(z5);
            if (additionalSettingsState2 instanceof AdditionalSettingsState.Data) {
                AdditionalSettingsState.Data data = (AdditionalSettingsState.Data) additionalSettingsState2;
                f4zVar.b(new ks0.c(AdditionalSettingsConfiguration.a(data.g, bVar.b, false, false, null, false, 30), data.e, data.p));
            }
            T(new sr0.b(z5));
            return;
        }
        if (kq0Var2 instanceof kq0.c) {
            kq0.c cVar = (kq0.c) kq0Var2;
            boolean z6 = cVar.b;
            ibc0Var.x().j(z6);
            if (additionalSettingsState2 instanceof AdditionalSettingsState.Data) {
                AdditionalSettingsState.Data data2 = (AdditionalSettingsState.Data) additionalSettingsState2;
                f4zVar.b(new ks0.c(AdditionalSettingsConfiguration.a(data2.g, false, false, cVar.b, null, false, 27), data2.e, data2.p));
            }
            T(new sr0.c(z6));
            return;
        }
        if (kq0Var2 instanceof kq0.d) {
            kq0.d dVar = (kq0.d) kq0Var2;
            boolean z7 = additionalSettingsState2 instanceof AdditionalSettingsState.Data;
            if (z7 && ((AdditionalSettingsState.Data) additionalSettingsState2).i) {
                f4zVar.b(ks0.e.a);
                return;
            }
            if (z7) {
                AdditionalSettingsState.Data data3 = (AdditionalSettingsState.Data) additionalSettingsState2;
                f4zVar.b(new ks0.c(AdditionalSettingsConfiguration.a(data3.g, false, dVar.b, false, null, false, 29), data3.e, data3.p));
            }
            T(new sr0.d(dVar.b));
            return;
        }
        if (kq0Var2 instanceof kq0.a) {
            if (additionalSettingsState2 instanceof AdditionalSettingsState.Data) {
                kq0.a aVar = (kq0.a) kq0Var2;
                AdditionalSettingsState.Data data4 = (AdditionalSettingsState.Data) additionalSettingsState2;
                AdditionalSettingsConfiguration additionalSettingsConfiguration = data4.g;
                boolean z8 = aVar.d;
                String str = aVar.c;
                String str2 = aVar.b;
                if (!z8 && (bool = additionalSettingsConfiguration.e.c) != null && !bool.equals(Boolean.FALSE)) {
                    f4zVar.b(ks0.g.a);
                }
                f4zVar.b(new ks0.c(AdditionalSettingsConfiguration.a(additionalSettingsConfiguration, false, false, false, AdvertisingOrd.a(additionalSettingsConfiguration.e, str2, Boolean.valueOf(z8), str), false, 23), data4.e, data4.p));
                T(new sr0.a(str2, z8, str));
                return;
            }
            return;
        }
        Object[] objArr = 0;
        if (kq0Var2.equals(kq0.e.b)) {
            ibc0Var.x().g();
            if (additionalSettingsState2 instanceof AdditionalSettingsState.Data) {
                AdditionalSettingsState.Data data5 = (AdditionalSettingsState.Data) additionalSettingsState2;
                AdditionalSettingsConfiguration additionalSettingsConfiguration2 = data5.g;
                Boolean bool2 = additionalSettingsConfiguration2.e.c;
                boolean booleanValue = bool2 != null ? bool2.booleanValue() : false;
                if ((data5.c && !data5.l) || (data5.d && booleanValue)) {
                    f4zVar.b(ks0.f.a);
                    return;
                }
                StringBuilder sb = new StringBuilder("#");
                AdvertisingOrd advertisingOrd = additionalSettingsConfiguration2.e;
                Boolean bool3 = advertisingOrd.c;
                if (bool3 != null) {
                    sb.append("is_ad=" + bool3.booleanValue());
                }
                String str3 = advertisingOrd.b;
                if (str3 != null) {
                    sb.append("&ord_pred_id=".concat(str3));
                }
                String str4 = advertisingOrd.d;
                if (str4 != null) {
                    sb.append("&erid=".concat(str4));
                }
                f4zVar.b(new ks0.b(sb.toString()));
                return;
            }
            return;
        }
        if (kq0Var2 instanceof kq0.l) {
            kq0.l lVar = (kq0.l) kq0Var2;
            boolean equals = lVar.equals(kq0.l.a.b);
            bpn0 bpn0Var = this.k;
            if (equals) {
                ((ctu) bpn0Var.getValue()).a();
                return;
            } else {
                if (!lVar.equals(kq0.l.b.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((ctu) bpn0Var.getValue()).getClass();
                ctu.b();
                return;
            }
        }
        if (kq0Var2.equals(kq0.h.b)) {
            f4zVar.b(new ks0.a(additionalSettingsState2));
            return;
        }
        int i = 1;
        if (kq0Var2.equals(kq0.g.b)) {
            T(new sr0.h(true));
            return;
        }
        if (!kq0Var2.equals(kq0.i.b)) {
            if (kq0Var2.equals(kq0.j.b)) {
                T(new sr0.h(false));
                return;
            } else {
                if (!kq0Var2.equals(kq0.f.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                f4zVar.b(ks0.d.a);
                return;
            }
        }
        if (additionalSettingsState2 instanceof AdditionalSettingsState.Data) {
            AdditionalSettingsState.Data data6 = (AdditionalSettingsState.Data) additionalSettingsState2;
            boolean z9 = data6.h;
            io.reactivex.rxjava3.disposables.b bVar2 = this.e;
            zlc0 zlc0Var = this.g;
            if (z9) {
                io.reactivex.rxjava3.internal.operators.observable.m1 f = zlc0Var.f(Math.abs(data6.b.b.b), true);
                lz lzVar = new lz(new tb(this, 4), i);
                int i2 = kwg0.a;
                bVar2.b(f.subscribe(lzVar, new iwg0()));
                return;
            }
            io.reactivex.rxjava3.internal.operators.observable.m1 e = zlc0Var.e(true);
            ir0 ir0Var = new ir0(new com.vk.movika.sdk.base.observable.p(this, 3), objArr == true ? 1 : 0);
            int i3 = kwg0.a;
            bVar2.b(e.subscribe(ir0Var, new iwg0()));
        }
    }
}
