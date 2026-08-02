package com.yandex.go.places.organization.card.impl.domain.interactors.flex;

import defpackage.eq;
import defpackage.jl40;
import defpackage.k7v;
import defpackage.ki80;
import defpackage.kps0;
import defpackage.li80;
import defpackage.mi80;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltse;", "Lkotlin/Pair;", "", "Lkps0;", "", "<anonymous>", "(Ltse;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.organization.card.impl.domain.interactors.flex.OrganizationCardFlexInteractor$handleOnGalleryClicked$2", f = "OrganizationCardFlexInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OrganizationCardFlexInteractor$handleOnGalleryClicked$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<mi80> $galleryItems;
    final /* synthetic */ k7v $selectedImage;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationCardFlexInteractor$handleOnGalleryClicked$2(List list, k7v k7vVar, Continuation continuation) {
        super(2, continuation);
        this.$galleryItems = list;
        this.$selectedImage = k7vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrganizationCardFlexInteractor$handleOnGalleryClicked$2(this.$galleryItems, this.$selectedImage, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrganizationCardFlexInteractor$handleOnGalleryClicked$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x001d A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        kps0 kps0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        List<mi80> list = this.$galleryItems;
        k7v k7vVar = this.$selectedImage;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = -1;
        for (mi80 mi80Var : list) {
            if (mi80Var instanceof ki80) {
                ki80 ki80Var = (ki80) mi80Var;
                k7v k7vVar2 = ki80Var.a;
                if (ki80Var.b instanceof eq) {
                    if (i2 == -1 && jl40.l(k7vVar2, k7vVar)) {
                        i2 = i;
                    }
                    i++;
                    kps0Var = new kps0(k7vVar2.a, k7vVar2.b, 2);
                    if (kps0Var == null) {
                        arrayList.add(kps0Var);
                    }
                }
            } else if (!(mi80Var instanceof li80)) {
                w511.b();
                return null;
            }
            kps0Var = null;
            if (kps0Var == null) {
            }
        }
        return new Pair(arrayList, new Integer(i2 > 0 ? i2 : 0));
    }
}
