package xsna;

import com.vk.push.common.AppInfo;
import com.vk.push.core.backoff.BackOff;
import com.vk.push.core.data.repository.IssueKey;
import com.vk.push.core.push.SendPushesResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PushDeliveryComponent.kt */
/* loaded from: classes5.dex */
public final class ghe0<T> implements lsr {
    public final /* synthetic */ nhe0 b;
    public final /* synthetic */ AppInfo c;
    public final /* synthetic */ BackOff d;

    /* compiled from: PushDeliveryComponent.kt */
    @b6l(c = "com.vk.push.pushsdk.delivery.PushDeliveryComponent$handledMessages$3$2", f = "PushDeliveryComponent.kt", l = {141}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ AppInfo $appInfo;
        final /* synthetic */ List<dje0> $expiredPushMessages;
        int label;
        final /* synthetic */ nhe0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(nhe0 nhe0Var, AppInfo appInfo, List<dje0> list, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = nhe0Var;
            this.$appInfo = appInfo;
            this.$expiredPushMessages = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.this$0, this.$appInfo, this.$expiredPushMessages, spjVar);
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
                nhe0 nhe0Var = this.this$0;
                AppInfo appInfo = this.$appInfo;
                List<dje0> list = this.$expiredPushMessages;
                this.label = 1;
                if (nhe0.b(nhe0Var, appInfo, list, this) == coroutineSingletons) {
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

    /* compiled from: PushDeliveryComponent.kt */
    @b6l(c = "com.vk.push.pushsdk.delivery.PushDeliveryComponent$handledMessages$3", f = "PushDeliveryComponent.kt", l = {145, 151}, m = "emit")
    public static final class b extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ ghe0<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(ghe0<? super T> ghe0Var, spj<? super b> spjVar) {
            super(spjVar);
            this.this$0 = ghe0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.emit(null, this);
        }
    }

    public ghe0(nhe0 nhe0Var, AppInfo appInfo, BackOff backOff) {
        this.b = nhe0Var;
        this.c = appInfo;
        this.d = backOff;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d9, code lost:
    
        if (xsna.qsl.b(r14, r0) == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // xsna.lsr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(List<dje0> list, spj<? super s3q0> spjVar) {
        b bVar;
        int i;
        nhe0 nhe0Var;
        Object c;
        ghe0<T> ghe0Var;
        if (spjVar instanceof b) {
            bVar = (b) spjVar;
            int i2 = bVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.label = i2 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    long currentTimeMillis = System.currentTimeMillis();
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<T> it = list.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        nhe0Var = this.b;
                        if (!hasNext) {
                            break;
                        }
                        T next = it.next();
                        Long l = ((dje0) next).h;
                        if (l == null) {
                            nhe0Var.k.nonFatalReport(new IllegalStateException("Expired time of push is null"), IssueKey.EXPIRED_TIME_FIELD_NULL);
                        } else if (l.longValue() - currentTimeMillis < 0) {
                            arrayList2.add(next);
                        }
                        arrayList.add(next);
                    }
                    Pair pair = new Pair(arrayList, arrayList2);
                    List list2 = (List) pair.d();
                    List list3 = (List) pair.g();
                    boolean isEmpty = list3.isEmpty();
                    AppInfo appInfo = this.c;
                    if (!isEmpty) {
                        myc0.h(nhe0Var.b, null, null, new a(nhe0Var, appInfo, list3, null), 3);
                    }
                    bVar.L$0 = this;
                    bVar.label = 1;
                    c = nhe0.c(nhe0Var, appInfo, list2, bVar);
                    if (c != coroutineSingletons) {
                        ghe0Var = this;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return s3q0.a;
                }
                ghe0Var = (ghe0) bVar.L$0;
                kotlin.a.a(obj);
                c = ((Result) obj).d();
                if (c instanceof Result.Failure) {
                    c = null;
                }
                if (c != SendPushesResult.OK) {
                    ghe0Var.d.resetBackOff();
                    return s3q0.a;
                }
                long nextBackOff = ghe0Var.d.getNextBackOff();
                bVar.L$0 = null;
                bVar.label = 2;
            }
        }
        bVar = new b(this, spjVar);
        Object obj2 = bVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bVar.label;
        if (i != 0) {
        }
        if (c instanceof Result.Failure) {
        }
        if (c != SendPushesResult.OK) {
        }
    }
}
