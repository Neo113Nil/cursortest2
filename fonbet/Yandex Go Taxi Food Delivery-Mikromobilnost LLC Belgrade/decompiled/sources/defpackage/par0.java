package defpackage;

import com.yandex.go.settings.mvp.SettingsModalView;

/* loaded from: classes13.dex */
public final /* synthetic */ class par0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wbr0 b;

    public /* synthetic */ par0(wbr0 wbr0Var, int i) {
        this.a = i;
        this.b = wbr0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        wbr0 wbr0Var = this.b;
        switch (i) {
            case 0:
                SettingsModalView.initLayout$lambda$0$openChangeCallType(wbr0Var);
                break;
            case 1:
                SettingsModalView.initLayout$lambda$0$11$onLogoutClicked(wbr0Var);
                break;
            case 2:
                SettingsModalView.initLayout$lambda$0$1$onLanguageClicked(wbr0Var);
                break;
            default:
                wbr0Var.x.c();
                break;
        }
    }
}
