package xsna;

import com.vk.dto.common.Direction;
import com.vk.dto.messages.MsgIdType;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: MsgHistoryValidation.kt */
/* loaded from: classes2.dex */
public final class dk30 {

    /* compiled from: MsgHistoryValidation.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.BEFORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.AFTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MsgIdType.values().length];
            try {
                iArr2[MsgIdType.LOCAL_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[MsgIdType.CNV_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final boolean a(gj30 gj30Var, rj30 rj30Var) {
        boolean z;
        boolean m = gj30Var.m();
        boolean z2 = gj30Var.isEmpty() && gj30Var.o();
        int i = a.$EnumSwitchMapping$1[rj30Var.b.ordinal()];
        if (i == 1) {
            z = true;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            z = gj30Var.s(rj30Var.c);
        }
        return !m && (z2 || z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        if (r4.c != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        if (r4.e != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        r4 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean b(gj30 gj30Var, vj30 vj30Var) {
        boolean z;
        boolean m = gj30Var.m();
        int i = a.$EnumSwitchMapping$0[vj30Var.d.ordinal()];
        if (i == 1) {
            if (gj30Var.size() < 2) {
            }
            z = true;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (gj30Var.size() < 2) {
            }
            z = true;
        }
        return !m && z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        if (r4.c != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        if (r4.e != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        r4 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean c(gj30 gj30Var, wj30 wj30Var) {
        boolean z;
        boolean m = gj30Var.m();
        int i = a.$EnumSwitchMapping$0[wj30Var.c.ordinal()];
        if (i == 1) {
            if (gj30Var.size() < 2) {
            }
            z = true;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (gj30Var.size() < 2) {
            }
            z = true;
        }
        return !m && z;
    }
}
