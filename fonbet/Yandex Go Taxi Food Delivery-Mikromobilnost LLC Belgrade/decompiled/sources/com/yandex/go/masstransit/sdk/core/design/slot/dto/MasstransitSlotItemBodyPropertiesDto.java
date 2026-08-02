package com.yandex.go.masstransit.sdk.core.design.slot.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.kr00;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/masstransit/sdk/core/design/slot/dto/MasstransitSlotItemBodyPropertiesDto;", "", "Companion", "Align", "$serializer", "com/yandex/go/masstransit/sdk/core/design/slot/dto/e", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class MasstransitSlotItemBodyPropertiesDto {
    public static final e Companion = new e();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new kr00(23))};
    public final Align a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/masstransit/sdk/core/design/slot/dto/MasstransitSlotItemBodyPropertiesDto$Align;", "", "Companion", "com/yandex/go/masstransit/sdk/core/design/slot/dto/d", "START", "CENTER", "END", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Align {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Align[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final Align CENTER;
        public static final d Companion;
        public static final Align END;
        public static final Align START;

        static {
            Align align = new Align("START", 0);
            START = align;
            Align align2 = new Align("CENTER", 1);
            CENTER = align2;
            Align align3 = new Align("END", 2);
            END = align3;
            Align[] alignArr = {align, align2, align3};
            $VALUES = alignArr;
            $ENTRIES = kotlin.enums.a.a(alignArr);
            Companion = new d();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new kr00(24));
        }

        public static Align valueOf(String str) {
            return (Align) Enum.valueOf(Align.class, str);
        }

        public static Align[] values() {
            return (Align[]) $VALUES.clone();
        }
    }

    public /* synthetic */ MasstransitSlotItemBodyPropertiesDto(int i, Align align) {
        if ((i & 1) == 0) {
            this.a = Align.START;
        } else {
            this.a = align;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MasstransitSlotItemBodyPropertiesDto) && this.a == ((MasstransitSlotItemBodyPropertiesDto) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MasstransitSlotItemBodyPropertiesDto(align=" + this.a + Extension.C_BRAKE;
    }

    public MasstransitSlotItemBodyPropertiesDto() {
        this(0);
    }

    public MasstransitSlotItemBodyPropertiesDto(int i) {
        this.a = Align.START;
    }
}
