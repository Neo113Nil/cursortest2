package xsna;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import one.video.upload.exceptions.InvalidHttpResponseException;
import ru.ok.android.commons.http.Http;

/* compiled from: HTTPResponseReader.kt */
/* loaded from: classes8.dex */
public final class qsu {
    public Integer a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final ByteBuffer c = ByteBuffer.allocate(8096);

    /* compiled from: HTTPResponseReader.kt */
    public interface a {
        String readLine() throws IOException;

        long skip(long j) throws IOException;
    }

    /* compiled from: HTTPResponseReader.kt */
    public static final class b implements a {
        public final /* synthetic */ ByteArrayInputStream a;
        public final /* synthetic */ qsu b;

        public b(ByteArrayInputStream byteArrayInputStream, qsu qsuVar) {
            this.a = byteArrayInputStream;
            this.b = qsuVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
        
            return new java.lang.String(r0.toByteArray(), xsna.emb.b);
         */
        @Override // xsna.qsu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final String readLine() {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                ByteArrayInputStream byteArrayInputStream = this.a;
                int read = byteArrayInputStream.read();
                if (read == -1) {
                    break;
                }
                if (read == 10) {
                    break;
                }
                if (read != 13) {
                    byteArrayOutputStream.write(read);
                } else {
                    int read2 = byteArrayInputStream.read();
                    if (read2 != -1) {
                        if (read2 != 10) {
                            throw this.b.a("Invalid CR unfollowed by LF", new String(byteArrayOutputStream.toByteArray(), emb.b), null);
                        }
                    }
                }
            }
            return null;
        }

        @Override // xsna.qsu.a
        public final long skip(long j) {
            return this.a.skip(j);
        }
    }

    /* compiled from: HTTPResponseReader.kt */
    public static final class c implements a {
        public final /* synthetic */ BufferedReader a;

        public c(BufferedReader bufferedReader) {
            this.a = bufferedReader;
        }

        @Override // xsna.qsu.a
        public final String readLine() {
            return this.a.readLine();
        }

        @Override // xsna.qsu.a
        public final long skip(long j) {
            return this.a.skip(j);
        }
    }

    public final InvalidHttpResponseException a(String str, String str2, NumberFormatException numberFormatException) {
        ByteBuffer byteBuffer = this.c;
        StringBuilder b2 = i5s.b(str, ". line: '", str2, "' response '", new String(byteBuffer.array(), 0, byteBuffer.position(), emb.b));
        b2.append("'");
        return new InvalidHttpResponseException(b2.toString(), numberFormatException);
    }

    public final boolean b() throws IOException {
        int i;
        String readLine;
        boolean z = wn80.B;
        ByteBuffer byteBuffer = this.c;
        a bVar = z ? new b(new ByteArrayInputStream(byteBuffer.array(), byteBuffer.position(), byteBuffer.limit()), this) : new c(new BufferedReader(new InputStreamReader(new BufferedInputStream(new ByteArrayInputStream(byteBuffer.array(), byteBuffer.position(), byteBuffer.limit())))));
        String str = "";
        boolean z2 = true;
        while (true) {
            String readLine2 = bVar.readLine();
            if (readLine2 != null) {
                str = readLine2;
            } else {
                readLine2 = null;
            }
            if (readLine2 == null) {
                break;
            }
            if (!z2) {
                int length = str.length();
                LinkedHashMap linkedHashMap = this.b;
                if (length > 0) {
                    int L = drm0.L(str, ':', 0, 6);
                    if (L != -1) {
                        linkedHashMap.put(drm0.p0(erm0.D0(L, str)).toString(), drm0.p0(str.substring(L + 1)).toString());
                    }
                } else {
                    String str2 = (String) linkedHashMap.get("Transfer-Encoding");
                    String str3 = (String) linkedHashMap.get(Http.Header.CONTENT_LENGTH);
                    Long n = str3 != null ? arm0.n(str3) : null;
                    if (n == null) {
                        if ("chunked".equals(str2)) {
                            String readLine3 = bVar.readLine();
                            if (readLine3 != null) {
                                ro.d(16);
                                long parseLong = Long.parseLong(readLine3, 16);
                                while (parseLong > 0) {
                                    if (parseLong == bVar.skip(parseLong) && bVar.readLine() != null && (readLine = bVar.readLine()) != null) {
                                        ro.d(16);
                                        parseLong = Long.parseLong(readLine, 16);
                                    }
                                }
                            }
                        }
                        return true;
                    }
                    if (bVar.skip(n.longValue()) == n.longValue()) {
                        return true;
                    }
                }
            } else {
                if (str.length() < 12) {
                    break;
                }
                if (!brm0.B(str, "HTTP/", false)) {
                    throw a("Invalid HTTP response start", str, null);
                }
                int L2 = drm0.L(str, ' ', 4, 4);
                if (L2 == -1 || str.length() <= (i = L2 + 4)) {
                    break;
                }
                String substring = str.substring(L2 + 1, i);
                try {
                    this.a = Integer.valueOf(Integer.parseInt(substring));
                    z2 = false;
                } catch (NumberFormatException e) {
                    throw a(zr.a("Invalid HTTP response status code '", substring, "'"), str, e);
                }
            }
        }
        return false;
    }
}
