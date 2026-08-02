package com.yandex.go.summary.navigation;

import com.yandex.go.taxi.summary.shared.lifecycle.SummaryElement;
import defpackage.akv0;
import defpackage.jl40;
import defpackage.kkv0;
import defpackage.owa0;
import defpackage.pwa0;
import defpackage.rwa0;
import defpackage.swa0;
import defpackage.tls;
import defpackage.uwa0;
import defpackage.w511;
import defpackage.wjv0;
import defpackage.xjv0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.perf.screen.ElementPerformanceState;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class ComposeSummaryRouter$content$1$handlePerformanceUiAction$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        uwa0 uwa0Var = (uwa0) obj;
        akv0 akv0Var = ((kkv0) this.receiver).a;
        if (jl40.l(uwa0Var, owa0.a)) {
            akv0Var.a.i(new wjv0(ElementPerformanceState.FIRST_CONTENTFUL_PAINT));
        } else if (jl40.l(uwa0Var, pwa0.a)) {
            akv0Var.a.i(new wjv0(ElementPerformanceState.FIRST_CONTENTFUL_PAINT));
            akv0Var.a.i(new wjv0(ElementPerformanceState.LARGEST_CONTENTFUL_PAINT));
            akv0Var.b.a(SummaryElement.ORDER_BUTTON);
        } else if (jl40.l(uwa0Var, rwa0.a)) {
            akv0Var.a.i(new xjv0(ElementPerformanceState.FIRST_CONTENTFUL_PAINT));
        } else {
            if (!jl40.l(uwa0Var, swa0.a)) {
                w511.b();
                return null;
            }
            akv0Var.a.i(new xjv0(ElementPerformanceState.FIRST_CONTENTFUL_PAINT));
            akv0Var.a.i(new xjv0(ElementPerformanceState.LARGEST_CONTENTFUL_PAINT));
            akv0Var.b.a(SummaryElement.TARIFF_VIEW_HOLDER);
        }
        return zy11.a;
    }
}
