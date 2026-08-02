package org.chromium.base;

import android.os.StrictMode;
import java.io.Closeable;

/* loaded from: classes11.dex */
public class StrictModeContext implements Closeable {

    public static class Impl extends StrictModeContext {
        private final StrictMode.ThreadPolicy mThreadPolicy;
        private final StrictMode.VmPolicy mVmPolicy;

        public /* synthetic */ Impl(StrictMode.ThreadPolicy threadPolicy, int i) {
            this(threadPolicy);
        }

        @Override // org.chromium.base.StrictModeContext, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            StrictMode.ThreadPolicy threadPolicy = this.mThreadPolicy;
            if (threadPolicy != null) {
                StrictMode.setThreadPolicy(threadPolicy);
            }
            StrictMode.VmPolicy vmPolicy = this.mVmPolicy;
            if (vmPolicy != null) {
                StrictMode.setVmPolicy(vmPolicy);
            }
            TraceEvent.finishAsync("StrictModeContext", hashCode());
        }

        public /* synthetic */ Impl(StrictMode.VmPolicy vmPolicy, int i) {
            this(vmPolicy);
        }

        private Impl(StrictMode.ThreadPolicy threadPolicy, StrictMode.VmPolicy vmPolicy) {
            this.mThreadPolicy = threadPolicy;
            this.mVmPolicy = vmPolicy;
        }

        private Impl(StrictMode.ThreadPolicy threadPolicy) {
            this(threadPolicy, (StrictMode.VmPolicy) null);
        }

        private Impl(StrictMode.VmPolicy vmPolicy) {
            this((StrictMode.ThreadPolicy) null, vmPolicy);
        }
    }

    public static StrictModeContext allowAllThreadPolicies() {
        TraceEvent scoped = TraceEvent.scoped("StrictModeContext.allowAllThreadPolicies");
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            Impl impl = new Impl(threadPolicy, 0);
            if (scoped != null) {
                scoped.close();
            }
            return impl;
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static StrictModeContext allowAllVmPolicies() {
        TraceEvent scoped = TraceEvent.scoped("StrictModeContext.allowAllVmPolicies");
        try {
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
            Impl impl = new Impl(vmPolicy, 0);
            if (scoped != null) {
                scoped.close();
            }
            return impl;
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static StrictModeContext allowDiskReads() {
        TraceEvent scoped = TraceEvent.scoped("StrictModeContext.allowDiskReads");
        try {
            Impl impl = new Impl(StrictMode.allowThreadDiskReads(), 0);
            if (scoped != null) {
                scoped.close();
            }
            return impl;
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static StrictModeContext allowDiskWrites() {
        TraceEvent scoped = TraceEvent.scoped("StrictModeContext.allowDiskWrites");
        try {
            Impl impl = new Impl(StrictMode.allowThreadDiskWrites(), 0);
            if (scoped != null) {
                scoped.close();
            }
            return impl;
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static StrictModeContext allowSlowCalls() {
        TraceEvent scoped = TraceEvent.scoped("StrictModeContext.allowSlowCalls");
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitCustomSlowCalls().build());
            Impl impl = new Impl(threadPolicy, 0);
            if (scoped != null) {
                scoped.close();
            }
            return impl;
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static StrictModeContext allowUnbufferedIo() {
        TraceEvent scoped = TraceEvent.scoped("StrictModeContext.allowUnbufferedIo");
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
            Impl impl = new Impl(threadPolicy, 0);
            if (scoped != null) {
                scoped.close();
            }
            return impl;
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
