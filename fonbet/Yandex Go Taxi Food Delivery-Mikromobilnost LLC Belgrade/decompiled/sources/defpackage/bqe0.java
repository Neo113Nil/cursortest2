package defpackage;

import android.graphics.Bitmap;
import android.media.Image;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.internal.mlkit_vision_text_common.zzob;
import com.google.android.gms.internal.mlkit_vision_text_common.zzot;
import com.google.android.gms.internal.mlkit_vision_text_common.zzou;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsb;
import com.yandex.messaging.internal.view.timeline.g0;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.List;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.taxi.preorder.source.PreorderDrivingRouteProvider$loadMapkitDrivingRoute$$inlined$suspendCallbackApi$2;

/* loaded from: classes6.dex */
public final class bqe0 implements nlm, xsb1 {
    public long a;
    public final Object b;
    public final Object c;
    public final Object w;

    public bqe0(g0 g0Var, w3c w3cVar) {
        this.b = new Handler(Looper.getMainLooper());
        this.c = g0Var;
        this.w = w3cVar;
    }

    @Override // defpackage.nlm
    public void a() {
        ((PreorderDrivingRouteProvider$loadMapkitDrivingRoute$$inlined$suspendCallbackApi$2) this.c).invoke(null);
    }

    @Override // defpackage.xsb1
    public o3 b() {
        int limit;
        gsy0 gsy0Var = (gsy0) this.b;
        long j = this.a;
        zzou zzouVar = (zzou) this.c;
        xzv xzvVar = (xzv) this.w;
        tmb1 tmb1Var = new tmb1();
        b9b1 b9b1Var = new b9b1();
        b9b1Var.a = Long.valueOf(j & ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
        b9b1Var.b = zzouVar;
        b9b1Var.c = Boolean.valueOf(gsy0.i);
        Boolean bool = Boolean.TRUE;
        b9b1Var.d = bool;
        b9b1Var.e = bool;
        tmb1Var.a = new h9b1(b9b1Var);
        int i = xzvVar.g;
        if (i == -1) {
            Bitmap bitmap = xzvVar.a;
            cvw.l(bitmap);
            limit = bitmap.getAllocationByteCount();
        } else if (i == 17 || i == 842094169) {
            ByteBuffer byteBuffer = xzvVar.b;
            cvw.l(byteBuffer);
            limit = byteBuffer.limit();
        } else if (i != 35) {
            limit = 0;
        } else {
            Image.Plane[] a = xzvVar.a();
            cvw.l(a);
            limit = (a[0].getBuffer().limit() * 3) / 2;
        }
        f8b1 f8b1Var = new f8b1();
        f8b1Var.a = i != -1 ? i != 35 ? i != 842094169 ? i != 16 ? i != 17 ? zzob.UNKNOWN_FORMAT : zzob.NV21 : zzob.NV16 : zzob.YV12 : zzob.YUV_420_888 : zzob.BITMAP;
        f8b1Var.b = Integer.valueOf(limit & Integer.MAX_VALUE);
        tmb1Var.b = new o8b1(f8b1Var);
        jnb1 jnb1Var = new jnb1();
        gsy0Var.g.getClass();
        jnb1Var.a = zzsb.LATIN;
        tmb1Var.c = new qnb1(jnb1Var);
        xmb1 xmb1Var = new xmb1(tmb1Var);
        ebb1 ebb1Var = new ebb1();
        ebb1Var.c = gsy0Var.g.a() ? zzot.TYPE_THICK : zzot.TYPE_THIN;
        ebb1Var.d = xmb1Var;
        return new o3(ebb1Var, 0);
    }

    public void c(abz0 abz0Var) {
        ((w3c) this.w).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Handler handler = (Handler) this.b;
        handler.removeCallbacksAndMessages(null);
        long j = elapsedRealtime - this.a;
        if (j < 100) {
            handler.postDelayed(new epo0(10, this, abz0Var), 100 - j);
            return;
        }
        g0 g0Var = (g0) this.c;
        g0Var.getClass();
        tje.e();
        z83.h(null, abz0Var.a > 0);
        b00 b00Var = g0Var.a;
        ((Handler) b00Var.a.get()).post(new lz(7, b00Var, g0Var.b, abz0Var));
        this.a = elapsedRealtime;
    }

    @Override // defpackage.nlm
    public void d(IOException iOException) {
        cqe0 cqe0Var = (cqe0) this.b;
        d0l0.Companion.getClass();
        cqe0Var.t = h5l0.a;
        d0l0 d0l0Var = (d0l0) this.w;
        if (d0l0Var.b() != null) {
            cqe0Var.b.d(this.a, iOException);
        }
        PreorderDrivingRouteProvider$loadMapkitDrivingRoute$$inlined$suspendCallbackApi$2 preorderDrivingRouteProvider$loadMapkitDrivingRoute$$inlined$suspendCallbackApi$2 = (PreorderDrivingRouteProvider$loadMapkitDrivingRoute$$inlined$suspendCallbackApi$2) this.c;
        mtj0 mtj0Var = ntj0.a;
        preorderDrivingRouteProvider$loadMapkitDrivingRoute$$inlined$suspendCallbackApi$2.invoke(new zpe0(d0l0Var, new ltj0(iOException)));
    }

    @Override // defpackage.nlm
    public void e(List list) {
        ((cqe0) this.b).b.e(this.a, list);
        PreorderDrivingRouteProvider$loadMapkitDrivingRoute$$inlined$suspendCallbackApi$2 preorderDrivingRouteProvider$loadMapkitDrivingRoute$$inlined$suspendCallbackApi$2 = (PreorderDrivingRouteProvider$loadMapkitDrivingRoute$$inlined$suspendCallbackApi$2) this.c;
        d0l0 d0l0Var = (d0l0) this.w;
        mtj0 mtj0Var = ntj0.a;
        preorderDrivingRouteProvider$loadMapkitDrivingRoute$$inlined$suspendCallbackApi$2.invoke(new zpe0(d0l0Var, new ktj0(list)));
    }

    public /* synthetic */ bqe0(Object obj, long j, Serializable serializable, Object obj2) {
        this.b = obj;
        this.a = j;
        this.c = serializable;
        this.w = obj2;
    }
}
