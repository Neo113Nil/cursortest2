package xsna;

import android.view.ViewTreeObserver;
import com.vk.camera.editor.common.text.views.CreateStoryEditText;

/* compiled from: TextStickerDialogImpl.kt */
/* loaded from: classes16.dex */
public final class dmo0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ cmo0 b;

    public dmo0(cmo0 cmo0Var) {
        this.b = cmo0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        cmo0 cmo0Var = this.b;
        CreateStoryEditText createStoryEditText = cmo0Var.i;
        if (createStoryEditText == null) {
            createStoryEditText = null;
        }
        createStoryEditText.getViewTreeObserver().removeOnPreDrawListener(this);
        CreateStoryEditText createStoryEditText2 = cmo0Var.i;
        if (createStoryEditText2 == null) {
            createStoryEditText2 = null;
        }
        mhy.j(createStoryEditText2);
        CreateStoryEditText createStoryEditText3 = cmo0Var.i;
        (createStoryEditText3 == null ? null : createStoryEditText3).setSelection((createStoryEditText3 != null ? createStoryEditText3 : null).getText().length());
        i0q0.d(300L, new tn9(cmo0Var, 19));
        return true;
    }
}
