package xsna;

import android.view.View;
import com.vk.dto.hints.HintId;
import com.vk.feed.tool.view.posting.preview.crop.PreviewCropLayout;
import com.vkontakte.android.R;

/* compiled from: PreviewHolderOnboardingDelegate.kt */
/* loaded from: classes4.dex */
public final class d4d0 {
    public final qor a;
    public final cpc0 b;
    public final pbq c;
    public final pq10 d;
    public final String e = HintId.FEED_POSTING_EDIT_PHOTO_BUTTON.getId();
    public boolean f;
    public boolean g;
    public boolean h;

    public d4d0(qor qorVar, cpc0 cpc0Var, pbq pbqVar, pq10 pq10Var) {
        this.a = qorVar;
        this.b = cpc0Var;
        this.c = pbqVar;
        this.d = pq10Var;
    }

    public final boolean a() {
        if (!this.f || this.h) {
            return false;
        }
        qor qorVar = this.a;
        return (qorVar.h() || !qorVar.g) && this.d.d;
    }

    public final void b(int i) {
        v0u0 v0u0Var;
        PreviewCropLayout previewCropLayout;
        zzo zzoVar;
        qor qorVar = this.a;
        Object parent = qorVar.getParent();
        View view = parent instanceof View ? (View) parent : null;
        boolean z = false;
        int measuredWidth = (view != null ? view.getMeasuredWidth() : 0) + i;
        View childAt = qorVar.getChildAt(0);
        if (childAt == null || (v0u0Var = (v0u0) j5g.b0(0, qorVar.j.c)) == null || i > v0u0Var.b || v0u0Var.d > measuredWidth || (previewCropLayout = (PreviewCropLayout) childAt.findViewById(R.id.preview_crop_layout)) == null) {
            return;
        }
        w3d0 imageLayer = previewCropLayout.getImageLayer();
        if (this.h || ((zzoVar = imageLayer.r) != null && zzoVar.h())) {
            z = true;
        }
        this.h = z;
    }

    public final void c(int i) {
        khk khkVar;
        if (this.f) {
            boolean a = a();
            qor qorVar = this.a;
            if (!a) {
                if (!this.b.j() || this.h) {
                    return;
                }
                if ((qorVar.h() || !qorVar.g) && this.d.e) {
                    b(i);
                    return;
                }
                return;
            }
            Object parent = qorVar.getParent();
            View view = parent instanceof View ? (View) parent : null;
            int measuredWidth = (view != null ? view.getMeasuredWidth() : 0) + i;
            int childCount = qorVar.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = qorVar.getChildAt(i2);
                v0u0 v0u0Var = (v0u0) j5g.b0(i2, qorVar.j.c);
                if (childAt != null && v0u0Var != null) {
                    if (i <= v0u0Var.b && v0u0Var.d <= measuredWidth) {
                        PreviewCropLayout previewCropLayout = (PreviewCropLayout) childAt.findViewById(R.id.preview_crop_layout);
                        if (previewCropLayout == null) {
                            continue;
                        } else {
                            w3d0 imageLayer = previewCropLayout.getImageLayer();
                            boolean z = true;
                            if (!this.h && ((khkVar = imageLayer.s) == null || !khkVar.c())) {
                                z = false;
                            }
                            this.h = z;
                        }
                    }
                    if (this.h) {
                        return;
                    }
                }
            }
        }
    }
}
