package xsna;

import com.ironsource.X3;
import kotlinx.serialization.descriptors.SerialDescriptor;
import xsna.prm0;

/* compiled from: JsonPath.kt */
/* loaded from: classes8.dex */
public final class gay {
    public Object[] a;
    public int[] b;
    public int c;

    /* compiled from: JsonPath.kt */
    public static final class a {
        public static final a a = new a();
    }

    public final String a() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.c + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = this.a[i2];
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                if (!epx.f(serialDescriptor.getKind(), prm0.b.a)) {
                    int i3 = this.b[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(serialDescriptor.d(i3));
                    }
                } else if (this.b[i2] != -1) {
                    sb.append(X3.j.d);
                    sb.append(this.b[i2]);
                    sb.append(X3.j.e);
                }
            } else if (obj != a.a) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    public final String toString() {
        return a();
    }
}
