package com.yandex.go.sharing_personal_goals.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.mkr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/sharing_personal_goals/data/model/SharingPersonalGoalsDto;", "", "Companion", "$serializer", "com/yandex/go/sharing_personal_goals/data/model/k", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SharingPersonalGoalsDto {
    public static final k Companion = new k();
    public static final i3y[] e;
    public final FormattedText a;
    public final List b;
    public final List c;
    public final FormattedText d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new mkr0(17)), kotlin.a.b(lazyThreadSafetyMode, new mkr0(18)), null};
    }

    public /* synthetic */ SharingPersonalGoalsDto(int i, FormattedText formattedText, List list, List list2, FormattedText formattedText2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = formattedText;
        }
        int i2 = i & 2;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.b = emptyList;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = emptyList;
        } else {
            this.c = list2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = formattedText2;
        }
    }

    public SharingPersonalGoalsDto() {
        this.a = null;
        EmptyList emptyList = EmptyList.a;
        this.b = emptyList;
        this.c = emptyList;
        this.d = null;
    }
}
