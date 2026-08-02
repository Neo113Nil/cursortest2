package defpackage;

import java.util.Comparator;

/* loaded from: classes11.dex */
public final class hvc extends jvc {
    public static jvc f(int i) {
        return i < 0 ? jvc.b : i > 0 ? jvc.c : jvc.a;
    }

    @Override // defpackage.jvc
    public final jvc a(int i, int i2) {
        return f(Integer.compare(i, i2));
    }

    @Override // defpackage.jvc
    public final jvc b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // defpackage.jvc
    public final jvc c(boolean z, boolean z2) {
        return f(Boolean.compare(z, z2));
    }

    @Override // defpackage.jvc
    public final jvc d(boolean z, boolean z2) {
        return f(Boolean.compare(z2, z));
    }

    @Override // defpackage.jvc
    public final int e() {
        return 0;
    }
}
