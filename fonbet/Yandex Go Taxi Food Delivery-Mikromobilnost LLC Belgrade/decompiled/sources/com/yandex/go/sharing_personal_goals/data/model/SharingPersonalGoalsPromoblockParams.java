package com.yandex.go.sharing_personal_goals.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.mkr0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/sharing_personal_goals/data/model/SharingPersonalGoalsPromoblockParams;", "", "Companion", "$serializer", "com/yandex/go/sharing_personal_goals/data/model/a0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SharingPersonalGoalsPromoblockParams {
    public static final a0 Companion = new a0();
    public static final i3y[] c;
    public final SharingServiceNameDto a;
    public final SharingPersonalGoalsDisplayContextDto b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new mkr0(21)), kotlin.a.b(lazyThreadSafetyMode, new mkr0(22))};
    }

    public /* synthetic */ SharingPersonalGoalsPromoblockParams(int i, SharingServiceNameDto sharingServiceNameDto, SharingPersonalGoalsDisplayContextDto sharingPersonalGoalsDisplayContextDto) {
        this.a = (i & 1) == 0 ? SharingServiceNameDto.NONE : sharingServiceNameDto;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = sharingPersonalGoalsDisplayContextDto;
        }
    }

    public SharingPersonalGoalsPromoblockParams(SharingServiceNameDto sharingServiceNameDto, SharingPersonalGoalsDisplayContextDto sharingPersonalGoalsDisplayContextDto) {
        this.a = sharingServiceNameDto;
        this.b = sharingPersonalGoalsDisplayContextDto;
    }

    public SharingPersonalGoalsPromoblockParams() {
        this(SharingServiceNameDto.NONE, null);
    }
}
