package xsna;

import android.content.Context;
import android.os.Handler;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.p06;
import xsna.qlk0;
import xsna.vv90;

/* compiled from: OneVideoBandwidthMeterImpl.kt */
/* loaded from: classes8.dex */
public final class jk80 implements ik80, p06 {
    public final Context a;
    public final k9q b;
    public final CopyOnWriteArrayList c;
    public final a d;

    /* compiled from: OneVideoBandwidthMeterImpl.kt */
    public static final class a implements mjp0 {
        public a() {
        }

        @Override // xsna.mjp0
        public final void e(androidx.media3.datasource.a aVar, evk evkVar, boolean z) {
            jk80 jk80Var = jk80.this;
            k9q k9qVar = jk80Var.b;
            if (k9qVar == null) {
                k9qVar = null;
            }
            if (k9qVar != null) {
                k9qVar.e(aVar, evkVar, z);
            }
            Iterator it = jk80Var.c.iterator();
            while (it.hasNext()) {
                ((mjp0) it.next()).e(aVar, evkVar, z);
            }
        }

        @Override // xsna.mjp0
        public final void f(androidx.media3.datasource.a aVar, evk evkVar, boolean z, int i) {
            jk80 jk80Var = jk80.this;
            k9q k9qVar = jk80Var.b;
            if (k9qVar == null) {
                k9qVar = null;
            }
            if (k9qVar != null) {
                k9qVar.f(aVar, evkVar, z, i);
            }
            Iterator it = jk80Var.c.iterator();
            while (it.hasNext()) {
                ((mjp0) it.next()).f(aVar, evkVar, z, i);
            }
        }

        @Override // xsna.mjp0
        public final void g(androidx.media3.datasource.a aVar, evk evkVar, boolean z) {
            jk80 jk80Var = jk80.this;
            k9q k9qVar = jk80Var.b;
            if (k9qVar == null) {
                k9qVar = null;
            }
            if (k9qVar != null) {
                k9qVar.g(aVar, evkVar, z);
            }
            Iterator it = jk80Var.c.iterator();
            while (it.hasNext()) {
                ((mjp0) it.next()).g(aVar, evkVar, z);
            }
        }

        @Override // xsna.mjp0
        public final void h(androidx.media3.datasource.a aVar, evk evkVar, boolean z) {
            jk80 jk80Var = jk80.this;
            k9q k9qVar = jk80Var.b;
            if (k9qVar == null) {
                k9qVar = null;
            }
            if (k9qVar != null) {
                k9qVar.h(aVar, evkVar, z);
            }
            Iterator it = jk80Var.c.iterator();
            while (it.hasNext()) {
                ((mjp0) it.next()).h(aVar, evkVar, z);
            }
        }
    }

    public jk80(Context context) {
        this.a = context;
        qlk0.a aVar = new qlk0.a();
        int i = wn80.a;
        aVar.a = new c2k0(swe0.e(0.5d, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 1.0d));
        aVar.c = 128000L;
        aVar.b = 3;
        qlk0 qlk0Var = new qlk0(aVar);
        vv90 vv90Var = new vv90(10);
        Long l = wn80.t;
        Context applicationContext = context.getApplicationContext();
        new vv90.a();
        new ArrayList();
        new d2k0();
        new p06.a.C3482a();
        HashMap hashMap = new HashMap(8);
        hashMap.put(0, 1000000L);
        Long valueOf = Long.valueOf(C.TIME_UNSET);
        hashMap.put(2, valueOf);
        hashMap.put(3, valueOf);
        hashMap.put(4, valueOf);
        hashMap.put(5, valueOf);
        hashMap.put(10, valueOf);
        int i2 = 9;
        hashMap.put(9, valueOf);
        hashMap.put(7, valueOf);
        if (l != null) {
            hashMap.put(0, l);
        }
        this.b = new k9q(applicationContext, hashMap, vv90Var, qlk0Var);
        new bpn0(new b410(this, i2));
        this.c = new CopyOnWriteArrayList();
        this.d = new a();
    }

    @Override // xsna.ik80, xsna.p06
    public final long a() {
        return this.b.a();
    }

    @Override // xsna.p06
    public final void b(Handler handler, p06.a aVar) {
        this.b.b(handler, aVar);
    }

    @Override // xsna.p06
    public final void c(p06.a aVar) {
        this.b.c(aVar);
    }

    @Override // xsna.p06
    public final mjp0 d() {
        return this.d;
    }

    @Override // xsna.ik80, xsna.p06
    public final long getBitrateEstimate() {
        return this.b.getBitrateEstimate();
    }
}
