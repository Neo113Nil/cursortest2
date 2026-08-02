package io.appmetrica.analytics.impl;

import java.util.LinkedList;

/* renamed from: io.appmetrica.analytics.impl.x9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5291x9 extends Pf {
    public final C5274wh a;
    public final C5324yh b;
    public final C4965kh c;

    public C5291x9(C4927j5 c4927j5) {
        this.a = new C5274wh(c4927j5);
        this.b = new C5324yh(c4927j5);
        this.c = new C4965kh(c4927j5);
    }

    @Override // io.appmetrica.analytics.impl.Pf
    public final AbstractC4906i9 a(int i) {
        LinkedList linkedList = new LinkedList();
        int ordinal = EnumC5037nb.a(i).ordinal();
        if (ordinal == 1) {
            linkedList.add(this.a);
        } else if (ordinal == 3) {
            linkedList.add(this.c);
        } else if (ordinal == 27) {
            linkedList.add(this.b);
            linkedList.add(this.a);
        }
        return new C4880h9(linkedList);
    }
}
