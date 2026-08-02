package xsna;

import android.os.Trace;
import com.vk.clips.config.viewers.api.di.ClipsConfigViewersComponent;
import com.vk.ecomm.market.impl.di.MarketComponentImpl;
import com.vk.mapper.newsfeed.di.NewsfeedMappersComponent;
import com.vk.metrics.eventtracking.VkMainTracker;
import com.vk.newsfeed.impl.di.NewsFeedComponentImpl;
import com.vk.queue.di.QueueSyncComponentImpl;
import com.vk.toggle.features.VideoFeatures;
import java.lang.Thread;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import kotlin.Lazy;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class bky implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bky(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (com.vk.toggle.b.A.a(r0) != false) goto L12;
     */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        int i = this.b;
        boolean z = true;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((dky) obj).e.getClass();
                return true;
            case 1:
                qcy<Object>[] qcyVarArr = MarketComponentImpl.l;
                return new o08(((MarketComponentImpl) obj).U1());
            case 2:
                return ((ClipsConfigViewersComponent) ((nmg0) ((ph20) obj).c.invoke()).a(fpf0.a(ClipsConfigViewersComponent.class))).getExperiments();
            case 3:
                return ((nx50) obj).F0().p4();
            case 4:
                qcy<Object>[] qcyVarArr2 = NewsFeedComponentImpl.D;
                nwy nwyVar = ((NewsFeedComponentImpl) obj).g;
                qcy<Object> qcyVar = NewsFeedComponentImpl.D[4];
                return new eax0(((NewsfeedMappersComponent) nwyVar.c()).B1());
            case 5:
                Lazy<ese0> lazy = ((QueueSyncComponentImpl) obj).a;
                return new cse0(lazy.getValue().a, lazy.getValue().b, lazy.getValue().c, lazy.getValue().d, lazy.getValue().e, new mb3(14));
            case 6:
                bhl0 bhl0Var = (bhl0) obj;
                Trace.beginSection(ndp0.f("lazy StorageManager.usersStorageManager"));
                try {
                    b2r0 b2r0Var = new b2r0(bhl0Var.B());
                    bhl0Var.z(b2r0Var);
                    return b2r0Var;
                } finally {
                    Trace.endSection();
                }
            case 7:
                if (((qks0) obj).a) {
                    VideoFeatures videoFeatures = VideoFeatures.LAZY_OFFLINE_VIEW;
                    videoFeatures.getClass();
                    break;
                }
                z = false;
                return Boolean.valueOf(z);
            default:
                final VkMainTracker vkMainTracker = (VkMainTracker) obj;
                return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: xsna.h3v0
                    @Override // java.util.concurrent.ThreadFactory
                    public final Thread newThread(Runnable runnable) {
                        Thread thread = new Thread(runnable, "vk-event-tracking-thread");
                        final VkMainTracker vkMainTracker2 = VkMainTracker.this;
                        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: xsna.d3v0
                            @Override // java.lang.Thread.UncaughtExceptionHandler
                            public final void uncaughtException(Thread thread2, Throwable th) {
                                VkMainTracker.this.a(th);
                            }
                        });
                        return thread;
                    }
                });
        }
    }
}
