package com.yandex.go.zone.dto.objects;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.xlw0;
import defpackage.xvz;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/TariffInfoGroupDefinition;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/f6", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class TariffInfoGroupDefinition {
    public static final f6 Companion = new f6();
    public static final i3y[] i;
    public final String a;
    public final List b;
    public final TariffGroupDefinitionType c;
    public final String d;
    public final String e;
    public final TariffInfoGroupDefinitionPresentation f;
    public final TariffInfoGroupDefinitionBubble g;
    public final TariffInfoGroupDefinitionImages h;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        i = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new xlw0(25)), kotlin.a.b(lazyThreadSafetyMode, new xlw0(26)), null, null, null, null, null};
    }

    public /* synthetic */ TariffInfoGroupDefinition(int i2, String str, List list, TariffGroupDefinitionType tariffGroupDefinitionType, String str2, String str3, TariffInfoGroupDefinitionPresentation tariffInfoGroupDefinitionPresentation, TariffInfoGroupDefinitionBubble tariffInfoGroupDefinitionBubble, TariffInfoGroupDefinitionImages tariffInfoGroupDefinitionImages) {
        this.a = (i2 & 1) == 0 ? "" : str;
        if ((i2 & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
        if ((i2 & 4) == 0) {
            this.c = TariffGroupDefinitionType.UNKNOWN;
        } else {
            this.c = tariffGroupDefinitionType;
        }
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i2 & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = tariffInfoGroupDefinitionPresentation;
        }
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = tariffInfoGroupDefinitionBubble;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = tariffInfoGroupDefinitionImages;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TariffInfoGroupDefinition)) {
            return false;
        }
        TariffInfoGroupDefinition tariffInfoGroupDefinition = (TariffInfoGroupDefinition) obj;
        return jl40.l(this.a, tariffInfoGroupDefinition.a) && jl40.l(this.b, tariffInfoGroupDefinition.b) && this.c == tariffInfoGroupDefinition.c && jl40.l(this.d, tariffInfoGroupDefinition.d) && jl40.l(this.e, tariffInfoGroupDefinition.e) && jl40.l(this.f, tariffInfoGroupDefinition.f) && jl40.l(this.g, tariffInfoGroupDefinition.g) && jl40.l(this.h, tariffInfoGroupDefinition.h);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b)) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        TariffInfoGroupDefinitionPresentation tariffInfoGroupDefinitionPresentation = this.f;
        int hashCode4 = (hashCode3 + (tariffInfoGroupDefinitionPresentation == null ? 0 : tariffInfoGroupDefinitionPresentation.hashCode())) * 31;
        TariffInfoGroupDefinitionBubble tariffInfoGroupDefinitionBubble = this.g;
        int hashCode5 = (hashCode4 + (tariffInfoGroupDefinitionBubble == null ? 0 : tariffInfoGroupDefinitionBubble.a.hashCode())) * 31;
        TariffInfoGroupDefinitionImages tariffInfoGroupDefinitionImages = this.h;
        return hashCode5 + (tariffInfoGroupDefinitionImages != null ? tariffInfoGroupDefinitionImages.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = xvz.r("TariffInfoGroupDefinition(name=", this.a, ", requirements=", this.b, ", groupingType=");
        r.append(this.c);
        r.append(", title=");
        r.append(this.d);
        r.append(", subTitle=");
        r.append(this.e);
        r.append(", presentation=");
        r.append(this.f);
        r.append(", bubble=");
        r.append(this.g);
        r.append(", images=");
        r.append(this.h);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }

    public TariffInfoGroupDefinition(String str, List list, TariffGroupDefinitionType tariffGroupDefinitionType, String str2, String str3, TariffInfoGroupDefinitionPresentation tariffInfoGroupDefinitionPresentation, TariffInfoGroupDefinitionBubble tariffInfoGroupDefinitionBubble, TariffInfoGroupDefinitionImages tariffInfoGroupDefinitionImages) {
        this.a = str;
        this.b = list;
        this.c = tariffGroupDefinitionType;
        this.d = str2;
        this.e = str3;
        this.f = tariffInfoGroupDefinitionPresentation;
        this.g = tariffInfoGroupDefinitionBubble;
        this.h = tariffInfoGroupDefinitionImages;
    }

    public TariffInfoGroupDefinition() {
        this("", EmptyList.a, TariffGroupDefinitionType.UNKNOWN, null, null, null, null, null);
    }
}
