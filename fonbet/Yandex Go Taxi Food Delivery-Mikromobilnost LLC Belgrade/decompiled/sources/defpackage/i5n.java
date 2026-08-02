package defpackage;

import android.os.Build;
import java.lang.reflect.Method;

/* loaded from: classes11.dex */
public final class i5n implements j5n {
    public Long a;

    @Override // defpackage.j5n
    public final boolean isSupported() {
        if (this.a == null) {
            try {
                Method declaredMethod = Build.class.getDeclaredMethod("getLong", String.class);
                declaredMethod.setAccessible(true);
                Long l = (Long) declaredMethod.invoke(null, "ro.build.version.oneui");
                l.longValue();
                this.a = l;
            } catch (Exception unused) {
                this.a = -1L;
            }
        }
        return this.a.longValue() >= 40100;
    }
}
