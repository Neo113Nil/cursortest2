package xsna;

import android.view.View;
import com.vk.dto.common.ImageSize;
import com.vk.imageloader.view.VKImageView;
import xsna.dqe0;

/* compiled from: view_helpers.kt */
/* loaded from: classes17.dex */
public final class w830 implements View.OnLayoutChangeListener {
    public final /* synthetic */ com.vk.clips.tool.view.nps.internal.moreless.a b;
    public final /* synthetic */ dqe0.c c;

    public w830(com.vk.clips.tool.view.nps.internal.moreless.a aVar, dqe0.c cVar) {
        this.b = aVar;
        this.c = cVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        VKImageView vKImageView = this.b.t;
        ImageSize Cb = this.c.a.Cb(vKImageView.getWidth(), true, false);
        vKImageView.load(Cb != null ? Cb.d.d : null);
    }
}
