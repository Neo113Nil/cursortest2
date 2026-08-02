package com.yandex.go.sharing_personal_goals.data.model;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/sharing_personal_goals/data/model/SharingPersonalGoalsAcceptParams;", "", "Companion", "$serializer", "com/yandex/go/sharing_personal_goals/data/model/j", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SharingPersonalGoalsAcceptParams {
    public static final j Companion = new j();
    public final String a;

    public /* synthetic */ SharingPersonalGoalsAcceptParams(int i, String str) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
    }

    public SharingPersonalGoalsAcceptParams(String str) {
        this.a = str;
    }

    public SharingPersonalGoalsAcceptParams() {
        this("");
    }
}
