package androidx.core.os;

/* loaded from: classes10.dex */
public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException(String str) {
        super(str.toString());
    }

    public OperationCanceledException() {
        super("The operation has been canceled.");
    }
}
