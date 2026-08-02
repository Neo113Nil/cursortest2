package com.yandex.go.places.models.data.entities.network.actions;

import com.yandex.go.places.models.data.entities.network.ActionDto$OpenNavigatorActionSubtypeDto;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.kr;
import defpackage.qje;
import defpackage.y570;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/models/data/entities/network/actions/OpenNavigatorFlexAction;", "Lkr;", "Companion", "$serializer", "com/yandex/go/places/models/data/entities/network/actions/h", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OpenNavigatorFlexAction extends kr {
    public static final h Companion = new h();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new y570(5)), null};
    public final String a;
    public final ActionDto$OpenNavigatorActionSubtypeDto b;
    public final String c;

    public /* synthetic */ OpenNavigatorFlexAction(int i, String str, ActionDto$OpenNavigatorActionSubtypeDto actionDto$OpenNavigatorActionSubtypeDto, String str2) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, OpenNavigatorFlexAction$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = ActionDto$OpenNavigatorActionSubtypeDto.GO_TO_ACTION;
        } else {
            this.b = actionDto$OpenNavigatorActionSubtypeDto;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }
}
