package com.yandex.fintechsdk.features.bdui.internal.presentation.action.delayed.cancellable;

import androidx.fragment.app.FragmentActivity;
import defpackage.ig5;
import defpackage.jg5;
import defpackage.jh5;
import defpackage.l8x;
import defpackage.m18;
import defpackage.ns31;
import defpackage.rbs;
import defpackage.tje;
import defpackage.tse;
import defpackage.wm50;
import java.util.LinkedHashMap;

/* loaded from: classes12.dex */
public final class a implements jg5 {
    public final rbs a;
    public final ns31 b;
    public final LinkedHashMap c = new LinkedHashMap();

    public a(rbs rbsVar, ns31 ns31Var) {
        this.a = rbsVar;
        this.b = ns31Var;
    }

    @Override // defpackage.jg5
    public final void y(ig5 ig5Var, jh5 jh5Var) {
        FragmentActivity fragmentActivity;
        tse tseVar;
        if (!(ig5Var instanceof m18) || (fragmentActivity = (FragmentActivity) this.a.a()) == null || (tseVar = (tse) this.b.a()) == null) {
            return;
        }
        wm50 wm50Var = jh5Var.a;
        synchronized (this) {
            try {
                l8x l8xVar = (l8x) this.c.get(((m18) ig5Var).a.b);
                if (l8xVar != null) {
                    l8xVar.a(null);
                }
                this.c.put(((m18) ig5Var).a.b, tje.N(tseVar, null, null, new CancellableDelayedActionHandler$handle$1$1(ig5Var, fragmentActivity, wm50Var, null), 3));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
