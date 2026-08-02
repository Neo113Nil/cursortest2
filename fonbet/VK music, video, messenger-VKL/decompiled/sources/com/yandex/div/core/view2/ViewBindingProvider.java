package com.yandex.div.core.view2;

import com.yandex.div.DivDataTag;
import com.yandex.div2.j3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.epx;
import xsna.izs;
import xsna.s3q0;

/* compiled from: ViewBindingProvider.kt */
/* loaded from: classes7.dex */
public final class ViewBindingProvider {
    private Binding current = new Binding(DivDataTag.INVALID, null);
    private final List<izs<Binding, s3q0>> observers = new ArrayList();

    public final void observeAndGet(izs<? super Binding, s3q0> izsVar) {
        izsVar.invoke(this.current);
        this.observers.add(izsVar);
    }

    public final void update(DivDataTag divDataTag, j3 j3Var) {
        if (epx.f(divDataTag, this.current.getTag()) && this.current.getData() == j3Var) {
            return;
        }
        this.current = new Binding(divDataTag, j3Var);
        Iterator<T> it = this.observers.iterator();
        while (it.hasNext()) {
            ((izs) it.next()).invoke(this.current);
        }
    }
}
