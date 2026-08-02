package xsna;

import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.internal.WriteMode;
import xsna.prm0;
import xsna.sub0;

/* compiled from: StreamingJsonEncoder.kt */
/* loaded from: classes8.dex */
public final class gpm0 extends de implements g9y {
    public final rri b;
    public final j8y c;
    public final WriteMode d;
    public final g9y[] e;
    public final de f;
    public final q8y g;
    public boolean h;
    public String i;
    public String j;

    /* compiled from: StreamingJsonEncoder.kt */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WriteMode.values().length];
            try {
                iArr[WriteMode.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WriteMode.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WriteMode.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public gpm0(rri rriVar, j8y j8yVar, WriteMode writeMode, g9y[] g9yVarArr) {
        this.b = rriVar;
        this.c = j8yVar;
        this.d = writeMode;
        this.e = g9yVarArr;
        this.f = j8yVar.b;
        this.g = j8yVar.a;
        int ordinal = writeMode.ordinal();
        if (g9yVarArr != null) {
            g9y g9yVar = g9yVarArr[ordinal];
            if (g9yVar == null && g9yVar == this) {
                return;
            }
            g9yVarArr[ordinal] = this;
        }
    }

    @Override // xsna.de, kotlinx.serialization.encoding.Encoder
    public final void A(byte b) {
        if (this.h) {
            r(String.valueOf((int) b));
        } else {
            this.b.e(b);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0038, code lost:
    
        if (xsna.epx.f(r1, xsna.prm0.d.a) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r1.k != kotlinx.serialization.json.ClassDiscriminatorMode.NONE) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.de, kotlinx.serialization.encoding.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> void B(mmi0<? super T> mmi0Var, T t) {
        String c;
        j8y j8yVar = this.c;
        q8y q8yVar = j8yVar.a;
        boolean z = mmi0Var instanceof dh;
        if (!z) {
            int i = sub0.a.$EnumSwitchMapping$0[q8yVar.k.ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                gmi0 kind = mmi0Var.getDescriptor().getKind();
                if (!epx.f(kind, prm0.a.a)) {
                }
                c = sub0.c(mmi0Var.getDescriptor(), j8yVar);
            }
            c = null;
        }
        if (z) {
            dh dhVar = (dh) mmi0Var;
            if (t == 0) {
                throw new IllegalArgumentException(("Value for serializer " + dhVar.getDescriptor() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
            }
            mmi0<? super T> m = rte0.m(dhVar, this, t);
            if (c != null) {
                sub0.a(mmi0Var, m, c);
            }
            sub0.b(m.getDescriptor().getKind());
            mmi0Var = m;
        }
        if (c != null) {
            String f = mmi0Var.getDescriptor().f();
            this.i = c;
            this.j = f;
        }
        mmi0Var.serialize(this, t);
    }

    @Override // xsna.de, kotlinx.serialization.encoding.Encoder
    public final void C(float f) {
        boolean z = this.h;
        rri rriVar = this.b;
        if (z) {
            r(String.valueOf(f));
        } else {
            ((lhx) rriVar.c).c(String.valueOf(f));
        }
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            throw ne7.a(((lhx) rriVar.c).toString(), Float.valueOf(f));
        }
    }

    @Override // xsna.g9y
    public final void E(JsonElement jsonElement) {
        if (this.i == null || (jsonElement instanceof JsonObject)) {
            B(e9y.a, jsonElement);
        } else {
            sub0.d(this.j, jsonElement);
            throw null;
        }
    }

    @Override // xsna.de, kotlinx.serialization.encoding.Encoder
    public final void H(double d) {
        boolean z = this.h;
        rri rriVar = this.b;
        if (z) {
            r(String.valueOf(d));
        } else {
            ((lhx) rriVar.c).c(String.valueOf(d));
        }
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw ne7.a(((lhx) rriVar.c).toString(), Double.valueOf(d));
        }
    }

    @Override // xsna.de, kotlinx.serialization.encoding.Encoder
    public final void J() {
        this.b.i("null");
    }

    @Override // xsna.de
    public final void V(SerialDescriptor serialDescriptor, int i) {
        int i2 = a.$EnumSwitchMapping$0[this.d.ordinal()];
        rri rriVar = this.b;
        boolean z = true;
        if (i2 == 1) {
            if (!rriVar.b) {
                rriVar.f(',');
            }
            rriVar.c();
            return;
        }
        if (i2 == 2) {
            if (rriVar.b) {
                this.h = true;
                rriVar.c();
                return;
            }
            if (i % 2 == 0) {
                rriVar.f(',');
                rriVar.c();
            } else {
                rriVar.f(':');
                rriVar.l();
                z = false;
            }
            this.h = z;
            return;
        }
        if (i2 != 3) {
            if (!rriVar.b) {
                rriVar.f(',');
            }
            rriVar.c();
            t9y.c(serialDescriptor, this.c);
            r(serialDescriptor.d(i));
            rriVar.f(':');
            rriVar.l();
            return;
        }
        if (i == 0) {
            this.h = true;
        }
        if (i == 1) {
            rriVar.f(',');
            rriVar.l();
            this.h = false;
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final de c() {
        return this.f;
    }

    @Override // xsna.de, kotlinx.serialization.encoding.Encoder
    public final cti d(SerialDescriptor serialDescriptor) {
        g9y g9yVar;
        j8y j8yVar = this.c;
        WriteMode b = g2y0.b(serialDescriptor, j8yVar);
        char c = b.begin;
        rri rriVar = this.b;
        if (c != 0) {
            rriVar.f(c);
            rriVar.a();
        }
        String str = this.i;
        if (str != null) {
            String str2 = this.j;
            if (str2 == null) {
                str2 = serialDescriptor.f();
            }
            rriVar.c();
            r(str);
            rriVar.f(':');
            rriVar.l();
            r(str2);
            this.i = null;
            this.j = null;
        }
        if (this.d == b) {
            return this;
        }
        g9y[] g9yVarArr = this.e;
        return (g9yVarArr == null || (g9yVar = g9yVarArr[b.ordinal()]) == null) ? new gpm0(rriVar, j8yVar, b, g9yVarArr) : g9yVar;
    }

    @Override // xsna.de, xsna.cti
    public final void e(SerialDescriptor serialDescriptor) {
        WriteMode writeMode = this.d;
        if (writeMode.end != 0) {
            rri rriVar = this.b;
            rriVar.m();
            rriVar.d();
            rriVar.f(writeMode.end);
        }
    }

    @Override // xsna.g9y
    public final j8y f() {
        return this.c;
    }

    @Override // xsna.de, kotlinx.serialization.encoding.Encoder
    public final void h(SerialDescriptor serialDescriptor, int i) {
        r(serialDescriptor.d(i));
    }

    @Override // xsna.de, kotlinx.serialization.encoding.Encoder
    public final Encoder i(SerialDescriptor serialDescriptor) {
        boolean a2 = hpm0.a(serialDescriptor);
        WriteMode writeMode = this.d;
        j8y j8yVar = this.c;
        rri rriVar = this.b;
        if (a2) {
            if (!(rriVar instanceof uri)) {
                rriVar = new uri((lhx) rriVar.c, this.h);
            }
            return new gpm0(rriVar, j8yVar, writeMode, null);
        }
        if (serialDescriptor.isInline() && serialDescriptor.equals(c9y.a)) {
            if (!(rriVar instanceof tri)) {
                rriVar = new tri((lhx) rriVar.c, this.h);
            }
            return new gpm0(rriVar, j8yVar, writeMode, null);
        }
        if (this.i != null) {
            this.j = serialDescriptor.f();
        }
        return this;
    }

    @Override // xsna.de, kotlinx.serialization.encoding.Encoder
    public final void j(short s) {
        if (this.h) {
            r(String.valueOf((int) s));
        } else {
            this.b.j(s);
        }
    }

    @Override // xsna.de, kotlinx.serialization.encoding.Encoder
    public final void k(boolean z) {
        if (this.h) {
            r(String.valueOf(z));
        } else {
            ((lhx) this.b.c).c(String.valueOf(z));
        }
    }

    @Override // xsna.de, kotlinx.serialization.encoding.Encoder
    public final void o(int i) {
        if (this.h) {
            r(String.valueOf(i));
        } else {
            this.b.g(i);
        }
    }

    @Override // xsna.de, kotlinx.serialization.encoding.Encoder
    public final void r(String str) {
        this.b.k(str);
    }

    @Override // xsna.de, xsna.cti
    public final <T> void s(SerialDescriptor serialDescriptor, int i, mmi0<? super T> mmi0Var, T t) {
        if (t != null || this.g.f) {
            super.s(serialDescriptor, i, mmi0Var, t);
        }
    }

    @Override // xsna.de, kotlinx.serialization.encoding.Encoder
    public final void u(long j) {
        if (this.h) {
            r(String.valueOf(j));
        } else {
            this.b.h(j);
        }
    }

    @Override // xsna.de, kotlinx.serialization.encoding.Encoder
    public final void y(char c) {
        r(String.valueOf(c));
    }

    @Override // xsna.de, xsna.cti
    public final boolean z() {
        return this.g.a;
    }
}
