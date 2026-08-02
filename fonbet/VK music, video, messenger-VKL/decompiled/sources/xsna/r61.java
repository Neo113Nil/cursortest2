package xsna;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import xsna.hey;
import xsna.o61;

/* compiled from: AesSivKeyManager.java */
/* loaded from: classes.dex */
public final class r61 extends hey<o61> {

    /* compiled from: AesSivKeyManager.java */
    /* loaded from: classes13.dex */
    public class a extends hey.a<p61, o61> {
        public a(r61 r61Var) {
            super(p61.class);
        }

        @Override // xsna.hey.a
        public final o61 a(p61 p61Var) throws GeneralSecurityException {
            o61.b u = o61.u();
            byte[] a = ewe0.a(p61Var.r());
            ByteString.g e = ByteString.e(0, a.length, a);
            u.l();
            o61.r((o61) u.c, e);
            u.l();
            o61.q((o61) u.c);
            return u.j();
        }

        @Override // xsna.hey.a
        public final p61 b(ByteString byteString) throws InvalidProtocolBufferException {
            return p61.t(byteString, com.google.crypto.tink.shaded.protobuf.k.a());
        }

        @Override // xsna.hey.a
        public final void c(p61 p61Var) throws GeneralSecurityException {
            p61 p61Var2 = p61Var;
            if (p61Var2.r() == 64) {
                return;
            }
            throw new InvalidAlgorithmParameterException("invalid key size: " + p61Var2.r() + ". Valid keys must have 64 bytes.");
        }
    }

    @Override // xsna.hey
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // xsna.hey
    public final hey.a<?, o61> c() {
        return new a(this);
    }

    @Override // xsna.hey
    public final KeyData.KeyMaterialType d() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // xsna.hey
    public final o61 e(ByteString byteString) throws InvalidProtocolBufferException {
        return o61.v(byteString, com.google.crypto.tink.shaded.protobuf.k.a());
    }

    @Override // xsna.hey
    public final void f(o61 o61Var) throws GeneralSecurityException {
        o61 o61Var2 = o61Var;
        jjr0.c(o61Var2.t());
        if (o61Var2.s().size() == 64) {
            return;
        }
        throw new InvalidKeyException("invalid key size: " + o61Var2.s().size() + ". Valid keys must have 64 bytes.");
    }
}
