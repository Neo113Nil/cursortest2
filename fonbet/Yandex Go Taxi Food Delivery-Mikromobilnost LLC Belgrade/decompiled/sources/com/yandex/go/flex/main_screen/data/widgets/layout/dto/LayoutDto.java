package com.yandex.go.flex.main_screen.data.widgets.layout.dto;

import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/main_screen/data/widgets/layout/dto/LayoutDto;", "", "Companion", "$serializer", "com/yandex/go/flex/main_screen/data/widgets/layout/dto/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutDto {
    public static final b Companion = new b();
    public final EdgeInsetsDto a;

    public /* synthetic */ LayoutDto(int i, EdgeInsetsDto edgeInsetsDto) {
        if (1 == (i & 1)) {
            this.a = edgeInsetsDto;
        } else {
            qje.Z(i, 1, LayoutDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }
}
