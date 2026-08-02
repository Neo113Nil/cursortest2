package com.yandex.go.splash;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/splash/AnimType;", "", "ANIM_TYPE_FADE_OUT", "ANIM_TYPE_CUSTOM", "go-client-android.features.splash:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AnimType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AnimType[] $VALUES;
    public static final AnimType ANIM_TYPE_CUSTOM;
    public static final AnimType ANIM_TYPE_FADE_OUT;

    static {
        AnimType animType = new AnimType("ANIM_TYPE_FADE_OUT", 0);
        ANIM_TYPE_FADE_OUT = animType;
        AnimType animType2 = new AnimType("ANIM_TYPE_CUSTOM", 1);
        ANIM_TYPE_CUSTOM = animType2;
        AnimType[] animTypeArr = {animType, animType2};
        $VALUES = animTypeArr;
        $ENTRIES = a.a(animTypeArr);
    }

    public static AnimType valueOf(String str) {
        return (AnimType) Enum.valueOf(AnimType.class, str);
    }

    public static AnimType[] values() {
        return (AnimType[]) $VALUES.clone();
    }
}
