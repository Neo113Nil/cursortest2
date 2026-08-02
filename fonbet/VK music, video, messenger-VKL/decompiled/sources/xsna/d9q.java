package xsna;

import kotlin.NoWhenBranchMatchedException;

/* compiled from: ExpandableTextContent.kt */
/* loaded from: classes18.dex */
public final class d9q {

    /* compiled from: ExpandableTextContent.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ibo0.values().length];
            try {
                iArr[ibo0.SingleLine.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ibo0.Short.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ibo0.Medium.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ibo0.MediumWithLinebreak.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ibo0.EmptyLine.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ibo0.Long.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String a(ibo0 ibo0Var) {
        switch (a.$EnumSwitchMapping$0[ibo0Var.ordinal()]) {
            case 1:
                return "Lorem ipsum dolor sit";
            case 2:
                return "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
            case 3:
                return "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris.";
            case 4:
                return "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\nLorem ipsum dolor sit amet.";
            case 5:
                return "Lorem\n\n\nipsum dolor sit amet";
            case 6:
                return "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
