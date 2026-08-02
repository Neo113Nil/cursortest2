package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes4.dex */
public final class ocx extends g7 {
    public final b8 a;
    public final kf5 b;

    public ocx(b8 b8Var, sbx sbxVar) {
        this.a = b8Var;
        this.b = sbxVar.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024 A[Catch: IllegalArgumentException -> 0x002b, TryCatch #0 {IllegalArgumentException -> 0x002b, blocks: (B:3:0x0009, B:5:0x000f, B:8:0x001a, B:10:0x0024, B:13:0x0027, B:14:0x002a), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027 A[Catch: IllegalArgumentException -> 0x002b, TryCatch #0 {IllegalArgumentException -> 0x002b, blocks: (B:3:0x0009, B:5:0x000f, B:8:0x001a, B:10:0x0024, B:13:0x0027, B:14:0x002a), top: B:2:0x0009 }] */
    @Override // defpackage.g7, kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte F() {
        lq11 lq11Var;
        b8 b8Var = this.a;
        String l = b8Var.l();
        try {
            tq11 J0 = cma1.J0(10, l);
            if (J0 != null) {
                int i = J0.a;
                if (Integer.compareUnsigned(i, 255) <= 0) {
                    lq11Var = new lq11((byte) i);
                    if (lq11Var == null) {
                        return lq11Var.a;
                    }
                    bvu0.k(l);
                    throw null;
                }
            }
            lq11Var = null;
            if (lq11Var == null) {
            }
        } catch (IllegalArgumentException unused) {
            b8.q(b8Var, unr0.l('\'', "Failed to parse type 'UByte' for input '", l), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.Decoder, defpackage.sjd
    public final kf5 a() {
        return this.b;
    }

    @Override // defpackage.g7, kotlinx.serialization.encoding.Decoder
    public final long j() {
        b8 b8Var = this.a;
        String l = b8Var.l();
        try {
            yq11 K0 = cma1.K0(10, l);
            if (K0 != null) {
                return K0.a;
            }
            bvu0.k(l);
            throw null;
        } catch (IllegalArgumentException unused) {
            b8.q(b8Var, unr0.l('\'', "Failed to parse type 'ULong' for input '", l), 0, null, 6);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025 A[Catch: IllegalArgumentException -> 0x002c, TryCatch #0 {IllegalArgumentException -> 0x002c, blocks: (B:3:0x0009, B:5:0x000f, B:8:0x001b, B:10:0x0025, B:13:0x0028, B:14:0x002b), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0028 A[Catch: IllegalArgumentException -> 0x002c, TryCatch #0 {IllegalArgumentException -> 0x002c, blocks: (B:3:0x0009, B:5:0x000f, B:8:0x001b, B:10:0x0025, B:13:0x0028, B:14:0x002b), top: B:2:0x0009 }] */
    @Override // defpackage.g7, kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final short l() {
        pr11 pr11Var;
        b8 b8Var = this.a;
        String l = b8Var.l();
        try {
            tq11 J0 = cma1.J0(10, l);
            if (J0 != null) {
                int i = J0.a;
                if (Integer.compareUnsigned(i, 65535) <= 0) {
                    pr11Var = new pr11((short) i);
                    if (pr11Var == null) {
                        return pr11Var.a;
                    }
                    bvu0.k(l);
                    throw null;
                }
            }
            pr11Var = null;
            if (pr11Var == null) {
            }
        } catch (IllegalArgumentException unused) {
            b8.q(b8Var, unr0.l('\'', "Failed to parse type 'UShort' for input '", l), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.g7, kotlinx.serialization.encoding.Decoder
    public final int u() {
        b8 b8Var = this.a;
        String l = b8Var.l();
        try {
            return cma1.I0(l);
        } catch (IllegalArgumentException unused) {
            b8.q(b8Var, unr0.l('\'', "Failed to parse type 'UInt' for input '", l), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.sjd
    public final int v(SerialDescriptor serialDescriptor) {
        throw new IllegalStateException("unsupported");
    }
}
