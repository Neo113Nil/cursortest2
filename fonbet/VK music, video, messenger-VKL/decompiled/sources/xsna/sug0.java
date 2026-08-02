package xsna;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.squareup.wire.Message;
import com.vk.core.store.entity.models.NotificationMentions;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: RxListPersistentEntityCacheImpl.kt */
/* loaded from: classes17.dex */
public final class sug0<T extends Message<?, ?>> implements qug0<T> {
    public final zfz a;

    public sug0(zfz zfzVar) {
        this.a = zfzVar;
    }

    @Override // xsna.qug0
    public final io.reactivex.rxjava3.core.k<T> a(String str, io.reactivex.rxjava3.core.w wVar) {
        return new io.reactivex.rxjava3.internal.operators.maybe.c(new xx50(this, str)).n(wVar);
    }

    @Override // xsna.qug0
    public final io.reactivex.rxjava3.core.a b(final String str, final NotificationMentions notificationMentions, io.reactivex.rxjava3.core.w wVar) {
        return io.reactivex.rxjava3.core.a.l(new io.reactivex.rxjava3.functions.a() { // from class: xsna.rug0
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                String str2 = str;
                NotificationMentions notificationMentions2 = notificationMentions;
                zfz zfzVar = sug0.this.a;
                ReentrantReadWriteLock reentrantReadWriteLock = zfzVar.e;
                ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                int i = 0;
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i2 = 0; i2 < readHoldCount; i2++) {
                    readLock.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("key", str2);
                    contentValues.put("value", notificationMentions2.encode());
                    ((SQLiteDatabase) zfzVar.g.getValue()).insertOrThrow("entities", null, contentValues);
                    zfzVar.f.put(str2, notificationMentions2);
                    s3q0 s3q0Var = s3q0.a;
                } finally {
                    while (i < readHoldCount) {
                        readLock.lock();
                        i++;
                    }
                    writeLock.unlock();
                }
            }
        }).q(wVar);
    }
}
