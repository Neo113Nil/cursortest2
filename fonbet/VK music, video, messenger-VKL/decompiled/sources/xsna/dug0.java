package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.httpexecutor.api.NetworkClient;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import kotlin.text.Regex;
import okhttp3.Interceptor;
import okhttp3.o;
import okhttp3.p;
import okhttp3.u;

/* compiled from: RxFileDownloader.java */
/* loaded from: classes17.dex */
public final class dug0 implements io.reactivex.rxjava3.core.s<c> {
    public final String b;
    public final File c;
    public final boolean d;

    /* compiled from: RxFileDownloader.java */
    public class a implements Interceptor {
        public final /* synthetic */ io.reactivex.rxjava3.core.r a;

        public a(io.reactivex.rxjava3.core.r rVar) {
            this.a = rVar;
        }

        @Override // okhttp3.Interceptor
        public final okhttp3.u intercept(Interceptor.a aVar) throws IOException {
            okhttp3.u a = aVar.a(aVar.request());
            u.a w = a.w();
            w.g = new d(a.h, this.a);
            return w.c();
        }
    }

    /* compiled from: RxFileDownloader.java */
    public static class b extends IOException {
    }

    /* compiled from: RxFileDownloader.java */
    public static class c {
        public final int a;
        public float b;
        public final File c;

        public c() {
            this(-1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null);
        }

        public static c a(File file) {
            return new c(2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, file);
        }

        public static c b(float f) {
            return new c(1, f, null);
        }

        public final boolean c() {
            return this.a == 2;
        }

        public final boolean d() {
            return this.a == 1;
        }

        public final String toString() {
            int i = this.a;
            if (i == 0) {
                return "DownloadEvent:TYPE_START";
            }
            if (i == -1) {
                return "DownloadEvent:TYPE_PROGRESS_INDETERMINATE";
            }
            if (d()) {
                return "DownloadEvent:TYPE_PROGRESS:" + this.b;
            }
            return "DownloadEvent:TYPE_DONE:" + this.c.getAbsolutePath();
        }

        public c(int i, float f, File file) {
            this.a = i;
            this.b = f;
            this.c = file;
        }
    }

    /* compiled from: RxFileDownloader.java */
    public static class d extends okhttp3.v {
        public final okhttp3.v d;
        public final io.reactivex.rxjava3.core.r<c> e;
        public e8f0 f;

        public d(okhttp3.v vVar, io.reactivex.rxjava3.core.r<c> rVar) {
            this.d = vVar;
            this.e = rVar;
        }

        @Override // okhttp3.v
        public final long contentLength() {
            return this.d.contentLength();
        }

        @Override // okhttp3.v
        public final okhttp3.m contentType() {
            return this.d.contentType();
        }

        @Override // okhttp3.v
        public final bn8 source() {
            if (this.f == null) {
                this.f = new e8f0(new fug0(this, this.d.source(), new AtomicBoolean(true)));
            }
            return this.f;
        }
    }

    public dug0(String str, File file, boolean z) {
        this.b = str;
        this.c = file;
        this.d = z;
    }

    public static io.reactivex.rxjava3.internal.operators.observable.l2 a(File file, String str) {
        io.reactivex.rxjava3.internal.operators.observable.q qVar = new io.reactivex.rxjava3.internal.operators.observable.q(new dug0(str, file, false));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return qVar.i0().r0(asu0.a.c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00da A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:3:0x0004, B:7:0x0011, B:30:0x00bd, B:31:0x00d4, B:33:0x00da, B:46:0x00e9, B:48:0x00ee, B:49:0x00f1, B:40:0x00ce), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v4 */
    @Override // io.reactivex.rxjava3.core.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void subscribe(io.reactivex.rxjava3.core.r<c> rVar) throws Exception {
        ?? r1;
        okhttp3.v vVar;
        okhttp3.v vVar2;
        d8f0 d8f0Var;
        String str = "request failed. code: ";
        try {
            File file = this.c;
            Regex regex = com.vk.core.files.a.a;
            vhk0.d(file);
            o260 o260Var = d260.a;
            d8f0 d8f0Var2 = null;
            if (o260Var == null) {
                o260Var = null;
            }
            try {
                o.a i = o260Var.i(NetworkClient.ClientType.CLIENT_DEFAULT);
                i.d.add(new a(rVar));
                okhttp3.o oVar = new okhttp3.o(i);
                p.a aVar = new p.a();
                aVar.i(this.b);
                okhttp3.u execute = ((f8f0) oVar.a(aVar.b())).execute();
                rVar.a(new eug0(execute));
                try {
                    if (this.d && !execute.t()) {
                        throw new IOException("request failed. code: " + execute.e);
                    }
                    vVar = execute.h;
                    try {
                        long contentLength = vVar.contentLength();
                        String parent = this.c.getParent();
                        if (execute.t() && parent != null) {
                            r6m.a.getClass();
                            if (r6m.b(parent) < contentLength) {
                                throw new IOException("no left space on device for " + contentLength + " bytes");
                            }
                        }
                        File file2 = this.c;
                        Logger logger = ez70.a;
                        d8f0Var = new d8f0(mq9.c(file2));
                    } catch (b unused) {
                    }
                    try {
                        d8f0Var.L2(vVar.source());
                        d8f0Var.close();
                        vVar2 = vVar;
                    } catch (b unused2) {
                        d8f0Var2 = d8f0Var;
                        vhk0.b(this.c);
                        if (d8f0Var2 != null) {
                            x2r0.c(d8f0Var2);
                        }
                        if (vVar != null) {
                            vVar2 = vVar;
                            x2r0.c(vVar2);
                        }
                        if (rVar.h()) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        d8f0Var2 = d8f0Var;
                        r1 = vVar;
                        if (d8f0Var2 != null) {
                            x2r0.c(d8f0Var2);
                        }
                        if (r1 != 0) {
                            x2r0.c(r1);
                        }
                        throw th;
                    }
                } catch (b unused3) {
                    vVar = null;
                } catch (Throwable th2) {
                    th = th2;
                    r1 = 0;
                }
                x2r0.c(vVar2);
                if (rVar.h()) {
                    rVar.onNext(c.a(this.c));
                    rVar.onComplete();
                }
            } catch (Throwable th3) {
                th = th3;
                r1 = str;
            }
        } catch (Throwable th4) {
            File file3 = this.c;
            Regex regex2 = com.vk.core.files.a.a;
            vhk0.b(file3);
            if (rVar.h()) {
                return;
            }
            rVar.onError(th4);
        }
    }
}
