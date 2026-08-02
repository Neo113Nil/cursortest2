package com.yandex.go.user_profile.ui;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/user_profile/ui/ProfileContext;", "", "DEEPLINK", "MENU", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ProfileContext {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ProfileContext[] $VALUES;
    public static final ProfileContext DEEPLINK;
    public static final ProfileContext MENU;

    static {
        ProfileContext profileContext = new ProfileContext("DEEPLINK", 0);
        DEEPLINK = profileContext;
        ProfileContext profileContext2 = new ProfileContext("MENU", 1);
        MENU = profileContext2;
        ProfileContext[] profileContextArr = {profileContext, profileContext2};
        $VALUES = profileContextArr;
        $ENTRIES = kotlin.enums.a.a(profileContextArr);
    }

    public static ProfileContext valueOf(String str) {
        return (ProfileContext) Enum.valueOf(ProfileContext.class, str);
    }

    public static ProfileContext[] values() {
        return (ProfileContext[]) $VALUES.clone();
    }
}
