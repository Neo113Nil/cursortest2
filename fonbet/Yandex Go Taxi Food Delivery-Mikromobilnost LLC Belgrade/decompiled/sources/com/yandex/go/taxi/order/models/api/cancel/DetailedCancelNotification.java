package com.yandex.go.taxi.order.models.api.cancel;

import defpackage.gsq0;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/cancel/DetailedCancelNotification;", "Lcom/yandex/go/taxi/order/models/api/cancel/p;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/cancel/c0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DetailedCancelNotification extends p {
    public static final c0 Companion = new c0();
    public final String a;
    public final String b;
    public final String c;
    public final CostInfo d;
    public final AfterCancelPopupButtons e;
    public final boolean f;

    public DetailedCancelNotification(int i, String str, String str2, String str3, CostInfo costInfo, AfterCancelPopupButtons afterCancelPopupButtons, boolean z) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = costInfo;
        }
        if ((i & 16) == 0) {
            AfterCancelPopupButtons.Companion.getClass();
            this.e = AfterCancelPopupButtons.d;
        } else {
            this.e = afterCancelPopupButtons;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z;
        }
    }

    @Override // com.yandex.go.taxi.order.models.api.cancel.p
    public final boolean a() {
        if (this.b.length() <= 0) {
            return false;
        }
        List<AfterCancelPopupButton> list = this.e.b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (AfterCancelPopupButton afterCancelPopupButton : list) {
            if (afterCancelPopupButton.a.length() > 0 && afterCancelPopupButton.d.b()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getF() {
        return this.f;
    }

    public DetailedCancelNotification() {
        AfterCancelPopupButtons.Companion.getClass();
        AfterCancelPopupButtons afterCancelPopupButtons = AfterCancelPopupButtons.d;
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = null;
        this.e = afterCancelPopupButtons;
        this.f = false;
    }
}
