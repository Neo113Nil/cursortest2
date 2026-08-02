package one.video.assertions;

import xsna.xe9;

/* compiled from: TrackedAssertionError.kt */
/* loaded from: classes8.dex */
public final class TrackedAssertionError extends AssertionError {
    private final String detailMessage;
    private final String event;
    private final String subSystem;
    private final String system;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TrackedAssertionError(String str, String str2, String str3) {
        super(r0.toString());
        StringBuilder a = xe9.a("[ov_sdk.", str, ".", str2, "] ");
        a.append(str3);
        this.system = "ov_sdk";
        this.subSystem = str;
        this.event = str2;
        this.detailMessage = str3;
    }
}
