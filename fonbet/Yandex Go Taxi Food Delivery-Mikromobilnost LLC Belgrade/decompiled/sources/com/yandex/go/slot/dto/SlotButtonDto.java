package com.yandex.go.slot.dto;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.wyr0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/slot/dto/SlotButtonDto;", "", "Companion", "Properties", "WidthStrategy", "$serializer", "com/yandex/go/slot/dto/p", "go-client-android.features.slot:dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SlotButtonDto {
    public static final p Companion = new p();
    public static final i3y[] i = {null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wyr0(17)), null, null, null};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final WidthStrategy e;
    public final Properties f;
    public final SlotItemDto g;
    public final BadgeItemDto h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/slot/dto/SlotButtonDto$WidthStrategy;", "", "Companion", "com/yandex/go/slot/dto/u", "DEFAULT", "FILL", "go-client-android.features.slot:dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class WidthStrategy {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ WidthStrategy[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final u Companion;
        public static final WidthStrategy DEFAULT;
        public static final WidthStrategy FILL;

        static {
            WidthStrategy widthStrategy = new WidthStrategy("DEFAULT", 0);
            DEFAULT = widthStrategy;
            WidthStrategy widthStrategy2 = new WidthStrategy("FILL", 1);
            FILL = widthStrategy2;
            WidthStrategy[] widthStrategyArr = {widthStrategy, widthStrategy2};
            $VALUES = widthStrategyArr;
            $ENTRIES = kotlin.enums.a.a(widthStrategyArr);
            Companion = new u();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wyr0(24));
        }

        public static WidthStrategy valueOf(String str) {
            return (WidthStrategy) Enum.valueOf(WidthStrategy.class, str);
        }

        public static WidthStrategy[] values() {
            return (WidthStrategy[]) $VALUES.clone();
        }
    }

    public /* synthetic */ SlotButtonDto(int i2, String str, String str2, String str3, String str4, WidthStrategy widthStrategy, Properties properties, SlotItemDto slotItemDto, BadgeItemDto badgeItemDto) {
        if ((i2 & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i2 & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i2 & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i2 & 16) == 0) {
            this.e = WidthStrategy.DEFAULT;
        } else {
            this.e = widthStrategy;
        }
        if ((i2 & 32) == 0) {
            this.f = new Properties(0);
        } else {
            this.f = properties;
        }
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = slotItemDto;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = badgeItemDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlotButtonDto)) {
            return false;
        }
        SlotButtonDto slotButtonDto = (SlotButtonDto) obj;
        return jl40.l(this.a, slotButtonDto.a) && jl40.l(this.b, slotButtonDto.b) && jl40.l(this.c, slotButtonDto.c) && jl40.l(this.d, slotButtonDto.d) && this.e == slotButtonDto.e && jl40.l(this.f, slotButtonDto.f) && jl40.l(this.g, slotButtonDto.g) && jl40.l(this.h, slotButtonDto.h);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (this.f.hashCode() + ((this.e.hashCode() + ((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31)) * 31;
        SlotItemDto slotItemDto = this.g;
        int hashCode5 = (hashCode4 + (slotItemDto == null ? 0 : slotItemDto.hashCode())) * 31;
        BadgeItemDto badgeItemDto = this.h;
        return hashCode5 + (badgeItemDto != null ? badgeItemDto.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("SlotButtonDto(id=", this.a, ", type=", this.b, ", analyticsId=");
        g8e.D(v, this.c, ", a11y=", this.d, ", widthStrategy=");
        v.append(this.e);
        v.append(", properties=");
        v.append(this.f);
        v.append(", slot=");
        v.append(this.g);
        v.append(", badge=");
        v.append(this.h);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/slot/dto/SlotButtonDto$Properties;", "", "Companion", "Size", "Style", "Form", "$serializer", "com/yandex/go/slot/dto/q", "go-client-android.features.slot:dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Properties {
        public static final q Companion = new q();
        public static final i3y[] e;
        public final Size a;
        public final Style b;
        public final Form c;
        public final String d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/slot/dto/SlotButtonDto$Properties$Form;", "", "Companion", "com/yandex/go/slot/dto/r", "SQUIRCLE", "CIRCLE", "go-client-android.features.slot:dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class Form {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ Form[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final Form CIRCLE;
            public static final r Companion;
            public static final Form SQUIRCLE;

            static {
                Form form = new Form("SQUIRCLE", 0);
                SQUIRCLE = form;
                Form form2 = new Form("CIRCLE", 1);
                CIRCLE = form2;
                Form[] formArr = {form, form2};
                $VALUES = formArr;
                $ENTRIES = kotlin.enums.a.a(formArr);
                Companion = new r();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wyr0(21));
            }

            public static Form valueOf(String str) {
                return (Form) Enum.valueOf(Form.class, str);
            }

            public static Form[] values() {
                return (Form[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/slot/dto/SlotButtonDto$Properties$Size;", "", "Companion", "com/yandex/go/slot/dto/s", "XS", "S", "M", "L", "go-client-android.features.slot:dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class Size {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ Size[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final s Companion;
            public static final Size L;
            public static final Size M;
            public static final Size S;
            public static final Size XS;

            static {
                Size size = new Size("XS", 0);
                XS = size;
                Size size2 = new Size("S", 1);
                S = size2;
                Size size3 = new Size("M", 2);
                M = size3;
                Size size4 = new Size("L", 3);
                L = size4;
                Size[] sizeArr = {size, size2, size3, size4};
                $VALUES = sizeArr;
                $ENTRIES = kotlin.enums.a.a(sizeArr);
                Companion = new s();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wyr0(22));
            }

            public static Size valueOf(String str) {
                return (Size) Enum.valueOf(Size.class, str);
            }

            public static Size[] values() {
                return (Size[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/slot/dto/SlotButtonDto$Properties$Style;", "", "Companion", "com/yandex/go/slot/dto/t", "MINOR", "go-client-android.features.slot:dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class Style {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ Style[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final t Companion;
            public static final Style MINOR;

            static {
                Style style = new Style("MINOR", 0);
                MINOR = style;
                Style[] styleArr = {style};
                $VALUES = styleArr;
                $ENTRIES = kotlin.enums.a.a(styleArr);
                Companion = new t();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wyr0(23));
            }

            public static Style valueOf(String str) {
                return (Style) Enum.valueOf(Style.class, str);
            }

            public static Style[] values() {
                return (Style[]) $VALUES.clone();
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            e = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new wyr0(18)), kotlin.a.b(lazyThreadSafetyMode, new wyr0(19)), kotlin.a.b(lazyThreadSafetyMode, new wyr0(20)), null};
        }

        public /* synthetic */ Properties(int i, Size size, Style style, Form form, String str) {
            this.a = (i & 1) == 0 ? Size.M : size;
            if ((i & 2) == 0) {
                this.b = Style.MINOR;
            } else {
                this.b = style;
            }
            if ((i & 4) == 0) {
                this.c = Form.SQUIRCLE;
            } else {
                this.c = form;
            }
            if ((i & 8) == 0) {
                this.d = "controlMinor";
            } else {
                this.d = str;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Properties)) {
                return false;
            }
            Properties properties = (Properties) obj;
            return this.a == properties.a && this.b == properties.b && this.c == properties.c && jl40.l(this.d, properties.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Properties(size=" + this.a + ", style=" + this.b + ", form=" + this.c + ", color=" + this.d + Extension.C_BRAKE;
        }

        public Properties() {
            this(0);
        }

        public Properties(int i) {
            Size size = Size.M;
            Style style = Style.MINOR;
            Form form = Form.SQUIRCLE;
            this.a = size;
            this.b = style;
            this.c = form;
            this.d = "controlMinor";
        }
    }

    public SlotButtonDto(String str, String str2, String str3, String str4, WidthStrategy widthStrategy, Properties properties, SlotItemDto slotItemDto, BadgeItemDto badgeItemDto) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = widthStrategy;
        this.f = properties;
        this.g = slotItemDto;
        this.h = badgeItemDto;
    }

    public SlotButtonDto() {
        this(null, null, null, null, WidthStrategy.DEFAULT, new Properties(0), null, null);
    }
}
