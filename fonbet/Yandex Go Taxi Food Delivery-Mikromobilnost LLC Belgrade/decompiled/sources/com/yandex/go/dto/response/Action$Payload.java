package com.yandex.go.dto.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jn;
import defpackage.jsq0;
import defpackage.k4o;
import defpackage.ksq0;
import defpackage.lq;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/dto/response/Action$Payload", "", "Companion", "Mode", "ObjectType", "$serializer", "com/yandex/go/dto/response/j0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Action$Payload {
    public static final j0 Companion = new j0();
    public static final i3y[] c;
    public final Mode a;
    public final jsq0 b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/dto/response/Action$Payload$Mode;", "", "Companion", "com/yandex/go/dto/response/k0", "ALL_OBJECT_TYPES", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes.dex */
    public static final class Mode {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final Mode ALL_OBJECT_TYPES;
        public static final k0 Companion;

        static {
            Mode mode = new Mode("ALL_OBJECT_TYPES", 0);
            ALL_OBJECT_TYPES = mode;
            Mode[] modeArr = {mode};
            $VALUES = modeArr;
            $ENTRIES = kotlin.enums.a.a(modeArr);
            Companion = new k0();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jn(16));
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/dto/response/Action$Payload$ObjectType;", "", "Companion", "com/yandex/go/dto/response/l0", "SHUTTLE_ROUTE", "UNKNOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes.dex */
    public static final class ObjectType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ObjectType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final l0 Companion;
        public static final ObjectType SHUTTLE_ROUTE;
        public static final ObjectType UNKNOWN;

        static {
            ObjectType objectType = new ObjectType("SHUTTLE_ROUTE", 0);
            SHUTTLE_ROUTE = objectType;
            ObjectType objectType2 = new ObjectType("UNKNOWN", 1);
            UNKNOWN = objectType2;
            ObjectType[] objectTypeArr = {objectType, objectType2};
            $VALUES = objectTypeArr;
            $ENTRIES = kotlin.enums.a.a(objectTypeArr);
            Companion = new l0();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jn(17));
        }

        public static ObjectType valueOf(String str) {
            return (ObjectType) Enum.valueOf(ObjectType.class, str);
        }

        public static ObjectType[] values() {
            return (ObjectType[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new lq(0)), kotlin.a.b(lazyThreadSafetyMode, new lq(1))};
    }

    public /* synthetic */ Action$Payload(int i, Mode mode, jsq0 jsq0Var) {
        this.a = (i & 1) == 0 ? Mode.ALL_OBJECT_TYPES : mode;
        if ((i & 2) == 0) {
            this.b = ksq0.a;
        } else {
            this.b = jsq0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Action$Payload)) {
            return false;
        }
        Action$Payload action$Payload = (Action$Payload) obj;
        return this.a == action$Payload.a && jl40.l(this.b, action$Payload.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Payload(mode=" + this.a + ", objectTypes=" + this.b + Extension.C_BRAKE;
    }

    public Action$Payload() {
        this(0);
    }

    public Action$Payload(int i) {
        Mode mode = Mode.ALL_OBJECT_TYPES;
        jsq0 jsq0Var = ksq0.a;
        this.a = mode;
        this.b = jsq0Var;
    }
}
