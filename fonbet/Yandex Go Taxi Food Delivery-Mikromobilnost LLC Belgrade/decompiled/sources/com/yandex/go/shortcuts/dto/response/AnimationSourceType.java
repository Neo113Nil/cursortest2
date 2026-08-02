package com.yandex.go.shortcuts.dto.response;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/AnimationSourceType;", "", "UNKNOWN_SOURCE", "LOTTIE_ANIMATION", "STATIC_IMAGE", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AnimationSourceType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AnimationSourceType[] $VALUES;
    public static final AnimationSourceType LOTTIE_ANIMATION;
    public static final AnimationSourceType STATIC_IMAGE;
    public static final AnimationSourceType UNKNOWN_SOURCE;

    static {
        AnimationSourceType animationSourceType = new AnimationSourceType("UNKNOWN_SOURCE", 0);
        UNKNOWN_SOURCE = animationSourceType;
        AnimationSourceType animationSourceType2 = new AnimationSourceType("LOTTIE_ANIMATION", 1);
        LOTTIE_ANIMATION = animationSourceType2;
        AnimationSourceType animationSourceType3 = new AnimationSourceType("STATIC_IMAGE", 2);
        STATIC_IMAGE = animationSourceType3;
        AnimationSourceType[] animationSourceTypeArr = {animationSourceType, animationSourceType2, animationSourceType3};
        $VALUES = animationSourceTypeArr;
        $ENTRIES = kotlin.enums.a.a(animationSourceTypeArr);
    }

    public static AnimationSourceType valueOf(String str) {
        return (AnimationSourceType) Enum.valueOf(AnimationSourceType.class, str);
    }

    public static AnimationSourceType[] values() {
        return (AnimationSourceType[]) $VALUES.clone();
    }
}
