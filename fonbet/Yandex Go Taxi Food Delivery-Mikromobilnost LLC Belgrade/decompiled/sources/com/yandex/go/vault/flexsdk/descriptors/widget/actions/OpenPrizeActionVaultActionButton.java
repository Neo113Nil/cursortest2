package com.yandex.go.vault.flexsdk.descriptors.widget.actions;

import com.yandex.go.vault.data.ActionButtonTypeResponse;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.y570;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/vault/flexsdk/descriptors/widget/actions/OpenPrizeActionVaultActionButton;", "", "Companion", "$serializer", "com/yandex/go/vault/flexsdk/descriptors/widget/actions/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OpenPrizeActionVaultActionButton {
    public static final c Companion = new c();
    public static final i3y[] g = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new y570(10)), null, null, null, null, null};
    public final ActionButtonTypeResponse a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public /* synthetic */ OpenPrizeActionVaultActionButton(int i, ActionButtonTypeResponse actionButtonTypeResponse, String str, String str2, String str3, String str4, String str5) {
        this.a = (i & 1) == 0 ? ActionButtonTypeResponse.DEEPLINK : actionButtonTypeResponse;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str5;
        }
    }

    public OpenPrizeActionVaultActionButton(ActionButtonTypeResponse actionButtonTypeResponse, String str, String str2, String str3, String str4, String str5) {
        this.a = actionButtonTypeResponse;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public OpenPrizeActionVaultActionButton() {
        this(ActionButtonTypeResponse.DEEPLINK, "", null, null, null, null);
    }
}
