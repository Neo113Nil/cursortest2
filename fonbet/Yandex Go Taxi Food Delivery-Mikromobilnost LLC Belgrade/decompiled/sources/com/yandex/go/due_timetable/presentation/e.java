package com.yandex.go.due_timetable.presentation;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ g b;

    public e(vpr vprVar, g gVar) {
        this.a = vprVar;
        this.b = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0089, code lost:
    
        if (r6.emit(r8, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DueTimetablePresenter$attachView$$inlined$map$3$2$1 dueTimetablePresenter$attachView$$inlined$map$3$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof DueTimetablePresenter$attachView$$inlined$map$3$2$1) {
            dueTimetablePresenter$attachView$$inlined$map$3$2$1 = (DueTimetablePresenter$attachView$$inlined$map$3$2$1) continuation;
            int i2 = dueTimetablePresenter$attachView$$inlined$map$3$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dueTimetablePresenter$attachView$$inlined$map$3$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = dueTimetablePresenter$attachView$$inlined$map$3$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dueTimetablePresenter$attachView$$inlined$map$3$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ru.yandex.taxi.design.utils.b bVar = this.b.H;
                    dueTimetablePresenter$attachView$$inlined$map$3$2$1.L$0 = null;
                    dueTimetablePresenter$attachView$$inlined$map$3$2$1.L$1 = null;
                    dueTimetablePresenter$attachView$$inlined$map$3$2$1.L$2 = null;
                    dueTimetablePresenter$attachView$$inlined$map$3$2$1.L$3 = null;
                    vprVar = this.a;
                    dueTimetablePresenter$attachView$$inlined$map$3$2$1.L$4 = vprVar;
                    dueTimetablePresenter$attachView$$inlined$map$3$2$1.L$5 = null;
                    dueTimetablePresenter$attachView$$inlined$map$3$2$1.L$6 = null;
                    dueTimetablePresenter$attachView$$inlined$map$3$2$1.label = 1;
                    obj2 = bVar.g(24, dueTimetablePresenter$attachView$$inlined$map$3$2$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    vprVar = (vpr) dueTimetablePresenter$attachView$$inlined$map$3$2$1.L$4;
                    kotlin.b.b(obj2);
                }
                dueTimetablePresenter$attachView$$inlined$map$3$2$1.L$0 = null;
                dueTimetablePresenter$attachView$$inlined$map$3$2$1.L$1 = null;
                dueTimetablePresenter$attachView$$inlined$map$3$2$1.L$2 = null;
                dueTimetablePresenter$attachView$$inlined$map$3$2$1.L$3 = null;
                dueTimetablePresenter$attachView$$inlined$map$3$2$1.L$4 = null;
                dueTimetablePresenter$attachView$$inlined$map$3$2$1.L$5 = null;
                dueTimetablePresenter$attachView$$inlined$map$3$2$1.L$6 = null;
                dueTimetablePresenter$attachView$$inlined$map$3$2$1.label = 2;
            }
        }
        dueTimetablePresenter$attachView$$inlined$map$3$2$1 = new DueTimetablePresenter$attachView$$inlined$map$3$2$1(this, continuation);
        Object obj22 = dueTimetablePresenter$attachView$$inlined$map$3$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dueTimetablePresenter$attachView$$inlined$map$3$2$1.label;
        if (i != 0) {
        }
        dueTimetablePresenter$attachView$$inlined$map$3$2$1.L$0 = null;
        dueTimetablePresenter$attachView$$inlined$map$3$2$1.L$1 = null;
        dueTimetablePresenter$attachView$$inlined$map$3$2$1.L$2 = null;
        dueTimetablePresenter$attachView$$inlined$map$3$2$1.L$3 = null;
        dueTimetablePresenter$attachView$$inlined$map$3$2$1.L$4 = null;
        dueTimetablePresenter$attachView$$inlined$map$3$2$1.L$5 = null;
        dueTimetablePresenter$attachView$$inlined$map$3$2$1.L$6 = null;
        dueTimetablePresenter$attachView$$inlined$map$3$2$1.label = 2;
    }
}
