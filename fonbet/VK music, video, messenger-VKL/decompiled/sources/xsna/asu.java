package xsna;

import com.vk.knet.core.http.HttpMethod;
import java.io.ByteArrayOutputStream;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import kotlin.Pair;
import ru.ok.android.commons.http.Http;
import xsna.zjv;

/* compiled from: GzipRequestInterceptor.kt */
/* loaded from: classes.dex */
public final class asu implements ojv, uz80 {
    public static final HttpMethod a = HttpMethod.POST;
    public static final List<String> b = Collections.singletonList(Http.ContentEncoding.GZIP);

    @Override // xsna.ojv
    public final mkv a(zjv.a aVar) {
        Long n;
        ckv b2 = aVar.b();
        String c = b2.c(Http.Header.CONTENT_LENGTH);
        long longValue = (c == null || (n = arm0.n(c)) == null) ? 0L : n.longValue();
        if (b2.g() != a || longValue <= 180 || !zjy.c(b2)) {
            m63.j(m63.c(), new Pair("http.request.body.size", Long.valueOf(longValue)));
            return aVar.c(b2);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            dkv b3 = b2.b();
            gZIPOutputStream.write(b3 != null ? b3.getContent() : null);
            s3q0 s3q0Var = s3q0.a;
            gZIPOutputStream.close();
            dge dgeVar = new dge(b2, byteArrayOutputStream.toByteArray());
            int contentLength = dgeVar.getContentLength();
            m63.j(m63.c(), new Pair("http.request.body.size", Integer.valueOf(contentLength)), new Pair("http.request.content_encoding", Http.ContentEncoding.GZIP));
            LinkedHashMap linkedHashMap = new LinkedHashMap(b2.e());
            linkedHashMap.put(Http.Header.CONTENT_LENGTH, Collections.singletonList(String.valueOf(contentLength)));
            linkedHashMap.put(Http.Header.CONTENT_ENCODING, b);
            return aVar.c(ckv.a(b2, null, linkedHashMap, dgeVar, null, 19));
        } finally {
        }
    }

    @Override // xsna.uz80
    public final String getTag() {
        return "GzipRequest";
    }
}
