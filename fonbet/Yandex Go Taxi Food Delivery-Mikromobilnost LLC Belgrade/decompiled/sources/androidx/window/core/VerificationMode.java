package androidx.window.core;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/window/core/VerificationMode;", "", "STRICT", "LOG", "QUIET", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class VerificationMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ VerificationMode[] $VALUES;
    public static final VerificationMode LOG;
    public static final VerificationMode QUIET;
    public static final VerificationMode STRICT;

    static {
        VerificationMode verificationMode = new VerificationMode("STRICT", 0);
        STRICT = verificationMode;
        VerificationMode verificationMode2 = new VerificationMode("LOG", 1);
        LOG = verificationMode2;
        VerificationMode verificationMode3 = new VerificationMode("QUIET", 2);
        QUIET = verificationMode3;
        VerificationMode[] verificationModeArr = {verificationMode, verificationMode2, verificationMode3};
        $VALUES = verificationModeArr;
        $ENTRIES = a.a(verificationModeArr);
    }

    public static VerificationMode valueOf(String str) {
        return (VerificationMode) Enum.valueOf(VerificationMode.class, str);
    }

    public static VerificationMode[] values() {
        return (VerificationMode[]) $VALUES.clone();
    }
}
