package com.yandex.go.safety.center.experiment;

import com.yandex.plus.pay.ui.core.mobile.ui.kit.PlusPayUiKitInflaterFactory;
import defpackage.b7l0;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/safety/center/experiment/SafetyCenterWebConfig;", "", "Companion", PlusPayUiKitInflaterFactory.NAME_BUTTON, "$serializer", "com/yandex/go/safety/center/experiment/w", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SafetyCenterWebConfig {
    public static final w Companion = new w();
    public static final i3y[] h;
    public final String a;
    public final List b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;
    public final String g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new b7l0(19)), null, null, null, kotlin.a.b(lazyThreadSafetyMode, new b7l0(20)), null};
    }

    public /* synthetic */ SafetyCenterWebConfig(int i, String str, List list, String str2, String str3, String str4, List list2, String str5) {
        this.a = (i & 1) == 0 ? "" : str;
        int i2 = i & 2;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.b = emptyList;
        } else {
            this.b = list;
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
        if ((i & 32) == 0) {
            this.f = emptyList;
        } else {
            this.f = list2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str5;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/safety/center/experiment/SafetyCenterWebConfig$Button;", "", "Companion", "Type", "$serializer", "com/yandex/go/safety/center/experiment/u", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final /* data */ class Button {
        public static final u Companion = new u();
        public static final i3y[] e = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new b7l0(21)), null, null, null};
        public final Type a;
        public final String b;
        public final String c;
        public final String d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/safety/center/experiment/SafetyCenterWebConfig$Button$Type;", "", "Companion", "com/yandex/go/safety/center/experiment/v", "UNKNOWN", "EMERGENCY", "SUPPORT_CHAT", "SHARE_ROUTE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class Type {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final v Companion;
            public static final Type EMERGENCY;
            public static final Type SHARE_ROUTE;
            public static final Type SUPPORT_CHAT;
            public static final Type UNKNOWN;

            static {
                Type type = new Type("UNKNOWN", 0);
                UNKNOWN = type;
                Type type2 = new Type("EMERGENCY", 1);
                EMERGENCY = type2;
                Type type3 = new Type("SUPPORT_CHAT", 2);
                SUPPORT_CHAT = type3;
                Type type4 = new Type("SHARE_ROUTE", 3);
                SHARE_ROUTE = type4;
                Type[] typeArr = {type, type2, type3, type4};
                $VALUES = typeArr;
                $ENTRIES = kotlin.enums.a.a(typeArr);
                Companion = new v();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new b7l0(22));
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        public /* synthetic */ Button(int i, Type type, String str, String str2, String str3) {
            this.a = (i & 1) == 0 ? Type.UNKNOWN : type;
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
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return this.a == button.a && jl40.l(this.b, button.b) && jl40.l(this.c, button.c) && jl40.l(this.d, button.d);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Button(type=");
            sb.append(this.a);
            sb.append(", title=");
            sb.append(this.b);
            sb.append(", iconTag=");
            return g8e.r(sb, this.c, ", bgColor=", this.d, Extension.C_BRAKE);
        }

        public Button() {
            this.a = Type.UNKNOWN;
            this.b = null;
            this.c = null;
            this.d = null;
        }
    }

    public SafetyCenterWebConfig() {
        this.a = "";
        EmptyList emptyList = EmptyList.a;
        this.b = emptyList;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = emptyList;
        this.g = null;
    }
}
