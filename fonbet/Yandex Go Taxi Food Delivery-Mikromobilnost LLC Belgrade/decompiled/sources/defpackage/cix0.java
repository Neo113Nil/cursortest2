package defpackage;

import com.yandex.go.tariffcard.modal.TariffOptionsCardModalView;

/* loaded from: classes14.dex */
public final /* synthetic */ class cix0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TariffOptionsCardModalView b;

    public /* synthetic */ cix0(TariffOptionsCardModalView tariffOptionsCardModalView, int i) {
        this.a = i;
        this.b = tariffOptionsCardModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        TariffOptionsCardModalView tariffOptionsCardModalView = this.b;
        switch (i) {
            case 0:
                TariffOptionsCardModalView.initBackPressedCallback$lambda$0(tariffOptionsCardModalView);
                break;
            default:
                TariffOptionsCardModalView.scheduleShowAnimation$lambda$0(tariffOptionsCardModalView);
                break;
        }
    }
}
