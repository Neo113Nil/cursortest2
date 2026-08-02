package com.yandex.go.sharing_personal_goals.data.model;

import defpackage.frr0;
import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/sharing_personal_goals/data/model/SharingPersonalGoalButtonDto$Action$Accept", "Lfrr0;", "Companion", "$serializer", "com/yandex/go/sharing_personal_goals/data/model/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SharingPersonalGoalButtonDto$Action$Accept implements frr0 {
    public static final a Companion = new a();
    public final String a;

    public /* synthetic */ SharingPersonalGoalButtonDto$Action$Accept(int i, String str) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
    }

    public SharingPersonalGoalButtonDto$Action$Accept() {
        this.a = "";
    }
}
