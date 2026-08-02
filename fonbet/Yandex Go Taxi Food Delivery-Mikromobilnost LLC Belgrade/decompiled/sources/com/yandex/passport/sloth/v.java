package com.yandex.passport.sloth;

import defpackage.ffx;
import defpackage.g8e;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class v {
    public final z0 a;
    public final kotlinx.coroutines.flow.n0 b = ffx.c(1, 0, null, 6);
    public final kotlinx.coroutines.flow.n0 c = ffx.c(1, 0, null, 6);
    public final kotlinx.coroutines.flow.n0 d = ffx.c(1, 0, null, 6);
    public final kotlinx.coroutines.flow.n0 e = ffx.c(1, 0, null, 6);

    public v(z0 z0Var) {
        this.a = z0Var;
    }

    public final void a(String str) {
        this.a.a(new n0(SlothMetricaEvent$Event.EVENT_SENDER, g8e.z("eventData", str)));
    }

    public final Object b(u uVar, ContinuationImpl continuationImpl) {
        String str;
        if (uVar instanceof q) {
            str = ((q) uVar).toString();
        } else if (uVar instanceof t) {
            str = "ShowPhoneNumber(...)";
        } else if (uVar instanceof o) {
            str = ((o) uVar).toString();
        } else if (uVar.equals(s.a)) {
            str = "ShowDebugUi";
        } else if (uVar instanceof p) {
            str = ((p) uVar).toString();
        } else if (uVar instanceof r) {
            str = null;
        } else {
            if (!(uVar instanceof n)) {
                w511.b();
                return null;
            }
            str = "BlockOnLoading value = " + ((n) uVar).a;
        }
        if (str != null) {
            a(str);
        }
        Object emit = this.c.emit(uVar, continuationImpl);
        return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : zy11.a;
    }

    public final Object c(i0 i0Var, ContinuationImpl continuationImpl) {
        if (!(i0Var instanceof b0)) {
            a(i0Var.toString());
        }
        Object emit = this.d.emit(i0Var, continuationImpl);
        return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : zy11.a;
    }

    public final Object d(a1 a1Var, ContinuationImpl continuationImpl) {
        a(j.b(a1Var));
        Object emit = this.e.emit(a1Var, continuationImpl);
        return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : zy11.a;
    }
}
