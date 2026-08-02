package com.yandex.go.places.organization.card.impl.ui.card.flex.actions.open_catalog;

import android.view.ViewGroup;
import defpackage.c9c0;
import defpackage.cvw;
import defpackage.sls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class OpenCatalogActionHandler$handle$1$1$1 extends FunctionReferenceImpl implements sls {
    final /* synthetic */ Ref$ObjectRef<c9c0> $catalogRouter;
    final /* synthetic */ ViewGroup $catalogView;
    final /* synthetic */ ViewGroup $contentContainerParent;
    final /* synthetic */ Ref$BooleanRef $isCatalogClosed;
    final /* synthetic */ boolean $startExpandedState;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenCatalogActionHandler$handle$1$1$1(Ref$BooleanRef ref$BooleanRef, c cVar, Ref$ObjectRef ref$ObjectRef, ViewGroup viewGroup, ViewGroup viewGroup2, boolean z) {
        super(0, 0, cvw.class, "closeCatalog", "invokeSuspend$lambda$0$closeCatalog(Lkotlin/jvm/internal/Ref$BooleanRef;Lcom/yandex/go/places/organization/card/impl/ui/card/flex/actions/open_catalog/OpenCatalogActionHandler;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/view/ViewGroup;Landroid/view/ViewGroup;Z)V");
        this.$isCatalogClosed = ref$BooleanRef;
        this.this$0 = cVar;
        this.$catalogRouter = ref$ObjectRef;
        this.$contentContainerParent = viewGroup;
        this.$catalogView = viewGroup2;
        this.$startExpandedState = z;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        OpenCatalogActionHandler$handle$1.i(this.$isCatalogClosed, this.this$0, this.$catalogRouter, this.$contentContainerParent, this.$catalogView, this.$startExpandedState);
        return zy11.a;
    }
}
