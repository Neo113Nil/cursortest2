package com.yandex.go.explorer.impl.geofencing;

import android.content.Context;
import com.google.android.gms.tasks.zzw;
import defpackage.bp5;
import defpackage.c1o;
import defpackage.dtx0;
import defpackage.dvw;
import defpackage.eqs;
import defpackage.i3y;
import defpackage.j18;
import defpackage.k991;
import defpackage.mu5;
import defpackage.qke;
import defpackage.si3;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class b {
    public final Context a;
    public final i3y b = kotlin.a.a(new c1o(8, this));

    public b(Context context) {
        this.a = context;
    }

    public final Object a(ContinuationImpl continuationImpl) {
        if (c()) {
            return kotlinx.coroutines.a.w(6000L, new ExplorerLocationFetcher$fetchFreshLocation$2(this, null), continuationImpl);
        }
        return null;
    }

    public final Object b(ContinuationImpl continuationImpl) {
        if (!c()) {
            return null;
        }
        j18 j18Var = new j18(1, dvw.b(continuationImpl));
        j18Var.u();
        zzw e = ((k991) ((eqs) this.b.getValue())).e();
        mu5 mu5Var = new mu5(new si3(j18Var, 6));
        e.getClass();
        e.g(dtx0.a, mu5Var);
        e.d(new bp5(j18Var));
        Object s = j18Var.s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }

    public final boolean c() {
        Context context = this.a;
        return (qke.h(context, "android.permission.ACCESS_FINE_LOCATION") == 0) && (qke.h(context, "android.permission.ACCESS_BACKGROUND_LOCATION") == 0);
    }
}
