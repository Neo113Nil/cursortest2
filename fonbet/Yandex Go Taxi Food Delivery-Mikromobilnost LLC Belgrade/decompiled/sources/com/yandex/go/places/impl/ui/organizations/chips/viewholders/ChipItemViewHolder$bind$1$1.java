package com.yandex.go.places.impl.ui.organizations.chips.viewholders;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.yandex.go.places.impl.ui.common.chip.ChipView;
import defpackage.di80;
import defpackage.g16;
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
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.organizations.chips.viewholders.ChipItemViewHolder$bind$1$1", f = "ChipItemViewHolder.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ChipItemViewHolder$bind$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ di80 $data;
    final /* synthetic */ ChipView $this_with;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.places.impl.ui.organizations.chips.viewholders.ChipItemViewHolder$bind$1$1$1", f = "ChipItemViewHolder.kt", l = {41, 43}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.places.impl.ui.organizations.chips.viewholders.ChipItemViewHolder$bind$1$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ di80 $data;
        final /* synthetic */ ChipView $this_with;
        Object L$0;
        int label;
        final /* synthetic */ a this$0;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "com.yandex.go.places.impl.ui.organizations.chips.viewholders.ChipItemViewHolder$bind$1$1$1$1", f = "ChipItemViewHolder.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.yandex.go.places.impl.ui.organizations.chips.viewholders.ChipItemViewHolder$bind$1$1$1$1, reason: invalid class name and collision with other inner class name */
        final class C00601 extends SuspendLambda implements wls {
            final /* synthetic */ Bitmap $image;
            final /* synthetic */ ChipView $this_with;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00601(ChipView chipView, Bitmap bitmap, Continuation continuation) {
                super(2, continuation);
                this.$this_with = chipView;
                this.$image = bitmap;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C00601(this.$this_with, this.$image, continuation);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                C00601 c00601 = (C00601) create((tse) obj, (Continuation) obj2);
                zy11 zy11Var = zy11.a;
                c00601.invokeSuspend(zy11Var);
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
                ChipView chipView = this.$this_with;
                chipView.setSelectedImage(new BitmapDrawable(chipView.getResources(), this.$image));
                return zy11.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, di80 di80Var, ChipView chipView, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$data = di80Var;
            this.$this_with = chipView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$data, this.$this_with, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
        
            if (defpackage.tje.k0(r1, r4, r6) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
        
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
                g16 b = this.this$0.S.b().b(this.$data.f);
                this.label = 1;
                obj = ru.yandex.taxi.utils.a.b(b, this);
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
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                this.this$0.T.getClass();
                sjh sjhVar = uyj.a;
                g6u g6uVar = o400.a;
                C00601 c00601 = new C00601(this.$this_with, bitmap, null);
                this.L$0 = null;
                this.label = 2;
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipItemViewHolder$bind$1$1(a aVar, di80 di80Var, ChipView chipView, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$data = di80Var;
        this.$this_with = chipView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChipItemViewHolder$bind$1$1 chipItemViewHolder$bind$1$1 = new ChipItemViewHolder$bind$1$1(this.this$0, this.$data, this.$this_with, continuation);
        chipItemViewHolder$bind$1$1.L$0 = obj;
        return chipItemViewHolder$bind$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ChipItemViewHolder$bind$1$1 chipItemViewHolder$bind$1$1 = (ChipItemViewHolder$bind$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        chipItemViewHolder$bind$1$1.invokeSuspend(zy11Var);
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
        this.this$0.T.getClass();
        sjh sjhVar = uyj.a;
        com.yandex.go.coroutines.b.g(tseVar, mdh.b, null, new AnonymousClass1(this.this$0, this.$data, this.$this_with, null), 2);
        return zy11.a;
    }
}
