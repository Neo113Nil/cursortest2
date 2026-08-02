package com.yandex.go.loyalty.api.data.model.common;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.z2c;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/loyalty/api/data/model/common/ColorSettings;", "", "Companion", "Type", "com/yandex/go/loyalty/api/data/model/common/b", "$serializer", "go-client-android.features.loyalty:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ColorSettings {
    public static final b Companion = new b();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z2c(6)), null};
    public static final ColorSettings d = new ColorSettings(0);
    public final Type a;
    public final LinearColorSettings b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/loyalty/api/data/model/common/ColorSettings$Type;", "", "Companion", "com/yandex/go/loyalty/api/data/model/common/c", "LINEAR", "RADIAL", "TRANSPARENT", "go-client-android.features.loyalty:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final c Companion;
        public static final Type LINEAR;
        public static final Type RADIAL;
        public static final Type TRANSPARENT;

        static {
            Type type = new Type("LINEAR", 0);
            LINEAR = type;
            Type type2 = new Type("RADIAL", 1);
            RADIAL = type2;
            Type type3 = new Type("TRANSPARENT", 2);
            TRANSPARENT = type3;
            Type[] typeArr = {type, type2, type3};
            $VALUES = typeArr;
            $ENTRIES = kotlin.enums.a.a(typeArr);
            Companion = new c();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z2c(7));
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public /* synthetic */ ColorSettings(int i, Type type, LinearColorSettings linearColorSettings) {
        this.a = (i & 1) == 0 ? Type.TRANSPARENT : type;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = linearColorSettings;
        }
    }

    /* renamed from: a, reason: from getter */
    public final LinearColorSettings getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final Type getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColorSettings)) {
            return false;
        }
        ColorSettings colorSettings = (ColorSettings) obj;
        return this.a == colorSettings.a && jl40.l(this.b, colorSettings.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        LinearColorSettings linearColorSettings = this.b;
        return hashCode + (linearColorSettings == null ? 0 : linearColorSettings.hashCode());
    }

    public final String toString() {
        return "ColorSettings(type=" + this.a + ", linear=" + this.b + Extension.C_BRAKE;
    }

    public ColorSettings() {
        this(0);
    }

    public ColorSettings(int i) {
        this.a = Type.TRANSPARENT;
        this.b = null;
    }
}
