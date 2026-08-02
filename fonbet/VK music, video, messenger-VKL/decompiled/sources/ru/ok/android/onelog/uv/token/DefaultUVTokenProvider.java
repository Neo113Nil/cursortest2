package ru.ok.android.onelog.uv.token;

import java.io.IOException;
import java.security.MessageDigest;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;
import ru.ok.android.commons.http.HttpByteArrayBody;
import ru.ok.android.commons.http.HttpClient;
import ru.ok.android.commons.http.HttpRequest;
import ru.ok.android.commons.http.HttpResponse;
import ru.ok.android.commons.http.HttpResponseBody;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.emb;
import xsna.ff;
import xsna.fo8;
import xsna.gzs;
import xsna.h2v;
import xsna.i2v;
import xsna.ro;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: DefaultUVTokenProvider.kt */
/* loaded from: classes9.dex */
public final class DefaultUVTokenProvider implements UVTokenProvider {
    private static final float BACKOFF_FACTOR = 1.5f;
    public static final Companion Companion = new Companion(null);
    private static final String HEADER_SIGNATURE = "Signature";
    private static final long INITIAL_BACKOFF_MS = 500;
    private static final long MAX_BACKOFF_MS = 60000;
    private static final String TOKEN_URL = "https://uvapi.okcdn.ru/uv/stat/token";
    private final String applicationId;
    private volatile String cachedToken;
    private volatile int consecutiveErrors;
    private final String deviceId;
    private final HttpClient httpClient;
    private final String secret;
    private final gzs<String> userIdProvider;
    private final ReentrantLock lock = new ReentrantLock();
    private volatile long backoffDelayMs = 500;

    /* compiled from: DefaultUVTokenProvider.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public DefaultUVTokenProvider(HttpClient httpClient, String str, String str2, String str3, gzs<String> gzsVar) {
        this.httpClient = httpClient;
        this.applicationId = str;
        this.secret = str2;
        this.deviceId = str3;
        this.userIdProvider = gzsVar;
    }

    private final String buildJsonBody() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("userId", this.userIdProvider.invoke());
        jSONObject.put("applicationId", this.applicationId);
        jSONObject.put(ApiProtocol.PARAM_DEVICE_ID, this.deviceId);
        return jSONObject.toString();
    }

    private final String computeSignature(String str, String str2) {
        byte[] digest = MessageDigest.getInstance("SHA-256").digest(fo8.a(str, str2).getBytes(emb.b));
        int[] iArr = h2v.a;
        i2v i2vVar = i2v.c;
        int length = digest.length;
        ff.a aVar = ff.Companion;
        int length2 = digest.length;
        aVar.getClass();
        ff.a.a(0, length, length2);
        if (length == 0) {
            return "";
        }
        int[] iArr2 = h2v.a;
        i2v.a aVar2 = i2vVar.a;
        if (aVar2.a) {
            if (aVar2.b) {
                char[] cArr = new char[h2v.a(length * 2)];
                int i = 0;
                for (int i2 = 0; i2 < length; i2++) {
                    i = h2v.b(digest, i2, iArr2, cArr, i);
                }
                return new String(cArr);
            }
            if (length <= 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            long j = 0;
            char[] cArr2 = new char[h2v.a((length * (((2 + j) + j) + j)) - j)];
            int c = h2v.c("", cArr2, h2v.b(digest, 0, iArr2, cArr2, h2v.c("", cArr2, 0)));
            for (int i3 = 1; i3 < length; i3++) {
                c = h2v.c("", cArr2, h2v.b(digest, i3, iArr2, cArr2, h2v.c("", cArr2, h2v.c("", cArr2, c))));
            }
            return new String(cArr2);
        }
        if (length <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i4 = length - 1;
        int i5 = i4 / Integer.MAX_VALUE;
        int i6 = length % Integer.MAX_VALUE;
        if (i6 == 0) {
            i6 = Integer.MAX_VALUE;
        }
        int i7 = (i6 - 1) / Integer.MAX_VALUE;
        long j2 = i7 * 2;
        long j3 = (i4 - i5) - i7;
        long j4 = 0;
        int a = h2v.a(((2 + j4 + j4) * length) + (j3 * j4) + j2 + i5);
        char[] cArr3 = new char[a];
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (i9 == Integer.MAX_VALUE) {
                cArr3[i8] = '\n';
                i10 = 0;
                i8++;
                i9 = 0;
            } else if (i10 == Integer.MAX_VALUE) {
                i8 = h2v.c("  ", cArr3, i8);
                i10 = 0;
            }
            if (i10 != 0) {
                i8 = h2v.c("", cArr3, i8);
            }
            i8 = h2v.c("", cArr3, h2v.b(digest, i11, iArr2, cArr3, h2v.c("", cArr3, i8)));
            i10++;
            i9++;
        }
        if (i8 == a) {
            return new String(cArr3);
        }
        throw new IllegalStateException("Check failed.");
    }

    private final String fetchTokenFromServer() {
        byte[] bytes;
        String buildJsonBody = buildJsonBody();
        HttpResponse execute = this.httpClient.execute(HttpRequest.Companion.builder().method("POST").url(TOKEN_URL).header("Content-Type", "application/json").header(HEADER_SIGNATURE, computeSignature(buildJsonBody, this.secret)).body(new HttpByteArrayBody(buildJsonBody.getBytes(emb.b))).logContext("uv-stat-token").build());
        try {
            if (execute.getStatusCodeClass() != 200) {
                throw new IOException("UV token request failed: HTTP " + execute.getStatusCode());
            }
            HttpResponseBody body = execute.getBody();
            if (body == null || (bytes = body.getBytes()) == null) {
                throw new IOException("Empty response body from UV token endpoint");
            }
            String parseTokenFromResponse = parseTokenFromResponse(bytes);
            ro.e(execute, null);
            return parseTokenFromResponse;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ro.e(execute, th);
                throw th2;
            }
        }
    }

    private final void increaseBackoff() {
        this.consecutiveErrors++;
        this.backoffDelayMs = Math.min((long) (this.backoffDelayMs * 1.5f), 60000L);
    }

    private final String parseTokenFromResponse(byte[] bArr) {
        return new JSONObject(new String(bArr, emb.b)).getString("token");
    }

    private final void resetBackoff() {
        this.consecutiveErrors = 0;
        this.backoffDelayMs = 500L;
    }

    private final void waitIfNeeded() {
        if (this.consecutiveErrors > 0) {
            Thread.sleep(this.backoffDelayMs);
        }
    }

    @Override // ru.ok.android.onelog.uv.token.UVTokenProvider
    public String getToken() {
        String str = this.cachedToken;
        if (str != null) {
            return str;
        }
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            String str2 = this.cachedToken;
            if (str2 != null) {
                reentrantLock.unlock();
                return str2;
            }
            try {
                waitIfNeeded();
                this.cachedToken = fetchTokenFromServer();
                resetBackoff();
                String str3 = this.cachedToken;
                if (str3 == null) {
                    throw new IllegalStateException("Failed to get UV stats token");
                }
                reentrantLock.unlock();
                return str3;
            } catch (Exception e) {
                this.cachedToken = null;
                increaseBackoff();
                throw e;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // ru.ok.android.onelog.uv.token.UVTokenProvider
    public void refreshToken() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.cachedToken = null;
            s3q0 s3q0Var = s3q0.a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
