package defpackage;

import com.yandex.go.platform.js_api.models.JsUserInfo;

/* loaded from: classes13.dex */
public final class lwc0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final String h;
    public final boolean i;

    public lwc0(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = z;
        this.h = str7;
        this.i = z2;
    }

    public final JsUserInfo a() {
        return new JsUserInfo(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }
}
