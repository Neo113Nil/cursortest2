package defpackage;

import android.graphics.Bitmap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public abstract class mw01 {
    public abstract String a();

    public abstract Bitmap b(Bitmap bitmap, xis0 xis0Var);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mw01) && jl40.l(a(), ((mw01) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return unr0.o(qoi0.a(getClass()).d(), "(cacheKey=", a(), Extension.C_BRAKE);
    }
}
