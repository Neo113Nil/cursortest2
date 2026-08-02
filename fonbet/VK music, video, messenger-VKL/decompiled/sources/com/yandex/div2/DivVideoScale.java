package com.yandex.div2;

import kotlin.jvm.internal.Lambda;
import xsna.epx;
import xsna.izs;

/* compiled from: DivVideoScale.kt */
/* loaded from: classes8.dex */
public enum DivVideoScale {
    FILL("fill"),
    NO_SCALE("no_scale"),
    FIT("fit");

    private final String value;
    public static final c Converter = new c();
    public static final izs<DivVideoScale, String> TO_STRING = b.i;
    public static final izs<String, DivVideoScale> FROM_STRING = a.i;

    /* compiled from: DivVideoScale.kt */
    public static final class a extends Lambda implements izs<String, DivVideoScale> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final DivVideoScale invoke(String str) {
            String str2 = str;
            DivVideoScale.Converter.getClass();
            DivVideoScale divVideoScale = DivVideoScale.FILL;
            if (epx.f(str2, divVideoScale.value)) {
                return divVideoScale;
            }
            DivVideoScale divVideoScale2 = DivVideoScale.NO_SCALE;
            if (epx.f(str2, divVideoScale2.value)) {
                return divVideoScale2;
            }
            DivVideoScale divVideoScale3 = DivVideoScale.FIT;
            if (epx.f(str2, divVideoScale3.value)) {
                return divVideoScale3;
            }
            return null;
        }
    }

    /* compiled from: DivVideoScale.kt */
    public static final class b extends Lambda implements izs<DivVideoScale, String> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final String invoke(DivVideoScale divVideoScale) {
            DivVideoScale.Converter.getClass();
            return divVideoScale.value;
        }
    }

    /* compiled from: DivVideoScale.kt */
    public static final class c {
    }

    DivVideoScale(String str) {
        this.value = str;
    }
}
