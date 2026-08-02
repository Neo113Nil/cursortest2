package xsna;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import xsna.hey;
import xsna.w3y0;

/* compiled from: XChaCha20Poly1305KeyManager.java */
/* loaded from: classes.dex */
public final class z3y0 extends hey<w3y0> {

    /* compiled from: XChaCha20Poly1305KeyManager.java */
    /* loaded from: classes13.dex */
    public class a extends hey.a<x3y0, w3y0> {
        public a(z3y0 z3y0Var) {
            super(x3y0.class);
        }

        @Override // xsna.hey.a
        public final w3y0 a(x3y0 x3y0Var) throws GeneralSecurityException {
            w3y0.b u = w3y0.u();
            u.l();
            w3y0.q((w3y0) u.c);
            byte[] a = ewe0.a(32);
            ByteString.g e = ByteString.e(0, a.length, a);
            u.l();
            w3y0.r((w3y0) u.c, e);
            return u.j();
        }

        @Override // xsna.hey.a
        public final x3y0 b(ByteString byteString) throws InvalidProtocolBufferException {
            return x3y0.p(byteString, com.google.crypto.tink.shaded.protobuf.k.a());
        }

        @Override // xsna.hey.a
        public final /* bridge */ /* synthetic */ void c(x3y0 x3y0Var) throws GeneralSecurityException {
        }
    }

    @Override // xsna.hey
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // xsna.hey
    public final hey.a<?, w3y0> c() {
        return new a(this);
    }

    @Override // xsna.hey
    public final KeyData.KeyMaterialType d() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // xsna.hey
    public final w3y0 e(ByteString byteString) throws InvalidProtocolBufferException {
        return w3y0.v(byteString, com.google.crypto.tink.shaded.protobuf.k.a());
    }

    @Override // xsna.hey
    public final void f(w3y0 w3y0Var) throws GeneralSecurityException {
        w3y0 w3y0Var2 = w3y0Var;
        jjr0.c(w3y0Var2.t());
        if (w3y0Var2.s().size() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }
}
