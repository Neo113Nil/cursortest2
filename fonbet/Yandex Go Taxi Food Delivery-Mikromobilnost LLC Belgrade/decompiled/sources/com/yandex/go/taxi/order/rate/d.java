package com.yandex.go.taxi.order.rate;

import defpackage.cms;
import defpackage.jl40;
import defpackage.jms;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.order.view.FeedbackView;

/* loaded from: classes14.dex */
public final /* synthetic */ class d implements FeedbackView.a, jms {
    public final /* synthetic */ c a;

    public d(c cVar) {
        this.a = cVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof FeedbackView.a) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(2, this.a, c.class, "ratingChanged", "ratingChanged(FZ)V", 0);
    }

    @Override // defpackage.w7i0
    public final void h(float f, boolean z) {
        c cVar = this.a;
        if (!z) {
            cVar.getClass();
        } else {
            cVar.G.a(f, cVar.x.b().a);
            com.yandex.go.coroutines.b.g(cVar.Jg(), null, null, new RatePresenter$ratingChanged$1(cVar, null), 3);
        }
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
