package com.yandex.div.core.view2.animations;

import java.util.Iterator;
import xsna.dnp0;
import xsna.vlp0;

/* compiled from: Transitions.kt */
/* loaded from: classes7.dex */
public final class TransitionsKt {
    public static final void plusAssign(dnp0 dnp0Var, Iterable<? extends vlp0> iterable) {
        Iterator<? extends vlp0> it = iterable.iterator();
        while (it.hasNext()) {
            dnp0Var.c(it.next());
        }
    }
}
