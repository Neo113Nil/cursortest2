package com.yandex.passport.internal.network;

import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.util.LocationType;
import defpackage.sls;
import defpackage.w511;
import defpackage.yhl;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class i implements sls {
    public final /* synthetic */ Environment a;
    public final /* synthetic */ Long b;

    public i(l lVar, Environment environment, Long l) {
        this.a = environment;
        this.b = l;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        String str;
        LocationType F = com.yandex.passport.internal.ui.c.F(this.b);
        int[] iArr = h.a;
        Environment environment = this.a;
        int i = iArr[environment.ordinal()];
        if (i == 1) {
            str = "https://mobileproxy-rc.passport.yandex.net";
        } else if (i == 2) {
            int i2 = h.d[F.ordinal()];
            if (i2 == 1) {
                str = "https://mobileproxy-test.passport.yandex.net";
            } else if (i2 == 2) {
                str = String.format("https://mobileproxy-test-%s.passport.yandex.net", Arrays.copyOf(new Object[]{"fi"}, 1));
            } else {
                if (i2 != 3) {
                    w511.b();
                    return null;
                }
                str = String.format("https://mobileproxy-test-%s.passport.yandex.net", Arrays.copyOf(new Object[]{"kz"}, 1));
            }
        } else if (i == 3) {
            int i3 = h.d[F.ordinal()];
            if (i3 == 1) {
                str = "https://mobileproxy.passport.yandex.net";
            } else if (i3 == 2) {
                str = String.format("https://mobileproxy.passport.yandex.%s", Arrays.copyOf(new Object[]{"fi"}, 1));
            } else {
                if (i3 != 3) {
                    w511.b();
                    return null;
                }
                str = String.format("https://mobileproxy.passport.yandex.%s", Arrays.copyOf(new Object[]{"kz"}, 1));
            }
        } else if (i == 4) {
            str = "https://mobileproxy-yateam.passport.yandex.net";
        } else {
            if (i != 5) {
                yhl.d(environment, "Unknown environment: ");
                return null;
            }
            str = "https://mobileproxy-yateam-test.passport.yandex.net";
        }
        return new com.yandex.passport.common.url.b(str);
    }
}
