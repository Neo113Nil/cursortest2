package com.yandex.passport.internal.ui.base;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.yandex.passport.internal.n;
import defpackage.leh0;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0003¨\u0006\u0012"}, d2 = {"Lcom/yandex/passport/internal/ui/base/BaseBottomSheetDialogFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/widget/FrameLayout;", "getBottomSheetBehavior", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onActivityCreated", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "expandDialog", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public class BaseBottomSheetDialogFragment extends BottomSheetDialogFragment {
    public static final int $stable = 0;

    private final BottomSheetBehavior<FrameLayout> getBottomSheetBehavior() {
        BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) getDialog();
        if (bottomSheetDialog == null) {
            return null;
        }
        return BottomSheetBehavior.D((FrameLayout) bottomSheetDialog.findViewById(leh0.design_bottom_sheet));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(BaseBottomSheetDialogFragment baseBottomSheetDialogFragment) {
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = baseBottomSheetDialogFragment.getBottomSheetBehavior();
        if (bottomSheetBehavior == null) {
            return;
        }
        bottomSheetBehavior.W(3);
        a aVar = new a(baseBottomSheetDialogFragment);
        ArrayList arrayList = bottomSheetBehavior.x0;
        arrayList.clear();
        arrayList.add(aVar);
    }

    public final void expandDialog() {
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = getBottomSheetBehavior();
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.W(3);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ((View) getView().getParent()).setBackgroundColor(0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (com.yandex.passport.legacy.d.g(view)) {
            view.post(new n(5, this));
        }
    }
}
