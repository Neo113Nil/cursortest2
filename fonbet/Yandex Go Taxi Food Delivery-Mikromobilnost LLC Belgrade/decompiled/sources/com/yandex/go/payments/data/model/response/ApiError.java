package com.yandex.go.payments.data.model.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ly1;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/response/ApiError;", "", "Companion", "$serializer", "com/yandex/go/payments/data/model/response/i", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ApiError {
    public static final i Companion = new i();
    public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ly1(19))};
    public final String a;
    public final String b;
    public final Map c;

    public /* synthetic */ ApiError(int i, String str, String str2, Map map) {
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
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final String b() {
        List list = (List) this.c.get("sharing_text");
        if (list == null) {
            list = EmptyList.a;
        }
        String str = (String) kotlin.collections.a.R(list);
        return str == null ? "" : str;
    }

    /* renamed from: c, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public ApiError() {
        Map f = kotlin.collections.b.f();
        this.a = "";
        this.b = "";
        this.c = f;
    }
}
