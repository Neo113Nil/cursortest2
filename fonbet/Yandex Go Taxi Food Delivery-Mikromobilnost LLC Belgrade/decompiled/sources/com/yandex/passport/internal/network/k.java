package com.yandex.passport.internal.network;

import com.yandex.passport.common.core.Environment;
import defpackage.sls;
import java.util.Arrays;

/* loaded from: classes15.dex */
public final class k implements sls {
    public final /* synthetic */ Environment a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Long c;

    public k(l lVar, Environment environment, String str, Long l) {
        this.a = environment;
        this.b = str;
        this.c = l;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        Environment environment = this.a;
        String str = this.b;
        if (str == null) {
            str = l.e(environment, this.c);
        }
        return new com.yandex.passport.common.url.b(String.format(l.g(environment), Arrays.copyOf(new Object[]{str}, 1)));
    }
}
