package com.yandex.go.plus.api.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/plus/api/model/BadgeContent$GlyphPosition", "", "Lcom/yandex/go/plus/api/model/BadgeContent$GlyphPosition;", "START", "END", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BadgeContent$GlyphPosition {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BadgeContent$GlyphPosition[] $VALUES;
    public static final BadgeContent$GlyphPosition END;
    public static final BadgeContent$GlyphPosition START;

    static {
        BadgeContent$GlyphPosition badgeContent$GlyphPosition = new BadgeContent$GlyphPosition("START", 0);
        START = badgeContent$GlyphPosition;
        BadgeContent$GlyphPosition badgeContent$GlyphPosition2 = new BadgeContent$GlyphPosition("END", 1);
        END = badgeContent$GlyphPosition2;
        BadgeContent$GlyphPosition[] badgeContent$GlyphPositionArr = {badgeContent$GlyphPosition, badgeContent$GlyphPosition2};
        $VALUES = badgeContent$GlyphPositionArr;
        $ENTRIES = a.a(badgeContent$GlyphPositionArr);
    }

    public static BadgeContent$GlyphPosition valueOf(String str) {
        return (BadgeContent$GlyphPosition) Enum.valueOf(BadgeContent$GlyphPosition.class, str);
    }

    public static BadgeContent$GlyphPosition[] values() {
        return (BadgeContent$GlyphPosition[]) $VALUES.clone();
    }
}
