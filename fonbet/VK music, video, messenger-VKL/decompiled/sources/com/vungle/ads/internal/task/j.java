package com.vungle.ads.internal.task;

import xsna.epx;

/* loaded from: classes7.dex */
public abstract class j implements com.vungle.ads.internal.executor.h {
    public abstract int a();

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (!(obj instanceof j)) {
            return -1;
        }
        return epx.g(((j) obj).a(), a());
    }
}
