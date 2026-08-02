package xsna;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: StickerHidingToolbarVh.kt */
/* loaded from: classes16.dex */
public final class l4l0 implements AppBarLayout.f {
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ View c;

    public l4l0(LinearLayout linearLayout, View view) {
        this.b = linearLayout;
        this.c = view;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.a
    public final void a(AppBarLayout appBarLayout, int i) {
        LinearLayout linearLayout = this.b;
        boolean g = f4m.g(linearLayout);
        View view = this.c;
        if (g) {
            view.setY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return;
        }
        int height = linearLayout.getHeight();
        int i2 = -i;
        if (i2 <= height) {
            height = i2;
        }
        view.setY(height);
        linearLayout.setY(view.getMeasuredHeight());
    }
}
