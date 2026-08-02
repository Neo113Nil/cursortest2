package xsna;

import com.vk.push.common.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.zje0;

/* compiled from: VkpnsContinuousMessagesReceiver.kt */
/* loaded from: classes5.dex */
public final class h4w0 implements zje0 {
    public final j4w0 a;
    public final long b;
    public final int c;
    public final ske0 d;
    public final don0 e;
    public final wi50 f;
    public final hpj g;
    public final Logger h;
    public final CopyOnWriteArraySet<zje0.a> i;
    public volatile boolean j;

    /* compiled from: VkpnsContinuousMessagesReceiver.kt */
    @b6l(c = "com.vk.push.pushsdk.pusher.VkpnsContinuousMessagesReceiver$startReceiveMessages$1", f = "VkpnsContinuousMessagesReceiver.kt", l = {49, 51}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = h4w0.this.new a(spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
        
            if (xsna.qsl.b(r4, r6) != r0) goto L7;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004f -> B:6:0x0013). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            yvj yvjVar;
            yvj yvjVar2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                yvjVar = (yvj) this.L$0;
                if (zvj.f(yvjVar)) {
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yvjVar2 = (yvj) this.L$0;
                    kotlin.a.a(obj);
                    yvjVar = yvjVar2;
                    if (zvj.f(yvjVar)) {
                        return s3q0.a;
                    }
                    h4w0 h4w0Var = h4w0.this;
                    this.L$0 = yvjVar;
                    this.label = 1;
                    if (h4w0.i(h4w0Var, this) != coroutineSingletons) {
                        yvjVar2 = yvjVar;
                        zvj.e(yvjVar2);
                        long j = h4w0.this.b;
                        this.L$0 = yvjVar2;
                        this.label = 2;
                    }
                    return coroutineSingletons;
                }
                yvjVar2 = (yvj) this.L$0;
                kotlin.a.a(obj);
                zvj.e(yvjVar2);
                long j2 = h4w0.this.b;
                this.L$0 = yvjVar2;
                this.label = 2;
            }
        }
    }

    public h4w0(Logger logger, j4w0 j4w0Var, long j, ske0 ske0Var, don0 don0Var) {
        bdn bdnVar = bdn.a;
        wgl wglVar = wgl.c;
        this.a = j4w0Var;
        this.b = j;
        this.c = 10;
        this.d = ske0Var;
        this.e = don0Var;
        this.f = bay.a();
        this.g = zvj.a(wglVar);
        this.h = logger.createLogger("VkpnsContinuousMessagesReceiver");
        this.i = new CopyOnWriteArraySet<>();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(2:19|(2:21|22)(2:23|(1:25)))|12|13|14))|33|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002e, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        r4.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        r4.f.c(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005f, code lost:
    
        r4.h.error("Error while receiving messages", r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(h4w0 h4w0Var, ContinuationImpl continuationImpl) {
        d4w0 d4w0Var;
        int i;
        h4w0Var.getClass();
        if (continuationImpl instanceof d4w0) {
            d4w0Var = (d4w0) continuationImpl;
            int i2 = d4w0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d4w0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = d4w0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = d4w0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (!h4w0Var.f.f()) {
                        return s3q0.a;
                    }
                    e4w0 e4w0Var = new e4w0(h4w0Var);
                    d4w0Var.L$0 = h4w0Var;
                    d4w0Var.label = 1;
                    Object j = h4w0Var.j(e4w0Var, d4w0Var);
                    h4w0Var = j;
                    if (j == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h4w0 h4w0Var2 = (h4w0) d4w0Var.L$0;
                    kotlin.a.a(obj);
                    h4w0Var = h4w0Var2;
                }
                return s3q0.a;
            }
        }
        d4w0Var = new d4w0(h4w0Var, continuationImpl);
        Object obj2 = d4w0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = d4w0Var.label;
        if (i != 0) {
        }
        return s3q0.a;
    }

    @Override // xsna.zje0
    public final void a() {
        if (this.j) {
            this.j = false;
            Logger.DefaultImpls.debug$default(this.h, "Pause receive messages from https", null, 2, null);
            this.a.getClass();
            iyx.d(this.g.b);
            try {
                this.f.c(null);
            } catch (IllegalStateException unused) {
            }
        }
    }

    @Override // xsna.zje0
    public final void b(sj80 sj80Var) {
        this.i.add(sj80Var);
    }

    @Override // xsna.zje0
    public final b9f0<wje0> d() {
        return this.a.d;
    }

    @Override // xsna.zje0
    public final void e() {
        if (this.j) {
            this.j = false;
            Logger.DefaultImpls.debug$default(this.h, "Stop receive messages from https", null, 2, null);
            this.a.e();
            try {
                this.f.c(null);
            } catch (IllegalStateException unused) {
            }
            try {
                zvj.c(this.g, null);
            } catch (IllegalStateException unused2) {
            }
        }
    }

    @Override // xsna.zje0
    public final void g() {
        if (this.j) {
            return;
        }
        this.j = true;
        Logger.DefaultImpls.debug$default(this.h, "Start receive messages from https", null, 2, null);
        myc0.h(this.g, new vvj("receive-messages-coroutine"), null, new a(null), 2);
    }

    @Override // xsna.zje0
    public final void h(sj80 sj80Var) {
        this.i.remove(sj80Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d4, code lost:
    
        if (r1 == r3) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r4v12, types: [xsna.izs] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00d4 -> B:11:0x00d7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(e4w0 e4w0Var, ContinuationImpl continuationImpl) {
        f4w0 f4w0Var;
        int i;
        e4w0 e4w0Var2;
        Object n;
        h4w0 h4w0Var;
        List list;
        List arrayList;
        izs izsVar;
        h4w0 h4w0Var2;
        Iterator it;
        if (continuationImpl instanceof f4w0) {
            f4w0Var = (f4w0) continuationImpl;
            int i2 = f4w0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f4w0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = f4w0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = f4w0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    f4w0Var.L$0 = this;
                    e4w0Var2 = e4w0Var;
                    f4w0Var.L$1 = e4w0Var2;
                    f4w0Var.label = 1;
                    n = this.d.n(f4w0Var);
                    if (n != coroutineSingletons) {
                        h4w0Var = this;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    ?? r4 = (izs) f4w0Var.L$1;
                    h4w0Var = (h4w0) f4w0Var.L$0;
                    kotlin.a.a(obj);
                    n = obj;
                    e4w0Var2 = r4;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    tle0 tle0Var = (tle0) f4w0Var.L$4;
                    it = (Iterator) f4w0Var.L$3;
                    arrayList = (List) f4w0Var.L$2;
                    izsVar = (izs) f4w0Var.L$1;
                    h4w0Var2 = (h4w0) f4w0Var.L$0;
                    kotlin.a.a(obj);
                    Long l = (Long) obj;
                    arrayList.add(new rst(tle0Var.b, tle0Var.a, l != null ? l.longValue() : 0L, h4w0Var2.c));
                    if (it.hasNext()) {
                        Logger.DefaultImpls.debug$default(h4w0Var2.h, "Receiving messages with " + arrayList.size() + " requests", null, 2, null);
                        j4w0 j4w0Var = h4w0Var2.a;
                        myc0.h(j4w0Var.e, null, null, new i4w0(j4w0Var, arrayList, new g4w0(izsVar), null), 3);
                        return s3q0.a;
                    }
                    tle0Var = (tle0) it.next();
                    don0 don0Var = h4w0Var2.e;
                    String str = tle0Var.b;
                    f4w0Var.L$0 = h4w0Var2;
                    f4w0Var.L$1 = izsVar;
                    f4w0Var.L$2 = arrayList;
                    f4w0Var.L$3 = it;
                    f4w0Var.L$4 = tle0Var;
                    f4w0Var.label = 2;
                    obj = don0Var.c(str, f4w0Var);
                }
                list = (List) n;
                if (!list.isEmpty()) {
                    Logger.DefaultImpls.warn$default(h4w0Var.h, "There are no push tokens in database to start push requests", null, 2, null);
                    e4w0Var2.invoke(EmptyList.b);
                    return s3q0.a;
                }
                arrayList = new ArrayList();
                Logger.DefaultImpls.debug$default(h4w0Var.h, "Start receive messages for " + list.size() + " tokens", null, 2, null);
                izsVar = e4w0Var2;
                h4w0Var2 = h4w0Var;
                it = list.iterator();
                if (it.hasNext()) {
                }
            }
        }
        f4w0Var = new f4w0(this, continuationImpl);
        Object obj2 = f4w0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = f4w0Var.label;
        if (i != 0) {
        }
        list = (List) n;
        if (!list.isEmpty()) {
        }
    }
}
