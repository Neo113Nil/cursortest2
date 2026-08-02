package xsna;

import com.ironsource.C4217a2;

/* compiled from: JsLocationDelegate.kt */
/* loaded from: classes6.dex */
public final class c5y {
    public final x6y a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: JsLocationDelegate.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a DISABLED;
        public static final a GRANTED;
        private final String value;

        static {
            a aVar = new a("GRANTED", 0, "granted");
            GRANTED = aVar;
            a aVar2 = new a("DISABLED", 1, C4217a2.e);
            DISABLED = aVar2;
            a[] aVarArr = {aVar, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a(String str, int i, String str2) {
            this.value = str2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final String h() {
            return this.value;
        }
    }

    public c5y(x6y x6yVar) {
        this.a = x6yVar;
    }
}
