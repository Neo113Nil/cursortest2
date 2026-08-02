package com.yandex.go.payments.cards.data.model;

import defpackage.av5;
import defpackage.gsq0;
import defpackage.i3y;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/cards/data/model/Binding;", "", "Companion", "$serializer", "com/yandex/go/payments/cards/data/model/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Binding {
    public static final b Companion = new b();
    public static final i3y[] f;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;

    static {
        m mVar = Verification.Companion;
        f = new i3y[]{null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new av5(3))};
    }

    public /* synthetic */ Binding(int i, String str, String str2, String str3, String str4, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = EmptyList.a;
        } else {
            this.e = list;
        }
    }

    public Binding() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = EmptyList.a;
    }
}
