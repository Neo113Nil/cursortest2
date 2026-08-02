package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import one.video.calls.sdk_private.aB;
import one.video.calls.sdk_private.aF;
import one.video.calls.sdk_private.aG;
import one.video.calls.sdk_private.bB;
import one.video.calls.sdk_private.bC$a;
import one.video.calls.sdk_private.bE;
import one.video.calls.sdk_private.bF;
import one.video.calls.sdk_private.bG;
import ru.ok.proto.rtmp.amf.AmfConstants;
import xsna.cny0;

/* compiled from: RetryPacket.java */
/* loaded from: classes8.dex */
public final class uly0 extends tly0 {
    public static final byte[] k = {-52, -50, 24, 126, -48, -102, 9, -48, 87, 40, 21, 90, 108, -71, 107, -31};
    public static final byte[] l = {-66, AmfConstants.TYPE_LONG_STRING_MARKER, 105, AmfConstants.TYPE_DATE_MARKER, -97, 102, 87, 90, 29, 118, 107, 84, -29, 104, -56, 78};
    public static final byte[] m = {-113, -76, -80, 27, 86, -84, 72, -30, 96, -5, -53, -50, -83, 124, -52, -110};
    public static final byte[] n = {-27, 73, 48, -7, Byte.MAX_VALUE, 33, 54, -16, 83, 10, -116, 28};
    public static final byte[] o = {70, 21, -103, -45, 93, 99, 43, -14, 35, -104, 37, -69};
    public static final byte[] p = {-40, 105, 105, -68, 45, 124, 109, -103, -112, -17, -80, 74};
    public byte[] g;
    public byte[] h;
    public byte[] i;
    public byte[] j;

    @Override // xsna.tly0
    public final int b(int i) {
        throw new bB();
    }

    @Override // xsna.tly0
    public final bC$a d(bF bFVar, com.vk.movika.sdk.base.data.converter.c cVar) {
        bE bEVar = (bE) bFVar;
        if (Arrays.equals(w(bEVar.G.g), this.j) && !bEVar.W) {
            bEVar.W = true;
            bEVar.K = this.h;
            one.video.calls.sdk_private.x xVar = bEVar.B;
            byte[] bArr = bEVar.K;
            if (bArr != null) {
                ((nny0) xVar.j.b[aF.a.ordinal()]).i = bArr;
            }
            aF aFVar = aF.a;
            wby0 b = bEVar.b(aFVar);
            b.l = 0;
            b.m = 0;
            b.j.clear();
            byte[] bArr2 = this.g;
            hby0 hby0Var = bEVar.G.e;
            hby0Var.a.put(0, new gey0(0, bArr2, aB.b));
            hby0Var.b = bArr2;
            bEVar.G.i = bArr2;
            kq01.b(bArr2);
            sby0 sby0Var = bEVar.e;
            hby0 hby0Var2 = bEVar.G.e;
            sby0Var.d(hby0Var2 != null ? hby0Var2.b : new byte[0]);
            bEVar.D.i = bArr2;
            one.video.calls.sdk_private.x xVar2 = bEVar.B;
            aG aGVar = aG.a;
            cny0 cny0Var = xVar2.l;
            if (!cny0Var.p) {
                vmy0 vmy0Var = cny0Var.e[aGVar.ordinal()];
                synchronized (vmy0Var) {
                    vmy0Var.d.b((List) vmy0Var.f.values().stream().filter(new pmy0()).filter(new cip0(2)).collect(Collectors.toList()));
                    vmy0Var.f.clear();
                    vmy0Var.g.set(0);
                    vmy0Var.i = null;
                    vmy0Var.j = null;
                    vmy0Var.h = -1L;
                }
                synchronized (cny0Var.l) {
                    cny0Var.k.cancel(false);
                    cny0Var.n = null;
                    cny0Var.k = new cny0.a();
                }
            }
            bEVar.b(aFVar).c(bEVar.V);
        }
        return bC$a.a;
    }

