package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* loaded from: classes8.dex */
public final class Zm {
    public final HashMap a;

    public Zm() {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        Tm tm = new Tm();
        Um um = new Um();
        Vm vm = new Vm();
        Wm wm = new Wm();
        hashMap.put(C5203tm.class, tm);
        hashMap.put(C4821f2.class, um);
        hashMap.put(C5041nf.class, vm);
        hashMap.put(E3.class, wm);
    }

    public static InterfaceC4713an a(Class cls) {
        return (InterfaceC4713an) Ym.a.a.get(cls);
    }
}
