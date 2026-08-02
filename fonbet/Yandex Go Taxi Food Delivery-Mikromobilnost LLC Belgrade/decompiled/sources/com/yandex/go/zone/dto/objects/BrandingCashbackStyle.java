package com.yandex.go.zone.dto.objects;

import defpackage.av5;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/zone/dto/objects/BrandingCashbackStyle;", "", "Companion", "Style", "com/yandex/go/zone/dto/objects/j", "$serializer", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BrandingCashbackStyle {
    public static final j Companion = new j();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new av5(23))};
    public static final BrandingCashbackStyle c = new BrandingCashbackStyle(0);
    public final Style a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/zone/dto/objects/BrandingCashbackStyle$Style;", "", "Companion", "com/yandex/go/zone/dto/objects/k", "DARK_GRAY", "LIGHT_GRAY", "LIGHT_GRADIENT", "DARK_GRADIENT", "DISABLED", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class Style {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final k Companion;
        public static final Style DARK_GRADIENT;
        public static final Style DARK_GRAY;
        public static final Style DISABLED;
        public static final Style LIGHT_GRADIENT;
        public static final Style LIGHT_GRAY;

        static {
            Style style = new Style("DARK_GRAY", 0);
            DARK_GRAY = style;
            Style style2 = new Style("LIGHT_GRAY", 1);
            LIGHT_GRAY = style2;
            Style style3 = new Style("LIGHT_GRADIENT", 2);
            LIGHT_GRADIENT = style3;
            Style style4 = new Style("DARK_GRADIENT", 3);
            DARK_GRADIENT = style4;
            Style style5 = new Style("DISABLED", 4);
            DISABLED = style5;
            Style[] styleArr = {style, style2, style3, style4, style5};
            $VALUES = styleArr;
            $ENTRIES = kotlin.enums.a.a(styleArr);
            Companion = new k();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new av5(24));
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }
    }

    public /* synthetic */ BrandingCashbackStyle(int i, Style style) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = style;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BrandingCashbackStyle) && this.a == ((BrandingCashbackStyle) obj).a;
    }

    public final int hashCode() {
        Style style = this.a;
        if (style == null) {
            return 0;
        }
        return style.hashCode();
    }

    public final String toString() {
        return "BrandingCashbackStyle(cashbackStyle=" + this.a + Extension.C_BRAKE;
    }

    public BrandingCashbackStyle(int i) {
        this.a = null;
    }

    public BrandingCashbackStyle() {
        this(0);
    }
}
