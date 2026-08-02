package com.yandex.go.payments.shared.data.model;

import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/data/model/SaveReportSettingsRequest;", "", "Companion", "com/yandex/go/payments/shared/data/model/p", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SaveReportSettingsRequest {
    public static final p Companion = new p();
    public final String a;
    public final String b;

    public /* synthetic */ SaveReportSettingsRequest(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, SaveReportSettingsRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public SaveReportSettingsRequest(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
