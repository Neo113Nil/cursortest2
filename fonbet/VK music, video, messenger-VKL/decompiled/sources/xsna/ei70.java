package xsna;

/* compiled from: NotificationUserStackContent.kt */
/* loaded from: classes4.dex */
public final class ei70 implements wq5<String> {
    public static final ei70 b = new ei70();

    @Override // xsna.wq5
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void e(String str, final yzs<? super lg90, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1233291597);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(yzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1233291597, i2, -1, "com.vk.notifications.design.compose.list.common.NotificationUserStackContent.<anonymous>.<anonymous>.<anonymous>.<no name provided>.Content (NotificationUserStackContent.kt:32)");
            }
            fwu0.c(null, null, str, null, null, null, null, kai.c(1046515844, new a0t() { // from class: xsna.di70
                @Override // xsna.a0t
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    lg90 lg90Var = (lg90) obj3;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj4;
                    int intValue = ((Integer) obj5).intValue();
                    if ((intValue & 384) == 0) {
                        intValue |= (intValue & 512) == 0 ? aVar2.J(lg90Var) : aVar2.y(lg90Var) ? 256 : 128;
                    }
                    if (aVar2.t(intValue & 1, (intValue & 1153) != 1152)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1046515844, intValue, -1, "com.vk.notifications.design.compose.list.common.NotificationUserStackContent.<anonymous>.<anonymous>.<anonymous>.<no name provided>.Content.<anonymous> (NotificationUserStackContent.kt:33)");
                        }
                        if (as.a(((intValue >> 6) & 14) | 8, yzs.this, lg90Var, aVar2)) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, ((i2 << 6) & 896) | 100663296, 251);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new c3(this, str, yzsVar, i);
        }
    }
}
