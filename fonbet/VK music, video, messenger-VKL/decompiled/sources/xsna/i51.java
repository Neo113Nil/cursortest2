package xsna;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import xsna.f51;
import xsna.hey;

/* compiled from: AesCmacKeyManager.java */
/* loaded from: classes.dex */
public final class i51 extends hey<f51> {

    /* compiled from: AesCmacKeyManager.java */
    /* loaded from: classes13.dex */
    public class a extends hey.a<g51, f51> {
        public a() {
            super(g51.class);
        }

        @Override // xsna.hey.a
        public final f51 a(g51 g51Var) throws GeneralSecurityException {
            g51 g51Var2 = g51Var;
            f51.b w = f51.w();
            w.l();
            f51.q((f51) w.c);
            byte[] a = ewe0.a(g51Var2.p());
            ByteString.g e = ByteString.e(0, a.length, a);
            w.l();
            f51.r((f51) w.c, e);
            j51 q = g51Var2.q();
            w.l();
            f51.s((f51) w.c, q);
            return w.j();
        }

        @Override // xsna.hey.a
        public final g51 b(ByteString byteString) throws InvalidProtocolBufferException {
            return g51.r(byteString, com.google.crypto.tink.shaded.protobuf.k.a());
        }

        @Override // xsna.hey.a
        public final void c(g51 g51Var) throws GeneralSecurityException {
            g51 g51Var2 = g51Var;
            i51.g(g51Var2.q());
            if (g51Var2.p() != 32) {
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
            }
        }
    }

    public static void g(j51 j51Var) throws GeneralSecurityException {
        if (j51Var.q() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (j51Var.q() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    @Override // xsna.hey
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // xsna.hey
    public final hey.a<?, f51> c() {
        return new a();
    }

    @Override // xsna.hey
    public final KeyData.KeyMaterialType d() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // xsna.hey
    public final f51 e(ByteString byteString) throws InvalidProtocolBufferException {
        return f51.x(byteString, com.google.crypto.tink.shaded.protobuf.k.a());
    }

    @Override // xsna.hey
    public final void f(f51 f51Var) throws GeneralSecurityException {
        f51 f51Var2 = f51Var;
        jjr0.c(f51Var2.v());
        if (f51Var2.t().size() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
        g(f51Var2.u());
    }
}
