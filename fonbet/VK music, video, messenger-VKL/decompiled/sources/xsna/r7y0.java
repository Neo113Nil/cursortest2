package xsna;

import android.net.Uri;
import com.vk.httpexecutor.api.NetworkClient;
import com.vk.log.L;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.p;
import xsna.h7y0;

/* compiled from: ZstdDictDownloader.kt */
/* loaded from: classes3.dex */
public final class r7y0 {
    public static final long g = TimeUnit.MINUTES.toMillis(16);
    public static final long h = TimeUnit.HOURS.toMillis(24);
    public static final /* synthetic */ int i = 0;
    public final ExecutorService a;
    public final ScheduledExecutorService b;
    public volatile b c = b.IDLE;
    public final jaq d = new jaq(500, g);
    public final AtomicInteger e = new AtomicInteger();
    public volatile long f = System.currentTimeMillis();

    /* compiled from: ZstdDictDownloader.kt */
    public interface a {
        void a(bn8 bn8Var, String str);

        String b();

        void c(long j);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ZstdDictDownloader.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b DOWNLOADING;
        public static final b DOWNLOADING_ERROR;
        public static final b IDLE;
        public static final b WAIT_FOR_NEXT_DOWNLOAD_WINDOW;

        static {
            b bVar = new b("IDLE", 0);
            IDLE = bVar;
            b bVar2 = new b("DOWNLOADING", 1);
            DOWNLOADING = bVar2;
            b bVar3 = new b("DOWNLOADING_ERROR", 2);
            DOWNLOADING_ERROR = bVar3;
            b bVar4 = new b("WAIT_FOR_NEXT_DOWNLOAD_WINDOW", 3);
            WAIT_FOR_NEXT_DOWNLOAD_WINDOW = bVar4;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
            $VALUES = bVarArr;
            $ENTRIES = new asp(bVarArr);
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public r7y0(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService, p7y0 p7y0Var) {
        this.a = executorService;
        this.b = scheduledExecutorService;
    }

    public final void a(String str, a aVar) {
        Uri uri;
        ft ftVar = (ft) new zo4(str).u(0L);
        h7y0.a aVar2 = ftVar != null ? new h7y0.a(ftVar.a, ftVar.b, ftVar.c) : null;
        if (aVar2 == null) {
            throw new IllegalArgumentException("AccountZstdDict is empty");
        }
        String str2 = aVar2.b;
        if (epx.f(aVar.b(), str2)) {
            L.e(air.b('!', "Already have needed dict version: ", str2));
            return;
        }
        try {
            uri = Uri.parse(aVar2.a);
        } catch (Throwable th) {
            L.i(th);
            uri = Uri.EMPTY;
        }
        if (epx.f(uri, Uri.EMPTY)) {
            throw new IllegalArgumentException("zstd download uri is empty");
        }
        o260 o260Var = d260.a;
        okhttp3.o b2 = (o260Var != null ? o260Var : null).b(NetworkClient.ClientType.CLIENT_DEFAULT);
        p.a aVar3 = new p.a();
        aVar3.i(uri.toString());
        okhttp3.u execute = ((f8f0) b2.a(aVar3.b())).execute();
        if (!execute.t()) {
            throw new IllegalStateException("Can't download zstd dictionary " + execute.e + ' ' + uri);
        }
        okhttp3.v vVar = execute.h;
        if (vVar == null) {
            throw new IllegalStateException(i6n0.a(uri, "Zstd response body is null "));
        }
        bn8 source = vVar.source();
        try {
            aVar.a(source, aVar2.c);
            s3q0 s3q0Var = s3q0.a;
            source.close();
        } finally {
        }
    }
}
