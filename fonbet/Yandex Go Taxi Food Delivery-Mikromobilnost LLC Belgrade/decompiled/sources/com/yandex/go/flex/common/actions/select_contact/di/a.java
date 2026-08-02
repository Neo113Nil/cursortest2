package com.yandex.go.flex.common.actions.select_contact.di;

import com.yandex.go.flex.common.actions.dto.SelectContactAction;
import com.yandex.go.flex.common.actions.dto.e;
import defpackage.c0g;
import defpackage.i6r;
import defpackage.mu;
import defpackage.nu;
import defpackage.qgn0;
import defpackage.qoi0;
import defpackage.r8c0;
import defpackage.taq0;
import defpackage.yaq0;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* loaded from: classes12.dex */
public final /* synthetic */ class a implements nu {
    public final /* synthetic */ yaq0 a;
    public final /* synthetic */ i6r b;
    public final /* synthetic */ taq0 c;
    public final /* synthetic */ qgn0 d;

    public /* synthetic */ a(yaq0 yaq0Var, c0g c0gVar, taq0 taq0Var, qgn0 qgn0Var) {
        this.a = yaq0Var;
        this.b = c0gVar;
        this.c = taq0Var;
        this.d = qgn0Var;
    }

    @Override // defpackage.nu
    public final mu create() {
        return new mu("SelectContactAction", qoi0.a(SelectContactAction.class), new SelectContactDescriptorProviderImpl$create$1$1(0, SelectContactAction.Companion, e.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new r8c0(this.a, this.b, this.c, this.d, 10)), EmptyList.a, false);
    }
}
