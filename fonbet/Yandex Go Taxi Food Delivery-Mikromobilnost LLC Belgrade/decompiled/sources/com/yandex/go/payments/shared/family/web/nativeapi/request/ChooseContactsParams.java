package com.yandex.go.payments.shared.family.web.nativeapi.request;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qlb;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/family/web/nativeapi/request/ChooseContactsParams;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/family/web/nativeapi/request/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ChooseContactsParams {
    public static final c Companion = new c();
    public static final i3y[] f = {null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new qlb(21))};
    public final ButtonTemplate a;
    public final String b;
    public final String c;
    public final int d;
    public final List e;

    public /* synthetic */ ChooseContactsParams(int i, ButtonTemplate buttonTemplate, String str, String str2, int i2, List list) {
        this.a = (i & 1) == 0 ? new ButtonTemplate(0) : buttonTemplate;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = 0;
        } else {
            this.d = i2;
        }
        if ((i & 16) == 0) {
            this.e = EmptyList.a;
        } else {
            this.e = list;
        }
    }

    public ChooseContactsParams() {
        this.a = new ButtonTemplate(0);
        this.b = null;
        this.c = null;
        this.d = 0;
        this.e = EmptyList.a;
    }
}
