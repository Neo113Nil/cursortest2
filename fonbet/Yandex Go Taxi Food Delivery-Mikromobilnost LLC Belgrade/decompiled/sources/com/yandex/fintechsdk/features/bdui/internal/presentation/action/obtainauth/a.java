package com.yandex.fintechsdk.features.bdui.internal.presentation.action.obtainauth;

import android.content.Context;
import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter;
import com.yandex.fintechsdk.entities.environment.DefaultEnvironment;
import defpackage.dn90;
import defpackage.hk3;
import defpackage.hr60;
import defpackage.ig5;
import defpackage.jg5;
import defpackage.jh5;
import defpackage.jse;
import defpackage.ns31;
import defpackage.tje;
import defpackage.tse;
import defpackage.vm50;
import defpackage.wm50;
import defpackage.z22;

/* loaded from: classes12.dex */
public final class a implements jg5 {
    public final ns31 A;
    public final z22 a;
    public final hk3 b;
    public final Context c;
    public final DefaultEnvironment w;
    public final FlexAdapter x;
    public final jse y;
    public final dn90 z;

    public a(z22 z22Var, hk3 hk3Var, Context context, DefaultEnvironment defaultEnvironment, FlexAdapter flexAdapter, jse jseVar, dn90 dn90Var, ns31 ns31Var) {
        this.a = z22Var;
        this.b = hk3Var;
        this.c = context;
        this.w = defaultEnvironment;
        this.x = flexAdapter;
        this.y = jseVar;
        this.z = dn90Var;
        this.A = ns31Var;
    }

    @Override // defpackage.jg5
    public final void y(ig5 ig5Var, jh5 jh5Var) {
        wm50 wm50Var = jh5Var.a;
        if (ig5Var instanceof hr60) {
            Long l = (Long) this.b.e.a.getValue();
            if (l == null) {
                vm50 vm50Var = ((hr60) ig5Var).d;
                if (vm50Var != null) {
                    wm50Var.dispatch(vm50Var);
                    return;
                }
                return;
            }
            dn90 dn90Var = this.z;
            if (dn90Var == null) {
                vm50 vm50Var2 = ((hr60) ig5Var).d;
                if (vm50Var2 != null) {
                    wm50Var.dispatch(vm50Var2);
                    return;
                }
                return;
            }
            tse tseVar = (tse) this.A.a();
            if (tseVar == null) {
                return;
            }
            tje.N(tseVar, null, null, new ObtainAuthActionHandler$handle$3(this, ig5Var, dn90Var, l, jh5Var, null), 3);
        }
    }
}
