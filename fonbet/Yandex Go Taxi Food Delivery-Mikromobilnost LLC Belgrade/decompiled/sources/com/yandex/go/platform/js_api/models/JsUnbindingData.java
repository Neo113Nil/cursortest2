package com.yandex.go.platform.js_api.models;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import defpackage.unr0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/platform/js_api/models/JsUnbindingData;", "", "Companion", "$serializer", "com/yandex/go/platform/js_api/models/m", "com.yandex.go.platform.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class JsUnbindingData {
    public static final m Companion = new m();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ JsUnbindingData(int i, String str, String str2, String str3) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, JsUnbindingData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JsUnbindingData)) {
            return false;
        }
        JsUnbindingData jsUnbindingData = (JsUnbindingData) obj;
        return jl40.l(this.a, jsUnbindingData.a) && jl40.l(this.b, jsUnbindingData.b) && jl40.l(this.c, jsUnbindingData.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsUnbindingData(cardId=");
        sb.append(this.a);
        sb.append(", serviceToken=");
        sb.append(this.b);
        sb.append(", profileId=");
        return b64.p(sb, this.c, ')');
    }
}
