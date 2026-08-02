package xsna;

import com.facebook.soloader.MinElf;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: StreamingJsonDecoder.kt */
/* loaded from: classes8.dex */
public final class y8y extends be {
    public final af b;
    public final de c;

    public y8y(af afVar, j8y j8yVar) {
        this.b = afVar;
        this.c = j8yVar.b;
    }

    @Override // xsna.be, kotlinx.serialization.encoding.Decoder
    public final int B() {
        af afVar = this.b;
        String l = afVar.l();
        try {
            jxp0 y = his0.y(l);
            if (y != null) {
                return y.b;
            }
            arm0.j(l);
            throw null;
        } catch (IllegalArgumentException unused) {
            af.q(afVar, air.b('\'', "Failed to parse type 'UInt' for input '", l), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.Decoder, xsna.ssi
    public final de c() {
        return this.c;
    }

    @Override // xsna.ssi
    public final int m(SerialDescriptor serialDescriptor) {
        throw new IllegalStateException("unsupported");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022 A[Catch: IllegalArgumentException -> 0x0029, TryCatch #0 {IllegalArgumentException -> 0x0029, blocks: (B:3:0x0007, B:5:0x000d, B:8:0x0018, B:10:0x0022, B:13:0x0025, B:14:0x0028), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025 A[Catch: IllegalArgumentException -> 0x0029, TryCatch #0 {IllegalArgumentException -> 0x0029, blocks: (B:3:0x0007, B:5:0x000d, B:8:0x0018, B:10:0x0022, B:13:0x0025, B:14:0x0028), top: B:2:0x0007 }] */
    @Override // xsna.be, kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte p() {
        uvp0 uvp0Var;
        af afVar = this.b;
        String l = afVar.l();
        try {
            jxp0 y = his0.y(l);
            if (y != null) {
                int i = y.b;
                if (Integer.compareUnsigned(i, 255) <= 0) {
                    uvp0Var = new uvp0((byte) i);
                    if (uvp0Var == null) {
                        return uvp0Var.b;
                    }
                    arm0.j(l);
                    throw null;
                }
            }
            uvp0Var = null;
            if (uvp0Var == null) {
            }
        } catch (IllegalArgumentException unused) {
            af.q(afVar, air.b('\'', "Failed to parse type 'UByte' for input '", l), 0, null, 6);
            throw null;
        }
    }

    @Override // xsna.be, kotlinx.serialization.encoding.Decoder
    public final long t() {
        af afVar = this.b;
        String l = afVar.l();
        try {
            oxp0 z = his0.z(l);
            if (z != null) {
                return z.b;
            }
            arm0.j(l);
            throw null;
        } catch (IllegalArgumentException unused) {
            af.q(afVar, air.b('\'', "Failed to parse type 'ULong' for input '", l), 0, null, 6);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023 A[Catch: IllegalArgumentException -> 0x002a, TryCatch #0 {IllegalArgumentException -> 0x002a, blocks: (B:3:0x0007, B:5:0x000d, B:8:0x0019, B:10:0x0023, B:13:0x0026, B:14:0x0029), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026 A[Catch: IllegalArgumentException -> 0x002a, TryCatch #0 {IllegalArgumentException -> 0x002a, blocks: (B:3:0x0007, B:5:0x000d, B:8:0x0019, B:10:0x0023, B:13:0x0026, B:14:0x0029), top: B:2:0x0007 }] */
    @Override // xsna.be, kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final short v() {
        vxp0 vxp0Var;
        af afVar = this.b;
        String l = afVar.l();
        try {
            jxp0 y = his0.y(l);
            if (y != null) {
                int i = y.b;
                if (Integer.compareUnsigned(i, MinElf.PN_XNUM) <= 0) {
                    vxp0Var = new vxp0((short) i);
                    if (vxp0Var == null) {
                        return vxp0Var.b;
                    }
                    arm0.j(l);
                    throw null;
                }
            }
            vxp0Var = null;
            if (vxp0Var == null) {
            }
        } catch (IllegalArgumentException unused) {
            af.q(afVar, air.b('\'', "Failed to parse type 'UShort' for input '", l), 0, null, 6);
            throw null;
        }
    }
}
