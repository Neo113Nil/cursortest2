package com.yandex.go.design.compose.check;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/design/compose/check/CheckSize;", "", "Ly7m;", "controlSize", "F", "a", "()F", "iconSize", "b", "M", "S", "ui"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CheckSize {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CheckSize[] $VALUES;
    public static final CheckSize M;
    public static final CheckSize S;
    private final float controlSize;
    private final float iconSize;

    static {
        CheckSize checkSize = new CheckSize(32.0f, 24.0f, 0, "M");
        M = checkSize;
        CheckSize checkSize2 = new CheckSize(24.0f, 20.0f, 1, "S");
        S = checkSize2;
        CheckSize[] checkSizeArr = {checkSize, checkSize2};
        $VALUES = checkSizeArr;
        $ENTRIES = a.a(checkSizeArr);
    }

    public CheckSize(float f, float f2, int i, String str) {
        this.controlSize = f;
        this.iconSize = f2;
    }

    public static CheckSize valueOf(String str) {
        return (CheckSize) Enum.valueOf(CheckSize.class, str);
    }

    public static CheckSize[] values() {
        return (CheckSize[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final float getControlSize() {
        return this.controlSize;
    }

    /* renamed from: b, reason: from getter */
    public final float getIconSize() {
        return this.iconSize;
    }
}
