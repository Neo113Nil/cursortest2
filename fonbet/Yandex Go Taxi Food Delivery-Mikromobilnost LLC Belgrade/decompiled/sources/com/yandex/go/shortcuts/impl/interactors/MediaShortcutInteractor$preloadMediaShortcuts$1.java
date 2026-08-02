package com.yandex.go.shortcuts.impl.interactors;

import com.yandex.go.dto.response.Action$MediaStory;
import com.yandex.go.shortcuts.dto.response.ProductMode$Taxi;
import com.yandex.go.shortcuts.dto.response.ProductsResponse;
import defpackage.adc;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.ur60;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.shortcuts.impl.interactors.MediaShortcutInteractor$preloadMediaShortcuts$1", f = "MediaShortcutInteractor.kt", l = {65}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class MediaShortcutInteractor$preloadMediaShortcuts$1 extends SuspendLambda implements wls {
    final /* synthetic */ ProductsResponse $productsResponse;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ g this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.shortcuts.impl.interactors.MediaShortcutInteractor$preloadMediaShortcuts$1$1", f = "MediaShortcutInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.shortcuts.impl.interactors.MediaShortcutInteractor$preloadMediaShortcuts$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ List<Action$MediaStory> $storyActions;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ g this$0;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "com.yandex.go.shortcuts.impl.interactors.MediaShortcutInteractor$preloadMediaShortcuts$1$1$1", f = "MediaShortcutInteractor.kt", l = {67}, m = "invokeSuspend", v = 2)
        /* renamed from: com.yandex.go.shortcuts.impl.interactors.MediaShortcutInteractor$preloadMediaShortcuts$1$1$1, reason: invalid class name and collision with other inner class name */
        final class C00711 extends SuspendLambda implements wls {
            final /* synthetic */ Action$MediaStory $storyAction;
            int label;
            final /* synthetic */ g this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00711(g gVar, Action$MediaStory action$MediaStory, Continuation continuation) {
                super(2, continuation);
                this.this$0 = gVar;
                this.$storyAction = action$MediaStory;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C00711(this.this$0, this.$storyAction, continuation);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                return ((C00711) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.b.b(obj);
                    g gVar = this.this$0;
                    Action$MediaStory action$MediaStory = this.$storyAction;
                    this.label = 1;
                    if (g.d(gVar, action$MediaStory, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List list, g gVar, Continuation continuation) {
            super(2, continuation);
            this.$storyActions = list;
            this.this$0 = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$storyActions, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            tse tseVar = (tse) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            Iterator<Action$MediaStory> it = this.$storyActions.iterator();
            while (it.hasNext()) {
                tje.N(tseVar, null, null, new C00711(this.this$0, it.next(), null), 3);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaShortcutInteractor$preloadMediaShortcuts$1(ProductsResponse productsResponse, g gVar, Continuation continuation) {
        super(2, continuation);
        this.$productsResponse = productsResponse;
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MediaShortcutInteractor$preloadMediaShortcuts$1(this.$productsResponse, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MediaShortcutInteractor$preloadMediaShortcuts$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            it = adc.D(this.$productsResponse.b, ProductMode$Taxi.class).iterator();
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = (Iterator) this.L$0;
            kotlin.b.b(obj);
        }
        while (it.hasNext()) {
            List list = ((ProductMode$Taxi) it.next()).b.a;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((ur60) it2.next()).o);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                Object next = it3.next();
                if (next instanceof Action$MediaStory) {
                    arrayList2.add(next);
                }
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(arrayList2, this.this$0, null);
            this.L$0 = it;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (jl40.O(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11.a;
    }
}
