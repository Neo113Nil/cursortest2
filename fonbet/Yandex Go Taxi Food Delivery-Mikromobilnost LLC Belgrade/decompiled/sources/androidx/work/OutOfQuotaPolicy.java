package androidx.work;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/OutOfQuotaPolicy;", "", "RUN_AS_NON_EXPEDITED_WORK_REQUEST", "DROP_WORK_REQUEST", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OutOfQuotaPolicy {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OutOfQuotaPolicy[] $VALUES;
    public static final OutOfQuotaPolicy DROP_WORK_REQUEST;
    public static final OutOfQuotaPolicy RUN_AS_NON_EXPEDITED_WORK_REQUEST;

    static {
        OutOfQuotaPolicy outOfQuotaPolicy = new OutOfQuotaPolicy("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        RUN_AS_NON_EXPEDITED_WORK_REQUEST = outOfQuotaPolicy;
        OutOfQuotaPolicy outOfQuotaPolicy2 = new OutOfQuotaPolicy("DROP_WORK_REQUEST", 1);
        DROP_WORK_REQUEST = outOfQuotaPolicy2;
        OutOfQuotaPolicy[] outOfQuotaPolicyArr = {outOfQuotaPolicy, outOfQuotaPolicy2};
        $VALUES = outOfQuotaPolicyArr;
        $ENTRIES = kotlin.enums.a.a(outOfQuotaPolicyArr);
    }

    public static OutOfQuotaPolicy valueOf(String str) {
        return (OutOfQuotaPolicy) Enum.valueOf(OutOfQuotaPolicy.class, str);
    }

    public static OutOfQuotaPolicy[] values() {
        return (OutOfQuotaPolicy[]) $VALUES.clone();
    }
}
