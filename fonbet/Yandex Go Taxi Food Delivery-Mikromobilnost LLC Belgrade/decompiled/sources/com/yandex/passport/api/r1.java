package com.yandex.passport.api;

import com.yandex.passport.internal.entities.Partitions;
import defpackage.j73;

/* loaded from: classes8.dex */
public final class r1 {
    public static final /* synthetic */ r1 a = new r1();
    public static final Partitions b;

    static {
        String str;
        String str2;
        PassportPartition.Companion.getClass();
        str = PassportPartition.DEFAULT;
        b = new Partitions(j73.d0(new PassportPartition[]{PassportPartition.m231boximpl(str)}));
        str2 = PassportPartition.EMPTY;
        new Partitions(j73.d0(new PassportPartition[]{PassportPartition.m231boximpl(str2)}));
    }
}
