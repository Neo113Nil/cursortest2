package com.yandex.go.places.impl.ui.search.viewholder;

import defpackage.g6u;
import defpackage.jl40;
import defpackage.msy0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.og10;
import defpackage.qg10;
import defpackage.sg10;
import defpackage.sjh;
import defpackage.tls;
import defpackage.tse;
import defpackage.ug10;
import defpackage.uyj;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.design.ListItemComponent;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.search.viewholder.SearchItemViewHolder$bind$2", f = "SearchItemViewHolder.kt", l = {65, 67}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SearchItemViewHolder$bind$2 extends SuspendLambda implements wls {
    final /* synthetic */ msy0 $titleTextResult;
    final /* synthetic */ ListItemComponent $typedView;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.places.impl.ui.search.viewholder.SearchItemViewHolder$bind$2$1", f = "SearchItemViewHolder.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.places.impl.ui.search.viewholder.SearchItemViewHolder$bind$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ ug10 $mediaTextResult;
        final /* synthetic */ ListItemComponent $typedView;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ListItemComponent listItemComponent, ug10 ug10Var, Continuation continuation) {
            super(2, continuation);
            this.$typedView = listItemComponent;
            this.$mediaTextResult = ug10Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$typedView, this.$mediaTextResult, continuation);
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
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            this.$typedView.setTitle(((sg10) this.$mediaTextResult).a);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchItemViewHolder$bind$2(msy0 msy0Var, a aVar, ListItemComponent listItemComponent, Continuation continuation) {
        super(2, continuation);
        this.$titleTextResult = msy0Var;
        this.this$0 = aVar;
        this.$typedView = listItemComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SearchItemViewHolder$bind$2(this.$titleTextResult, this.this$0, this.$typedView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SearchItemViewHolder$bind$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if (defpackage.tje.k0(r1, r4, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002c, code lost:
    
        if (r7 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tls tlsVar = this.$titleTextResult.b;
            this.label = 1;
            obj = tlsVar.invoke(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        ug10 ug10Var = (ug10) obj;
        if (ug10Var instanceof sg10) {
            this.this$0.V.getClass();
            sjh sjhVar = uyj.a;
            g6u g6uVar = o400.a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$typedView, ug10Var, null);
            this.L$0 = null;
            this.label = 2;
        } else if (!(ug10Var instanceof qg10) && !jl40.l(ug10Var, og10.a)) {
            w511.b();
            return null;
        }
        return zy11.a;
    }
}
