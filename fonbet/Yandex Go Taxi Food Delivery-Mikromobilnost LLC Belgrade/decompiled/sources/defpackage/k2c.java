package defpackage;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import ru.yandex.common.network.Request;
import ru.yandex.common.startup.StartupResponse;
import ru.yandex.common.startup.a;

/* loaded from: classes4.dex */
public abstract class k2c {
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0125, code lost:
    
        if (r5 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0134, code lost:
    
        if (r5 == null) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013a  */
    /* JADX WARN: Type inference failed for: r5v20, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static StartupResponse a(Request request) {
        HttpGet httpGet;
        InputStream inputStream;
        ?? hasNext;
        HttpEntity entity = request.getEntity();
        if (entity != null) {
            HttpPost httpPost = new HttpPost(request.getUrl());
            httpPost.addHeader(entity.getContentType());
            if (request.getHeaders() != null) {
                Iterator<Map.Entry<String, String>> it = request.getHeaders().entrySet().iterator();
                while (true) {
                    hasNext = it.hasNext();
                    if (hasNext == 0) {
                        break;
                    }
                    Map.Entry<String, String> next = it.next();
                    httpPost.addHeader(next.getKey(), next.getValue());
                }
            }
            httpPost.setEntity(entity);
            aez.b("[Client]", "HTTP POST: " + request.getUrl() + " entity: " + request.getEntity().toString());
            httpGet = httpPost;
        } else {
            HttpGet httpGet2 = new HttpGet(request.getUrl());
            aez.b("[Client]", "HTTP GET: " + request.getUrl());
            httpGet = httpGet2;
        }
        httpGet.addHeader("Content-Encoding", Request.PARAM_GZIP);
        InputStream inputStream2 = null;
        try {
            try {
                HttpResponse execute = i2c.a().execute(httpGet);
                inputStream = (execute == null || execute.getEntity() == null) ? null : (execute.getEntity().getContentEncoding() == null || !Request.PARAM_GZIP.equals(execute.getEntity().getContentEncoding().getValue())) ? execute.getEntity().getContent() : new GZIPInputStream(execute.getEntity().getContent());
                try {
                    a a = tf90.a(request.getMethod());
                    InputStream b = b(inputStream);
                    int statusCode = execute.getStatusLine().getStatusCode();
                    execute.getAllHeaders();
                    a.getClass();
                    StartupResponse b2 = a.b(statusCode, b);
                    if (execute.getEntity() != null) {
                        execute.getEntity().consumeContent();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return b2;
                } catch (UnsupportedEncodingException e) {
                    e = e;
                    aez.a("[Client]", "Can't execute request", e);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return null;
                } catch (IllegalStateException e2) {
                    e = e2;
                    aez.a("[Client]", "Can't execute request", e);
                } catch (ClientProtocolException e3) {
                    e = e3;
                    aez.a("[Client]", "Can't execute request", e);
                }
            } catch (Throwable th) {
                th = th;
                inputStream2 = hasNext;
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                throw th;
            }
        } catch (UnsupportedEncodingException e4) {
            e = e4;
            inputStream = null;
        } catch (IllegalStateException e5) {
            e = e5;
            inputStream = null;
        } catch (ClientProtocolException e6) {
            e = e6;
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
            }
            throw th;
        }
    }

    public static InputStream b(InputStream inputStream) {
        if (aez.c()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                StringBuilder sb = new StringBuilder();
                for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                    sb.append(readLine);
                    sb.append("\n");
                }
                aez.c();
                return new ByteArrayInputStream(sb.toString().getBytes("UTF-8"));
            } catch (IOException e) {
                aez.a("[Client]", "Error: ", e);
            } catch (Throwable th) {
                aez.a("[Client]", "Error: ", th);
            }
        }
        return inputStream;
    }
}
