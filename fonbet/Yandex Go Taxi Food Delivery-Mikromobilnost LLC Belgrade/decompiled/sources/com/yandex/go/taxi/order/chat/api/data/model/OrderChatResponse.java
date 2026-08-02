package com.yandex.go.taxi.order.chat.api.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl70;
import defpackage.nzs;
import defpackage.x4e;
import defpackage.xvz;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/chat/api/data/model/OrderChatResponse;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/chat/api/data/model/e", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OrderChatResponse {
    public static final e Companion = new e();
    public static final i3y[] h;
    public final String a;
    public final List b;
    public final List c;
    public final TranslationSettings d;
    public final List e;
    public final boolean f;
    public final boolean g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new jl70(10)), kotlin.a.b(lazyThreadSafetyMode, new jl70(11)), null, kotlin.a.b(lazyThreadSafetyMode, new jl70(12)), null, null};
    }

    public /* synthetic */ OrderChatResponse(int i, String str, List list, List list2, TranslationSettings translationSettings, List list3, boolean z, boolean z2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        int i2 = i & 2;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.b = emptyList;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = emptyList;
        } else {
            this.c = list2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = translationSettings;
        }
        if ((i & 16) == 0) {
            this.e = emptyList;
        } else {
            this.e = list3;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z;
        }
        if ((i & 64) == 0) {
            this.g = false;
        } else {
            this.g = z2;
        }
    }

    public final String toString() {
        StringBuilder r = xvz.r("OrderChatResponse(newestMessageId=", this.a, ", messages=", this.b, ", suggestions=");
        r.append(this.c);
        r.append(", translationSettings=");
        r.append(this.d);
        r.append(", allLanguages=");
        nzs.p(r, this.e, ", canTranslate=", this.f, ", needRefresh=");
        return x4e.i(r, this.g, Extension.C_BRAKE);
    }

    public OrderChatResponse() {
        this.a = null;
        EmptyList emptyList = EmptyList.a;
        this.b = emptyList;
        this.c = emptyList;
        this.d = null;
        this.e = emptyList;
        this.f = false;
        this.g = false;
    }
}
