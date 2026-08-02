package defpackage;

import com.yandex.fintechsdk.entities.environment.PayEnvironment;

/* loaded from: classes12.dex */
public final class ngs implements kgs {
    @Override // defpackage.kgs
    public final String a(PayEnvironment payEnvironment) {
        int i = lgs.a[payEnvironment.ordinal()];
        if (i == 1) {
            return "payment_sdk_19d9962ddd08e7d52a2668cbcd5f7b7e";
        }
        if (i == 2 || i == 3) {
            return "yandex_pay_plus_backend_f8c528b768e7421ee0e3258995201aaa";
        }
        w511.b();
        return null;
    }
}
