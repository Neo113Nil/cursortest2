package com.yandex.go.places.models.data.entities.network.bottom_panel;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oo31;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/places/models/data/entities/network/bottom_panel/BottomPanelButtonActionDto$WebCustomTabs", "Lcom/yandex/go/places/models/data/entities/network/bottom_panel/k;", "Companion", "$serializer", "com/yandex/go/places/models/data/entities/network/bottom_panel/i", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BottomPanelButtonActionDto$WebCustomTabs extends k {
    public static final i Companion = new i();
    public final String a;
    public final boolean b;
    public final String c;

    public BottomPanelButtonActionDto$WebCustomTabs(String str, int i, String str2, boolean z) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    @Override // com.yandex.go.places.models.data.entities.network.bottom_panel.k
    /* renamed from: a, reason: from getter */
    public final String getC() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomPanelButtonActionDto$WebCustomTabs)) {
            return false;
        }
        BottomPanelButtonActionDto$WebCustomTabs bottomPanelButtonActionDto$WebCustomTabs = (BottomPanelButtonActionDto$WebCustomTabs) obj;
        return jl40.l(this.a, bottomPanelButtonActionDto$WebCustomTabs.a) && this.b == bottomPanelButtonActionDto$WebCustomTabs.b && jl40.l(this.c, bottomPanelButtonActionDto$WebCustomTabs.c);
    }

    public final int hashCode() {
        int e = unr0.e(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return e + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return oyr.t(oo31.l("WebCustomTabs(url=", this.a, ", wrapAuthUrl=", ", goalTrackingLink=", this.b), this.c, Extension.C_BRAKE);
    }

    public BottomPanelButtonActionDto$WebCustomTabs() {
        this.a = "";
        this.b = false;
        this.c = null;
    }
}
