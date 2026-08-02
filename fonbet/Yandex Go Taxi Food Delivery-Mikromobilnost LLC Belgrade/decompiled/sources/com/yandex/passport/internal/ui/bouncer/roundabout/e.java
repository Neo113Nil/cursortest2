package com.yandex.passport.internal.ui.bouncer.roundabout;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ui.bouncer.model.DisplayState;
import com.yandex.passport.internal.ui.bouncer.model.t2;
import defpackage.jl40;
import java.util.List;

/* loaded from: classes2.dex */
public final class e {
    public final com.yandex.passport.common.coroutine.a a;
    public final l b;
    public final com.yandex.passport.internal.report.reporters.n c;
    public final com.yandex.passport.internal.flags.j d;

    public e(com.yandex.passport.common.coroutine.a aVar, l lVar, com.yandex.passport.internal.report.reporters.n nVar, com.yandex.passport.internal.flags.j jVar) {
        this.a = aVar;
        this.b = lVar;
        this.c = nVar;
        this.d = jVar;
    }

    public final DisplayState a(t2 t2Var, List list, int i) {
        Uid a;
        if (((Boolean) this.d.b(com.yandex.passport.internal.flags.q.r0)).booleanValue() && (a = t2Var.a()) != null) {
            t2 t2Var2 = (t2) kotlin.collections.a.S(i - 1, list);
            Uid a2 = t2Var2 != null ? t2Var2.a() : null;
            t2 t2Var3 = (t2) kotlin.collections.a.S(i + 1, list);
            Uid a3 = t2Var3 != null ? t2Var3.a() : null;
            return (jl40.l(a2, a) || jl40.l(a3, a)) ? !jl40.l(a2, a) ? DisplayState.FirstInGroup : !jl40.l(a3, a) ? DisplayState.LastInGroup : DisplayState.MidInGroup : DisplayState.Simple;
        }
        return DisplayState.Simple;
    }
}
