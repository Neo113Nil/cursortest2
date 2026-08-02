package com.google.common.collect;

import java.util.Map;

/* loaded from: classes11.dex */
final class EmptyImmutableListMultimap extends ImmutableListMultimap<Object, Object> {
    private static final long serialVersionUID = 0;
    public static final EmptyImmutableListMultimap y = new EmptyImmutableListMultimap(RegularImmutableMap.z, 0);

    private Object readResolve() {
        return y;
    }

    @Override // com.google.common.collect.ImmutableMultimap, defpackage.kr40
    public final Map a() {
        return this.w;
    }

    @Override // com.google.common.collect.ImmutableMultimap
    /* renamed from: c */
    public final ImmutableMap a() {
        return this.w;
    }
}
