package xsna;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.vk.core.fragments.FragmentImpl;
import com.vk.poll.metrics.PollEditorTechMetricsSession;

/* compiled from: DefaultPollEditorTechMetricsCollector.kt */
/* loaded from: classes17.dex */
public final class skl implements tpb0 {
    public final io.reactivex.rxjava3.disposables.b a = new io.reactivex.rxjava3.disposables.b();
    public boolean b;
    public Long c;
    public Long d;

    @Override // xsna.tpb0
    public final void G() {
        this.d = Long.valueOf(SystemClock.elapsedRealtime());
    }

    @Override // xsna.tpb0
    public final void a(Intent intent) {
        intent.putExtra("pollEditorPickerTechMetrics", new PollEditorTechMetricsSession(this.c, this.d));
    }

    @Override // xsna.tpb0
    public final void b(Bundle bundle) {
        Long l = this.c;
        if (l != null) {
            bundle.putLong("pickInteractionTime", l.longValue());
        }
        Long l2 = this.d;
        if (l2 != null) {
            bundle.putLong("pickElapsedTime", l2.longValue());
        }
    }

    @Override // xsna.tpb0
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

    @Override // xsna.tpb0
    public final void g(Bundle bundle) {
        this.c = bundle.containsKey("pickInteractionTime") ? Long.valueOf(bundle.getLong("pickInteractionTime")) : this.c;
        this.d = bundle.containsKey("pickElapsedTime") ? Long.valueOf(bundle.getLong("pickElapsedTime")) : this.d;
    }

    @Override // xsna.tpb0
    public final void onCreate() {
        if (this.b) {
            return;
        }
        this.b = true;
        io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new fca(this, 1));
        asu0.a.getClass();
        this.a.b(itg0.n(vVar.q(asu0.m())));
    }

    @Override // xsna.tpb0
    public final void onDestroy() {
        this.a.e();
        this.b = false;
    }
}
