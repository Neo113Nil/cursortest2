package defpackage;

import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final /* synthetic */ class msy implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ RobotoTextView b;

    public /* synthetic */ msy(int i, RobotoTextView robotoTextView) {
        this.a = i;
        this.b = robotoTextView;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        RobotoTextView robotoTextView = this.b;
        CharSequence charSequence = (CharSequence) obj;
        switch (i) {
            case 0:
                robotoTextView.setText(charSequence);
                break;
            case 1:
                robotoTextView.setText(charSequence);
                break;
            case 2:
                robotoTextView.setText(charSequence);
                break;
            default:
                robotoTextView.setText(charSequence);
                break;
        }
        return zy11Var;
    }
}
