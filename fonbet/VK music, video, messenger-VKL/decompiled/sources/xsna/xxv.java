package xsna;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.Nullable;
import com.vk.dto.common.Source;
import com.vkontakte.android.NetworkStateReceiver;
import java.util.concurrent.TimeUnit;

/* compiled from: ImBridgesInstance.java */
/* loaded from: classes7.dex */
public final class xxv {
    public final Context b;
    public final io.reactivex.rxjava3.disposables.b d = new io.reactivex.rxjava3.disposables.b();
    public io.reactivex.rxjava3.disposables.b e = new io.reactivex.rxjava3.disposables.b();
    public boolean f = true;
    public boolean g = false;
    public final a h = new a();
    public boolean a = false;

    @Nullable
    public a1w c = null;

    /* compiled from: ImBridgesInstance.java */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            long j = wp80.c(intent).b;
            b25 a = o25.a();
            if (j != 0) {
                xxv xxvVar = xxv.this;
                if (xxvVar.a && a.b() && j == a.c().b) {
                    xxvVar.e.dispose();
                    if (!xxvVar.f || xxvVar.g) {
                        xxvVar.e = new io.reactivex.rxjava3.disposables.b(new io.reactivex.rxjava3.internal.operators.completable.p(xxvVar.c.C("ImBridgesInstance", new vo(Source.NETWORK, true)).q(asu0.a.c())).subscribe(io.reactivex.rxjava3.internal.functions.a.c, kwg0.b()));
                    } else {
                        xxvVar.g = true;
                        xxvVar.e = new io.reactivex.rxjava3.disposables.b();
                    }
                }
            }
        }
    }

    public xxv(Context context) {
        this.b = context;
    }

    public final void a(a1w a1wVar) {
        jyp jypVar = new jyp(new w9w(a1wVar));
        io.reactivex.rxjava3.disposables.b bVar = this.d;
        bVar.b(jypVar);
        bVar.b(a1wVar.l.a().a0(asu0.a.c()).subscribe(jypVar));
    }

    public final void b() {
        if (this.a) {
            return;
        }
        this.a = true;
        this.c = i2w.a();
        if (NetworkStateReceiver.a().b) {
            this.f = false;
        }
        a(this.c);
        if (this.c.r().h.i()) {
            a1w a1wVar = q1w.b;
            if (a1wVar == null) {
                a1wVar = null;
            }
            a(a1wVar);
        }
        this.d.b(new io.reactivex.rxjava3.internal.operators.observable.i0(this.c.l.a().a0(asu0.a.c()), new gp(20)).y(100L, TimeUnit.MILLISECONDS).subscribe(new a620()));
        anj.d(this.b, this.h, new IntentFilter("com.vkontakte.android.ACTION_PROFILE_UPDATED"), hf8.a, 4);
    }
}
