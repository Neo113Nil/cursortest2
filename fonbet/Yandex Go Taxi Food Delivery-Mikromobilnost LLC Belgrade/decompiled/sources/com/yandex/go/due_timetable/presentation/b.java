package com.yandex.go.due_timetable.presentation;

import defpackage.ny61;
import defpackage.r0n;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.n;

/* loaded from: classes12.dex */
public final class b implements tpr {
    public final /* synthetic */ n a;
    public final /* synthetic */ r0n b;

    public b(n nVar, r0n r0nVar) {
        this.a = nVar;
        this.b = r0nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        DueTimetablePresenter$attachView$$inlined$map$1$1 dueTimetablePresenter$attachView$$inlined$map$1$1;
        int i;
        if (continuation instanceof DueTimetablePresenter$attachView$$inlined$map$1$1) {
            dueTimetablePresenter$attachView$$inlined$map$1$1 = (DueTimetablePresenter$attachView$$inlined$map$1$1) continuation;
            int i2 = dueTimetablePresenter$attachView$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dueTimetablePresenter$attachView$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dueTimetablePresenter$attachView$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dueTimetablePresenter$attachView$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    dueTimetablePresenter$attachView$$inlined$map$1$1.L$0 = null;
                    dueTimetablePresenter$attachView$$inlined$map$1$1.L$1 = null;
                    dueTimetablePresenter$attachView$$inlined$map$1$1.L$2 = null;
                    dueTimetablePresenter$attachView$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, dueTimetablePresenter$attachView$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        dueTimetablePresenter$attachView$$inlined$map$1$1 = new DueTimetablePresenter$attachView$$inlined$map$1$1(this, continuation);
        Object obj2 = dueTimetablePresenter$attachView$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dueTimetablePresenter$attachView$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
