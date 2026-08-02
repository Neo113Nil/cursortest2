package com.google.common.collect;

import defpackage.oqb1;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes11.dex */
public final class x extends oqb1 {
    public final /* synthetic */ Comparator a = NaturalOrdering.a;

    @Override // defpackage.oqb1
    public final Map b() {
        return new TreeMap(this.a);
    }
}
