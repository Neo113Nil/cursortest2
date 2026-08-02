package com.yandex.delivery.attrbutedtext.api;

import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class FormattedText {
    public static final FormattedText b = new FormattedText(0);
    public final List a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/delivery/attrbutedtext/api/FormattedText$FontStyle;", "", "NORMAL", "ITALIC", "attributed-text"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FontStyle {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ FontStyle[] $VALUES;
        public static final FontStyle ITALIC;
        public static final FontStyle NORMAL;

        static {
            FontStyle fontStyle = new FontStyle("NORMAL", 0);
            NORMAL = fontStyle;
            FontStyle fontStyle2 = new FontStyle("ITALIC", 1);
            ITALIC = fontStyle2;
            FontStyle[] fontStyleArr = {fontStyle, fontStyle2};
            $VALUES = fontStyleArr;
            $ENTRIES = kotlin.enums.a.a(fontStyleArr);
        }

        public static FontStyle valueOf(String str) {
            return (FontStyle) Enum.valueOf(FontStyle.class, str);
        }

        public static FontStyle[] values() {
            return (FontStyle[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/delivery/attrbutedtext/api/FormattedText$FontWeight;", "", "LIGHT", "REGULAR", "MEDIUM", "BOLD", "HEAVY", "attributed-text"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FontWeight {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ FontWeight[] $VALUES;
        public static final FontWeight BOLD;
        public static final FontWeight HEAVY;
        public static final FontWeight LIGHT;
        public static final FontWeight MEDIUM;
        public static final FontWeight REGULAR;

        static {
            FontWeight fontWeight = new FontWeight("LIGHT", 0);
            LIGHT = fontWeight;
            FontWeight fontWeight2 = new FontWeight("REGULAR", 1);
            REGULAR = fontWeight2;
            FontWeight fontWeight3 = new FontWeight("MEDIUM", 2);
            MEDIUM = fontWeight3;
            FontWeight fontWeight4 = new FontWeight("BOLD", 3);
            BOLD = fontWeight4;
            FontWeight fontWeight5 = new FontWeight("HEAVY", 4);
            HEAVY = fontWeight5;
            FontWeight[] fontWeightArr = {fontWeight, fontWeight2, fontWeight3, fontWeight4, fontWeight5};
            $VALUES = fontWeightArr;
            $ENTRIES = kotlin.enums.a.a(fontWeightArr);
        }

        public static FontWeight valueOf(String str) {
            return (FontWeight) Enum.valueOf(FontWeight.class, str);
        }

        public static FontWeight[] values() {
            return (FontWeight[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/delivery/attrbutedtext/api/FormattedText$LineThroughStyle;", "", "DEFAULT", "DIAGONALLY", "attributed-text"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class LineThroughStyle {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ LineThroughStyle[] $VALUES;
        public static final LineThroughStyle DEFAULT;
        public static final LineThroughStyle DIAGONALLY;

        static {
            LineThroughStyle lineThroughStyle = new LineThroughStyle("DEFAULT", 0);
            DEFAULT = lineThroughStyle;
            LineThroughStyle lineThroughStyle2 = new LineThroughStyle("DIAGONALLY", 1);
            DIAGONALLY = lineThroughStyle2;
            LineThroughStyle[] lineThroughStyleArr = {lineThroughStyle, lineThroughStyle2};
            $VALUES = lineThroughStyleArr;
            $ENTRIES = kotlin.enums.a.a(lineThroughStyleArr);
        }

        public static LineThroughStyle valueOf(String str) {
            return (LineThroughStyle) Enum.valueOf(LineThroughStyle.class, str);
        }

        public static LineThroughStyle[] values() {
            return (LineThroughStyle[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/delivery/attrbutedtext/api/FormattedText$TextDecoration;", "", "UNDERLINE", "LINE_THROUGH", "attributed-text"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TextDecoration {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TextDecoration[] $VALUES;
        public static final TextDecoration LINE_THROUGH;
        public static final TextDecoration UNDERLINE;

        static {
            TextDecoration textDecoration = new TextDecoration("UNDERLINE", 0);
            UNDERLINE = textDecoration;
            TextDecoration textDecoration2 = new TextDecoration("LINE_THROUGH", 1);
            LINE_THROUGH = textDecoration2;
            TextDecoration[] textDecorationArr = {textDecoration, textDecoration2};
            $VALUES = textDecorationArr;
            $ENTRIES = kotlin.enums.a.a(textDecorationArr);
        }

        public static TextDecoration valueOf(String str) {
            return (TextDecoration) Enum.valueOf(TextDecoration.class, str);
        }

        public static TextDecoration[] values() {
            return (TextDecoration[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/delivery/attrbutedtext/api/FormattedText$VerticalAlignment;", "", "BASELINE", "CENTER", "BOTTOM", "attributed-text"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class VerticalAlignment {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ VerticalAlignment[] $VALUES;
        public static final VerticalAlignment BASELINE;
        public static final VerticalAlignment BOTTOM;
        public static final VerticalAlignment CENTER;

        static {
            VerticalAlignment verticalAlignment = new VerticalAlignment("BASELINE", 0);
            BASELINE = verticalAlignment;
            VerticalAlignment verticalAlignment2 = new VerticalAlignment("CENTER", 1);
            CENTER = verticalAlignment2;
            VerticalAlignment verticalAlignment3 = new VerticalAlignment("BOTTOM", 2);
            BOTTOM = verticalAlignment3;
            VerticalAlignment[] verticalAlignmentArr = {verticalAlignment, verticalAlignment2, verticalAlignment3};
            $VALUES = verticalAlignmentArr;
            $ENTRIES = kotlin.enums.a.a(verticalAlignmentArr);
        }

        public static VerticalAlignment valueOf(String str) {
            return (VerticalAlignment) Enum.valueOf(VerticalAlignment.class, str);
        }

        public static VerticalAlignment[] values() {
            return (VerticalAlignment[]) $VALUES.clone();
        }
    }

    public FormattedText(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (FormattedText.class.equals(obj != null ? obj.getClass() : null)) {
            return jl40.l(this.a, ((FormattedText) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public static final class a {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jl40.l(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return oyr.p("GroupAttributes(metaColor=", this.a, Extension.C_BRAKE);
        }

        public a() {
            this(null);
        }
    }

    public FormattedText() {
        this(0);
    }

    public /* synthetic */ FormattedText(int i) {
        this(EmptyList.a);
    }
}
