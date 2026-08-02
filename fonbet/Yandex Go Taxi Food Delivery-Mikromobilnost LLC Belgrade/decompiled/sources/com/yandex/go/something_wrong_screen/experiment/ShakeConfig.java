package com.yandex.go.something_wrong_screen.experiment;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/something_wrong_screen/experiment/ShakeConfig;", "", "Companion", "com/yandex/go/something_wrong_screen/experiment/c", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ShakeConfig {
    public static final c Companion = new c();
    public static final ShakeConfig f = new ShakeConfig(0);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ ShakeConfig(String str, String str2, String str3, String str4, int i, String str5) {
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
            this.e = "";
        } else {
            this.e = str5;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getD() {
        return this.d;
    }

    /* renamed from: b, reason: from getter */
    public final String getC() {
        return this.c;
    }

    public ShakeConfig(int i) {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
    }

    public ShakeConfig() {
        this(0);
    }
}
