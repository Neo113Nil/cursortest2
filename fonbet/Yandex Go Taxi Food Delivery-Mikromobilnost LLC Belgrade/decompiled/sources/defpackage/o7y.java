package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lo7y;", "Lvn11;", "Companion", "n7y", "m7y", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class o7y implements vn11 {
    public static final n7y Companion = new n7y();
    public static final o7y g = new o7y(0);
    public final boolean b;
    public final Long c;
    public final Long d;
    public final Boolean e;
    public final Long f;

    public /* synthetic */ o7y(int i, boolean z, Long l, Long l2, Boolean bool, Long l3) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = l2;
        }
        if ((i & 8) == 0) {
            this.e = null;
        } else {
            this.e = bool;
        }
        if ((i & 16) == 0) {
            this.f = null;
        } else {
            this.f = l3;
        }
    }

    public o7y(int i) {
        this.b = false;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public o7y() {
        this(0);
    }
}
