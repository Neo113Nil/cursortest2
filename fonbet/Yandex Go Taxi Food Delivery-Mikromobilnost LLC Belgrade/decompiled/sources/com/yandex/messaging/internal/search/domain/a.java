package com.yandex.messaging.internal.search.domain;

import com.yandex.messaging.domain.k;
import defpackage.kse;
import defpackage.ny61;
import defpackage.ojt;
import defpackage.pjt;
import defpackage.qjt;
import defpackage.rjt;
import defpackage.sjt;
import defpackage.tjt;
import defpackage.tpr;
import defpackage.w511;
import defpackage.w5t;
import defpackage.wjt;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class a extends k {
    public final wjt b;
    public final w5t c;

    public a(wjt wjtVar, w5t w5tVar, kse kseVar) {
        super(kseVar.d);
        this.b = wjtVar;
        this.c = w5tVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x005d, code lost:
    
        if (r12 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.yandex.messaging.domain.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(tjt tjtVar, ContinuationImpl continuationImpl) {
        AddGlobalSearchItemToRecents$run$1 addGlobalSearchItemToRecents$run$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        a aVar;
        tjt tjtVar2;
        long j;
        if (continuationImpl instanceof AddGlobalSearchItemToRecents$run$1) {
            addGlobalSearchItemToRecents$run$1 = (AddGlobalSearchItemToRecents$run$1) continuationImpl;
            int i2 = addGlobalSearchItemToRecents$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addGlobalSearchItemToRecents$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = addGlobalSearchItemToRecents$run$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addGlobalSearchItemToRecents$run$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    b.b(obj);
                    tpr a = this.c.a(zy11Var);
                    addGlobalSearchItemToRecents$run$1.L$0 = this;
                    addGlobalSearchItemToRecents$run$1.L$1 = tjtVar;
                    addGlobalSearchItemToRecents$run$1.label = 1;
                    obj = e.y(a, addGlobalSearchItemToRecents$run$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j = addGlobalSearchItemToRecents$run$1.J$0;
                        tjtVar2 = (tjt) addGlobalSearchItemToRecents$run$1.L$1;
                        aVar = (a) addGlobalSearchItemToRecents$run$1.L$0;
                        b.b(obj);
                        if (!(tjtVar2 instanceof sjt) || (tjtVar2 instanceof ojt)) {
                            aVar.b.a(j, tjtVar2);
                            return zy11Var;
                        }
                        if (tjtVar2 instanceof pjt) {
                            aVar.b.a(j, new ojt(((pjt) tjtVar2).a));
                            return zy11Var;
                        }
                        if ((tjtVar2 instanceof qjt) || (tjtVar2 instanceof rjt)) {
                            return zy11Var;
                        }
                        w511.b();
                        return null;
                    }
                    tjtVar = (tjt) addGlobalSearchItemToRecents$run$1.L$1;
                    this = (a) addGlobalSearchItemToRecents$run$1.L$0;
                    b.b(obj);
                }
                long longValue = ((Number) obj).longValue();
                addGlobalSearchItemToRecents$run$1.L$0 = this;
                addGlobalSearchItemToRecents$run$1.L$1 = tjtVar;
                addGlobalSearchItemToRecents$run$1.J$0 = longValue;
                addGlobalSearchItemToRecents$run$1.label = 2;
                if (kotlinx.coroutines.a.i(200L, addGlobalSearchItemToRecents$run$1) != coroutineSingletons) {
                    aVar = this;
                    tjtVar2 = tjtVar;
                    j = longValue;
                    if (tjtVar2 instanceof sjt) {
                    }
                    aVar.b.a(j, tjtVar2);
                    return zy11Var;
                }
                return coroutineSingletons;
            }
        }
        addGlobalSearchItemToRecents$run$1 = new AddGlobalSearchItemToRecents$run$1(this, continuationImpl);
        Object obj2 = addGlobalSearchItemToRecents$run$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addGlobalSearchItemToRecents$run$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        long longValue2 = ((Number) obj2).longValue();
        addGlobalSearchItemToRecents$run$1.L$0 = this;
        addGlobalSearchItemToRecents$run$1.L$1 = tjtVar;
        addGlobalSearchItemToRecents$run$1.J$0 = longValue2;
        addGlobalSearchItemToRecents$run$1.label = 2;
        if (kotlinx.coroutines.a.i(200L, addGlobalSearchItemToRecents$run$1) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
