package androidx.compose.foundation.text.input.internal;

import android.view.View;
import com.yandex.messaging.domain.poll.PollMessageDraft;
import defpackage.bvf0;
import defpackage.g0w;
import defpackage.h0w;
import defpackage.hwc0;
import defpackage.hyu0;
import defpackage.iez;
import defpackage.lz40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pay;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.v9y;
import defpackage.wls;
import defpackage.x5;
import defpackage.zy11;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lhwc0;", "", "<anonymous>", "(Lhwc0;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {HProv.PP_DELETE_KEYSET}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class AndroidLegacyPlatformTextInputServiceAdapter$startInput$2 extends SuspendLambda implements wls {
    final /* synthetic */ tls $initializeRequest;
    final /* synthetic */ v9y $node;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {149}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ hwc0 $$this$launchTextInputSession;
        final /* synthetic */ tls $initializeRequest;
        final /* synthetic */ v9y $node;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ a this$0;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
        @mvg(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {PollMessageDraft.MAX_ANSWER_LENGTH, 141}, m = "invokeSuspend", v = 1)
        /* renamed from: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1, reason: invalid class name and collision with other inner class name */
        final class C00021 extends SuspendLambda implements wls {
            final /* synthetic */ g0w $inputMethodManager;
            int label;
            final /* synthetic */ a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00021(a aVar, g0w g0wVar, Continuation continuation) {
                super(2, continuation);
                this.this$0 = aVar;
                this.$inputMethodManager = g0wVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C00021(this.this$0, this.$inputMethodManager, continuation);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                return ((C00021) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
            
                if (kotlinx.coroutines.flow.n0.m((kotlinx.coroutines.flow.n0) r7, r1, r6) == r0) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
            
                if (defpackage.jl40.z(get_context()).v(new defpackage.gm5(1, r7), r6) == r0) goto L17;
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
                    iez iezVar = new iez(11);
                    this.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        ny61.A();
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                lz40 k = this.this$0.k();
                if (k == null) {
                    return zy11.a;
                }
                x5 x5Var = new x5(21, this.$inputMethodManager);
                this.label = 2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(hwc0 hwc0Var, tls tlsVar, a aVar, v9y v9yVar, Continuation continuation) {
            super(2, continuation);
            this.$$this$launchTextInputSession = hwc0Var;
            this.$initializeRequest = tlsVar;
            this.this$0 = aVar;
            this.$node = v9yVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$launchTextInputSession, this.$initializeRequest, this.this$0, this.$node, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.b.b(obj);
                    tse tseVar = (tse) this.L$0;
                    tls tlsVar = d.a;
                    View view = ((androidx.compose.ui.platform.d) this.$$this$launchTextInputSession).a;
                    ((LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1) tlsVar).getClass();
                    h0w h0wVar = new h0w(view);
                    pay payVar = new pay(((androidx.compose.ui.platform.d) this.$$this$launchTextInputSession).a, new AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1(this.$node), h0wVar);
                    if (hyu0.a) {
                        tje.N(tseVar, null, null, new C00021(this.this$0, h0wVar, null), 3);
                    }
                    tls tlsVar2 = this.$initializeRequest;
                    if (tlsVar2 != null) {
                        tlsVar2.invoke(payVar);
                    }
                    this.this$0.c = payVar;
                    hwc0 hwc0Var = this.$$this$launchTextInputSession;
                    this.label = 1;
                    if (((androidx.compose.ui.platform.d) hwc0Var).a(payVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th) {
                this.this$0.c = null;
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidLegacyPlatformTextInputServiceAdapter$startInput$2(tls tlsVar, a aVar, v9y v9yVar, Continuation continuation) {
        super(2, continuation);
        this.$initializeRequest = tlsVar;
        this.this$0 = aVar;
        this.$node = v9yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AndroidLegacyPlatformTextInputServiceAdapter$startInput$2 androidLegacyPlatformTextInputServiceAdapter$startInput$2 = new AndroidLegacyPlatformTextInputServiceAdapter$startInput$2(this.$initializeRequest, this.this$0, this.$node, continuation);
        androidLegacyPlatformTextInputServiceAdapter$startInput$2.L$0 = obj;
        return androidLegacyPlatformTextInputServiceAdapter$startInput$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AndroidLegacyPlatformTextInputServiceAdapter$startInput$2) create((hwc0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((hwc0) this.L$0, this.$initializeRequest, this.this$0, this.$node, null);
            this.label = 1;
            if (bvf0.n(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        ny61.A();
        return null;
    }
}
