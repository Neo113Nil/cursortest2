package xsna;

import com.huawei.hms.health.aacm;
import com.huawei.hms.hihealth.data.HealthKitApiInvoker;
import com.huawei.hms.hihealth.options.HealthRecordDeleteOptions;
import com.vk.dto.common.VideoFile;
import com.vk.dto.music.Playlist;
import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class eh40 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ eh40(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Void aab;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                Playlist playlist = (Playlist) obj;
                return ((vh40) obj2).b.C(playlist.b, o25.a().c(), playlist.c);
            case 1:
                kls0 kls0Var = (kls0) obj2;
                List<VideoFile> list = (List) obj;
                ReentrantReadWriteLock reentrantReadWriteLock = kls0Var.b;
                ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                int i2 = 0;
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i3 = 0; i3 < readHoldCount; i3++) {
                    readLock.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    for (VideoFile videoFile : list) {
                        String r1 = videoFile.r1();
                        JSONObject e5 = videoFile.e5();
                        File d = kls0.d(r1);
                        com.vk.core.files.a.c(d);
                        nbr.w(d, e5.toString(), emb.b);
                        kls0Var.a.put(r1, e5);
                    }
                    s3q0 s3q0Var = s3q0.a;
                    while (i2 < readHoldCount) {
                        readLock.lock();
                        i2++;
                    }
                    writeLock.unlock();
                    return s3q0.a;
                } catch (Throwable th) {
                    while (i2 < readHoldCount) {
                        readLock.lock();
                        i2++;
                    }
                    writeLock.unlock();
                    throw th;
                }
            default:
                aab = aacm.aab((HealthKitApiInvoker) obj2, (HealthRecordDeleteOptions) obj);
                return aab;
        }
    }
}
