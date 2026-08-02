package com.yandex.div.internal.viewpool;

import android.os.Handler;
import android.os.Looper;
import java.util.Map;
import xsna.s3q0;

/* compiled from: ViewPoolProfiler.kt */
/* loaded from: classes7.dex */
public final class ViewPoolProfiler {
    private final Reporter reporter;
    private final ProfilingSession session = new ProfilingSession();
    private final FrameWatcher frameWatcher = new FrameWatcher();
    private final Handler handler = new Handler(Looper.getMainLooper());

    /* compiled from: ViewPoolProfiler.kt */
    public final class FrameWatcher implements Runnable {
        private boolean watching;

        public FrameWatcher() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPoolProfiler.this.onFrameReady$div_release();
            this.watching = false;
        }

        public final void watch(Handler handler) {
            if (this.watching) {
                return;
            }
            handler.post(this);
            this.watching = true;
        }
    }

    /* compiled from: ViewPoolProfiler.kt */
    public interface Reporter {
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final Reporter NO_OP = new Reporter() { // from class: com.yandex.div.internal.viewpool.ViewPoolProfiler$Reporter$Companion$NO_OP$1
            @Override // com.yandex.div.internal.viewpool.ViewPoolProfiler.Reporter
            public void reportEvent(String str, Map<String, ? extends Object> map) {
            }
        };

        /* compiled from: ViewPoolProfiler.kt */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }
        }

        void reportEvent(String str, Map<String, ? extends Object> map);
    }

    public ViewPoolProfiler(Reporter reporter) {
        this.reporter = reporter;
    }

    public final void onFrameReady$div_release() {
        synchronized (this.session) {
            try {
                if (this.session.hasLongEvents()) {
                    this.reporter.reportEvent("view pool profiling", this.session.flush());
                }
                this.session.clear();
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void onViewObtainedWithBlock$div_release(String str, long j) {
        synchronized (this.session) {
            this.session.viewObtainedWithBlock(str, j);
            this.frameWatcher.watch(this.handler);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final void onViewObtainedWithoutBlock$div_release(long j) {
        synchronized (this.session) {
            this.session.viewObtainedWithoutBlock(j);
            this.frameWatcher.watch(this.handler);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final void onViewRequested$div_release(long j) {
        this.session.viewRequested(j);
        this.frameWatcher.watch(this.handler);
    }
}
