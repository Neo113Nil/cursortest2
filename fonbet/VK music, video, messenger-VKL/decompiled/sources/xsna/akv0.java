package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.skeleton.SkeletonType;

/* compiled from: VkSkeleton.kt */
/* loaded from: classes17.dex */
public final class akv0 {
    public static final void a(SkeletonType skeletonType, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-391534865);
        if ((i & 6) == 0) {
            i2 = (M.o(skeletonType.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-391534865, i2, -1, "com.vk.core.compose.component.skeleton.VkSkeleton (VkSkeleton.kt:27)");
            }
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new lzl0(skeletonType, 16);
                M.R(x);
            }
            ja8.a(bu00.e(q630Var, (izs) x), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new p6c(skeletonType, q630Var, i, 2);
        }
    }
}
