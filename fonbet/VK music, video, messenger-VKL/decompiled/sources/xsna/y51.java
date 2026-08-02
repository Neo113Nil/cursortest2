package xsna;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import xsna.hey;
import xsna.v51;

/* compiled from: AesEaxKeyManager.java */
/* loaded from: classes.dex */
public final class y51 extends hey<v51> {

    /* compiled from: AesEaxKeyManager.java */
    /* loaded from: classes13.dex */
    public class a extends hey.a<w51, v51> {
        public a(y51 y51Var) {
            super(w51.class);
        }

        @Override // xsna.hey.a
        public final v51 a(w51 w51Var) throws GeneralSecurityException {
            w51 w51Var2 = w51Var;
            v51.b w = v51.w();
            byte[] a = ewe0.a(w51Var2.p());
            ByteString.g e = ByteString.e(0, a.length, a);
            w.l();
            v51.s((v51) w.c, e);
            z51 q = w51Var2.q();
            w.l();
            v51.r((v51) w.c, q);
            w.l();
            v51.q((v51) w.c);
            return w.j();
        }

        @Override // xsna.hey.a
        public final w51 b(ByteString byteString) throws InvalidProtocolBufferException {
            return w51.r(byteString, com.google.crypto.tink.shaded.protobuf.k.a());
        }

        @Override // xsna.hey.a
        public final void c(w51 w51Var) throws GeneralSecurityException {
            w51 w51Var2 = w51Var;
            jjr0.a(w51Var2.p());
            if (w51Var2.q().q() != 12 && w51Var2.q().q() != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }

    @Override // xsna.hey
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // xsna.hey
    public final hey.a<?, v51> c() {
        return new a(this);
    }

    @Override // xsna.hey
    public final KeyData.KeyMaterialType d() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // xsna.hey
    public final v51 e(ByteString byteString) throws InvalidProtocolBufferException {
        return v51.x(byteString, com.google.crypto.tink.shaded.protobuf.k.a());
    }

    @Override // xsna.hey
    public final void f(v51 v51Var) throws GeneralSecurityException {
        v51 v51Var2 = v51Var;
        jjr0.c(v51Var2.v());
        jjr0.a(v51Var2.t().size());
        if (v51Var2.u().q() != 12 && v51Var2.u().q() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
