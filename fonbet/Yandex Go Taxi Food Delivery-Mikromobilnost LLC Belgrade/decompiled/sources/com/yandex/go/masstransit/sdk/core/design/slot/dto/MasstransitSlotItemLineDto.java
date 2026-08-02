package com.yandex.go.masstransit.sdk.core.design.slot.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.kr00;
import defpackage.oyr;
import defpackage.tse0;
import defpackage.w410;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/masstransit/sdk/core/design/slot/dto/MasstransitSlotItemLineDto;", "", "Companion", "Ellipsis", "$serializer", "com/yandex/go/masstransit/sdk/core/design/slot/dto/l", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class MasstransitSlotItemLineDto {
    public static final l Companion = new l();
    public static final i3y[] d = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new kr00(29)), null, null};
    public final Ellipsis a;
    public final int b;
    public final FormattedText c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/masstransit/sdk/core/design/slot/dto/MasstransitSlotItemLineDto$Ellipsis;", "", "Companion", "com/yandex/go/masstransit/sdk/core/design/slot/dto/m", "CENTER", "END", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Ellipsis {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Ellipsis[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final Ellipsis CENTER;
        public static final m Companion;
        public static final Ellipsis END;

        static {
            Ellipsis ellipsis = new Ellipsis("CENTER", 0);
            CENTER = ellipsis;
            Ellipsis ellipsis2 = new Ellipsis("END", 1);
            END = ellipsis2;
            Ellipsis[] ellipsisArr = {ellipsis, ellipsis2};
            $VALUES = ellipsisArr;
            $ENTRIES = kotlin.enums.a.a(ellipsisArr);
            Companion = new m();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new w410(0));
        }

        public static Ellipsis valueOf(String str) {
            return (Ellipsis) Enum.valueOf(Ellipsis.class, str);
        }

        public static Ellipsis[] values() {
            return (Ellipsis[]) $VALUES.clone();
        }
    }

    public /* synthetic */ MasstransitSlotItemLineDto(int i, Ellipsis ellipsis, int i2, FormattedText formattedText) {
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

    /* renamed from: a, reason: from getter */
    public final FormattedText getC() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MasstransitSlotItemLineDto)) {
            return false;
        }
        MasstransitSlotItemLineDto masstransitSlotItemLineDto = (MasstransitSlotItemLineDto) obj;
        return this.a == masstransitSlotItemLineDto.a && this.b == masstransitSlotItemLineDto.b && jl40.l(this.c, masstransitSlotItemLineDto.c);
    }

    public final int hashCode() {
        int b = oyr.b(this.b, this.a.hashCode() * 31, 31);
        FormattedText formattedText = this.c;
        return b + (formattedText == null ? 0 : formattedText.a.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MasstransitSlotItemLineDto(ellipsis=");
        sb.append(this.a);
        sb.append(", lineCount=");
        sb.append(this.b);
        sb.append(", text=");
        return tse0.m(sb, this.c, Extension.C_BRAKE);
    }

    public MasstransitSlotItemLineDto() {
        this.a = Ellipsis.END;
        this.b = 1;
        this.c = null;
    }
}
