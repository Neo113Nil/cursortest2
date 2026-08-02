package com.yandex.div2;

import kotlin.jvm.internal.Lambda;
import xsna.epx;
import xsna.izs;

/* compiled from: DivBlendMode.kt */
/* loaded from: classes8.dex */
public enum DivBlendMode {
    SOURCE_IN("source_in"),
    SOURCE_ATOP("source_atop"),
    DARKEN("darken"),
    LIGHTEN("lighten"),
    MULTIPLY("multiply"),
    SCREEN("screen");

    private final String value;
    public static final c Converter = new c();
    public static final izs<DivBlendMode, String> TO_STRING = b.i;
    public static final izs<String, DivBlendMode> FROM_STRING = a.i;

    /* compiled from: DivBlendMode.kt */
    public static final class a extends Lambda implements izs<String, DivBlendMode> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final DivBlendMode invoke(String str) {
            String str2 = str;
            DivBlendMode.Converter.getClass();
            DivBlendMode divBlendMode = DivBlendMode.SOURCE_IN;
            if (epx.f(str2, divBlendMode.value)) {
                return divBlendMode;
            }
            DivBlendMode divBlendMode2 = DivBlendMode.SOURCE_ATOP;
            if (epx.f(str2, divBlendMode2.value)) {
                return divBlendMode2;
            }
            DivBlendMode divBlendMode3 = DivBlendMode.DARKEN;
            if (epx.f(str2, divBlendMode3.value)) {
                return divBlendMode3;
            }
            DivBlendMode divBlendMode4 = DivBlendMode.LIGHTEN;
            if (epx.f(str2, divBlendMode4.value)) {
                return divBlendMode4;
            }
            DivBlendMode divBlendMode5 = DivBlendMode.MULTIPLY;
            if (epx.f(str2, divBlendMode5.value)) {
                return divBlendMode5;
            }
            DivBlendMode divBlendMode6 = DivBlendMode.SCREEN;
            if (epx.f(str2, divBlendMode6.value)) {
                return divBlendMode6;
            }
            return null;
        }
    }

    /* compiled from: DivBlendMode.kt */
    public static final class b extends Lambda implements izs<DivBlendMode, String> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final String invoke(DivBlendMode divBlendMode) {
            DivBlendMode.Converter.getClass();
            return divBlendMode.value;
        }
    }

    /* compiled from: DivBlendMode.kt */
    public static final class c {
    }

    DivBlendMode(String str) {
        this.value = str;
    }
}
