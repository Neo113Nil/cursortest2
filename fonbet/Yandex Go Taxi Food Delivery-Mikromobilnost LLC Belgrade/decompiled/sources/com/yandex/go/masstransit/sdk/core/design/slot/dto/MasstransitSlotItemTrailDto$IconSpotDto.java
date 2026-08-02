package com.yandex.go.masstransit.sdk.core.design.slot.dto;

import com.yandex.go.masstransit.sdk.core.image.MtSdkImage;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.w410;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/masstransit/sdk/core/design/slot/dto/MasstransitSlotItemTrailDto$IconSpotDto", "Lcom/yandex/go/masstransit/sdk/core/design/slot/dto/t;", "Companion", "SpotType", "Size", "$serializer", "com/yandex/go/masstransit/sdk/core/design/slot/dto/p", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class MasstransitSlotItemTrailDto$IconSpotDto extends t {
    public static final p Companion = new p();
    public static final i3y[] e;
    public final MtSdkImage a;
    public final SpotType b;
    public final Size c;
    public final String d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/core/design/slot/dto/MasstransitSlotItemTrailDto$IconSpotDto$Size;", "", "Companion", "com/yandex/go/masstransit/sdk/core/design/slot/dto/q", "M", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Size {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final q Companion;
        public static final Size M;

        static {
            Size size = new Size("M", 0);
            M = size;
            Size[] sizeArr = {size};
            $VALUES = sizeArr;
            $ENTRIES = kotlin.enums.a.a(sizeArr);
            Companion = new q();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new w410(6));
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
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/core/design/slot/dto/MasstransitSlotItemTrailDto$IconSpotDto$SpotType;", "", "Companion", "com/yandex/go/masstransit/sdk/core/design/slot/dto/r", "FILL", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class SpotType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ SpotType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final r Companion;
        public static final SpotType FILL;

        static {
            SpotType spotType = new SpotType("FILL", 0);
            FILL = spotType;
            SpotType[] spotTypeArr = {spotType};
            $VALUES = spotTypeArr;
            $ENTRIES = kotlin.enums.a.a(spotTypeArr);
            Companion = new r();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new w410(7));
        }

        public static SpotType valueOf(String str) {
            return (SpotType) Enum.valueOf(SpotType.class, str);
        }

        public static SpotType[] values() {
            return (SpotType[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new w410(4)), kotlin.a.b(lazyThreadSafetyMode, new w410(5)), null};
    }

    public MasstransitSlotItemTrailDto$IconSpotDto(int i, MtSdkImage mtSdkImage, SpotType spotType, Size size, String str) {
        if ((i & 1) == 0) {
            MtSdkImage.Companion.getClass();
            mtSdkImage = MtSdkImage.f;
        }
        this.a = mtSdkImage;
        if ((i & 2) == 0) {
            this.b = SpotType.FILL;
        } else {
            this.b = spotType;
        }
        if ((i & 4) == 0) {
            this.c = Size.M;
        } else {
            this.c = size;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
    }

    /* renamed from: a, reason: from getter */
    public final MtSdkImage getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MasstransitSlotItemTrailDto$IconSpotDto)) {
            return false;
        }
        MasstransitSlotItemTrailDto$IconSpotDto masstransitSlotItemTrailDto$IconSpotDto = (MasstransitSlotItemTrailDto$IconSpotDto) obj;
        return jl40.l(this.a, masstransitSlotItemTrailDto$IconSpotDto.a) && this.b == masstransitSlotItemTrailDto$IconSpotDto.b && this.c == masstransitSlotItemTrailDto$IconSpotDto.c && jl40.l(this.d, masstransitSlotItemTrailDto$IconSpotDto.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "IconSpotDto(image=" + this.a + ", spotType=" + this.b + ", size=" + this.c + ", backgroundColor=" + this.d + Extension.C_BRAKE;
    }

    public MasstransitSlotItemTrailDto$IconSpotDto() {
        MtSdkImage.Companion.getClass();
        SpotType spotType = SpotType.FILL;
        Size size = Size.M;
        this.a = MtSdkImage.f;
        this.b = spotType;
        this.c = size;
        this.d = null;
    }
}
