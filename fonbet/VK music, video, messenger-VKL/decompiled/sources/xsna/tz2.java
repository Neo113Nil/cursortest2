package xsna;

import java.util.List;
import kotlin.Lazy;

/* compiled from: ApiObsoleteEventStrategy.kt */
/* loaded from: classes11.dex */
public final class tz2 implements lr70 {
    public static final a d = new a(0, 0);
    public final bpn0 a;
    public final int b = 2;
    public final bpn0 c = new bpn0(new sz2(this, 0));

    /* compiled from: ApiObsoleteEventStrategy.kt */
    public static final class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* compiled from: ApiObsoleteEventStrategy.kt */
    public static final class b {
        public static final a a(String str) {
            List c0 = drm0.c0(str, new String[]{"."}, 0, 6);
            if (c0.size() == 2) {
                try {
                    return new a(Integer.parseInt((String) c0.get(0)), Integer.parseInt((String) c0.get(1)));
                } catch (NumberFormatException unused) {
                }
            }
            return tz2.d;
        }
    }

    public tz2(bpn0 bpn0Var) {
        this.a = bpn0Var;
    }

    @Override // xsna.lr70
    public final Lazy<String> a() {
        return this.a;
    }

    @Override // xsna.lr70
    public final boolean b(String str) {
        a a2 = b.a(str);
        a aVar = (a) this.c.getValue();
        int i = aVar.a;
        int i2 = a2.a;
        int i3 = Integer.MAX_VALUE;
        if (i <= i2 && i >= i2) {
            i3 = Math.abs(aVar.b - a2.b);
        }
        return i3 > this.b;
    }
}
