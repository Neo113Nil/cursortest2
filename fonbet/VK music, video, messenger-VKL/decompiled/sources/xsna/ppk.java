package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetBehavior;
import com.vkontakte.android.R;

/* compiled from: CustomisableBottomSheetDialog.java */
/* loaded from: classes17.dex */
public final class ppk extends b33 {
    public final CustomisableBottomSheetBehavior<FrameLayout> h;
    public boolean i;
    public FrameLayout j;
    public boolean k;
    public boolean l;

    public ppk(@NonNull Context context, int i, CustomisableBottomSheetBehavior<FrameLayout> customisableBottomSheetBehavior) {
        super(context, i == 0 ? R.style.ModernBottomDialogTheme : i);
        this.i = true;
        this.k = true;
        this.h = customisableBottomSheetBehavior;
        m(1);
    }

    public final FrameLayout n(View view, int i, ViewGroup.LayoutParams layoutParams) {
        FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.customisable_bottom_sheet_dialog, null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
        this.j = frameLayout;
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        FrameLayout frameLayout2 = (FrameLayout) coordinatorLayout.findViewById(R.id.design_bottom_sheet);
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) frameLayout2.getLayoutParams();
        CustomisableBottomSheetBehavior<FrameLayout> customisableBottomSheetBehavior = this.h;
        fVar.c(customisableBottomSheetBehavior);
        customisableBottomSheetBehavior.h = this.i;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new mpk(this));
        iut0.q(frameLayout2, new npk(this));
        frameLayout2.setOnTouchListener(new opk());
        return frameLayout;
    }

    @Override // xsna.b33, xsna.y8i, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
    }

    @Override // xsna.y8i, android.app.Dialog
    public final void onStart() {
        super.onStart();
        CustomisableBottomSheetBehavior<FrameLayout> customisableBottomSheetBehavior = this.h;
        if (customisableBottomSheetBehavior != null) {
            customisableBottomSheetBehavior.J(4);
        }
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.i != z) {
            this.i = z;
            CustomisableBottomSheetBehavior<FrameLayout> customisableBottomSheetBehavior = this.h;
            if (customisableBottomSheetBehavior != null) {
                customisableBottomSheetBehavior.h = z;
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.i) {
            this.i = true;
        }
        this.k = z;
        this.l = true;
    }

    @Override // xsna.b33, xsna.y8i, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(n(null, i, null));
    }

    @Override // xsna.b33, xsna.y8i, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(n(view, 0, null));
    }

    @Override // xsna.b33, xsna.y8i, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(n(view, 0, layoutParams));
    }
}
