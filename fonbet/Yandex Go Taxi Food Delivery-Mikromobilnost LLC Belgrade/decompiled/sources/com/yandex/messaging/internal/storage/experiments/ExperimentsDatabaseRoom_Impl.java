package com.yandex.messaging.internal.storage.experiments;

import androidx.room.d;
import defpackage.bro;
import defpackage.gt2;
import defpackage.p2l;
import defpackage.yqo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes15.dex */
public final class ExperimentsDatabaseRoom_Impl extends ExperimentsDatabaseRoom {
    public volatile bro o;

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
        hashMap.put(yqo.class, Collections.EMPTY_LIST);
        return hashMap;
    }

    @Override // com.yandex.messaging.internal.storage.experiments.ExperimentsDatabaseRoom
    public final yqo S0() {
        bro broVar;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            try {
                if (this.o == null) {
                    this.o = new bro(this);
                }
                broVar = this.o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return broVar;
    }

    @Override // androidx.room.RoomDatabase
    public final d y0() {
        return new d(this, new HashMap(0), new HashMap(0), "experiments");
    }

    @Override // androidx.room.RoomDatabase
    public final p2l z0() {
        return new gt2(this);
    }
}
