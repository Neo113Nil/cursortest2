package com.yandex.go.shortcuts.view.adapter.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"com/yandex/go/shortcuts/view/adapter/model/BadgeModel$Type", "", "Lcom/yandex/go/shortcuts/view/adapter/model/BadgeModel$Type;", "STATIC_TEXT", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BadgeModel$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BadgeModel$Type[] $VALUES;
    public static final BadgeModel$Type STATIC_TEXT;

    static {
        BadgeModel$Type badgeModel$Type = new BadgeModel$Type("STATIC_TEXT", 0);
        STATIC_TEXT = badgeModel$Type;
        BadgeModel$Type[] badgeModel$TypeArr = {badgeModel$Type};
        $VALUES = badgeModel$TypeArr;
        $ENTRIES = a.a(badgeModel$TypeArr);
    }

    public static BadgeModel$Type valueOf(String str) {
        return (BadgeModel$Type) Enum.valueOf(BadgeModel$Type.class, str);
    }

    public static BadgeModel$Type[] values() {
        return (BadgeModel$Type[]) $VALUES.clone();
    }
}
