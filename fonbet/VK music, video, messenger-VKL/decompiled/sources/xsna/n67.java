package xsna;

import android.content.Context;
import com.vk.dto.Push;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: BiometricsLockInternalInteractor.kt */
/* loaded from: classes.dex */
public final class n67 {
    public final ReentrantReadWriteLock a = new ReentrantReadWriteLock();
    public final LinkedHashMap<String, gzs<s3q0>> b = new LinkedHashMap<>();
    public final bpn0 c = new bpn0(new c24(1));
    public final bpn0 d = new bpn0(new l67(0));

    public static void c(Map map) {
        bpn0 bpn0Var = dm10.d;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        xhe0 xhe0Var = (xhe0) bpn0Var.getValue();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put("hide_content", "0");
        linkedHashMap.put("sound", "0");
        xhe0Var.c(new Push(linkedHashMap, (Push.Priority) null, 2));
    }

    public final io.reactivex.rxjava3.subjects.d<q97> a() {
        return (io.reactivex.rxjava3.subjects.d) this.d.getValue();
    }

    public final io.reactivex.rxjava3.subjects.d<Boolean> b() {
        return (io.reactivex.rxjava3.subjects.d) this.c.getValue();
    }

    public final void d(Context context) {
        asu0.a.getClass();
        asu0.s().submit(new ic3(context, this));
    }

    /* JADX WARN: Finally extract failed */
    public final void e() {
        LinkedHashMap<String, gzs<s3q0>> linkedHashMap = this.b;
        ReentrantReadWriteLock reentrantReadWriteLock = this.a;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
            linkedHashMap.clear();
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
            Iterator it = linkedHashMap2.entrySet().iterator();
            while (it.hasNext()) {
                ((gzs) ((Map.Entry) it.next()).getValue()).invoke();
            }
        } catch (Throwable th) {
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }
}
