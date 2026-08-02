package com.yandex.go.zone.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.w5w0;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/model/SupportPage;", "", "Companion", "$serializer", "com/yandex/go/zone/model/e", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SupportPage {
    public static final e Companion = new e();
    public static final i3y[] f = {null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new w5w0(19))};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Map e;

    public /* synthetic */ SupportPage(String str, int i, String str2, String str3, String str4, Map map) {
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
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = kotlin.collections.b.f();
        } else {
            this.e = map;
        }
    }

    public SupportPage() {
        this(0);
    }

    public SupportPage(int i) {
        Map f2 = kotlin.collections.b.f();
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = f2;
    }
}
