package yads;

import java.util.Comparator;

/* loaded from: classes10.dex */
public final class fy extends hy {
    @Override // yads.hy
    public final int a() {
        return 0;
    }

    @Override // yads.hy
    public final hy b(boolean z, boolean z2) {
        return a(lq.a(z2, z));
    }

    public static hy a(int i) {
        return i < 0 ? hy.b : i > 0 ? hy.c : hy.a;
    }

    @Override // yads.hy
    public final hy a(int i, int i2) {
        return a(i < i2 ? -1 : i > i2 ? 1 : 0);
    }

    @Override // yads.hy
    public final hy a(Object obj, Object obj2, Comparator comparator) {
        return a(comparator.compare(obj, obj2));
    }

    @Override // yads.hy
    public final hy a(boolean z, boolean z2) {
        return a(lq.a(z, z2));
    }
}
