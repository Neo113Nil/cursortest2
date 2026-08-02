package xsna;

import android.content.Intent;
import android.os.SystemClock;
import com.vk.attachpicker.fragment.gallery.PostingAttachGalleryFragment;
import com.vk.posting.data.PickerTechMetricsSession;

/* compiled from: DefaultGalleryPickerTechMetricsCollector.kt */
/* loaded from: classes15.dex */
public final class ifl implements a5t {
    public final io.reactivex.rxjava3.disposables.b a = new io.reactivex.rxjava3.disposables.b();
    public boolean b;
    public Long c;
    public Long d;

    @Override // xsna.a5t
    public final void a(Intent intent) {
        intent.putExtra("PICKER_TECH_METRICS_SESSION", new PickerTechMetricsSession(this.c, this.d));
    }

    @Override // xsna.a5t
    public final void b() {
        this.d = Long.valueOf(SystemClock.elapsedRealtime());
    }

    @Override // xsna.a5t
    public final void c(PostingAttachGalleryFragment postingAttachGalleryFragment) {
        if (postingAttachGalleryFragment.A != 0) {
            return;
        }
        Intent intent = postingAttachGalleryFragment.B;
        if (intent == null) {
            intent = new Intent();
            postingAttachGalleryFragment.B = intent;
        }
        a(intent);
        postingAttachGalleryFragment.setResult(0, intent);
    }

    @Override // xsna.a5t
    public final void d() {
        if (this.b) {
            return;
        }
        this.b = true;
        io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new hfl(this, 0));
        asu0.a.getClass();
        io.reactivex.rxjava3.internal.operators.single.f0 q = vVar.q(asu0.m());
        int i = kwg0.a;
        io.reactivex.rxjava3.disposables.c subscribe = q.subscribe(new iwg0(), new f50(new td5(com.vk.metrics.eventtracking.b.a, 9), 24));
        if (subscribe != null) {
            this.a.b(subscribe);
        }
    }
}
