package com.google.firebase;

import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public /* synthetic */ class Timestamp$compareTo$2 extends PropertyReference1Impl {
    public static final Timestamp$compareTo$2 b = new Timestamp$compareTo$2("nanoseconds", 0, "getNanoseconds()I", Timestamp.class);

    @Override // kotlin.jvm.internal.PropertyReference1Impl, defpackage.jgx
    public final Object get(Object obj) {
        return Integer.valueOf(((Timestamp) obj).getNanoseconds());
    }
}
