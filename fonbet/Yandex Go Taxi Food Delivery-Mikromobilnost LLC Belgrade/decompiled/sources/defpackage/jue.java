package defpackage;

import com.yandex.go.payments.shared.antifraud.ui.CorpAntiFraudModalView;

/* loaded from: classes13.dex */
public final /* synthetic */ class jue implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CorpAntiFraudModalView b;

    public /* synthetic */ jue(CorpAntiFraudModalView corpAntiFraudModalView, int i) {
        this.a = i;
        this.b = corpAntiFraudModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        CorpAntiFraudModalView corpAntiFraudModalView = this.b;
        switch (i) {
            case 0:
                CorpAntiFraudModalView.bindCreateButton$lambda$0(corpAntiFraudModalView);
                break;
            default:
                CorpAntiFraudModalView.bindBackButton$lambda$0(corpAntiFraudModalView);
                break;
        }
    }
}
