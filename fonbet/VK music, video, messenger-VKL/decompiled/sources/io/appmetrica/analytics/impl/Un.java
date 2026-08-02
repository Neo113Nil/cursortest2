package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle;
import xsna.e43;

/* loaded from: classes8.dex */
public final class Un {
    public final Q3 a;
    public final No b;
    public final ConjunctiveCompositeThreadSafeToggle c;

    public Un(Toggle toggle) {
        Q3 q3 = new Q3(C5342za.k().y());
        this.a = q3;
        No no = new No();
        this.b = no;
        this.c = new ConjunctiveCompositeThreadSafeToggle(e43.l(q3, no, toggle == null ? new Fo() : toggle), "loc-def");
    }
}
