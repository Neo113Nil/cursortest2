package com.yandex.div2;

import kotlin.jvm.internal.Lambda;
import xsna.epx;
import xsna.izs;

/* compiled from: DivEvaluableType.kt */
/* loaded from: classes8.dex */
public enum DivEvaluableType {
    STRING("string"),
    INTEGER("integer"),
    NUMBER("number"),
    BOOLEAN("boolean"),
    DATETIME("datetime"),
    COLOR("color"),
    URL("url"),
    DICT("dict"),
    ARRAY("array");

    private final String value;
    public static final c Converter = new c();
    public static final izs<DivEvaluableType, String> TO_STRING = b.i;
    public static final izs<String, DivEvaluableType> FROM_STRING = a.i;

    /* compiled from: DivEvaluableType.kt */
    public static final class a extends Lambda implements izs<String, DivEvaluableType> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final DivEvaluableType invoke(String str) {
            String str2 = str;
            DivEvaluableType.Converter.getClass();
            DivEvaluableType divEvaluableType = DivEvaluableType.STRING;
            if (epx.f(str2, divEvaluableType.value)) {
                return divEvaluableType;
            }
            DivEvaluableType divEvaluableType2 = DivEvaluableType.INTEGER;
            if (epx.f(str2, divEvaluableType2.value)) {
                return divEvaluableType2;
            }
            DivEvaluableType divEvaluableType3 = DivEvaluableType.NUMBER;
            if (epx.f(str2, divEvaluableType3.value)) {
                return divEvaluableType3;
            }
            DivEvaluableType divEvaluableType4 = DivEvaluableType.BOOLEAN;
            if (epx.f(str2, divEvaluableType4.value)) {
                return divEvaluableType4;
            }
            DivEvaluableType divEvaluableType5 = DivEvaluableType.DATETIME;
            if (epx.f(str2, divEvaluableType5.value)) {
                return divEvaluableType5;
            }
            DivEvaluableType divEvaluableType6 = DivEvaluableType.COLOR;
            if (epx.f(str2, divEvaluableType6.value)) {
                return divEvaluableType6;
            }
            DivEvaluableType divEvaluableType7 = DivEvaluableType.URL;
            if (epx.f(str2, divEvaluableType7.value)) {
                return divEvaluableType7;
            }
            DivEvaluableType divEvaluableType8 = DivEvaluableType.DICT;
            if (epx.f(str2, divEvaluableType8.value)) {
                return divEvaluableType8;
            }
            DivEvaluableType divEvaluableType9 = DivEvaluableType.ARRAY;
            if (epx.f(str2, divEvaluableType9.value)) {
                return divEvaluableType9;
            }
            return null;
        }
    }

    /* compiled from: DivEvaluableType.kt */
    public static final class b extends Lambda implements izs<DivEvaluableType, String> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final String invoke(DivEvaluableType divEvaluableType) {
            DivEvaluableType.Converter.getClass();
            return divEvaluableType.value;
        }
    }

    /* compiled from: DivEvaluableType.kt */
    public static final class c {
    }

    DivEvaluableType(String str) {
        this.value = str;
    }
}
