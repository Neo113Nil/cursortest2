package one.video.calls.sdk_private;

import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.ByteBuffer;
import ru.ok.proto.rtmp.amf.AmfConstants;
import xsna.alk;
import xsna.cky0;
import xsna.eq0;
import xsna.ihy0;
import xsna.tly0;
import xsna.wby0;

/* compiled from: CryptoFrame.java */
/* loaded from: classes8.dex */
public final class c extends ihy0 implements cky0 {
    public long b;
    public int c;
    public byte[] d;

    @Override // xsna.ihy0
    public final int a() {
        return alk.e(this.d.length) + alk.e(this.b) + 1 + this.d.length;
    }

    @Override // xsna.ihy0
    public final void b(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 6);
        alk.g(this.b, byteBuffer);
        alk.d(this.d.length, byteBuffer);
        byteBuffer.put(this.d);
    }

    @Override // xsna.ihy0
    public final void c(bF bFVar, tly0 tly0Var, com.vk.movika.sdk.base.data.converter.c cVar) {
        try {
            bFVar.b(tly0Var.n()).b(this);
            wby0 b = bFVar.b(tly0Var.n());
            b.a(b.g);
        } catch (bJ e) {
            bFVar.f(e);
            bFVar.m(e.a.n, "");
        } catch (g e2) {
            bFVar.f(e2);
            bFVar.m(e2 instanceof l ? ((l) e2).a.k + AmfConstants.TYPE_NUMBER_MARKER : e2.getCause() instanceof bJ ? ((bJ) e2.getCause()).a.n : ap$a.INTERNAL_ERROR.n, e2.getMessage());
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(cky0 cky0Var) {
        cky0 cky0Var2 = cky0Var;
        return this.b != cky0Var2.d() ? Long.compare(this.b, cky0Var2.d()) : Long.compare(this.c, cky0Var2.e());
    }

    @Override // xsna.cky0
    public final long d() {
        return this.b;
    }

    @Override // xsna.cky0
    public final int e() {
        return this.c;
    }

    @Override // xsna.cky0
    public final long f() {
        return this.b + this.c;
    }

    @Override // xsna.cky0
    public final boolean g() {
        return false;
    }

    public final void i(ByteBuffer byteBuffer) throws bq, bp {
        byteBuffer.get();
        this.b = alk.l(byteBuffer);
        int j = alk.j(byteBuffer);
        this.c = j;
        byte[] bArr = new byte[j];
        this.d = bArr;
        byteBuffer.get(bArr);
    }

    public final String toString() {
        StringBuilder a = eq0.a(this.c, "CryptoFrame[", StringUtils.COMMA, this.b);
        a.append(X3.j.e);
        return a.toString();
    }

    @Override // xsna.cky0
    public final byte[] b() {
        return this.d;
    }
}
