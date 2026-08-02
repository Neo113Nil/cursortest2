package one.video.exo.error;

import xsna.asp;
import xsna.vw3;
import xsna.ww3;
import xsna.zrp;

/* compiled from: ErrorAssertion.kt */
/* loaded from: classes8.dex */
public final class ErrorAssertion {
    public static final vw3 a = ww3.a("ExoErrors");

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ErrorAssertion.kt */
    public static final class AssertionType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AssertionType[] $VALUES;
        public static final AssertionType ERROR_TYPE_IS_NOT_RESOLVED;
        public static final AssertionType INVALID_EXCEPTION_CLASS;

        static {
            AssertionType assertionType = new AssertionType("INVALID_EXCEPTION_CLASS", 0);
            INVALID_EXCEPTION_CLASS = assertionType;
            AssertionType assertionType2 = new AssertionType("ERROR_TYPE_IS_NOT_RESOLVED", 1);
            ERROR_TYPE_IS_NOT_RESOLVED = assertionType2;
            AssertionType[] assertionTypeArr = {assertionType, assertionType2};
            $VALUES = assertionTypeArr;
            $ENTRIES = new asp(assertionTypeArr);
        }

        public AssertionType() {
            throw null;
        }

        public static AssertionType valueOf(String str) {
            return (AssertionType) Enum.valueOf(AssertionType.class, str);
        }

        public static AssertionType[] values() {
            return (AssertionType[]) $VALUES.clone();
        }
    }
}
