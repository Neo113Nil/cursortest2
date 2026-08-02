package xsna;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.logging.Logger;
import xsna.hey;

/* compiled from: KmsEnvelopeAead.java */
/* loaded from: classes13.dex */
public final class ejy implements b51 {
    public static final byte[] c = new byte[0];
    public final dey a;
    public final b51 b;

    public ejy(dey deyVar, b51 b51Var) {
        this.a = deyVar;
        this.b = b51Var;
    }

    @Override // xsna.b51
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ka20 ka20Var;
        dey deyVar = this.a;
        Logger logger = mrf0.a;
        synchronized (mrf0.class) {
            try {
                pdy c2 = mrf0.b(deyVar.v()).c();
                if (!((Boolean) mrf0.d.get(deyVar.v())).booleanValue()) {
                    throw new GeneralSecurityException("newKey-operation not permitted for key type " + deyVar.v());
                }
                ByteString w = deyVar.w();
                try {
                    hey.a c3 = c2.a.c();
                    ka20 b = c3.b(w);
                    c3.c(b);
                    ka20Var = (ka20) c3.a(b);
                } catch (InvalidProtocolBufferException e) {
                    throw new GeneralSecurityException("Failures parsing proto of type ".concat(c2.a.c().a.getName()), e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        byte[] byteArray = ka20Var.toByteArray();
        byte[] a = this.b.a(byteArray, c);
        byte[] a2 = ((b51) mrf0.c(this.a.v(), byteArray)).a(bArr, bArr2);
        return ByteBuffer.allocate(a.length + 4 + a2.length).putInt(a.length).put(a).put(a2).array();
    }

    @Override // xsna.b51
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i = wrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            wrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            return ((b51) mrf0.c(this.a.v(), this.b.b(bArr3, c))).b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e) {
            e = e;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e2) {
            e = e2;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e3) {
            e = e3;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
