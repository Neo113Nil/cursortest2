package xsna;

import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.internal.JsonEncodingException;
import xsna.gmi0;
import xsna.prm0;
import xsna.sub0;

/* compiled from: TreeJsonEncoder.kt */
/* loaded from: classes8.dex */
public abstract class ef extends nc implements g9y {
    public final j8y c;
    public final izs<JsonElement, s3q0> d;
    public final q8y e;
    public String f;
    public String g;

    public ef(j8y j8yVar, izs izsVar) {
        super(2);
        this.c = j8yVar;
        this.d = izsVar;
        this.e = j8yVar.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r0.k != kotlinx.serialization.json.ClassDiscriminatorMode.NONE) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0067, code lost:
    
        if (xsna.epx.f(r0, xsna.prm0.d.a) == false) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.nc, kotlinx.serialization.encoding.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> void B(mmi0<? super T> mmi0Var, T t) {
        String c;
        Object k0 = j5g.k0((ArrayList) this.b);
        j8y j8yVar = this.c;
        if (k0 == null) {
            SerialDescriptor a = g2y0.a(mmi0Var.getDescriptor(), j8yVar.b);
            if ((a.getKind() instanceof gbd0) || a.getKind() == gmi0.b.a) {
                new jay(j8yVar, this.d).B(mmi0Var, t);
                return;
            }
        }
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
            this.f = c;
            this.g = f;
        }
        mmi0Var.serialize(this, t);
    }

    @Override // xsna.g9y
    public final void E(JsonElement jsonElement) {
        if (this.f == null || (jsonElement instanceof JsonObject)) {
            B(e9y.a, jsonElement);
        } else {
            sub0.d(this.g, jsonElement);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void J() {
        String str = (String) j5g.k0((ArrayList) this.b);
        if (str == null) {
            this.d.invoke(JsonNull.INSTANCE);
        } else {
            j0(str, JsonNull.INSTANCE);
        }
    }

    @Override // xsna.nc
    public String T(SerialDescriptor serialDescriptor, int i) {
        t9y.c(serialDescriptor, this.c);
        return serialDescriptor.d(i);
    }

    @Override // xsna.nc
    public final void U(Object obj, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        qzw qzwVar = c9y.a;
        j0((String) obj, new o9y(valueOf, false, null));
    }

    @Override // xsna.nc
    public final void V(Object obj, byte b) {
        j0((String) obj, c9y.a(Byte.valueOf(b)));
    }

    @Override // xsna.nc
    public final void W(Object obj, char c) {
        j0((String) obj, c9y.b(String.valueOf(c)));
    }

    @Override // xsna.nc
    public final void X(Object obj, double d) {
        String str = (String) obj;
        j0(str, c9y.a(Double.valueOf(d)));
        this.e.getClass();
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw new JsonEncodingException(ne7.H(Double.valueOf(d), str, i0().toString()));
        }
    }

    @Override // xsna.nc
    public final void Y(Object obj, SerialDescriptor serialDescriptor, int i) {
        j0((String) obj, c9y.b(serialDescriptor.d(i)));
    }

    @Override // xsna.nc
    public final void Z(Object obj, float f) {
        String str = (String) obj;
        j0(str, c9y.a(Float.valueOf(f)));
        this.e.getClass();
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            throw new JsonEncodingException(ne7.H(Float.valueOf(f), str, i0().toString()));
        }
    }

    @Override // xsna.nc
    public final Encoder a0(Object obj, SerialDescriptor serialDescriptor) {
        String str = (String) obj;
        if (hpm0.a(serialDescriptor)) {
            return new df(this, str);
        }
        if (serialDescriptor.isInline() && serialDescriptor.equals(c9y.a)) {
            return new cf(this, str, serialDescriptor);
        }
        ((ArrayList) this.b).add(str);
        return this;
    }

    @Override // xsna.nc
    public final void b0(int i, Object obj) {
        j0((String) obj, c9y.a(Integer.valueOf(i)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final de c() {
        return this.c.b;
    }

    @Override // xsna.nc
    public final void c0(long j, Object obj) {
        j0((String) obj, c9y.a(Long.valueOf(j)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final cti d(SerialDescriptor serialDescriptor) {
        ef efVar;
        izs eVar = j5g.k0((ArrayList) this.b) == null ? this.d : new com.vk.movika.sdk.base.logic.interactor.e(this, 2);
        gmi0 kind = serialDescriptor.getKind();
        boolean f = epx.f(kind, prm0.b.a);
        j8y j8yVar = this.c;
        if (f || (kind instanceof rub0)) {
            efVar = new dby(j8yVar, eVar);
        } else if (epx.f(kind, prm0.c.a)) {
            SerialDescriptor a = g2y0.a(serialDescriptor.h(0), j8yVar.b);
            gmi0 kind2 = a.getKind();
            if ((kind2 instanceof gbd0) || epx.f(kind2, gmi0.b.a)) {
                fby fbyVar = new fby(j8yVar, eVar);
                fbyVar.j = true;
                efVar = fbyVar;
            } else {
                if (!j8yVar.a.d) {
                    throw ne7.b(a);
                }
                efVar = new dby(j8yVar, eVar);
            }
        } else {
            efVar = new bby(j8yVar, eVar);
        }
        String str = this.f;
        if (str != null) {
            if (efVar instanceof fby) {
                fby fbyVar2 = (fby) efVar;
                fbyVar2.j0("key", c9y.b(str));
                String str2 = this.g;
                if (str2 == null) {
                    str2 = serialDescriptor.f();
                }
                fbyVar2.j0("value", c9y.b(str2));
            } else {
                String str3 = this.g;
                if (str3 == null) {
                    str3 = serialDescriptor.f();
                }
                efVar.j0(str, c9y.b(str3));
            }
            this.f = null;
            this.g = null;
        }
        return efVar;
    }

    @Override // xsna.nc
    public final void d0(Object obj, short s) {
        j0((String) obj, c9y.a(Short.valueOf(s)));
    }

    @Override // xsna.nc
    public final void e0(Object obj, String str) {
        j0((String) obj, c9y.b(str));
    }

    @Override // xsna.g9y
    public final j8y f() {
        return this.c;
    }

    @Override // xsna.nc
    public final void f0() {
        this.d.invoke(i0());
    }

    @Override // xsna.nc, kotlinx.serialization.encoding.Encoder
    public final Encoder i(SerialDescriptor serialDescriptor) {
        if (j5g.k0((ArrayList) this.b) == null) {
            return new jay(this.c, this.d).i(serialDescriptor);
        }
        if (this.f != null) {
            this.g = serialDescriptor.f();
        }
        return super.i(serialDescriptor);
    }

    public abstract JsonElement i0();

    public abstract void j0(String str, JsonElement jsonElement);

    @Override // xsna.cti
    public final boolean z() {
        return this.e.a;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void N() {
    }
}
