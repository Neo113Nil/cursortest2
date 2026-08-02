package com.yandex.go.places.models.data.entities.network.bottom_panel;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/places/models/data/entities/network/bottom_panel/BottomPanelButtonActionDto$ShareNative", "Lcom/yandex/go/places/models/data/entities/network/bottom_panel/k;", "Companion", "$serializer", "com/yandex/go/places/models/data/entities/network/bottom_panel/g", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BottomPanelButtonActionDto$ShareNative extends k {
    public static final g Companion = new g();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public BottomPanelButtonActionDto$ShareNative(int i, String str, String str2, String str3, String str4) {
        if (5 != (i & 5)) {
            qje.Z(i, 5, BottomPanelButtonActionDto$ShareNative$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        this.c = str3;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
    }

    @Override // com.yandex.go.places.models.data.entities.network.bottom_panel.k
    /* renamed from: a, reason: from getter */
    public final String getC() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomPanelButtonActionDto$ShareNative)) {
            return false;
        }
        BottomPanelButtonActionDto$ShareNative bottomPanelButtonActionDto$ShareNative = (BottomPanelButtonActionDto$ShareNative) obj;
        return jl40.l(this.a, bottomPanelButtonActionDto$ShareNative.a) && jl40.l(this.b, bottomPanelButtonActionDto$ShareNative.b) && jl40.l(this.c, bottomPanelButtonActionDto$ShareNative.c) && jl40.l(this.d, bottomPanelButtonActionDto$ShareNative.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        return b + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return g8e.r(b64.v("ShareNative(title=", this.a, ", subtitle=", this.b, ", content="), this.c, ", goalTrackingLink=", this.d, Extension.C_BRAKE);
    }
}
