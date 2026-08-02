package defpackage;

import com.yandex.go.dto.response.Action$TaxiExpectedDestination;
import com.yandex.go.flex.common.api.actions.GeoPoint;
import com.yandex.go.flex.common.api.actions.TaxiExpectedDestinationAction;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class avx0 implements dw {
    public final rxr0 a;
    public final i2s0 b;
    public yux0 c;

    public avx0(rxr0 rxr0Var, i2s0 i2s0Var) {
        this.a = rxr0Var;
        this.b = i2s0Var;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [yux0] */
    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        Action$TaxiExpectedDestination.Prefetch prefetch;
        o820 o820Var;
        TaxiExpectedDestinationAction taxiExpectedDestinationAction = (TaxiExpectedDestinationAction) krVar;
        int i = zux0.a[taxiExpectedDestinationAction.e.ordinal()];
        final int i2 = 1;
        if (i == 1) {
            prefetch = Action$TaxiExpectedDestination.Prefetch.ROUTE_ETA;
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            prefetch = Action$TaxiExpectedDestination.Prefetch.NONE;
        }
        TaxiExpectedDestinationAction.ShortcutInfo shortcutInfo = taxiExpectedDestinationAction.d;
        if (shortcutInfo != null) {
            String str = shortcutInfo.b;
            String str2 = shortcutInfo.a;
            String str3 = shortcutInfo.c;
            if (str3 == null) {
                str3 = "Suggest";
            }
            o820Var = new o820(str, str2, str3, shortcutInfo.d);
        } else {
            o820Var = null;
        }
        final o820 o820Var2 = o820Var;
        yux0 yux0Var = this.c;
        if (yux0Var != null) {
            yux0Var.cancel();
        }
        GeoPoint geoPoint = taxiExpectedDestinationAction.a;
        Action$TaxiExpectedDestination action$TaxiExpectedDestination = new Action$TaxiExpectedDestination(new zzs(geoPoint.a, geoPoint.b, geoPoint.c, null, null, 24), taxiExpectedDestinationAction.b, taxiExpectedDestinationAction.c, prefetch);
        final int i3 = 0;
        final g18 b = this.a.b(new qwr0(action$TaxiExpectedDestination, o820Var2, new Runnable() { // from class: wux0
            @Override // java.lang.Runnable
            public final void run() {
                i2s0 i2s0Var;
                i2s0 i2s0Var2;
                int i4 = i3;
                avx0 avx0Var = this;
                o820 o820Var3 = o820Var2;
                switch (i4) {
                    case 0:
                        if (o820Var3 != null && (i2s0Var = avx0Var.b) != null) {
                            String str4 = o820Var3.b;
                            LinkedHashMap linkedHashMap = i2s0Var.b;
                            linkedHashMap.put(str4, Boolean.TRUE);
                            i2s0Var.a.i(new w131("superapp.forced_shimmering_shortcuts", i2s0.b(linkedHashMap)));
                            break;
                        }
                        break;
                    default:
                        if (o820Var3 != null && (i2s0Var2 = avx0Var.b) != null) {
                            i2s0Var2.a(o820Var3.b);
                            break;
                        }
                        break;
                }
            }
        }, new Runnable() { // from class: wux0
            @Override // java.lang.Runnable
            public final void run() {
                i2s0 i2s0Var;
                i2s0 i2s0Var2;
                int i4 = i2;
                avx0 avx0Var = this;
                o820 o820Var3 = o820Var2;
                switch (i4) {
                    case 0:
                        if (o820Var3 != null && (i2s0Var = avx0Var.b) != null) {
                            String str4 = o820Var3.b;
                            LinkedHashMap linkedHashMap = i2s0Var.b;
                            linkedHashMap.put(str4, Boolean.TRUE);
                            i2s0Var.a.i(new w131("superapp.forced_shimmering_shortcuts", i2s0.b(linkedHashMap)));
                            break;
                        }
                        break;
                    default:
                        if (o820Var3 != null && (i2s0Var2 = avx0Var.b) != null) {
                            i2s0Var2.a(o820Var3.b);
                            break;
                        }
                        break;
                }
            }
        }, new xux0(0, o820Var2, this)));
        this.c = new g18() { // from class: yux0
            @Override // defpackage.g18
            public final void cancel() {
                i2s0 i2s0Var;
                g18.this.cancel();
                o820 o820Var3 = o820Var2;
                if (o820Var3 == null || (i2s0Var = this.b) == null) {
                    return;
                }
                i2s0Var.a(o820Var3.b);
            }
        };
    }
}
