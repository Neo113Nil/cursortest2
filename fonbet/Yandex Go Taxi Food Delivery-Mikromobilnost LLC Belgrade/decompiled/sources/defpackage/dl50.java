package defpackage;

import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@jxi
@gsq0
/* loaded from: classes5.dex */
public final class dl50 {
    public static final cl50 Companion = new cl50();
    public static final i3y[] f = {a.b(LazyThreadSafetyMode.PUBLICATION, new rk50(2)), null, null, null, null};
    public static final Set g = j73.f0(new String[]{"pickup_points", "code_dispatch", "alerts"});
    public final Set a;
    public final String b;
    public final zzs c;
    public final Boolean d;
    public final Integer e;

    public /* synthetic */ dl50(int i, Set set, String str, zzs zzsVar, Boolean bool, Integer num) {
        this.a = (i & 1) == 0 ? g : set;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = zzsVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num;
        }
    }

    public dl50(zzs zzsVar, String str) {
        Boolean bool = Boolean.FALSE;
        this.a = g;
        this.b = str;
        this.c = zzsVar;
        this.d = bool;
        this.e = 0;
    }
}
