package com.yandex.go.superapp.order.multi.old.view;

import com.yandex.go.superapp.order.multi.old.view.OrderStackView;
import defpackage.cms;
import defpackage.jl40;
import defpackage.jms;
import defpackage.o230;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes14.dex */
public final /* synthetic */ class b implements o230, jms {
    public final /* synthetic */ OrderStackView.a a;

    public b(OrderStackView.a aVar) {
        this.a = aVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof o230) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(2, this.a, OrderStackView.a.class, "onCardPositionChanged", "onCardPositionChanged(II)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
