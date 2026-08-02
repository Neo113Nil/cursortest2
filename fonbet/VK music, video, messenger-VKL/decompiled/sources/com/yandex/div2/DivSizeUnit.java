package com.yandex.div2;

import kotlin.jvm.internal.Lambda;
import xsna.epx;
import xsna.izs;

/* compiled from: DivSizeUnit.kt */
/* loaded from: classes8.dex */
public enum DivSizeUnit {
    DP("dp"),
    SP("sp"),
    PX("px");

    private final String value;
    public static final c Converter = new c();
    public static final izs<DivSizeUnit, String> TO_STRING = b.i;
    public static final izs<String, DivSizeUnit> FROM_STRING = a.i;

    /* compiled from: DivSizeUnit.kt */
    public static final class a extends Lambda implements izs<String, DivSizeUnit> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final DivSizeUnit invoke(String str) {
            String str2 = str;
            DivSizeUnit.Converter.getClass();
            DivSizeUnit divSizeUnit = DivSizeUnit.DP;
            if (epx.f(str2, divSizeUnit.value)) {
                return divSizeUnit;
            }
            DivSizeUnit divSizeUnit2 = DivSizeUnit.SP;
            if (epx.f(str2, divSizeUnit2.value)) {
                return divSizeUnit2;
            }
            DivSizeUnit divSizeUnit3 = DivSizeUnit.PX;
            if (epx.f(str2, divSizeUnit3.value)) {
                return divSizeUnit3;
            }
            return null;
        }
    }

    /* compiled from: DivSizeUnit.kt */
    public static final class b extends Lambda implements izs<DivSizeUnit, String> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final String invoke(DivSizeUnit divSizeUnit) {
            DivSizeUnit.Converter.getClass();
            return divSizeUnit.value;
        }
    }

    /* compiled from: DivSizeUnit.kt */
    public static final class c {
    }

    DivSizeUnit(String str) {
        this.value = str;
    }
}
