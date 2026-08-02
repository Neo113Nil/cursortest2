package com.yandex.go.blur.core;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R\u0017\u0010\n\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007R\u0017\u0010\f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007j\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"com/yandex/go/blur/core/BlurEffect$Progressive$Easing", "", "Lcom/yandex/go/blur/core/BlurEffect$Progressive$Easing;", "", "startControlX", "F", "c", "()F", "startControlY", "f", "endControlX", "a", "endControlY", "b", "Linear", "Ease", "EaseOut", "EaseIn", "EaseInOut", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlurEffect$Progressive$Easing {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BlurEffect$Progressive$Easing[] $VALUES;
    public static final BlurEffect$Progressive$Easing Ease;
    public static final BlurEffect$Progressive$Easing EaseIn;
    public static final BlurEffect$Progressive$Easing EaseInOut;
    public static final BlurEffect$Progressive$Easing EaseOut;
    public static final BlurEffect$Progressive$Easing Linear;
    private final float endControlX;
    private final float endControlY = 1.0f;
    private final float startControlX;
    private final float startControlY;

    static {
        BlurEffect$Progressive$Easing blurEffect$Progressive$Easing = new BlurEffect$Progressive$Easing(0.0f, 0.0f, 1.0f, 0, "Linear");
        Linear = blurEffect$Progressive$Easing;
        BlurEffect$Progressive$Easing blurEffect$Progressive$Easing2 = new BlurEffect$Progressive$Easing(0.25f, 0.1f, 0.25f, 1, "Ease");
        Ease = blurEffect$Progressive$Easing2;
        BlurEffect$Progressive$Easing blurEffect$Progressive$Easing3 = new BlurEffect$Progressive$Easing(0.0f, 0.0f, 0.58f, 2, "EaseOut");
        EaseOut = blurEffect$Progressive$Easing3;
        BlurEffect$Progressive$Easing blurEffect$Progressive$Easing4 = new BlurEffect$Progressive$Easing(0.42f, 0.0f, 1.0f, 3, "EaseIn");
        EaseIn = blurEffect$Progressive$Easing4;
        BlurEffect$Progressive$Easing blurEffect$Progressive$Easing5 = new BlurEffect$Progressive$Easing(0.42f, 0.0f, 0.58f, 4, "EaseInOut");
        EaseInOut = blurEffect$Progressive$Easing5;
        BlurEffect$Progressive$Easing[] blurEffect$Progressive$EasingArr = {blurEffect$Progressive$Easing, blurEffect$Progressive$Easing2, blurEffect$Progressive$Easing3, blurEffect$Progressive$Easing4, blurEffect$Progressive$Easing5};
        $VALUES = blurEffect$Progressive$EasingArr;
        $ENTRIES = a.a(blurEffect$Progressive$EasingArr);
    }

    public BlurEffect$Progressive$Easing(float f, float f2, float f3, int i, String str) {
        this.startControlX = f;
        this.startControlY = f2;
        this.endControlX = f3;
    }

    public static BlurEffect$Progressive$Easing valueOf(String str) {
        return (BlurEffect$Progressive$Easing) Enum.valueOf(BlurEffect$Progressive$Easing.class, str);
    }

    public static BlurEffect$Progressive$Easing[] values() {
        return (BlurEffect$Progressive$Easing[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final float getEndControlX() {
        return this.endControlX;
    }

    /* renamed from: b, reason: from getter */
    public final float getEndControlY() {
        return this.endControlY;
    }

    /* renamed from: c, reason: from getter */
    public final float getStartControlX() {
        return this.startControlX;
    }

    /* renamed from: f, reason: from getter */
    public final float getStartControlY() {
        return this.startControlY;
    }
}
