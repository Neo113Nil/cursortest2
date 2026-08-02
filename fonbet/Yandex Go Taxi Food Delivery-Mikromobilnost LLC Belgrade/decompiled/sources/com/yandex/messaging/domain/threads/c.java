package com.yandex.messaging.domain.threads;

import defpackage.at2;
import defpackage.c8u;
import defpackage.dia0;
import defpackage.kse;
import defpackage.lqo;
import defpackage.mth;
import defpackage.q98;
import defpackage.rol0;
import defpackage.sb7;
import defpackage.tpr;
import defpackage.tz10;
import defpackage.vds0;
import defpackage.vh10;
import defpackage.w5t;
import defpackage.zy11;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class c extends vds0 {
    public final w5t b;
    public final kse c;
    public final at2 d;
    public final sb7 e;
    public final lqo f;

    public c(w5t w5tVar, kse kseVar, at2 at2Var, sb7 sb7Var, lqo lqoVar) {
        super(kseVar.b);
        this.b = w5tVar;
        this.c = kseVar;
        this.d = at2Var;
        this.e = sb7Var;
        this.f = lqoVar;
    }

    public static final int d(c cVar, Long l) {
        at2 at2Var = cVar.d;
        if (l == null) {
            return ((Number) androidx.room.util.a.b(at2Var.o().a, true, false, new dia0(11))).intValue();
        }
        if (l.longValue() == 0) {
            return ((Number) androidx.room.util.a.b(at2Var.o().a, true, false, new dia0(13))).intValue();
        }
        return ((Number) androidx.room.util.a.b(at2Var.o().a, true, false, new vh10(l.longValue(), 18))).intValue();
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        c8u c8uVar = (c8u) obj;
        if (!this.f.a(tz10.j)) {
            return e(null);
        }
        Long l = c8uVar.a;
        return l != null ? e(l) : e.X(this.b.a(zy11.a), new HasThreadsMentionUseCase$run$$inlined$flatMapLatest$1(null, this));
    }

    public final tpr e(Long l) {
        return e.t(new q98(new mth(new rol0(new HasThreadsMentionUseCase$hasThreadMentionsCountFlow$1(this, l, null)), 6), 9));
    }
}
