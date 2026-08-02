package com.yandex.passport.internal.network;

import com.yandex.passport.common.core.Environment;
import defpackage.sls;
import defpackage.yhl;
import java.util.Arrays;

/* loaded from: classes15.dex */
public final class j implements sls {
    public final /* synthetic */ Environment a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;

    public j(l lVar, Environment environment, String str, long j) {
        this.a = environment;
        this.b = str;
        this.c = j;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        String str;
        Environment environment = this.a;
        String str2 = this.b;
        if (str2 == null) {
            str2 = l.e(environment, Long.valueOf(this.c));
        }
        int i = h.a[environment.ordinal()];
        if (i == 1) {
            str = "https://id-rc.yandex.%s";
        } else if (i == 2) {
            str = "https://id-test.yandex.%s";
        } else if (i == 3) {
            str = "https://id.yandex.%s";
        } else if (i == 4) {
            str = "https://passport.yandex-team.ru";
        } else {
            if (i != 5) {
                yhl.d(environment, "Unknown environment ");
                return null;
            }
            str = "https://passport-test.yandex-team.ru";
        }
        return new com.yandex.passport.common.url.b(String.format(str, Arrays.copyOf(new Object[]{str2}, 1)));
    }
}
