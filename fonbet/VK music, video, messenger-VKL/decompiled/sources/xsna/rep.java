package xsna;

import com.vk.core.compose.component.image.badge.BadgeAlignment;
import xsna.iy5;

/* compiled from: EmptyBadge.kt */
/* loaded from: classes17.dex */
public final class rep implements iy5 {
    public static final rep a = new rep();
    public static final BadgeAlignment b = BadgeAlignment.BottomRight;

    @Override // xsna.m2k0
    public final long a(long j, boolean z, androidx.compose.runtime.a aVar, int i) {
        aVar.K(-283072243);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-283072243, i, -1, "com.vk.core.compose.component.image.badge.EmptyBadge.calculatePosition (EmptyBadge.kt:18)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return 0L;
    }

    @Override // xsna.m2k0
    public final r5j0 b(long j, boolean z, androidx.compose.runtime.a aVar, int i) {
        iy5.a.e(i, aVar);
        return null;
    }

    @Override // xsna.m2k0
    public final void c(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1563142761);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1563142761, i, -1, "com.vk.core.compose.component.image.badge.EmptyBadge.invoke (EmptyBadge.kt:13)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new m9c(this, q630Var, i, 4);
        }
    }

    @Override // xsna.m2k0
    public final long d(long j) {
        return 0L;
    }

    @Override // xsna.iy5
    public final long e(float f, long j) {
        return iy5.a.a(this, j, f);
    }

    @Override // xsna.iy5
    public final long f(int i, long j, androidx.compose.runtime.a aVar) {
        return iy5.a.c(this, j, aVar, i);
    }

    @Override // xsna.iy5
    public final long g(int i, long j, androidx.compose.runtime.a aVar) {
        return iy5.a.d(this, j, aVar, i);
    }

    @Override // xsna.m2k0
    public final BadgeAlignment getAlignment() {
        return b;
    }
}
