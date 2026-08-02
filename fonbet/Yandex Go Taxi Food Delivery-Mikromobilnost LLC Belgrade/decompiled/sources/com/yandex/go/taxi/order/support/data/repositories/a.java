package com.yandex.go.taxi.order.support.data.repositories;

import com.yandex.go.taxi.order.support.data.mappers.b;
import defpackage.bvf0;
import defpackage.k7x0;
import defpackage.mdh;
import defpackage.miw0;
import defpackage.noh;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.pav;
import defpackage.pwy0;
import defpackage.qit0;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.o;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class a {
    public final o2y0 a;
    public final tt2 b;
    public final b c;
    public final pav d;
    public final pwy0 e;
    public final k7x0 f;
    public volatile noh g;
    public final r0 h = bvf0.c(null);
    public final r0 i = bvf0.c(null);

    public a(o2y0 o2y0Var, tt2 tt2Var, b bVar, pav pavVar, pwy0 pwy0Var, k7x0 k7x0Var) {
        this.a = o2y0Var;
        this.b = tt2Var;
        this.c = bVar;
        this.d = pavVar;
        this.e = pwy0Var;
        this.f = k7x0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        SupportRepository$getSupportAction$1 supportRepository$getSupportAction$1;
        int i;
        Map map;
        if (continuationImpl instanceof SupportRepository$getSupportAction$1) {
            supportRepository$getSupportAction$1 = (SupportRepository$getSupportAction$1) continuationImpl;
            int i2 = supportRepository$getSupportAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                supportRepository$getSupportAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = supportRepository$getSupportAction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = supportRepository$getSupportAction$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    noh nohVar = this.g;
                    if (nohVar == null) {
                        map = null;
                        if (map != null) {
                            return (miw0) map.get(str);
                        }
                        return null;
                    }
                    supportRepository$getSupportAction$1.L$0 = str;
                    supportRepository$getSupportAction$1.label = 1;
                    obj = nohVar.k(supportRepository$getSupportAction$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) supportRepository$getSupportAction$1.L$0;
                    kotlin.b.b(obj);
                }
                map = (Map) obj;
                if (map != null) {
                }
            }
        }
        supportRepository$getSupportAction$1 = new SupportRepository$getSupportAction$1(this, continuationImpl);
        Object obj2 = supportRepository$getSupportAction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = supportRepository$getSupportAction$1.label;
        if (i != 0) {
        }
        map = (Map) obj2;
        if (map != null) {
        }
    }

    public final Object b(Continuation continuation) {
        g I = e.I(this.a.a(), new SupportRepository$loadSupportItems$2(this, null));
        this.b.getClass();
        sjh sjhVar = uyj.a;
        return new o(e.F(I, mdh.b), new SupportRepository$loadSupportItems$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null)).collect(new qit0(24, this), continuation);
    }

    public final tpr c() {
        g I = e.I(new m0(this.e.a(), e.d(this.i), new SupportRepository$supportIconStateFlow$1(this, null)), new SupportRepository$supportIconStateFlow$2(this, null));
        this.b.getClass();
        sjh sjhVar = uyj.a;
        return e.F(I, mdh.b);
    }
}
