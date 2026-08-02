package defpackage;

import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class jdo {
    public static final Set c;
    public final String a;
    public boolean b = true;

    static {
        a8t.b.getClass();
        String str = a8t.c;
        o9t.b.getClass();
        String str2 = o9t.c;
        met.b.getClass();
        String str3 = met.c;
        h5t.b.getClass();
        String str4 = h5t.c;
        i5t.b.getClass();
        String str5 = i5t.c;
        bft.b.getClass();
        String str6 = bft.c;
        aft.b.getClass();
        String str7 = aft.c;
        e4t.b.getClass();
        c = j73.f0(new String[]{str, str2, str3, str4, str5, str6, str7, e4t.c});
    }

    public jdo(String str) {
        this.a = str;
    }

    public abstract Object a(mdo mdoVar);

    public abstract List b();

    public abstract List c();

    public final void d(boolean z) {
        this.b = this.b && z;
    }
}
