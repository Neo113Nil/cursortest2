package com.yandex.go.places.models.data.entities.network.actions;

import defpackage.gsq0;
import defpackage.kr;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/models/data/entities/network/actions/WebCustomTabsFlexAction;", "Lkr;", "Companion", "$serializer", "com/yandex/go/places/models/data/entities/network/actions/l", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class WebCustomTabsFlexAction extends kr {
    public static final l Companion = new l();
    public final String a;
    public final boolean b;

    public /* synthetic */ WebCustomTabsFlexAction(int i, String str, boolean z) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
    }

    public WebCustomTabsFlexAction() {
        this.a = "";
        this.b = false;
    }
}
