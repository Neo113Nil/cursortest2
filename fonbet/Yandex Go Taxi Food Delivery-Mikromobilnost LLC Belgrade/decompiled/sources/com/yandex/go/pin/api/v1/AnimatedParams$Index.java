package com.yandex.go.pin.api.v1;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"com/yandex/go/pin/api/v1/AnimatedParams$Index", "", "Lcom/yandex/go/pin/api/v1/AnimatedParams$Index;", "BASE_OFFSET", "CONTENT_OFFSET", "SHADOW_SIZE", "SHADOW_ALPHA", "DOT_ALPHA", "EYE_OFFSET", "EYE_CLIP", "EYE_ALPHA", "EYE_COMPRESS", "TEXT_ALPHA", "TEXT_SCALE", "ERROR_ALPHA", "COLUMN_ALPHA", "IDLE_IMAGE_ALPHA", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AnimatedParams$Index {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AnimatedParams$Index[] $VALUES;
    public static final AnimatedParams$Index BASE_OFFSET;
    public static final AnimatedParams$Index COLUMN_ALPHA;
    public static final AnimatedParams$Index CONTENT_OFFSET;
    public static final AnimatedParams$Index DOT_ALPHA;
    public static final AnimatedParams$Index ERROR_ALPHA;
    public static final AnimatedParams$Index EYE_ALPHA;
    public static final AnimatedParams$Index EYE_CLIP;
    public static final AnimatedParams$Index EYE_COMPRESS;
    public static final AnimatedParams$Index EYE_OFFSET;
    public static final AnimatedParams$Index IDLE_IMAGE_ALPHA;
    public static final AnimatedParams$Index SHADOW_ALPHA;
    public static final AnimatedParams$Index SHADOW_SIZE;
    public static final AnimatedParams$Index TEXT_ALPHA;
    public static final AnimatedParams$Index TEXT_SCALE;

    static {
        AnimatedParams$Index animatedParams$Index = new AnimatedParams$Index("BASE_OFFSET", 0);
        BASE_OFFSET = animatedParams$Index;
        AnimatedParams$Index animatedParams$Index2 = new AnimatedParams$Index("CONTENT_OFFSET", 1);
        CONTENT_OFFSET = animatedParams$Index2;
        AnimatedParams$Index animatedParams$Index3 = new AnimatedParams$Index("SHADOW_SIZE", 2);
        SHADOW_SIZE = animatedParams$Index3;
        AnimatedParams$Index animatedParams$Index4 = new AnimatedParams$Index("SHADOW_ALPHA", 3);
        SHADOW_ALPHA = animatedParams$Index4;
        AnimatedParams$Index animatedParams$Index5 = new AnimatedParams$Index("DOT_ALPHA", 4);
        DOT_ALPHA = animatedParams$Index5;
        AnimatedParams$Index animatedParams$Index6 = new AnimatedParams$Index("EYE_OFFSET", 5);
        EYE_OFFSET = animatedParams$Index6;
        AnimatedParams$Index animatedParams$Index7 = new AnimatedParams$Index("EYE_CLIP", 6);
        EYE_CLIP = animatedParams$Index7;
        AnimatedParams$Index animatedParams$Index8 = new AnimatedParams$Index("EYE_ALPHA", 7);
        EYE_ALPHA = animatedParams$Index8;
        AnimatedParams$Index animatedParams$Index9 = new AnimatedParams$Index("EYE_COMPRESS", 8);
        EYE_COMPRESS = animatedParams$Index9;
        AnimatedParams$Index animatedParams$Index10 = new AnimatedParams$Index("TEXT_ALPHA", 9);
        TEXT_ALPHA = animatedParams$Index10;
        AnimatedParams$Index animatedParams$Index11 = new AnimatedParams$Index("TEXT_SCALE", 10);
        TEXT_SCALE = animatedParams$Index11;
        AnimatedParams$Index animatedParams$Index12 = new AnimatedParams$Index("ERROR_ALPHA", 11);
        ERROR_ALPHA = animatedParams$Index12;
        AnimatedParams$Index animatedParams$Index13 = new AnimatedParams$Index("COLUMN_ALPHA", 12);
        COLUMN_ALPHA = animatedParams$Index13;
        AnimatedParams$Index animatedParams$Index14 = new AnimatedParams$Index("IDLE_IMAGE_ALPHA", 13);
        IDLE_IMAGE_ALPHA = animatedParams$Index14;
        AnimatedParams$Index[] animatedParams$IndexArr = {animatedParams$Index, animatedParams$Index2, animatedParams$Index3, animatedParams$Index4, animatedParams$Index5, animatedParams$Index6, animatedParams$Index7, animatedParams$Index8, animatedParams$Index9, animatedParams$Index10, animatedParams$Index11, animatedParams$Index12, animatedParams$Index13, animatedParams$Index14};
        $VALUES = animatedParams$IndexArr;
        $ENTRIES = kotlin.enums.a.a(animatedParams$IndexArr);
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static AnimatedParams$Index valueOf(String str) {
        return (AnimatedParams$Index) Enum.valueOf(AnimatedParams$Index.class, str);
    }

    public static AnimatedParams$Index[] values() {
        return (AnimatedParams$Index[]) $VALUES.clone();
    }
}
