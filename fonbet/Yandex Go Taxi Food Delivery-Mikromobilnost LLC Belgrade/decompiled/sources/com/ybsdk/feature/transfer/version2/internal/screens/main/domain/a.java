package com.ybsdk.feature.transfer.version2.internal.screens.main.domain;

import defpackage.ab0;
import defpackage.jl40;
import defpackage.n90;
import defpackage.ny61;
import defpackage.o90;
import defpackage.p90;
import defpackage.tls;
import defpackage.uc8;
import defpackage.vpr;
import defpackage.w511;
import defpackage.xa0;
import defpackage.ya0;
import defpackage.za0;
import defpackage.zy11;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes3.dex */
public final class a implements vpr {
    public final /* synthetic */ tls a;
    public final /* synthetic */ b b;

    public a(tls tlsVar, b bVar) {
        this.a = tlsVar;
        this.b = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(ab0 ab0Var, Continuation continuation) {
        AddCardInteractor$observeAddCardResult$2$emit$1 addCardInteractor$observeAddCardResult$2$emit$1;
        int i;
        Object a;
        if (continuation instanceof AddCardInteractor$observeAddCardResult$2$emit$1) {
            addCardInteractor$observeAddCardResult$2$emit$1 = (AddCardInteractor$observeAddCardResult$2$emit$1) continuation;
            int i2 = addCardInteractor$observeAddCardResult$2$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addCardInteractor$observeAddCardResult$2$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = addCardInteractor$observeAddCardResult$2$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addCardInteractor$observeAddCardResult$2$emit$1.label;
                o90 o90Var = o90.a;
                tls tlsVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (ab0Var instanceof xa0) {
                        tlsVar.invoke(n90.a);
                    } else if (ab0Var instanceof ya0) {
                        tlsVar.invoke(o90Var);
                    } else {
                        if (!(ab0Var instanceof za0)) {
                            w511.b();
                            return null;
                        }
                        String str = ((za0) ab0Var).a;
                        addCardInteractor$observeAddCardResult$2$emit$1.L$0 = ab0Var;
                        addCardInteractor$observeAddCardResult$2$emit$1.label = 1;
                        a = b.a(this.b, str, addCardInteractor$observeAddCardResult$2$emit$1);
                        if (a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ab0Var = (ab0) addCardInteractor$observeAddCardResult$2$emit$1.L$0;
                kotlin.b.b(obj);
                a = ((Result) obj).getValue();
                if (!(a instanceof Result.Failure)) {
                    try {
                        for (Object obj2 : (List) a) {
                            if (jl40.l(((uc8) obj2).a, ((za0) ab0Var).a)) {
                                a = (uc8) obj2;
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    } catch (Throwable th) {
                        a = new Result.Failure(th);
                    }
                }
                if (!(a instanceof Result.Failure)) {
                    tlsVar.invoke(new p90((uc8) a));
                }
                if (Result.a(a) != null) {
                    tlsVar.invoke(o90Var);
                }
                return zy11.a;
            }
        }
        addCardInteractor$observeAddCardResult$2$emit$1 = new AddCardInteractor$observeAddCardResult$2$emit$1(this, continuation);
        Object obj3 = addCardInteractor$observeAddCardResult$2$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addCardInteractor$observeAddCardResult$2$emit$1.label;
        o90 o90Var2 = o90.a;
        tls tlsVar2 = this.a;
        if (i != 0) {
        }
        if (!(a instanceof Result.Failure)) {
        }
        if (!(a instanceof Result.Failure)) {
        }
        if (Result.a(a) != null) {
        }
        return zy11.a;
    }
}
