package com.yandex.div2;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import kotlin.jvm.internal.Lambda;
import xsna.epx;
import xsna.izs;

/* compiled from: DivContentAlignmentHorizontal.kt */
/* loaded from: classes8.dex */
public enum DivContentAlignmentHorizontal {
    LEFT(TtmlNode.LEFT),
    CENTER(TtmlNode.CENTER),
    RIGHT(TtmlNode.RIGHT),
    START("start"),
    END(TtmlNode.END),
    SPACE_BETWEEN("space-between"),
    SPACE_AROUND("space-around"),
    SPACE_EVENLY("space-evenly");

    private final String value;
    public static final c Converter = new c();
    public static final izs<DivContentAlignmentHorizontal, String> TO_STRING = b.i;
    public static final izs<String, DivContentAlignmentHorizontal> FROM_STRING = a.i;

    /* compiled from: DivContentAlignmentHorizontal.kt */
    public static final class a extends Lambda implements izs<String, DivContentAlignmentHorizontal> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final DivContentAlignmentHorizontal invoke(String str) {
            String str2 = str;
            DivContentAlignmentHorizontal.Converter.getClass();
            DivContentAlignmentHorizontal divContentAlignmentHorizontal = DivContentAlignmentHorizontal.LEFT;
            if (epx.f(str2, divContentAlignmentHorizontal.value)) {
                return divContentAlignmentHorizontal;
            }
            DivContentAlignmentHorizontal divContentAlignmentHorizontal2 = DivContentAlignmentHorizontal.CENTER;
            if (epx.f(str2, divContentAlignmentHorizontal2.value)) {
                return divContentAlignmentHorizontal2;
            }
            DivContentAlignmentHorizontal divContentAlignmentHorizontal3 = DivContentAlignmentHorizontal.RIGHT;
            if (epx.f(str2, divContentAlignmentHorizontal3.value)) {
                return divContentAlignmentHorizontal3;
            }
            DivContentAlignmentHorizontal divContentAlignmentHorizontal4 = DivContentAlignmentHorizontal.START;
            if (epx.f(str2, divContentAlignmentHorizontal4.value)) {
                return divContentAlignmentHorizontal4;
            }
            DivContentAlignmentHorizontal divContentAlignmentHorizontal5 = DivContentAlignmentHorizontal.END;
            if (epx.f(str2, divContentAlignmentHorizontal5.value)) {
                return divContentAlignmentHorizontal5;
            }
            DivContentAlignmentHorizontal divContentAlignmentHorizontal6 = DivContentAlignmentHorizontal.SPACE_BETWEEN;
            if (epx.f(str2, divContentAlignmentHorizontal6.value)) {
                return divContentAlignmentHorizontal6;
            }
            DivContentAlignmentHorizontal divContentAlignmentHorizontal7 = DivContentAlignmentHorizontal.SPACE_AROUND;
            if (epx.f(str2, divContentAlignmentHorizontal7.value)) {
                return divContentAlignmentHorizontal7;
            }
            DivContentAlignmentHorizontal divContentAlignmentHorizontal8 = DivContentAlignmentHorizontal.SPACE_EVENLY;
            if (epx.f(str2, divContentAlignmentHorizontal8.value)) {
                return divContentAlignmentHorizontal8;
            }
            return null;
        }
    }

    /* compiled from: DivContentAlignmentHorizontal.kt */
    public static final class b extends Lambda implements izs<DivContentAlignmentHorizontal, String> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final String invoke(DivContentAlignmentHorizontal divContentAlignmentHorizontal) {
            DivContentAlignmentHorizontal.Converter.getClass();
            return divContentAlignmentHorizontal.value;
        }
    }

    /* compiled from: DivContentAlignmentHorizontal.kt */
    public static final class c {
    }

    DivContentAlignmentHorizontal(String str) {
        this.value = str;
    }
}
