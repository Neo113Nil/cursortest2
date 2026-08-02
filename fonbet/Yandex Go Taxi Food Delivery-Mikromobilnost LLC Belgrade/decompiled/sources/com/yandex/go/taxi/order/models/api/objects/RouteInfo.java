package com.yandex.go.taxi.order.models.api.objects;

import defpackage.apk0;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.nnm;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.tcc;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.xvz;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00022\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/RouteInfo;", "", "Companion", "Position", "Style", "com/yandex/go/taxi/order/models/api/objects/e1", "com/yandex/go/taxi/order/models/api/objects/f1", "com/yandex/go/taxi/order/models/api/objects/l1", "ImageIcon", "PinIcon", "$serializer", "com/yandex/go/taxi/order/models/api/objects/d1", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RouteInfo {
    public static final d1 Companion = new d1();
    public static final i3y[] f = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new apk0(15)), null};
    public final double a;
    public final double b;
    public final double c;
    public final List d;
    public final MapRouteParametersDto e;

    public /* synthetic */ RouteInfo(int i, double d, double d2, double d3, List list, MapRouteParametersDto mapRouteParametersDto) {
        if ((i & 1) == 0) {
            this.a = 0.0d;
        } else {
            this.a = d;
        }
        if ((i & 2) == 0) {
            this.b = 0.0d;
        } else {
            this.b = d2;
        }
        if ((i & 4) == 0) {
            this.c = 0.0d;
        } else {
            this.c = d3;
        }
        if ((i & 8) == 0) {
            this.d = EmptyList.a;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = mapRouteParametersDto;
        }
    }

    /* renamed from: a, reason: from getter */
    public final MapRouteParametersDto getE() {
        return this.e;
    }

    /* renamed from: b, reason: from getter */
    public final double getC() {
        return this.c;
    }

    public final ArrayList c() {
        List list = this.d;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Position) it.next()).b);
        }
        return arrayList;
    }

    /* renamed from: d, reason: from getter */
    public final double getB() {
        return this.b;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/RouteInfo$Style;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/objects/k1", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Style {
        public static final k1 Companion = new k1();
        public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new apk0(21))};
        public final List a;

        public /* synthetic */ Style(int i, List list) {
            if ((i & 1) == 0) {
                this.a = EmptyList.a;
            } else {
                this.a = list;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Style) && jl40.l(this.a, ((Style) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tse0.k("Style(icons=", Extension.C_BRAKE, this.a);
        }

        public Style() {
            this.a = EmptyList.a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/RouteInfo$ImageIcon;", "Lcom/yandex/go/taxi/order/models/api/objects/e1;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/objects/g1", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class ImageIcon extends e1 {
        public static final g1 Companion = new g1();
        public static final i3y[] d;
        public final List a;
        public final List b;
        public final String c;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            d = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new apk0(16)), kotlin.a.b(lazyThreadSafetyMode, new apk0(17)), null};
        }

        public ImageIcon(int i, String str, List list, List list2) {
            int i2 = i & 1;
            EmptyList emptyList = EmptyList.a;
            if (i2 == 0) {
                this.a = emptyList;
            } else {
                this.a = list;
            }
            if ((i & 2) == 0) {
                this.b = emptyList;
            } else {
                this.b = list2;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageIcon)) {
                return false;
            }
            ImageIcon imageIcon = (ImageIcon) obj;
            return jl40.l(this.a, imageIcon.a) && jl40.l(this.b, imageIcon.b) && jl40.l(this.c, imageIcon.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return oyr.t(qv10.v("ImageIcon(anchor=", this.a, ", zooms=", this.b, ", iconTag="), this.c, Extension.C_BRAKE);
        }

        public ImageIcon() {
            EmptyList emptyList = EmptyList.a;
            this.a = emptyList;
            this.b = emptyList;
            this.c = "";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/RouteInfo$Position;", "", "Companion", "Type", "$serializer", "com/yandex/go/taxi/order/models/api/objects/i1", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Position {
        public static final i1 Companion = new i1();
        public static final i3y[] e = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new apk0(19)), null, null, null};
        public final Type a;
        public final zzs b;
        public final String c;
        public final Style d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/RouteInfo$Position$Type;", "", "Companion", "com/yandex/go/taxi/order/models/api/objects/j1", "CHAIN", "POOL_PICKUP", "POOL_DROPOFF", "UNSUPPORTED", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class Type {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final Type CHAIN;
            public static final j1 Companion;
            public static final Type POOL_DROPOFF;
            public static final Type POOL_PICKUP;
            public static final Type UNSUPPORTED;

            static {
                Type type = new Type("CHAIN", 0);
                CHAIN = type;
                Type type2 = new Type("POOL_PICKUP", 1);
                POOL_PICKUP = type2;
                Type type3 = new Type("POOL_DROPOFF", 2);
                POOL_DROPOFF = type3;
                Type type4 = new Type("UNSUPPORTED", 3);
                UNSUPPORTED = type4;
                Type[] typeArr = {type, type2, type3, type4};
                $VALUES = typeArr;
                $ENTRIES = kotlin.enums.a.a(typeArr);
                Companion = new j1();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new apk0(20));
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        public /* synthetic */ Position(int i, Type type, zzs zzsVar, String str, Style style) {
            this.a = (i & 1) == 0 ? Type.UNSUPPORTED : type;
            if ((i & 2) == 0) {
                this.b = zzs.f;
            } else {
                this.b = zzsVar;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = style;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Position)) {
                return false;
            }
            Position position = (Position) obj;
            return this.a == position.a && jl40.l(this.b, position.b) && jl40.l(this.c, position.c) && jl40.l(this.d, position.d);
        }

        public final int hashCode() {
            int b = unr0.b(nnm.b(this.b, this.a.hashCode() * 31, 31), 31, this.c);
            Style style = this.d;
            return b + (style == null ? 0 : style.a.hashCode());
        }

        public final String toString() {
            return "Position(type=" + this.a + ", point=" + this.b + ", infoKey=" + this.c + ", style=" + this.d + Extension.C_BRAKE;
        }

        public Position() {
            Type type = Type.UNSUPPORTED;
            zzs zzsVar = zzs.f;
            this.a = type;
            this.b = zzsVar;
            this.c = "";
            this.d = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/RouteInfo$PinIcon;", "Lcom/yandex/go/taxi/order/models/api/objects/e1;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/objects/h1", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class PinIcon extends e1 {
        public static final h1 Companion = new h1();
        public static final i3y[] f = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new apk0(18)), null, null, null};
        public final String a;
        public final List b;
        public final String c;
        public final String d;
        public final ImageIcon e;

        public PinIcon(int i, String str, List list, String str2, String str3, ImageIcon imageIcon) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = EmptyList.a;
            } else {
                this.b = list;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str2;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str3;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = imageIcon;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PinIcon)) {
                return false;
            }
            PinIcon pinIcon = (PinIcon) obj;
            return jl40.l(this.a, pinIcon.a) && jl40.l(this.b, pinIcon.b) && jl40.l(this.c, pinIcon.c) && jl40.l(this.d, pinIcon.d) && jl40.l(this.e, pinIcon.e);
        }

        public final int hashCode() {
            int b = unr0.b(unr0.b(unr0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
            ImageIcon imageIcon = this.e;
            return b + (imageIcon == null ? 0 : imageIcon.hashCode());
        }

        public final String toString() {
            StringBuilder r = xvz.r("PinIcon(text=", this.a, ", zooms=", this.b, ", iconTag=");
            g8e.D(r, this.c, ", backgroundColor=", this.d, ", collapsedIcon=");
            r.append(this.e);
            r.append(Extension.C_BRAKE);
            return r.toString();
        }

        public PinIcon() {
            this.a = "";
            this.b = EmptyList.a;
            this.c = "";
            this.d = "";
            this.e = null;
        }
    }

    public RouteInfo() {
        this.a = 0.0d;
        this.b = 0.0d;
        this.c = 0.0d;
        this.d = EmptyList.a;
        this.e = null;
    }
}
