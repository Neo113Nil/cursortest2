package com.yandex.passport.internal.config.template;

import com.yandex.passport.data.network.g6;
import com.yandex.passport.data.network.j6;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpg;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/passport/internal/config/template/c;", "<anonymous>", "(Ltse;)Lcom/yandex/passport/internal/config/template/c;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.config.template.UrlTemplateRepository$onConfigUpdate$2", f = "UrlTemplateRepository.kt", l = {17}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class UrlTemplateRepository$onConfigUpdate$2 extends SuspendLambda implements wls {
    final /* synthetic */ j6 $config;
    int label;
    final /* synthetic */ g this$0;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/yandex/passport/internal/config/template/c;", "it", "<anonymous>", "(Lcom/yandex/passport/internal/config/template/c;)Lcom/yandex/passport/internal/config/template/c;"}, k = 3, mv = {2, 0, 0})
    @mvg(c = "com.yandex.passport.internal.config.template.UrlTemplateRepository$onConfigUpdate$2$1", f = "UrlTemplateRepository.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.yandex.passport.internal.config.template.UrlTemplateRepository$onConfigUpdate$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ j6 $config;
        int label;
        final /* synthetic */ g this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(j6 j6Var, g gVar, Continuation continuation) {
            super(2, continuation);
            this.$config = j6Var;
            this.this$0 = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$config, this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((c) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            j6 j6Var = this.$config;
            if (j6Var == null) {
                return null;
            }
            this.this$0.getClass();
            g6 g6Var = j6Var.a;
            f d = g6Var != null ? g.d(g6Var) : null;
            g6 g6Var2 = j6Var.b;
            return new c(d, g6Var2 != null ? g.d(g6Var2) : null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UrlTemplateRepository$onConfigUpdate$2(j6 j6Var, g gVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$config = j6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UrlTemplateRepository$onConfigUpdate$2(this.$config, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UrlTemplateRepository$onConfigUpdate$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        g gVar = this.this$0;
        tpg tpgVar = gVar.a;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$config, gVar, null);
        this.label = 1;
        Object a = tpgVar.a(anonymousClass1, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
