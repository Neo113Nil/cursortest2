package xsna;

import android.view.View;
import com.vk.clips.sdk.shared.item.video.VideoTextureViewAdapter;
import com.vk.dto.common.ClipVideoFile;
import xsna.x0d;

/* compiled from: ViewExt.kt */
/* loaded from: classes17.dex */
public final class z0d implements View.OnLayoutChangeListener {
    public final /* synthetic */ x0d.a b;
    public final /* synthetic */ ClipVideoFile c;

    public z0d(x0d.a aVar, ClipVideoFile clipVideoFile) {
        this.b = aVar;
        this.c = clipVideoFile;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        x0d.a aVar = this.b;
        aVar.a.getVideoTextureViewAdapter().a(aVar.c(this.c) ? VideoTextureViewAdapter.ScaleType.CROP : VideoTextureViewAdapter.ScaleType.FIT);
    }
}
