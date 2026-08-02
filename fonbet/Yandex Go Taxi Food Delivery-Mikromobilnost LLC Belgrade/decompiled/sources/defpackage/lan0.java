package defpackage;

import androidx.core.view.b;
import com.yandex.go.scooters.api.domain.model.ScootersVehicleType;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.domain.model.ScootersCompletionPhotoVehicleDetectionState;

/* loaded from: classes6.dex */
public final class lan0 implements pan0 {
    public boolean a = true;
    public final /* synthetic */ nan0 b;

    public lan0(nan0 nan0Var) {
        this.b = nan0Var;
    }

    @Override // defpackage.pan0
    public final void B7(boolean z) {
        nan0 nan0Var = this.b;
        nan0Var.j().i.setSelected(z);
        b.t(nan0Var.j().i, nan0Var.j().i.isSelected() ? nan0Var.t : nan0Var.s);
    }

    @Override // defpackage.pan0
    public final void o7() {
        nan0 nan0Var = this.b;
        nan0Var.j().l.setEnabled(false);
        nan0Var.j().i.setEnabled(false);
    }

    @Override // defpackage.pan0
    public final void q2() {
        this.b.j().i.setVisibility(0);
    }

    @Override // defpackage.pan0
    public final void success() {
        this.b.g();
    }

    @Override // defpackage.pan0
    public final void tf(ScootersCompletionPhotoVehicleDetectionState scootersCompletionPhotoVehicleDetectionState) {
        nan0 nan0Var = this.b;
        tso0 tso0Var = nan0Var.m;
        int i = man0.a[scootersCompletionPhotoVehicleDetectionState.ordinal()];
        if (i == 1) {
            nan0Var.j().m.setTargetRectColor(nan0Var.v);
            nan0Var.j().e.setVisibility(8);
            return;
        }
        if (i == 2) {
            nan0Var.j().m.setTargetRectColor(nan0Var.w);
            int i2 = r0h0.ic_scooters_completion_photo_vehicle_detection_badge_success;
            int i3 = kyh0.scooters_completion_photo_vehicle_detection_badge_success;
            int i4 = kyh0.scooters_completion_photo_vehicle_detection_badge_success_bike;
            if (tso0Var.d == ScootersVehicleType.BIKE) {
                i3 = i4;
            }
            nan0Var.j().e.setVisibility(0);
            nan0Var.j().f.setImageResource(i2);
            nan0Var.j().h.setText(i3);
            return;
        }
        if (i != 3) {
            w511.b();
            return;
        }
        nan0Var.j().m.setTargetRectColor(nan0Var.x);
        int i5 = r0h0.ic_scooters_completion_photo_vehicle_detection_badge_error;
        int i6 = kyh0.scooters_completion_photo_vehicle_detection_badge_error;
        int i7 = kyh0.scooters_completion_photo_vehicle_detection_badge_error_bike;
        if (tso0Var.d == ScootersVehicleType.BIKE) {
            i6 = i7;
        }
        nan0Var.j().e.setVisibility(0);
        nan0Var.j().f.setImageResource(i5);
        nan0Var.j().h.setText(i6);
    }

    @Override // defpackage.pan0
    public final void v3() {
        nan0 nan0Var = this.b;
        nan0Var.j().l.setEnabled(true);
        nan0Var.j().i.setEnabled(true);
    }

    @Override // defpackage.pan0
    public final void y7() {
        nan0 nan0Var = this.b;
        cma1.b(1.0f, nan0Var.j().a);
        if (this.a) {
            this.a = false;
            nan0Var.q.a("Perf.ScootersCompletionTakePhotoCameraLayer.InitPreview");
        }
    }
}
