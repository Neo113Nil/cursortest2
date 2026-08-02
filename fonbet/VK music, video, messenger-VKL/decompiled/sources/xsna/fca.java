package xsna;

import android.os.SystemClock;
import com.vk.core.serialize.Serializer;
import com.vk.story.viewer.stat.data.cache.viewers.replies.RepliesCachedData;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.concurrent.Callable;
import kotlin.text.Regex;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class fca implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fca(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        boolean z;
        RepliesCachedData repliesCachedData;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return j5g.O0(((kca) obj).d);
            case 1:
                ((skl) obj).c = Long.valueOf(SystemClock.elapsedRealtime());
                return s3q0.a;
            default:
                pgm0 pgm0Var = (pgm0) obj;
                bpn0 bpn0Var = i0q0.a;
                try {
                    pgm0Var.c.await();
                    z = true;
                } catch (InterruptedException e) {
                    com.vk.metrics.eventtracking.b.a.a(e);
                    z = false;
                }
                File file = pgm0Var.b;
                if (z) {
                    Regex regex = com.vk.core.files.a.a;
                    if (vhk0.g(file)) {
                        pgm0Var.a.readLock().lock();
                        try {
                            FileInputStream fileInputStream = new FileInputStream(file);
                            try {
                                byte[] h = i7o0.h(fileInputStream);
                                byte[] l0 = rl3.l0(h, swe0.q(8, h.length));
                                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                                repliesCachedData = (RepliesCachedData) Serializer.b.a(l0, RepliesCachedData.class.getClassLoader());
                                fileInputStream.close();
                            } finally {
                            }
                        } finally {
                            try {
                                if (repliesCachedData != null) {
                                }
                            } finally {
                            }
                        }
                        return repliesCachedData != null ? new RepliesCachedData(null, 1, null) : repliesCachedData;
                    }
                }
                return new RepliesCachedData(null, 1, null);
        }
    }
}
