package com.yandex.go.taxi.order.change.source.data;

import com.yandex.go.taxi.order.change.source.experiment.ChangeSourcePointExperiment;
import defpackage.d6z;
import defpackage.jbh;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.u3e;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class e {
    public final t1b0 a;

    public e(rqo rqoVar) {
        ChangeSourcePointExperiment.Companion.getClass();
        this.a = ((jbh) rqoVar).e(ChangeSourcePointExperiment.k);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        ChangeSourcePointExperimentRepository$confirmationModalConfig$1 changeSourcePointExperimentRepository$confirmationModalConfig$1;
        int i;
        Iterator it;
        Object obj;
        ChangeSourcePointExperiment.ChangeConfirmationScreens changeConfirmationScreens;
        if (continuationImpl instanceof ChangeSourcePointExperimentRepository$confirmationModalConfig$1) {
            changeSourcePointExperimentRepository$confirmationModalConfig$1 = (ChangeSourcePointExperimentRepository$confirmationModalConfig$1) continuationImpl;
            int i2 = changeSourcePointExperimentRepository$confirmationModalConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                changeSourcePointExperimentRepository$confirmationModalConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = changeSourcePointExperimentRepository$confirmationModalConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = changeSourcePointExperimentRepository$confirmationModalConfig$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    changeSourcePointExperimentRepository$confirmationModalConfig$1.L$0 = str;
                    changeSourcePointExperimentRepository$confirmationModalConfig$1.label = 1;
                    obj2 = this.a.b(changeSourcePointExperimentRepository$confirmationModalConfig$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) changeSourcePointExperimentRepository$confirmationModalConfig$1.L$0;
                    kotlin.b.b(obj2);
                }
                ChangeSourcePointExperiment changeSourcePointExperiment = (ChangeSourcePointExperiment) obj2;
                it = changeSourcePointExperiment.h.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (jl40.l(((ChangeSourcePointExperiment.ChangeConfirmationScreens) obj).a, str)) {
                        break;
                    }
                }
                changeConfirmationScreens = (ChangeSourcePointExperiment.ChangeConfirmationScreens) obj;
                if (changeConfirmationScreens != null) {
                    return null;
                }
                return new u3e(d6z.Y(changeSourcePointExperiment, changeConfirmationScreens.b), d6z.Y(changeSourcePointExperiment, changeConfirmationScreens.c), d6z.Y(changeSourcePointExperiment, changeConfirmationScreens.d));
            }
        }
        changeSourcePointExperimentRepository$confirmationModalConfig$1 = new ChangeSourcePointExperimentRepository$confirmationModalConfig$1(this, continuationImpl);
        Object obj22 = changeSourcePointExperimentRepository$confirmationModalConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = changeSourcePointExperimentRepository$confirmationModalConfig$1.label;
        if (i != 0) {
        }
        ChangeSourcePointExperiment changeSourcePointExperiment2 = (ChangeSourcePointExperiment) obj22;
        it = changeSourcePointExperiment2.h.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        changeConfirmationScreens = (ChangeSourcePointExperiment.ChangeConfirmationScreens) obj;
        if (changeConfirmationScreens != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        ChangeSourcePointExperimentRepository$isEnabled$1 changeSourcePointExperimentRepository$isEnabled$1;
        int i;
        if (continuationImpl instanceof ChangeSourcePointExperimentRepository$isEnabled$1) {
            changeSourcePointExperimentRepository$isEnabled$1 = (ChangeSourcePointExperimentRepository$isEnabled$1) continuationImpl;
            int i2 = changeSourcePointExperimentRepository$isEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                changeSourcePointExperimentRepository$isEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = changeSourcePointExperimentRepository$isEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = changeSourcePointExperimentRepository$isEnabled$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    changeSourcePointExperimentRepository$isEnabled$1.label = 1;
                    obj = this.a.b(changeSourcePointExperimentRepository$isEnabled$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return Boolean.valueOf(((ChangeSourcePointExperiment) obj).b);
            }
        }
        changeSourcePointExperimentRepository$isEnabled$1 = new ChangeSourcePointExperimentRepository$isEnabled$1(this, continuationImpl);
        Object obj2 = changeSourcePointExperimentRepository$isEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = changeSourcePointExperimentRepository$isEnabled$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((ChangeSourcePointExperiment) obj2).b);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        ChangeSourcePointExperimentRepository$isPinAsEntryPointEnabled$1 changeSourcePointExperimentRepository$isPinAsEntryPointEnabled$1;
        int i;
        if (continuationImpl instanceof ChangeSourcePointExperimentRepository$isPinAsEntryPointEnabled$1) {
            changeSourcePointExperimentRepository$isPinAsEntryPointEnabled$1 = (ChangeSourcePointExperimentRepository$isPinAsEntryPointEnabled$1) continuationImpl;
            int i2 = changeSourcePointExperimentRepository$isPinAsEntryPointEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                changeSourcePointExperimentRepository$isPinAsEntryPointEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = changeSourcePointExperimentRepository$isPinAsEntryPointEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = changeSourcePointExperimentRepository$isPinAsEntryPointEnabled$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    changeSourcePointExperimentRepository$isPinAsEntryPointEnabled$1.label = 1;
                    obj = this.a.b(changeSourcePointExperimentRepository$isPinAsEntryPointEnabled$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                ChangeSourcePointExperiment changeSourcePointExperiment = (ChangeSourcePointExperiment) obj;
                return Boolean.valueOf((changeSourcePointExperiment.b || changeSourcePointExperiment.i == null) ? false : true);
            }
        }
        changeSourcePointExperimentRepository$isPinAsEntryPointEnabled$1 = new ChangeSourcePointExperimentRepository$isPinAsEntryPointEnabled$1(this, continuationImpl);
        Object obj2 = changeSourcePointExperimentRepository$isPinAsEntryPointEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = changeSourcePointExperimentRepository$isPinAsEntryPointEnabled$1.label;
        if (i != 0) {
        }
        ChangeSourcePointExperiment changeSourcePointExperiment2 = (ChangeSourcePointExperiment) obj2;
        return Boolean.valueOf((changeSourcePointExperiment2.b || changeSourcePointExperiment2.i == null) ? false : true);
    }
}
