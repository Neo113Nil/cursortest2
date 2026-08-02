package xsna;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.uxpolls.dto.UxpollsAnswerDto;
import com.vk.api.generated.uxpolls.dto.UxpollsGetResponseDto;
import com.vk.uxpolls.api.models.UxPollsAnswer;
import com.vk.uxpolls.api.models.UxPollsGetResponse;
import com.vk.uxpolls.api.models.UxPollsInteractEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.z5r0;

/* compiled from: VkUxPollsApiImpl.kt */
/* loaded from: classes18.dex */
public final class jyv0 implements p4r0 {
    public final myc0 a;
    public final bpn0 b = new bpn0(new dqm0(8));

    /* compiled from: VkUxPollsApiImpl.kt */
    @b6l(c = "com.vk.feature.uxpolls.api.VkUxPollsApiImpl$answer$1", f = "VkUxPollsApiImpl.kt", l = {65}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super Boolean>, Object> {
        final /* synthetic */ List<UxPollsAnswer> $answers;
        final /* synthetic */ int $pollId;
        final /* synthetic */ String $trigger;
        final /* synthetic */ blq0 $userData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(blq0 blq0Var, int i, String str, List<UxPollsAnswer> list, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$userData = blq0Var;
            this.$pollId = i;
            this.$trigger = str;
            this.$answers = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return jyv0.this.new a(this.$userData, this.$pollId, this.$trigger, this.$answers, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super Boolean> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                z5r0 z5r0Var = (z5r0) jyv0.this.b.getValue();
                long j = this.$userData.a;
                int i2 = this.$pollId;
                String str = this.$trigger;
                List<UxPollsAnswer> list = this.$answers;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (UxPollsAnswer uxPollsAnswer : list) {
                    arrayList.add(new UxpollsAnswerDto(uxPollsAnswer.e(), uxPollsAnswer.d(), uxPollsAnswer.f()));
                }
                this.$userData.getClass();
                ufx c = z5r0Var.c(j, i2, str, arrayList, null);
                this.label = 1;
                obj = we7.d(c, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return Boolean.valueOf(obj == BaseBoolIntDto.YES);
        }
    }

    /* compiled from: VkUxPollsApiImpl.kt */
    @b6l(c = "com.vk.feature.uxpolls.api.VkUxPollsApiImpl$get$1", f = "VkUxPollsApiImpl.kt", l = {36}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super UxPollsGetResponse>, Object> {
        final /* synthetic */ e4e0 $projectContext;
        final /* synthetic */ List<String> $triggers;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e4e0 e4e0Var, List<String> list, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$projectContext = e4e0Var;
            this.$triggers = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return jyv0.this.new b(this.$projectContext, this.$triggers, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super UxPollsGetResponse> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                z5r0 z5r0Var = (z5r0) jyv0.this.b.getValue();
                e4e0 e4e0Var = this.$projectContext;
                long j = e4e0Var.c.a;
                String str = e4e0Var.a;
                String str2 = e4e0Var.b;
                String e = jyv0.this.a.e();
                this.$projectContext.c.getClass();
                ufx b = z5r0Var.b(j, str, str2, e, this.$triggers);
                this.label = 1;
                obj = we7.d(b, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return sdi.m((UxpollsGetResponseDto) obj);
        }
    }

    /* compiled from: VkUxPollsApiImpl.kt */
    @b6l(c = "com.vk.feature.uxpolls.api.VkUxPollsApiImpl$getById$1", f = "VkUxPollsApiImpl.kt", l = {46}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super UxPollsGetResponse>, Object> {
        final /* synthetic */ List<Long> $ids;
        final /* synthetic */ e4e0 $projectContext;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e4e0 e4e0Var, List<Long> list, spj<? super c> spjVar) {
            super(2, spjVar);
            this.$projectContext = e4e0Var;
            this.$ids = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return jyv0.this.new c(this.$projectContext, this.$ids, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super UxPollsGetResponse> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                z5r0 z5r0Var = (z5r0) jyv0.this.b.getValue();
                long j = this.$projectContext.c.a;
                List<Long> list = this.$ids;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Integer((int) ((Number) it.next()).longValue()));
                }
                e4e0 e4e0Var = this.$projectContext;
                xy2 a = z5r0.a.a(z5r0Var, j, arrayList, e4e0Var.a, e4e0Var.b, jyv0.this.a.e(), null, 992);
                this.label = 1;
                obj = we7.d(a, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return sdi.m((UxpollsGetResponseDto) obj);
        }
    }

    /* compiled from: VkUxPollsApiImpl.kt */
    @b6l(c = "com.vk.feature.uxpolls.api.VkUxPollsApiImpl$interact$1", f = "VkUxPollsApiImpl.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements wzs<yvj, spj<? super Boolean>, Object> {
        final /* synthetic */ UxPollsInteractEvent $event;
        final /* synthetic */ Integer $pollId;
        final /* synthetic */ e4e0 $projectContext;
        final /* synthetic */ String $trigger;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e4e0 e4e0Var, String str, UxPollsInteractEvent uxPollsInteractEvent, Integer num, spj<? super d> spjVar) {
            super(2, spjVar);
            this.$projectContext = e4e0Var;
            this.$trigger = str;
            this.$event = uxPollsInteractEvent;
            this.$pollId = num;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return jyv0.this.new d(this.$projectContext, this.$trigger, this.$event, this.$pollId, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super Boolean> spjVar) {
            return ((d) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            xy2 d;
            Object d2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                z5r0 z5r0Var = (z5r0) jyv0.this.b.getValue();
                long j = this.$projectContext.c.a;
                String str = this.$trigger;
                String i2 = this.$event.i();
                e4e0 e4e0Var = this.$projectContext;
                String str2 = e4e0Var.a;
                String str3 = e4e0Var.b;
                Integer num = this.$pollId;
                e4e0Var.c.getClass();
                d = z5r0Var.d(j, str, i2, str2, (r29 & 16) != 0 ? null : str3, num, (r29 & 64) != 0 ? null : null, null, null, null, null, (r29 & 2048) != 0 ? null : null, (r29 & 4096) != 0 ? null : null);
                this.label = 1;
                d2 = we7.d(d, this);
                if (d2 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                d2 = obj;
            }
            return Boolean.valueOf(d2 == BaseOkResponseDto.OK);
        }
    }

    public jyv0(myc0 myc0Var) {
        this.a = myc0Var;
    }

    @Override // xsna.p4r0
    public final UxPollsGetResponse a(List<Long> list, e4e0 e4e0Var) {
        return (UxPollsGetResponse) myc0.i(EmptyCoroutineContext.b, new c(e4e0Var, list, null));
    }

    @Override // xsna.p4r0
    public final UxPollsGetResponse b(List<String> list, e4e0 e4e0Var) {
        return (UxPollsGetResponse) myc0.i(EmptyCoroutineContext.b, new b(e4e0Var, list, null));
    }

    @Override // xsna.p4r0
    public final boolean c(UxPollsInteractEvent uxPollsInteractEvent, Integer num, String str, e4e0 e4e0Var) {
        return ((Boolean) myc0.i(EmptyCoroutineContext.b, new d(e4e0Var, str, uxPollsInteractEvent, num, null))).booleanValue();
    }

    @Override // xsna.p4r0
    public final boolean d(blq0 blq0Var, int i, String str, List<UxPollsAnswer> list) {
        return ((Boolean) myc0.i(EmptyCoroutineContext.b, new a(blq0Var, i, str, list, null))).booleanValue();
    }
}
