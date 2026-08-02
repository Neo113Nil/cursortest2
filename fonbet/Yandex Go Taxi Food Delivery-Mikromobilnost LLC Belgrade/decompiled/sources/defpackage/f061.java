package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.widgets.common.ScrollableNestedScrollView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.keyboard.NumberKeyboardView;

/* loaded from: classes4.dex */
public final class f061 implements zo31 {
    public final BottomSheetDialogView a;
    public final YbButtonViewGroup b;
    public final TextView c;
    public final FrameLayout d;
    public final ConstraintLayout e;
    public final NumberKeyboardView f;
    public final nzm g;
    public final ScrollableNestedScrollView h;
    public final Space i;

    public f061(BottomSheetDialogView bottomSheetDialogView, YbButtonViewGroup ybButtonViewGroup, TextView textView, FrameLayout frameLayout, ConstraintLayout constraintLayout, NumberKeyboardView numberKeyboardView, nzm nzmVar, ScrollableNestedScrollView scrollableNestedScrollView, Space space) {
        this.a = bottomSheetDialogView;
        this.b = ybButtonViewGroup;
        this.c = textView;
        this.d = frameLayout;
        this.e = constraintLayout;
        this.f = numberKeyboardView;
        this.g = nzmVar;
        this.h = scrollableNestedScrollView;
        this.i = space;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
