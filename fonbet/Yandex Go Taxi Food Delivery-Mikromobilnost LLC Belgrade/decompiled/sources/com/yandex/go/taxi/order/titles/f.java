package com.yandex.go.taxi.order.titles;

import android.content.Context;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.repositories.n;
import defpackage.a3y0;
import defpackage.avj0;
import defpackage.crg;
import defpackage.d980;
import defpackage.e980;
import defpackage.hjz0;
import defpackage.ixx0;
import defpackage.j980;
import defpackage.jtq0;
import defpackage.kyh0;
import defpackage.kz8;
import defpackage.l980;
import defpackage.ney;
import defpackage.o2y0;
import defpackage.onz;
import defpackage.pze0;
import defpackage.pzf;
import defpackage.pzt0;
import defpackage.q48;
import defpackage.qyy0;
import defpackage.s86;
import defpackage.t48;
import defpackage.t580;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.u48;
import defpackage.vng;
import defpackage.vze0;
import defpackage.wze0;
import defpackage.xw31;
import defpackage.ysg;
import defpackage.zuj0;
import defpackage.zxs0;
import java.util.Arrays;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class f {
    public final Context a;
    public final tse b;
    public final pzf c;
    public final t580 d;
    public final zuj0 e;
    public final vze0 f;
    public final t48 g;
    public final com.yandex.go.taxi.order.repositories.c h;
    public final ixx0 i;
    public final zxs0 j;
    public final a3y0 k = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "OrderTitlesProvider");
    public d980 l;
    public pzt0 m;
    public pzt0 n;

    public f(Context context, tse tseVar, pzf pzfVar, t580 t580Var, zuj0 zuj0Var, vze0 vze0Var, t48 t48Var, com.yandex.go.taxi.order.repositories.c cVar, ixx0 ixx0Var, zxs0 zxs0Var) {
        this.a = context;
        this.b = tseVar;
        this.c = pzfVar;
        this.d = t580Var;
        this.e = zuj0Var;
        this.f = vze0Var;
        this.g = t48Var;
        this.h = cVar;
        this.i = ixx0Var;
        this.j = zxs0Var;
    }

    public final void a(l980 l980Var, TaxiOrder taxiOrder) {
        pze0 b = ((wze0) this.f).b(taxiOrder);
        int i = kyh0.order_screens_complete_title_your;
        Object[] objArr = {b.a};
        zuj0 zuj0Var = this.e;
        d980 d980Var = (d980) l980Var;
        d980Var.d(((avj0) zuj0Var).i(i, objArr));
        d980Var.c(((avj0) zuj0Var).h(kyh0.order_screens_rate_subtitle_your));
    }

    public final void b(l980 l980Var, o2y0 o2y0Var, int i, int i2) {
        d980 d980Var = (d980) l980Var;
        d980Var.d(((avj0) this.e).h(i));
        this.n = tje.N(this.b, null, null, new OrderTitlesProviderImpl$startUpdateTotwTitles$$inlined$safeCollectIn$1(this.i.a(o2y0Var), null, this, d980Var, i2, i), 3);
    }

    public final void c(o2y0 o2y0Var, boolean z, boolean z2, boolean z3, hjz0 hjz0Var) {
        pzt0 pzt0Var = this.m;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzf pzfVar = this.c;
        d980 d980Var = new d980(o2y0Var, (u48) pzfVar.e, (crg) pzfVar.f, (com.yandex.go.taxi.order.repositories.c) pzfVar.g, (jtq0) pzfVar.h, (zuj0) pzfVar.a, (s86) pzfVar.c, (ysg) pzfVar.d, (ney) pzfVar.i, (n) pzfVar.j, (ru.yandex.taxi.widget.c) pzfVar.k, (onz) pzfVar.l, (e980) pzfVar.m, (tt2) pzfVar.b);
        this.l = d980Var;
        d980Var.p = hjz0Var;
        d980Var.u = z3;
        d980Var.x = true;
        qyy0.c(new kz8(2, d980Var, z, z2));
        this.m = tje.N(this.b, null, null, new OrderTitlesProviderImpl$startUpdates$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.s(new e(new m0(this.h.b(o2y0Var), vng.l(o2y0Var.a(), OrderTitlesProviderImpl$startUpdates$1.b, vng.c), new OrderTitlesProviderImpl$startUpdates$2(3, null))), OrderTitlesProviderImpl$startUpdates$4.b), null, this, o2y0Var), 3);
        e(o2y0Var.c(), o2y0Var.b(), o2y0Var);
    }

    public final void d() {
        pzt0 pzt0Var = this.m;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 pzt0Var2 = this.n;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        d980 d980Var = this.l;
        if (d980Var != null) {
            d980Var.e();
        }
        this.l = null;
    }

    public final void e(DriveState driveState, TaxiOrder taxiOrder, o2y0 o2y0Var) {
        d980 d980Var = this.l;
        if (d980Var == null) {
            return;
        }
        pzt0 pzt0Var = this.n;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        int[] iArr = j980.a;
        int i = iArr[driveState.ordinal()];
        t580 t580Var = this.d;
        zuj0 zuj0Var = this.e;
        switch (i) {
            case 1:
            case 2:
                d980Var.d(t580Var.a(taxiOrder).b);
                break;
            case 3:
            case 4:
                d980Var.d(((avj0) zuj0Var).h(kyh0.taxischeduled_title));
                break;
            case 5:
                d980Var.d(((avj0) zuj0Var).h(kyh0.order_cancel_confirmed));
                break;
            case 6:
                b(d980Var, o2y0Var, kyh0.taxiotw_driving, kyh0.order_screens_driving_timeleft_with_hours_preview);
                break;
            case 7:
                d980Var.d(((avj0) zuj0Var).h(kyh0.taxiotw_waiting));
                break;
            case 8:
                b(d980Var, o2y0Var, kyh0.taxiotw_transporting, kyh0.order_screens_transporting_timeleft_with_hours_preview);
                break;
            case 9:
                a(d980Var, taxiOrder);
                break;
            case 10:
                d980Var.d(((avj0) zuj0Var).h(kyh0.taxiexpired_title));
                break;
        }
        switch (iArr[driveState.ordinal()]) {
            case 1:
            case 2:
                d980Var.c(t580Var.a(taxiOrder).c);
                break;
            case 3:
            case 4:
            case 5:
                d980Var.c(((avj0) zuj0Var).i(kyh0.scheduled_due_placeholder, "$DUE_DAY$", "$DUE_TIME$"));
                break;
            case 6:
            case 7:
            case 8:
                q48 a = this.g.a(taxiOrder, false);
                String str = a.b;
                String str2 = a.a;
                if (str2 != null && str2.length() != 0) {
                    if (str != null && str.length() != 0) {
                        if (!xw31.n(this.a)) {
                            d980Var.c(String.format("%s %s", Arrays.copyOf(new Object[]{str, str2}, 2)));
                            break;
                        } else {
                            d980Var.c(String.format("%s %s", Arrays.copyOf(new Object[]{str2, str}, 2)));
                            break;
                        }
                    } else {
                        d980Var.c(str2);
                        break;
                    }
                } else {
                    d980Var.c(null);
                    break;
                }
                break;
            case 9:
                a(d980Var, taxiOrder);
                break;
            case 10:
                d980Var.c(null);
                break;
        }
    }
}
