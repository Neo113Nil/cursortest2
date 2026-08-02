package androidx.compose.ui.viewinterop;

import defpackage.e530;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zii0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes.dex */
public final class d extends e530 {
    public tls a;
    public final tls b = new tls() { // from class: androidx.compose.ui.viewinterop.BringIntoViewNode$requester$1

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
        @mvg(c = "androidx.compose.ui.viewinterop.BringIntoViewNode$requester$1$1", f = "AndroidViewHolder.android.kt", l = {764}, m = "invokeSuspend", v = 1)
        /* renamed from: androidx.compose.ui.viewinterop.BringIntoViewNode$requester$1$1, reason: invalid class name */
        /* loaded from: classes10.dex */
        final class AnonymousClass1 extends SuspendLambda implements wls {
            final /* synthetic */ zii0 $rect;
            int label;
            final /* synthetic */ d this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(d dVar, zii0 zii0Var, Continuation continuation) {
                super(2, continuation);
                this.this$0 = dVar;
                this.$rect = zii0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.this$0, this.$rect, continuation);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.b.b(obj);
                    d dVar = this.this$0;
                    final zii0 zii0Var = this.$rect;
                    sls slsVar = new sls() { // from class: androidx.compose.ui.viewinterop.BringIntoViewNode.requester.1.1.1
                        {
                            super(0);
                        }

                        @Override // defpackage.sls
                        public final Object invoke() {
                            return zii0.this;
                        }
                    };
                    this.label = 1;
                    if (androidx.compose.ui.relocation.a.a(dVar, slsVar, this) == coroutineSingletons) {
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

        {
            super(1);
        }

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            zii0 zii0Var = (zii0) obj;
            if (d.this.isAttached()) {
                tje.N(d.this.getCoroutineScope(), null, null, new AnonymousClass1(d.this, zii0Var, null), 3);
            }
            return zy11.a;
        }
    };

    public d(tls tlsVar) {
        this.a = tlsVar;
    }

    @Override // defpackage.e530
    public final void onAttach() {
        this.a.invoke(this.b);
    }

    @Override // defpackage.e530
    public final void onDetach() {
        this.a.invoke(null);
    }
}
