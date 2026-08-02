package com.yandex.div2;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import kotlin.jvm.internal.Lambda;
import xsna.epx;
import xsna.izs;

/* compiled from: DivTextAlignmentVertical.kt */
/* loaded from: classes8.dex */
public enum DivTextAlignmentVertical {
    TOP("top"),
    CENTER(TtmlNode.CENTER),
    BOTTOM("bottom"),
    BASELINE("baseline");

    private final String value;
    public static final c Converter = new c();
    public static final izs<DivTextAlignmentVertical, String> TO_STRING = b.i;
    public static final izs<String, DivTextAlignmentVertical> FROM_STRING = a.i;

    /* compiled from: DivTextAlignmentVertical.kt */
    public static final class a extends Lambda implements izs<String, DivTextAlignmentVertical> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final DivTextAlignmentVertical invoke(String str) {
            String str2 = str;
            DivTextAlignmentVertical.Converter.getClass();
            DivTextAlignmentVertical divTextAlignmentVertical = DivTextAlignmentVertical.TOP;
            if (epx.f(str2, divTextAlignmentVertical.value)) {
                return divTextAlignmentVertical;
            }
            DivTextAlignmentVertical divTextAlignmentVertical2 = DivTextAlignmentVertical.CENTER;
            if (epx.f(str2, divTextAlignmentVertical2.value)) {
                return divTextAlignmentVertical2;
            }
            DivTextAlignmentVertical divTextAlignmentVertical3 = DivTextAlignmentVertical.BOTTOM;
            if (epx.f(str2, divTextAlignmentVertical3.value)) {
                return divTextAlignmentVertical3;
            }
            DivTextAlignmentVertical divTextAlignmentVertical4 = DivTextAlignmentVertical.BASELINE;
            if (epx.f(str2, divTextAlignmentVertical4.value)) {
                return divTextAlignmentVertical4;
            }
            return null;
        }
    }

    /* compiled from: DivTextAlignmentVertical.kt */
    public static final class b extends Lambda implements izs<DivTextAlignmentVertical, String> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final String invoke(DivTextAlignmentVertical divTextAlignmentVertical) {
            DivTextAlignmentVertical.Converter.getClass();
            return divTextAlignmentVertical.value;
        }
    }

    /* compiled from: DivTextAlignmentVertical.kt */
    public static final class c {
    }

    DivTextAlignmentVertical(String str) {
        this.value = str;
    }
}
