package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.animation.PathInterpolator;
import com.yandex.go.pickup_from_photo.ui.CameraTargetView;

/* loaded from: classes13.dex */
public final class lt7 {
    public final RectF a = new RectF();
    public boolean b;
    public ValueAnimator c;
    public float d;
    public final float e;
    public final float f;
    public final int g;
    public final Paint h;
    public final Paint i;
    public final PathInterpolator j;
    public final /* synthetic */ CameraTargetView k;

    public lt7(CameraTargetView cameraTargetView) {
        this.k = cameraTargetView;
        this.e = tje.u(3, cameraTargetView.getContext());
        this.f = tje.u(350, cameraTargetView.getContext());
        this.g = cameraTargetView.getContext().getColor(wog0.pickup_form_photo_camera_scan_trail);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(-1);
        this.h = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        this.i = paint2;
        this.j = new PathInterpolator(0.65f, 0.0f, 0.35f, 1.0f);
    }

    public final void a() {
        if (this.c != null) {
            return;
        }
        RectF rectF = this.a;
        if (rectF.height() <= 0.0f) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, rectF.height() + this.f);
        ofFloat.setDuration(2000L);
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(this.j);
        ofFloat.addUpdateListener(new vf2(1, this, this.k));
        ofFloat.start();
        this.c = ofFloat;
    }
}
