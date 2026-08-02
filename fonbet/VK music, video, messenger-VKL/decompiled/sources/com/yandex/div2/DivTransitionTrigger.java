package com.yandex.div2;

import kotlin.jvm.internal.Lambda;
import xsna.epx;
import xsna.izs;

/* compiled from: DivTransitionTrigger.kt */
/* loaded from: classes8.dex */
public enum DivTransitionTrigger {
    DATA_CHANGE("data_change"),
    STATE_CHANGE("state_change"),
    VISIBILITY_CHANGE("visibility_change");

    private final String value;
    public static final c Converter = new c();
    public static final izs<DivTransitionTrigger, String> TO_STRING = b.i;
    public static final izs<String, DivTransitionTrigger> FROM_STRING = a.i;

    /* compiled from: DivTransitionTrigger.kt */
    public static final class a extends Lambda implements izs<String, DivTransitionTrigger> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final DivTransitionTrigger invoke(String str) {
            String str2 = str;
            DivTransitionTrigger.Converter.getClass();
            DivTransitionTrigger divTransitionTrigger = DivTransitionTrigger.DATA_CHANGE;
            if (epx.f(str2, divTransitionTrigger.value)) {
                return divTransitionTrigger;
            }
            DivTransitionTrigger divTransitionTrigger2 = DivTransitionTrigger.STATE_CHANGE;
            if (epx.f(str2, divTransitionTrigger2.value)) {
                return divTransitionTrigger2;
            }
            DivTransitionTrigger divTransitionTrigger3 = DivTransitionTrigger.VISIBILITY_CHANGE;
            if (epx.f(str2, divTransitionTrigger3.value)) {
                return divTransitionTrigger3;
            }
            return null;
        }
    }

    /* compiled from: DivTransitionTrigger.kt */
    public static final class b extends Lambda implements izs<DivTransitionTrigger, String> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final String invoke(DivTransitionTrigger divTransitionTrigger) {
            DivTransitionTrigger.Converter.getClass();
            return divTransitionTrigger.value;
        }
    }

    /* compiled from: DivTransitionTrigger.kt */
    public static final class c {
    }

    DivTransitionTrigger(String str) {
        this.value = str;
    }
}
