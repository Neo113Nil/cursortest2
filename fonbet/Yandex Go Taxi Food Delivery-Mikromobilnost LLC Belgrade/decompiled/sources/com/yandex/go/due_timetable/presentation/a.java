package com.yandex.go.due_timetable.presentation;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.g0n;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.r0n;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ r0n b;

    public a(vpr vprVar, r0n r0nVar) {
        this.a = vprVar;
        this.b = r0nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DueTimetablePresenter$attachView$$inlined$map$1$2$1 dueTimetablePresenter$attachView$$inlined$map$1$2$1;
        int i;
        String str;
        if (continuation instanceof DueTimetablePresenter$attachView$$inlined$map$1$2$1) {
            dueTimetablePresenter$attachView$$inlined$map$1$2$1 = (DueTimetablePresenter$attachView$$inlined$map$1$2$1) continuation;
            int i2 = dueTimetablePresenter$attachView$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dueTimetablePresenter$attachView$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = dueTimetablePresenter$attachView$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dueTimetablePresenter$attachView$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    g0n g0nVar = (g0n) obj;
                    r0n r0nVar = this.b;
                    pex0 m = ((k) r0nVar.a).m();
                    g0n a = g0n.a(g0nVar, (m == null || (str = m.b) == null) ? null : r0nVar.b.a(str), null, null, null, null, null, null, null, null, null, null, null, null, null, 16382);
                    dueTimetablePresenter$attachView$$inlined$map$1$2$1.L$0 = null;
                    dueTimetablePresenter$attachView$$inlined$map$1$2$1.L$1 = null;
                    dueTimetablePresenter$attachView$$inlined$map$1$2$1.L$2 = null;
                    dueTimetablePresenter$attachView$$inlined$map$1$2$1.L$3 = null;
                    dueTimetablePresenter$attachView$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(a, dueTimetablePresenter$attachView$$inlined$map$1$2$1) == coroutineSingletons) {
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
        dueTimetablePresenter$attachView$$inlined$map$1$2$1 = new DueTimetablePresenter$attachView$$inlined$map$1$2$1(this, continuation);
        Object obj22 = dueTimetablePresenter$attachView$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dueTimetablePresenter$attachView$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
