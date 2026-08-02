package xsna;

import android.view.KeyEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerState;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.presentation.base.view.steps.mediapicker.MediaPickerBottomSheetBehavior;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.lang.ref.WeakReference;

/* compiled from: PostingStep1View.kt */
/* loaded from: classes4.dex */
public final class foc0 extends ModalBottomSheetBehavior.d {
    public final /* synthetic */ enc0 a;

    public foc0(enc0 enc0Var) {
        this.a = enc0Var;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
    public final void a(View view, float f) {
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= f && f <= 1.0f) {
            f2 = f;
        }
        this.a.k(f2, f);
    }

    @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
    public final void b(int i, View view) {
        WeakReference<View> weakReference;
        enc0 enc0Var = this.a;
        y1q0 y1q0Var = enc0Var.g;
        hb40 hb40Var = enc0Var.U;
        VkInputSelect vkInputSelect = enc0Var.n;
        ConstraintLayout constraintLayout = enc0Var.q;
        constraintLayout.setElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        enc0Var.u.setUserInputEnabled(i == 3);
        if (i != 3) {
            MediaPickerBottomSheetBehavior mediaPickerBottomSheetBehavior = enc0Var.A;
            KeyEvent.Callback callback = (mediaPickerBottomSheetBehavior == null || (weakReference = mediaPickerBottomSheetBehavior.t) == null) ? null : (View) weakReference.get();
            RecyclerView recyclerView = callback instanceof RecyclerView ? (RecyclerView) callback : null;
            if (recyclerView != null) {
                recyclerView.stopScroll();
            }
        }
        if (i == 3) {
            vkInputSelect.clearFocus();
        }
        if (i == 3) {
            a(view, 1.0f);
            f4m.v(0, vkInputSelect);
            hb40Var.invoke(new PostingAction.MediaPicker.OnSheetTransitionFinished(MediaPickerState.SheetState.Expanded));
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.POSTING_ATTACH_PHOTO;
            if (c == mobileOfficialAppsCoreNavStat$EventScreen || c == MobileOfficialAppsCoreNavStat$EventScreen.POSTING_ATTACH_VIDEO) {
                return;
            }
            y1q0Var.c(new UiTrackingScreen(mobileOfficialAppsCoreNavStat$EventScreen), true);
            return;
        }
        if (i == 4) {
            a(view, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            f4m.v(enc0Var.c.getHeight() - (constraintLayout.getTop() + enc0Var.d0), vkInputSelect);
            hb40Var.invoke(new PostingAction.MediaPicker.OnSheetTransitionFinished(MediaPickerState.SheetState.Collapsed));
            UiTracker uiTracker2 = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
            MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen2 = MobileOfficialAppsCoreNavStat$EventScreen.POSTING_ATTACH_PHOTO;
            if (c2 == mobileOfficialAppsCoreNavStat$EventScreen2 || c2 == MobileOfficialAppsCoreNavStat$EventScreen.POSTING_ATTACH_VIDEO) {
                return;
            }
            y1q0Var.c(new UiTrackingScreen(mobileOfficialAppsCoreNavStat$EventScreen2), true);
            return;
        }
        if (i != 5) {
            return;
        }
        a(view, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        f4m.v(0, vkInputSelect);
        hb40Var.invoke(new PostingAction.MediaPicker.OnSheetTransitionFinished(MediaPickerState.SheetState.Hidden));
        UiTracker uiTracker3 = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c3 = UiTracker.c();
        if (c3 == MobileOfficialAppsCoreNavStat$EventScreen.POSTING_ATTACH_PHOTO || c3 == MobileOfficialAppsCoreNavStat$EventScreen.POSTING_ATTACH_VIDEO) {
            y1q0Var.c(new UiTrackingScreen(MobileOfficialAppsCoreNavStat$EventScreen.POSTING_1), false);
        }
    }

    @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
    public final void c() {
        enc0 enc0Var = this.a;
        a(enc0Var.q, enc0Var.S);
    }
}
