package xsna;

import android.view.View;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.vk.core.dialogs.bottomsheet.PersistentBottomSheetBehavior;
import com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetBehavior;
import xsna.qy90;

/* compiled from: AbstractMusicPlayerBottomSheet.kt */
/* loaded from: classes3.dex */
public interface wf extends qy90.c, pel0, dwb0 {
    default boolean M() {
        return getState() == 3;
    }

    void N0(String str);

    boolean a0();

    void b0(bqx0 bqx0Var);

    PersistentBottomSheetBehavior getBottomSheetBehavior();

    FrameLayout getContentLayout();

    CoordinatorLayout getCoordinatorLayout();

    /* renamed from: getModernSmallPlayerView */
    p630 mo94getModernSmallPlayerView();

    int getState();

    boolean isVisible();

    boolean k4();

    default boolean o3() {
        return getState() == 4;
    }

    void onDestroy();

    void onPause();

    void onResume();

    void setCanInteract(boolean z);

    void setDecorViewProvider(gzs<? extends View> gzsVar);

    void setHideable(boolean z);

    void setMaxHeightBottomSheet(int i);

    void setPeekHeight(int i);

    void setState(int i);

    void setVisible(boolean z);

    default boolean t() {
        return getState() == 1;
    }

    default boolean v3() {
        return getState() == 5;
    }

    void y1(izs<? super wf, s3q0> izsVar);

    void z3(CustomisableBottomSheetBehavior.b bVar);
}
