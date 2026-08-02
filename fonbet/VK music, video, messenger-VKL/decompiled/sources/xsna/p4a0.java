package xsna;

import android.graphics.drawable.Animatable;
import android.util.SparseBooleanArray;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photoviewer.ClippingImageView;
import com.vk.photoviewer.PhotoViewer;

/* compiled from: PhotoAdapter.kt */
/* loaded from: classes3.dex */
public final class p4a0 extends lqj {
    public final /* synthetic */ q4a0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ClippingImageView d;

    public p4a0(q4a0 q4a0Var, int i, ClippingImageView clippingImageView) {
        this.b = q4a0Var;
        this.c = i;
        this.d = clippingImageView;
    }

    @Override // xsna.kqj
    public final void e(String str, mjw mjwVar, Animatable animatable) {
        final q4a0 q4a0Var = this.b;
        SparseBooleanArray sparseBooleanArray = q4a0Var.n;
        final int i = this.c;
        sparseBooleanArray.put(i, true);
        this.d.post(new Runnable() { // from class: xsna.o4a0
            @Override // java.lang.Runnable
            public final void run() {
                PhotoViewer photoViewer = q4a0Var.f;
                if (photoViewer.g) {
                    int i2 = photoViewer.r;
                    int i3 = i;
                    if (i2 == i3) {
                        photoViewer.r(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i3);
                    }
                }
                photoViewer.Q = true;
                float f = photoViewer.R;
                if (f == 1.0f || !photoViewer.P || photoViewer.l == null) {
                    return;
                }
                photoViewer.O = f;
                photoViewer.o(true);
            }
        });
    }
}
