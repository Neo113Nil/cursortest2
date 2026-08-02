package com.yandex.go.due_timetable.data.repository.impl;

import com.yandex.go.due_timetable.data.api.ScheduledOrderSeatsAvailableApi;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wiq0;
import defpackage.wwm;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class a {
    public final tt2 a;
    public final ScheduledOrderSeatsAvailableApi b;
    public final wiq0 c;
    public final wwm d;

    public a(tt2 tt2Var, ScheduledOrderSeatsAvailableApi scheduledOrderSeatsAvailableApi, wiq0 wiq0Var, wwm wwmVar) {
        this.a = tt2Var;
        this.b = scheduledOrderSeatsAvailableApi;
        this.c = wiq0Var;
        this.d = wwmVar;
    }

    public final Object a(List list, Continuation continuation) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new ScheduledOrderSeatsAvailableRepositoryImpl$getScheduledOrderSeatsAvailable$2(this, list, null), continuation);
    }
}
