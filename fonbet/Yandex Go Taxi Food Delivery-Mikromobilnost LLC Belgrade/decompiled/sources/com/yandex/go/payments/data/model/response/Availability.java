package com.yandex.go.payments.data.model.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.ly3;
import defpackage.p73;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments/data/model/response/Availability;", "", "Companion", "com/yandex/go/payments/data/model/response/l", "Action", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Availability {
    public static final l Companion = new l();
    public static final Availability d = new Availability(0);
    public final boolean a;
    public final String b;
    public final Action c;

    public /* synthetic */ Availability(int i, boolean z, String str, Action action) {
        this.a = (i & 1) == 0 ? true : z;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = action;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Availability)) {
            return false;
        }
        Availability availability = (Availability) obj;
        return this.a == availability.a && jl40.l(this.b, availability.b) && jl40.l(this.c, availability.c);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Action action = this.c;
        return hashCode2 + (action != null ? action.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = ly3.v("Availability(isAvailable=", ", disabledReason=", this.b, ", action=", this.a);
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments/data/model/response/Availability$Action;", "", "Companion", "Type", "$serializer", "com/yandex/go/payments/data/model/response/j", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Action {
        public static final j Companion = new j();
        public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new p73(19))};
        public final String a;
        public final Type b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments/data/model/response/Availability$Action$Type;", "", "Companion", "com/yandex/go/payments/data/model/response/k", "BUY_PLUS", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        /* loaded from: classes14.dex */
        public static final class Type {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final Type BUY_PLUS;
            public static final k Companion;
            public static final Type UNKNOWN;

            static {
                Type type = new Type("BUY_PLUS", 0);
                BUY_PLUS = type;
                Type type2 = new Type("UNKNOWN", 1);
                UNKNOWN = type2;
                Type[] typeArr = {type, type2};
                $VALUES = typeArr;
                $ENTRIES = kotlin.enums.a.a(typeArr);
                Companion = new k();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new p73(20));
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        public /* synthetic */ Action(int i, String str, Type type) {
            this.a = (i & 1) == 0 ? null : str;
            if ((i & 2) == 0) {
                this.b = Type.UNKNOWN;
            } else {
                this.b = type;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action)) {
                return false;
            }
            Action action = (Action) obj;
            return jl40.l(this.a, action.a) && this.b == action.b;
        }

        public final int hashCode() {
            String str = this.a;
            return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return "Action(text=" + this.a + ", type=" + this.b + Extension.C_BRAKE;
        }

        public Action() {
            Type type = Type.UNKNOWN;
            this.a = null;
            this.b = type;
        }
    }

    public Availability(int i) {
        this.a = true;
        this.b = null;
        this.c = null;
    }

    public Availability() {
        this(0);
    }
}
