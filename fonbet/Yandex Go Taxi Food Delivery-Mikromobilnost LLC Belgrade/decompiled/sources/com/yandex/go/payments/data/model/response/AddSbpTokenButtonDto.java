package com.yandex.go.payments.data.model.response;

import defpackage.ar;
import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.unr0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments/data/model/response/AddSbpTokenButtonDto;", "", "Companion", "StateType", "$serializer", "com/yandex/go/payments/data/model/response/g", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class AddSbpTokenButtonDto {
    public static final g Companion = new g();
    public static final i3y[] e = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ar(21))};
    public final String a;
    public final String b;
    public final String c;
    public final StateType d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/payments/data/model/response/AddSbpTokenButtonDto$StateType;", "", "Companion", "com/yandex/go/payments/data/model/response/h", "ENABLED", "BUSY", "DISABLED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class StateType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ StateType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final StateType BUSY;
        public static final h Companion;
        public static final StateType DISABLED;
        public static final StateType ENABLED;

        static {
            StateType stateType = new StateType("ENABLED", 0);
            ENABLED = stateType;
            StateType stateType2 = new StateType("BUSY", 1);
            BUSY = stateType2;
            StateType stateType3 = new StateType("DISABLED", 2);
            DISABLED = stateType3;
            StateType[] stateTypeArr = {stateType, stateType2, stateType3};
            $VALUES = stateTypeArr;
            $ENTRIES = kotlin.enums.a.a(stateTypeArr);
            Companion = new h();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ar(22));
        }

        public static StateType valueOf(String str) {
            return (StateType) Enum.valueOf(StateType.class, str);
        }

        public static StateType[] values() {
            return (StateType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ AddSbpTokenButtonDto(int i, String str, String str2, String str3, StateType stateType) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = StateType.DISABLED;
        } else {
            this.d = stateType;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddSbpTokenButtonDto)) {
            return false;
        }
        AddSbpTokenButtonDto addSbpTokenButtonDto = (AddSbpTokenButtonDto) obj;
        return jl40.l(this.a, addSbpTokenButtonDto.a) && jl40.l(this.b, addSbpTokenButtonDto.b) && jl40.l(this.c, addSbpTokenButtonDto.c) && this.d == addSbpTokenButtonDto.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder v = b64.v("AddSbpTokenButtonDto(title=", this.a, ", subtitle=", this.b, ", iconTag=");
        v.append(this.c);
        v.append(", type=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public AddSbpTokenButtonDto() {
        StateType stateType = StateType.DISABLED;
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = stateType;
    }
}
