package xsna;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import xsna.hey;
import xsna.yiy;

/* compiled from: KmsAeadKeyManager.java */
/* loaded from: classes.dex */
public final class bjy extends hey<yiy> {

    /* compiled from: KmsAeadKeyManager.java */
    /* loaded from: classes13.dex */
    public class a extends hey.a<ziy, yiy> {
        public a(bjy bjyVar) {
            super(ziy.class);
        }

        @Override // xsna.hey.a
        public final yiy a(ziy ziyVar) throws GeneralSecurityException {
            yiy.b u = yiy.u();
            u.l();
            yiy.r((yiy) u.c, ziyVar);
            u.l();
            yiy.q((yiy) u.c);
            return u.j();
        }

        @Override // xsna.hey.a
        public final ziy b(ByteString byteString) throws InvalidProtocolBufferException {
            return ziy.r(byteString, com.google.crypto.tink.shaded.protobuf.k.a());
        }

        @Override // xsna.hey.a
        public final /* bridge */ /* synthetic */ void c(ziy ziyVar) throws GeneralSecurityException {
        }
    }

    @Override // xsna.hey
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    @Override // xsna.hey
    public final hey.a<?, yiy> c() {
        return new a(this);
    }

    @Override // xsna.hey
    public final KeyData.KeyMaterialType d() {
        return KeyData.KeyMaterialType.REMOTE;
    }

    @Override // xsna.hey
    public final yiy e(ByteString byteString) throws InvalidProtocolBufferException {
        return yiy.v(byteString, com.google.crypto.tink.shaded.protobuf.k.a());
    }

    @Override // xsna.hey
    public final void f(yiy yiyVar) throws GeneralSecurityException {
        jjr0.c(yiyVar.t());
    }
}
