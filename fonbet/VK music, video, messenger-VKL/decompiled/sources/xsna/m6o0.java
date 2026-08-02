package xsna;

import android.util.Base64;
import com.vk.dto.common.Peer;
import com.vk.log.L;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.nio.ByteBuffer;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: TaskLoadMoreViaNetwork.java */
/* loaded from: classes2.dex */
public final class m6o0 implements io.reactivex.rxjava3.functions.b, bu90, gxp, aey {
    public static m6o0 c;
    public Object b;

    public /* synthetic */ m6o0(Object obj) {
        this.b = obj;
    }

    public static m6o0 e() {
        if (c == null) {
            c = new m6o0(new y6i("HmacSHA256"));
        }
        return c;
    }

    @Override // xsna.bu90
    public void a(Peer peer) {
        w2w w2wVar = (w2w) this.b;
        xgl0 I0 = w2wVar.I0();
        long j = peer.b;
    }

    @Override // xsna.aey
    public void a0() {
        s4m0 s4m0Var = ((n4m0) this.b).n;
        if (s4m0Var != null) {
            s4m0Var.k();
        }
    }

    @Override // io.reactivex.rxjava3.functions.b
    public void accept(Object obj, Object obj2) throws Throwable {
        Throwable th = (Throwable) obj2;
        n6o0 n6o0Var = (n6o0) this.b;
        if (th == null) {
            n6o0Var.h(null);
        } else {
            n6o0Var.g(th);
        }
    }

    @Override // xsna.aey
    public void b() {
        s4m0 s4m0Var = ((n4m0) this.b).n;
        if (s4m0Var != null) {
            s4m0Var.k();
        }
    }

    @Override // xsna.gxp
    public by2 c(Throwable th) {
        return new by2(0, 7, new lbe(this, 22));
    }

    public byte[] f(byte[] bArr, byte[] bArr2) {
        y6i y6iVar = (y6i) this.b;
        String str = (String) y6iVar.b;
        SecretKeySpec secretKeySpec = bArr.length <= 0 ? null : new SecretKeySpec(bArr, str);
        if (secretKeySpec == null) {
            int macLength = y6iVar.a().getMacLength();
            secretKeySpec = macLength > 0 ? new SecretKeySpec(new byte[macLength], str) : null;
        }
        if (bArr2 == null || bArr2.length <= 0) {
            throw new IllegalArgumentException("provided inputKeyingMaterial must be at least of size 1 and not null");
        }
        try {
            Mac a = y6iVar.a();
            a.init(secretKeySpec);
            return a.doFinal(bArr2);
        } catch (Exception e) {
            throw new IllegalStateException("could not make hmac hasher in hkdf", e);
        }
    }

    public byte[] g(byte[] bArr, byte[] bArr2, int i) {
        y6i y6iVar = (y6i) this.b;
        SecretKeySpec secretKeySpec = (bArr == null || bArr.length <= 0) ? null : new SecretKeySpec(bArr, (String) y6iVar.b);
        if (i <= 0) {
            throw new IllegalArgumentException("out length bytes must be at least 1");
        }
        if (secretKeySpec == null) {
            throw new IllegalArgumentException("provided pseudoRandomKey must not be null");
        }
        try {
            Mac a = y6iVar.a();
            a.init(secretKeySpec);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] bArr3 = new byte[0];
            int ceil = (int) Math.ceil(i / a.getMacLength());
            if (ceil > 255) {
                throw new IllegalArgumentException(tgw.b(i, "out length must be maximal 255 * hash-length; requested: ", " bytes"));
            }
            ByteBuffer allocate = ByteBuffer.allocate(i);
            int i2 = 0;
            while (i2 < ceil) {
                a.update(bArr3);
                a.update(bArr2);
                i2++;
                a.update((byte) i2);
                bArr3 = a.doFinal();
                int min = Math.min(i, bArr3.length);
                allocate.put(bArr3, 0, min);
                i -= min;
            }
            return allocate.array();
        } catch (Exception e) {
            throw new IllegalStateException("could not make hmac hasher in hkdf", e);
        }
    }

    public MobileOfficialAppsCoreNavStat$EventScreen h() {
        return (MobileOfficialAppsCoreNavStat$EventScreen) this.b;
    }

    public byte[] i() {
        byte[] decode = Base64.decode("8pzhY9qEnR3W6/RNGBcl5krFlyD2j2RdwgHqYlQ0Bqs=", 0);
        if (decode == null) {
            L.l("Wrong input data");
            return null;
        }
        byte[] bytes = ((String) this.b).toString().getBytes(emb.b);
        if (decode.length + bytes.length < 32) {
            L.l("Not enough data to get a key");
            return null;
        }
        int length = 32 - bytes.length;
        if (length <= 0 || decode.length < length) {
            L.l("Invalid data for key");
            return null;
        }
        byte[] bArr = new byte[32];
        System.arraycopy(bytes, 0, bArr, 0, Math.min(32, bytes.length));
        System.arraycopy(decode, 0, bArr, bytes.length, length);
        return bArr;
    }
}
