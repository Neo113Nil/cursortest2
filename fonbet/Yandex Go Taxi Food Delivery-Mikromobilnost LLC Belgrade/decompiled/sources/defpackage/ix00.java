package defpackage;

import ru.yandex.taxi.design.ButtonComponent;

/* loaded from: classes13.dex */
public final /* synthetic */ class ix00 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ButtonComponent b;

    public /* synthetic */ ix00(ButtonComponent buttonComponent, int i) {
        this.a = i;
        this.b = buttonComponent;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        ButtonComponent buttonComponent = this.b;
        CharSequence charSequence = (CharSequence) obj;
        switch (i) {
            case 0:
                buttonComponent.setText(charSequence);
                break;
            default:
                buttonComponent.setText(charSequence);
                break;
        }
        return zy11Var;
    }
}
