package xsna;

import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

/* compiled from: VideoFileOfflineRepositoryImpl.kt */
/* loaded from: classes3.dex */
public final class kls0 implements hls0 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final ReentrantReadWriteLock b = new ReentrantReadWriteLock();

    public static File d(String str) {
        PrivateFiles.a b;
        b = e8r.a.b(r1, PrivateSubdir.DOWNLOADED_VIDEO_FILES.h(), true);
        return new File(b.a, str);
    }

    @Override // xsna.hls0
    public final io.reactivex.rxjava3.internal.operators.maybe.p a(final String str) {
        return new io.reactivex.rxjava3.internal.operators.maybe.p(new Callable() { // from class: xsna.ils0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                JSONObject jSONObject;
                String str2 = str;
                kls0 kls0Var = kls0.this;
                ReentrantReadWriteLock reentrantReadWriteLock = kls0Var.b;
                LinkedHashMap linkedHashMap = kls0Var.a;
                ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                readLock.lock();
                try {
                    JSONObject jSONObject2 = (JSONObject) linkedHashMap.get(str2);
                    if (jSONObject2 != null) {
                        return jSONObject2;
                    }
                    ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
                    int i = 0;
                    int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                    for (int i2 = 0; i2 < readHoldCount; i2++) {
                        readLock2.unlock();
                    }
                    ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                    writeLock.lock();
                    try {
                        JSONObject jSONObject3 = (JSONObject) linkedHashMap.get(str2);
                        if (jSONObject3 != null) {
                            return jSONObject3;
                        }
                        File d = kls0.d(str2);
                        if (d.exists()) {
                            jSONObject = new JSONObject(nbr.r(d, emb.b));
                            linkedHashMap.put(str2, jSONObject);
                        } else {
                            jSONObject = null;
                        }
                        while (i < readHoldCount) {
                            readLock2.lock();
                            i++;
                        }
                        writeLock.unlock();
                        return jSONObject;
                    } finally {
                        while (i < readHoldCount) {
                            readLock2.lock();
                            i++;
                        }
                        writeLock.unlock();
                    }
                } finally {
                    readLock.unlock();
                }
            }
        });
    }

    @Override // xsna.hls0
    public final io.reactivex.rxjava3.internal.operators.completable.m b(List list) {
        return new io.reactivex.rxjava3.internal.operators.completable.m(new eh40(1, this, list));
    }

    @Override // xsna.hls0
    public final io.reactivex.rxjava3.internal.operators.completable.m c(String str) {
        return new io.reactivex.rxjava3.internal.operators.completable.m(new jls0(0, this, str));
    }
}
