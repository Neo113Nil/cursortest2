package com.yandex.go.walking.navigation.impl;

import defpackage.c741;
import defpackage.d741;
import defpackage.jl40;
import defpackage.m950;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.ra00;
import defpackage.v770;
import defpackage.xes0;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.map_common.map.p;
import ru.yandex.taxi.widget.progress.SimpleSpinnerModalView;

/* loaded from: classes8.dex */
public final class a extends d741 {
    public final p b;
    public final yvf0 c;
    public final xes0 d;
    public final ra00 e;

    public a(p pVar, yvf0 yvf0Var, xes0 xes0Var, ra00 ra00Var) {
        this.b = pVar;
        this.c = yvf0Var;
        this.d = xes0Var;
        this.e = ra00Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final /* bridge */ /* synthetic */ Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        return d((c741) obj, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(c741 c741Var, ContinuationImpl continuationImpl) {
        WalkNavDeeplinkHandler$handleDeeplink$1 walkNavDeeplinkHandler$handleDeeplink$1;
        int i;
        SimpleSpinnerModalView a;
        if (continuationImpl instanceof WalkNavDeeplinkHandler$handleDeeplink$1) {
            walkNavDeeplinkHandler$handleDeeplink$1 = (WalkNavDeeplinkHandler$handleDeeplink$1) continuationImpl;
            int i2 = walkNavDeeplinkHandler$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walkNavDeeplinkHandler$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = walkNavDeeplinkHandler$handleDeeplink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = walkNavDeeplinkHandler$handleDeeplink$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!jl40.l(c741Var.a(), "guidance")) {
                        return zy11Var;
                    }
                    a = this.d.a();
                    walkNavDeeplinkHandler$handleDeeplink$1.L$0 = null;
                    walkNavDeeplinkHandler$handleDeeplink$1.L$1 = null;
                    walkNavDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    walkNavDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    walkNavDeeplinkHandler$handleDeeplink$1.L$4 = a;
                    walkNavDeeplinkHandler$handleDeeplink$1.label = 1;
                    if (this.b.c(walkNavDeeplinkHandler$handleDeeplink$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    a = (SimpleSpinnerModalView) walkNavDeeplinkHandler$handleDeeplink$1.L$4;
                    kotlin.b.b(obj);
                }
                a.dismiss();
                this.e.b((m950) this.c.get(), zy11Var);
                return zy11Var;
            }
        }
        walkNavDeeplinkHandler$handleDeeplink$1 = new WalkNavDeeplinkHandler$handleDeeplink$1(this, continuationImpl);
        Object obj2 = walkNavDeeplinkHandler$handleDeeplink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walkNavDeeplinkHandler$handleDeeplink$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        a.dismiss();
        this.e.b((m950) this.c.get(), zy11Var2);
        return zy11Var2;
    }
}
