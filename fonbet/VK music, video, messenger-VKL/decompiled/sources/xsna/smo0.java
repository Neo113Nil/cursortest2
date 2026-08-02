package xsna;

import com.vk.camera.editor.common.text.views.SnapScrollRecyclerView;
import com.vk.stories.design.view.text.TextStyleFontPicker;

/* compiled from: TextStyleFontPicker.kt */
/* loaded from: classes6.dex */
public final class smo0 implements SnapScrollRecyclerView.a {
    public final /* synthetic */ TextStyleFontPicker a;

    public smo0(TextStyleFontPicker textStyleFontPicker) {
        this.a = textStyleFontPicker;
    }

    @Override // com.vk.camera.editor.common.text.views.SnapScrollRecyclerView.a
    public final void a(int i) {
        if (i != -1) {
            TextStyleFontPicker textStyleFontPicker = this.a;
            t5s[] t5sVarArr = textStyleFontPicker.b;
            if (i > t5sVarArr.length) {
                return;
            }
            textStyleFontPicker.setCurrentFontStyle(t5sVarArr[i]);
            izs<t5s, s3q0> onSnapPositionFontStyle = textStyleFontPicker.getOnSnapPositionFontStyle();
            if (onSnapPositionFontStyle != null) {
                onSnapPositionFontStyle.invoke(textStyleFontPicker.getCurrentFontStyle());
            }
            textStyleFontPicker.setCurrentFontStylePosition(i);
            if (textStyleFontPicker.getAlpha() == 1.0f) {
                textStyleFontPicker.performHapticFeedback(0);
            }
        }
    }
}
