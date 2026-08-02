package com.yandex.go.places.models.data.entities.network.bottom_panel;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/places/models/data/entities/network/bottom_panel/BottomPanelButtonActionDto$Unknown", "Lcom/yandex/go/places/models/data/entities/network/bottom_panel/k;", "Companion", "$serializer", "com/yandex/go/places/models/data/entities/network/bottom_panel/h", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BottomPanelButtonActionDto$Unknown extends k {
    public static final h Companion = new h();
    public final String a;

    public BottomPanelButtonActionDto$Unknown(int i, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
    }

    @Override // com.yandex.go.places.models.data.entities.network.bottom_panel.k
    /* renamed from: a, reason: from getter */
    public final String getC() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BottomPanelButtonActionDto$Unknown) && jl40.l(this.a, ((BottomPanelButtonActionDto$Unknown) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return oyr.p("Unknown(goalTrackingLink=", this.a, Extension.C_BRAKE);
    }

    public BottomPanelButtonActionDto$Unknown() {
        this.a = null;
    }
}
