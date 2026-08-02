package xsna;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import xsna.hey;
import xsna.vqa;

/* compiled from: ChaCha20Poly1305KeyManager.java */
/* loaded from: classes.dex */
public final class yqa extends hey<vqa> {

    /* compiled from: ChaCha20Poly1305KeyManager.java */
    /* loaded from: classes13.dex */
    public class a extends hey.a<wqa, vqa> {
        public a(yqa yqaVar) {
            super(wqa.class);
        }

        @Override // xsna.hey.a
        public final vqa a(wqa wqaVar) throws GeneralSecurityException {
            vqa.b u = vqa.u();
            u.l();
            vqa.q((vqa) u.c);
            byte[] a = ewe0.a(32);
            ByteString.g e = ByteString.e(0, a.length, a);
            u.l();
            vqa.r((vqa) u.c, e);
            return u.j();
        }

        @Override // xsna.hey.a
        public final wqa b(ByteString byteString) throws InvalidProtocolBufferException {
            return wqa.p(byteString, com.google.crypto.tink.shaded.protobuf.k.a());
        }

        @Override // xsna.hey.a
        public final /* bridge */ /* synthetic */ void c(wqa wqaVar) throws GeneralSecurityException {
        }
    }

    @Override // xsna.hey
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // xsna.hey
    public final hey.a<?, vqa> c() {
        return new a(this);
    }

    @Override // xsna.hey
    public final KeyData.KeyMaterialType d() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // xsna.hey
    public final vqa e(ByteString byteString) throws InvalidProtocolBufferException {
        return vqa.v(byteString, com.google.crypto.tink.shaded.protobuf.k.a());
    }

    @Override // xsna.hey
    public final void f(vqa vqaVar) throws GeneralSecurityException {
        vqa vqaVar2 = vqaVar;
        jjr0.c(vqaVar2.t());
        if (vqaVar2.s().size() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}
