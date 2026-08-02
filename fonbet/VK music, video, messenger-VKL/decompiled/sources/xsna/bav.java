package xsna;

import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;
import xsna.hey;
import xsna.z9v;

/* compiled from: HmacKeyManager.java */
/* loaded from: classes.dex */
public final class bav extends hey<z9v> {

    /* compiled from: HmacKeyManager.java */
    public final class a extends hey.b<dc00, z9v> {
        @Override // xsna.hey.b
        public final Object a(ka20 ka20Var) throws GeneralSecurityException {
            z9v z9vVar = (z9v) ka20Var;
            HashType q = z9vVar.v().q();
            SecretKeySpec secretKeySpec = new SecretKeySpec(z9vVar.u().m(), "HMAC");
            int r = z9vVar.v().r();
            int i = c.a[q.ordinal()];
            if (i == 1) {
                return new j6d0(new i6d0("HMACSHA1", secretKeySpec), r);
            }
            if (i == 2) {
                return new j6d0(new i6d0("HMACSHA256", secretKeySpec), r);
            }
            if (i == 3) {
                return new j6d0(new i6d0("HMACSHA512", secretKeySpec), r);
            }
            throw new GeneralSecurityException("unknown hash");
        }
    }

    /* compiled from: HmacKeyManager.java */
    /* loaded from: classes13.dex */
    public class b extends hey.a<aav, z9v> {
        public b(bav bavVar) {
            super(aav.class);
        }

        @Override // xsna.hey.a
        public final z9v a(aav aavVar) throws GeneralSecurityException {
            aav aavVar2 = aavVar;
            z9v.b x = z9v.x();
            x.l();
            z9v.q((z9v) x.c);
            cav r = aavVar2.r();
            x.l();
            z9v.r((z9v) x.c, r);
            byte[] a = ewe0.a(aavVar2.q());
            ByteString.g e = ByteString.e(0, a.length, a);
            x.l();
            z9v.s((z9v) x.c, e);
            return x.j();
        }

        @Override // xsna.hey.a
        public final aav b(ByteString byteString) throws InvalidProtocolBufferException {
            return aav.s(byteString, com.google.crypto.tink.shaded.protobuf.k.a());
        }

        @Override // xsna.hey.a
        public final void c(aav aavVar) throws GeneralSecurityException {
            aav aavVar2 = aavVar;
            if (aavVar2.q() < 16) {
                throw new GeneralSecurityException("key too short");
            }
            bav.g(aavVar2.r());
        }
    }

    /* compiled from: HmacKeyManager.java */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[HashType.values().length];
            a = iArr;
            try {
                iArr[HashType.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[HashType.SHA256.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[HashType.SHA512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static void g(cav cavVar) throws GeneralSecurityException {
        if (cavVar.r() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int i = c.a[cavVar.q().ordinal()];
        if (i == 1) {
            if (cavVar.r() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (i == 2) {
            if (cavVar.r() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (i != 3) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (cavVar.r() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // xsna.hey
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // xsna.hey
    public final hey.a<?, z9v> c() {
        return new b(this);
    }

    @Override // xsna.hey
    public final KeyData.KeyMaterialType d() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // xsna.hey
    public final z9v e(ByteString byteString) throws InvalidProtocolBufferException {
        return z9v.y(byteString, com.google.crypto.tink.shaded.protobuf.k.a());
    }

    @Override // xsna.hey
    public final void f(z9v z9vVar) throws GeneralSecurityException {
        z9v z9vVar2 = z9vVar;
        jjr0.c(z9vVar2.w());
        if (z9vVar2.u().size() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        g(z9vVar2.v());
    }
}
