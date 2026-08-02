package com.yandex.go.shortcuts.dto.response;

import defpackage.dhr0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.iwq0;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.Key.tls.TlsConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0014\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/Shape;", "", "Companion", "dhr0", "UNSUPPORTED", "STICKER", "BUBBLE", "CORNER_IMAGE", "TRAIL_ICON", "CORNER_TEXT", "POI", "BOTTOM_RIGHT", TlsConstants.TLS_LABEL, "TRAIL_LABEL", "CAR", "AFISHA", "ADVERTISEMENT", "TOP_RIGHT", "BUTTON", "BUTTON_BADGE", "BATTERY", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Shape {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Shape[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final Shape ADVERTISEMENT;
    public static final Shape AFISHA;
    public static final Shape BATTERY;
    public static final Shape BOTTOM_RIGHT;
    public static final Shape BUBBLE;
    public static final Shape BUTTON;
    public static final Shape BUTTON_BADGE;
    public static final Shape CAR;
    public static final Shape CORNER_IMAGE;
    public static final Shape CORNER_TEXT;
    public static final dhr0 Companion;
    public static final Shape LABEL;
    public static final Shape POI;
    public static final Shape STICKER;
    public static final Shape TOP_RIGHT;
    public static final Shape TRAIL_ICON;
    public static final Shape TRAIL_LABEL;
    public static final Shape UNSUPPORTED;

    static {
        Shape shape = new Shape("UNSUPPORTED", 0);
        UNSUPPORTED = shape;
        Shape shape2 = new Shape("STICKER", 1);
        STICKER = shape2;
        Shape shape3 = new Shape("BUBBLE", 2);
        BUBBLE = shape3;
        Shape shape4 = new Shape("CORNER_IMAGE", 3);
        CORNER_IMAGE = shape4;
        Shape shape5 = new Shape("TRAIL_ICON", 4);
        TRAIL_ICON = shape5;
        Shape shape6 = new Shape("CORNER_TEXT", 5);
        CORNER_TEXT = shape6;
        Shape shape7 = new Shape("POI", 6);
        POI = shape7;
        Shape shape8 = new Shape("BOTTOM_RIGHT", 7);
        BOTTOM_RIGHT = shape8;
        Shape shape9 = new Shape(TlsConstants.TLS_LABEL, 8);
        LABEL = shape9;
        Shape shape10 = new Shape("TRAIL_LABEL", 9);
        TRAIL_LABEL = shape10;
        Shape shape11 = new Shape("CAR", 10);
        CAR = shape11;
        Shape shape12 = new Shape("AFISHA", 11);
        AFISHA = shape12;
        Shape shape13 = new Shape("ADVERTISEMENT", 12);
        ADVERTISEMENT = shape13;
        Shape shape14 = new Shape("TOP_RIGHT", 13);
        TOP_RIGHT = shape14;
        Shape shape15 = new Shape("BUTTON", 14);
        BUTTON = shape15;
        Shape shape16 = new Shape("BUTTON_BADGE", 15);
        BUTTON_BADGE = shape16;
        Shape shape17 = new Shape("BATTERY", 16);
        BATTERY = shape17;
        Shape[] shapeArr = {shape, shape2, shape3, shape4, shape5, shape6, shape7, shape8, shape9, shape10, shape11, shape12, shape13, shape14, shape15, shape16, shape17};
        $VALUES = shapeArr;
        $ENTRIES = kotlin.enums.a.a(shapeArr);
        Companion = new dhr0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new iwq0(22));
    }

    public static Shape valueOf(String str) {
        return (Shape) Enum.valueOf(Shape.class, str);
    }

    public static Shape[] values() {
        return (Shape[]) $VALUES.clone();
    }
}
