package defpackage;

import ru.yandex.taxi.maas.impl.ride.metropick.MaasMetroPickModalView;

/* loaded from: classes5.dex */
public final /* synthetic */ class i100 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MaasMetroPickModalView b;

    public /* synthetic */ i100(MaasMetroPickModalView maasMetroPickModalView, int i) {
        this.a = i;
        this.b = maasMetroPickModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        MaasMetroPickModalView maasMetroPickModalView = this.b;
        switch (i) {
            case 0:
                MaasMetroPickModalView.errorView_delegate$lambda$0$0$0(maasMetroPickModalView);
                break;
            case 1:
                MaasMetroPickModalView.errorView_delegate$lambda$0$0$1(maasMetroPickModalView);
                break;
            case 2:
                MaasMetroPickModalView._init_$lambda$0(maasMetroPickModalView);
                break;
            case 3:
                MaasMetroPickModalView._init_$lambda$1(maasMetroPickModalView);
                break;
            default:
                MaasMetroPickModalView._init_$lambda$2(maasMetroPickModalView);
                break;
        }
    }
}
