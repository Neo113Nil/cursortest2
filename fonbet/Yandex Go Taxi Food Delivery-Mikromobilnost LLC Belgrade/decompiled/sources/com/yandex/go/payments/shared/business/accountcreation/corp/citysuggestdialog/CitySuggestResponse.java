package com.yandex.go.payments.shared.business.accountcreation.corp.citysuggestdialog;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qje;
import defpackage.qlb;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/business/accountcreation/corp/citysuggestdialog/CitySuggestResponse;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/business/accountcreation/corp/citysuggestdialog/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CitySuggestResponse {
    public static final c Companion = new c();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new qlb(23))};
    public final List a;

    public /* synthetic */ CitySuggestResponse(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            qje.Z(i, 1, CitySuggestResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }
}
