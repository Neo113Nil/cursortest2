package com.yandex.go.sharing_personal_goals.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.mkr0;
import defpackage.qje;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/sharing_personal_goals/data/model/SharingPersonalGoalsParams;", "", "Companion", "$serializer", "com/yandex/go/sharing_personal_goals/data/model/l", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SharingPersonalGoalsParams {
    public static final l Companion = new l();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new mkr0(19))};
    public final SharingServiceNameDto a;

    public /* synthetic */ SharingPersonalGoalsParams(int i, SharingServiceNameDto sharingServiceNameDto) {
        if (1 == (i & 1)) {
            this.a = sharingServiceNameDto;
        } else {
            qje.Z(i, 1, SharingPersonalGoalsParams$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public SharingPersonalGoalsParams(SharingServiceNameDto sharingServiceNameDto) {
        this.a = sharingServiceNameDto;
    }
}
