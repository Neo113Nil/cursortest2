package androidx.work;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/BackoffPolicy;", "", "EXPONENTIAL", "LINEAR", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BackoffPolicy {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BackoffPolicy[] $VALUES;
    public static final BackoffPolicy EXPONENTIAL;
    public static final BackoffPolicy LINEAR;

    static {
        BackoffPolicy backoffPolicy = new BackoffPolicy("EXPONENTIAL", 0);
        EXPONENTIAL = backoffPolicy;
        BackoffPolicy backoffPolicy2 = new BackoffPolicy("LINEAR", 1);
        LINEAR = backoffPolicy2;
        BackoffPolicy[] backoffPolicyArr = {backoffPolicy, backoffPolicy2};
        $VALUES = backoffPolicyArr;
        $ENTRIES = kotlin.enums.a.a(backoffPolicyArr);
    }

    public static BackoffPolicy valueOf(String str) {
        return (BackoffPolicy) Enum.valueOf(BackoffPolicy.class, str);
    }

    public static BackoffPolicy[] values() {
        return (BackoffPolicy[]) $VALUES.clone();
    }
}
