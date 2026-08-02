package com.yandex.go.user_profile.main_menu.profile.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/user_profile/main_menu/profile/models/UserProfileStyle;", "", "V1", "V2", "V3", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class UserProfileStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ UserProfileStyle[] $VALUES;
    public static final UserProfileStyle V1;
    public static final UserProfileStyle V2;
    public static final UserProfileStyle V3;

    static {
        UserProfileStyle userProfileStyle = new UserProfileStyle("V1", 0);
        V1 = userProfileStyle;
        UserProfileStyle userProfileStyle2 = new UserProfileStyle("V2", 1);
        V2 = userProfileStyle2;
        UserProfileStyle userProfileStyle3 = new UserProfileStyle("V3", 2);
        V3 = userProfileStyle3;
        UserProfileStyle[] userProfileStyleArr = {userProfileStyle, userProfileStyle2, userProfileStyle3};
        $VALUES = userProfileStyleArr;
        $ENTRIES = a.a(userProfileStyleArr);
    }

    public static UserProfileStyle valueOf(String str) {
        return (UserProfileStyle) Enum.valueOf(UserProfileStyle.class, str);
    }

    public static UserProfileStyle[] values() {
        return (UserProfileStyle[]) $VALUES.clone();
    }
}
