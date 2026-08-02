package xsna;

import android.view.View;
import com.vk.clips.sdk.shared.item.video.VideoTextureViewAdapter;

/* compiled from: View.kt */
/* loaded from: classes17.dex */
public final class l5s0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ qjt0 b;
    public final /* synthetic */ j5s0 c;

    public l5s0(qjt0 qjt0Var, j5s0 j5s0Var) {
        this.b = qjt0Var;
        this.c = j5s0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        rlh0 rlh0Var = this.b.a;
        float f = rlh0Var.b / rlh0Var.a;
        j5s0 j5s0Var = this.c;
        j5s0Var.a.getVideoTextureViewAdapter().a(j5s0.a(j5s0Var, f) ? VideoTextureViewAdapter.ScaleType.CROP : VideoTextureViewAdapter.ScaleType.FIT);
    }
}
