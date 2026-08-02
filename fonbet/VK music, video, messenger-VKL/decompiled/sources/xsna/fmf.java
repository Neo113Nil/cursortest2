package xsna;

import android.view.View;
import com.vk.clips.design.view.preview.ClipsVideoAndPhotoView;
import com.vk.media.pipeline.model.timeline.Timeline;
import xsna.x4d0;

/* compiled from: View.kt */
/* loaded from: classes16.dex */
public final class fmf implements View.OnLayoutChangeListener {
    public final /* synthetic */ ClipsVideoAndPhotoView b;
    public final /* synthetic */ float c;
    public final /* synthetic */ cv10 d;
    public final /* synthetic */ Timeline e;
    public final /* synthetic */ long f;

    public fmf(ClipsVideoAndPhotoView clipsVideoAndPhotoView, float f, cv10 cv10Var, Timeline timeline, long j) {
        this.b = clipsVideoAndPhotoView;
        this.c = f;
        this.d = cv10Var;
        this.e = timeline;
        this.f = j;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Timeline timeline;
        view.removeOnLayoutChangeListener(this);
        ClipsVideoAndPhotoView clipsVideoAndPhotoView = this.b;
        int measuredHeight = clipsVideoAndPhotoView.getMeasuredHeight();
        int i9 = (int) (measuredHeight * this.c);
        if ((clipsVideoAndPhotoView.d instanceof x4d0.a) && (timeline = this.e) != null) {
            this.d.e(new g0b0(timeline, i9, measuredHeight), this.f);
        }
        f4m.z(i9, measuredHeight, clipsVideoAndPhotoView);
    }
}
