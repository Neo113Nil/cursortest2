package com.yandex.go.sharing_personal_goals.data.model;

import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/sharing_personal_goals/data/model/SharingPersonalGoalsPromoblockDto$PromoblockDto$Accept", "Lcom/yandex/go/sharing_personal_goals/data/model/z;", "Companion", "$serializer", "com/yandex/go/sharing_personal_goals/data/model/o", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SharingPersonalGoalsPromoblockDto$PromoblockDto$Accept extends z {
    public static final o Companion = new o();
    public final FormattedText a;
    public final FormattedText b;
    public final String c;
    public final SharingPersonalGoalsPromoblockBadgeDto d;

    public SharingPersonalGoalsPromoblockDto$PromoblockDto$Accept(int i, FormattedText formattedText, FormattedText formattedText2, String str, SharingPersonalGoalsPromoblockBadgeDto sharingPersonalGoalsPromoblockBadgeDto) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = formattedText;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = formattedText2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = sharingPersonalGoalsPromoblockBadgeDto;
        }
    }

    public SharingPersonalGoalsPromoblockDto$PromoblockDto$Accept() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
