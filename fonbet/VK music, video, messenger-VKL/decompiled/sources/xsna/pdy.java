package xsna;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import xsna.hey;
import xsna.ka20;

/* compiled from: KeyManagerImpl.java */
/* loaded from: classes.dex */
public final class pdy<PrimitiveT, KeyProtoT extends ka20> {
    public final hey<KeyProtoT> a;
    public final Class<PrimitiveT> b;

    /* compiled from: KeyManagerImpl.java */
    /* loaded from: classes13.dex */
    public static class a<KeyFormatProtoT extends ka20, KeyProtoT extends ka20> {
        public final hey.a<KeyFormatProtoT, KeyProtoT> a;

        public a(hey.a<KeyFormatProtoT, KeyProtoT> aVar) {
            this.a = aVar;
        }

        public final KeyProtoT a(ByteString byteString) throws GeneralSecurityException, InvalidProtocolBufferException {
            hey.a<KeyFormatProtoT, KeyProtoT> aVar = this.a;
            KeyFormatProtoT b = aVar.b(byteString);
            aVar.c(b);
            return aVar.a(b);
        }
    }

    public pdy(hey<KeyProtoT> heyVar, Class<PrimitiveT> cls) {
        if (!heyVar.b.keySet().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(y57.a("Given internalKeyMananger ", heyVar.toString(), " does not support primitive class ", cls.getName()));
        }
        this.a = heyVar;
        this.b = cls;
    }

    public final KeyData a(ByteString byteString) throws GeneralSecurityException {
        hey<KeyProtoT> heyVar = this.a;
        try {
            ka20 a2 = new a(heyVar.c()).a(byteString);
            KeyData.b x = KeyData.x();
            x.p(heyVar.a());
            x.q(a2.toByteString());
            x.o(heyVar.d());
            return x.j();
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }
}
