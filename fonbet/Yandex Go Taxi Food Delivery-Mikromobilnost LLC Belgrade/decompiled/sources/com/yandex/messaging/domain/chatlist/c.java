package com.yandex.messaging.domain.chatlist;

import defpackage.at2;
import defpackage.dia0;
import defpackage.kse;
import defpackage.lqo;
import defpackage.mth;
import defpackage.o7u;
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
            return ((Number) androidx.room.util.a.b(at2Var.o().a, true, false, new dia0(12))).intValue();
        }
        if (l.longValue() == 0) {
            return ((Number) androidx.room.util.a.b(at2Var.o().a, true, false, new dia0(10))).intValue();
        }
        return ((Number) androidx.room.util.a.b(at2Var.o().a, true, false, new vh10(l.longValue(), 19))).intValue();
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        o7u o7uVar = (o7u) obj;
        if (!this.f.a(tz10.j)) {
            return e(null);
        }
        Long l = o7uVar.a;
        return l != null ? e(l) : e.X(this.b.a(zy11.a), new HasChatsMentionsUseCase$run$$inlined$flatMapLatest$1(null, this));
    }

    public final tpr e(Long l) {
        return e.t(new q98(new mth(new rol0(new HasChatsMentionsUseCase$hasChatMentionsCountFlow$1(this, l, null)), 6), 8));
    }
}
