package androidx.work;

import defpackage.ec70;
import defpackage.gl7;
import defpackage.k4o;
import defpackage.kc70;
import defpackage.rxa0;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;

/* loaded from: classes.dex */
public abstract class WorkManager {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/work/WorkManager$UpdateResult;", "", "NOT_APPLIED", "APPLIED_IMMEDIATELY", "APPLIED_FOR_NEXT_RUN", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class UpdateResult {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ UpdateResult[] $VALUES;
        public static final UpdateResult APPLIED_FOR_NEXT_RUN;
        public static final UpdateResult APPLIED_IMMEDIATELY;
        public static final UpdateResult NOT_APPLIED;

        static {
            UpdateResult updateResult = new UpdateResult("NOT_APPLIED", 0);
            NOT_APPLIED = updateResult;
            UpdateResult updateResult2 = new UpdateResult("APPLIED_IMMEDIATELY", 1);
            APPLIED_IMMEDIATELY = updateResult2;
            UpdateResult updateResult3 = new UpdateResult("APPLIED_FOR_NEXT_RUN", 2);
            APPLIED_FOR_NEXT_RUN = updateResult3;
            UpdateResult[] updateResultArr = {updateResult, updateResult2, updateResult3};
            $VALUES = updateResultArr;
            $ENTRIES = kotlin.enums.a.a(updateResultArr);
        }

        public static UpdateResult valueOf(String str) {
            return (UpdateResult) Enum.valueOf(UpdateResult.class, str);
        }

        public static UpdateResult[] values() {
            return (UpdateResult[]) $VALUES.clone();
        }
    }

    public abstract kc70 a();

    public abstract kc70 b(String str);

    public abstract kc70 c(String str);

    public abstract kc70 d(UUID uuid);

    public abstract ec70 e(List list);

    public abstract ec70 f(String str, ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, rxa0 rxa0Var);

    public abstract ec70 g(String str, ExistingWorkPolicy existingWorkPolicy, List list);

    public abstract gl7 h(String str);
}
