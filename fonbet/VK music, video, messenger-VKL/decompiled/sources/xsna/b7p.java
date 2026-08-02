package xsna;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;

/* compiled from: EduScheduleDb.kt */
/* loaded from: classes2.dex */
public final class b7p {
    public final tgl0 a;
    public final int b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EduScheduleDb.kt */
    public static final class a implements qgl0 {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a PHASE;
        public static final a SCHEDULE;
        public static final a TIMEZONE;
        public static final a UPDATE_TIME;
        public static final a USER_ID;
        private final String key;

        static {
            a aVar = new a(CommonConstant.RETKEY.USERID, 0, "user_id");
            USER_ID = aVar;
            a aVar2 = new a("TIMEZONE", 1, AnalyticsBaseParamsConstantsKt.TIMEZONE);
            TIMEZONE = aVar2;
            a aVar3 = new a("UPDATE_TIME", 2, "update_time");
            UPDATE_TIME = aVar3;
            a aVar4 = new a("PHASE", 3, "phase");
            PHASE = aVar4;
            a aVar5 = new a("SCHEDULE", 4, "user_schedule");
            SCHEDULE = aVar5;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a(String str, int i, String str2) {
            this.key = str2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        @Override // xsna.qgl0
        public final String getKey() {
            return this.key;
        }
    }

    public b7p(tgl0 tgl0Var) {
        new sgl0("edu_schedule", a.class);
        this.a = tgl0Var;
        this.b = 1;
    }
}
