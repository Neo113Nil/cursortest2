package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@gsq0
/* loaded from: classes12.dex */
public final class pj8 {
    public static final oj8 Companion = new oj8();
    public static final i3y[] h;
    public final wj8 a;
    public final String b;
    public final List c;
    public final String d;
    public final int e;
    public final List f;
    public final List g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{null, null, a.b(lazyThreadSafetyMode, new we8(2)), null, null, a.b(lazyThreadSafetyMode, new we8(3)), a.b(lazyThreadSafetyMode, new we8(4))};
    }

    public /* synthetic */ pj8(int i, wj8 wj8Var, String str, List list, String str2, int i2, List list2, List list3) {
        if (115 != (i & HProv.PP_CACHE_SIZE)) {
            qje.Z(i, HProv.PP_CACHE_SIZE, nj8.a.getDescriptor());
            throw null;
        }
        this.a = wj8Var;
        this.b = str;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        this.e = i2;
        this.f = list2;
        this.g = list3;
    }
}
