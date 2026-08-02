package com.yandex.go.taxi.order.search.ui;

import com.yandex.go.taxi.order.domain.repositories.n;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import defpackage.a3y0;
import defpackage.gnz;
import defpackage.hnz;
import defpackage.iup0;
import defpackage.jqr;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes14.dex */
public final class c {
    public final iup0 a;
    public final hnz b;
    public final a3y0 c = new a3y0(TaxiOrderLogGroup.LONG_SEARCH_V2.getTag(), "LongSearchV2CardCollapseTimeoutRepository");

    public c(iup0 iup0Var, hnz hnzVar) {
        this.a = iup0Var;
        this.b = hnzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        LongSearchV2CardCollapseTimeoutRepository$awaitCardCollapsing$1 longSearchV2CardCollapseTimeoutRepository$awaitCardCollapsing$1;
        int i;
        if (continuationImpl instanceof LongSearchV2CardCollapseTimeoutRepository$awaitCardCollapsing$1) {
            longSearchV2CardCollapseTimeoutRepository$awaitCardCollapsing$1 = (LongSearchV2CardCollapseTimeoutRepository$awaitCardCollapsing$1) continuationImpl;
            int i2 = longSearchV2CardCollapseTimeoutRepository$awaitCardCollapsing$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                longSearchV2CardCollapseTimeoutRepository$awaitCardCollapsing$1.label = i2 - Integer.MIN_VALUE;
                Object obj = longSearchV2CardCollapseTimeoutRepository$awaitCardCollapsing$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = longSearchV2CardCollapseTimeoutRepository$awaitCardCollapsing$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    jqr jqrVar = new jqr(new b(((n) this.a).e(), str), new LongSearchV2CardCollapseTimeoutRepository$awaitCardCollapsing$3(this, str, null), 3);
                    longSearchV2CardCollapseTimeoutRepository$awaitCardCollapsing$1.L$0 = null;
                    longSearchV2CardCollapseTimeoutRepository$awaitCardCollapsing$1.label = 1;
                    if (e.y(jqrVar, longSearchV2CardCollapseTimeoutRepository$awaitCardCollapsing$1) == coroutineSingletons) {
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
        longSearchV2CardCollapseTimeoutRepository$awaitCardCollapsing$1 = new LongSearchV2CardCollapseTimeoutRepository$awaitCardCollapsing$1(this, continuationImpl);
        Object obj2 = longSearchV2CardCollapseTimeoutRepository$awaitCardCollapsing$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = longSearchV2CardCollapseTimeoutRepository$awaitCardCollapsing$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean b(o2y0 o2y0Var, ContinuationImpl continuationImpl) {
        LongSearchV2CardCollapseTimeoutRepository$waitForCardCollapse$1 longSearchV2CardCollapseTimeoutRepository$waitForCardCollapse$1;
        int i;
        boolean z;
        if (continuationImpl instanceof LongSearchV2CardCollapseTimeoutRepository$waitForCardCollapse$1) {
            longSearchV2CardCollapseTimeoutRepository$waitForCardCollapse$1 = (LongSearchV2CardCollapseTimeoutRepository$waitForCardCollapse$1) continuationImpl;
            int i2 = longSearchV2CardCollapseTimeoutRepository$waitForCardCollapse$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                longSearchV2CardCollapseTimeoutRepository$waitForCardCollapse$1.label = i2 - Integer.MIN_VALUE;
                Object obj = longSearchV2CardCollapseTimeoutRepository$waitForCardCollapse$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = longSearchV2CardCollapseTimeoutRepository$waitForCardCollapse$1.label;
                if (i == 0) {
                    z = true;
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                } else {
                    kotlin.b.b(obj);
                    if (o2y0Var != null) {
                        String str = o2y0Var.b().a;
                    }
                    this.b.a();
                    gnz gnzVar = gnz.e;
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }
        longSearchV2CardCollapseTimeoutRepository$waitForCardCollapse$1 = new LongSearchV2CardCollapseTimeoutRepository$waitForCardCollapse$1(this, continuationImpl);
        Object obj2 = longSearchV2CardCollapseTimeoutRepository$waitForCardCollapse$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = longSearchV2CardCollapseTimeoutRepository$waitForCardCollapse$1.label;
        if (i == 0) {
        }
        return Boolean.valueOf(z);
    }
}
