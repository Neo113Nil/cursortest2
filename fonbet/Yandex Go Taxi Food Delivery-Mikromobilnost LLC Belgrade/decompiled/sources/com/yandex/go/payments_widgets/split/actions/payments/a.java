package com.yandex.go.payments_widgets.split.actions.payments;

import com.yandex.go.payments_widgets.split.actions.dto.YbSplitOpenTypedURLAction;
import defpackage.mu;
import defpackage.nu;
import defpackage.oay0;
import defpackage.qoi0;
import defpackage.tm51;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* loaded from: classes8.dex */
public final class a implements nu {
    public final tm51 a;

    public a(tm51 tm51Var) {
        this.a = tm51Var;
    }

    @Override // defpackage.nu
    public final mu create() {
        return new mu("YandexSplitOpenTypedURLAction", qoi0.a(YbSplitOpenTypedURLAction.class), new YandexSplitActionDescriptorFactory$create$1(0, YbSplitOpenTypedURLAction.Companion, com.yandex.go.payments_widgets.split.actions.dto.a.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new oay0(23, this)), EmptyList.a, false);
    }
}
