package com.yandex.div2;

import com.ironsource.Ad;
import kotlin.jvm.internal.Lambda;
import xsna.epx;
import xsna.izs;

/* compiled from: DivLineStyle.kt */
/* loaded from: classes8.dex */
public enum DivLineStyle {
    NONE("none"),
    SINGLE(Ad.d);

    private final String value;
    public static final c Converter = new c();
    public static final izs<DivLineStyle, String> TO_STRING = b.i;
    public static final izs<String, DivLineStyle> FROM_STRING = a.i;

    /* compiled from: DivLineStyle.kt */
    public static final class a extends Lambda implements izs<String, DivLineStyle> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final DivLineStyle invoke(String str) {
            String str2 = str;
            DivLineStyle.Converter.getClass();
            DivLineStyle divLineStyle = DivLineStyle.NONE;
            if (epx.f(str2, divLineStyle.value)) {
                return divLineStyle;
            }
            DivLineStyle divLineStyle2 = DivLineStyle.SINGLE;
            if (epx.f(str2, divLineStyle2.value)) {
                return divLineStyle2;
            }
            return null;
        }
    }

    /* compiled from: DivLineStyle.kt */
    public static final class b extends Lambda implements izs<DivLineStyle, String> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final String invoke(DivLineStyle divLineStyle) {
            DivLineStyle.Converter.getClass();
            return divLineStyle.value;
        }
    }

    /* compiled from: DivLineStyle.kt */
    public static final class c {
    }

    DivLineStyle(String str) {
        this.value = str;
    }
}
