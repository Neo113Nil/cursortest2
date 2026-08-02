package com.yandex.div2;

import kotlin.jvm.internal.Lambda;
import xsna.epx;
import xsna.izs;

/* compiled from: DivImageScale.kt */
/* loaded from: classes8.dex */
public enum DivImageScale {
    FILL("fill"),
    NO_SCALE("no_scale"),
    FIT("fit"),
    STRETCH("stretch");

    private final String value;
    public static final c Converter = new c();
    public static final izs<DivImageScale, String> TO_STRING = b.i;
    public static final izs<String, DivImageScale> FROM_STRING = a.i;

    /* compiled from: DivImageScale.kt */
    public static final class a extends Lambda implements izs<String, DivImageScale> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final DivImageScale invoke(String str) {
            String str2 = str;
            DivImageScale.Converter.getClass();
            DivImageScale divImageScale = DivImageScale.FILL;
            if (epx.f(str2, divImageScale.value)) {
                return divImageScale;
            }
            DivImageScale divImageScale2 = DivImageScale.NO_SCALE;
            if (epx.f(str2, divImageScale2.value)) {
                return divImageScale2;
            }
            DivImageScale divImageScale3 = DivImageScale.FIT;
            if (epx.f(str2, divImageScale3.value)) {
                return divImageScale3;
            }
            DivImageScale divImageScale4 = DivImageScale.STRETCH;
            if (epx.f(str2, divImageScale4.value)) {
                return divImageScale4;
            }
            return null;
        }
    }

    /* compiled from: DivImageScale.kt */
    public static final class b extends Lambda implements izs<DivImageScale, String> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final String invoke(DivImageScale divImageScale) {
            DivImageScale.Converter.getClass();
            return divImageScale.value;
        }
    }

    /* compiled from: DivImageScale.kt */
    public static final class c {
    }

    DivImageScale(String str) {
        this.value = str;
    }
}
