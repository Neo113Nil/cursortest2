package defpackage;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.a;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes11.dex */
public final class amx implements ve1 {
    public static final byte[] c = new byte[0];
    public final ijx a;
    public final aa2 b;

    public amx(ijx ijxVar, aa2 aa2Var) {
        this.a = ijxVar;
        this.b = aa2Var;
    }

    @Override // defpackage.ve1
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        vt10 b;
        ijx ijxVar = this.a;
        AtomicReference atomicReference = nri0.a;
        synchronized (nri0.class) {
            try {
                hjv hjvVar = ((pix) nri0.a.get()).a(ijxVar.C()).a;
                Class cls = (Class) hjvVar.c;
                if (!((Map) hjvVar.b).keySet().contains(cls) && !Void.class.equals(cls)) {
                    throw new IllegalArgumentException("Given internalKeyMananger " + hjvVar.toString() + " does not support primitive class " + cls.getName());
                }
                if (!((Boolean) nri0.c.get(ijxVar.C())).booleanValue()) {
                    throw new GeneralSecurityException("newKey-operation not permitted for key type " + ijxVar.C());
                }
                ByteString D = ijxVar.D();
                try {
                    w3 h = hjvVar.h();
                    vt10 h2 = h.h(D);
                    h.i(h2);
                    b = h.b(h2);
                } catch (InvalidProtocolBufferException e) {
                    throw new GeneralSecurityException("Failures parsing proto of type ".concat(hjvVar.h().b.getName()), e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        byte[] e2 = ((a) b).e();
        byte[] a = this.b.a(e2, c);
        byte[] a2 = ((ve1) nri0.c(this.a.C(), ByteString.f(0, e2.length, e2), ve1.class)).a(bArr, bArr2);
        return ByteBuffer.allocate(a.length + 4 + a2.length).putInt(a.length).put(a).put(a2).array();
    }

    @Override // defpackage.ve1
    public final byte[] b(byte[] bArr, byte[] bArr2) {
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
            byte[] b = this.b.b(bArr3, c);
            String C = this.a.C();
            AtomicReference atomicReference = nri0.a;
            ByteString byteString = ByteString.a;
            return ((ve1) nri0.c(C, ByteString.f(0, b.length, b), ve1.class)).b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e) {
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
