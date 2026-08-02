package xsna;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Log;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.InetSocketAddress;
import java.nio.channels.ClosedByInterruptException;
import java.nio.channels.Pipe;
import java.nio.channels.Selector;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.net.ssl.SSLContext;
import kotlin.NoWhenBranchMatchedException;
import one.video.upload.exceptions.FileSizeInterruptException;
import one.video.upload.exceptions.GetSSLContextInterruptException;
import one.video.upload.impl.UploadMode;
import one.video.upload.impl.io.AsyncSocket;

/* compiled from: UploaderImpl.kt */
/* loaded from: classes8.dex */
public final class tdq0 {
    public static final a o = new a();
    public static SSLContext p;
    public final RandomAccessFile a;
    public final UploadMode b;
    public final b c;
    public final mdq0 d;
    public final kdq0 e;
    public final cdi f;
    public final b9r g;
    public final SSLContext h;
    public final scq0 i;
    public final String j;
    public final int k;
    public final String l;
    public final CompletableFuture<d9r> m;
    public final udq0 n;

    /* compiled from: UploaderImpl.kt */
    public static final class a {
    }

    /* compiled from: UploaderImpl.kt */
    public static final class b {
        public final int a;
        public final int b;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            return sl9.c(this.a, this.b, "Config(maxChunkSize=", ", maxConnections=", ")");
        }
    }

    /* compiled from: UploaderImpl.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UploadMode.values().length];
            try {
                iArr[UploadMode.FIXED_FILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UploadMode.STREAMING_FILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public tdq0(Uri uri, RandomAccessFile randomAccessFile, UploadMode uploadMode, b bVar, mdq0 mdq0Var, kdq0 kdq0Var, cdi cdiVar) {
        b9r b9rVar;
        SSLContext sSLContext;
        int intValue;
        this.a = randomAccessFile;
        this.b = uploadMode;
        this.c = bVar;
        this.d = mdq0Var;
        this.e = kdq0Var;
        this.f = cdiVar;
        int i = c.$EnumSwitchMapping$0[uploadMode.ordinal()];
        if (i == 1) {
            try {
                long length = randomAccessFile.length();
                if (length <= 0) {
                    throw new IllegalArgumentException("The file must not be empty");
                }
                b9rVar = new b9r(length, true);
            } catch (InterruptedException e) {
                throw new FileSizeInterruptException(e);
            } catch (ClosedByInterruptException e2) {
                throw new FileSizeInterruptException(e2);
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            b9rVar = new b9r(0L, false);
        }
        this.g = b9rVar;
        if ((epx.f(uri.getScheme(), HttpRequest.DEFAULT_SCHEME) ? this : null) != null) {
            a aVar = o;
            try {
                if (p == null) {
                    synchronized (aVar) {
                        try {
                            if (p == null) {
                                SSLContext sSLContext2 = SSLContext.getInstance("TLSv1.2");
                                sSLContext2.init(null, null, null);
                                p = sSLContext2;
                            }
                            s3q0 s3q0Var = s3q0.a;
                        } finally {
                        }
                    }
                }
                sSLContext = p;
            } catch (InterruptedException e3) {
                throw new GetSSLContextInterruptException(e3);
            } catch (ClosedByInterruptException e4) {
                throw new GetSSLContextInterruptException(e4);
            }
        } else {
            sSLContext = null;
        }
        this.h = sSLContext;
        this.i = new scq0(b9rVar, bVar.a);
        String host = uri.getHost();
        if (host == null) {
            throw new IllegalArgumentException("Host is null");
        }
        this.j = host;
        int port = uri.getPort();
        Integer valueOf = port <= 0 ? null : Integer.valueOf(port);
        if (valueOf != null) {
            intValue = valueOf.intValue();
        } else {
            Integer num = sSLContext != null ? 443 : null;
            intValue = num != null ? num.intValue() : 80;
        }
        this.k = intValue;
        StringBuilder sb = new StringBuilder();
        sb.append(uri.getPath());
        String query = uri.getQuery();
        if (query != null) {
            sb.append("?");
            sb.append(query);
        }
        this.l = sb.toString();
        this.m = new CompletableFuture<>();
        this.n = new udq0(this, cdiVar);
    }

    public final void a(boolean z) {
        udq0 udq0Var = this.n;
        List b2 = udq0Var.b();
        int i = 0;
        if (!(b2 instanceof Collection) || !b2.isEmpty()) {
            Iterator it = b2.iterator();
            while (it.hasNext()) {
                if ((((dai0) it.next()) instanceof maq0) && (i = i + 1) < 0) {
                    e43.s();
                    throw null;
                }
            }
        }
        c4j c4jVar = new c4j(i, this.f);
        fl40 fl40Var = new fl40(this, 10);
        String str = this.j;
        String str2 = this.l;
        scq0 scq0Var = this.i;
        UploadMode uploadMode = this.b;
        RandomAccessFile randomAccessFile = this.a;
        b9r b9rVar = this.g;
        kdq0 kdq0Var = this.e;
        maq0 maq0Var = new maq0(str, str2, scq0Var, uploadMode, randomAccessFile, b9rVar, udq0Var, kdq0Var, c4jVar, this.h, z, fl40Var);
        InetSocketAddress inetSocketAddress = new InetSocketAddress(this.j, this.k);
        if (kdq0Var != null) {
            maq0Var.l = SystemClock.elapsedRealtime();
        }
        AsyncSocket asyncSocket = maq0Var.f;
        asyncSocket.a.connect(inetSocketAddress);
        AsyncSocket.ConnectionState connectionState = AsyncSocket.ConnectionState.DISCONNECTED;
        asyncSocket.a.register((Selector) udq0Var.b, 8, maq0Var);
    }

    public final void b() {
        CompletableFuture<d9r> completableFuture = this.m;
        int i = c.$EnumSwitchMapping$0[this.b.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            try {
                if (!completableFuture.isDone()) {
                    completableFuture.complete(null);
                    return;
                }
                d9r d9rVar = completableFuture.get();
                if (d9rVar != null) {
                    Pipe pipe = d9rVar.a;
                    try {
                        pipe.sink().close();
                    } catch (IOException e) {
                        Log.e("FileInfoUpdateSender", "Failed to close pipe's sink channel", e);
                    }
                    try {
                        pipe.source().close();
                    } catch (IOException e2) {
                        Log.e("FileInfoUpdateSender", "Failed to close pipe's source channel", e2);
                    }
                    s3q0 s3q0Var = s3q0.a;
                }
            } catch (Throwable th) {
                Log.e("Uploader", "Exception while getting and closing the FileSizeUpdateSender", th);
                s3q0 s3q0Var2 = s3q0.a;
            }
        }
    }
}
