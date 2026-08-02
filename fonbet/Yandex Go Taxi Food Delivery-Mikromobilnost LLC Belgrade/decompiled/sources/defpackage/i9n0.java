package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.b;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Li9n0;", "Lw96;", "Lc6z;", "Companion", "h9n0", "g9n0", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i9n0 extends w96 implements c6z {
    public static final h9n0 Companion = new h9n0();
    public static final i3y[] h = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new jrl0(14)), null, null, null, null};
    public static final i9n0 i = new i9n0(0);
    public final boolean b;
    public final Map c;
    public final boolean d;
    public final Integer e;
    public final String f;
    public final String g;

    public /* synthetic */ i9n0(int i2, boolean z, Map map, boolean z2, Integer num, String str, String str2) {
        this.b = (i2 & 1) == 0 ? false : z;
        if ((i2 & 2) == 0) {
            this.c = b.f();
        } else {
            this.c = map;
        }
        if ((i2 & 4) == 0) {
            this.d = true;
        } else {
            this.d = z2;
        }
        if ((i2 & 8) == 0) {
            this.e = null;
        } else {
            this.e = num;
        }
        if ((i2 & 16) == 0) {
            this.f = null;
        } else {
            this.f = str;
        }
        if ((i2 & 32) == 0) {
            this.g = null;
        } else {
            this.g = str2;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public i9n0() {
        this(0);
    }

    public i9n0(int i2) {
        Map f = b.f();
        this.b = false;
        this.c = f;
        this.d = true;
        this.e = null;
        this.f = null;
        this.g = null;
    }
}
