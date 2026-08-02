package defpackage;

import android.view.View;
import com.yandex.go.tariffcard.ui.view.MulticlassCashbackView;
import ru.yandex.taxi.plus.design.view.ShaderClipFrameLayout;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class oo40 implements zo31 {
    public final MulticlassCashbackView a;
    public final RobotoTextView b;
    public final ShaderClipFrameLayout c;

    public oo40(MulticlassCashbackView multiclassCashbackView, RobotoTextView robotoTextView, ShaderClipFrameLayout shaderClipFrameLayout) {
        this.a = multiclassCashbackView;
        this.b = robotoTextView;
        this.c = shaderClipFrameLayout;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
