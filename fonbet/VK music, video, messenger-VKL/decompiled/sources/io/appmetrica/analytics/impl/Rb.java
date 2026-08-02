package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class Rb {
    public final C4693a3 a;
    public final C5157s2 b;
    public final ArrayList c;

    public Rb(C4693a3 c4693a3, C5157s2 c5157s2) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.a = c4693a3;
        arrayList.add(c4693a3);
        this.b = c5157s2;
        arrayList.add(c5157s2);
    }

    public final synchronized void a() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((InterfaceC5252vk) it.next()).onCreate();
        }
    }

    public final synchronized void a(C5317ya c5317ya) {
        this.c.add(c5317ya);
    }
}
