package com.yandex.div2;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import kotlin.jvm.internal.Lambda;
import xsna.epx;
import xsna.izs;

/* compiled from: DivAlignmentVertical.kt */
/* loaded from: classes8.dex */
public enum DivAlignmentVertical {
    TOP("top"),
    CENTER(TtmlNode.CENTER),
    BOTTOM("bottom"),
    BASELINE("baseline");

    private final String value;
    public static final c Converter = new c();
    public static final izs<DivAlignmentVertical, String> TO_STRING = b.i;
    public static final izs<String, DivAlignmentVertical> FROM_STRING = a.i;

    /* compiled from: DivAlignmentVertical.kt */
    public static final class a extends Lambda implements izs<String, DivAlignmentVertical> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final DivAlignmentVertical invoke(String str) {
            String str2 = str;
            DivAlignmentVertical.Converter.getClass();
            DivAlignmentVertical divAlignmentVertical = DivAlignmentVertical.TOP;
            if (epx.f(str2, divAlignmentVertical.value)) {
                return divAlignmentVertical;
            }
            DivAlignmentVertical divAlignmentVertical2 = DivAlignmentVertical.CENTER;
            if (epx.f(str2, divAlignmentVertical2.value)) {
                return divAlignmentVertical2;
            }
            DivAlignmentVertical divAlignmentVertical3 = DivAlignmentVertical.BOTTOM;
            if (epx.f(str2, divAlignmentVertical3.value)) {
                return divAlignmentVertical3;
            }
            DivAlignmentVertical divAlignmentVertical4 = DivAlignmentVertical.BASELINE;
            if (epx.f(str2, divAlignmentVertical4.value)) {
                return divAlignmentVertical4;
            }
            return null;
        }
    }

    /* compiled from: DivAlignmentVertical.kt */
    public static final class b extends Lambda implements izs<DivAlignmentVertical, String> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final String invoke(DivAlignmentVertical divAlignmentVertical) {
            DivAlignmentVertical.Converter.getClass();
            return divAlignmentVertical.value;
        }
    }

    /* compiled from: DivAlignmentVertical.kt */
    public static final class c {
    }

    DivAlignmentVertical(String str) {
        this.value = str;
    }
}
