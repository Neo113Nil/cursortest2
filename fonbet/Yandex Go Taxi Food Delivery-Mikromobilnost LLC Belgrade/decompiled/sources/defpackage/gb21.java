package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes12.dex */
public final class gb21 implements ig5 {
    public static final fb21 Companion = new fb21();
    public static final i3y[] f;
    public final String a;
    public final vm50 b;
    public final vm50 c;
    public final vm50 d;
    public final vm50 e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{null, a.b(lazyThreadSafetyMode, new z121(10)), a.b(lazyThreadSafetyMode, new z121(11)), a.b(lazyThreadSafetyMode, new z121(12)), a.b(lazyThreadSafetyMode, new z121(13))};
    }

    public /* synthetic */ gb21(int i, String str, vm50 vm50Var, vm50 vm50Var2, vm50 vm50Var3, vm50 vm50Var4) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, eb21.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = vm50Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = vm50Var2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = vm50Var3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = vm50Var4;
        }
    }
}
