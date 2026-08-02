package xsna;

import android.view.View;
import com.vk.dto.common.VideoFile;
import xsna.f5h0;

/* compiled from: ViewExt.kt */
/* loaded from: classes17.dex */
public final class uwc implements View.OnLayoutChangeListener {
    public final /* synthetic */ twc b;
    public final /* synthetic */ VideoFile c;

    public uwc(twc twcVar, VideoFile videoFile) {
        this.b = twcVar;
        this.c = videoFile;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        twc twcVar = this.b;
        twcVar.getCover().setActualScaleType(twc.U4(twcVar, this.c) ? f5h0.f.a : f5h0.i.a);
    }
}
