package com.yandex.go.vault.flexsdk.descriptors.widget;

import defpackage.gsq0;
import defpackage.pyp0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/vault/flexsdk/descriptors/widget/VaultsPagerWidgetSection;", "Lpyp0;", "Companion", "$serializer", "com/yandex/go/vault/flexsdk/descriptors/widget/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class VaultsPagerWidgetSection extends pyp0 {
    public static final c Companion = new c();
    public final String a;
    public final String b;
    public final VaultsPagerWidgetData c;
    public final boolean d;

    public /* synthetic */ VaultsPagerWidgetSection(int i, String str, String str2, VaultsPagerWidgetData vaultsPagerWidgetData, boolean z) {
        if (4 != (i & 4)) {
            qje.Z(i, 4, VaultsPagerWidgetSection$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = "vaults_pager";
        } else {
            this.b = str2;
        }
        this.c = vaultsPagerWidgetData;
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
    }

    @Override // defpackage.pyp0
    /* renamed from: c, reason: from getter */
    public final String getA() {
        return this.a;
    }

    @Override // defpackage.pyp0
    /* renamed from: d, reason: from getter */
    public final boolean getD() {
        return this.d;
    }
}
