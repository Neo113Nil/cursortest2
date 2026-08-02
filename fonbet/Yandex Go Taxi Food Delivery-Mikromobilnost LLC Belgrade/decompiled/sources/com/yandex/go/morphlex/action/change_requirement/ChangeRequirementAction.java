package com.yandex.go.morphlex.action.change_requirement;

import com.yandex.go.sql.BaseDatabaseHelper;
import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jc9;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.kr;
import defpackage.oyr;
import defpackage.qje;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/morphlex/action/change_requirement/ChangeRequirementAction;", "Lkr;", "Companion", "Operation", "ValueType", "$serializer", "com/yandex/go/morphlex/action/change_requirement/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChangeRequirementAction extends kr {
    public static final a Companion = new a();
    public static final i3y[] h;
    public final String a;
    public final String b;
    public final Operation c;
    public final ValueType d;
    public final Boolean e;
    public final Integer f;
    public final String g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/morphlex/action/change_requirement/ChangeRequirementAction$Operation;", "", "Companion", "com/yandex/go/morphlex/action/change_requirement/b", "SET", "REMOVE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Operation {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Operation[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final b Companion;
        public static final Operation REMOVE;
        public static final Operation SET;

        static {
            Operation operation = new Operation("SET", 0);
            SET = operation;
            Operation operation2 = new Operation("REMOVE", 1);
            REMOVE = operation2;
            Operation[] operationArr = {operation, operation2};
            $VALUES = operationArr;
            $ENTRIES = kotlin.enums.a.a(operationArr);
            Companion = new b();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jc9(11));
        }

        public static Operation valueOf(String str) {
            return (Operation) Enum.valueOf(Operation.class, str);
        }

        public static Operation[] values() {
            return (Operation[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/morphlex/action/change_requirement/ChangeRequirementAction$ValueType;", "", "Companion", "com/yandex/go/morphlex/action/change_requirement/c", "BOOLEAN", BaseDatabaseHelper.TYPE_INTEGER, "STRING", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ValueType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ValueType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final ValueType BOOLEAN;
        public static final c Companion;
        public static final ValueType INTEGER;
        public static final ValueType STRING;

        static {
            ValueType valueType = new ValueType("BOOLEAN", 0);
            BOOLEAN = valueType;
            ValueType valueType2 = new ValueType(BaseDatabaseHelper.TYPE_INTEGER, 1);
            INTEGER = valueType2;
            ValueType valueType3 = new ValueType("STRING", 2);
            STRING = valueType3;
            ValueType[] valueTypeArr = {valueType, valueType2, valueType3};
            $VALUES = valueTypeArr;
            $ENTRIES = kotlin.enums.a.a(valueTypeArr);
            Companion = new c();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jc9(12));
        }

        public static ValueType valueOf(String str) {
            return (ValueType) Enum.valueOf(ValueType.class, str);
        }

        public static ValueType[] values() {
            return (ValueType[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{null, null, kotlin.a.b(lazyThreadSafetyMode, new jc9(9)), kotlin.a.b(lazyThreadSafetyMode, new jc9(10)), null, null, null};
    }

    public /* synthetic */ ChangeRequirementAction(int i, String str, String str2, Operation operation, ValueType valueType, Boolean bool, Integer num, String str3) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, ChangeRequirementAction$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = operation;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = valueType;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bool;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeRequirementAction)) {
            return false;
        }
        ChangeRequirementAction changeRequirementAction = (ChangeRequirementAction) obj;
        return jl40.l(this.a, changeRequirementAction.a) && jl40.l(this.b, changeRequirementAction.b) && this.c == changeRequirementAction.c && this.d == changeRequirementAction.d && jl40.l(this.e, changeRequirementAction.e) && jl40.l(this.f, changeRequirementAction.f) && jl40.l(this.g, changeRequirementAction.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Operation operation = this.c;
        int hashCode3 = (hashCode2 + (operation == null ? 0 : operation.hashCode())) * 31;
        ValueType valueType = this.d;
        int hashCode4 = (hashCode3 + (valueType == null ? 0 : valueType.hashCode())) * 31;
        Boolean bool = this.e;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.f;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.g;
        return hashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("ChangeRequirementAction(requirementName=", this.a, ", targetTariffClass=", this.b, ", operation=");
        v.append(this.c);
        v.append(", valueType=");
        v.append(this.d);
        v.append(", booleanValue=");
        v.append(this.e);
        v.append(", integerValue=");
        v.append(this.f);
        v.append(", stringValue=");
        return oyr.t(v, this.g, Extension.C_BRAKE);
    }
}
