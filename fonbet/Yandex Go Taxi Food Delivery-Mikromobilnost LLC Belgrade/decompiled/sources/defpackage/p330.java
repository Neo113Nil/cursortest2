package defpackage;

import android.view.View;
import com.adjust.sdk.Constants;
import ru.yandex.taxi.widget.ModalView;

/* loaded from: classes13.dex */
public final class p330 implements oy01 {
    public static final p330 b = new p330();

    @Override // defpackage.oy01
    public final int a() {
        return Constants.MINIMAL_ERROR_STATUS_CODE;
    }

    @Override // defpackage.oy01
    public final void b(View view, View view2) {
        if (view != null) {
            view.setTranslationY(0.0f);
        }
        if (view2 != null) {
            view2.setTranslationY(0.0f);
        }
    }

    @Override // defpackage.oy01
    public final void c(View view, View view2, float f) {
        if (view instanceof ModalView) {
            ((ModalView) view).contentViewInternal().setTranslationY(r0.getHeight() * f);
        }
        if (view2 != null) {
            view2.setTranslationY((1.0f - f) * view2.getHeight());
        }
    }
}
