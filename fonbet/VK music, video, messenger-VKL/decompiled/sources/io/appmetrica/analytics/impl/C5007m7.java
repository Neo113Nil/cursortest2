package io.appmetrica.analytics.impl;

import java.io.File;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.m7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5007m7 {
    public final U6 a;
    public final ArrayList b;

    public C5007m7(File file) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        if (file != null) {
            this.a = new Be(file, new Z6());
            arrayList.add(new Be(file, new C5221ue()));
        } else {
            this.a = new V6(new Z6());
        }
        arrayList.add(new V6(new C5221ue()));
    }
}
