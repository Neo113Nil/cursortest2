package xsna;

import android.os.Trace;
import android.view.View;
import com.vk.catalog2.common.ui.mvp.holder.video.showcase.VideoAutoPlayHolderView;
import com.vk.core.ui.CircularProgressView;

/* compiled from: View.kt */
/* loaded from: classes16.dex */
public final class v3s0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ CircularProgressView b;
    public final /* synthetic */ CircularProgressView c;

    public v3s0(CircularProgressView circularProgressView, CircularProgressView circularProgressView2) {
        this.b = circularProgressView;
        this.c = circularProgressView2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.b.removeOnAttachStateChangeListener(this);
        Trace.beginSection("VideoAutoPlayHolderView.createVideoLoaderView.doOnAttach");
        try {
            int i = VideoAutoPlayHolderView.x;
            VideoAutoPlayHolderView.a.a(this.c);
            s3q0 s3q0Var = s3q0.a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
