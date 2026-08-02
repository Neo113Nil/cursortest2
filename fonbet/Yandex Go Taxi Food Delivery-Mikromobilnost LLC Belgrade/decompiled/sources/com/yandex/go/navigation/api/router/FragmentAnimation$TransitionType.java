package com.yandex.go.navigation.api.router;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/navigation/api/router/FragmentAnimation$TransitionType", "", "Lcom/yandex/go/navigation/api/router/FragmentAnimation$TransitionType;", "ENTER", "RETURN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FragmentAnimation$TransitionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FragmentAnimation$TransitionType[] $VALUES;
    public static final FragmentAnimation$TransitionType ENTER;
    public static final FragmentAnimation$TransitionType RETURN;

    static {
        FragmentAnimation$TransitionType fragmentAnimation$TransitionType = new FragmentAnimation$TransitionType("ENTER", 0);
        ENTER = fragmentAnimation$TransitionType;
        FragmentAnimation$TransitionType fragmentAnimation$TransitionType2 = new FragmentAnimation$TransitionType("RETURN", 1);
        RETURN = fragmentAnimation$TransitionType2;
        FragmentAnimation$TransitionType[] fragmentAnimation$TransitionTypeArr = {fragmentAnimation$TransitionType, fragmentAnimation$TransitionType2};
        $VALUES = fragmentAnimation$TransitionTypeArr;
        $ENTRIES = kotlin.enums.a.a(fragmentAnimation$TransitionTypeArr);
    }

    public static FragmentAnimation$TransitionType valueOf(String str) {
        return (FragmentAnimation$TransitionType) Enum.valueOf(FragmentAnimation$TransitionType.class, str);
    }

    public static FragmentAnimation$TransitionType[] values() {
        return (FragmentAnimation$TransitionType[]) $VALUES.clone();
    }
}
