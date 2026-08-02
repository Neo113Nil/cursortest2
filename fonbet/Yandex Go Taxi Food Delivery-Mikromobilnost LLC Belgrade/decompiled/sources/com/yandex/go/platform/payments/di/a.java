package com.yandex.go.platform.payments.di;

import com.yandex.go.platform.payments.domain.c;
import com.yandex.go.platform.payments.domain.d;
import defpackage.d0p;
import defpackage.fk;
import defpackage.i3y;
import defpackage.sls;

/* loaded from: classes13.dex */
public final class a {
    public final i3y b;
    public final i3y a = kotlin.a.a(PaymentsComponent$platformComponent$2.w);
    public final i3y c = kotlin.a.a(new sls() { // from class: com.yandex.go.platform.payments.di.PaymentsComponent$bindCardInteractor$2
        {
            super(0);
        }

        @Override // defpackage.sls
        public final Object invoke() {
            return new com.yandex.go.platform.payments.domain.a(a.this.a().a.a, a.this.a().b, a.this.a().b, (com.yandex.go.platform.payments.internal.a) a.this.b.getValue(), a.this.a().c);
        }
    });
    public final i3y d = kotlin.a.a(new sls() { // from class: com.yandex.go.platform.payments.di.PaymentsComponent$unbindCardInteractor$2
        {
            super(0);
        }

        @Override // defpackage.sls
        public final Object invoke() {
            return new c(a.this.a().a.a, (com.yandex.go.platform.payments.internal.a) a.this.b.getValue());
        }
    });
    public final i3y e = kotlin.a.a(new sls() { // from class: com.yandex.go.platform.payments.di.PaymentsComponent$verifyCardInteractor$2
        {
            super(0);
        }

        @Override // defpackage.sls
        public final Object invoke() {
            return new d(a.this.a().a.a, a.this.a().b, a.this.a().b, (com.yandex.go.platform.payments.internal.a) a.this.b.getValue(), a.this.a().c);
        }
    });

    public a(final fk fkVar) {
        this.b = kotlin.a.a(new sls() { // from class: com.yandex.go.platform.payments.di.PaymentsComponent$paymentKitFactory$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return new com.yandex.go.platform.payments.internal.a(fk.this, this.a().a.d, this.a().d);
            }
        });
    }

    public final d0p a() {
        return (d0p) this.a.getValue();
    }
}
