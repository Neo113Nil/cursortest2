package xsna;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.posting.data.PickerTechMetricsSession;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: DefaultMviPickerTechMetricsCollector.kt */
/* loaded from: classes18.dex */
public final class djl implements am50 {
    public final gzs<s3q0> a;
    public final io.reactivex.rxjava3.disposables.b b = new io.reactivex.rxjava3.disposables.b();
    public boolean c;
    public Long d;
    public Long e;

    /* compiled from: DefaultMviPickerTechMetricsCollector.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((com.vk.metrics.eventtracking.b) this.receiver).a(th);
            return s3q0.a;
        }
    }

    public djl(gzs<s3q0> gzsVar) {
        this.a = gzsVar;
    }

    @Override // xsna.am50
    public final void a(Intent intent) {
        intent.putExtra("PICKER_TECH_METRICS_SESSION", new PickerTechMetricsSession(this.d, this.e));
    }

    @Override // xsna.am50
    public final void b() {
        this.e = Long.valueOf(SystemClock.elapsedRealtime());
    }

    @Override // xsna.am50
    public final void c() {
        e();
    }

    @Override // xsna.am50
    public final void d() {
        e();
    }

    public final void e() {
        if (this.c) {
            return;
        }
        this.c = true;
        io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new os2(this, 3));
        asu0.a.getClass();
        io.reactivex.rxjava3.internal.operators.single.f0 q = vVar.q(asu0.m());
        int i = kwg0.a;
        this.b.b(q.subscribe(new iwg0(), new gn0(new a(1, com.vk.metrics.eventtracking.b.a, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0), 18)));
    }

    public final void f(Bundle bundle) {
        Parcelable parcelable;
        Object parcelable2;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable("PICKER_TECH_METRICS_SESSION", PickerTechMetricsSession.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundle.getParcelable("PICKER_TECH_METRICS_SESSION");
            if (!(parcelable3 instanceof PickerTechMetricsSession)) {
                parcelable3 = null;
            }
            parcelable = (PickerTechMetricsSession) parcelable3;
        }
        PickerTechMetricsSession pickerTechMetricsSession = (PickerTechMetricsSession) parcelable;
        if (pickerTechMetricsSession == null) {
            return;
        }
        this.d = pickerTechMetricsSession.b;
        this.e = pickerTechMetricsSession.c;
    }

    public final void g(MviImplFragment mviImplFragment) {
        if (mviImplFragment.A != 0) {
            return;
        }
        Fragment parentFragment = mviImplFragment.getParentFragment();
        FragmentImpl fragmentImpl = parentFragment instanceof FragmentImpl ? (FragmentImpl) parentFragment : null;
        if (fragmentImpl == null || fragmentImpl.A != 0) {
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
}
