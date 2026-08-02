package com.yandex.go.flex.common.descriptors.action;

import com.yandex.go.flex.common.api.actions.GoReloadLabeledSectionsAction;
import com.yandex.go.flex.common.api.actions.p;
import defpackage.crt;
import defpackage.gmt;
import defpackage.mu;
import defpackage.qoi0;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class GoReloadLabeledSectionsActionDescriptorFactoryImpl implements crt {
    public final mu a = new mu("GoReloadLabeledSectionsAction", qoi0.a(GoReloadLabeledSectionsAction.class), new GoReloadLabeledSectionsActionDescriptorFactoryImpl$actionDescriptor$1(0, GoReloadLabeledSectionsAction.Companion, p.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new gmt(10)), EmptyList.a, true);

    @Override // defpackage.nu
    public final mu create() {
        return this.a;
    }
}
