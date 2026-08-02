package com.yandex.go.payments.cards.pci_dss.data.model;

import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/cards/pci_dss/data/model/PciDssCardData;", "", "Companion", "$serializer", "com/yandex/go/payments/cards/pci_dss/data/model/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PciDssCardData {
    public static final a Companion = new a();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ PciDssCardData(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, PciDssCardData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public PciDssCardData(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }
}