    @Override // xsna.tly0
    public final void h(ByteBuffer byteBuffer, nby0 nby0Var, long j, sp spVar, int i) throws one.video.calls.sdk_private.bt, one.video.calls.sdk_private.bz {
        if (byteBuffer.remaining() < 23) {
            throw new one.video.calls.sdk_private.bz();
        }
        int remaining = byteBuffer.remaining();
        this.d = remaining;
        this.i = new byte[remaining];
        byteBuffer.get(this.i);
        byteBuffer.get();
        if (!new kgy0(byteBuffer.getInt()).equals(this.a)) {
            throw new one.video.calls.sdk_private.bz();
        }
        int i2 = byteBuffer.get();
        if (byteBuffer.remaining() < i2 + 17) {
            throw new one.video.calls.sdk_private.bz();
        }
        byte[] bArr = new byte[i2];
        this.e = bArr;
        byteBuffer.get(bArr);
        int i3 = byteBuffer.get();
        if (byteBuffer.remaining() < i3) {
            throw new one.video.calls.sdk_private.bz();
        }
        byte[] bArr2 = new byte[i3];
        this.g = bArr2;
        byteBuffer.get(bArr2);
        if (byteBuffer.remaining() < 16) {
            throw new one.video.calls.sdk_private.bz();
        }
        byte[] bArr3 = new byte[byteBuffer.remaining() - 16];
        this.h = bArr3;
        byteBuffer.get(bArr3);
        byte[] bArr4 = new byte[16];
        this.j = bArr4;
        byteBuffer.get(bArr4);
    }

    @Override // xsna.tly0
    public final byte[] j(nby0 nby0Var) {
        int length = this.e.length + 7 + this.g.length + this.h.length + 16;
        this.d = length;
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.put((byte) (((this.a.b() ? (byte) 0 : (byte) 3) << 4) | PsExtractor.AUDIO_STREAM));
        allocate.put(this.a.a());
        allocate.put((byte) this.e.length);
        allocate.put(this.e);
        allocate.put((byte) this.g.length);
        allocate.put(this.g);
        allocate.put(this.h);
        this.i = allocate.array();
        w(null);
        throw null;
    }

    @Override // xsna.tly0
    public final aF n() {
        return aF.a;
    }

    @Override // xsna.tly0
    public final aG o() {
        return null;
    }

    @Override // xsna.tly0
    public final Long p() {
        return null;
    }

    @Override // xsna.tly0
    public final boolean s() {
        return false;
    }

    @Override // xsna.tly0
    public final boolean t() {
        return false;
    }

    public final String toString() {
        char charAt = aF.a.name().charAt(0);
        int i = this.d;
        byte[] bArr = this.h;
        return "Packet " + charAt + "|-|R|" + i + "| Retry Token (" + bArr.length + "): " + kq01.b(bArr);
    }

    @Override // xsna.tly0
    public final boolean u() {
        return false;
    }

    public final byte[] w(byte[] bArr) {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 7 + this.e.length + 1 + this.g.length + this.h.length);
        allocate.put((byte) bArr.length);
        allocate.put(bArr);
        allocate.put(this.i, 0, r8.length - 16);
        try {
            kgy0 kgy0Var = this.a;
            SecretKeySpec secretKeySpec = new SecretKeySpec(kgy0Var.a == 1 ? l : kgy0Var.b() ? m : k, "AES");
            kgy0 kgy0Var2 = this.a;
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, kgy0Var2.a == 1 ? o : kgy0Var2.b() ? p : n);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, secretKeySpec, gCMParameterSpec);
            cipher.updateAAD(allocate.array());
            return cipher.doFinal(new byte[0]);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException unused) {
            throw new RuntimeException();
        } catch (NoSuchAlgorithmException e) {
            e = e;
            throw new bG(e);
        } catch (NoSuchPaddingException e2) {
            e = e2;
            throw new bG(e);
        }
    }
}
