package com.yandex.go.taxi.order.models.api.objects;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.nnm;
import defpackage.oj4;
import defpackage.qxz;
import defpackage.unr0;
import defpackage.zzs;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/MapObject;", "", "Companion", "Type", "Style", "AlignType", "$serializer", "com/yandex/go/taxi/order/models/api/objects/w", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class MapObject {
    public static final w Companion = new w();
    public static final i3y[] g;
    public final String a;
    public final Type b;
    public final zzs c;
    public final Style d;
    public final List e;
    public final b0 f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/MapObject$AlignType;", "", "Companion", "com/yandex/go/taxi/order/models/api/objects/v", "BOTTOM", "TOP", "UNSUPPORTED", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class AlignType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ AlignType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final AlignType BOTTOM;
        public static final v Companion;
        public static final AlignType TOP;
        public static final AlignType UNSUPPORTED;

        static {
            AlignType alignType = new AlignType("BOTTOM", 0);
            BOTTOM = alignType;
            AlignType alignType2 = new AlignType("TOP", 1);
            TOP = alignType2;
            AlignType alignType3 = new AlignType("UNSUPPORTED", 2);
            UNSUPPORTED = alignType3;
            AlignType[] alignTypeArr = {alignType, alignType2, alignType3};
            $VALUES = alignTypeArr;
            $ENTRIES = kotlin.enums.a.a(alignTypeArr);
            Companion = new v();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new qxz(13));
        }

        public static AlignType valueOf(String str) {
            return (AlignType) Enum.valueOf(AlignType.class, str);
        }

        public static AlignType[] values() {
            return (AlignType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/MapObject$Type;", "", "Companion", "com/yandex/go/taxi/order/models/api/objects/y", "BUBBLE", "UNSUPPORTED", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final Type BUBBLE;
        public static final y Companion;
        public static final Type UNSUPPORTED;

        static {
            Type type = new Type("BUBBLE", 0);
            BUBBLE = type;
            Type type2 = new Type("UNSUPPORTED", 1);
            UNSUPPORTED = type2;
            Type[] typeArr = {type, type2};
            $VALUES = typeArr;
            $ENTRIES = kotlin.enums.a.a(typeArr);
            Companion = new y();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new qxz(15));
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new qxz(11)), null, null, kotlin.a.b(lazyThreadSafetyMode, new qxz(12)), null};
    }

    public MapObject(int i, String str, Type type, zzs zzsVar, Style style, List list, b0 b0Var) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = Type.UNSUPPORTED;
        } else {
            this.b = type;
        }
        if ((i & 4) == 0) {
            this.c = zzs.f;
        } else {
            this.c = zzsVar;
        }
        if ((i & 8) == 0) {
            Style.Companion.getClass();
            this.d = Style.g;
        } else {
            this.d = style;
        }
        if ((i & 16) == 0) {
            this.e = EmptyList.a;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = b0Var;
        }
    }

    /* renamed from: a, reason: from getter */
    public final b0 getF() {
        return this.f;
    }

    /* renamed from: b, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapObject)) {
            return false;
        }
        MapObject mapObject = (MapObject) obj;
        return jl40.l(this.a, mapObject.a) && this.b == mapObject.b && jl40.l(this.c, mapObject.c) && jl40.l(this.d, mapObject.d) && jl40.l(this.e, mapObject.e) && jl40.l(this.f, mapObject.f);
    }

    public final int hashCode() {
        int c = unr0.c((this.d.hashCode() + nnm.b(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31)) * 31, 31, this.e);
        b0 b0Var = this.f;
        return c + (b0Var == null ? 0 : b0Var.hashCode());
    }

    public final String toString() {
        return "MapObject(id=" + this.a + ", type=" + this.b + ", position=" + this.c + ", style=" + this.d + ", zooms=" + this.e + ", action=" + this.f + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/MapObject$Style;", "", "Companion", "com/yandex/go/taxi/order/models/api/objects/x", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Style {
        public static final x Companion = new x();
        public static final i3y[] f = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new qxz(14)), null, null, null};
        public static final Style g = new Style(0);
        public final String a;
        public final AlignType b;
        public final String c;
        public final String d;
        public final oj4 e;

        public /* synthetic */ Style(int i, String str, AlignType alignType, String str2, String str3, oj4 oj4Var) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = AlignType.UNSUPPORTED;
            } else {
                this.b = alignType;
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
                this.e = oj4Var;
            }
        }

        public Style() {
            this(0);
        }

        public Style(int i) {
            AlignType alignType = AlignType.UNSUPPORTED;
            this.a = "";
            this.b = alignType;
            this.c = "";
            this.d = "";
            this.e = null;
        }
    }

    public MapObject() {
        Type type = Type.UNSUPPORTED;
        zzs zzsVar = zzs.f;
        Style.Companion.getClass();
        Style style = Style.g;
        this.a = "";
        this.b = type;
        this.c = zzsVar;
        this.d = style;
        this.e = EmptyList.a;
        this.f = null;
    }
}
