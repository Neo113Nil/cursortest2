package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.b;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lazi;", "Ln96;", "Lc6z;", "Companion", "zyi", "yyi", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class azi extends n96 implements c6z {
    public static final zyi Companion = new zyi();
    public static final i3y[] g = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new xyi(0)), null, null, null};
    public static final azi h = new azi(0);
    public final boolean b;
    public final Map c;
    public final String d;
    public final String e;
    public final int f;

    public /* synthetic */ azi(int i, boolean z, Map map, String str, String str2, int i2) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = b.f();
        } else {
            this.c = map;
        }
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
        if ((i & 16) == 0) {
            this.f = 0;
        } else {
            this.f = i2;
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

    public azi() {
        this(0);
    }

    public azi(int i) {
        Map f = b.f();
        this.b = false;
        this.c = f;
        this.d = "";
        this.e = "";
        this.f = 0;
    }
}
