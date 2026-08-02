package xsna;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photogallery.view.CoordinatorLayoutWithContextMenuDelegate;

/* compiled from: PhotoGalleryViewer.kt */
/* loaded from: classes4.dex */
public final class r9a0 extends BottomSheetBehavior.d {
    public final /* synthetic */ com.vk.photogallery.c a;

    public r9a0(com.vk.photogallery.c cVar) {
        this.a = cVar;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
    public final void b(View view, float f) {
        float f2 = f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 + f : 1.0f;
        com.vk.photogallery.c cVar = this.a;
        cVar.s.setAlpha(f2);
        cVar.w.setAlpha(f2);
        cVar.x.setAlpha(f2);
        cVar.q.setAlpha(f2);
        cVar.r.setAlpha(f2);
        cVar.p.setAlpha(f2);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
    public final void c(int i, View view) {
        if (i == 5) {
            com.vk.photogallery.c cVar = this.a;
            CoordinatorLayoutWithContextMenuDelegate coordinatorLayoutWithContextMenuDelegate = cVar.i;
            if (coordinatorLayoutWithContextMenuDelegate.isAttachedToWindow()) {
                cVar.e.removeView(coordinatorLayoutWithContextMenuDelegate);
            }
        }
    }
}
