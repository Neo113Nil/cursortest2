package org.chromium.net.impl;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executor;
import org.chromium.net.InlineExecutionProhibitedException;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.lhg;

/* loaded from: classes8.dex */
public final class JavaUrlRequestUtils {

    public interface CheckedRunnable {
        void run() throws Exception;
    }

    public static final class DirectPreventingExecutor implements Executor {
        private final Executor mDelegate;

        public static final class InlineCheckingRunnable implements Runnable {
            private Thread mCallingThread;
            private final Runnable mCommand;
            private InlineExecutionProhibitedException mExecutedInline;

            public /* synthetic */ InlineCheckingRunnable(Runnable runnable, Thread thread, int i) {
                this(runnable, thread);
            }

            @Override // java.lang.Runnable
            public void run() {
                if (Thread.currentThread() == this.mCallingThread) {
                    this.mExecutedInline = new InlineExecutionProhibitedException();
                } else {
                    this.mCommand.run();
                }
            }

            private InlineCheckingRunnable(Runnable runnable, Thread thread) {
                this.mCommand = runnable;
                this.mCallingThread = thread;
            }
        }

        public DirectPreventingExecutor(Executor executor) {
            this.mDelegate = executor;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            InlineCheckingRunnable inlineCheckingRunnable = new InlineCheckingRunnable(runnable, Thread.currentThread(), 0);
            this.mDelegate.execute(inlineCheckingRunnable);
            if (inlineCheckingRunnable.mExecutedInline != null) {
                throw inlineCheckingRunnable.mExecutedInline;
            }
            inlineCheckingRunnable.mCallingThread = null;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
        public static final int AWAITING_FOLLOW_REDIRECT = 3;
        public static final int AWAITING_READ = 4;
        public static final int CANCELLED = 8;
        public static final int COMPLETE = 7;
        public static final int ERROR = 6;
        public static final int NOT_STARTED = 0;
        public static final int READING = 5;
        public static final int REDIRECT_RECEIVED = 2;
        public static final int STARTED = 1;
    }

    public static String stateToString(int i) {
        switch (i) {
            case 0:
                return "NOT_STARTED";
            case 1:
                return SignalingProtocol.STATE_STARTED;
            case 2:
                return "REDIRECT_RECEIVED";
            case 3:
                return "AWAITING_FOLLOW_REDIRECT";
            case 4:
                return "AWAITING_READ";
            case 5:
                return "READING";
            case 6:
                return "ERROR";
            case 7:
                return "COMPLETE";
            case 8:
                return "CANCELLED";
            default:
                throw new IllegalArgumentException(lhg.a(i, "Unknown state "));
        }
    }
}
