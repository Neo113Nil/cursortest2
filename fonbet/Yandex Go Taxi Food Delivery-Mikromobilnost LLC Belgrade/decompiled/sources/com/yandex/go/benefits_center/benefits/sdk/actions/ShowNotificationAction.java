package com.yandex.go.benefits_center.benefits.sdk.actions;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/benefits_center/benefits/sdk/actions/ShowNotificationAction;", "Lcom/yandex/go/benefits_center/benefits/sdk/actions/c;", "Companion", "$serializer", "com/yandex/go/benefits_center/benefits/sdk/actions/h", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ShowNotificationAction extends c {
    public static final h Companion = new h();
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ ShowNotificationAction(int i, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 2) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
    }

    public ShowNotificationAction() {
        this.b = null;
        this.c = "";
        this.d = null;
    }
}
