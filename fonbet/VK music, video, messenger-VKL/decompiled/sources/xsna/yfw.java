package xsna;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.catalog2.common.dto.ui.UIBlockTopshelf;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoTopshelfVh;
import com.vk.imageloader.view.VKImageView;

/* compiled from: ImageBackground.kt */
/* loaded from: classes16.dex */
public final class yfw implements vbp0 {
    public final wzs<Long, String, s3q0> a;
    public final VKImageView b;

    public yfw(Context context, UIBlockTopshelf.TopshelfItem topshelfItem, VideoTopshelfVh.d dVar) {
        yfw yfwVar;
        this.a = dVar;
        VKImageView vKImageView = new VKImageView(context, null, 6, 0);
        vKImageView.setLayoutParams(new ConstraintLayout.b(-1, -1));
        String g = topshelfItem.d.a.g();
        if (g == null) {
            yfwVar = this;
        } else {
            yfwVar = this;
            vKImageView.setOnLoadCallback(new xfw(vKImageView, SystemClock.elapsedRealtime(), yfwVar, g));
        }
        if (g != null) {
            vKImageView.o0(g, null);
        }
        yfwVar.b = vKImageView;
    }

    @Override // xsna.vbp0
    public final View getView() {
        return this.b;
    }

    @Override // xsna.vbp0
    public final void destroy() {
    }
}
