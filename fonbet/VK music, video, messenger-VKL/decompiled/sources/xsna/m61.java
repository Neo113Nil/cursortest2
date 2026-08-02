package xsna;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import xsna.hey;
import xsna.j61;

/* compiled from: AesGcmSivKeyManager.java */
/* loaded from: classes.dex */
public final class m61 extends hey<j61> {

    /* compiled from: AesGcmSivKeyManager.java */
    /* loaded from: classes13.dex */
    public class a extends hey.a<k61, j61> {
        public a(m61 m61Var) {
            super(k61.class);
        }

        @Override // xsna.hey.a
        public final j61 a(k61 k61Var) throws GeneralSecurityException {
            j61.b u = j61.u();
            byte[] a = ewe0.a(k61Var.p());
            ByteString.g e = ByteString.e(0, a.length, a);
            u.l();
            j61.r((j61) u.c, e);
            u.l();
            j61.q((j61) u.c);
            return u.j();
        }

        @Override // xsna.hey.a
        public final k61 b(ByteString byteString) throws InvalidProtocolBufferException {
            return k61.q(byteString, com.google.crypto.tink.shaded.protobuf.k.a());
        }

        @Override // xsna.hey.a
        public final void c(k61 k61Var) throws GeneralSecurityException {
            jjr0.a(k61Var.p());
        }
    }

    @Override // xsna.hey
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // xsna.hey
    public final hey.a<?, j61> c() {
        return new a(this);
    }

    @Override // xsna.hey
    public final KeyData.KeyMaterialType d() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // xsna.hey
    public final j61 e(ByteString byteString) throws InvalidProtocolBufferException {
        return j61.v(byteString, com.google.crypto.tink.shaded.protobuf.k.a());
    }

    @Override // xsna.hey
    public final void f(j61 j61Var) throws GeneralSecurityException {
        j61 j61Var2 = j61Var;
        jjr0.c(j61Var2.t());
        jjr0.a(j61Var2.s().size());
    }
}
