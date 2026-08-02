package defpackage;

import android.os.SystemClock;
import com.yandex.messaging.internal.net.a;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public final class gk51 implements x08, w1k0 {
    public static final /* synthetic */ kgx[] K = {new MutablePropertyReference1Impl("uploadCancellable", 0, "getUploadCancellable()Lcom/yandex/messaging/Cancelable;", gk51.class), oyr.B(qoi0.a, gk51.class, "retryJob", "getRetryJob()Lkotlinx/coroutines/Job;", 0)};
    public final gl A;
    public final lqo B;
    public int C;
    public int D;
    public xo3 E;
    public y1k0 G;
    public final ike I;
    public final hk51 a;
    public final q2r b;
    public final yj51 c;
    public final kzq w;
    public final a1r x;
    public final cfu y;
    public final a z;
    public final op3 F = new op3();
    public final rp3 H = new rp3();
    public final com.yandex.messaging.internal.net.file.a J = new com.yandex.messaging.internal.net.file.a(this);

    public gk51(hk51 hk51Var, q2r q2rVar, yj51 yj51Var, kzq kzqVar, a1r a1rVar, cfu cfuVar, vse vseVar, a aVar, gl glVar, lqo lqoVar) {
        this.a = hk51Var;
        this.b = q2rVar;
        this.c = yj51Var;
        this.w = kzqVar;
        this.x = a1rVar;
        this.y = cfuVar;
        this.z = aVar;
        this.A = glVar;
        this.B = lqoVar;
        this.I = vseVar.b();
        c();
        this.G = aVar.d(this);
    }

    @Override // defpackage.w1k0
    public final void a() {
        b();
        y1k0 y1k0Var = this.G;
        if (y1k0Var != null) {
            y1k0Var.close();
        }
        this.G = this.z.d(this);
        this.D = 0;
        c();
    }

    public final void b() {
        kgx[] kgxVarArr = K;
        kgx kgxVar = kgxVarArr[1];
        this.H.a(null);
        xo3 xo3Var = this.E;
        if (xo3Var != null) {
            xo3Var.cancel();
        }
        this.E = null;
        kgx kgxVar2 = kgxVarArr[0];
        this.F.b(null);
    }

    public final void c() {
        b();
        this.C++;
        if (!this.B.a(tz10.n)) {
            d(0L);
            return;
        }
        this.E = this.c.b.a(new wj51(this.a.f, new qq31(22, this)));
    }

    @Override // defpackage.x08
    public final void cancel() {
        String str = this.a.c;
        a1r a1rVar = this.x;
        a1rVar.d.post(new v0r(a1rVar, str, 0));
        gl glVar = this.A;
        if (!glVar.a) {
            ((x22) glVar.c).c("yadisk_upload_file_cancel", "uploadId", (String) glVar.b);
        }
        y1k0 y1k0Var = this.G;
        if (y1k0Var != null) {
            y1k0Var.close();
        }
        this.G = null;
        b();
    }

    public final void d(long j) {
        long j2;
        int i = this.C;
        gl glVar = this.A;
        HashMap hashMap = (HashMap) glVar.x;
        String str = (String) glVar.b;
        hashMap.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
        x22 x22Var = (x22) glVar.c;
        Pair pair = new Pair("uploadId", str);
        Pair pair2 = new Pair("attemptNo", Integer.valueOf(i));
        jzq jzqVar = ((izq) glVar.w).b;
        x22Var.reportEvent("yadisk_upload_file_start", b.i(pair, pair2, new Pair("size", Long.valueOf(jzqVar.b)), new Pair("mimeType", jzqVar.c), new Pair("uploadedBytes", Long.valueOf(j))));
        hk51 hk51Var = this.a;
        hzq hzqVar = hk51Var.e;
        String str2 = hk51Var.f;
        if (j < 0) {
            ny61.g("offset must be >= 0");
            return;
        }
        long j3 = hzqVar.b.b.b;
        if (j > 0) {
            j2 = j;
            this.x.b(j2, j3, hk51Var.c);
        } else {
            j2 = j;
        }
        el11 el11Var = new el11(28, this);
        if (j != 0) {
            hzqVar = this.w.b(hzqVar.b, j2);
        }
        this.b.x = hzqVar.b;
        oif0 oif0Var = new oif0(hzqVar.a, el11Var, j2);
        yj51 yj51Var = this.c;
        xo3 a = yj51Var.b.a(new xj51(yj51Var, str2, oif0Var, j2, this.J));
        kgx kgxVar = K[0];
        this.F.b(a);
    }
}
