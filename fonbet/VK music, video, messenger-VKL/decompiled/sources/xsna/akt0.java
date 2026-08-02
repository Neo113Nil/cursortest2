package xsna;

/* compiled from: VideoTimeCodeDecoder.kt */
/* loaded from: classes14.dex */
public final class akt0 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoTimeCodeDecoder.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a HOURS;
        public static final a MINUTES;
        public static final a SECONDS;
        private final char queryParamName;

        static {
            a aVar = new a("SECONDS", 0, 's');
            SECONDS = aVar;
            a aVar2 = new a("MINUTES", 1, 'm');
            MINUTES = aVar2;
            a aVar3 = new a("HOURS", 2, 'h');
            HOURS = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a(String str, int i, char c) {
            this.queryParamName = c;
        }

        public static zrp<a> h() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final char i() {
            return this.queryParamName;
        }
    }
}
