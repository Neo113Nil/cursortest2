package com.yandex.quark.actionScheduler.internal.exactTime.storage.database;

import androidx.room.d;
import defpackage.gt2;
import defpackage.jjo;
import defpackage.p2l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes15.dex */
public final class ExactTimeJobDatabase_Impl extends ExactTimeJobDatabase {
    @Override // androidx.room.RoomDatabase
    public final List C0() {
        return new ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    public final Set F0() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public final Map H0() {
        HashMap hashMap = new HashMap();
        hashMap.put(jjo.class, Collections.EMPTY_LIST);
        return hashMap;
    }

    @Override // androidx.room.RoomDatabase
    public final d y0() {
        return new d(this, new HashMap(0), new HashMap(0), "exact_time_job");
    }

    @Override // androidx.room.RoomDatabase
    public final p2l z0() {
        return new gt2(this);
    }
}
