package com.yandex.go.scooters.data_form.data.model;

import defpackage.c6p0;
import defpackage.gsq0;
import defpackage.i3y;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/data_form/data/model/ScootersUpdatePdDataErrorResponse;", "", "Companion", "$serializer", "com/yandex/go/scooters/data_form/data/model/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersUpdatePdDataErrorResponse {
    public static final a Companion = new a();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new c6p0(1))};
    public final List a;

    public /* synthetic */ ScootersUpdatePdDataErrorResponse(int i, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = list;
        }
    }

    public ScootersUpdatePdDataErrorResponse() {
        this.a = null;
    }
}
