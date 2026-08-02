package com.ybsdk.feature.qr.payments.internal.utils;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/utils/DrawableSize;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SMALL", "LARGE", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DrawableSize {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DrawableSize[] $VALUES;
    private final int value;
    public static final DrawableSize SMALL = new DrawableSize("SMALL", 0, 24);
    public static final DrawableSize LARGE = new DrawableSize("LARGE", 1, 38);

    private static final /* synthetic */ DrawableSize[] $values() {
        return new DrawableSize[]{SMALL, LARGE};
    }

    static {
        DrawableSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private DrawableSize(String str, int i, int i2) {
        this.value = i2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static DrawableSize valueOf(String str) {
        return (DrawableSize) Enum.valueOf(DrawableSize.class, str);
    }

    public static DrawableSize[] values() {
        return (DrawableSize[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
