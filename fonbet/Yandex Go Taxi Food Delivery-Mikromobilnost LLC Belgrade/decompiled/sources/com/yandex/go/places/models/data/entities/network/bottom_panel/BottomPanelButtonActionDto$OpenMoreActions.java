package com.yandex.go.places.models.data.entities.network.bottom_panel;

import defpackage.av5;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qje;
import defpackage.unr0;
import defpackage.xvz;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/places/models/data/entities/network/bottom_panel/BottomPanelButtonActionDto$OpenMoreActions", "Lcom/yandex/go/places/models/data/entities/network/bottom_panel/k;", "Companion", "$serializer", "com/yandex/go/places/models/data/entities/network/bottom_panel/d", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BottomPanelButtonActionDto$OpenMoreActions extends k {
    public static final d Companion = new d();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new av5(16)), null};
    public final String a;
    public final List b;
    public final String c;

    public BottomPanelButtonActionDto$OpenMoreActions(int i, String str, String str2, List list) {
        if (2 != (i & 2)) {
            qje.Z(i, 2, BottomPanelButtonActionDto$OpenMoreActions$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = list;
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
        if (!(obj instanceof BottomPanelButtonActionDto$OpenMoreActions)) {
            return false;
        }
        BottomPanelButtonActionDto$OpenMoreActions bottomPanelButtonActionDto$OpenMoreActions = (BottomPanelButtonActionDto$OpenMoreActions) obj;
        return jl40.l(this.a, bottomPanelButtonActionDto$OpenMoreActions.a) && jl40.l(this.b, bottomPanelButtonActionDto$OpenMoreActions.b) && jl40.l(this.c, bottomPanelButtonActionDto$OpenMoreActions.c);
    }

    public final int hashCode() {
        String str = this.a;
        int c = unr0.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        return c + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return oyr.t(xvz.r("OpenMoreActions(title=", this.a, ", items=", this.b, ", goalTrackingLink="), this.c, Extension.C_BRAKE);
    }
}
