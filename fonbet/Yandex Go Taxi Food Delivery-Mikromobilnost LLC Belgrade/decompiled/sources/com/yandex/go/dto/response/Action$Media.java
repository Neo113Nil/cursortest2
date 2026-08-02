package com.yandex.go.dto.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.pd;
import defpackage.xvz;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/dto/response/Action$Media", "", "Companion", "$serializer", "com/yandex/go/dto/response/z", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Action$Media {
    public static final z Companion = new z();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new pd(28))};
    public final String a;
    public final Map b;

    public /* synthetic */ Action$Media(int i, String str, Map map) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = map;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Action$Media)) {
            return false;
        }
        Action$Media action$Media = (Action$Media) obj;
        return jl40.l(this.a, action$Media.a) && jl40.l(this.b, action$Media.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Map map = this.b;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        return xvz.j("Media(promotionId=", this.a, ", analyticsPayload=", Extension.C_BRAKE, this.b);
    }

    public Action$Media(int i) {
        this.a = "";
        this.b = null;
    }

    public Action$Media() {
        this(0);
    }
}
