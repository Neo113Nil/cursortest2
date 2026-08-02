package com.yandex.go.taxi.order.models.api.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.m3e;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/ConfirmationNotification;", "", "Companion", "com/yandex/go/taxi/order/models/api/response/e0", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ConfirmationNotification {
    public static final e0 Companion = new e0();
    public static final i3y[] f = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new m3e(1)), null, null};
    public static final ConfirmationNotification g = new ConfirmationNotification(0);
    public final String a;
    public final String b;
    public final List c;
    public final PopupButton d;
    public final PopupButton e;

    public /* synthetic */ ConfirmationNotification(int i, String str, String str2, List list, PopupButton popupButton, PopupButton popupButton2) {
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
            this.c = null;
        } else {
            this.c = list;
        }
        int i2 = i & 8;
        PopupButton popupButton3 = PopupButton.c;
        if (i2 == 0) {
            this.d = popupButton3;
        } else {
            this.d = popupButton;
        }
        if ((i & 16) == 0) {
            this.e = popupButton3;
        } else {
            this.e = popupButton2;
        }
    }

    public ConfirmationNotification(int i) {
        this.a = "";
        this.b = "";
        this.c = null;
        PopupButton popupButton = PopupButton.c;
        this.d = popupButton;
        this.e = popupButton;
    }

    public ConfirmationNotification() {
        this(0);
    }
}
