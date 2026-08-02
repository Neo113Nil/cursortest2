package com.yandex.go.slot.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import defpackage.tqs0;
import defpackage.tse0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/slot/dto/SlotItemLineDto;", "", "Companion", "Ellipsis", "$serializer", "com/yandex/go/slot/dto/l2", "go-client-android.features.slot:dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SlotItemLineDto {
    public static final l2 Companion = new l2();
    public static final i3y[] d = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tqs0(7)), null, null};
    public final Ellipsis a;
    public final int b;
    public final FormattedText c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/slot/dto/SlotItemLineDto$Ellipsis;", "", "Companion", "com/yandex/go/slot/dto/m2", "CENTER", "END", "go-client-android.features.slot:dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Ellipsis {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Ellipsis[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final Ellipsis CENTER;
        public static final m2 Companion;
        public static final Ellipsis END;

        static {
            Ellipsis ellipsis = new Ellipsis("CENTER", 0);
            CENTER = ellipsis;
            Ellipsis ellipsis2 = new Ellipsis("END", 1);
            END = ellipsis2;
            Ellipsis[] ellipsisArr = {ellipsis, ellipsis2};
            $VALUES = ellipsisArr;
            $ENTRIES = kotlin.enums.a.a(ellipsisArr);
            Companion = new m2();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tqs0(8));
        }

        public static Ellipsis valueOf(String str) {
            return (Ellipsis) Enum.valueOf(Ellipsis.class, str);
        }

        public static Ellipsis[] values() {
            return (Ellipsis[]) $VALUES.clone();
        }
    }

    public /* synthetic */ SlotItemLineDto(int i, Ellipsis ellipsis, int i2, FormattedText formattedText) {
        this.a = (i & 1) == 0 ? Ellipsis.END : ellipsis;
        if ((i & 2) == 0) {
            this.b = 1;
        } else {
            this.b = i2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = formattedText;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlotItemLineDto)) {
            return false;
        }
        SlotItemLineDto slotItemLineDto = (SlotItemLineDto) obj;
        return this.a == slotItemLineDto.a && this.b == slotItemLineDto.b && jl40.l(this.c, slotItemLineDto.c);
    }

    public final int hashCode() {
        int b = oyr.b(this.b, this.a.hashCode() * 31, 31);
        FormattedText formattedText = this.c;
        return b + (formattedText == null ? 0 : formattedText.a.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotItemLineDto(ellipsis=");
        sb.append(this.a);
        sb.append(", lineCount=");
        sb.append(this.b);
        sb.append(", text=");
        return tse0.m(sb, this.c, Extension.C_BRAKE);
    }

    public SlotItemLineDto(Ellipsis ellipsis, int i, FormattedText formattedText) {
        this.a = ellipsis;
        this.b = i;
        this.c = formattedText;
    }

    public SlotItemLineDto() {
        this(Ellipsis.END, 1, null);
    }
}
