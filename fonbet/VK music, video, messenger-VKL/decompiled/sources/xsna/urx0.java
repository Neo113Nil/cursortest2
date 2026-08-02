package xsna;

import androidx.compose.runtime.Recomposer;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineStart;

/* compiled from: WindowRecomposer.android.kt */
/* loaded from: classes11.dex */
public final class urx0 implements androidx.lifecycle.l {
    public final /* synthetic */ hpj b;
    public final /* synthetic */ gr90 c;
    public final /* synthetic */ Recomposer d;
    public final /* synthetic */ Ref$ObjectRef<ha30> e;

    /* compiled from: WindowRecomposer.android.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: WindowRecomposer.android.kt */
    @b6l(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", l = {379}, m = "invokeSuspend", v = 1)
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ Ref$ObjectRef<ha30> $motionDurationScaleImpl;
        final /* synthetic */ Recomposer $recomposer;
        final /* synthetic */ urx0 $self;
        final /* synthetic */ f5z $source;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Ref$ObjectRef<ha30> ref$ObjectRef, Recomposer recomposer, f5z f5zVar, urx0 urx0Var, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$motionDurationScaleImpl = ref$ObjectRef;
            this.$recomposer = recomposer;
            this.$source = f5zVar;
            this.$self = urx0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.$motionDurationScaleImpl, this.$recomposer, this.$source, this.$self, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.a.a(obj);
                    ha30 ha30Var = this.$motionDurationScaleImpl.element;
                    if (ha30Var != null) {
                        ha30Var.c = zvj.a(this.$recomposer.x);
                    }
                    Recomposer recomposer = this.$recomposer;
                    this.label = 1;
                    recomposer.getClass();
                    Object k = myc0.k(recomposer.a, new androidx.compose.runtime.h(recomposer, new yef0(recomposer, null), i830.a(getContext()), null), this);
                    if (k != obj2) {
                        k = s3q0.a;
                    }
                    if (k != obj2) {
                        k = s3q0.a;
                    }
                    if (k == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                this.$source.getLifecycle().removeObserver(this.$self);
                return s3q0.a;
            } catch (Throwable th) {
                this.$source.getLifecycle().removeObserver(this.$self);
                throw th;
            }
        }
    }

    public urx0(hpj hpjVar, gr90 gr90Var, Recomposer recomposer, Ref$ObjectRef ref$ObjectRef) {
        this.b = hpjVar;
        this.c = gr90Var;
        this.d = recomposer;
        this.e = ref$ObjectRef;
    }

    @Override // androidx.lifecycle.l
    public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
        boolean z;
        kq9<s3q0> kq9Var = null;
        switch (a.$EnumSwitchMapping$0[event.ordinal()]) {
            case 1:
                myc0.h(this.b, null, CoroutineStart.UNDISPATCHED, new b(this.e, this.d, f5zVar, this, null), 1);
                return;
            case 2:
                gr90 gr90Var = this.c;
                if (gr90Var != null) {
                    imy imyVar = gr90Var.c;
                    synchronized (imyVar.b) {
                        try {
                            synchronized (imyVar.b) {
                                z = imyVar.a;
                            }
                            if (!z) {
                                ArrayList arrayList = (ArrayList) imyVar.c;
                                imyVar.c = (ArrayList) imyVar.d;
                                imyVar.d = arrayList;
                                imyVar.a = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((spj) arrayList.get(i)).resumeWith(s3q0.a);
                                }
                                arrayList.clear();
                                s3q0 s3q0Var = s3q0.a;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                Recomposer recomposer = this.d;
                synchronized (recomposer.c) {
                    if (recomposer.t) {
                        recomposer.t = false;
                        kq9Var = recomposer.C();
                    }
                }
                if (kq9Var != null) {
                    ((lq9) kq9Var).resumeWith(s3q0.a);
                    return;
                }
                return;
            case 3:
                Recomposer recomposer2 = this.d;
                synchronized (recomposer2.c) {
                    recomposer2.t = true;
                    s3q0 s3q0Var2 = s3q0.a;
                }
                return;
            case 4:
                this.d.A();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
