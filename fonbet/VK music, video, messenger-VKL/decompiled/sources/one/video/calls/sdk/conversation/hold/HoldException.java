package one.video.calls.sdk.conversation.hold;

import xsna.zhy0;

/* compiled from: HoldException.kt */
/* loaded from: classes8.dex */
public abstract class HoldException extends RuntimeException {
    private final String message;

    /* compiled from: HoldException.kt */
    public static final class AlreadyProcessing extends HoldException {
        public AlreadyProcessing() {
            super("Hold state processing is in progress now");
        }
    }

    /* compiled from: HoldException.kt */
    public static final class SameStateRequested extends HoldException {
        private final boolean isHold;

        public SameStateRequested(boolean z) {
            super(zhy0.a("The state is already ", z));
            this.isHold = z;
        }
    }

    /* compiled from: HoldException.kt */
    public static final class SignalingCommandExecution extends HoldException {
    }

    /* compiled from: HoldException.kt */
    public static final class Unspecified extends HoldException {
        private final Throwable cause;

        public Unspecified(Exception exc) {
            super(exc.getMessage());
            this.cause = exc;
        }

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            return this.cause;
        }
    }

    public HoldException(String str) {
        this.message = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }
}
