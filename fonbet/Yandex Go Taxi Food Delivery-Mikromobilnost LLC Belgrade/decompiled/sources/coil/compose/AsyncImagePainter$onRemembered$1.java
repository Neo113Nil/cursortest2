package coil.compose;

import android.graphics.drawable.Drawable;
import coil.view.Precision;
import coil.view.Scale;
import defpackage.aph;
import defpackage.bev;
import defpackage.ddf;
import defpackage.ea3;
import defpackage.ga3;
import defpackage.hev;
import defpackage.jdi0;
import defpackage.jl40;
import defpackage.mhe;
import defpackage.mvg;
import defpackage.n9o;
import defpackage.nev;
import defpackage.nhe;
import defpackage.ny61;
import defpackage.qav;
import defpackage.ryh;
import defpackage.sls;
import defpackage.sx21;
import defpackage.tls;
import defpackage.tse;
import defpackage.u3v0;
import defpackage.v41;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 9, 0})
@mvg(c = "coil.compose.AsyncImagePainter$onRemembered$1", f = "AsyncImagePainter.kt", l = {307}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class AsyncImagePainter$onRemembered$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ d this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lhev;", "it", "Lha3;", "<anonymous>", "(Lhev;)Lha3;"}, k = 3, mv = {1, 9, 0})
    @mvg(c = "coil.compose.AsyncImagePainter$onRemembered$1$2", f = "AsyncImagePainter.kt", l = {306}, m = "invokeSuspend")
    /* renamed from: coil.compose.AsyncImagePainter$onRemembered$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(d dVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((hev) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            d dVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                hev hevVar = (hev) this.L$0;
                d dVar2 = this.this$0;
                qav qavVar = (qav) dVar2.M.getValue();
                d dVar3 = this.this$0;
                dVar3.getClass();
                bev F = hev.F(hevVar);
                F.d = new ryh(22, dVar3);
                F.l();
                aph aphVar = hevVar.G;
                if (aphVar.a == null) {
                    F.x = new ddf(21, dVar3);
                    F.l();
                }
                if (aphVar.b == null) {
                    nhe nheVar = dVar3.H;
                    jdi0 jdi0Var = sx21.b;
                    F.y = jl40.l(nheVar, mhe.b) ? true : jl40.l(nheVar, mhe.e) ? Scale.FIT : Scale.FILL;
                }
                if (aphVar.e != Precision.EXACT) {
                    F.i = Precision.INEXACT;
                }
                hev d = F.d();
                this.L$0 = dVar2;
                this.label = 1;
                obj = ((coil.c) qavVar).c(d, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                dVar = dVar2;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dVar = (d) this.L$0;
                kotlin.b.b(obj);
            }
            nev nevVar = (nev) obj;
            tls tlsVar = d.N;
            dVar.getClass();
            if (nevVar instanceof u3v0) {
                u3v0 u3v0Var = (u3v0) nevVar;
                return new ga3(dVar.k(u3v0Var.a), u3v0Var);
            }
            if (!(nevVar instanceof n9o)) {
                w511.b();
                return null;
            }
            n9o n9oVar = (n9o) nevVar;
            Drawable drawable = n9oVar.a;
            return new ea3(drawable != null ? dVar.k(drawable) : null, n9oVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncImagePainter$onRemembered$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AsyncImagePainter$onRemembered$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AsyncImagePainter$onRemembered$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            final d dVar = this.this$0;
            kotlinx.coroutines.flow.internal.g I = kotlinx.coroutines.flow.e.I(androidx.compose.runtime.f.o(new sls() { // from class: coil.compose.AsyncImagePainter$onRemembered$1.1
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    return (hev) d.this.L.getValue();
                }
            }), new AnonymousClass2(this.this$0, null));
            v41 v41Var = new v41(1, this.this$0);
            this.label = 1;
            if (I.collect(v41Var, this) == coroutineSingletons) {
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
