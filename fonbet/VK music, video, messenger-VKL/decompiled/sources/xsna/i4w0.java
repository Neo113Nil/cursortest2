package xsna;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.vk.push.common.Logger;
import com.vk.push.core.network.model.ErrorStatus;
import com.vk.push.pushsdk.domain.model.ReceivedBy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.uje0;

/* compiled from: VkpnsHttpMessagesReceiver.kt */
@b6l(c = "com.vk.push.pushsdk.pusher.VkpnsHttpMessagesReceiver$receiveMessages$1", f = "VkpnsHttpMessagesReceiver.kt", l = {49, 50, 66, 68, 111, TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER, 88}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class i4w0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ izs<List<eje0>, s3q0> $onDone;
    final /* synthetic */ List<rst> $requestArguments;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ j4w0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i4w0(j4w0 j4w0Var, List<rst> list, izs<? super List<eje0>, s3q0> izsVar, spj<? super i4w0> spjVar) {
        super(2, spjVar);
        this.this$0 = j4w0Var;
        this.$requestArguments = list;
        this.$onDone = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new i4w0(this.this$0, this.$requestArguments, this.$onDone, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((i4w0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x012f, code lost:
    
        if (r14.b(r13) != r0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0102, code lost:
    
        if (r14.e(r13) == r0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0106, code lost:
    
        r6 = r1;
        r1 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x011a, code lost:
    
        if (r14.d(r13) == r0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x008b, code lost:
    
        if (r14 == r0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x007b, code lost:
    
        if (r14.a(r13) == r0) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0181 A[LOOP:0: B:16:0x017b->B:18:0x0181, LOOP_END] */
    /* JADX WARN: Type inference failed for: r1v10, types: [xsna.ui50] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        izs<List<eje0>, s3q0> izsVar;
        j4w0 j4w0Var;
        izs<List<eje0>, s3q0> izsVar2;
        Throwable th;
        ArrayList arrayList;
        j4w0 j4w0Var2;
        wi50 wi50Var;
        ui50 ui50Var;
        Throwable th2;
        izs<List<eje0>, s3q0> izsVar3;
        Iterator it;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (this.label) {
            case 0:
                kotlin.a.a(obj);
                u8x0 u8x0Var = this.this$0.c;
                this.label = 1;
                break;
            case 1:
                kotlin.a.a(obj);
                q5w0 q5w0Var = this.this$0.b;
                List<rst> list = this.$requestArguments;
                this.label = 2;
                b = q5w0Var.b(list, this);
                break;
            case 2:
                kotlin.a.a(obj);
                b = ((Result) obj).d();
                j4w0 j4w0Var3 = this.this$0;
                izsVar = this.$onDone;
                Throwable a = Result.a(b);
                if (a == null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (uje0 uje0Var : (List) b) {
                        if (uje0Var instanceof uje0.b) {
                            arrayList2.add(uje0Var);
                        } else if (uje0Var instanceof uje0.a) {
                            Logger logger = j4w0Var3.g;
                            StringBuilder sb = new StringBuilder("Push message with error ");
                            uje0.a aVar = (uje0.a) uje0Var;
                            sb.append(aVar.b);
                            Logger.DefaultImpls.warn$default(logger, sb.toString(), null, 2, null);
                            if (aVar.c == ErrorStatus.NOT_FOUND) {
                                Logger.DefaultImpls.warn$default(j4w0Var3.g, "Start invalidate token", null, 2, null);
                                myc0.h(j4w0Var3.e, null, null, new k4w0(j4w0Var3, aVar, null), 3);
                            }
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        u8x0 u8x0Var2 = j4w0Var3.c;
                        this.L$0 = j4w0Var3;
                        this.L$1 = izsVar;
                        this.L$2 = arrayList2;
                        this.label = 4;
                        break;
                    } else {
                        u8x0 u8x0Var3 = j4w0Var3.c;
                        this.L$0 = j4w0Var3;
                        this.L$1 = izsVar;
                        this.L$2 = arrayList2;
                        this.label = 3;
                        break;
                    }
                    j4w0Var2 = r6;
                    wi50Var = j4w0Var2.f;
                    this.L$0 = j4w0Var2;
                    this.L$1 = izsVar;
                    this.L$2 = arrayList;
                    this.L$3 = wi50Var;
                    this.label = 5;
                    break;
                } else {
                    u8x0 u8x0Var4 = j4w0Var3.c;
                    this.L$0 = j4w0Var3;
                    this.L$1 = izsVar;
                    this.L$2 = a;
                    this.label = 7;
                    if (u8x0Var4.d(this) != coroutineSingletons) {
                        j4w0Var = j4w0Var3;
                        izsVar2 = izsVar;
                        th = a;
                        j4w0Var.g.error("Error occurred when receive messages from api", th);
                        izsVar2.invoke(EmptyList.b);
                        return s3q0.a;
                    }
                }
                return coroutineSingletons;
            case 3:
            case 4:
                arrayList = (ArrayList) this.L$2;
                izsVar = (izs) this.L$1;
                j4w0 j4w0Var4 = (j4w0) this.L$0;
                kotlin.a.a(obj);
                j4w0Var2 = j4w0Var4;
                wi50Var = j4w0Var2.f;
                this.L$0 = j4w0Var2;
                this.L$1 = izsVar;
                this.L$2 = arrayList;
                this.L$3 = wi50Var;
                this.label = 5;
                break;
            case 5:
                ?? r1 = (ui50) this.L$3;
                ArrayList arrayList3 = (ArrayList) this.L$2;
                izs<List<eje0>, s3q0> izsVar4 = (izs) this.L$1;
                j4w0Var2 = (j4w0) this.L$0;
                kotlin.a.a(obj);
                wi50Var = r1;
                arrayList = arrayList3;
                izsVar = izsVar4;
                try {
                    if (j4w0Var2.d.d()) {
                        Logger.DefaultImpls.warn$default(j4w0Var2.g, "Pusher messages channel is closed for send", null, 2, null);
                        ui50Var = wi50Var;
                        s3q0 s3q0Var = s3q0.a;
                        ui50Var.c(null);
                        ArrayList arrayList4 = new ArrayList(c5g.u(arrayList, 10));
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                        }
                        izsVar.invoke(c5g.v(arrayList4));
                        return s3q0.a;
                    }
                    nm8 nm8Var = j4w0Var2.d;
                    wje0 wje0Var = new wje0(arrayList, true, ReceivedBy.HTTP);
                    this.L$0 = izsVar;
                    this.L$1 = arrayList;
                    this.L$2 = wi50Var;
                    this.L$3 = null;
                    this.label = 6;
                    if (nm8Var.t(wje0Var, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    ui50Var = wi50Var;
                    izsVar3 = izsVar;
                    izsVar = izsVar3;
                    s3q0 s3q0Var2 = s3q0.a;
                    ui50Var.c(null);
                    ArrayList arrayList42 = new ArrayList(c5g.u(arrayList, 10));
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList42.add(((uje0.b) it.next()).c);
                    }
                    izsVar.invoke(c5g.v(arrayList42));
                    return s3q0.a;
                } catch (Throwable th3) {
                    ui50Var = wi50Var;
                    th2 = th3;
                    ui50Var.c(null);
                    throw th2;
                }
            case 6:
                ui50Var = (ui50) this.L$2;
                arrayList = (ArrayList) this.L$1;
                izsVar3 = (izs) this.L$0;
                try {
                    kotlin.a.a(obj);
                    izsVar = izsVar3;
                    s3q0 s3q0Var22 = s3q0.a;
                    ui50Var.c(null);
                    ArrayList arrayList422 = new ArrayList(c5g.u(arrayList, 10));
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                    }
                    izsVar.invoke(c5g.v(arrayList422));
                    return s3q0.a;
                } catch (Throwable th4) {
                    th2 = th4;
                    ui50Var.c(null);
                    throw th2;
                }
            case 7:
                th = (Throwable) this.L$2;
                izsVar2 = (izs) this.L$1;
                j4w0Var = (j4w0) this.L$0;
                kotlin.a.a(obj);
                j4w0Var.g.error("Error occurred when receive messages from api", th);
                izsVar2.invoke(EmptyList.b);
                return s3q0.a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
