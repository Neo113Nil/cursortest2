package com.yandex.div2;

import kotlin.jvm.internal.Lambda;
import xsna.epx;
import xsna.izs;

/* compiled from: DivAnimationDirection.kt */
/* loaded from: classes8.dex */
public enum DivAnimationDirection {
    NORMAL("normal"),
    REVERSE("reverse"),
    ALTERNATE("alternate"),
    ALTERNATE_REVERSE("alternate_reverse");

    private final String value;
    public static final c Converter = new c();
    public static final izs<DivAnimationDirection, String> TO_STRING = b.i;
    public static final izs<String, DivAnimationDirection> FROM_STRING = a.i;

    /* compiled from: DivAnimationDirection.kt */
    public static final class a extends Lambda implements izs<String, DivAnimationDirection> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final DivAnimationDirection invoke(String str) {
            String str2 = str;
            DivAnimationDirection.Converter.getClass();
            DivAnimationDirection divAnimationDirection = DivAnimationDirection.NORMAL;
            if (epx.f(str2, divAnimationDirection.value)) {
                return divAnimationDirection;
            }
            DivAnimationDirection divAnimationDirection2 = DivAnimationDirection.REVERSE;
            if (epx.f(str2, divAnimationDirection2.value)) {
                return divAnimationDirection2;
            }
            DivAnimationDirection divAnimationDirection3 = DivAnimationDirection.ALTERNATE;
            if (epx.f(str2, divAnimationDirection3.value)) {
                return divAnimationDirection3;
            }
            DivAnimationDirection divAnimationDirection4 = DivAnimationDirection.ALTERNATE_REVERSE;
            if (epx.f(str2, divAnimationDirection4.value)) {
                return divAnimationDirection4;
            }
            return null;
        }
    }

    /* compiled from: DivAnimationDirection.kt */
    public static final class b extends Lambda implements izs<DivAnimationDirection, String> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final String invoke(DivAnimationDirection divAnimationDirection) {
            DivAnimationDirection.Converter.getClass();
            return divAnimationDirection.value;
        }
    }

    /* compiled from: DivAnimationDirection.kt */
    public static final class c {
    }

    DivAnimationDirection(String str) {
        this.value = str;
    }
}
