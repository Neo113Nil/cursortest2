package xsna;

import androidx.lifecycle.Lifecycle;
import com.vk.im.ui.fragments.ImSelectContactsFragment;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;
import xsna.zno;

/* compiled from: ImSelectContactsFragment.kt */
@b6l(c = "com.vk.im.ui.fragments.ImSelectContactsFragment$subscribeOnQuerySubject$1", f = "ImSelectContactsFragment.kt", l = {552}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class mcw extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ ImSelectContactsFragment this$0;

    /* compiled from: ImSelectContactsFragment.kt */
    @b6l(c = "com.vk.im.ui.fragments.ImSelectContactsFragment$subscribeOnQuerySubject$1$1", f = "ImSelectContactsFragment.kt", l = {556}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;
        final /* synthetic */ ImSelectContactsFragment this$0;

        /* compiled from: ImSelectContactsFragment.kt */
        /* renamed from: xsna.mcw$a$a, reason: collision with other inner class name */
        public static final class C3338a<T> implements lsr {
            public final /* synthetic */ ImSelectContactsFragment b;

            public C3338a(ImSelectContactsFragment imSelectContactsFragment) {
                this.b = imSelectContactsFragment;
            }

            @Override // xsna.lsr
            public final Object emit(Object obj, spj spjVar) {
                String str = (String) obj;
                com.vk.im.ui.components.contacts.a aVar = this.b.c0;
                if (aVar == null) {
                    aVar = null;
                }
                aVar.a1(str);
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ImSelectContactsFragment imSelectContactsFragment, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = imSelectContactsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                utk0 utk0Var = this.this$0.s0;
                zno.a aVar = zno.c;
                ksr l = rsr.l(kci.e(utk0Var, qsl.e(eoo.f(300L, DurationUnit.MILLISECONDS))));
                C3338a c3338a = new C3338a(this.this$0);
                this.label = 1;
                if (l.collect(c3338a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mcw(ImSelectContactsFragment imSelectContactsFragment, spj<? super mcw> spjVar) {
        super(2, spjVar);
        this.this$0 = imSelectContactsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new mcw(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((mcw) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            f5z viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
            Lifecycle.State state = Lifecycle.State.STARTED;
            a aVar = new a(this.this$0, null);
            this.label = 1;
            if (androidx.lifecycle.u.a(viewLifecycleOwner, state, aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
