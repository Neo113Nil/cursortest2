package defpackage;

import ru.yandex.taxi.design.ButtonComponent;

/* loaded from: classes9.dex */
public final /* synthetic */ class iz6 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ButtonComponent b;

    public /* synthetic */ iz6(ButtonComponent buttonComponent, int i) {
        this.a = i;
        this.b = buttonComponent;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        String str;
        String str2;
        int i = this.a;
        ButtonComponent buttonComponent = this.b;
        switch (i) {
            case 0:
                str = buttonComponent.analyticsButtonName;
                return str;
            default:
                str2 = buttonComponent.analyticsButtonName;
                return str2;
        }
    }
}
