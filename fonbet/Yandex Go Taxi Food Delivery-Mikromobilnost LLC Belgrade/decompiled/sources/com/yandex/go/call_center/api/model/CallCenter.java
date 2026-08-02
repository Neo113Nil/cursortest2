package com.yandex.go.call_center.api.model;

import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import defpackage.rm6;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/call_center/api/model/CallCenter;", "", "Companion", "Type", "$serializer", "com/yandex/go/call_center/api/model/a", "go-client-android.features.call_center:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CallCenter {
    public static final a Companion = new a();
    public static final i3y[] f = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new rm6(27)), null, null, null, null};
    public final Type a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/call_center/api/model/CallCenter$Type;", "", "Companion", "com/yandex/go/call_center/api/model/b", "LOCAL", "NATIONAL", "go-client-android.features.call_center:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final b Companion;
        public static final Type LOCAL;
        public static final Type NATIONAL;

        static {
            Type type = new Type("LOCAL", 0);
            LOCAL = type;
            Type type2 = new Type("NATIONAL", 1);
            NATIONAL = type2;
            Type[] typeArr = {type, type2};
            $VALUES = typeArr;
            $ENTRIES = kotlin.enums.a.a(typeArr);
            Companion = new b();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new rm6(28));
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public /* synthetic */ CallCenter(int i, Type type, String str, String str2, String str3, String str4) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = type;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getE() {
        return this.e;
    }

    /* renamed from: b, reason: from getter */
    public final String getC() {
        return this.c;
    }

    /* renamed from: c, reason: from getter */
    public final Type getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallCenter)) {
            return false;
        }
        CallCenter callCenter = (CallCenter) obj;
        return this.a == callCenter.a && jl40.l(this.b, callCenter.b) && jl40.l(this.c, callCenter.c) && jl40.l(this.d, callCenter.d) && jl40.l(this.e, callCenter.e);
    }

    public final int hashCode() {
        Type type = this.a;
        int hashCode = (type == null ? 0 : type.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallCenter(type=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", phone=");
        g8e.D(sb, this.c, ", formattedPhone=", this.d, ", country=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }

    public CallCenter() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }
}
