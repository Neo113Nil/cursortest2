package com.yandex.go.taxi.order.details.v2.state.elements.status_progress;

import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$StatusProgress;
import com.yandex.go.taxi.order.models.api.response.status.RideCardTimerDto;
import com.yandex.go.timer.api.TimerType;
import com.yandex.go.timer.b;
import com.yandex.go.timer.d;
import com.yandex.go.timer.k;
import defpackage.crg;
import defpackage.dez0;
import defpackage.fok0;
import defpackage.g92;
import defpackage.jtq0;
import defpackage.lbk0;
import defpackage.pdc;
import defpackage.qzo;
import defpackage.tpr;
import defpackage.vfk0;
import defpackage.w511;
import java.util.Date;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import ru.yandex.taxi.widget.c;

/* loaded from: classes14.dex */
public final class a {
    public final lbk0 a;
    public final pdc b;
    public final c c;
    public final crg d;
    public final k e;
    public final fok0 f;
    public final jtq0 g;

    public a(lbk0 lbk0Var, pdc pdcVar, c cVar, crg crgVar, k kVar, fok0 fok0Var, jtq0 jtq0Var) {
        this.a = lbk0Var;
        this.b = pdcVar;
        this.c = cVar;
        this.d = crgVar;
        this.e = kVar;
        this.f = fok0Var;
        this.g = jtq0Var;
    }

    public final g a(RideCardItemDto$StatusProgress rideCardItemDto$StatusProgress, String str, vfk0 vfk0Var) {
        tpr g92Var;
        tpr dVar;
        RideCardTimerDto rideCardTimerDto = rideCardItemDto$StatusProgress.h;
        RideCardTimerDto.TimerType timerType = rideCardTimerDto != null ? rideCardTimerDto.a : null;
        Date c = this.d.c(rideCardTimerDto != null ? rideCardTimerDto.b : null);
        Long valueOf = c != null ? Long.valueOf(c.getTime()) : null;
        if (timerType == null || valueOf == null) {
            g92Var = new g92(2, 0L);
        } else {
            TimerType a = qzo.a(timerType);
            long longValue = valueOf.longValue();
            k kVar = this.e;
            kVar.getClass();
            int i = dez0.a[a.ordinal()];
            if (i == 1) {
                dVar = new d(new b(kVar.b.b, kVar, longValue));
            } else {
                if (i != 2) {
                    w511.b();
                    return null;
                }
                dVar = kVar.d(longValue, true);
            }
            g92Var = dVar;
        }
        return e.I(g92Var, new RideCardStatusProgressItemDataSource$stateFlow$1(rideCardTimerDto, this, rideCardItemDto$StatusProgress, str, vfk0Var, null));
    }
}
