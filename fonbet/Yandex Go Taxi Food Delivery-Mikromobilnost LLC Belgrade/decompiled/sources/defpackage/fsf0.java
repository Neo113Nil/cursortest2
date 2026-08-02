package defpackage;

import java.util.function.Consumer;
import ru.yandex.taxi.widget.ModalView;

/* loaded from: classes6.dex */
public final /* synthetic */ class fsf0 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ hsf0 b;

    public /* synthetic */ fsf0(hsf0 hsf0Var, int i) {
        this.a = i;
        this.b = hsf0Var;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        hsf0 hsf0Var = this.b;
        Float f = (Float) obj;
        switch (i) {
            case 0:
                hsf0Var.n(f.floatValue());
                break;
            case 1:
                float floatValue = f.floatValue();
                hsf0 hsf0Var2 = this.b;
                ModalView modalView = hsf0Var2.a;
                if (modalView.getWidth() != 0 && modalView.getHeight() != 0) {
                    float width = hsf0Var2.e.width() / modalView.getWidth();
                    float height = hsf0Var2.e.height() / modalView.getHeight();
                    float width2 = (modalView.getWidth() * 0.19999999f) / 2.0f;
                    float H = uh6.H(0.0f, modalView.getHeight(), hsf0Var2.d);
                    float e = hsf0Var2.e() / 0.8f;
                    float H2 = uh6.H(0.8f, width, floatValue);
                    float H3 = uh6.H(0.8f, height, floatValue);
                    float H4 = uh6.H(width2, hsf0Var2.e.left, floatValue);
                    float H5 = uh6.H(H, hsf0Var2.e.top, floatValue);
                    float H6 = uh6.H(e, hsf0Var2.e() / width, floatValue);
                    float H7 = uh6.H(e, hsf0Var2.e() / height, floatValue);
                    hsf0Var2.i(H2, H3, H4, H5, 1.0f - floatValue);
                    hsf0Var2.k(H6, H7);
                    hsf0Var2.j(H2, H3, H4, H5);
                    break;
                }
                break;
            default:
                hsf0Var.o(f.floatValue());
                break;
        }
    }
}
