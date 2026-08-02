package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers;

import android.net.Uri;
import defpackage.jl40;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class a {
    public static CounterOffersLinkInteractor$InternalAction a(Uri uri) {
        Object obj = null;
        if (!jl40.l(uri.getScheme(), "plus-checkout") || !jl40.l(uri.getHost(), "co-action")) {
            return null;
        }
        Iterator<E> it = CounterOffersLinkInteractor$InternalAction.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (jl40.l(((CounterOffersLinkInteractor$InternalAction) next).getPath(), uri.getPath())) {
                obj = next;
                break;
            }
        }
        return (CounterOffersLinkInteractor$InternalAction) obj;
    }
}
