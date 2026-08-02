package xsna;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* compiled from: SDKSyncStoragesAction.kt */
/* loaded from: classes11.dex */
public final class ayg0 implements pon0 {

    /* compiled from: Comparisons.kt */
    /* loaded from: classes6.dex */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Integer.valueOf(((hp) t2).g), Integer.valueOf(((hp) t).g));
        }
    }

    @Override // xsna.pon0
    public final void a(List<hp> list) {
        ArrayList b = gn00.b(j5g.D0(new a(), list));
        int i = k6r0.a;
        h7r0 h7r0Var = (h7r0) j5g.a0(b);
        h7r0Var.getClass();
        new com.vk.api.sdk.auth.a(h7r0Var.c, h7r0Var.d, h7r0Var.f, h7r0Var.e, h7r0Var.a, h7r0Var.b);
        throw null;
    }
}
