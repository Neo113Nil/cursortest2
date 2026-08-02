package com.yandex.go.navigator.favorites.experiment;

import defpackage.ah40;
import defpackage.d540;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oo31;
import defpackage.unr0;
import defpackage.w96;
import defpackage.x4e;
import defpackage.yjd;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/navigator/favorites/experiment/NavigatorFavoritesConfigDto;", "Lw96;", "Companion", "PlacemarkVariantDto", "PlaceTypeDto", "ZoomAppearanceDto", "ZoomRangeDto", "com/yandex/go/navigator/favorites/experiment/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NavigatorFavoritesConfigDto extends w96 {
    public static final a Companion = new a();
    public static final i3y[] h = {null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new d540(29))};
    public static final NavigatorFavoritesConfigDto i = new NavigatorFavoritesConfigDto(0);
    public final boolean b;
    public final int c;
    public final int d;
    public final float e;
    public final float f;
    public final List g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/navigator/favorites/experiment/NavigatorFavoritesConfigDto$PlaceTypeDto;", "", "Companion", "com/yandex/go/navigator/favorites/experiment/b", "HOME", "WORK", "FAVORITE_ORGANIZATION", "OTHER", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final class PlaceTypeDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ PlaceTypeDto[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final b Companion;
        public static final PlaceTypeDto FAVORITE_ORGANIZATION;
        public static final PlaceTypeDto HOME;
        public static final PlaceTypeDto OTHER;
        public static final PlaceTypeDto WORK;

        static {
            PlaceTypeDto placeTypeDto = new PlaceTypeDto("HOME", 0);
            HOME = placeTypeDto;
            PlaceTypeDto placeTypeDto2 = new PlaceTypeDto("WORK", 1);
            WORK = placeTypeDto2;
            PlaceTypeDto placeTypeDto3 = new PlaceTypeDto("FAVORITE_ORGANIZATION", 2);
            FAVORITE_ORGANIZATION = placeTypeDto3;
            PlaceTypeDto placeTypeDto4 = new PlaceTypeDto("OTHER", 3);
            OTHER = placeTypeDto4;
            PlaceTypeDto[] placeTypeDtoArr = {placeTypeDto, placeTypeDto2, placeTypeDto3, placeTypeDto4};
            $VALUES = placeTypeDtoArr;
            $ENTRIES = kotlin.enums.a.a(placeTypeDtoArr);
            Companion = new b();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ah40(20));
        }

        public static PlaceTypeDto valueOf(String str) {
            return (PlaceTypeDto) Enum.valueOf(PlaceTypeDto.class, str);
        }

        public static PlaceTypeDto[] values() {
            return (PlaceTypeDto[]) $VALUES.clone();
        }
    }

    public /* synthetic */ NavigatorFavoritesConfigDto(int i2, boolean z, int i3, int i4, float f, float f2, List list) {
        if ((i2 & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i2 & 2) == 0) {
            this.c = 0;
        } else {
            this.c = i3;
        }
        if ((i2 & 4) == 0) {
            this.d = 0;
        } else {
            this.d = i4;
        }
        if ((i2 & 8) == 0) {
            this.e = 0.0f;
        } else {
            this.e = f;
        }
        if ((i2 & 16) == 0) {
            this.f = 0.0f;
        } else {
            this.f = f2;
        }
        if ((i2 & 32) == 0) {
            this.g = EmptyList.a;
        } else {
            this.g = list;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/navigator/favorites/experiment/NavigatorFavoritesConfigDto$PlacemarkVariantDto;", "", "Companion", "$serializer", "com/yandex/go/navigator/favorites/experiment/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final /* data */ class PlacemarkVariantDto {
        public static final c Companion = new c();
        public static final i3y[] c;
        public final PlaceTypeDto a;
        public final List b;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new ah40(21)), kotlin.a.b(lazyThreadSafetyMode, new ah40(22))};
        }

        public /* synthetic */ PlacemarkVariantDto(int i, PlaceTypeDto placeTypeDto, List list) {
            this.a = (i & 1) == 0 ? PlaceTypeDto.OTHER : placeTypeDto;
            if ((i & 2) == 0) {
                this.b = EmptyList.a;
            } else {
                this.b = list;
            }
        }

        public static final /* synthetic */ void b(PlacemarkVariantDto placemarkVariantDto, yjd yjdVar, SerialDescriptor serialDescriptor) {
            boolean F = yjdVar.F();
            i3y[] i3yVarArr = c;
            if (F || placemarkVariantDto.a != PlaceTypeDto.OTHER) {
                yjdVar.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), placemarkVariantDto.a);
            }
            if (!yjdVar.F() && jl40.l(placemarkVariantDto.b, EmptyList.a)) {
                return;
            }
            yjdVar.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), placemarkVariantDto.b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlacemarkVariantDto)) {
                return false;
            }
            PlacemarkVariantDto placemarkVariantDto = (PlacemarkVariantDto) obj;
            return this.a == placemarkVariantDto.a && jl40.l(this.b, placemarkVariantDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "PlacemarkVariantDto(placeType=" + this.a + ", zoomAppearanceList=" + this.b + Extension.C_BRAKE;
        }

        public PlacemarkVariantDto() {
            this.a = PlaceTypeDto.OTHER;
            this.b = EmptyList.a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/navigator/favorites/experiment/NavigatorFavoritesConfigDto$ZoomRangeDto;", "", "Companion", "$serializer", "com/yandex/go/navigator/favorites/experiment/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final /* data */ class ZoomRangeDto {
        public static final e Companion = new e();
        public final float a;
        public final float b;

        public /* synthetic */ ZoomRangeDto(int i, float f, float f2) {
            if ((i & 1) == 0) {
                this.a = 0.0f;
            } else {
                this.a = f;
            }
            if ((i & 2) == 0) {
                this.b = 0.0f;
            } else {
                this.b = f2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ZoomRangeDto)) {
                return false;
            }
            ZoomRangeDto zoomRangeDto = (ZoomRangeDto) obj;
            return Float.compare(this.a, zoomRangeDto.a) == 0 && Float.compare(this.b, zoomRangeDto.b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
        }

        public final String toString() {
            return x4e.e("ZoomRangeDto(max=", this.a, ", min=", this.b, Extension.C_BRAKE);
        }

        public ZoomRangeDto(int i) {
            this.a = 0.0f;
            this.b = 0.0f;
        }

        public ZoomRangeDto() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/navigator/favorites/experiment/NavigatorFavoritesConfigDto$ZoomAppearanceDto;", "", "Companion", "$serializer", "com/yandex/go/navigator/favorites/experiment/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final /* data */ class ZoomAppearanceDto {
        public static final d Companion = new d();
        public final String a;
        public final boolean b;
        public final ZoomRangeDto c;

        public /* synthetic */ ZoomAppearanceDto(int i, String str, boolean z, ZoomRangeDto zoomRangeDto) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = false;
            } else {
                this.b = z;
            }
            if ((i & 4) == 0) {
                this.c = new ZoomRangeDto(0);
            } else {
                this.c = zoomRangeDto;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ZoomAppearanceDto)) {
                return false;
            }
            ZoomAppearanceDto zoomAppearanceDto = (ZoomAppearanceDto) obj;
            return jl40.l(this.a, zoomAppearanceDto.a) && this.b == zoomAppearanceDto.b && jl40.l(this.c, zoomAppearanceDto.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder l = oo31.l("ZoomAppearanceDto(imageTag=", this.a, ", labelEnabled=", ", zoomRange=", this.b);
            l.append(this.c);
            l.append(Extension.C_BRAKE);
            return l.toString();
        }

        public ZoomAppearanceDto() {
            ZoomRangeDto zoomRangeDto = new ZoomRangeDto(0);
            this.a = "";
            this.b = false;
            this.c = zoomRangeDto;
        }
    }

    public NavigatorFavoritesConfigDto(int i2) {
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = EmptyList.a;
    }

    public NavigatorFavoritesConfigDto() {
        this(0);
    }
}
