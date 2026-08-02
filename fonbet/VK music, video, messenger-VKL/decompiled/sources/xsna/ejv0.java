package xsna;

import com.vk.core.compose.component.defaults.SegmentSize;
import xsna.q630;

/* compiled from: VkSegmentedControl.kt */
/* loaded from: classes17.dex */
public final class ejv0 {
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(q630 q630Var, Integer num, boolean z, SegmentSize segmentSize, jai jaiVar, androidx.compose.runtime.a aVar, int i, int i2) {
        q630 q630Var2;
        int i3;
        boolean z2;
        int i4;
        Object obj;
        SegmentSize segmentSize2;
        q630 q630Var3;
        boolean z3;
        androidx.compose.runtime.f s;
        int i5;
        androidx.compose.runtime.a M = aVar.M(-1757691790);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            q630Var2 = q630Var;
        } else if ((i & 6) == 0) {
            q630Var2 = q630Var;
            i3 = (M.J(q630Var2) ? 4 : 2) | i;
        } else {
            q630Var2 = q630Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.J(num) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            z2 = z;
            i3 |= M.l(z2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= M.o(segmentSize == null ? -1 : segmentSize.ordinal()) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                obj = jaiVar;
                i3 |= M.y(obj) ? 16384 : 8192;
            } else {
                obj = jaiVar;
            }
            if (M.t(i3 & 1, (i3 & 9363) == 9362)) {
                M.h();
                segmentSize2 = segmentSize;
                q630Var3 = q630Var2;
                z3 = z2;
            } else {
                if (i6 != 0) {
                    q630Var3 = q630.a.a;
                    i5 = i4;
                } else {
                    i5 = i4;
                    q630Var3 = q630Var2;
                }
                boolean z4 = i7 == 0 ? z2 : true;
                SegmentSize segmentSize3 = i5 != 0 ? SegmentSize.Medium : segmentSize;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1757691790, i3, -1, "com.vk.core.compose.component.VkSegmentedControl (VkSegmentedControl.kt:81)");
                }
                rvi.b(new c9e0[]{bjv0.a.b(Boolean.valueOf(z4)), bjv0.b.b(segmentSize3)}, kai.c(2032325938, new u1f0(q630Var3, bjv0.a(), obj, num, 1), M), M, 56);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                segmentSize2 = segmentSize3;
                z3 = z4;
            }
            s = M.s();
            if (s == null) {
                s.d = new fvn0(q630Var3, num, z3, segmentSize2, jaiVar, i, i2);
                return;
            }
            return;
        }
        z2 = z;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        if ((i & 24576) != 0) {
        }
        if (M.t(i3 & 1, (i3 & 9363) == 9362)) {
        }
        s = M.s();
        if (s == null) {
        }
    }
}
