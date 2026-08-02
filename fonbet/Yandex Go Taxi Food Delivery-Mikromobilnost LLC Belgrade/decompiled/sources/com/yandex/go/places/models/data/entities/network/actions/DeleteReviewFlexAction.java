package com.yandex.go.places.models.data.entities.network.actions;

import defpackage.gsq0;
import defpackage.kr;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/models/data/entities/network/actions/DeleteReviewFlexAction;", "Lkr;", "Companion", "$serializer", "com/yandex/go/places/models/data/entities/network/actions/c", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeleteReviewFlexAction extends kr {
    public static final c Companion = new c();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ DeleteReviewFlexAction(int i, String str, String str2, String str3) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, DeleteReviewFlexAction$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
    }
}
