package com.yandex.passport.internal.storage;

import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.a0;
import defpackage.evu0;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class PreferenceStorage$currentAccountUid$2 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Environment environment;
        String str = (String) obj;
        ((com.yandex.passport.internal.serialization.b) this.receiver).getClass();
        int D = evu0.D(str, ':', 0, false);
        if (D < 1 || D == str.length() - 1) {
            return null;
        }
        String substring = str.substring(0, D);
        try {
            long parseLong = Long.parseLong(str.substring(D + 1));
            if (parseLong <= 0) {
                return null;
            }
            try {
                com.yandex.passport.common.core.a aVar = Environment.Companion;
                int parseInt = Integer.parseInt(substring);
                aVar.getClass();
                environment = com.yandex.passport.common.core.a.a(parseInt);
            } catch (Exception unused) {
                environment = Environment.PRODUCTION;
            }
            return a0.b(environment, parseLong);
        } catch (NumberFormatException unused2) {
            return null;
        }
    }
}
