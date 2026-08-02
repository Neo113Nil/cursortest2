package com.yandex.go.zone.dto.response;

import defpackage.bd61;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.xvz;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/zone/dto/response/ZoneAcceptance$Trackable", "Lcom/yandex/go/zone/dto/response/p;", "Companion", "$serializer", "com/yandex/go/zone/dto/response/o", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ZoneAcceptance$Trackable extends p {
    public static final o Companion = new o();
    public static final i3y[] g = {null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bd61(2)), null};
    public final String a;
    public final FormattedText b;
    public final FormattedText c;
    public final String d;
    public final List e;
    public final boolean f;

    public ZoneAcceptance$Trackable(int i, String str, FormattedText formattedText, FormattedText formattedText2, String str2, List list, boolean z) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = formattedText;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = formattedText2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = EmptyList.a;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = true;
        } else {
            this.f = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZoneAcceptance$Trackable)) {
            return false;
        }
        ZoneAcceptance$Trackable zoneAcceptance$Trackable = (ZoneAcceptance$Trackable) obj;
        return jl40.l(this.a, zoneAcceptance$Trackable.a) && jl40.l(this.b, zoneAcceptance$Trackable.b) && jl40.l(this.c, zoneAcceptance$Trackable.c) && jl40.l(this.d, zoneAcceptance$Trackable.d) && jl40.l(this.e, zoneAcceptance$Trackable.e) && this.f == zoneAcceptance$Trackable.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        FormattedText formattedText = this.b;
        int hashCode2 = (hashCode + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31;
        FormattedText formattedText2 = this.c;
        int hashCode3 = (hashCode2 + (formattedText2 == null ? 0 : formattedText2.a.hashCode())) * 31;
        String str = this.d;
        return Boolean.hashCode(this.f) + unr0.c((hashCode3 + (str != null ? str.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder q = xvz.q("Trackable(id=", this.a, ", title=", ", content=", this.b);
        q.append(this.c);
        q.append(", imageTag=");
        q.append(this.d);
        q.append(", buttons=");
        q.append(this.e);
        q.append(", isDismissible=");
        q.append(this.f);
        q.append(Extension.C_BRAKE);
        return q.toString();
    }

    public ZoneAcceptance$Trackable() {
        this.a = "";
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = EmptyList.a;
        this.f = true;
    }
}
