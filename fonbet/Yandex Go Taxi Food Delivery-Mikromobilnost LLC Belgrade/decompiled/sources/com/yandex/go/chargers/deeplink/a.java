package com.yandex.go.chargers.deeplink;

import android.net.Uri;
import com.yandex.go.chargers.api.ChargersOpenReason;
import defpackage.h3y;
import defpackage.hxx;
import defpackage.m2a;
import defpackage.m5u;
import defpackage.m950;
import defpackage.n5u;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.qya;
import defpackage.vu2;
import defpackage.yvf0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class a implements vu2 {
    public final com.yandex.go.lifecycle.a a;
    public final h3y b;
    public final yvf0 c;

    public a(com.yandex.go.lifecycle.a aVar, h3y h3yVar, yvf0 yvf0Var) {
        this.a = aVar;
        this.b = h3yVar;
        this.c = yvf0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.vu2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(oep0 oep0Var, Uri uri, Continuation continuation) {
        ChargersAppLinkHandler$process$1 chargersAppLinkHandler$process$1;
        int i;
        if (continuation instanceof ChargersAppLinkHandler$process$1) {
            chargersAppLinkHandler$process$1 = (ChargersAppLinkHandler$process$1) continuation;
            int i2 = chargersAppLinkHandler$process$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersAppLinkHandler$process$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersAppLinkHandler$process$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersAppLinkHandler$process$1.label;
                h3y h3yVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!((qya) h3yVar.get()).d(uri)) {
                        return n5u.a;
                    }
                    chargersAppLinkHandler$process$1.L$0 = oep0Var;
                    chargersAppLinkHandler$process$1.L$1 = uri;
                    chargersAppLinkHandler$process$1.label = 1;
                    if (this.a.a(chargersAppLinkHandler$process$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uri = (Uri) chargersAppLinkHandler$process$1.L$1;
                    oep0Var = (oep0) chargersAppLinkHandler$process$1.L$0;
                    kotlin.b.b(obj);
                }
                m950 m950Var = (m950) this.c.get();
                ((qya) h3yVar.get()).getClass();
                ((pep0) oep0Var).f(m950Var, new m2a(ChargersOpenReason.DEEPLINK, uri), hxx.a);
                return new m5u(false, false);
            }
        }
        chargersAppLinkHandler$process$1 = new ChargersAppLinkHandler$process$1(this, (ContinuationImpl) continuation);
        Object obj2 = chargersAppLinkHandler$process$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersAppLinkHandler$process$1.label;
        h3y h3yVar2 = this.b;
        if (i != 0) {
        }
        m950 m950Var2 = (m950) this.c.get();
        ((qya) h3yVar2.get()).getClass();
        ((pep0) oep0Var).f(m950Var2, new m2a(ChargersOpenReason.DEEPLINK, uri), hxx.a);
        return new m5u(false, false);
    }
}
