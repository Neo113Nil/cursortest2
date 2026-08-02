package com.yandex.go.slot.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.n7v;
import defpackage.srs0;
import defpackage.tqs0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"com/yandex/go/slot/dto/SlotItemTrailDto$IconSpotDto", "Lcom/yandex/go/slot/dto/x2;", "Lsrs0;", "Companion", "SpotType", "Size", "$serializer", "com/yandex/go/slot/dto/r2", "go-client-android.features.slot:dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SlotItemTrailDto$IconSpotDto extends x2 implements srs0 {
    public static final r2 Companion = new r2();
    public static final i3y[] e;
    public final n7v a;
    public final SpotType b;
    public final Size c;
    public final String d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/slot/dto/SlotItemTrailDto$IconSpotDto$Size;", "", "Companion", "com/yandex/go/slot/dto/s2", "M", "go-client-android.features.slot:dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Size {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final s2 Companion;
        public static final Size M;

        static {
            Size size = new Size("M", 0);
            M = size;
            Size[] sizeArr = {size};
            $VALUES = sizeArr;
            $ENTRIES = kotlin.enums.a.a(sizeArr);
            Companion = new s2();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tqs0(14));
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
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/slot/dto/SlotItemTrailDto$IconSpotDto$SpotType;", "", "Companion", "com/yandex/go/slot/dto/t2", "FILL", "go-client-android.features.slot:dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class SpotType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ SpotType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final t2 Companion;
        public static final SpotType FILL;

        static {
            SpotType spotType = new SpotType("FILL", 0);
            FILL = spotType;
            SpotType[] spotTypeArr = {spotType};
            $VALUES = spotTypeArr;
            $ENTRIES = kotlin.enums.a.a(spotTypeArr);
            Companion = new t2();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tqs0(15));
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
        e = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new tqs0(12)), kotlin.a.b(lazyThreadSafetyMode, new tqs0(13)), null};
    }

    public SlotItemTrailDto$IconSpotDto(int i, n7v n7vVar, SpotType spotType, Size size, String str) {
        this.a = (i & 1) == 0 ? n7v.f : n7vVar;
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlotItemTrailDto$IconSpotDto)) {
            return false;
        }
        SlotItemTrailDto$IconSpotDto slotItemTrailDto$IconSpotDto = (SlotItemTrailDto$IconSpotDto) obj;
        return jl40.l(this.a, slotItemTrailDto$IconSpotDto.a) && this.b == slotItemTrailDto$IconSpotDto.b && this.c == slotItemTrailDto$IconSpotDto.c && jl40.l(this.d, slotItemTrailDto$IconSpotDto.d);
    }

    @Override // defpackage.srs0
    /* renamed from: f, reason: from getter */
    public final n7v getA() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "IconSpotDto(image=" + this.a + ", spotType=" + this.b + ", size=" + this.c + ", backgroundColor=" + this.d + Extension.C_BRAKE;
    }

    public SlotItemTrailDto$IconSpotDto() {
        n7v n7vVar = n7v.f;
        SpotType spotType = SpotType.FILL;
        Size size = Size.M;
        this.a = n7vVar;
        this.b = spotType;
        this.c = size;
        this.d = null;
    }
}
