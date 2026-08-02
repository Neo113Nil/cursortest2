package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;

/* compiled from: ButtonsHeaderHolder.kt */
/* loaded from: classes15.dex */
public final class kvs extends fs8 {
    public final View l;
    public final View m;
    public final View n;
    public final View o;
    public final View p;

    public kvs(View view) {
        super(view);
        this.l = view.findViewById(R.id.picker_attach_gallery_camera_layout);
        this.m = view.findViewById(R.id.picker_attach_gallery_photo_view);
        this.n = view.findViewById(R.id.picker_attach_gallery_video_view);
        this.o = view.findViewById(R.id.picker_attach_gallery_separator_view);
        this.p = view.findViewById(R.id.tv_empty);
    }

    @Override // xsna.fs8
    public final void V5(boolean z, boolean z2, boolean z3) {
        View view = this.l;
        if (view != null) {
            view.setVisibility((z || z2) ? 0 : 8);
        }
        this.o.setVisibility((z && z2) ? 0 : 8);
        View view2 = this.p;
        if (view2 != null) {
            view2.setVisibility(z3 ? 0 : 8);
        }
        ViewGroup.LayoutParams layoutParams = this.m.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (layoutParams2 != null) {
            layoutParams2.weight = z ? 1.0f : 0.0f;
        }
        ViewGroup.LayoutParams layoutParams3 = this.n.getLayoutParams();
        LinearLayout.LayoutParams layoutParams4 = layoutParams3 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams3 : null;
        if (layoutParams4 != null) {
            if (z2) {
                f = 1.0f;
            }
            layoutParams4.weight = f;
        }
    }
}
