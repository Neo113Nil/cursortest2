package com.yandex.go.places.impl.ui.discovery.map;

import com.yandex.go.places.impl.domain.interactors.map.f;
import com.yandex.go.places.map.data.repositories.h;
import com.yandex.go.places.map.data.repositories.i;
import com.yandex.go.places.models.domain.entities.map.PlacesMapConfig$PlacesMapScreenName;
import defpackage.fr;
import defpackage.in00;
import defpackage.kn00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.discovery.map.PlacesDiscoveryMapSocialPinsPresenter$handleOnOrganizationPinClick$1", f = "PlacesDiscoveryMapSocialPinsPresenter.kt", l = {390, 392}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PlacesDiscoveryMapSocialPinsPresenter$handleOnOrganizationPinClick$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $id;
    Object L$0;
    boolean Z$0;
    int label;
    final /* synthetic */ d this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lin00;", "selectedPin", "Lzy11;", "<anonymous>", "(Lin00;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.places.impl.ui.discovery.map.PlacesDiscoveryMapSocialPinsPresenter$handleOnOrganizationPinClick$1$1", f = "PlacesDiscoveryMapSocialPinsPresenter.kt", l = {397, 399, 401}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.places.impl.ui.discovery.map.PlacesDiscoveryMapSocialPinsPresenter$handleOnOrganizationPinClick$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ boolean $shouldUseSelectedPinOnly;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d dVar, boolean z, Continuation continuation) {
            super(2, continuation);
            this.this$0 = dVar;
            this.$shouldUseSelectedPinOnly = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$shouldUseSelectedPinOnly, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((in00) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
        
            if (r8.F(r0, r7) == r1) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
        
            if (r8.w(r0, false, r7) == r1) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0032, code lost:
        
            if (r8.g(r7) == r1) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            in00 in00Var = (in00) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                h hVar = this.this$0.E;
                this.L$0 = in00Var;
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            boolean z = this.$shouldUseSelectedPinOnly;
            d dVar = this.this$0;
            if (z) {
                i iVar = dVar.F;
                this.L$0 = null;
                this.label = 2;
            } else {
                i iVar2 = dVar.F;
                this.L$0 = null;
                this.label = 3;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesDiscoveryMapSocialPinsPresenter$handleOnOrganizationPinClick$1(d dVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$id = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlacesDiscoveryMapSocialPinsPresenter$handleOnOrganizationPinClick$1(this.this$0, this.$id, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlacesDiscoveryMapSocialPinsPresenter$handleOnOrganizationPinClick$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0030, code lost:
    
        if (r13 == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            i iVar = this.this$0.F;
            String str = this.$id;
            this.label = 1;
            obj = iVar.h(str, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        kn00 kn00Var = (kn00) obj;
        if (kn00Var != null) {
            boolean b2 = this.this$0.K.b(PlacesMapConfig$PlacesMapScreenName.PLACES_ORGANIZATION_CARD);
            d dVar = this.this$0;
            f fVar = dVar.G;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dVar, b2, null);
            this.L$0 = null;
            this.Z$0 = b2;
            this.label = 2;
            fr action = kn00Var.getAction();
            if (action == null) {
                fVar.getClass();
                b = zy11Var;
            } else {
                b = fVar.b(kn00Var, true, b2, action, anonymousClass1, this);
            }
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11Var;
    }
}
