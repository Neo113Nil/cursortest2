package xsna;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import xsna.fjy;
import xsna.hey;

/* compiled from: KmsEnvelopeAeadKeyManager.java */
/* loaded from: classes.dex */
public final class ijy extends hey<fjy> {

    /* compiled from: KmsEnvelopeAeadKeyManager.java */
    /* loaded from: classes13.dex */
    public class a extends hey.a<gjy, fjy> {
        public a(ijy ijyVar) {
            super(gjy.class);
        }

        @Override // xsna.hey.a
        public final fjy a(gjy gjyVar) throws GeneralSecurityException {
            fjy.b u = fjy.u();
            u.l();
            fjy.r((fjy) u.c, gjyVar);
            u.l();
            fjy.q((fjy) u.c);
            return u.j();
        }

        @Override // xsna.hey.a
        public final gjy b(ByteString byteString) throws InvalidProtocolBufferException {
            return gjy.s(byteString, com.google.crypto.tink.shaded.protobuf.k.a());
        }

        @Override // xsna.hey.a
        public final /* bridge */ /* synthetic */ void c(gjy gjyVar) throws GeneralSecurityException {
        }
    }

    @Override // xsna.hey
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // xsna.hey
    public final hey.a<?, fjy> c() {
        return new a(this);
    }

    @Override // xsna.hey
    public final KeyData.KeyMaterialType d() {
        return KeyData.KeyMaterialType.REMOTE;
    }

    @Override // xsna.hey
    public final fjy e(ByteString byteString) throws InvalidProtocolBufferException {
        return fjy.v(byteString, com.google.crypto.tink.shaded.protobuf.k.a());
    }

    @Override // xsna.hey
    public final void f(fjy fjyVar) throws GeneralSecurityException {
        jjr0.c(fjyVar.t());
    }
}
