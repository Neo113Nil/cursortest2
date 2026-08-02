package defpackage;

import android.view.View;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes12.dex */
public final class o5r0 extends wys {
    public static final /* synthetic */ int S = 0;
    public static final /* synthetic */ int T = 0;
    public final /* synthetic */ int R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o5r0(View view, int i) {
        super(view);
        this.R = i;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        switch (this.R) {
            case 0:
                break;
            default:
                bhc0 bhc0Var = (bhc0) obj;
                View view = this.a;
                ButtonComponent buttonComponent = (ButtonComponent) view;
                buttonComponent.setText(bhc0Var.a);
                int i = chc0.a[bhc0Var.b.ordinal()];
                if (i == 1) {
                    buttonComponent.setBackground(c.k(gzg0.bg_button_with_stroke, view));
                    break;
                } else if (i == 2) {
                    buttonComponent.setBackground(c.k(gzg0.bg_button_minor, view));
                    break;
                } else if (i != 3) {
                    w511.b();
                    break;
                } else {
                    buttonComponent.setButtonBackground(new bdc(xng0.controlMinor));
                    buttonComponent.setButtonTitleColor(new bdc(xng0.textOnControlMinor));
                    break;
                }
        }
    }
}
