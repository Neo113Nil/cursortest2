package okhttp3.internal.http2;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.ironsource.Hb;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.internal.http2.b;
import okio.ByteString;
import ru.ok.android.externcalls.sdk.rate.connection.CandidateTypeHintConfig;
import xsna.e8f0;
import xsna.epx;
import xsna.jw5;
import xsna.nlv;
import xsna.vl8;
import xsna.wvu;
import xsna.x2r0;

/* compiled from: Hpack.kt */
/* loaded from: classes8.dex */
public final class a {
    public static final wvu[] a;
    public static final Map<ByteString, Integer> b;

    /* compiled from: Hpack.kt */
    /* renamed from: okhttp3.internal.http2.a$a, reason: collision with other inner class name */
    public static final class C2166a {
        public final e8f0 c;
        public int f;
        public int g;
        public int a = 4096;
        public final ArrayList b = new ArrayList();
        public wvu[] d = new wvu[8];
        public int e = 7;

        public C2166a(b.C2167b c2167b) {
            this.c = new e8f0(c2167b);
        }

        public final int a(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.d.length;
                while (true) {
                    length--;
                    i2 = this.e;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    int i4 = this.d[length].c;
                    i -= i4;
                    this.g -= i4;
                    this.f--;
                    i3++;
                }
                wvu[] wvuVarArr = this.d;
                System.arraycopy(wvuVarArr, i2 + 1, wvuVarArr, i2 + 1 + i3, this.f);
                this.e += i3;
            }
            return i3;
        }

