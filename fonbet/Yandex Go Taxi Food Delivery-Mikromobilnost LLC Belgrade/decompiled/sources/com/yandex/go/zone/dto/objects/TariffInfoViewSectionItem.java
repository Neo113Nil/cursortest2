package com.yandex.go.zone.dto.objects;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.xlw0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/TariffInfoViewSectionItem;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/k6", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TariffInfoViewSectionItem {
    public static final k6 Companion = new k6();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xlw0(29))};
    public final String a;
    public final TariffViewSectionItemType b;

    public /* synthetic */ TariffInfoViewSectionItem(int i, String str, TariffViewSectionItemType tariffViewSectionItemType) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = TariffViewSectionItemType.UNKNOWN;
        } else {
            this.b = tariffViewSectionItemType;
        }
    }

    public TariffInfoViewSectionItem() {
        TariffViewSectionItemType tariffViewSectionItemType = TariffViewSectionItemType.UNKNOWN;
        this.a = "";
        this.b = tariffViewSectionItemType;
    }
}
