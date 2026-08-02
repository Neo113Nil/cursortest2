package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes4.dex */
public final class e8 extends j7 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ f8 b;
    public final /* synthetic */ String c;
    public final Object d;

    public e8(f8 f8Var, String str) {
        this.b = f8Var;
        this.c = str;
        this.d = f8Var.b.b;
    }

    public void I(String str) {
        this.b.Z(this.c, new adx(str, false, null));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final kf5 a() {
        switch (this.a) {
            case 0:
                return this.b.b.b;
            default:
                return (kf5) this.d;
        }
    }

    @Override // defpackage.j7, kotlinx.serialization.encoding.Encoder
    public void encodeByte(byte b) {
        switch (this.a) {
            case 1:
                I(String.valueOf(b & 255));
                break;
            default:
                super.encodeByte(b);
                break;
        }
    }

    @Override // defpackage.j7, kotlinx.serialization.encoding.Encoder
    public void k(short s) {
        switch (this.a) {
            case 1:
                I(String.valueOf(s & 65535));
                break;
            default:
                super.k(s);
                break;
        }
    }

    @Override // defpackage.j7, kotlinx.serialization.encoding.Encoder
    public void q(int i) {
        switch (this.a) {
            case 1:
                I(Integer.toUnsignedString(i));
                break;
            default:
                super.q(i);
                break;
        }
    }

    @Override // defpackage.j7, kotlinx.serialization.encoding.Encoder
    public void t(String str) {
        switch (this.a) {
            case 0:
                this.b.Z(this.c, new adx(str, false, (SerialDescriptor) this.d));
                break;
            default:
                super.t(str);
                break;
        }
    }

    @Override // defpackage.j7, kotlinx.serialization.encoding.Encoder
    public void w(long j) {
        switch (this.a) {
            case 1:
                I(Long.toUnsignedString(j));
                break;
            default:
                super.w(j);
                break;
        }
    }

    public e8(f8 f8Var, String str, SerialDescriptor serialDescriptor) {
        this.b = f8Var;
        this.c = str;
        this.d = serialDescriptor;
    }
}
