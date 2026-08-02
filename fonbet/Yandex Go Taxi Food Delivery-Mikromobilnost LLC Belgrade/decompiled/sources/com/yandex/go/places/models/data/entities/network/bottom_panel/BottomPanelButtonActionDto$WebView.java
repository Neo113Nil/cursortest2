package com.yandex.go.places.models.data.entities.network.bottom_panel;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/places/models/data/entities/network/bottom_panel/BottomPanelButtonActionDto$WebView", "Lcom/yandex/go/places/models/data/entities/network/bottom_panel/k;", "Companion", "$serializer", "com/yandex/go/places/models/data/entities/network/bottom_panel/j", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BottomPanelButtonActionDto$WebView extends k {
    public static final j Companion = new j();
    public final String a;
    public final String b;

    public BottomPanelButtonActionDto$WebView(int i, String str, String str2) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, BottomPanelButtonActionDto$WebView$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    @Override // com.yandex.go.places.models.data.entities.network.bottom_panel.k
    /* renamed from: a, reason: from getter */
    public final String getC() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomPanelButtonActionDto$WebView)) {
            return false;
        }
        BottomPanelButtonActionDto$WebView bottomPanelButtonActionDto$WebView = (BottomPanelButtonActionDto$WebView) obj;
        return jl40.l(this.a, bottomPanelButtonActionDto$WebView.a) && jl40.l(this.b, bottomPanelButtonActionDto$WebView.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("WebView(url=", this.a, ", goalTrackingLink=", this.b, Extension.C_BRAKE);
    }
}
