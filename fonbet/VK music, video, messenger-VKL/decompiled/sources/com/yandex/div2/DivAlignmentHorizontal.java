package com.yandex.div2;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import kotlin.jvm.internal.Lambda;
import xsna.epx;
import xsna.izs;

/* compiled from: DivAlignmentHorizontal.kt */
/* loaded from: classes8.dex */
public enum DivAlignmentHorizontal {
    LEFT(TtmlNode.LEFT),
    CENTER(TtmlNode.CENTER),
    RIGHT(TtmlNode.RIGHT),
    START("start"),
    END(TtmlNode.END);

    private final String value;
    public static final c Converter = new c();
    public static final izs<DivAlignmentHorizontal, String> TO_STRING = b.i;
    public static final izs<String, DivAlignmentHorizontal> FROM_STRING = a.i;

    /* compiled from: DivAlignmentHorizontal.kt */
    public static final class a extends Lambda implements izs<String, DivAlignmentHorizontal> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final DivAlignmentHorizontal invoke(String str) {
            String str2 = str;
            DivAlignmentHorizontal.Converter.getClass();
            DivAlignmentHorizontal divAlignmentHorizontal = DivAlignmentHorizontal.LEFT;
            if (epx.f(str2, divAlignmentHorizontal.value)) {
                return divAlignmentHorizontal;
            }
            DivAlignmentHorizontal divAlignmentHorizontal2 = DivAlignmentHorizontal.CENTER;
            if (epx.f(str2, divAlignmentHorizontal2.value)) {
                return divAlignmentHorizontal2;
            }
            DivAlignmentHorizontal divAlignmentHorizontal3 = DivAlignmentHorizontal.RIGHT;
            if (epx.f(str2, divAlignmentHorizontal3.value)) {
                return divAlignmentHorizontal3;
            }
            DivAlignmentHorizontal divAlignmentHorizontal4 = DivAlignmentHorizontal.START;
            if (epx.f(str2, divAlignmentHorizontal4.value)) {
                return divAlignmentHorizontal4;
            }
            DivAlignmentHorizontal divAlignmentHorizontal5 = DivAlignmentHorizontal.END;
            if (epx.f(str2, divAlignmentHorizontal5.value)) {
                return divAlignmentHorizontal5;
            }
            return null;
        }
    }

    /* compiled from: DivAlignmentHorizontal.kt */
    public static final class b extends Lambda implements izs<DivAlignmentHorizontal, String> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final String invoke(DivAlignmentHorizontal divAlignmentHorizontal) {
            DivAlignmentHorizontal.Converter.getClass();
            return divAlignmentHorizontal.value;
        }
    }

    /* compiled from: DivAlignmentHorizontal.kt */
    public static final class c {
    }

    DivAlignmentHorizontal(String str) {
        this.value = str;
    }
}
