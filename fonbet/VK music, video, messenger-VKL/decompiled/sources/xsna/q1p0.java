package xsna;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.uuid.Uuid;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;

/* compiled from: TogglesExtendedNetworkCheck.kt */
/* loaded from: classes3.dex */
public final class q1p0 implements wbq {
    public final Object a;
    public final Object b;

    public q1p0(Context context) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.a = msy.a(lazyThreadSafetyMode, new buc0(9));
        this.b = msy.a(lazyThreadSafetyMode, new lva0(context, 27));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean a() {
        ?? r0 = this.b;
        try {
            NetworkCapabilities networkCapabilities = ((ConnectivityManager) r0.getValue()).getNetworkCapabilities(((ConnectivityManager) r0.getValue()).getActiveNetwork());
            if (networkCapabilities != null) {
                return networkCapabilities.hasTransport(1);
            }
            return false;
        } catch (Exception e) {
            L.g("UnstableNetworkDetectorLogger", e);
            return true;
        }
    }

    @Override // xsna.wbq
    public final boolean run() {
        Object failure;
        boolean a = a();
        boolean f = epx.f(d6q0.p, Boolean.TRUE);
        String h = Uuid.a.a().h();
        StringBuilder b = xy6.b(f ? 1 : 0, "?network_check_id=", h, "&tunnel_enabled=", "&is_wifi=");
        b.append(a ? 1 : 0);
        String sb = b.toString();
        UserId c = o25.a().c();
        try {
            io.reactivex.rxjava3.subjects.d<l260> dVar = m1p0.b;
            zyu zyuVar = new zyu(new iea(this, c, sb, 6), 26);
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            dVar.getClass();
            failure = (l260) new io.reactivex.rxjava3.internal.operators.observable.p1(new io.reactivex.rxjava3.internal.operators.observable.i0(new io.reactivex.rxjava3.internal.operators.observable.c0(dVar, zyuVar, kVar), new o8c0(new s45(h, 2), 6)).y0(ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS, TimeUnit.MILLISECONDS), new vul0(new kz0(27))).a();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        l260 l260Var = (l260) failure;
        return l260Var != null && l260Var.b;
    }
}
