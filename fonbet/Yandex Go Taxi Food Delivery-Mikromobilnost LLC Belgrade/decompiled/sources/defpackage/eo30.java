package defpackage;

import android.view.ViewGroup;
import ru.yandex.taxi.masstransit.main.ui.modal.MtMainFlexModalView;

/* loaded from: classes6.dex */
public final /* synthetic */ class eo30 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ MtMainFlexModalView b;

    public /* synthetic */ eo30(MtMainFlexModalView mtMainFlexModalView, int i) {
        this.a = i;
        this.b = mtMainFlexModalView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 onAttachedToWindow$lambda$1;
        ViewGroup slideableRoot_delegate$lambda$0;
        int i = this.a;
        MtMainFlexModalView mtMainFlexModalView = this.b;
        switch (i) {
            case 0:
                onAttachedToWindow$lambda$1 = MtMainFlexModalView.onAttachedToWindow$lambda$1(mtMainFlexModalView);
                return onAttachedToWindow$lambda$1;
            default:
                slideableRoot_delegate$lambda$0 = MtMainFlexModalView.slideableRoot_delegate$lambda$0(mtMainFlexModalView);
                return slideableRoot_delegate$lambda$0;
        }
    }
}
