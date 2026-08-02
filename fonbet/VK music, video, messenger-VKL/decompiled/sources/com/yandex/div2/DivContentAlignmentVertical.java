package com.yandex.div2;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import kotlin.jvm.internal.Lambda;
import xsna.epx;
import xsna.izs;

/* compiled from: DivContentAlignmentVertical.kt */
/* loaded from: classes8.dex */
public enum DivContentAlignmentVertical {
    TOP("top"),
    CENTER(TtmlNode.CENTER),
    BOTTOM("bottom"),
    BASELINE("baseline"),
    SPACE_BETWEEN("space-between"),
    SPACE_AROUND("space-around"),
    SPACE_EVENLY("space-evenly");

    private final String value;
    public static final c Converter = new c();
    public static final izs<DivContentAlignmentVertical, String> TO_STRING = b.i;
    public static final izs<String, DivContentAlignmentVertical> FROM_STRING = a.i;

    /* compiled from: DivContentAlignmentVertical.kt */
    public static final class a extends Lambda implements izs<String, DivContentAlignmentVertical> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final DivContentAlignmentVertical invoke(String str) {
            String str2 = str;
            DivContentAlignmentVertical.Converter.getClass();
            DivContentAlignmentVertical divContentAlignmentVertical = DivContentAlignmentVertical.TOP;
            if (epx.f(str2, divContentAlignmentVertical.value)) {
                return divContentAlignmentVertical;
            }
            DivContentAlignmentVertical divContentAlignmentVertical2 = DivContentAlignmentVertical.CENTER;
            if (epx.f(str2, divContentAlignmentVertical2.value)) {
                return divContentAlignmentVertical2;
            }
            DivContentAlignmentVertical divContentAlignmentVertical3 = DivContentAlignmentVertical.BOTTOM;
            if (epx.f(str2, divContentAlignmentVertical3.value)) {
                return divContentAlignmentVertical3;
            }
            DivContentAlignmentVertical divContentAlignmentVertical4 = DivContentAlignmentVertical.BASELINE;
            if (epx.f(str2, divContentAlignmentVertical4.value)) {
                return divContentAlignmentVertical4;
            }
            DivContentAlignmentVertical divContentAlignmentVertical5 = DivContentAlignmentVertical.SPACE_BETWEEN;
            if (epx.f(str2, divContentAlignmentVertical5.value)) {
                return divContentAlignmentVertical5;
            }
            DivContentAlignmentVertical divContentAlignmentVertical6 = DivContentAlignmentVertical.SPACE_AROUND;
            if (epx.f(str2, divContentAlignmentVertical6.value)) {
                return divContentAlignmentVertical6;
            }
            DivContentAlignmentVertical divContentAlignmentVertical7 = DivContentAlignmentVertical.SPACE_EVENLY;
            if (epx.f(str2, divContentAlignmentVertical7.value)) {
                return divContentAlignmentVertical7;
            }
            return null;
        }
    }

    /* compiled from: DivContentAlignmentVertical.kt */
    public static final class b extends Lambda implements izs<DivContentAlignmentVertical, String> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final String invoke(DivContentAlignmentVertical divContentAlignmentVertical) {
            DivContentAlignmentVertical.Converter.getClass();
            return divContentAlignmentVertical.value;
        }
    }

    /* compiled from: DivContentAlignmentVertical.kt */
    public static final class c {
    }

    DivContentAlignmentVertical(String str) {
        this.value = str;
    }
}
