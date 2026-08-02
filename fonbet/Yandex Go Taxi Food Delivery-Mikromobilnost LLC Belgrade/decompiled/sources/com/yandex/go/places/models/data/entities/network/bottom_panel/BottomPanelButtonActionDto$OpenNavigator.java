package com.yandex.go.places.models.data.entities.network.bottom_panel;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qje;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/places/models/data/entities/network/bottom_panel/BottomPanelButtonActionDto$OpenNavigator", "Lcom/yandex/go/places/models/data/entities/network/bottom_panel/k;", "Companion", "$serializer", "com/yandex/go/places/models/data/entities/network/bottom_panel/e", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BottomPanelButtonActionDto$OpenNavigator extends k {
    public static final e Companion = new e();
    public final String a;
    public final String b;
    public final String c;

    public BottomPanelButtonActionDto$OpenNavigator(int i, String str, String str2, String str3) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, BottomPanelButtonActionDto$OpenNavigator$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
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
        if (!(obj instanceof BottomPanelButtonActionDto$OpenNavigator)) {
            return false;
        }
        BottomPanelButtonActionDto$OpenNavigator bottomPanelButtonActionDto$OpenNavigator = (BottomPanelButtonActionDto$OpenNavigator) obj;
        return jl40.l(this.a, bottomPanelButtonActionDto$OpenNavigator.a) && jl40.l(this.b, bottomPanelButtonActionDto$OpenNavigator.b) && jl40.l(this.c, bottomPanelButtonActionDto$OpenNavigator.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return oyr.t(b64.v("OpenNavigator(fallbackDeeplink=", this.a, ", actionSubtype=", this.b, ", goalTrackingLink="), this.c, Extension.C_BRAKE);
    }
}
