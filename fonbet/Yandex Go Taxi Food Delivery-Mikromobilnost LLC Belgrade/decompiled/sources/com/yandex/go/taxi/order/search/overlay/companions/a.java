package com.yandex.go.taxi.order.search.overlay.companions;

import com.yandex.go.taxi.order.domain.repositories.n;
import com.yandex.go.taxi.order.state.search.SearchState;
import defpackage.bvf0;
import defpackage.gci0;
import defpackage.ike;
import defpackage.iup0;
import defpackage.jl40;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.pzt0;
import defpackage.sjh;
import defpackage.tt2;
import defpackage.uyj;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class a {
    public final iup0 a;
    public final ike b;
    public pzt0 c;
    public boolean d;
    public final r0 e;
    public final gci0 f;

    public a(iup0 iup0Var, tt2 tt2Var) {
        this.a = iup0Var;
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        this.b = bvf0.a(mdh.b.plus(jl40.a()));
        this.d = true;
        r0 c = bvf0.c(Double.valueOf(0.0d));
        this.e = c;
        this.f = e.d(c);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, o2y0 o2y0Var, ContinuationImpl continuationImpl) {
        CompanionsSearchInteractor$getBubblesWithDelayBeforeShowing$1 companionsSearchInteractor$getBubblesWithDelayBeforeShowing$1;
        int i;
        if (continuationImpl instanceof CompanionsSearchInteractor$getBubblesWithDelayBeforeShowing$1) {
            companionsSearchInteractor$getBubblesWithDelayBeforeShowing$1 = (CompanionsSearchInteractor$getBubblesWithDelayBeforeShowing$1) continuationImpl;
            int i2 = companionsSearchInteractor$getBubblesWithDelayBeforeShowing$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                companionsSearchInteractor$getBubblesWithDelayBeforeShowing$1.label = i2 - Integer.MIN_VALUE;
                Object obj = companionsSearchInteractor$getBubblesWithDelayBeforeShowing$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = companionsSearchInteractor$getBubblesWithDelayBeforeShowing$1.label;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    List list2 = (List) companionsSearchInteractor$getBubblesWithDelayBeforeShowing$1.L$0;
                    kotlin.b.b(obj);
                    return list2;
                }
                kotlin.b.b(obj);
                if (this.d && !list.isEmpty() && o2y0Var != null) {
                    this.d = false;
                    SearchState k = ((n) this.a).k(o2y0Var.b().a);
                    Long l = k != null ? k.r : null;
                    long longValue = l != null ? l.longValue() : 0L;
                    companionsSearchInteractor$getBubblesWithDelayBeforeShowing$1.L$0 = list;
                    companionsSearchInteractor$getBubblesWithDelayBeforeShowing$1.L$1 = null;
                    companionsSearchInteractor$getBubblesWithDelayBeforeShowing$1.L$2 = null;
                    companionsSearchInteractor$getBubblesWithDelayBeforeShowing$1.label = 1;
                    if (kotlinx.coroutines.a.i(longValue, companionsSearchInteractor$getBubblesWithDelayBeforeShowing$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return list;
            }
        }
        companionsSearchInteractor$getBubblesWithDelayBeforeShowing$1 = new CompanionsSearchInteractor$getBubblesWithDelayBeforeShowing$1(this, continuationImpl);
        Object obj2 = companionsSearchInteractor$getBubblesWithDelayBeforeShowing$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = companionsSearchInteractor$getBubblesWithDelayBeforeShowing$1.label;
        if (i == 0) {
        }
    }
}
