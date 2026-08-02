package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: GooglePayConstants.kt */
/* loaded from: classes6.dex */
public final class y9u {
    public static final List<String> a = e43.l("PAN_ONLY", "CRYPTOGRAM_3DS");
    public static final ArrayList b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GooglePayConstants.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a DISCOVER;
        public static final a JCB;
        public static final a MASTERCARD;
        public static final a VISA;

        static {
            a aVar = new a("MASTERCARD", 0);
            MASTERCARD = aVar;
            a aVar2 = new a("VISA", 1);
            VISA = aVar2;
            a aVar3 = new a("JCB", 2);
            JCB = aVar3;
            a aVar4 = new a("DISCOVER", 3);
            DISCOVER = aVar4;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    static {
        a[] values = a.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (a aVar : values) {
            arrayList.add(aVar.name());
        }
        b = arrayList;
    }
}
