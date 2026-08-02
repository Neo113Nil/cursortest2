package xsna;

import com.huawei.hms.support.api.entity.common.CommonConstant;

/* compiled from: EduRolesDb.kt */
/* loaded from: classes2.dex */
public final class r6p {
    public final tgl0 b;
    public final /* synthetic */ sgl0 a = new sgl0("edu_user_roles", a.class);
    public final int c = 1;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EduRolesDb.kt */
    public static final class a implements qgl0 {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a MAIN_CODE_ROLES;
        public static final a MAIN_ROLES;
        public static final a ORGANIZATION_ID;
        public static final a ROLE_CODE;
        public static final a ROLE_DETAIL;
        public static final a ROLE_SORT;
        public static final a UPDATE_TIME;
        public static final a USER_ID;
        private final String key;

        static {
            a aVar = new a("UPDATE_TIME", 0, "update_time");
            UPDATE_TIME = aVar;
            a aVar2 = new a(CommonConstant.RETKEY.USERID, 1, "user_id");
            USER_ID = aVar2;
            a aVar3 = new a("MAIN_ROLES", 2, "main_roles");
            MAIN_ROLES = aVar3;
            a aVar4 = new a("MAIN_CODE_ROLES", 3, "main_code_roles");
            MAIN_CODE_ROLES = aVar4;
            a aVar5 = new a("ORGANIZATION_ID", 4, "organization_id");
            ORGANIZATION_ID = aVar5;
            a aVar6 = new a("ROLE_CODE", 5, "role_code");
            ROLE_CODE = aVar6;
            a aVar7 = new a("ROLE_SORT", 6, "role_sort");
            ROLE_SORT = aVar7;
            a aVar8 = new a("ROLE_DETAIL", 7, "role_detail");
            ROLE_DETAIL = aVar8;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8};
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

    public r6p(tgl0 tgl0Var) {
        this.b = tgl0Var;
    }
}
