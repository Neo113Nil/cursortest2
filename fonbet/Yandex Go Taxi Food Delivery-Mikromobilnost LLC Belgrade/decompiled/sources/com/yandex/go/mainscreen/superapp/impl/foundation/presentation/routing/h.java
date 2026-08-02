package com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing;

import com.yandex.go.mainscreen.superapp.api.presentation.AdditionalAction;
import defpackage.a8w0;
import defpackage.bhv0;
import defpackage.c4r0;
import defpackage.chv0;
import defpackage.ehv0;
import defpackage.khv0;
import defpackage.ny61;
import defpackage.s870;
import defpackage.t870;
import defpackage.ynv0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes.dex */
public final class h {
    public final com.yandex.go.mainscreen.superapp.impl.foundation.domain.g a;
    public final s870 b;
    public final c4r0 c;

    public h(com.yandex.go.mainscreen.superapp.impl.foundation.domain.g gVar, s870 s870Var, c4r0 c4r0Var) {
        this.a = gVar;
        this.b = s870Var;
        this.c = c4r0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AdditionalAction additionalAction, String str, ContinuationImpl continuationImpl) {
        SuperAppWhereToSummaryNavigator$openSummary$1 superAppWhereToSummaryNavigator$openSummary$1;
        int i;
        khv0 bhv0Var;
        int i2;
        if (continuationImpl instanceof SuperAppWhereToSummaryNavigator$openSummary$1) {
            superAppWhereToSummaryNavigator$openSummary$1 = (SuperAppWhereToSummaryNavigator$openSummary$1) continuationImpl;
            int i3 = superAppWhereToSummaryNavigator$openSummary$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                superAppWhereToSummaryNavigator$openSummary$1.label = i3 - Integer.MIN_VALUE;
                Object obj = superAppWhereToSummaryNavigator$openSummary$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppWhereToSummaryNavigator$openSummary$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    int i4 = str.length() > 0 ? 1 : 0;
                    if (i4 != 0) {
                        c4r0.e(this.c, SelectionOrigin.SHORTCUT, str, null, 4);
                    }
                    int i5 = a8w0.a[additionalAction.ordinal()];
                    bhv0Var = i5 != 1 ? i5 != 2 ? new bhv0(0) : chv0.a : new ehv0(0);
                    superAppWhereToSummaryNavigator$openSummary$1.L$0 = null;
                    superAppWhereToSummaryNavigator$openSummary$1.L$1 = null;
                    superAppWhereToSummaryNavigator$openSummary$1.L$2 = bhv0Var;
                    superAppWhereToSummaryNavigator$openSummary$1.I$0 = i4;
                    superAppWhereToSummaryNavigator$openSummary$1.label = 1;
                    Object a = this.a.a(superAppWhereToSummaryNavigator$openSummary$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    int i6 = i4;
                    obj = a;
                    i2 = i6;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = superAppWhereToSummaryNavigator$openSummary$1.I$0;
                    bhv0Var = (khv0) superAppWhereToSummaryNavigator$openSummary$1.L$2;
                    kotlin.b.b(obj);
                }
                ((t870) this.b).a(null, "open from superapp_main where to screen", i2 != 0, (ynv0) obj, bhv0Var);
                return zy11.a;
            }
        }
        superAppWhereToSummaryNavigator$openSummary$1 = new SuperAppWhereToSummaryNavigator$openSummary$1(this, continuationImpl);
        Object obj2 = superAppWhereToSummaryNavigator$openSummary$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppWhereToSummaryNavigator$openSummary$1.label;
        if (i != 0) {
        }
        ((t870) this.b).a(null, "open from superapp_main where to screen", i2 != 0, (ynv0) obj2, bhv0Var);
        return zy11.a;
    }
}