        public final ByteString b(int i) throws IOException {
            if (i >= 0) {
                wvu[] wvuVarArr = a.a;
                if (i <= wvuVarArr.length - 1) {
                    return wvuVarArr[i].a;
                }
            }
            int length = this.e + 1 + (i - a.a.length);
            if (length >= 0) {
                wvu[] wvuVarArr2 = this.d;
                if (length < wvuVarArr2.length) {
                    return wvuVarArr2[length].a;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        public final void c(wvu wvuVar) {
            this.b.add(wvuVar);
            int i = wvuVar.c;
            int i2 = this.a;
            if (i > i2) {
                jw5.p(null, this.d);
                this.e = this.d.length - 1;
                this.f = 0;
                this.g = 0;
                return;
            }
            a((this.g + i) - i2);
            int i3 = this.f + 1;
            wvu[] wvuVarArr = this.d;
            if (i3 > wvuVarArr.length) {
                wvu[] wvuVarArr2 = new wvu[wvuVarArr.length * 2];
                System.arraycopy(wvuVarArr, 0, wvuVarArr2, wvuVarArr.length, wvuVarArr.length);
                this.e = this.d.length - 1;
                this.d = wvuVarArr2;
            }
            int i4 = this.e;
            this.e = i4 - 1;
            this.d[i4] = wvuVar;
            this.f++;
            this.g += i;
        }

        public final ByteString d() throws IOException {
            e8f0 e8f0Var = this.c;
            byte readByte = e8f0Var.readByte();
            byte[] bArr = x2r0.a;
            int i = readByte & 255;
            int i2 = 0;
            boolean z = (readByte & 128) == 128;
            long e = e(i, 127);
            if (!z) {
                return e8f0Var.F0(e);
            }
            vl8 vl8Var = new vl8();
            nlv.a aVar = nlv.c;
            nlv.a aVar2 = aVar;
            int i3 = 0;
            for (long j = 0; j < e; j++) {
                byte readByte2 = e8f0Var.readByte();
                byte[] bArr2 = x2r0.a;
                i2 = (i2 << 8) | (readByte2 & 255);
                i3 += 8;
                while (i3 >= 8) {
                    aVar2 = aVar2.a[(i2 >>> (i3 - 8)) & 255];
                    if (aVar2.a == null) {
                        vl8Var.I(aVar2.b);
                        i3 -= aVar2.c;
                        aVar2 = aVar;
                    } else {
                        i3 -= 8;
                    }
                }
            }
            while (i3 > 0) {
                nlv.a aVar3 = aVar2.a[(i2 << (8 - i3)) & 255];
                nlv.a[] aVarArr = aVar3.a;
                int i4 = aVar3.c;
                if (aVarArr != null || i4 > i3) {
                    break;
                }
                vl8Var.I(aVar3.b);
                i3 -= i4;
                aVar2 = aVar;
            }
            return vl8Var.F0(vl8Var.c);
        }

        public final int e(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                byte readByte = this.c.readByte();
                byte[] bArr = x2r0.a;
                int i5 = readByte & 255;
                if ((readByte & 128) == 0) {
                    return i2 + (i5 << i4);
                }
                i2 += (readByte & Byte.MAX_VALUE) << i4;
                i4 += 7;
            }
        }
    }

    /* compiled from: Hpack.kt */
    public static final class b {
        public final vl8 a;
        public boolean c;
        public int g;
        public int h;
        public int b = Integer.MAX_VALUE;
        public int d = 4096;
        public wvu[] e = new wvu[8];
        public int f = 7;

        public b(vl8 vl8Var) {
            this.a = vl8Var;
        }

        public final void a(int i) {
            int i2;
            if (i > 0) {
                int length = this.e.length - 1;
                int i3 = 0;
                while (true) {
                    i2 = this.f;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    int i4 = this.e[length].c;
                    i -= i4;
                    this.h -= i4;
                    this.g--;
                    i3++;
                    length--;
                }
                wvu[] wvuVarArr = this.e;
                int i5 = i2 + 1;
                System.arraycopy(wvuVarArr, i5, wvuVarArr, i5 + i3, this.g);
                wvu[] wvuVarArr2 = this.e;
                int i6 = this.f + 1;
                Arrays.fill(wvuVarArr2, i6, i6 + i3, (Object) null);
                this.f += i3;
            }
        }

        public final void b(wvu wvuVar) {
            int i = wvuVar.c;
            int i2 = this.d;
            if (i > i2) {
                wvu[] wvuVarArr = this.e;
                Arrays.fill(wvuVarArr, 0, wvuVarArr.length, (Object) null);
                this.f = this.e.length - 1;
                this.g = 0;
                this.h = 0;
                return;
            }
            a((this.h + i) - i2);
            int i3 = this.g + 1;
            wvu[] wvuVarArr2 = this.e;
            if (i3 > wvuVarArr2.length) {
                wvu[] wvuVarArr3 = new wvu[wvuVarArr2.length * 2];
                System.arraycopy(wvuVarArr2, 0, wvuVarArr3, wvuVarArr2.length, wvuVarArr2.length);
                this.f = this.e.length - 1;
                this.e = wvuVarArr3;
            }
            int i4 = this.f;
            this.f = i4 - 1;
            this.e[i4] = wvuVar;
            this.g++;
            this.h += i;
        }

        public final void c(ByteString byteString) throws IOException {
            int[] iArr = nlv.a;
            int n = byteString.n();
            long j = 0;
            long j2 = 0;
            for (int i = 0; i < n; i++) {
                byte s = byteString.s(i);
                byte[] bArr = x2r0.a;
                j2 += nlv.b[s & 255];
            }
            int i2 = (int) ((j2 + 7) >> 3);
            int n2 = byteString.n();
            vl8 vl8Var = this.a;
            if (i2 >= n2) {
                e(byteString.n(), 127, 0);
                byteString.B(vl8Var, byteString.n());
                return;
            }
            vl8 vl8Var2 = new vl8();
            int[] iArr2 = nlv.a;
            int n3 = byteString.n();
            int i3 = 0;
            for (int i4 = 0; i4 < n3; i4++) {
                byte s2 = byteString.s(i4);
                byte[] bArr2 = x2r0.a;
                int i5 = s2 & 255;
                int i6 = nlv.a[i5];
                byte b = nlv.b[i5];
                j = (j << b) | i6;
                i3 += b;
                while (i3 >= 8) {
                    i3 -= 8;
                    vl8Var2.I((int) (j >> i3));
                }
            }
            if (i3 > 0) {
                vl8Var2.I((int) ((j << (8 - i3)) | (255 >>> i3)));
            }
            ByteString F0 = vl8Var2.F0(vl8Var2.c);
            e(F0.n(), 127, 128);
            F0.B(vl8Var, F0.n());
        }

        public final void d(ArrayList arrayList) throws IOException {
            int i;
            int i2;
            if (this.c) {
                int i3 = this.b;
                if (i3 < this.d) {
                    e(i3, 31, 32);
                }
                this.c = false;
                this.b = Integer.MAX_VALUE;
                e(this.d, 31, 32);
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                wvu wvuVar = (wvu) arrayList.get(i4);
                ByteString y = wvuVar.a.y();
                ByteString byteString = wvuVar.b;
                Integer num = a.b.get(y);
                if (num != null) {
                    int intValue = num.intValue();
                    i2 = intValue + 1;
                    if (2 <= i2 && i2 < 8) {
                        wvu[] wvuVarArr = a.a;
                        if (epx.f(wvuVarArr[intValue].b, byteString)) {
                            i = i2;
                        } else if (epx.f(wvuVarArr[i2].b, byteString)) {
                            i2 = intValue + 2;
                            i = i2;
                        }
                    }
                    i = i2;
                    i2 = -1;
                } else {
                    i = -1;
                    i2 = -1;
                }
                if (i2 == -1) {
                    int i5 = this.f + 1;
                    int length = this.e.length;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        if (epx.f(this.e[i5].a, y)) {
                            if (epx.f(this.e[i5].b, byteString)) {
                                i2 = a.a.length + (i5 - this.f);
                                break;
                            } else if (i == -1) {
                                i = (i5 - this.f) + a.a.length;
                            }
                        }
                        i5++;
                    }
                }
                if (i2 != -1) {
                    e(i2, 127, 128);
                } else if (i == -1) {
                    this.a.I(64);
                    c(y);
                    c(byteString);
                    b(wvuVar);
                } else {
                    ByteString byteString2 = wvu.d;
                    y.getClass();
                    if (!y.v(0, byteString2, byteString2.n()) || epx.f(wvu.i, y)) {
                        e(i, 63, 64);
                        c(byteString);
                        b(wvuVar);
                    } else {
                        e(i, 15, 0);
                        c(byteString);
                    }
                }
            }
        }

        public final void e(int i, int i2, int i3) {
            vl8 vl8Var = this.a;
            if (i < i2) {
                vl8Var.I(i | i3);
                return;
            }
            vl8Var.I(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                vl8Var.I(128 | (i4 & 127));
                i4 >>>= 7;
            }
            vl8Var.I(i4);
        }
    }

