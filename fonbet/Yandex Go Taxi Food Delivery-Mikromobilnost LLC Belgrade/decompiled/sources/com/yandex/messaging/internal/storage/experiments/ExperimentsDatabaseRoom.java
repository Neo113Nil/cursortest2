package com.yandex.messaging.internal.storage.experiments;

import android.content.Context;
import androidx.room.RoomDatabase;
import androidx.room.c;
import defpackage.yqo;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yandex/messaging/internal/storage/experiments/ExperimentsDatabaseRoom;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "cro", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class ExperimentsDatabaseRoom extends RoomDatabase {
    public Context l;
    public volatile boolean m;
    public final ReentrantReadWriteLock n = new ReentrantReadWriteLock();

    @Override // androidx.room.RoomDatabase
    public final void K0(c cVar) {
        super.K0(cVar);
        this.l = cVar.a;
    }

    public abstract yqo S0();

    public final void flush() {
        if (M0() && !this.m && M0()) {
            ReentrantReadWriteLock reentrantReadWriteLock = this.n;
            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            int i = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                readLock.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                super.w0();
                this.m = true;
            } finally {
                while (i < readHoldCount) {
                    readLock.lock();
                    i++;
                }
                writeLock.unlock();
            }
        }
    }
}
