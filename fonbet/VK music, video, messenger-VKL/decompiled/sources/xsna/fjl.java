package xsna;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import com.vk.posting.data.PickerTechMetricsSession;
import com.vk.posting.presentation.root.PickerRootFragment;

/* compiled from: DefaultMviRootPickerTechMetricsCollector.kt */
/* loaded from: classes18.dex */
public final class fjl implements gia0 {
    public Long b;
    public Long c;

    public final void a(Bundle bundle) {
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
        Long l = this.b;
        if (l == null) {
            l = pickerTechMetricsSession.b;
        }
        this.b = l;
        Long l2 = this.c;
        if (l2 == null) {
            l2 = pickerTechMetricsSession.c;
        }
        this.c = l2;
    }

    public final void b(Bundle bundle) {
        bundle.putParcelable("PICKER_TECH_METRICS_SESSION", new PickerTechMetricsSession(this.b, this.c));
    }

    public final void c(Intent intent) {
        Parcelable parcelable;
        Object parcelableExtra;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableExtra = intent.getParcelableExtra("PICKER_TECH_METRICS_SESSION", PickerTechMetricsSession.class);
            parcelable = (Parcelable) parcelableExtra;
        } else {
            Parcelable parcelableExtra2 = intent.getParcelableExtra("PICKER_TECH_METRICS_SESSION");
            if (!(parcelableExtra2 instanceof PickerTechMetricsSession)) {
                parcelableExtra2 = null;
            }
            parcelable = (PickerTechMetricsSession) parcelableExtra2;
        }
        PickerTechMetricsSession pickerTechMetricsSession = (PickerTechMetricsSession) parcelable;
        if (pickerTechMetricsSession == null) {
            return;
        }
        Long l = this.b;
        if (l == null) {
            l = pickerTechMetricsSession.b;
        }
        this.b = l;
        Long l2 = this.c;
        if (l2 == null) {
            l2 = pickerTechMetricsSession.c;
        }
        this.c = l2;
    }

    public final void d(PickerRootFragment pickerRootFragment) {
        if (pickerRootFragment.A != 0) {
            return;
        }
        Intent intent = pickerRootFragment.B;
        if (intent == null) {
            intent = new Intent();
            pickerRootFragment.B = intent;
        }
        e(intent);
        pickerRootFragment.setResult(0, intent);
    }

    public final void e(Intent intent) {
        intent.putExtra("PICKER_TECH_METRICS_SESSION", new PickerTechMetricsSession(this.b, this.c));
    }

    @Override // xsna.gia0
    public final void kh() {
        if (this.b != null) {
            return;
        }
        this.b = Long.valueOf(SystemClock.elapsedRealtime());
    }
}
