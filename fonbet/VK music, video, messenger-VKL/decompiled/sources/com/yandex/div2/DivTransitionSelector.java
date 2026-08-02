package com.yandex.div2;

import kotlin.jvm.internal.Lambda;
import xsna.epx;
import xsna.izs;

/* compiled from: DivTransitionSelector.kt */
/* loaded from: classes8.dex */
public enum DivTransitionSelector {
    NONE("none"),
    DATA_CHANGE("data_change"),
    STATE_CHANGE("state_change"),
    ANY_CHANGE("any_change");

    private final String value;
    public static final c Converter = new c();
    public static final izs<DivTransitionSelector, String> TO_STRING = b.i;
    public static final izs<String, DivTransitionSelector> FROM_STRING = a.i;

    /* compiled from: DivTransitionSelector.kt */
    public static final class a extends Lambda implements izs<String, DivTransitionSelector> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final DivTransitionSelector invoke(String str) {
            String str2 = str;
            DivTransitionSelector.Converter.getClass();
            DivTransitionSelector divTransitionSelector = DivTransitionSelector.NONE;
            if (epx.f(str2, divTransitionSelector.value)) {
                return divTransitionSelector;
            }
            DivTransitionSelector divTransitionSelector2 = DivTransitionSelector.DATA_CHANGE;
            if (epx.f(str2, divTransitionSelector2.value)) {
                return divTransitionSelector2;
            }
            DivTransitionSelector divTransitionSelector3 = DivTransitionSelector.STATE_CHANGE;
            if (epx.f(str2, divTransitionSelector3.value)) {
                return divTransitionSelector3;
            }
            DivTransitionSelector divTransitionSelector4 = DivTransitionSelector.ANY_CHANGE;
            if (epx.f(str2, divTransitionSelector4.value)) {
                return divTransitionSelector4;
            }
            return null;
        }
    }

    /* compiled from: DivTransitionSelector.kt */
    public static final class b extends Lambda implements izs<DivTransitionSelector, String> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final String invoke(DivTransitionSelector divTransitionSelector) {
            DivTransitionSelector.Converter.getClass();
            return divTransitionSelector.value;
        }
    }

    /* compiled from: DivTransitionSelector.kt */
    public static final class c {
    }

    DivTransitionSelector(String str) {
        this.value = str;
    }
}
