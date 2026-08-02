package one.video.calls.sdk_private;

import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Stream;
import ru.ok.proto.rtmp.amf.AmfConstants;
import xsna.alk;
import xsna.cky0;
import xsna.i5s;
import xsna.ihy0;
import xsna.kh10;
import xsna.rhy0;
import xsna.tly0;
import xsna.y43;

/* compiled from: StreamFrame.java */
/* loaded from: classes8.dex */
public final class w extends ihy0 implements cky0 {
    public rhy0 b;
    public int c;
    public long d;
    public int e;
    public byte[] f;
    public boolean g;
    public int h;

    public w() {
    }

    @Override // xsna.ihy0
    public final int a() {
        return this.h;
    }

    @Override // xsna.ihy0
    public final void b(ByteBuffer byteBuffer) {
        if (this.h > byteBuffer.remaining()) {
            throw new IllegalArgumentException();
        }
        byteBuffer.put(this.g ? AmfConstants.TYPE_XML_DOCUMENT_MARKER : AmfConstants.TYPE_RECORDSET_MARKER);
        alk.d(this.c, byteBuffer);
        alk.g(this.d, byteBuffer);
        alk.d(this.e, byteBuffer);
        byteBuffer.put(this.f);
    }

    @Override // xsna.ihy0
    public final void c(bF bFVar, tly0 tly0Var, com.vk.movika.sdk.base.data.converter.c cVar) {
        try {
            bFVar.t().d(this);
        } catch (bJ e) {
            bFVar.m(e.a.n, null);
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(cky0 cky0Var) {
        cky0 cky0Var2 = cky0Var;
        return this.d != cky0Var2.d() ? Long.compare(this.d, cky0Var2.d()) : Long.compare(this.e, cky0Var2.e());
    }

    @Override // xsna.cky0
    public final long d() {
        return this.d;
    }

    @Override // xsna.cky0
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.c == wVar.c && this.d == wVar.d && this.e == wVar.e && this.g == wVar.g && Arrays.equals(this.f, wVar.f);
    }

    @Override // xsna.cky0
    public final long f() {
        return this.d + this.e;
    }

    @Override // xsna.cky0
    public final boolean g() {
        return this.g;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.c), Long.valueOf(this.d), Integer.valueOf(this.e));
    }

    public final void i(ByteBuffer byteBuffer) throws bq, bJ, bp {
        int position = byteBuffer.position();
        byte b = byteBuffer.get();
        boolean z = (b & 4) == 4;
        boolean z2 = (b & 2) == 2;
        this.g = (b & 1) == 1;
        this.c = ihy0.d(byteBuffer);
        this.b = (rhy0) Stream.of((Object[]) rhy0.values()).filter(new y43(this, 1)).findFirst().get();
        if (z) {
            this.d = alk.l(byteBuffer);
        }
        if (z2) {
            this.e = alk.j(byteBuffer);
        } else {
            this.e = byteBuffer.limit() - byteBuffer.position();
        }
        byte[] bArr = new byte[this.e];
        this.f = bArr;
        byteBuffer.get(bArr);
        this.h = byteBuffer.position() - position;
    }

    public final String toString() {
        int i = this.c;
        String str = this.b.b;
        long j = this.d;
        int i2 = this.e;
        String str2 = this.g ? ",fin" : "";
        StringBuilder a = kh10.a(i, "StreamFrame[", "(", str, "),");
        a.append(j);
        a.append(StringUtils.COMMA);
        a.append(i2);
        return i5s.a(a, str2, X3.j.e);
    }

    public w(final int i, long j, byte[] bArr, int i2, int i3, boolean z, int i4) {
        this.b = (rhy0) Stream.of((Object[]) rhy0.values()).filter(new Predicate() { // from class: xsna.qhy0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((rhy0) obj).a == (i & 3);
            }
        }).findFirst().get();
        this.c = i;
        this.d = j;
        byte[] bArr2 = new byte[i3];
        this.f = bArr2;
        ByteBuffer.wrap(bArr2).put(bArr, i2, i3);
        this.e = i3;
        this.g = z;
        this.h = alk.e(this.e) + alk.e(this.d) + alk.e(i) + 1 + this.e;
    }

    @Override // xsna.cky0
    public final byte[] b() {
        return this.f;
    }
}
