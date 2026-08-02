package com.yandex.go.places.organization.card.impl.ui.card.flex.actions.open_catalog;

import android.view.ViewGroup;
import defpackage.x8c0;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes13.dex */
public final class b implements x8c0 {
    public final /* synthetic */ Ref$BooleanRef a;
    public final /* synthetic */ c b;
    public final /* synthetic */ Ref$ObjectRef c;
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ ViewGroup e;
    public final /* synthetic */ boolean f;

    public b(Ref$BooleanRef ref$BooleanRef, c cVar, Ref$ObjectRef ref$ObjectRef, ViewGroup viewGroup, ViewGroup viewGroup2, boolean z) {
        this.a = ref$BooleanRef;
        this.b = cVar;
        this.c = ref$ObjectRef;
        this.d = viewGroup;
        this.e = viewGroup2;
        this.f = z;
    }

    @Override // defpackage.x8c0
    public final void a() {
        OpenCatalogActionHandler$handle$1.i(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
