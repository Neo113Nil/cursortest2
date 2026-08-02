package com.yandex.go.platform.js_api.models;

import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/platform/js_api/models/JsUserInfo;", "", "Companion", "$serializer", "com/yandex/go/platform/js_api/models/o", "com.yandex.go.platform.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class JsUserInfo {
    public static final o Companion = new o();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;
    public final String j;
    public final String k;
    public final boolean l;

    public /* synthetic */ JsUserInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9, String str10, boolean z2) {
        if (4095 != (i & 4095)) {
            qje.Z(i, 4095, JsUserInfo$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = z;
        this.j = str9;
        this.k = str10;
        this.l = z2;
    }

    public JsUserInfo(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, boolean z2) {
        this.a = str;
        this.b = "";
        this.c = "";
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = z;
        this.j = "";
        this.k = str7;
        this.l = z2;
    }
}
