package xsna;

import androidx.compose.runtime.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import xsna.b6l;
import xsna.dcy;
import xsna.lsr;
import xsna.q1a;
import xsna.r2a;
import xsna.s3q0;
import xsna.smk;
import xsna.spj;

/* compiled from: CatalogBlockView.kt */
/* loaded from: classes.dex */
public abstract class m2a<Vs extends r2a, Action extends q1a, Event extends smk> implements k2a {
    public final rfc a;

    /* compiled from: CatalogBlockView.kt */
    @b6l(c = "com.vk.catalog.mvi.block.CatalogBlockViewImpl$Content$typedEvents$1$1", f = "CatalogBlockView.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes16.dex */
    public static final class a extends SuspendLambda implements wzs<smk, spj<? super s3q0>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ m2a<Vs, Action, Event> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m2a<Vs, Action, Event> m2aVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = m2aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.this$0, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(smk smkVar, spj<? super s3q0> spjVar) {
            return ((a) create(smkVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            smk smkVar = (smk) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            this.this$0.a.c(smkVar);
            return s3q0.a;
        }
    }

    public m2a(rfc rfcVar) {
        this.a = rfcVar;
    }

    @Override // xsna.k2a
    public final void a(a8a a8aVar, r2a r2aVar, izs izsVar, ksr ksrVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        a8a a8aVar2;
        int i2;
        r2a r2aVar2;
        izs izsVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1323395608);
        if ((i & 6) == 0) {
            a8aVar2 = a8aVar;
            i2 = (M.J(a8aVar2) ? 4 : 2) | i;
        } else {
            a8aVar2 = a8aVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            r2aVar2 = r2aVar;
            i2 |= M.J(r2aVar2) ? 32 : 16;
        } else {
            r2aVar2 = r2aVar;
        }
        if ((i & 384) == 0) {
            izsVar2 = izsVar;
            i2 |= M.y(izsVar2) ? 256 : 128;
        } else {
            izsVar2 = izsVar;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(ksrVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            q630Var2 = q630Var;
            i2 |= M.J(q630Var2) ? 16384 : 8192;
        } else {
            q630Var2 = q630Var;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1323395608, i2, -1, "com.vk.catalog.mvi.block.CatalogBlockViewImpl.Content (CatalogBlockView.kt:50)");
            }
            boolean z = (i2 & 7168) == 2048;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                final FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(ksrVar, new a(this, null));
                final rfc rfcVar = this.a;
                x = a1q.a(new ksr<Object>() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2

                    /* compiled from: Emitters.kt */
                    /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements lsr {
                        public final /* synthetic */ lsr b;
                        public final /* synthetic */ dcy c;

                        @b6l(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2$2", f = "Transform.kt", l = {50}, m = "emit")
                        /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(spj spjVar) {
                                super(spjVar);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(lsr lsrVar, dcy dcyVar) {
                            this.b = lsrVar;
                            this.c = dcyVar;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                        @Override // xsna.lsr
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, spj spjVar) {
                            AnonymousClass1 anonymousClass1;
                            int i;
                            if (spjVar instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) spjVar;
                                int i2 = anonymousClass1.label;
                                if ((i2 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i2 - Integer.MIN_VALUE;
                                    Object obj2 = anonymousClass1.result;
                                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    i = anonymousClass1.label;
                                    if (i != 0) {
                                        kotlin.a.a(obj2);
                                        if (this.c.c(obj)) {
                                            anonymousClass1.label = 1;
                                            if (this.b.emit(obj, anonymousClass1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        kotlin.a.a(obj2);
                                    }
                                    return s3q0.a;
                                }
                            }
                            anonymousClass1 = new AnonymousClass1(spjVar);
                            Object obj22 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                            }
                            return s3q0.a;
                        }
                    }

                    @Override // xsna.ksr
                    public final Object collect(lsr<? super Object> lsrVar, spj spjVar) {
                        Object collect = FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.this.collect(new AnonymousClass2(lsrVar, rfcVar), spjVar);
                        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
                    }
                });
                M.R(x);
            }
            b(a8aVar2, r2aVar2, izsVar2, ((a1q) x).b(), q630Var2, M, i2 & 517006);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.l(new l2a(this, a8aVar, r2aVar, izsVar, ksrVar, q630Var, i, 0));
        }
    }

    public abstract void b(a8a a8aVar, r2a r2aVar, izs izsVar, ksr ksrVar, q630 q630Var, androidx.compose.runtime.a aVar, int i);

    public m2a(Class<Event> cls) {
        this(fpf0.a(cls));
    }
}
