package com.yandex.passport.internal.ui.bouncer.model.middleware;

import com.yandex.passport.api.PassportLoginAction;
import com.yandex.passport.internal.report.f2;
import com.yandex.passport.internal.report.jd;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class v0 implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ w0 b;

    public v0(vpr vprVar, w0 w0Var) {
        this.a = vprVar;
        this.b = w0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SelectAccountMiddleware$accept$$inlined$map$1$2$1 selectAccountMiddleware$accept$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof SelectAccountMiddleware$accept$$inlined$map$1$2$1) {
            selectAccountMiddleware$accept$$inlined$map$1$2$1 = (SelectAccountMiddleware$accept$$inlined$map$1$2$1) continuation;
            int i2 = selectAccountMiddleware$accept$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectAccountMiddleware$accept$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = selectAccountMiddleware$accept$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectAccountMiddleware$accept$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    com.yandex.passport.internal.ui.bouncer.model.d dVar = (com.yandex.passport.internal.ui.bouncer.model.d) obj;
                    com.yandex.passport.internal.report.reporters.l lVar = this.b.a;
                    long value = dVar.a.getUid().getValue();
                    List list = dVar.b;
                    lVar.getClass();
                    f2 f2Var = f2.w;
                    jd jdVar = new jd(String.valueOf(value), 3);
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((com.yandex.passport.internal.badges.a) it.next()).a);
                    }
                    lVar.f(f2Var, jdVar, new com.yandex.passport.internal.report.a(arrayList));
                    com.yandex.passport.internal.ui.bouncer.model.h hVar = new com.yandex.passport.internal.ui.bouncer.model.h(dVar.a, PassportLoginAction.CAROUSEL);
                    selectAccountMiddleware$accept$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(hVar, selectAccountMiddleware$accept$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        selectAccountMiddleware$accept$$inlined$map$1$2$1 = new SelectAccountMiddleware$accept$$inlined$map$1$2$1(this, continuation);
        Object obj22 = selectAccountMiddleware$accept$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectAccountMiddleware$accept$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
