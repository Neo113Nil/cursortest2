package com.yandex.go.taxi.order.models.api.promotions;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/promotions/ObjectAppearanceOverride;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/promotions/d", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ObjectAppearanceOverride {
    public static final d Companion = new d();
    public final String a;
    public final ObjectAppearanceScale b;
    public final ObjectAppearanceOverlay c;
    public final ObjectAppearanceActions d;
    public final ObjectAppearanceAnalytics e;

    public /* synthetic */ ObjectAppearanceOverride(int i, String str, ObjectAppearanceScale objectAppearanceScale, ObjectAppearanceOverlay objectAppearanceOverlay, ObjectAppearanceActions objectAppearanceActions, ObjectAppearanceAnalytics objectAppearanceAnalytics) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = objectAppearanceScale;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = objectAppearanceOverlay;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = objectAppearanceActions;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = objectAppearanceAnalytics;
        }
    }

    public ObjectAppearanceOverride() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }
}
