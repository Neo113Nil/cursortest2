package com.yandex.go.zone.dto.objects;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.xlw0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/SurgeIconStyle;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/x5", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SurgeIconStyle {
    public static final x5 Companion = new x5();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xlw0(5)), null};
    public final SurgeIconType a;
    public final String b;

    public /* synthetic */ SurgeIconStyle(int i, SurgeIconType surgeIconType, String str) {
        this.a = (i & 1) == 0 ? SurgeIconType.DEFAULT : surgeIconType;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SurgeIconStyle)) {
            return false;
        }
        SurgeIconStyle surgeIconStyle = (SurgeIconStyle) obj;
        return this.a == surgeIconStyle.a && jl40.l(this.b, surgeIconStyle.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SurgeIconStyle(type=" + this.a + ", color=" + this.b + Extension.C_BRAKE;
    }

    public SurgeIconStyle() {
        this(0);
    }

    public SurgeIconStyle(int i) {
        this.a = SurgeIconType.DEFAULT;
        this.b = "";
    }
}
