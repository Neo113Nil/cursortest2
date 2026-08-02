package com.vungle.ads.internal.model;

import java.util.Comparator;
import xsna.jw5;

/* loaded from: classes7.dex */
public final class g0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return jw5.b(Boolean.valueOf(((b) obj2).n()), Boolean.valueOf(((b) obj).n()));
    }
}
