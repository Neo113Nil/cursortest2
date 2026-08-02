package xsna;

import kotlin.NoWhenBranchMatchedException;
import one.video.player.model.HdrType;

/* compiled from: HdrUtils.kt */
/* loaded from: classes8.dex */
public final class svu {

    /* compiled from: HdrUtils.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[hjp0.values().length];
            try {
                iArr[hjp0.PQ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[hjp0.HLG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[hjp0.Unknown.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final HdrType a(hjp0 hjp0Var) {
        int i = a.$EnumSwitchMapping$0[hjp0Var.ordinal()];
        if (i == 1) {
            return HdrType.PQ;
        }
        if (i == 2) {
            return HdrType.HLG;
        }
        if (i == 3) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final a6g b(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 1544) {
            if (hashCode != 1567) {
                if (hashCode == 1569 && str.equals("12")) {
                    return a6g.Depth12;
                }
            } else if (str.equals("10")) {
                return a6g.Depth10;
            }
        } else if (str.equals("08")) {
            return a6g.Depth8;
        }
        return a6g.Unknown;
    }
}
