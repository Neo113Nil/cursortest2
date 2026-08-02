package ru.ok.android.externcalls.sdk.stat;

import xsna.gp;
import xsna.gsi0;
import xsna.n23;
import xsna.qoy;
import xsna.zcl;

/* compiled from: Stats.kt */
/* loaded from: classes9.dex */
public final class KeyPropBehavior implements StatBehavior {
    private final boolean derived;
    private final boolean humanReadable;
    private final boolean monotonic;

    /* renamed from: static, reason: not valid java name */
    private final boolean f51static;
    private final boolean synthetic;

    public KeyPropBehavior() {
        this(false, false, false, false, false, 31, null);
    }

    public static /* synthetic */ KeyPropBehavior copy$default(KeyPropBehavior keyPropBehavior, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            z = keyPropBehavior.f51static;
        }
        if ((i & 2) != 0) {
            z2 = keyPropBehavior.monotonic;
        }
        if ((i & 4) != 0) {
            z3 = keyPropBehavior.derived;
        }
        if ((i & 8) != 0) {
            z4 = keyPropBehavior.synthetic;
        }
        if ((i & 16) != 0) {
            z5 = keyPropBehavior.humanReadable;
        }
        boolean z6 = z5;
        boolean z7 = z3;
        return keyPropBehavior.copy(z, z2, z7, z4, z6);
    }

    public final boolean component1() {
        return this.f51static;
    }

    public final boolean component2() {
        return this.monotonic;
    }

    public final boolean component3() {
        return this.derived;
    }

    public final boolean component4() {
        return this.synthetic;
    }

    public final boolean component5() {
        return this.humanReadable;
    }

    public final KeyPropBehavior copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new KeyPropBehavior(z, z2, z3, z4, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyPropBehavior)) {
            return false;
        }
        KeyPropBehavior keyPropBehavior = (KeyPropBehavior) obj;
        return this.f51static == keyPropBehavior.f51static && this.monotonic == keyPropBehavior.monotonic && this.derived == keyPropBehavior.derived && this.synthetic == keyPropBehavior.synthetic && this.humanReadable == keyPropBehavior.humanReadable;
    }

    @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
    public boolean getDerived() {
        return this.derived;
    }

    @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
    public boolean getHumanReadable() {
        return this.humanReadable;
    }

    @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
    public boolean getMonotonic() {
        return this.monotonic;
    }

    @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
    public boolean getStatic() {
        return this.f51static;
    }

    @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
    public boolean getSynthetic() {
        return this.synthetic;
    }

    public int hashCode() {
        return Boolean.hashCode(this.humanReadable) + qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.f51static) * 31, 31, this.monotonic), 31, this.derived), 31, this.synthetic);
    }

    public String toString() {
        boolean z = this.f51static;
        boolean z2 = this.monotonic;
        boolean z3 = this.derived;
        boolean z4 = this.synthetic;
        boolean z5 = this.humanReadable;
        StringBuilder c = gp.c("KeyPropBehavior(static=", ", monotonic=", ", derived=", z, z2);
        gsi0.c(c, z3, ", synthetic=", z4, ", humanReadable=");
        return n23.b(c, z5, ")");
    }

    public KeyPropBehavior(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f51static = z;
        this.monotonic = z2;
        this.derived = z3;
        this.synthetic = z4;
        this.humanReadable = z5;
    }

    public /* synthetic */ KeyPropBehavior(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, zcl zclVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? true : z5);
    }
}
