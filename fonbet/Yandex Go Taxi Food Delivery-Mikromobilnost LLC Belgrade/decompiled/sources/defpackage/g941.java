package defpackage;

import com.yandex.fintechsdk.entities.environment.DefaultEnvironment;

/* loaded from: classes12.dex */
public final class g941 implements osu {
    public final vif a;
    public final DefaultEnvironment b;

    public g941(vif vifVar, DefaultEnvironment defaultEnvironment) {
        this.a = vifVar;
        this.b = defaultEnvironment;
    }

    @Override // defpackage.osu
    public final String a() {
        qif qifVar = this.a.a;
        int i = f941.a[this.b.ordinal()];
        if (i == 1) {
            return "https://test.wallet.yandex.ru";
        }
        if (i == 2) {
            return "https://wallet.yandex.ru";
        }
        w511.b();
        return null;
    }
}
