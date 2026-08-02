package com.yandex.go.navigator.main_screen.experiement;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.wwx;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/navigator/main_screen/experiement/ListButtonsDto;", "", "Companion", "$serializer", "com/yandex/go/navigator/main_screen/experiement/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ListButtonsDto {
    public static final a Companion = new a();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wwx(12))};
    public final boolean a;
    public final List b;

    public /* synthetic */ ListButtonsDto(int i, boolean z, List list) {
        this.a = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public ListButtonsDto(int i) {
        this.a = false;
        this.b = EmptyList.a;
    }

    public ListButtonsDto() {
        this(0);
    }
}
