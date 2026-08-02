package com.ybsdk.common.domain;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.PublicApiEvents$PublicApiPlusShortcutWidgetDataResultResult;
import defpackage.ag51;
import defpackage.bg51;
import defpackage.cg51;
import defpackage.dg51;
import defpackage.eg51;
import defpackage.em3;
import defpackage.ig51;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.w511;
import java.util.Collections;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class c {
    public final com.ybsdk.common.repositiories.plus.a a;
    public final AppAnalyticsReporter b;
    public volatile ig51 c;

    public c(com.ybsdk.common.repositiories.plus.a aVar, AppAnalyticsReporter appAnalyticsReporter) {
        this.a = aVar;
        this.b = appAnalyticsReporter;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ag51 ag51Var, Object obj, ContinuationImpl continuationImpl) {
        GetPlusDataInteractor$getPlusShortcutData$1 getPlusDataInteractor$getPlusShortcutData$1;
        int i;
        eg51 cg51Var;
        if (continuationImpl instanceof GetPlusDataInteractor$getPlusShortcutData$1) {
            getPlusDataInteractor$getPlusShortcutData$1 = (GetPlusDataInteractor$getPlusShortcutData$1) continuationImpl;
            int i2 = getPlusDataInteractor$getPlusShortcutData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getPlusDataInteractor$getPlusShortcutData$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = getPlusDataInteractor$getPlusShortcutData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getPlusDataInteractor$getPlusShortcutData$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    this.b.W.a.a("public_api.plus_shortcut_widget_data.requested", null);
                    Throwable a = Result.a(obj);
                    if (a != null) {
                        cg51Var = new cg51(Collections.singletonList(new bg51(null, a)));
                        if (cg51Var instanceof dg51) {
                            em3.r(this.b.W, PublicApiEvents$PublicApiPlusShortcutWidgetDataResultResult.OK, Boolean.valueOf(!jl40.l(this.c, r1.a())), null, 4);
                            this.c = ((dg51) cg51Var).a();
                            return cg51Var;
                        }
                        if (!(cg51Var instanceof cg51)) {
                            w511.b();
                            return null;
                        }
                        em3 em3Var = this.b.W;
                        PublicApiEvents$PublicApiPlusShortcutWidgetDataResultResult publicApiEvents$PublicApiPlusShortcutWidgetDataResultResult = PublicApiEvents$PublicApiPlusShortcutWidgetDataResultResult.ERROR;
                        bg51 bg51Var = (bg51) kotlin.collections.a.b0(((cg51) cg51Var).a());
                        em3.r(em3Var, publicApiEvents$PublicApiPlusShortcutWidgetDataResultResult, null, bg51Var != null ? bg51Var.a().getMessage() : null, 2);
                        return cg51Var;
                    }
                    com.ybsdk.common.repositiories.plus.a aVar = this.a;
                    String a2 = ag51Var.a().a();
                    getPlusDataInteractor$getPlusShortcutData$1.label = 1;
                    obj2 = aVar.a(a2, getPlusDataInteractor$getPlusShortcutData$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                cg51Var = (eg51) obj2;
                if (cg51Var instanceof dg51) {
                }
            }
        }
        getPlusDataInteractor$getPlusShortcutData$1 = new GetPlusDataInteractor$getPlusShortcutData$1(this, continuationImpl);
        Object obj22 = getPlusDataInteractor$getPlusShortcutData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getPlusDataInteractor$getPlusShortcutData$1.label;
        if (i != 0) {
        }
        cg51Var = (eg51) obj22;
        if (cg51Var instanceof dg51) {
        }
    }
}
