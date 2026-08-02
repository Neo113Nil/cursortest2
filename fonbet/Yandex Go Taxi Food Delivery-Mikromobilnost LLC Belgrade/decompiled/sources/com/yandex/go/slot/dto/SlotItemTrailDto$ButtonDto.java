package com.yandex.go.slot.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.tqs0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/slot/dto/SlotItemTrailDto$ButtonDto", "Lcom/yandex/go/slot/dto/x2;", "Companion", "Style", "$serializer", "com/yandex/go/slot/dto/o2", "go-client-android.features.slot:dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SlotItemTrailDto$ButtonDto extends x2 {
    public static final o2 Companion = new o2();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tqs0(10)), null};
    public final FormattedText a;
    public final Style b;
    public final b2 c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/slot/dto/SlotItemTrailDto$ButtonDto$Style;", "", "Companion", "com/yandex/go/slot/dto/p2", "MAIN", "OUTLINE", "ACTION", "go-client-android.features.slot:dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Style {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final Style ACTION;
        public static final p2 Companion;
        public static final Style MAIN;
        public static final Style OUTLINE;

        static {
            Style style = new Style("MAIN", 0);
            MAIN = style;
            Style style2 = new Style("OUTLINE", 1);
            OUTLINE = style2;
            Style style3 = new Style("ACTION", 2);
            ACTION = style3;
            Style[] styleArr = {style, style2, style3};
            $VALUES = styleArr;
            $ENTRIES = kotlin.enums.a.a(styleArr);
            Companion = new p2();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tqs0(11));
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }
    }

    public SlotItemTrailDto$ButtonDto(int i, FormattedText formattedText, Style style, b2 b2Var) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = Style.MAIN;
        } else {
            this.b = style;
        }
        if ((i & 4) == 0) {
            this.c = y0.INSTANCE;
        } else {
            this.c = b2Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlotItemTrailDto$ButtonDto)) {
            return false;
        }
        SlotItemTrailDto$ButtonDto slotItemTrailDto$ButtonDto = (SlotItemTrailDto$ButtonDto) obj;
        return jl40.l(this.a, slotItemTrailDto$ButtonDto.a) && this.b == slotItemTrailDto$ButtonDto.b && jl40.l(this.c, slotItemTrailDto$ButtonDto.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ButtonDto(text=" + this.a + ", style=" + this.b + ", action=" + this.c + Extension.C_BRAKE;
    }

    public SlotItemTrailDto$ButtonDto() {
        FormattedText formattedText = FormattedText.c;
        Style style = Style.MAIN;
        y0 y0Var = y0.INSTANCE;
        this.a = formattedText;
        this.b = style;
        this.c = y0Var;
    }
}
