package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* renamed from: io.appmetrica.analytics.impl.s5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5160s5 implements Lo {
    public final List a;

    public C5160s5(List<? extends Pair<String, ? extends Lo>> list) {
        this.a = list;
    }

    @Override // io.appmetrica.analytics.impl.Lo
    public final String a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            String a = ((Lo) ((Pair) it.next()).j()).a();
            if (a != null && a.length() > 0) {
                return a;
            }
        }
        return null;
    }

    @Override // io.appmetrica.analytics.impl.Lo
    public final void a(String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((Lo) ((Pair) it.next()).j()).a(str);
        }
    }
}
