package xsna;

import android.graphics.Typeface;

/* compiled from: FontSynthesis.android.kt */
/* loaded from: classes11.dex */
public final class w5s {
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(int i, Object obj, n4s n4sVar, b6s b6sVar, int i2) {
        boolean z;
        boolean z2;
        if (!(obj instanceof Typeface)) {
            return obj;
        }
        boolean z3 = false;
        if ((i & 1) != 0 && !epx.f(n4sVar.b(), b6sVar)) {
            b6s b6sVar2 = b6s.e;
            if (b6sVar.compareTo(b6sVar2) >= 0 && epx.g(n4sVar.b().b, b6sVar2.b) < 0) {
                z = true;
                z2 = (i & 2) == 0 && i2 != n4sVar.c();
                if (z2 && !z) {
                    return obj;
                }
                int i3 = !z ? b6sVar.b : n4sVar.b().b;
                if (z2 ? n4sVar.c() == 1 : i2 == 1) {
                    z3 = true;
                }
                return Typeface.create((Typeface) obj, i3, z3);
            }
        }
        z = false;
        if ((i & 2) == 0) {
        }
        if (z2) {
        }
        if (!z) {
        }
        if (z2) {
            z3 = true;
            return Typeface.create((Typeface) obj, i3, z3);
        }
        z3 = true;
        return Typeface.create((Typeface) obj, i3, z3);
    }
}
