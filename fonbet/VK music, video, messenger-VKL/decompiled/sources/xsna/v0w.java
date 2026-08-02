package xsna;

import android.view.View;
import android.widget.FrameLayout;
import com.vk.im.ui.fragments.ImDialogsSelectionFragment;

/* compiled from: ViewExt.kt */
/* loaded from: classes2.dex */
public final class v0w implements View.OnLayoutChangeListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ ImDialogsSelectionFragment c;

    public v0w(View view, ImDialogsSelectionFragment imDialogsSelectionFragment) {
        this.b = view;
        this.c = imDialogsSelectionFragment;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        FrameLayout frameLayout = this.c.e0;
        if (frameLayout == null) {
            frameLayout = null;
        }
        int height = frameLayout.getHeight();
        View view2 = this.b;
        view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), height);
    }
}
