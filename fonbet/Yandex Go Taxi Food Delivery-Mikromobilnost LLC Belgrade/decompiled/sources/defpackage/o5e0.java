package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lo5e0;", "Lbzx;", "Companion", "n5e0", "m5e0", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class o5e0 implements bzx {
    public static final n5e0 Companion = new n5e0();
    public static final i3y[] i;
    public static final o5e0 j;
    public final uc4 a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final Float[] e;
    public final List f;
    public Long g;
    public byx h;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        i = new i3y[]{null, null, null, null, a.b(lazyThreadSafetyMode, new mlc0(23)), a.b(lazyThreadSafetyMode, new mlc0(24))};
        j = new o5e0(0);
    }

    public /* synthetic */ o5e0(int i2, uc4 uc4Var, Long l, Long l2, Long l3, Float[] fArr, List list) {
        if ((i2 & 1) == 0) {
            this.a = null;
        } else {
            this.a = uc4Var;
        }
        if ((i2 & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i2 & 4) == 0) {
            this.c = null;
        } else {
            this.c = l2;
        }
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = l3;
        }
        if ((i2 & 16) == 0) {
            this.e = null;
        } else {
            this.e = fArr;
        }
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = list;
        }
        this.g = null;
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
        return this.g;
    }

    public o5e0(int i2) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public o5e0() {
        this(0);
    }
}
