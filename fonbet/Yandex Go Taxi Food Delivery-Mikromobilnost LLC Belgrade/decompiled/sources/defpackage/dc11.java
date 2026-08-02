package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.b;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Ldc11;", "Ln96;", "Lc6z;", "Companion", "cc11", "bc11", "order"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class dc11 extends n96 implements c6z {
    public static final cc11 Companion = new cc11();
    public static final i3y[] f = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new k801(24)), null, null};
    public static final dc11 g = new dc11(0);
    public final boolean b;
    public final Map c;
    public final String d;
    public final String e;

    public /* synthetic */ dc11(int i, String str, String str2, Map map, boolean z) {
        this.b = (i & 1) == 0 ? false : z;
        this.c = (i & 2) == 0 ? b.f() : map;
        if ((i & 4) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
        if ((i & 8) == 0) {
            this.e = "";
        } else {
            this.e = str2;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    public dc11() {
        this(0);
    }

    public dc11(int i) {
        Map f2 = b.f();
        this.b = false;
        this.c = f2;
        this.d = "";
        this.e = "";
    }
}
