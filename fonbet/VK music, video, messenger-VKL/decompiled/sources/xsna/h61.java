package xsna;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import xsna.e61;
import xsna.hey;

/* compiled from: AesGcmKeyManager.java */
/* loaded from: classes.dex */
public final class h61 extends hey<e61> {

    /* compiled from: AesGcmKeyManager.java */
    /* loaded from: classes13.dex */
    public class a extends hey.a<f61, e61> {
        public a(h61 h61Var) {
            super(f61.class);
        }

        @Override // xsna.hey.a
        public final e61 a(f61 f61Var) throws GeneralSecurityException {
            e61.b u = e61.u();
            byte[] a = ewe0.a(f61Var.r());
            ByteString.g e = ByteString.e(0, a.length, a);
            u.l();
            e61.r((e61) u.c, e);
            u.l();
            e61.q((e61) u.c);
            return u.j();
        }

        @Override // xsna.hey.a
        public final f61 b(ByteString byteString) throws InvalidProtocolBufferException {
            return f61.t(byteString, com.google.crypto.tink.shaded.protobuf.k.a());
        }

        @Override // xsna.hey.a
        public final void c(f61 f61Var) throws GeneralSecurityException {
            jjr0.a(f61Var.r());
        }
    }

    @Override // xsna.hey
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // xsna.hey
    public final hey.a<?, e61> c() {
        return new a(this);
    }

    @Override // xsna.hey
    public final KeyData.KeyMaterialType d() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // xsna.hey
    public final e61 e(ByteString byteString) throws InvalidProtocolBufferException {
        return e61.v(byteString, com.google.crypto.tink.shaded.protobuf.k.a());
    }

    @Override // xsna.hey
    public final void f(e61 e61Var) throws GeneralSecurityException {
        e61 e61Var2 = e61Var;
        jjr0.c(e61Var2.t());
        jjr0.a(e61Var2.s().size());
    }
}
