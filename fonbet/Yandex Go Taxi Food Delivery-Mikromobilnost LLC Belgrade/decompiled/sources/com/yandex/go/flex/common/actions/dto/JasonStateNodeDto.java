package com.yandex.go.flex.common.actions.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ojw;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/common/actions/dto/JasonStateNodeDto;", "", "Companion", "$serializer", "com/yandex/go/flex/common/actions/dto/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class JasonStateNodeDto {
    public static final c Companion = new c();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ojw(22)), null};
    public final List a;
    public final kotlinx.serialization.json.c b;

    public /* synthetic */ JasonStateNodeDto(int i, List list, kotlinx.serialization.json.c cVar) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = new kotlinx.serialization.json.c(kotlin.collections.b.f());
        } else {
            this.b = cVar;
        }
    }

    public JasonStateNodeDto() {
        this(0);
    }

    public JasonStateNodeDto(int i) {
        kotlinx.serialization.json.c cVar = new kotlinx.serialization.json.c(kotlin.collections.b.f());
        this.a = EmptyList.a;
        this.b = cVar;
    }
}
