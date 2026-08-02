package defpackage;

import ru.yandex.taxi.preorder.AcceptEulaDialog;

/* loaded from: classes6.dex */
public final /* synthetic */ class dc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AcceptEulaDialog b;

    public /* synthetic */ dc(AcceptEulaDialog acceptEulaDialog, int i) {
        this.a = i;
        this.b = acceptEulaDialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AcceptEulaDialog acceptEulaDialog = this.b;
        switch (i) {
            case 0:
                AcceptEulaDialog._init_$lambda$1(acceptEulaDialog);
                break;
            case 1:
                AcceptEulaDialog._init_$lambda$2(acceptEulaDialog);
                break;
            default:
                AcceptEulaDialog._init_$lambda$3(acceptEulaDialog);
                break;
        }
    }
}
