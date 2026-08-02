package com.yandex.go.flex.common.descriptors.action.factory;

import com.yandex.go.flex.common.api.actions.OpenSettingsAction;
import com.yandex.go.flex.common.api.actions.OpenWebAction;
import com.yandex.go.flex.common.api.actions.d0;
import com.yandex.go.flex.common.api.actions.g0;
import defpackage.csz;
import defpackage.dw;
import defpackage.i970;
import defpackage.mu;
import defpackage.nu;
import defpackage.qoi0;
import defpackage.r2h;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class a implements nu {
    public final /* synthetic */ int a;
    public final mu b;
    public final dw c;

    public a(r2h r2hVar) {
        this.a = 0;
        this.c = r2hVar;
        this.b = new mu("OpenSettingsAction", qoi0.a(OpenSettingsAction.class), new OpenSettingsActionDescriptorFactory$actionDescriptor$1(0, OpenSettingsAction.Companion, d0.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new csz(23, this)), EmptyList.a, false);
    }

    @Override // defpackage.nu
    public final mu create() {
        switch (this.a) {
        }
        return this.b;
    }

    public a(i970 i970Var) {
        this.a = 1;
        this.c = i970Var;
        this.b = new mu("OpenWebAction", qoi0.a(OpenWebAction.class), new OpenWebActionDescriptorFactory$actionDescriptor$1(0, OpenWebAction.Companion, g0.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new csz(24, this)), EmptyList.a, false);
    }
}
