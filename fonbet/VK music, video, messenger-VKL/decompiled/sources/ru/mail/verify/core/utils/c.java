package ru.mail.verify.core.utils;

import android.net.Network;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.B5;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import ru.mail.verify.core.utils.ClientException;
import ru.mail.verify.core.utils.b;
import ru.ok.android.commons.http.Http;

/* loaded from: classes9.dex */
public final class c implements ru.mail.verify.core.utils.b {

    @NonNull
    private final String a;

    @Nullable
    private final byte[] b;

    @NonNull
    private final HttpURLConnection c;

    @Nullable
    private final String d;
    private final boolean e;
    private boolean f;
    private boolean g;

    @Nullable
    private Long h;

    @Nullable
    private Long i;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.a.values().length];
            a = iArr;
            try {
                iArr[b.a.GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.a.POST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.a.HEAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.a.PUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class b implements ru.mail.verify.core.utils.a {

        @Nullable
        private HttpURLConnection a;

        @NonNull
        private final String b;

        @Nullable
        private final SocketFactoryProvider c;

        @Nullable
        private final Network d;
        private byte[] e;
        private String f;
        private boolean g;

        public /* synthetic */ b(String str, SocketFactoryProvider socketFactoryProvider, Network network, int i) {
            this(str, socketFactoryProvider, network);
        }

        @NonNull
        private HttpURLConnection d() throws ClientException, IOException {
            if (this.a == null) {
                SocketFactoryProvider socketFactoryProvider = this.c;
                SSLSocketFactory sSLFactory = socketFactoryProvider == null ? null : socketFactoryProvider.getSSLFactory(null);
                try {
                    TextUtils.isEmpty(null);
                    Network network = this.d;
                    if (network != null) {
                        this.a = (HttpURLConnection) network.openConnection(new URL(this.b));
                    } else {
                        this.a = (HttpURLConnection) new URL(this.b).openConnection();
                    }
                    if (sSLFactory != null) {
                        ((HttpsURLConnection) this.a).setSSLSocketFactory(sSLFactory);
                    }
                    d().setConnectTimeout(30000);
                    d().setReadTimeout(30000);
                    d().setInstanceFollowRedirects(false);
                } catch (MalformedURLException e) {
                    throw new ClientException(e);
                }
            }
            HttpURLConnection httpURLConnection = this.a;
            Objects.requireNonNull(httpURLConnection);
            return httpURLConnection;
        }

        @Override // ru.mail.verify.core.utils.a
        @NonNull
        public final ru.mail.verify.core.utils.a a(@NonNull b.a aVar) throws IOException, ClientException {
            HttpURLConnection d = d();
            int i = a.a[aVar.ordinal()];
            if (i == 1) {
                d.setRequestMethod("GET");
                d.setDoInput(true);
                d.setDoOutput(false);
                return this;
            }
            if (i == 2) {
                d.setRequestMethod("POST");
                d.setDoInput(true);
                d.setDoOutput(true);
                return this;
            }
            if (i == 3) {
                d.setRequestMethod("HEAD");
                d.setDoInput(false);
                d.setDoOutput(false);
                return this;
            }
            if (i != 4) {
                throw new IllegalArgumentException("Unsupported http method");
            }
            d.setRequestMethod("PUT");
            d.setDoInput(true);
            d.setDoOutput(true);
            return this;
        }

        @Override // ru.mail.verify.core.utils.a
        @NonNull
        public final ru.mail.verify.core.utils.a b(int i) throws IOException, ClientException {
            d().setReadTimeout(i);
            return this;
        }

        @Override // ru.mail.verify.core.utils.a
        @NonNull
        public final ru.mail.verify.core.utils.a c() throws IOException, ClientException {
            d().setInstanceFollowRedirects(false);
            return this;
        }

        private b(@NonNull String str, @Nullable SocketFactoryProvider socketFactoryProvider, @Nullable Network network) {
            this.b = str;
            this.c = socketFactoryProvider;
            this.d = network;
        }

        @Override // ru.mail.verify.core.utils.a
        @NonNull
        public final c b() throws IOException, ClientException {
            return new c(this.b, this.e, this.f, d(), this.g, 0);
        }

        @Override // ru.mail.verify.core.utils.a
        @NonNull
        public final ru.mail.verify.core.utils.a a() {
            this.g = true;
            return this;
        }

        @Override // ru.mail.verify.core.utils.a
        @NonNull
        public final ru.mail.verify.core.utils.a a(boolean z) throws IOException, ClientException {
            HttpURLConnection d = d();
            if (z) {
                d.addRequestProperty("Connection", "Keep-Alive");
                return this;
            }
            d.addRequestProperty("Connection", "Close");
            return this;
        }

        @Override // ru.mail.verify.core.utils.a
        @NonNull
        public final ru.mail.verify.core.utils.a a(int i) throws IOException, ClientException {
            d().setConnectTimeout(i);
            return this;
        }

        @Override // ru.mail.verify.core.utils.a
        @NonNull
        public final ru.mail.verify.core.utils.a a(@NonNull String str, @NonNull String str2) throws IOException, ClientException {
            d().addRequestProperty(str, str2);
            return this;
        }

        @Override // ru.mail.verify.core.utils.a
        @NonNull
        public final ru.mail.verify.core.utils.a a(@NonNull String str) throws IOException, ClientException {
            if (!TextUtils.isEmpty(str)) {
                this.e = str.getBytes(StandardCharsets.UTF_8);
                if (this.g) {
                    this.f = str;
                }
                HttpURLConnection d = d();
                d.addRequestProperty("Content-Type", Http.ContentType.APPLICATION_X_WWW_FORM_URLENCODED);
                d.setRequestProperty("Charset", B5.O);
                d.setRequestProperty(Http.Header.CONTENT_LENGTH, Integer.toString(this.e.length));
            }
            return this;
        }
    }

    public /* synthetic */ c(String str, byte[] bArr, String str2, HttpURLConnection httpURLConnection, boolean z, int i) {
        this(str, bArr, str2, httpURLConnection, z);
    }

    @NonNull
    public static ru.mail.verify.core.utils.a a(@NonNull String str, @Nullable SocketFactoryProvider socketFactoryProvider, @Nullable Network network) {
        return new b(str, socketFactoryProvider, network, 0);
    }

    private void b() {
        i();
        try {
            a(this.c.getInputStream());
        } catch (IOException e) {
            FileLog.e("HttpConnection", "emptyAndClose %s", e.getMessage());
        }
        try {
            a(this.c.getErrorStream());
        } catch (IOException e2) {
            FileLog.e("HttpConnection", "emptyAndClose %s", e2.getMessage());
        }
        j();
        i();
        this.c.disconnect();
    }

    private InputStream c() throws IOException {
        InputStream inputStream;
        i();
        try {
            inputStream = this.c.getInputStream();
            try {
                a(this.c.getErrorStream());
            } catch (IOException e) {
                FileLog.v("HttpConnection", "getInputStream", e);
            }
        } catch (FileNotFoundException e2) {
            InputStream errorStream = this.c.getErrorStream();
            FileLog.v("HttpConnection", "getInputStream", e2);
            if (errorStream == null) {
                throw new IOException("errorStream is null");
            }
            inputStream = errorStream;
        }
        j();
        return inputStream;
    }

    private void i() {
        String str;
        if (!this.e || this.f) {
            return;
        }
        this.f = true;
        try {
            str = this.c.getRequestMethod();
        } catch (Exception unused) {
            str = null;
        }
        try {
            FileLog.v("HttpConnection", "\r\nURL: %s\r\nMethod:%s", this.a, str);
            StringBuilder sb = new StringBuilder();
            for (String str2 : this.c.getRequestProperties().keySet()) {
                sb.append(str2);
                sb.append(" : ");
                sb.append(this.c.getRequestProperty(str2));
                sb.append('\n');
            }
            FileLog.v("HttpConnection", sb.toString());
        } catch (Exception unused2) {
        }
    }

    private void j() {
        if (!this.e || this.g) {
            return;
        }
        this.g = true;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("contentLength : ");
            sb.append(this.c.getContentLength());
            sb.append('\n');
            for (String str : this.c.getHeaderFields().keySet()) {
                sb.append(str);
                sb.append(" : ");
                sb.append(this.c.getHeaderField(str));
                sb.append('\n');
            }
            FileLog.v("HttpConnection", sb.toString());
        } catch (Exception unused) {
        }
    }

    public final long d() {
        try {
            String a2 = a("X-Android-Received-Millis", false);
            if (a2 != null) {
                return Long.parseLong(a2);
            }
        } catch (Throwable unused) {
        }
        Long l = this.i;
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    @NonNull
    public final String e() throws IOException, ServerException, ClientException {
        String str;
        i();
        try {
            if (this.b != null) {
                if (Thread.interrupted()) {
                    b();
                    throw new ClientException("The thread has been cancelled before post data", ClientException.a.CANCELLED);
                }
                FileLog.v("HttpConnection", "post data started");
                if (this.e && (str = this.d) != null) {
                    FileLog.v("HttpConnection", str);
                }
                try {
                    DataOutputStream dataOutputStream = new DataOutputStream(this.c.getOutputStream());
                    try {
                        dataOutputStream.write(this.b);
                        dataOutputStream.flush();
                        FileLog.v("HttpConnection", "post data completed");
                        dataOutputStream.close();
                    } catch (Throwable th) {
                        try {
                            dataOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Exception unused) {
                    Objects.toString(this.c.getURL());
                }
            }
            int f = f();
            if (Thread.interrupted()) {
                b();
                throw new ClientException("The thread has been cancelled after connection start", ClientException.a.CANCELLED);
            }
            if (f != 200 && f != 202) {
                i();
                b();
                throw new ServerException(f);
            }
            InputStream c = c();
            try {
                StringBuilder sb = new StringBuilder(1024);
                InputStreamReader inputStreamReader = new InputStreamReader(c, C.UTF8_NAME);
                try {
                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                    while (true) {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            sb.append(readLine);
                        } finally {
                        }
                    }
                    bufferedReader.close();
                    inputStreamReader.close();
                    String sb2 = sb.toString();
                    j();
                    FileLog.v("HttpConnection", sb2);
                    if (c != null) {
                        c.close();
                    }
                    return sb2;
                } finally {
                }
            } finally {
            }
        } finally {
            i();
            this.c.disconnect();
        }
    }

    public final int f() throws IOException, ClientException {
        i();
        if (Thread.interrupted()) {
            throw new ClientException("The thread has been cancelled before the request start", ClientException.a.CANCELLED);
        }
        try {
            this.h = Long.valueOf(System.currentTimeMillis());
            int responseCode = this.c.getResponseCode();
            this.i = Long.valueOf(System.currentTimeMillis());
            j();
            return responseCode;
        } catch (IOException unused) {
            this.h = Long.valueOf(System.currentTimeMillis());
            int responseCode2 = this.c.getResponseCode();
            this.i = Long.valueOf(System.currentTimeMillis());
            j();
            return responseCode2;
        } catch (NullPointerException e) {
            throw new ClientException(new IOException(e));
        }
    }

    public final long g() {
        try {
            String a2 = a("X-Android-Sent-Millis", false);
            if (a2 != null) {
                return Long.parseLong(a2);
            }
        } catch (Throwable unused) {
        }
        Long l = this.h;
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    @NonNull
    public final String h() {
        return this.a;
    }

    private c(@NonNull String str, @Nullable byte[] bArr, @Nullable String str2, @NonNull HttpURLConnection httpURLConnection, boolean z) {
        this.h = null;
        this.i = null;
        this.a = str;
        this.d = str2;
        this.e = z;
        this.b = bArr;
        this.c = httpURLConnection;
    }

    @Nullable
    public final String a(@NonNull String str, boolean z) throws ClientException, ServerException, IOException {
        i();
        int f = f();
        if (Thread.interrupted()) {
            b();
            throw new ClientException("The thread has been cancelled after connection start", ClientException.a.CANCELLED);
        }
        boolean z2 = false;
        boolean z3 = z && f >= 400;
        if (!z && f != 200) {
            z2 = true;
        }
        if (z3 || z2) {
            b();
            throw new ServerException(f);
        }
        j();
        return this.c.getHeaderField(str);
    }

    public final void a() {
        i();
        this.c.disconnect();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008e A[Catch: all -> 0x00b4, TRY_ENTER, TryCatch #2 {all -> 0x00b4, blocks: (B:15:0x0036, B:16:0x003a, B:19:0x008e, B:22:0x0094, B:25:0x00a1, B:28:0x00a5), top: B:14:0x0036, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0042 A[EDGE_INSN: B:35:0x0042->B:36:0x0042 BREAK  A[LOOP:0: B:16:0x003a->B:31:0x003a], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(@NonNull ByteArrayOutputStream byteArrayOutputStream) throws IOException, ServerException, ClientException {
        Integer valueOf;
        InputStream c;
        byte[] bArr;
        int read;
        int intValue;
        i();
        try {
            int f = f();
            if (Thread.interrupted()) {
                b();
                throw new ClientException("The thread has been cancelled after connection start", ClientException.a.CANCELLED);
            }
            if (f == 200) {
                String a2 = a(Http.Header.CONTENT_LENGTH, false);
                try {
                    try {
                        if (!TextUtils.isEmpty(a2)) {
                            try {
                                valueOf = Integer.valueOf(Integer.parseInt(a2));
                            } catch (NumberFormatException unused) {
                            }
                            c = c();
                            long nanoTime = System.nanoTime();
                            bArr = new byte[51200];
                            int i = 0;
                            int i2 = 0;
                            while (true) {
                                read = c.read(bArr);
                                if (read > 0) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, read);
                                i += read;
                                if (valueOf != null && (intValue = (int) ((i / valueOf.intValue()) * 100.0d)) != i2 && intValue % 10 == 0) {
                                    FileLog.v("HttpConnection", "File download progress %d", Integer.valueOf(intValue));
                                    i2 = intValue;
                                }
                            }
                            byteArrayOutputStream.flush();
                            byteArrayOutputStream.close();
                            FileLog.v("HttpConnection", "File download took %d ms", Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime)));
                            if (valueOf != null && valueOf.intValue() != i) {
                                throw new ClientException("Content size is not equal to the promoted one", ClientException.a.DEFAULT);
                            }
                            FileLog.v("HttpConnection", "File download completed (%d written)", Integer.valueOf(i));
                            c.close();
                            return;
                        }
                        bArr = new byte[51200];
                        int i3 = 0;
                        int i22 = 0;
                        while (true) {
                            read = c.read(bArr);
                            if (read > 0) {
                            }
                        }
                        byteArrayOutputStream.flush();
                        byteArrayOutputStream.close();
                        FileLog.v("HttpConnection", "File download took %d ms", Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime)));
                        if (valueOf != null) {
                            throw new ClientException("Content size is not equal to the promoted one", ClientException.a.DEFAULT);
                        }
                        FileLog.v("HttpConnection", "File download completed (%d written)", Integer.valueOf(i3));
                        c.close();
                        return;
                    } catch (Throwable th) {
                        byteArrayOutputStream.flush();
                        byteArrayOutputStream.close();
                        throw th;
                    }
                    long nanoTime2 = System.nanoTime();
                } finally {
                }
                valueOf = null;
                c = c();
            } else {
                b();
                throw new ServerException(f);
            }
        } finally {
            i();
            this.c.disconnect();
        }
    }

    private static void a(@Nullable InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return;
        }
        try {
            try {
                do {
                } while (inputStream.read(new byte[1024]) >= 0);
                inputStream.close();
            } finally {
            }
        } catch (IOException e) {
            FileLog.e("HttpConnection", "emptyAndClose %s", e.getMessage());
        }
    }
}
