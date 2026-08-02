package com.yandex.go.navigator.settings;

import defpackage.ab00;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.j;

/* loaded from: classes12.dex */
public final class b implements tpr {
    public final /* synthetic */ tpr[] a;
    public final /* synthetic */ c b;

    public b(tpr[] tprVarArr, c cVar) {
        this.a = tprVarArr;
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SettingsPresenter$attachView$lambda$0$$inlined$combine$1$1 settingsPresenter$attachView$lambda$0$$inlined$combine$1$1;
        int i;
        if (continuation instanceof SettingsPresenter$attachView$lambda$0$$inlined$combine$1$1) {
            settingsPresenter$attachView$lambda$0$$inlined$combine$1$1 = (SettingsPresenter$attachView$lambda$0$$inlined$combine$1$1) continuation;
            int i2 = settingsPresenter$attachView$lambda$0$$inlined$combine$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                settingsPresenter$attachView$lambda$0$$inlined$combine$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = settingsPresenter$attachView$lambda$0$$inlined$combine$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = settingsPresenter$attachView$lambda$0$$inlined$combine$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr[] tprVarArr = this.a;
                    ab00 ab00Var = new ab00(tprVarArr, 24);
                    SettingsPresenter$attachView$lambda$0$$inlined$combine$1$3 settingsPresenter$attachView$lambda$0$$inlined$combine$1$3 = new SettingsPresenter$attachView$lambda$0$$inlined$combine$1$3(null, this.b);
                    settingsPresenter$attachView$lambda$0$$inlined$combine$1$1.L$0 = null;
                    settingsPresenter$attachView$lambda$0$$inlined$combine$1$1.L$1 = null;
                    settingsPresenter$attachView$lambda$0$$inlined$combine$1$1.L$2 = null;
                    settingsPresenter$attachView$lambda$0$$inlined$combine$1$1.label = 1;
                    if (j.a(vprVar, ab00Var, settingsPresenter$attachView$lambda$0$$inlined$combine$1$3, settingsPresenter$attachView$lambda$0$$inlined$combine$1$1, tprVarArr) == coroutineSingletons) {
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
        settingsPresenter$attachView$lambda$0$$inlined$combine$1$1 = new SettingsPresenter$attachView$lambda$0$$inlined$combine$1$1(this, continuation);
        Object obj2 = settingsPresenter$attachView$lambda$0$$inlined$combine$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = settingsPresenter$attachView$lambda$0$$inlined$combine$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
