package defpackage;

import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"LUserStatusType;", "", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "WithPlus", "WithoutPlus", "Unauthorized", "Frozen", "Unknown", "plus-home-domain-evgen_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UserStatusType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ UserStatusType[] $VALUES;
    public static final UserStatusType Frozen;
    public static final UserStatusType Unauthorized;
    public static final UserStatusType Unknown;
    public static final UserStatusType WithPlus;
    public static final UserStatusType WithoutPlus;
    private final String eventValue;

    static {
        UserStatusType userStatusType = new UserStatusType("WithPlus", 0, "with_plus");
        WithPlus = userStatusType;
        UserStatusType userStatusType2 = new UserStatusType("WithoutPlus", 1, "without_plus");
        WithoutPlus = userStatusType2;
        UserStatusType userStatusType3 = new UserStatusType("Unauthorized", 2, "unauthorized");
        Unauthorized = userStatusType3;
        UserStatusType userStatusType4 = new UserStatusType("Frozen", 3, "frozen");
        Frozen = userStatusType4;
        UserStatusType userStatusType5 = new UserStatusType("Unknown", 4, "unknown");
        Unknown = userStatusType5;
        UserStatusType[] userStatusTypeArr = {userStatusType, userStatusType2, userStatusType3, userStatusType4, userStatusType5};
        $VALUES = userStatusTypeArr;
        $ENTRIES = a.a(userStatusTypeArr);
    }

    public UserStatusType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static UserStatusType valueOf(String str) {
        return (UserStatusType) Enum.valueOf(UserStatusType.class, str);
    }

    public static UserStatusType[] values() {
        return (UserStatusType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
