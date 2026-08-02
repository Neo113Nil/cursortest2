package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lg4e0;", "Lbzx;", "Companion", "e4e0", "f4e0", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class g4e0 implements bzx {
    public static final f4e0 Companion = new f4e0();
    public static final i3y[] j;
    public final uc4 a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final Float[] e;
    public final List f;
    public final Set g;
    public Long h;
    public byx i;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        j = new i3y[]{null, null, null, null, a.b(lazyThreadSafetyMode, new mlc0(20)), a.b(lazyThreadSafetyMode, new mlc0(21)), a.b(lazyThreadSafetyMode, new mlc0(22))};
    }

    public /* synthetic */ g4e0(int i, uc4 uc4Var, Long l, Long l2, Long l3, Float[] fArr, List list, Set set) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = uc4Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = fArr;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = set;
        }
        this.h = null;
    }

    @Override // defpackage.bzx
    /* renamed from: a, reason: from getter */
    public final Long getC() {
        return this.c;
    }

    @Override // defpackage.bzx
    /* renamed from: b, reason: from getter */
    public final Long getD() {
        return this.d;
    }

    @Override // defpackage.bzx
    /* renamed from: c, reason: from getter */
    public final Float[] getE() {
        return this.e;
    }

    @Override // defpackage.bzx
    /* renamed from: d, reason: from getter */
    public final uc4 getA() {
        return this.a;
    }

    @Override // defpackage.bzx
    /* renamed from: e, reason: from getter */
    public final Long getB() {
        return this.b;
    }

    @Override // defpackage.bzx
    /* renamed from: f, reason: from getter */
    public final Long getM() {
        return this.h;
    }

    public g4e0() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }
}
