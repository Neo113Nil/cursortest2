package xsna;

import android.view.View;
import android.widget.ImageView;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import xsna.x0d;

/* compiled from: ViewExt.kt */
/* loaded from: classes17.dex */
public final class y0d implements View.OnLayoutChangeListener {
    public final /* synthetic */ x0d.a b;
    public final /* synthetic */ SdkClipVideoFile c;

    public y0d(x0d.a aVar, SdkClipVideoFile sdkClipVideoFile) {
        this.b = aVar;
        this.c = sdkClipVideoFile;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        x0d.a aVar = this.b;
        aVar.a.c().setScaleType(aVar.c(k15.z(this.c)) ? ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_CENTER);
    }
}
