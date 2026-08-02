package com.yandex.go.suggest.impl.di;

import com.yandex.go.flex.common.api.actions.GoReloadLabeledSectionsAction;
import com.yandex.go.flex.common.api.actions.p;
import defpackage.g3p;
import defpackage.kxl0;
import defpackage.mu;
import defpackage.qhq0;
import defpackage.qoi0;
import defpackage.r2h;
import defpackage.r6s0;
import defpackage.s6s0;
import defpackage.v7p;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* loaded from: classes8.dex */
public final class c implements v7p {
    public final /* synthetic */ int a;
    public final v7p b;

    public /* synthetic */ c(v7p v7pVar, int i) {
        this.a = i;
        this.b = v7pVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        v7p v7pVar = this.b;
        switch (i) {
            case 0:
                r2h r2hVar = (r2h) ((g3p) v7pVar).get();
                return new mu("GoReloadLabeledSectionsAction", qoi0.a(GoReloadLabeledSectionsAction.class), new SuperappSuggestViewModule$Companion$provideFindGoReloadLabeledSectionsActionDescriptor$1(0, GoReloadLabeledSectionsAction.Companion, p.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new qhq0(24, r2hVar)), EmptyList.a, false);
            default:
                s6s0 s6s0Var = (s6s0) ((kxl0) v7pVar).get();
                return new mu("ShowErrorDocument", qoi0.a(r6s0.class), new SuperappSuggestViewModule$Companion$provideShowErrorDocumentActionDescriptor$1(0, r6s0.INSTANCE, r6s0.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new qhq0(25, s6s0Var)), EmptyList.a, false);
        }
    }
}
