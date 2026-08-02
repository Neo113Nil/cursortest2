package com.yandex.go.explorer.impl.data.database;

import androidx.room.d;
import defpackage.c1o;
import defpackage.gt2;
import defpackage.i3y;
import defpackage.kto;
import defpackage.p2l;
import defpackage.qoi0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/explorer/impl/data/database/ExplorerDatabase_Impl;", "Lcom/yandex/go/explorer/impl/data/database/ExplorerDatabase;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ExplorerDatabase_Impl extends ExplorerDatabase {
    public final i3y l = a.a(new c1o(5, this));

    @Override // androidx.room.RoomDatabase
    public final Set E0() {
        return new LinkedHashSet();
    }

    @Override // androidx.room.RoomDatabase
    public final LinkedHashMap G0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(qoi0.a(kto.class), EmptyList.a);
        return linkedHashMap;
    }

    @Override // com.yandex.go.explorer.impl.data.database.ExplorerDatabase
    public final kto S0() {
        return (kto) this.l.getValue();
    }

    @Override // androidx.room.RoomDatabase
    public final List x0(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    public final d y0() {
        return new d(this, new LinkedHashMap(), new LinkedHashMap(), "explorer_discovered_hex");
    }

    @Override // androidx.room.RoomDatabase
    public final p2l z0() {
        return new gt2(this);
    }
}
