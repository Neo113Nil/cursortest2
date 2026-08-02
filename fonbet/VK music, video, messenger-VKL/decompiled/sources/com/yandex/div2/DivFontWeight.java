package com.yandex.div2;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import kotlin.jvm.internal.Lambda;
import xsna.epx;
import xsna.izs;

/* compiled from: DivFontWeight.kt */
/* loaded from: classes8.dex */
public enum DivFontWeight {
    LIGHT("light"),
    MEDIUM("medium"),
    REGULAR("regular"),
    BOLD(TtmlNode.BOLD);

    private final String value;
    public static final c Converter = new c();
    public static final izs<DivFontWeight, String> TO_STRING = b.i;
    public static final izs<String, DivFontWeight> FROM_STRING = a.i;

    /* compiled from: DivFontWeight.kt */
    public static final class a extends Lambda implements izs<String, DivFontWeight> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final DivFontWeight invoke(String str) {
            String str2 = str;
            DivFontWeight.Converter.getClass();
            DivFontWeight divFontWeight = DivFontWeight.LIGHT;
            if (epx.f(str2, divFontWeight.value)) {
                return divFontWeight;
            }
            DivFontWeight divFontWeight2 = DivFontWeight.MEDIUM;
            if (epx.f(str2, divFontWeight2.value)) {
                return divFontWeight2;
            }
            DivFontWeight divFontWeight3 = DivFontWeight.REGULAR;
            if (epx.f(str2, divFontWeight3.value)) {
                return divFontWeight3;
            }
            DivFontWeight divFontWeight4 = DivFontWeight.BOLD;
            if (epx.f(str2, divFontWeight4.value)) {
                return divFontWeight4;
            }
            return null;
        }
    }

    /* compiled from: DivFontWeight.kt */
    public static final class b extends Lambda implements izs<DivFontWeight, String> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final String invoke(DivFontWeight divFontWeight) {
            DivFontWeight.Converter.getClass();
            return divFontWeight.value;
        }
    }

    /* compiled from: DivFontWeight.kt */
    public static final class c {
    }

    DivFontWeight(String str) {
        this.value = str;
    }
}
