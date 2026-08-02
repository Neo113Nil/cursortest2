package com.yandex.go.places.impl.ui.filters.recycler;

import android.graphics.drawable.BitmapDrawable;
import com.yandex.go.places.impl.ui.common.chip.ChipView;
import defpackage.g6u;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.filters.recycler.OrganizationsFilterBlockViewHolder$setSelectedImage$1", f = "OrganizationsFilterBlockViewHolder.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OrganizationsFilterBlockViewHolder$setSelectedImage$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $imageUrl;
    final /* synthetic */ ChipView $this_setSelectedImage;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.places.impl.ui.filters.recycler.OrganizationsFilterBlockViewHolder$setSelectedImage$1$1", f = "OrganizationsFilterBlockViewHolder.kt", l = {83, 85}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.places.impl.ui.filters.recycler.OrganizationsFilterBlockViewHolder$setSelectedImage$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ String $imageUrl;
        final /* synthetic */ ChipView $this_setSelectedImage;
        Object L$0;
        int label;
        final /* synthetic */ a this$0;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "com.yandex.go.places.impl.ui.filters.recycler.OrganizationsFilterBlockViewHolder$setSelectedImage$1$1$1", f = "OrganizationsFilterBlockViewHolder.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.yandex.go.places.impl.ui.filters.recycler.OrganizationsFilterBlockViewHolder$setSelectedImage$1$1$1, reason: invalid class name and collision with other inner class name */
        final class C00591 extends SuspendLambda implements wls {
            final /* synthetic */ BitmapDrawable $image;
            final /* synthetic */ ChipView $this_setSelectedImage;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00591(ChipView chipView, BitmapDrawable bitmapDrawable, Continuation continuation) {
                super(2, continuation);
                this.$this_setSelectedImage = chipView;
                this.$image = bitmapDrawable;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C00591(this.$this_setSelectedImage, this.$image, continuation);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                C00591 c00591 = (C00591) create((tse) obj, (Continuation) obj2);
                zy11 zy11Var = zy11.a;
                c00591.invokeSuspend(zy11Var);
                return zy11Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                this.$this_setSelectedImage.setSelectedImage(this.$image);
                return zy11.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, String str, ChipView chipView, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$imageUrl = str;
            this.$this_setSelectedImage = chipView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$imageUrl, this.$this_setSelectedImage, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
        
            if (defpackage.tje.k0(r1, r4, r6) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
        
            if (r7 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                e eVar = this.this$0.T;
                String str = this.$imageUrl;
                this.label = 1;
                obj = e.k(eVar, str, null, this, 14);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return zy11.a;
                }
                b.b(obj);
            }
            this.this$0.S.getClass();
            sjh sjhVar = uyj.a;
            g6u g6uVar = o400.a;
            C00591 c00591 = new C00591(this.$this_setSelectedImage, (BitmapDrawable) obj, null);
            this.L$0 = null;
            this.label = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationsFilterBlockViewHolder$setSelectedImage$1(a aVar, String str, ChipView chipView, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$imageUrl = str;
        this.$this_setSelectedImage = chipView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrganizationsFilterBlockViewHolder$setSelectedImage$1 organizationsFilterBlockViewHolder$setSelectedImage$1 = new OrganizationsFilterBlockViewHolder$setSelectedImage$1(this.this$0, this.$imageUrl, this.$this_setSelectedImage, continuation);
        organizationsFilterBlockViewHolder$setSelectedImage$1.L$0 = obj;
        return organizationsFilterBlockViewHolder$setSelectedImage$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        OrganizationsFilterBlockViewHolder$setSelectedImage$1 organizationsFilterBlockViewHolder$setSelectedImage$1 = (OrganizationsFilterBlockViewHolder$setSelectedImage$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        organizationsFilterBlockViewHolder$setSelectedImage$1.invokeSuspend(zy11Var);
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
        b.b(obj);
        this.this$0.S.getClass();
        sjh sjhVar = uyj.a;
        com.yandex.go.coroutines.b.g(tseVar, mdh.b, null, new AnonymousClass1(this.this$0, this.$imageUrl, this.$this_setSelectedImage, null), 2);
        return zy11.a;
    }
}
