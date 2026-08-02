package com.yandex.go.sharing_personal_goals.data.model;

import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/sharing_personal_goals/data/model/SharingPersonalGoalsPromoblockDto$PromoblockDto$InProgress", "Lcom/yandex/go/sharing_personal_goals/data/model/z;", "Companion", "$serializer", "com/yandex/go/sharing_personal_goals/data/model/x", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SharingPersonalGoalsPromoblockDto$PromoblockDto$InProgress extends z {
    public static final x Companion = new x();
    public final FormattedText a;
    public final FormattedText b;
    public final String c;
    public final Integer d;
    public final Integer e;

    public SharingPersonalGoalsPromoblockDto$PromoblockDto$InProgress(int i, FormattedText formattedText, FormattedText formattedText2, String str, Integer num, Integer num2) {
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
            this.d = num;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num2;
        }
    }

    public SharingPersonalGoalsPromoblockDto$PromoblockDto$InProgress() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }
}
