package com.yandex.go.slot.dto;

import com.yandex.go.slot.dto.BadgeItemDto;
import defpackage.f9;
import defpackage.lb7;
import defpackage.qoi0;
import defpackage.xqt;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class c extends xqt {
    public static final c e = new c();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, e.INSTANCE.serializer(), qoi0.a(e.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("chat", BadgeItemDto.Chat.Companion.serializer(), qoi0.a(BadgeItemDto.Chat.class)), new f9("text", BadgeItemDto.Text.Companion.serializer(), qoi0.a(BadgeItemDto.Text.class)));
    }
}
