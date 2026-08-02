package com.yandex.go.design.compose.badge;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/design/compose/badge/BadgeSize;", "", "Ly7m;", "size", "F", "a", "()F", "S", "M", "L", "ui"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BadgeSize {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BadgeSize[] $VALUES;
    public static final BadgeSize L;
    public static final BadgeSize M;
    public static final BadgeSize S;
    private final float size;

    static {
        BadgeSize badgeSize = new BadgeSize("S", 0, 16.0f);
        S = badgeSize;
        BadgeSize badgeSize2 = new BadgeSize("M", 1, 19.0f);
        M = badgeSize2;
        BadgeSize badgeSize3 = new BadgeSize("L", 2, 25.0f);
        L = badgeSize3;
        BadgeSize[] badgeSizeArr = {badgeSize, badgeSize2, badgeSize3};
        $VALUES = badgeSizeArr;
        $ENTRIES = a.a(badgeSizeArr);
    }

    public BadgeSize(String str, int i, float f) {
        this.size = f;
    }

    public static BadgeSize valueOf(String str) {
        return (BadgeSize) Enum.valueOf(BadgeSize.class, str);
    }

    public static BadgeSize[] values() {
        return (BadgeSize[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final float getSize() {
        return this.size;
    }
}
