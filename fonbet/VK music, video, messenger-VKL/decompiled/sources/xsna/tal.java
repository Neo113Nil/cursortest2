package xsna;

import android.content.Intent;
import android.os.SystemClock;
import com.vk.attachpicker.base.metrics.AttachPickerTechMetricsSession;
import com.vk.core.fragments.FragmentImpl;

/* compiled from: DefaultAttachPickerTechMetricsCollector.kt */
/* loaded from: classes15.dex */
public final class tal implements c34 {
    public final io.reactivex.rxjava3.disposables.b a = new io.reactivex.rxjava3.disposables.b();
    public boolean b;
    public Long c;
    public Long d;

    @Override // xsna.c34
    public final void a(Intent intent) {
        intent.putExtra("attachPickerTechMetrics", new AttachPickerTechMetricsSession(this.c, this.d));
    }

    @Override // xsna.c34
    public final void b() {
        this.d = Long.valueOf(SystemClock.elapsedRealtime());
    }

    @Override // xsna.c34
    public final void c(FragmentImpl fragmentImpl) {
        if (fragmentImpl.A != 0) {
            return;
        }
        Intent intent = fragmentImpl.B;
        if (intent == null) {
            intent = new Intent();
            fragmentImpl.B = intent;
        }
        a(intent);
        fragmentImpl.setResult(0, intent);
    }

    @Override // xsna.c34
    public final void d(int i) {
        if (i == 0 || this.b) {
            return;
        }
        this.b = true;
        io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new lc6(this, 1));
        asu0.a.getClass();
        io.reactivex.rxjava3.internal.operators.single.f0 q = vVar.q(asu0.m());
        int i2 = kwg0.a;
        this.a.b(q.subscribe(new iwg0(), new iu1(new j37(com.vk.metrics.eventtracking.b.a, 3), 13)));
    }

    @Override // xsna.c34
    public final void onDestroy() {
        this.a.e();
        this.b = false;
    }
}
