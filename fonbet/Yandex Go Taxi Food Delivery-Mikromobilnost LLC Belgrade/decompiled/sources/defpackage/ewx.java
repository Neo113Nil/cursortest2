package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.json.c;

@gsq0
/* loaded from: classes9.dex */
public final class ewx {
    public static final cwx Companion = new cwx();
    public static final i3y[] o;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final bwx f;
    public final List g;
    public final boolean h;
    public final jsq0 i;
    public final kwx j;
    public final List k;
    public final Set l;
    public final c m;
    public final kd7 n;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        o = new i3y[]{null, null, null, null, null, null, a.b(lazyThreadSafetyMode, new aww(16)), null, a.b(lazyThreadSafetyMode, new aww(17)), null, a.b(lazyThreadSafetyMode, new aww(18)), a.b(lazyThreadSafetyMode, new aww(19)), null, null};
    }

    public /* synthetic */ ewx(int i, String str, String str2, String str3, String str4, String str5, bwx bwxVar, List list, boolean z, jsq0 jsq0Var, kwx kwxVar, List list2, Set set, c cVar, kd7 kd7Var) {
        if (3967 != (i & 3967)) {
            qje.Z(i, 3967, svx.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = bwxVar;
        this.g = list;
        if ((i & 128) == 0) {
            this.h = false;
        } else {
            this.h = z;
        }
        this.i = jsq0Var;
        this.j = kwxVar;
        this.k = list2;
        this.l = set;
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = cVar;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = kd7Var;
        }
    }

    public ewx(String str, String str2, String str3, String str4, bwx bwxVar, List list, boolean z, jsq0 jsq0Var, kwx kwxVar, List list2, Set set, c cVar, kd7 kd7Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = null;
        this.f = bwxVar;
        this.g = list;
        this.h = z;
        this.i = jsq0Var;
        this.j = kwxVar;
        this.k = list2;
        this.l = set;
        this.m = cVar;
        this.n = kd7Var;
    }
}
