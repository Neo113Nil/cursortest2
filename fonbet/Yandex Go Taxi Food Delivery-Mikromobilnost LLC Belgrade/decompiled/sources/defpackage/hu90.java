package defpackage;

import com.yandex.fintechsdk.entities.environment.PayEnvironment;

/* loaded from: classes12.dex */
public final class hu90 implements osu {
    public final vif a;
    public final PayEnvironment b;

    public hu90(vif vifVar, PayEnvironment payEnvironment) {
        this.a = vifVar;
        this.b = payEnvironment;
    }

    @Override // defpackage.osu
    public final String a() {
        qif qifVar = this.a.a;
        int i = gu90.a[this.b.ordinal()];
        if (i == 1) {
            return "https://pay.yandex.ru/";
        }
        if (i == 2) {
            return "https://sandbox.pay.yandex.ru/";
        }
        if (i == 3) {
            return "https://test.pay.yandex.ru/";
        }
        w511.b();
        return null;
    }
}
