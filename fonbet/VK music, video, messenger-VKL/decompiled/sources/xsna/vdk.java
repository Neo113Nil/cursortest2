package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: CredentialsMigration.kt */
/* loaded from: classes11.dex */
public final class vdk {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CredentialsMigration.kt */
    /* loaded from: classes7.dex */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a NONE;
        public static final a NONE_NEW_NULL;
        public static final a UPDATED_BY_FULL_UID;
        public static final a UPDATED_BY_LIGHT_AND_FULL_UID;
        public static final a UPDATED_BY_LIGHT_UID;
        private final String analyticsValue;

        static {
            a aVar = new a("NONE", 0, "none");
            NONE = aVar;
            a aVar2 = new a("NONE_NEW_NULL", 1, "none_new_null");
            NONE_NEW_NULL = aVar2;
            a aVar3 = new a("UPDATED_BY_LIGHT_UID", 2, "updated_by_light_uid");
            UPDATED_BY_LIGHT_UID = aVar3;
            a aVar4 = new a("UPDATED_BY_FULL_UID", 3, "updated_by_full_uid");
            UPDATED_BY_FULL_UID = aVar4;
            a aVar5 = new a("UPDATED_BY_LIGHT_AND_FULL_UID", 4, "updated_by_light_and_full_uid");
            UPDATED_BY_LIGHT_AND_FULL_UID = aVar5;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a(String str, int i, String str2) {
            this.analyticsValue = str2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final String h() {
            return this.analyticsValue;
        }

        public final boolean i() {
            return this == UPDATED_BY_LIGHT_UID || this == UPDATED_BY_FULL_UID || this == UPDATED_BY_LIGHT_AND_FULL_UID;
        }
    }

    public static String a(UserId userId, String str) {
        StringBuilder b = v1v.b((userId == null || !fkq0.c(userId)) ? "uid_missing" : "uid_real", '_');
        b.append(str == null ? "token_null" : drm0.N(str) ? "token_blank" : "token_present");
        return b.toString();
    }

    public static String b(UserId userId, UserId userId2, String str) {
        return (fkq0.c(userId) || !(str == null || drm0.N(str))) ? userId2 == null ? "old_has_data_new_missing" : !fkq0.c(userId2) ? "old_has_data_new_uid_invalid" : userId.equals(userId2) ? "old_has_data_uid_match" : "old_has_data_uid_mismatch" : "old_empty";
    }

    public static String c(String str, String str2) {
        return str2 == null ? "new_token_missing" : epx.f(str, str2) ? "token_equal" : ((str == null || drm0.N(str)) && drm0.N(str2)) ? "token_both_empty_different_representation" : "token_mismatch";
    }

    public static String d(UserId userId, UserId userId2) {
        return userId2 == null ? "new_uid_missing" : !fkq0.c(userId) ? "old_uid_missing" : !fkq0.c(userId2) ? "new_uid_invalid" : userId.equals(userId2) ? "uid_equal" : "uid_mismatch";
    }
}
