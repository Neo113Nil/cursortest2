package xsna;

import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: CachingPushMessagesReceiver.kt */
/* loaded from: classes5.dex */
public final class uy8<T> implements lsr {
    public final /* synthetic */ bz8 b;

    /* compiled from: CachingPushMessagesReceiver.kt */
    @b6l(c = "com.vk.push.pushsdk.receiver.CachingPushMessagesReceiver$clearUnusedSyns$3", f = "CachingPushMessagesReceiver.kt", l = {Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE}, m = "emit")
    public static final class a extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ uy8<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(uy8<? super T> uy8Var, spj<? super a> spjVar) {
            super(spjVar);
            this.this$0 = uy8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.emit(null, this);
        }
    }

    public uy8(bz8 bz8Var) {
        this.b = bz8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006c A[Catch: all -> 0x0078, LOOP:0: B:13:0x0066->B:15:0x006c, LOOP_END, TryCatch #0 {all -> 0x0078, blocks: (B:12:0x0055, B:13:0x0066, B:15:0x006c, B:17:0x007a, B:18:0x0090, B:20:0x0096, B:22:0x00a2), top: B:11:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0096 A[Catch: all -> 0x0078, LOOP:1: B:18:0x0090->B:20:0x0096, LOOP_END, TryCatch #0 {all -> 0x0078, blocks: (B:12:0x0055, B:13:0x0066, B:15:0x006c, B:17:0x007a, B:18:0x0090, B:20:0x0096, B:22:0x00a2), top: B:11:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.lsr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(List<tle0> list, spj<? super s3q0> spjVar) {
        a aVar;
        int i;
        bz8 bz8Var;
        ui50 ui50Var;
        Iterator<T> it;
        Iterator<T> it2;
        try {
            if (spjVar instanceof a) {
                aVar = (a) spjVar;
                int i2 = aVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.label = i2 - Integer.MIN_VALUE;
                    Object obj = aVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = aVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        bz8Var = this.b;
                        wi50 wi50Var = bz8Var.m;
                        aVar.L$0 = list;
                        aVar.L$1 = wi50Var;
                        aVar.L$2 = bz8Var;
                        aVar.label = 1;
                        if (wi50Var.b(aVar) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ui50Var = wi50Var;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bz8 bz8Var2 = (bz8) aVar.L$2;
                        ui50Var = (ui50) aVar.L$1;
                        List<tle0> list2 = (List) aVar.L$0;
                        kotlin.a.a(obj);
                        bz8Var = bz8Var2;
                        list = list2;
                    }
                    List<tle0> list3 = list;
                    ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                    it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((tle0) it.next()).b);
                    }
                    it2 = izi0.g(bz8Var.o.keySet(), j5g.S0(arrayList)).iterator();
                    while (it2.hasNext()) {
                        bz8Var.o.remove((String) it2.next());
                    }
                    s3q0 s3q0Var = s3q0.a;
                    ui50Var.c(null);
                    return s3q0.a;
                }
            }
            List<tle0> list32 = list;
            ArrayList arrayList2 = new ArrayList(c5g.u(list32, 10));
            it = list32.iterator();
            while (it.hasNext()) {
            }
            it2 = izi0.g(bz8Var.o.keySet(), j5g.S0(arrayList2)).iterator();
            while (it2.hasNext()) {
            }
            s3q0 s3q0Var2 = s3q0.a;
            ui50Var.c(null);
            return s3q0.a;
        } catch (Throwable th) {
            ui50Var.c(null);
            throw th;
        }
        aVar = new a(this, spjVar);
        Object obj2 = aVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
        if (i != 0) {
        }
    }
}
