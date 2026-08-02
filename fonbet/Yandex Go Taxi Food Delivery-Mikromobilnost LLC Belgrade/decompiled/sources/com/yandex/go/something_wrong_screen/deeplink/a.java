package com.yandex.go.something_wrong_screen.deeplink;

import com.yandex.go.something_wrong_screen.experiment.f;
import defpackage.fx60;
import defpackage.g6u;
import defpackage.g92;
import defpackage.h3y;
import defpackage.i8t0;
import defpackage.k8t0;
import defpackage.ny61;
import defpackage.o400;
import defpackage.oep0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.v770;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes8.dex */
public final class a extends i8t0 {
    public final h3y b;
    public final fx60 c;
    public final k8t0 d;
    public final tt2 e;

    public a(h3y h3yVar, fx60 fx60Var, k8t0 k8t0Var, tt2 tt2Var) {
        this.b = h3yVar;
        this.c = fx60Var;
        this.d = k8t0Var;
        this.e = tt2Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final /* bridge */ /* synthetic */ Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        return d(oep0Var, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b8, code lost:
    
        if (r12 == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0083, code lost:
    
        if (r12 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(oep0 oep0Var, ContinuationImpl continuationImpl) {
        SomethingWrongScreenDeeplinkHandler$handleDeeplink$1 somethingWrongScreenDeeplinkHandler$handleDeeplink$1;
        Object obj;
        int i;
        if (continuationImpl instanceof SomethingWrongScreenDeeplinkHandler$handleDeeplink$1) {
            somethingWrongScreenDeeplinkHandler$handleDeeplink$1 = (SomethingWrongScreenDeeplinkHandler$handleDeeplink$1) continuationImpl;
            int i2 = somethingWrongScreenDeeplinkHandler$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                somethingWrongScreenDeeplinkHandler$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                obj = somethingWrongScreenDeeplinkHandler$handleDeeplink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = somethingWrongScreenDeeplinkHandler$handleDeeplink$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    b.b(obj);
                    Events$Zalogin$LoginContext events$Zalogin$LoginContext = Events$Zalogin$LoginContext.DEEPLINK;
                    somethingWrongScreenDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
                    somethingWrongScreenDeeplinkHandler$handleDeeplink$1.L$1 = null;
                    somethingWrongScreenDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    somethingWrongScreenDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    somethingWrongScreenDeeplinkHandler$handleDeeplink$1.label = 1;
                    obj = this.c.c(events$Zalogin$LoginContext, somethingWrongScreenDeeplinkHandler$handleDeeplink$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            b.b(obj);
                            return zy11Var;
                        }
                        oep0Var = (oep0) somethingWrongScreenDeeplinkHandler$handleDeeplink$1.L$0;
                        b.b(obj);
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (booleanValue) {
                            this.e.getClass();
                            sjh sjhVar = uyj.a;
                            g6u g6uVar = o400.a;
                            SomethingWrongScreenDeeplinkHandler$handleDeeplink$2 somethingWrongScreenDeeplinkHandler$handleDeeplink$2 = new SomethingWrongScreenDeeplinkHandler$handleDeeplink$2(oep0Var, this, null);
                            somethingWrongScreenDeeplinkHandler$handleDeeplink$1.L$0 = null;
                            somethingWrongScreenDeeplinkHandler$handleDeeplink$1.L$1 = null;
                            somethingWrongScreenDeeplinkHandler$handleDeeplink$1.L$2 = null;
                            somethingWrongScreenDeeplinkHandler$handleDeeplink$1.L$3 = null;
                            somethingWrongScreenDeeplinkHandler$handleDeeplink$1.Z$0 = booleanValue;
                            somethingWrongScreenDeeplinkHandler$handleDeeplink$1.label = 3;
                            if (tje.k0(g6uVar, somethingWrongScreenDeeplinkHandler$handleDeeplink$2, somethingWrongScreenDeeplinkHandler$handleDeeplink$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        return zy11Var;
                    }
                    oep0Var = (oep0) somethingWrongScreenDeeplinkHandler$handleDeeplink$1.L$0;
                    b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    somethingWrongScreenDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
                    somethingWrongScreenDeeplinkHandler$handleDeeplink$1.L$1 = null;
                    somethingWrongScreenDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    somethingWrongScreenDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    somethingWrongScreenDeeplinkHandler$handleDeeplink$1.label = 2;
                    obj = e.y(com.yandex.go.coroutines.b.k(new f(this.d.a().a()), 30000L, new g92(2, Boolean.FALSE)), somethingWrongScreenDeeplinkHandler$handleDeeplink$1);
                }
                return zy11Var;
            }
        }
        somethingWrongScreenDeeplinkHandler$handleDeeplink$1 = new SomethingWrongScreenDeeplinkHandler$handleDeeplink$1(this, continuationImpl);
        obj = somethingWrongScreenDeeplinkHandler$handleDeeplink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = somethingWrongScreenDeeplinkHandler$handleDeeplink$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return zy11Var2;
    }
}
