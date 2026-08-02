package com.yandex.go.navigator.repository;

import defpackage.l7z;
import defpackage.lf50;
import defpackage.mg50;
import defpackage.ny61;
import defpackage.t1l0;
import defpackage.t7s;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Calendar;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes12.dex */
public final class m implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ lf50 b;

    public m(vpr vprVar, lf50 lf50Var) {
        this.a = vprVar;
        this.b = lf50Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        NavigatorStateRepositoryImpl$special$$inlined$mapNotNull$1$2$1 navigatorStateRepositoryImpl$special$$inlined$mapNotNull$1$2$1;
        int i;
        String str;
        t1l0 t1l0Var;
        if (continuation instanceof NavigatorStateRepositoryImpl$special$$inlined$mapNotNull$1$2$1) {
            navigatorStateRepositoryImpl$special$$inlined$mapNotNull$1$2$1 = (NavigatorStateRepositoryImpl$special$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = navigatorStateRepositoryImpl$special$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                navigatorStateRepositoryImpl$special$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = navigatorStateRepositoryImpl$special$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = navigatorStateRepositoryImpl$special$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    l7z l7zVar = (l7z) obj;
                    Integer num = (l7zVar == null || (t1l0Var = l7zVar.c) == null) ? null : new Integer((int) t1l0Var.b);
                    if (num != null) {
                        mg50 mg50Var = this.b.a;
                        int intValue = num.intValue();
                        mg50Var.getClass();
                        Calendar calendar = Calendar.getInstance();
                        calendar.add(13, intValue);
                        str = t7s.c(mg50Var.a, calendar, HProv.PP_SECURITY_LEVEL);
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        navigatorStateRepositoryImpl$special$$inlined$mapNotNull$1$2$1.L$0 = null;
                        navigatorStateRepositoryImpl$special$$inlined$mapNotNull$1$2$1.L$1 = null;
                        navigatorStateRepositoryImpl$special$$inlined$mapNotNull$1$2$1.L$2 = null;
                        navigatorStateRepositoryImpl$special$$inlined$mapNotNull$1$2$1.L$3 = null;
                        navigatorStateRepositoryImpl$special$$inlined$mapNotNull$1$2$1.L$4 = null;
                        navigatorStateRepositoryImpl$special$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(str, navigatorStateRepositoryImpl$special$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        navigatorStateRepositoryImpl$special$$inlined$mapNotNull$1$2$1 = new NavigatorStateRepositoryImpl$special$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = navigatorStateRepositoryImpl$special$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = navigatorStateRepositoryImpl$special$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
