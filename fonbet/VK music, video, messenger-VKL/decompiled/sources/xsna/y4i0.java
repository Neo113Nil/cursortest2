package xsna;

import xsna.q630;

/* compiled from: VkSegmentedControl.kt */
/* loaded from: classes17.dex */
public abstract class y4i0 {
    public abstract void a(q630 q630Var, boolean z, gzs<s3q0> gzsVar, zzs<? super qa8, ? super Boolean, ? super androidx.compose.runtime.a, ? super Integer, s3q0> zzsVar, androidx.compose.runtime.a aVar, int i);

    public final void b(final int i, androidx.compose.runtime.a aVar, final String str, final gzs gzsVar, q630 q630Var, final lg90 lg90Var, final boolean z) {
        int i2;
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(2114745929);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= M.J(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= (32768 & i) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i3 & 1, (74899 & i3) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2114745929, i3, -1, "com.vk.core.compose.component.SegmentControlScope.VkSegment (VkSegmentedControl.kt:196)");
            }
            int i4 = i3 << 3;
            q630.a aVar2 = q630.a.a;
            a(aVar2, z, gzsVar, kai.c(1361819002, new zzs() { // from class: xsna.v4i0
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    ((Boolean) obj2).getClass();
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if (aVar3.t(intValue & 1, (intValue & 129) != 128)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1361819002, intValue, -1, "com.vk.core.compose.component.SegmentControlScope.VkSegment.<anonymous> (VkSegmentedControl.kt:202)");
                        }
                        veu0.a(z, null, str, lg90Var, aVar3, 4096);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), M, ((i3 >> 6) & 14) | 3072 | (i4 & 112) | (i4 & 896) | ((i3 >> 3) & 57344));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.w4i0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    y4i0.this.b(I, (androidx.compose.runtime.a) obj, str, gzsVar, q630Var2, lg90Var, z);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(final boolean z, final gzs<s3q0> gzsVar, final zzs<? super qa8, ? super Boolean, ? super androidx.compose.runtime.a, ? super Integer, s3q0> zzsVar, q630 q630Var, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        final q630 q630Var3;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(1633629306);
        if ((i & 6) == 0) {
            i3 = (M.l(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.y(gzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.y(zzsVar) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 2048 : 1024;
            if ((i & 24576) == 0) {
                i3 |= M.J(this) ? 16384 : 8192;
            }
            if (M.t(i3 & 1, (i3 & 9363) == 9362)) {
                M.h();
                q630Var3 = q630Var2;
            } else {
                q630 q630Var4 = i4 != 0 ? q630.a.a : q630Var2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1633629306, i3, -1, "com.vk.core.compose.component.SegmentControlScope.VkSegment (VkSegmentedControl.kt:180)");
                }
                int i5 = i3 << 3;
                a(q630Var4, z, gzsVar, zzsVar, M, ((i3 >> 9) & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i3 & 57344));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630Var3 = q630Var4;
            }
            s = M.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.x4i0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        y4i0.this.c(z, gzsVar, zzsVar, q630Var3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        q630Var2 = q630Var;
        if ((i & 24576) == 0) {
        }
        if (M.t(i3 & 1, (i3 & 9363) == 9362)) {
        }
        s = M.s();
        if (s == null) {
        }
    }
}
