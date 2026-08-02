package com.yandex.go.user_profile.ui.am;

import android.app.Activity;
import android.content.Context;
import defpackage.aj0;
import defpackage.el90;
import defpackage.f12;
import defpackage.jj3;
import defpackage.mu5;
import defpackage.ny61;
import defpackage.pgd;
import defpackage.sgf0;
import defpackage.tgf0;
import defpackage.tje;
import defpackage.ul;
import defpackage.uyj;
import defpackage.w030;
import defpackage.wfd;
import defpackage.y50;
import defpackage.yvf0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.am.b0;

/* loaded from: classes14.dex */
public final class s extends pgd {
    public final w030 F;
    public final Activity G;
    public final y50 H;
    public final yvf0 I;
    public final b0 J;
    public final jj3 K;
    public final el90 L;
    public final com.yandex.go.navigation.b M;
    public final ul N;
    public final aj0 O;
    public final h P;
    public final Activity Q;
    public final mu5 R;

    public s(tgf0 tgf0Var, com.yandex.go.user_profile.ui.a aVar, w030 w030Var, Activity activity, y50 y50Var, yvf0 yvf0Var, b0 b0Var, jj3 jj3Var, el90 el90Var, com.yandex.go.navigation.b bVar, ul ulVar, aj0 aj0Var, h hVar) {
        super(0);
        this.F = w030Var;
        this.G = activity;
        this.H = y50Var;
        this.I = yvf0Var;
        this.J = b0Var;
        this.K = jj3Var;
        this.L = el90Var;
        this.M = bVar;
        this.N = ulVar;
        this.O = aj0Var;
        this.P = hVar;
        this.Q = activity;
        this.R = new mu5(new o(this, tgf0Var, aVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object U(s sVar, sgf0 sgf0Var, ContinuationImpl continuationImpl) {
        AmProfileRouter$convertState$1 amProfileRouter$convertState$1;
        int i;
        sVar.getClass();
        if (continuationImpl instanceof AmProfileRouter$convertState$1) {
            amProfileRouter$convertState$1 = (AmProfileRouter$convertState$1) continuationImpl;
            int i2 = amProfileRouter$convertState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                amProfileRouter$convertState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = amProfileRouter$convertState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = amProfileRouter$convertState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    h hVar = sVar.P;
                    amProfileRouter$convertState$1.L$0 = sgf0Var;
                    amProfileRouter$convertState$1.label = 1;
                    hVar.c.getClass();
                    obj = tje.k0(uyj.a, new AmProfileMapper$mapParams$2(sgf0Var, hVar, null, null), amProfileRouter$convertState$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sgf0Var = (sgf0) amProfileRouter$convertState$1.L$0;
                    kotlin.b.b(obj);
                }
                return new f12((String) obj, sgf0Var.a);
            }
        }
        amProfileRouter$convertState$1 = new AmProfileRouter$convertState$1(sVar, continuationImpl);
        Object obj2 = amProfileRouter$convertState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = amProfileRouter$convertState$1.label;
        if (i != 0) {
        }
        return new f12((String) obj2, sgf0Var.a);
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.R;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.Q;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.F;
    }
}
