package xsna;

import android.os.SystemClock;
import com.vk.knet.core.exceptions.NoNetworkException;
import com.vk.knet.core.exceptions.QuicException;
import com.vk.knet.core.http.HttpMethod;
import com.vk.knet.cornet.CronetHttpLogger$DebugType;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.ConnectException;
import java.net.HttpRetryException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.NetworkException;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataProviders;
import org.chromium.net.UploadDataSink;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
import org.chromium.net.impl.CallbackExceptionImpl;
import ru.ok.android.commons.http.Http;

/* compiled from: RequestController.kt */
/* loaded from: classes2.dex */
public final class k7g0 {
    public final zdk a;
    public final imf0 b;
    public final eek c;
    public volatile int d;
    public volatile UrlRequest e;
    public volatile UrlResponseInfo f;
    public volatile AtomicReference<Throwable> g = new AtomicReference<>(null);
    public final ReentrantLock h;
    public final uwi i;
    public final uwi j;
    public final uwi k;
    public final uwi l;

    /* compiled from: RequestController.kt */
    public final class a extends UrlRequest.Callback {
        public final ckv a;
        public final imf0 b;

        public a(ckv ckvVar, imf0 imf0Var) {
            this.a = ckvVar;
            this.b = imf0Var;
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            dkv dkvVar = this.a.d;
            Integer valueOf = dkvVar != null ? Integer.valueOf(dkvVar.getContentLength()) : null;
            Long valueOf2 = urlResponseInfo != null ? Long.valueOf(urlResponseInfo.getReceivedByteCount()) : null;
            String contentType = dkvVar != null ? dkvVar.getContentType() : null;
            Integer valueOf3 = urlResponseInfo != null ? Integer.valueOf(urlResponseInfo.getHttpStatusCode()) : null;
            String negotiatedProtocol = urlResponseInfo != null ? urlResponseInfo.getNegotiatedProtocol() : null;
            Object[] objArr = {"Cronet", ss9.a("[cronet] Request callback of ", this.a.b, " mimeType=", contentType, " canceled!")};
            qek qekVar = vek.a;
            if (qekVar != null) {
                qekVar.c(Arrays.copyOf(objArr, 2));
            }
            String httpStatusText = urlResponseInfo != null ? urlResponseInfo.getHttpStatusText() : null;
            Boolean valueOf4 = urlResponseInfo != null ? Boolean.valueOf(urlResponseInfo.wasCached()) : null;
            boolean isDone = urlRequest.isDone();
            StringBuilder d = jq.d(valueOf3, "[cronet] NegotiatedProtocol:", negotiatedProtocol, ", statusCode:", ", statusText:");
            d.append(httpStatusText);
            d.append(", bytes:");
            d.append(valueOf2);
            d.append(" total:");
            rq.h(d, valueOf, ", wasCached:", valueOf4, ", isDone=");
            d.append(isDone);
            Object[] objArr2 = {"Cronet", d.toString()};
            qek qekVar2 = vek.a;
            if (qekVar2 != null) {
                qekVar2.c(Arrays.copyOf(objArr2, 2));
            }
            AtomicReference<Throwable> atomicReference = k7g0.this.g;
            InterruptedException interruptedException = new InterruptedException("Request cancelled via manual call of #cancel");
            while (!atomicReference.compareAndSet(null, interruptedException) && atomicReference.get() == null) {
            }
            k7g0.this.i(5);
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
            Throwable iOException;
            String str = this.a.b;
            Throwable cause = cronetException.getCause();
            String a = i5s.a(xe9.a("[cronet] Request callback of ", str, " failed: Class: ", cause != null ? cause.getClass().getSimpleName() : null, " | Message: "), cronetException.getMessage(), "!");
            boolean z = cronetException instanceof NetworkException;
            if (z) {
                a = na8.a(((NetworkException) cronetException).getErrorCode(), a, " | Code: ");
            }
            Object[] objArr = {"Cronet", a};
            qek qekVar = vek.a;
            if (qekVar != null) {
                qekVar.b(Arrays.copyOf(objArr, 2));
            }
            AtomicReference<Throwable> atomicReference = k7g0.this.g;
            if (z) {
                NetworkException networkException = (NetworkException) cronetException;
                switch (networkException.getErrorCode()) {
                    case 1:
                        String message = networkException.getMessage();
                        if (message == null) {
                            message = "ERROR_HOSTNAME_NOT_RESOLVED";
                        }
                        iOException = new UnknownHostException(message);
                        break;
                    case 2:
                        String message2 = networkException.getMessage();
                        if (message2 == null) {
                            message2 = "ERROR_INTERNET_DISCONNECTED";
                        }
                        iOException = new NoNetworkException(message2);
                        break;
                    case 3:
                        String message3 = networkException.getMessage();
                        if (message3 == null) {
                            message3 = "ERROR_NETWORK_CHANGED";
                        }
                        iOException = new ConnectException(message3);
                        break;
                    case 4:
                        String message4 = networkException.getMessage();
                        if (message4 == null) {
                            message4 = "ERROR_TIMED_OUT";
                        }
                        iOException = new SocketTimeoutException(message4);
                        break;
                    case 5:
                        String message5 = networkException.getMessage();
                        if (message5 == null) {
                            message5 = "ERR_CONNECTION_CLOSED";
                        }
                        iOException = new ConnectException(message5);
                        break;
                    case 6:
                        String message6 = networkException.getMessage();
                        if (message6 == null) {
                            message6 = "ERROR_CONNECTION_TIMED_OUT";
                        }
                        iOException = new SocketTimeoutException(message6);
                        break;
                    case 7:
                        String message7 = networkException.getMessage();
                        if (message7 == null) {
                            message7 = "ERROR_CONNECTION_REFUSED";
                        }
                        iOException = new ConnectException(message7);
                        break;
                    case 8:
                        String message8 = networkException.getMessage();
                        if (message8 == null) {
                            message8 = "ERROR_CONNECTION_RESET";
                        }
                        iOException = new ConnectException(message8);
                        break;
                    case 9:
                        String message9 = networkException.getMessage();
                        if (message9 == null) {
                            message9 = "ERROR_ADDRESS_UNREACHABLE";
                        }
                        iOException = new ConnectException(message9);
                        break;
                    case 10:
                        String message10 = networkException.getMessage();
                        if (message10 == null) {
                            message10 = "ERROR_QUIC_PROTOCOL_FAILED";
                        }
                        iOException = new QuicException(message10);
                        break;
                    case 11:
                        iOException = new IOException("CRONET_ERROR_OTHER", networkException);
                        break;
                    default:
                        iOException = new IOException(networkException);
                        break;
                }
            } else if (cronetException instanceof CallbackExceptionImpl) {
                iOException = cronetException.getCause();
                if (iOException == null) {
                    iOException = cronetException;
                }
            } else {
                iOException = new IOException(cronetException);
            }
            if (!epx.f(iOException.getCause(), cronetException)) {
                try {
                    mnh0.d(iOException, cronetException);
                } catch (Throwable unused) {
                }
            }
            atomicReference.set(iOException);
            k7g0.this.i(6);
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
            byteBuffer.flip();
            k7g0.this.i(3);
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
            this.b.a(str, this.a);
            urlRequest.followRedirect();
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            CronetHttpLogger$DebugType cronetHttpLogger$DebugType = CronetHttpLogger$DebugType.CLIENT_CALLBACK;
            Object[] objArr = {zr.a("[cronet] Request callback of ", this.a.b, " started!")};
            qek qekVar = vek.a;
            if (qekVar != null) {
                qekVar.a(cronetHttpLogger$DebugType, Arrays.copyOf(objArr, 1));
            }
            String negotiatedProtocol = urlResponseInfo.getNegotiatedProtocol();
            String url = urlResponseInfo.getUrl();
            int httpStatusCode = urlResponseInfo.getHttpStatusCode();
            Map<String, List<String>> allHeaders = urlResponseInfo.getAllHeaders();
            StringBuilder a = xe9.a("onStarted | ", negotiatedProtocol, " | ", url, " | ");
            a.append(httpStatusCode);
            a.append(" | ");
            a.append(allHeaders);
            Object[] objArr2 = {a.toString()};
            qek qekVar2 = vek.a;
            if (qekVar2 != null) {
                qekVar2.a(cronetHttpLogger$DebugType, Arrays.copyOf(objArr2, 1));
            }
            k7g0.this.f = urlResponseInfo;
            k7g0.this.i(2);
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            CronetHttpLogger$DebugType cronetHttpLogger$DebugType = CronetHttpLogger$DebugType.CLIENT_CALLBACK;
            Object[] objArr = {zr.a("[cronet] Request callback of ", this.a.b, " succeeded!")};
            qek qekVar = vek.a;
            if (qekVar != null) {
                qekVar.a(cronetHttpLogger$DebugType, Arrays.copyOf(objArr, 1));
            }
            String negotiatedProtocol = urlResponseInfo != null ? urlResponseInfo.getNegotiatedProtocol() : null;
            String url = urlResponseInfo != null ? urlResponseInfo.getUrl() : null;
            Integer valueOf = urlResponseInfo != null ? Integer.valueOf(urlResponseInfo.getHttpStatusCode()) : null;
            Map<String, List<String>> allHeaders = urlResponseInfo != null ? urlResponseInfo.getAllHeaders() : null;
            StringBuilder a = xe9.a("onSucceeded | ", negotiatedProtocol, " | ", url, " | ");
            a.append(valueOf);
            a.append(" | ");
            a.append(allHeaders);
            Object[] objArr2 = {a.toString()};
            qek qekVar2 = vek.a;
            if (qekVar2 != null) {
                qekVar2.a(cronetHttpLogger$DebugType, Arrays.copyOf(objArr2, 1));
            }
            k7g0.this.i(4);
        }
    }

