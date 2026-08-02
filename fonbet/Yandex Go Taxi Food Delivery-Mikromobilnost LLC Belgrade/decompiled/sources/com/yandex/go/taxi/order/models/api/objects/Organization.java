package com.yandex.go.taxi.order.models.api.objects;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.s780;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/Organization;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/objects/q0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class Organization {
    public static final q0 Companion = new q0();
    public static final i3y[] j = {null, null, null, null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new s780(27))};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final List i;

    public /* synthetic */ Organization(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list) {
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
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str6;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str7;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str8;
        }
        if ((i & 256) == 0) {
            this.i = EmptyList.a;
        } else {
            this.i = list;
        }
    }

    public final boolean a() {
        String str = this.b;
        if (str != null && str.length() != 0) {
            return true;
        }
        String str2 = this.c;
        if (str2 != null && str2.length() != 0) {
            return true;
        }
        String str3 = this.d;
        if (str3 != null && str3.length() != 0) {
            return true;
        }
        String str4 = this.e;
        if (str4 != null && str4.length() != 0) {
            return true;
        }
        String str5 = this.f;
        if (str5 != null && str5.length() != 0) {
            return true;
        }
        String str6 = this.g;
        return (str6 == null || str6.length() == 0) ? false : true;
    }

    public Organization() {
        this.a = "";
        this.b = "";
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = EmptyList.a;
    }
}