    static {
        wvu wvuVar = new wvu("", wvu.i);
        ByteString byteString = wvu.f;
        wvu wvuVar2 = new wvu("GET", byteString);
        wvu wvuVar3 = new wvu("POST", byteString);
        ByteString byteString2 = wvu.g;
        wvu wvuVar4 = new wvu(DomExceptionUtils.SEPARATOR, byteString2);
        wvu wvuVar5 = new wvu("/index.html", byteString2);
        ByteString byteString3 = wvu.h;
        wvu wvuVar6 = new wvu("http", byteString3);
        wvu wvuVar7 = new wvu(HttpRequest.DEFAULT_SCHEME, byteString3);
        ByteString byteString4 = wvu.e;
        wvu[] wvuVarArr = {wvuVar, wvuVar2, wvuVar3, wvuVar4, wvuVar5, wvuVar6, wvuVar7, new wvu("200", byteString4), new wvu("204", byteString4), new wvu("206", byteString4), new wvu("304", byteString4), new wvu("400", byteString4), new wvu("404", byteString4), new wvu("500", byteString4), new wvu("accept-charset", ""), new wvu("accept-encoding", "gzip, deflate"), new wvu("accept-language", ""), new wvu("accept-ranges", ""), new wvu("accept", ""), new wvu("access-control-allow-origin", ""), new wvu("age", ""), new wvu("allow", ""), new wvu("authorization", ""), new wvu("cache-control", ""), new wvu("content-disposition", ""), new wvu("content-encoding", ""), new wvu("content-language", ""), new wvu("content-length", ""), new wvu("content-location", ""), new wvu("content-range", ""), new wvu("content-type", ""), new wvu("cookie", ""), new wvu("date", ""), new wvu(DownloadModel.ETAG, ""), new wvu("expect", ""), new wvu("expires", ""), new wvu("from", ""), new wvu(CandidateTypeHintConfig.TYPE_HOST, ""), new wvu("if-match", ""), new wvu("if-modified-since", ""), new wvu("if-none-match", ""), new wvu("if-range", ""), new wvu("if-unmodified-since", ""), new wvu("last-modified", ""), new wvu("link", ""), new wvu("location", ""), new wvu("max-forwards", ""), new wvu("proxy-authenticate", ""), new wvu("proxy-authorization", ""), new wvu("range", ""), new wvu("referer", ""), new wvu(ToolBar.REFRESH, ""), new wvu("retry-after", ""), new wvu(Hb.a, ""), new wvu("set-cookie", ""), new wvu("strict-transport-security", ""), new wvu("transfer-encoding", ""), new wvu("user-agent", ""), new wvu("vary", ""), new wvu("via", ""), new wvu("www-authenticate", "")};
        a = wvuVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(wvuVarArr[i].a)) {
                linkedHashMap.put(wvuVarArr[i].a, Integer.valueOf(i));
            }
        }
        b = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void a(ByteString byteString) throws IOException {
        int n = byteString.n();
        for (int i = 0; i < n; i++) {
            byte s = byteString.s(i);
            if (65 <= s && s < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(byteString.A()));
            }
        }
    }
}
