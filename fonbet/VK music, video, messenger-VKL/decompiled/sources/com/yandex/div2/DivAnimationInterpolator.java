package com.yandex.div2;

import kotlin.jvm.internal.Lambda;
import xsna.epx;
import xsna.izs;

/* compiled from: DivAnimationInterpolator.kt */
/* loaded from: classes8.dex */
public enum DivAnimationInterpolator {
    LINEAR("linear"),
    EASE("ease"),
    EASE_IN("ease_in"),
    EASE_OUT("ease_out"),
    EASE_IN_OUT("ease_in_out"),
    SPRING("spring");

    private final String value;
    public static final c Converter = new c();
    public static final izs<DivAnimationInterpolator, String> TO_STRING = b.i;
    public static final izs<String, DivAnimationInterpolator> FROM_STRING = a.i;

    /* compiled from: DivAnimationInterpolator.kt */
    public static final class a extends Lambda implements izs<String, DivAnimationInterpolator> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final DivAnimationInterpolator invoke(String str) {
            String str2 = str;
            DivAnimationInterpolator.Converter.getClass();
            DivAnimationInterpolator divAnimationInterpolator = DivAnimationInterpolator.LINEAR;
            if (epx.f(str2, divAnimationInterpolator.value)) {
                return divAnimationInterpolator;
            }
            DivAnimationInterpolator divAnimationInterpolator2 = DivAnimationInterpolator.EASE;
            if (epx.f(str2, divAnimationInterpolator2.value)) {
                return divAnimationInterpolator2;
            }
            DivAnimationInterpolator divAnimationInterpolator3 = DivAnimationInterpolator.EASE_IN;
            if (epx.f(str2, divAnimationInterpolator3.value)) {
                return divAnimationInterpolator3;
            }
            DivAnimationInterpolator divAnimationInterpolator4 = DivAnimationInterpolator.EASE_OUT;
            if (epx.f(str2, divAnimationInterpolator4.value)) {
                return divAnimationInterpolator4;
            }
            DivAnimationInterpolator divAnimationInterpolator5 = DivAnimationInterpolator.EASE_IN_OUT;
            if (epx.f(str2, divAnimationInterpolator5.value)) {
                return divAnimationInterpolator5;
            }
            DivAnimationInterpolator divAnimationInterpolator6 = DivAnimationInterpolator.SPRING;
            if (epx.f(str2, divAnimationInterpolator6.value)) {
                return divAnimationInterpolator6;
            }
            return null;
        }
    }

    /* compiled from: DivAnimationInterpolator.kt */
    public static final class b extends Lambda implements izs<DivAnimationInterpolator, String> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final String invoke(DivAnimationInterpolator divAnimationInterpolator) {
            DivAnimationInterpolator.Converter.getClass();
            return divAnimationInterpolator.value;
        }
    }

    /* compiled from: DivAnimationInterpolator.kt */
    public static final class c {
    }

    DivAnimationInterpolator(String str) {
        this.value = str;
    }
}
