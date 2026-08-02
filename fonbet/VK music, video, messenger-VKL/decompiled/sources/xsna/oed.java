package xsna;

import com.vk.clips.uploader.impl.model.ClipUploadJobInternal;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

/* compiled from: ClipUploadTaskCache.kt */
/* loaded from: classes17.dex */
public final class oed {
    public final nlf a;
    public final boolean b;
    public final ConcurrentHashMap<Integer, ClipUploadJobInternal> c;
    public final CountDownLatch d;

    public oed(nlf nlfVar) {
        this.a = nlfVar;
        nlfVar.getConfig().getClass();
        this.b = true;
        this.c = new ConcurrentHashMap<>();
        this.d = new CountDownLatch(1);
    }

    public final Set<ClipUploadJobInternal> a() {
        return j5g.S0(this.c.values());
    }

    public final void b(ClipUploadJobInternal clipUploadJobInternal) {
        this.d.await();
        Integer valueOf = Integer.valueOf(clipUploadJobInternal.b.b);
        ConcurrentHashMap<Integer, ClipUploadJobInternal> concurrentHashMap = this.c;
        concurrentHashMap.put(valueOf, clipUploadJobInternal);
        if (this.b) {
            wmi0.a.m("clips.uploads", j5g.O0(concurrentHashMap.values()));
        }
    }

    public final void c(int i) {
        this.d.await();
        Integer valueOf = Integer.valueOf(i);
        ConcurrentHashMap<Integer, ClipUploadJobInternal> concurrentHashMap = this.c;
        concurrentHashMap.remove(valueOf);
        if (this.b) {
            wmi0.a.m("clips.uploads", j5g.O0(concurrentHashMap.values()));
        }
    }
}
