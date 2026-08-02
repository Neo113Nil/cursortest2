package xsna;

import java.io.Serializable;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: GroupCallJoinParams.kt */
/* loaded from: classes2.dex */
public final class biu implements p7f0 {
    public final Serializable b;
    public Object c;

    public biu(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    @Override // xsna.i7f0
    public Object getValue(Object obj, qcy qcyVar) {
        ReentrantReadWriteLock.ReadLock readLock = ((ReentrantReadWriteLock) this.b).readLock();
        readLock.lock();
        try {
            return this.c;
        } finally {
            readLock.unlock();
        }
    }

    @Override // xsna.p7f0
    public void setValue(Object obj, qcy qcyVar, Object obj2) {
        ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) this.b;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            this.c = obj2;
            s3q0 s3q0Var = s3q0.a;
        } finally {
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    public biu(Object obj) {
        this.b = new ReentrantReadWriteLock();
        this.c = obj;
    }
}
