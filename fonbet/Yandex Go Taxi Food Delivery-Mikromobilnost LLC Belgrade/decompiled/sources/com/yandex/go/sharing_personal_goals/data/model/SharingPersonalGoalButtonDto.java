package com.yandex.go.sharing_personal_goals.data.model;

import defpackage.drr0;
import defpackage.frr0;
import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/sharing_personal_goals/data/model/SharingPersonalGoalButtonDto;", "", "Companion", "frr0", "grr0", "$serializer", "com/yandex/go/sharing_personal_goals/data/model/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SharingPersonalGoalButtonDto {
    public static final c Companion = new c();
    public final FormattedText a;
    public final frr0 b;

    public /* synthetic */ SharingPersonalGoalButtonDto(int i, FormattedText formattedText, frr0 frr0Var) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = drr0.INSTANCE;
        } else {
            this.b = frr0Var;
        }
    }

    public SharingPersonalGoalButtonDto() {
        FormattedText formattedText = FormattedText.c;
        drr0 drr0Var = drr0.INSTANCE;
        this.a = formattedText;
        this.b = drr0Var;
    }
}
