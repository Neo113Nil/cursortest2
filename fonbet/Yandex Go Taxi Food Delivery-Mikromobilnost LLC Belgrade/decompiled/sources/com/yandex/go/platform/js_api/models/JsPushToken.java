package com.yandex.go.platform.js_api.models;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/platform/js_api/models/JsPushToken;", "", "Companion", "$serializer", "com/yandex/go/platform/js_api/models/k", "com.yandex.go.platform.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class JsPushToken {
    public static final k Companion = new k();
    public final String a;
    public final String b;

    public /* synthetic */ JsPushToken(int i, String str, String str2) {
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
    }

    public JsPushToken(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public JsPushToken() {
        this(null, null);
    }
}
