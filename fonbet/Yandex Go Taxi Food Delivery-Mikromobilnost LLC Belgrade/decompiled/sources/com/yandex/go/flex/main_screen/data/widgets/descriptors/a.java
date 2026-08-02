package com.yandex.go.flex.main_screen.data.widgets.descriptors;

import com.yandex.go.flex.main_screen.presentation.actions.OpenInfoListAction;
import defpackage.aa9;
import defpackage.g430;
import defpackage.m19;
import defpackage.mu;
import defpackage.nu;
import defpackage.qoi0;
import defpackage.v7p;
import defpackage.yvf0;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class a implements nu {
    public final /* synthetic */ int a;
    public final v7p b;

    public /* synthetic */ a(v7p v7pVar, int i) {
        this.a = i;
        this.b = v7pVar;
    }

    @Override // defpackage.nu
    public final mu create() {
        int i = this.a;
        v7p v7pVar = this.b;
        switch (i) {
            case 0:
                return new mu("ChangeCurrentAddressAction", qoi0.a(aa9.class), new ChangeCurrentAddressActionDescriptorFactory$create$1(0, aa9.INSTANCE, aa9.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new ChangeCurrentAddressActionDescriptorFactory$create$2(0, (m19) v7pVar, yvf0.class, "get", "get()Ljava/lang/Object;", 0)), EmptyList.a, false);
            default:
                return new mu("OpenInfoListAction", qoi0.a(OpenInfoListAction.class), new OpenInfoListActionDescriptorFactory$create$1(0, OpenInfoListAction.Companion, com.yandex.go.flex.main_screen.presentation.actions.a.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new OpenInfoListActionDescriptorFactory$create$2(0, (g430) v7pVar, yvf0.class, "get", "get()Ljava/lang/Object;", 0)), EmptyList.a, false);
        }
    }
}
