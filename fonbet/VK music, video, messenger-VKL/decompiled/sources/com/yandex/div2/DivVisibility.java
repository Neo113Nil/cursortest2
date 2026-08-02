package com.yandex.div2;

import kotlin.jvm.internal.Lambda;
import xsna.epx;
import xsna.izs;

/* compiled from: DivVisibility.kt */
/* loaded from: classes8.dex */
public enum DivVisibility {
    VISIBLE("visible"),
    INVISIBLE("invisible"),
    GONE("gone");

    private final String value;
    public static final c Converter = new c();
    public static final izs<DivVisibility, String> TO_STRING = b.i;
    public static final izs<String, DivVisibility> FROM_STRING = a.i;

    /* compiled from: DivVisibility.kt */
    public static final class a extends Lambda implements izs<String, DivVisibility> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final DivVisibility invoke(String str) {
            String str2 = str;
            DivVisibility.Converter.getClass();
            DivVisibility divVisibility = DivVisibility.VISIBLE;
            if (epx.f(str2, divVisibility.value)) {
                return divVisibility;
            }
            DivVisibility divVisibility2 = DivVisibility.INVISIBLE;
            if (epx.f(str2, divVisibility2.value)) {
                return divVisibility2;
            }
            DivVisibility divVisibility3 = DivVisibility.GONE;
            if (epx.f(str2, divVisibility3.value)) {
                return divVisibility3;
            }
            return null;
        }
    }

    /* compiled from: DivVisibility.kt */
    public static final class b extends Lambda implements izs<DivVisibility, String> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final String invoke(DivVisibility divVisibility) {
            DivVisibility.Converter.getClass();
            return divVisibility.value;
        }
    }

    /* compiled from: DivVisibility.kt */
    public static final class c {
    }

    DivVisibility(String str) {
        this.value = str;
    }
}
