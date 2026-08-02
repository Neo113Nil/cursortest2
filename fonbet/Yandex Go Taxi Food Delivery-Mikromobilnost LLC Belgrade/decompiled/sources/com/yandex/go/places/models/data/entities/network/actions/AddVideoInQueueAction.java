package com.yandex.go.places.models.data.entities.network.actions;

import defpackage.b64;
import defpackage.c20;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.kr;
import defpackage.qje;
import defpackage.unr0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/places/models/data/entities/network/actions/AddVideoInQueueAction;", "Lkr;", "Companion", "Operation", "$serializer", "com/yandex/go/places/models/data/entities/network/actions/a", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AddVideoInQueueAction extends kr {
    public static final a Companion = new a();
    public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new c20(23))};
    public final String a;
    public final String b;
    public final Operation c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/models/data/entities/network/actions/AddVideoInQueueAction$Operation;", "", "ADD", "REMOVE", "RE_ADD_TO_END", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Operation {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Operation[] $VALUES;
        public static final Operation ADD;
        public static final Operation REMOVE;
        public static final Operation RE_ADD_TO_END;

        static {
            Operation operation = new Operation("ADD", 0);
            ADD = operation;
            Operation operation2 = new Operation("REMOVE", 1);
            REMOVE = operation2;
            Operation operation3 = new Operation("RE_ADD_TO_END", 2);
            RE_ADD_TO_END = operation3;
            Operation[] operationArr = {operation, operation2, operation3};
            $VALUES = operationArr;
            $ENTRIES = kotlin.enums.a.a(operationArr);
        }

        public static Operation valueOf(String str) {
            return (Operation) Enum.valueOf(Operation.class, str);
        }

        public static Operation[] values() {
            return (Operation[]) $VALUES.clone();
        }
    }

    public /* synthetic */ AddVideoInQueueAction(int i, String str, String str2, Operation operation) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, AddVideoInQueueAction$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = operation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddVideoInQueueAction)) {
            return false;
        }
        AddVideoInQueueAction addVideoInQueueAction = (AddVideoInQueueAction) obj;
        return jl40.l(this.a, addVideoInQueueAction.a) && jl40.l(this.b, addVideoInQueueAction.b) && this.c == addVideoInQueueAction.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = b64.v("AddVideoInQueueAction(variableName=", this.a, ", videoId=", this.b, ", operation=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
