package xsna;

import java.util.Arrays;
import java.util.List;

/* compiled from: JDK7PlatformImplementations.kt */
/* loaded from: classes11.dex */
public class uwx extends pta0 {

    /* compiled from: JDK7PlatformImplementations.kt */
    /* loaded from: classes8.dex */
    public static final class a {
        public static final Integer a;

        static {
            Integer num;
            Object obj;
            Integer num2 = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            if (obj instanceof Integer) {
                num = (Integer) obj;
                if (num != null && num.intValue() > 0) {
                    num2 = num;
                }
                a = num2;
            }
            num = null;
            if (num != null) {
                num2 = num;
            }
            a = num2;
        }
    }

    @Override // xsna.pta0
    public final void a(Throwable th, Throwable th2) {
        Integer num = a.a;
        if (num == null || num.intValue() >= 19) {
            th.addSuppressed(th2);
        } else {
            super.a(th, th2);
        }
    }

    @Override // xsna.pta0
    public final List<Throwable> b(Throwable th) {
        Integer num = a.a;
        return (num == null || num.intValue() >= 19) ? Arrays.asList(th.getSuppressed()) : super.b(th);
    }
}
