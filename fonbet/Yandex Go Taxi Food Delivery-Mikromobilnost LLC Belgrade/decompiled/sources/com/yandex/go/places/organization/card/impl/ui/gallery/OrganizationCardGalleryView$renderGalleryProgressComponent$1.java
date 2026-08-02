package com.yandex.go.places.organization.card.impl.ui.gallery;

import com.yandex.go.places.common.ui.gallery.a;
import defpackage.jf80;
import defpackage.lf80;
import defpackage.mi80;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pj80;
import defpackage.scc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.design.StoryProgressComponent;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.organization.card.impl.ui.gallery.OrganizationCardGalleryView$renderGalleryProgressComponent$1", f = "OrganizationCardGalleryView.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class OrganizationCardGalleryView$renderGalleryProgressComponent$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<mi80> $images;
    int label;
    final /* synthetic */ OrganizationCardGalleryView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationCardGalleryView$renderGalleryProgressComponent$1(OrganizationCardGalleryView organizationCardGalleryView, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = organizationCardGalleryView;
        this.$images = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrganizationCardGalleryView$renderGalleryProgressComponent$1(this.this$0, this.$images, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        OrganizationCardGalleryView$renderGalleryProgressComponent$1 organizationCardGalleryView$renderGalleryProgressComponent$1 = (OrganizationCardGalleryView$renderGalleryProgressComponent$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        organizationCardGalleryView$renderGalleryProgressComponent$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        lf80 lf80Var;
        jf80 jf80Var;
        jf80 jf80Var2;
        pj80 onPageChangeCallback;
        jf80 jf80Var3;
        a organizationAutoscrollGalleryController;
        a organizationAutoscrollGalleryController2;
        jf80 jf80Var4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        lf80Var = this.this$0.galleryConfig;
        boolean z = lf80Var.a;
        OrganizationCardGalleryView organizationCardGalleryView = this.this$0;
        if (z) {
            jf80Var3 = organizationCardGalleryView.binding;
            jf80Var3.b.setVisibility(8);
            organizationAutoscrollGalleryController = this.this$0.getOrganizationAutoscrollGalleryController();
            int size = this.$images.size();
            organizationAutoscrollGalleryController.a = size;
            organizationAutoscrollGalleryController.b.setMediaCount(size);
            organizationAutoscrollGalleryController2 = this.this$0.getOrganizationAutoscrollGalleryController();
            organizationAutoscrollGalleryController2.y = true;
            StoryProgressComponent storyProgressComponent = organizationAutoscrollGalleryController2.b;
            storyProgressComponent.setCurrentMedia(0);
            storyProgressComponent.setCurrentMediaProgressPercent(0.0f);
            storyProgressComponent.invalidateComponent();
            organizationAutoscrollGalleryController2.a();
            jf80Var4 = this.this$0.binding;
            jf80Var4.c.setVisibility(0);
        } else {
            jf80Var = organizationCardGalleryView.binding;
            jf80Var.b.setVisibility(0);
            jf80Var2 = this.this$0.binding;
            jf80Var2.c.setVisibility(8);
            onPageChangeCallback = this.this$0.getOnPageChangeCallback();
            int f = scc.f(this.$images);
            onPageChangeCallback.a = f;
            onPageChangeCallback.b.setElementsCount(f + 1);
        }
        return zy11.a;
    }
}
