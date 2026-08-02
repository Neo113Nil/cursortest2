package com.yandex.go.taxi.order.models.api.response;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import defpackage.p73;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/taxi/order/models/api/response/AttributedItem$AttributedTextItem", "Lcom/yandex/go/taxi/order/models/api/response/o;", "Companion", "FontWeight", "FontStyle", "$serializer", "com/yandex/go/taxi/order/models/api/response/k", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class AttributedItem$AttributedTextItem extends o {
    public static final k Companion = new k();
    public static final i3y[] f;
    public final String a;
    public final int b;
    public final FontWeight c;
    public final FontStyle d;
    public final String e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/AttributedItem$AttributedTextItem$FontStyle;", "", "Companion", "com/yandex/go/taxi/order/models/api/response/l", "UNKNOWN", "NORMAL", "ITALIC", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class FontStyle {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ FontStyle[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final l Companion;
        public static final FontStyle ITALIC;
        public static final FontStyle NORMAL;
        public static final FontStyle UNKNOWN;

        static {
            FontStyle fontStyle = new FontStyle("UNKNOWN", 0);
            UNKNOWN = fontStyle;
            FontStyle fontStyle2 = new FontStyle("NORMAL", 1);
            NORMAL = fontStyle2;
            FontStyle fontStyle3 = new FontStyle("ITALIC", 2);
            ITALIC = fontStyle3;
            FontStyle[] fontStyleArr = {fontStyle, fontStyle2, fontStyle3};
            $VALUES = fontStyleArr;
            $ENTRIES = kotlin.enums.a.a(fontStyleArr);
            Companion = new l();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new p73(11));
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
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/AttributedItem$AttributedTextItem$FontWeight;", "", "Companion", "com/yandex/go/taxi/order/models/api/response/m", "UNKNOWN", "REGULAR", "LIGHT", "MEDIUM", "BOLD", "DISPLAY_HEAVY", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class FontWeight {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ FontWeight[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final FontWeight BOLD;
        public static final m Companion;
        public static final FontWeight DISPLAY_HEAVY;
        public static final FontWeight LIGHT;
        public static final FontWeight MEDIUM;
        public static final FontWeight REGULAR;
        public static final FontWeight UNKNOWN;

        static {
            FontWeight fontWeight = new FontWeight("UNKNOWN", 0);
            UNKNOWN = fontWeight;
            FontWeight fontWeight2 = new FontWeight("REGULAR", 1);
            REGULAR = fontWeight2;
            FontWeight fontWeight3 = new FontWeight("LIGHT", 2);
            LIGHT = fontWeight3;
            FontWeight fontWeight4 = new FontWeight("MEDIUM", 3);
            MEDIUM = fontWeight4;
            FontWeight fontWeight5 = new FontWeight("BOLD", 4);
            BOLD = fontWeight5;
            FontWeight fontWeight6 = new FontWeight("DISPLAY_HEAVY", 5);
            DISPLAY_HEAVY = fontWeight6;
            FontWeight[] fontWeightArr = {fontWeight, fontWeight2, fontWeight3, fontWeight4, fontWeight5, fontWeight6};
            $VALUES = fontWeightArr;
            $ENTRIES = kotlin.enums.a.a(fontWeightArr);
            Companion = new m();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new p73(12));
        }

        public static FontWeight valueOf(String str) {
            return (FontWeight) Enum.valueOf(FontWeight.class, str);
        }

        public static FontWeight[] values() {
            return (FontWeight[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{null, null, kotlin.a.b(lazyThreadSafetyMode, new p73(9)), kotlin.a.b(lazyThreadSafetyMode, new p73(10)), null};
    }

    public AttributedItem$AttributedTextItem(int i, String str, int i2, FontWeight fontWeight, FontStyle fontStyle, String str2) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = i2;
        }
        if ((i & 4) == 0) {
            this.c = FontWeight.UNKNOWN;
        } else {
            this.c = fontWeight;
        }
        if ((i & 8) == 0) {
            this.d = FontStyle.UNKNOWN;
        } else {
            this.d = fontStyle;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttributedItem$AttributedTextItem)) {
            return false;
        }
        AttributedItem$AttributedTextItem attributedItem$AttributedTextItem = (AttributedItem$AttributedTextItem) obj;
        return jl40.l(this.a, attributedItem$AttributedTextItem.a) && this.b == attributedItem$AttributedTextItem.b && this.c == attributedItem$AttributedTextItem.c && this.d == attributedItem$AttributedTextItem.d && jl40.l(this.e, attributedItem$AttributedTextItem.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + oyr.b(this.b, this.a.hashCode() * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder u = b64.u(this.b, "AttributedTextItem(text=", this.a, ", fontSize=", ", fontWeight=");
        u.append(this.c);
        u.append(", fontStyle=");
        u.append(this.d);
        u.append(", color=");
        return oyr.t(u, this.e, Extension.C_BRAKE);
    }

    public AttributedItem$AttributedTextItem() {
        FontWeight fontWeight = FontWeight.UNKNOWN;
        FontStyle fontStyle = FontStyle.UNKNOWN;
        this.a = "";
        this.b = 0;
        this.c = fontWeight;
        this.d = fontStyle;
        this.e = "";
    }
}
