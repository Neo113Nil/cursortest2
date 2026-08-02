package defpackage;

import com.yandex.plus.core.config.Environment;
import kotlin.a;

/* loaded from: classes8.dex */
public abstract class mc5 {
    public final i3y a;
    public final i3y b;

    public mc5() {
        final int i = 0;
        this.a = a.a(new sls(this) { // from class: lc5
            public final /* synthetic */ mc5 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                nfh nfhVar;
                int i2 = i;
                mc5 mc5Var = this.b;
                switch (i2) {
                    case 0:
                        jcd0 a = mc5Var.a();
                        Environment environment = a.a;
                        int i3 = j25.a[a.b.ordinal()];
                        String str = "api.plus.tst.yandex.net";
                        if (i3 == 1) {
                            nfhVar = new nfh("api.plus.yandex.net", str, environment);
                        } else {
                            if (i3 != 2) {
                                w511.b();
                                return null;
                            }
                            nfhVar = new nfh("api.play.yangosaft.net", str, environment);
                        }
                        return new fnh(nfhVar, "/graphql");
                    default:
                        return new fnh(new nfh("avatars.mds.yandex.net", "avatars.mdst.yandex.net", mc5Var.a().a), "/get-yapic/");
                }
            }
        });
        final int i2 = 1;
        this.b = a.a(new sls(this) { // from class: lc5
            public final /* synthetic */ mc5 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                nfh nfhVar;
                int i22 = i2;
                mc5 mc5Var = this.b;
                switch (i22) {
                    case 0:
                        jcd0 a = mc5Var.a();
                        Environment environment = a.a;
                        int i3 = j25.a[a.b.ordinal()];
                        String str = "api.plus.tst.yandex.net";
                        if (i3 == 1) {
                            nfhVar = new nfh("api.plus.yandex.net", str, environment);
                        } else {
                            if (i3 != 2) {
                                w511.b();
                                return null;
                            }
                            nfhVar = new nfh("api.play.yangosaft.net", str, environment);
                        }
                        return new fnh(nfhVar, "/graphql");
                    default:
                        return new fnh(new nfh("avatars.mds.yandex.net", "avatars.mdst.yandex.net", mc5Var.a().a), "/get-yapic/");
                }
            }
        });
    }

    public abstract jcd0 a();
}
