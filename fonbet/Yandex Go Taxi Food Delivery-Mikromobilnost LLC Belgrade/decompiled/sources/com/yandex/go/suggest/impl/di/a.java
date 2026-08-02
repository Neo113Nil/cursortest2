package com.yandex.go.suggest.impl.di;

import com.yandex.go.suggest.impl.data.flex.actions.EnableSearchSectionLoadingStateAction;
import com.yandex.go.suggest.impl.data.flex.actions.PatchSearchRequestResultDataAction;
import com.yandex.go.suggest.impl.data.flex.actions.SubstituteAction;
import com.yandex.go.suggest.impl.data.flex.actions.UpdateSearchSectionsStateAction;
import com.yandex.go.suggest.impl.data.flex.actions.d;
import defpackage.m5v0;
import defpackage.mu;
import defpackage.qhq0;
import defpackage.qoi0;
import defpackage.v7p;
import defpackage.zew0;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* loaded from: classes8.dex */
public final class a implements v7p {
    public final /* synthetic */ int a;
    public final m5v0 b;

    public /* synthetic */ a(m5v0 m5v0Var, int i) {
        this.a = i;
        this.b = m5v0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        m5v0 m5v0Var = this.b;
        switch (i) {
            case 0:
                zew0 zew0Var = (zew0) m5v0Var.get();
                return new mu("EnableSearchSectionLoadingStateAction", qoi0.a(EnableSearchSectionLoadingStateAction.class), new SuperappSuggestViewModule$Companion$provideEnableSearchSectionLoadingStateActionDescriptor$1(0, EnableSearchSectionLoadingStateAction.Companion, com.yandex.go.suggest.impl.data.flex.actions.a.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new qhq0(23, zew0Var)), EmptyList.a, false);
            case 1:
                zew0 zew0Var2 = (zew0) m5v0Var.get();
                return new mu("PatchSearchRequestResultDataAction", qoi0.a(PatchSearchRequestResultDataAction.class), new SuperappSuggestViewModule$Companion$providePatchSearchRequestResultDataAction$1(0, PatchSearchRequestResultDataAction.Companion, com.yandex.go.suggest.impl.data.flex.actions.b.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new qhq0(23, zew0Var2)), EmptyList.a, false);
            case 2:
                zew0 zew0Var3 = (zew0) m5v0Var.get();
                return new mu("SubstituteAction", qoi0.a(SubstituteAction.class), new SuperappSuggestViewModule$Companion$provideSubstituteActionDescriptor$1(0, SubstituteAction.Companion, com.yandex.go.suggest.impl.data.flex.actions.c.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new qhq0(23, zew0Var3)), EmptyList.a, false);
            default:
                zew0 zew0Var4 = (zew0) m5v0Var.get();
                return new mu("UpdateSearchSectionsStateAction", qoi0.a(UpdateSearchSectionsStateAction.class), new SuperappSuggestViewModule$Companion$provideUpdateSearchSectionsStateActionDescriptor$1(0, UpdateSearchSectionsStateAction.Companion, d.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new qhq0(23, zew0Var4)), EmptyList.a, false);
        }
    }
}