    /* compiled from: RequestController.kt */
    public final class b extends UploadDataProvider {
        public final uiv b;

        public b(uiv uivVar) {
            this.b = uivVar;
        }

        @Override // org.chromium.net.UploadDataProvider
        public final long getLength() {
            return -1L;
        }

        @Override // org.chromium.net.UploadDataProvider
        public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
            this.b.a();
            if (uploadDataSink != null) {
                uploadDataSink.onReadSucceeded(false);
            }
        }

        @Override // org.chromium.net.UploadDataProvider
        public final void rewind(UploadDataSink uploadDataSink) {
            if (uploadDataSink != null) {
                uploadDataSink.onRewindError(new HttpRetryException("Cannot retry streamed Http body", -1));
            }
        }
    }

    /* compiled from: RequestController.kt */
    public final class c extends UploadDataProvider {
        public final UploadDataProvider b;

        public c(UploadDataProvider uploadDataProvider) {
            this.b = uploadDataProvider;
        }

        @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.b.close();
        }

        @Override // org.chromium.net.UploadDataProvider
        public final long getLength() {
            return this.b.getLength();
        }

        @Override // org.chromium.net.UploadDataProvider
        public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
            k7g0.this.i(1);
            this.b.read(uploadDataSink, byteBuffer);
        }

        @Override // org.chromium.net.UploadDataProvider
        public final void rewind(UploadDataSink uploadDataSink) {
            k7g0.this.i(1);
            this.b.rewind(uploadDataSink);
        }
    }

    public k7g0(zdk zdkVar, imf0 imf0Var, eek eekVar) {
        this.a = zdkVar;
        this.b = imf0Var;
        this.c = eekVar;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.h = reentrantLock;
        this.i = new uwi(reentrantLock);
        this.j = new uwi(reentrantLock);
        this.k = new uwi(reentrantLock);
        this.l = new uwi(reentrantLock);
    }

    public final void a(ckv ckvVar, long j) {
        long min;
        long j2 = 0;
        int i = 1;
        while (true) {
            min = Math.min(2000 * i, j - j2);
            i *= 2;
            j2 += min;
            CronetHttpLogger$DebugType cronetHttpLogger$DebugType = CronetHttpLogger$DebugType.CLIENT_TIMEOUTS;
            StringBuilder d = rqi.d(min, "[cronet] Start awaiting of ", ckvVar.b, " connection for ");
            d.append(" ms");
            Object[] objArr = {d.toString()};
            qek qekVar = vek.a;
            if (qekVar != null) {
                qekVar.a(cronetHttpLogger$DebugType, Arrays.copyOf(objArr, 1));
            }
            if (this.i.a(min)) {
                Object[] objArr2 = {zr.a("[cronet] Connection to ", ckvVar.b, " has been established!")};
                qek qekVar2 = vek.a;
                if (qekVar2 != null) {
                    qekVar2.a(cronetHttpLogger$DebugType, Arrays.copyOf(objArr2, 1));
                }
            } else {
                UrlRequest urlRequest = this.e;
                if (urlRequest != null && urlRequest.isDone()) {
                    Object[] objArr3 = {zr.a("[cronet] Url ", ckvVar.b, " is already done!")};
                    qek qekVar3 = vek.a;
                    if (qekVar3 != null) {
                        qekVar3.a(cronetHttpLogger$DebugType, Arrays.copyOf(objArr3, 1));
                    }
                }
                if (j2 >= j) {
                    break;
                }
            }
        }
        if (j2 >= j) {
            StringBuilder d2 = rqi.d(min, "[cronet] Url ", ckvVar.b, " is canceled. Last timeout was ");
            d2.append(" ms");
            Object[] objArr4 = {"Cronet", d2.toString()};
            qek qekVar4 = vek.a;
            if (qekVar4 != null) {
                qekVar4.b(Arrays.copyOf(objArr4, 2));
            }
            throw new SocketTimeoutException("Unable to establish connection to server!");
        }
    }

    public final UrlResponseInfo b(long j, long j2, long j3) {
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            if (!this.i.a(j)) {
                CronetHttpLogger$DebugType cronetHttpLogger$DebugType = CronetHttpLogger$DebugType.CLIENT_TIMEOUTS;
                Object[] objArr = {"[cronet] Await response is canceled by timeout."};
                qek qekVar = vek.a;
                if (qekVar != null) {
                    qekVar.a(cronetHttpLogger$DebugType, Arrays.copyOf(objArr, 1));
                }
                throw new SocketTimeoutException("Unable to establish connection to the server in " + j + "ms.");
            }
            d();
            if (!this.j.a(j2)) {
                CronetHttpLogger$DebugType cronetHttpLogger$DebugType2 = CronetHttpLogger$DebugType.CLIENT_TIMEOUTS;
                Object[] objArr2 = {"[cronet] Await response is canceled by timeout."};
                qek qekVar2 = vek.a;
                if (qekVar2 != null) {
                    qekVar2.a(cronetHttpLogger$DebugType2, Arrays.copyOf(objArr2, 1));
                }
                throw new SocketTimeoutException("Failed to complete write operation in " + j2 + "ms.");
            }
            d();
            if (this.k.a(j3)) {
                d();
                c();
                UrlResponseInfo urlResponseInfo = this.f;
                if (urlResponseInfo == null) {
                    throw new IllegalStateException("Expect response to be not null at this stage");
                }
                reentrantLock.unlock();
                return urlResponseInfo;
            }
            CronetHttpLogger$DebugType cronetHttpLogger$DebugType3 = CronetHttpLogger$DebugType.CLIENT_TIMEOUTS;
            Object[] objArr3 = {"[cronet] Await response is canceled by timeout."};
            qek qekVar3 = vek.a;
            if (qekVar3 != null) {
                qekVar3.a(cronetHttpLogger$DebugType3, Arrays.copyOf(objArr3, 1));
            }
            throw new SocketTimeoutException("Failed to get response in " + j3 + "ms.");
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void c() {
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            int i = this.d;
            if (i >= 3) {
                return;
            }
            throw new IllegalStateException("Actual state " + i + " should be more than 3!");
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d() {
        Throwable th = this.g.get();
        if (th != null) {
            throw th;
        }
    }

    public final void e() {
        UrlRequest urlRequest = this.e;
        if (urlRequest != null) {
            urlRequest.cancel();
        }
    }

    public final void f(ckv ckvVar, jek jekVar) {
        a aVar = new a(ckvVar, this.b);
        HttpMethod httpMethod = ckvVar.a;
        dkv dkvVar = ckvVar.d;
        httpMethod.getClass();
        UploadDataProvider bVar = (httpMethod == HttpMethod.GET || dkvVar == null) ? null : dkvVar instanceof uiv ? new b((uiv) dkvVar) : new c(UploadDataProviders.create(dkvVar.getContent()));
        eek eekVar = this.c;
        eekVar.getClass();
        ExperimentalUrlRequest.Builder requestFinishedListener = eekVar.a.newUrlRequestBuilder(ckvVar.b, (UrlRequest.Callback) aVar, (Executor) jekVar).disableCache().setHttpMethod(ckvVar.a.i()).setRequestFinishedListener((RequestFinishedInfo.Listener) new dek(eekVar, SystemClock.elapsedRealtime(), System.currentTimeMillis(), ckvVar, eekVar.e));
        Map<String, List<String>> map = ckvVar.c;
        if (!map.isEmpty()) {
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if (brm0.w(key, "Accept-Encoding", true)) {
                    try {
                        Field declaredField = requestFinishedListener.getClass().getDeclaredField("mRequestHeaders");
                        declaredField.setAccessible(true);
                        Object obj = declaredField.get(requestFinishedListener);
                        ArrayList arrayList = obj instanceof ArrayList ? (ArrayList) obj : null;
                        if (arrayList != null) {
                            arrayList.add(new AbstractMap.SimpleEntry(key, yiz.d(value)));
                        }
                    } catch (Throwable unused) {
                    }
                } else if (!value.isEmpty()) {
                    requestFinishedListener.addHeader(key, yiz.d(value));
                }
            }
        }
        dkv dkvVar2 = ckvVar.d;
        if (dkvVar2 != null && bVar != null) {
            if (ckvVar.d("Content-Type") == null) {
                requestFinishedListener.addHeader("Content-Type", dkvVar2.getContentType());
            }
            if (ckvVar.d(Http.Header.CONTENT_LENGTH) == null) {
                requestFinishedListener.addHeader(Http.Header.CONTENT_LENGTH, String.valueOf(dkvVar2.getContentLength()));
            }
            requestFinishedListener.setUploadDataProvider(bVar, (Executor) jekVar);
        }
        this.e = requestFinishedListener.build();
    }

    public final void g() {
        i(0);
        UrlRequest urlRequest = this.e;
        if (urlRequest == null) {
            throw new IllegalStateException("You have to create connection, before start it!");
        }
        urlRequest.start();
    }

    public final void h() {
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            this.l.b(true);
            this.k.b(true);
            this.j.b(true);
            this.i.b(true);
            s3q0 s3q0Var = s3q0.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void i(int i) {
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            if (i != this.d) {
                CronetHttpLogger$DebugType cronetHttpLogger$DebugType = CronetHttpLogger$DebugType.CLIENT_STATE;
                Object[] objArr = {"Old state " + this.d + ", action " + i};
                qek qekVar = vek.a;
                if (qekVar != null) {
                    qekVar.a(cronetHttpLogger$DebugType, Arrays.copyOf(objArr, 1));
                }
            }
            switch (i) {
                case 0:
                    this.d = 1;
                    s3q0 s3q0Var = s3q0.a;
                    reentrantLock.unlock();
                    return;
                case 1:
                    this.d = 2;
                    this.i.b(true);
                    uwi uwiVar = this.j;
                    ReentrantLock reentrantLock2 = uwiVar.a;
                    reentrantLock2.lock();
                    try {
                        uwiVar.c = true;
                        uwiVar.d.signalAll();
                        s3q0 s3q0Var2 = s3q0.a;
                        reentrantLock2.unlock();
                        s3q0 s3q0Var3 = s3q0.a;
                        reentrantLock.unlock();
                        return;
                    } catch (Throwable th) {
                        reentrantLock2.unlock();
                        throw th;
                    }
                case 2:
                    this.d = 3;
                    this.i.b(true);
                    this.j.b(true);
                    this.k.b(true);
                    s3q0 s3q0Var32 = s3q0.a;
                    reentrantLock.unlock();
                    return;
                case 3:
                    this.d = 3;
                    this.l.b(true);
                    s3q0 s3q0Var322 = s3q0.a;
                    reentrantLock.unlock();
                    return;
                case 4:
                    this.d = 4;
                    h();
                    zdk zdkVar = this.a;
                    this.g.get();
                    zdkVar.b();
                    s3q0 s3q0Var3222 = s3q0.a;
                    reentrantLock.unlock();
                    return;
                case 5:
                    this.d = 5;
                    h();
                    zdk zdkVar2 = this.a;
                    this.g.get();
                    zdkVar2.b();
                    s3q0 s3q0Var32222 = s3q0.a;
                    reentrantLock.unlock();
                    return;
                case 6:
                    this.d = 6;
                    h();
                    zdk zdkVar3 = this.a;
                    this.g.get();
                    zdkVar3.b();
                    s3q0 s3q0Var322222 = s3q0.a;
                    reentrantLock.unlock();
                    return;
                default:
                    s3q0 s3q0Var3222222 = s3q0.a;
                    reentrantLock.unlock();
                    return;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
