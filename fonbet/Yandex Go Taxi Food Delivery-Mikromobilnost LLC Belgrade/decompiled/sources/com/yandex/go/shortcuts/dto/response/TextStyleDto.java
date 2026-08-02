package com.yandex.go.shortcuts.dto.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.y6y0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/TextStyleDto;", "", "Companion", "HorizontalAlignment", "$serializer", "com/yandex/go/shortcuts/dto/response/u2", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TextStyleDto {
    public static final u2 Companion = new u2();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new y6y0(26))};
    public final String a;
    public final HorizontalAlignment b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/TextStyleDto$HorizontalAlignment;", "", "Companion", "com/yandex/go/shortcuts/dto/response/v2", "LEADING", "CENTER", "TRAILING", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class HorizontalAlignment {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ HorizontalAlignment[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final HorizontalAlignment CENTER;
        public static final v2 Companion;
        public static final HorizontalAlignment LEADING;
        public static final HorizontalAlignment TRAILING;

        static {
            HorizontalAlignment horizontalAlignment = new HorizontalAlignment("LEADING", 0);
            LEADING = horizontalAlignment;
            HorizontalAlignment horizontalAlignment2 = new HorizontalAlignment("CENTER", 1);
            CENTER = horizontalAlignment2;
            HorizontalAlignment horizontalAlignment3 = new HorizontalAlignment("TRAILING", 2);
            TRAILING = horizontalAlignment3;
            HorizontalAlignment[] horizontalAlignmentArr = {horizontalAlignment, horizontalAlignment2, horizontalAlignment3};
            $VALUES = horizontalAlignmentArr;
            $ENTRIES = kotlin.enums.a.a(horizontalAlignmentArr);
            Companion = new v2();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new y6y0(27));
        }

        public static HorizontalAlignment valueOf(String str) {
            return (HorizontalAlignment) Enum.valueOf(HorizontalAlignment.class, str);
        }

        public static HorizontalAlignment[] values() {
            return (HorizontalAlignment[]) $VALUES.clone();
        }
    }

    public /* synthetic */ TextStyleDto(int i, String str, HorizontalAlignment horizontalAlignment) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = horizontalAlignment;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStyleDto)) {
            return false;
        }
        TextStyleDto textStyleDto = (TextStyleDto) obj;
        return jl40.l(this.a, textStyleDto.a) && this.b == textStyleDto.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        HorizontalAlignment horizontalAlignment = this.b;
        return hashCode + (horizontalAlignment == null ? 0 : horizontalAlignment.hashCode());
    }

    public final String toString() {
        return "TextStyleDto(color=" + this.a + ", horizontalAlignment=" + this.b + Extension.C_BRAKE;
    }

    public TextStyleDto(int i) {
        this.a = "";
        this.b = null;
    }

    public TextStyleDto() {
        this(0);
    }
}
