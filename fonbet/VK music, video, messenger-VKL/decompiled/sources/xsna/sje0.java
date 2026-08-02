package xsna;

import com.vk.push.common.Logger;
import com.vk.push.core.utils.StringExtensionsKt;
import com.vk.push.pushsdk.domain.model.MessagePriority;
import com.vk.push.pushsdk.domain.model.ReceivedBy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.dje0;
import xsna.eje0;

/* compiled from: PushMessageRepository.kt */
@b6l(c = "com.vk.push.pushsdk.data.repository.PushMessageRepository$insertPushMessagesForToken$2", f = "PushMessageRepository.kt", l = {28, 33, 42}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class sje0 extends SuspendLambda implements izs<spj<? super e790>, Object> {
    final /* synthetic */ List<eje0> $messages;
    final /* synthetic */ ReceivedBy $receivedBy;
    final /* synthetic */ String $token;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ tje0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sje0(tje0 tje0Var, String str, List<eje0> list, ReceivedBy receivedBy, spj<? super sje0> spjVar) {
        super(1, spjVar);
        this.this$0 = tje0Var;
        this.$token = str;
        this.$messages = list;
        this.$receivedBy = receivedBy;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new sje0(this.this$0, this.$token, this.$messages, this.$receivedBy, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super e790> spjVar) {
        return ((sje0) create(spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0081, code lost:
    
        if (r2 == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0042, code lost:
    
        if (r2 == r1) goto L62;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object m;
        Object h;
        e790 e790Var;
        List list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ske0 ske0Var = this.this$0.c;
            String str = this.$token;
            this.label = 1;
            m = ske0Var.m(str, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) this.L$1;
                    e790Var = (e790) this.L$0;
                    kotlin.a.a(obj);
                    Logger.DefaultImpls.debug$default((Logger) this.this$0.d.getValue(), "Saved " + list.size() + " to database", null, 2, null);
                    return e790Var;
                }
                kotlin.a.a(obj);
                h = obj;
                e790Var = (e790) h;
                if (e790Var == null) {
                    Logger.DefaultImpls.warn$default((Logger) this.this$0.d.getValue(), "packageInfo is null by token " + StringExtensionsKt.hideSensitive(this.$token), null, 2, null);
                    return null;
                }
                List<eje0> list2 = this.$messages;
                ReceivedBy receivedBy = this.$receivedBy;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    eje0 eje0Var = (eje0) it.next();
                    long j = e790Var.a;
                    ReceivedBy receivedBy2 = receivedBy;
                    long j2 = eje0Var.a;
                    String str2 = eje0Var.b;
                    MessagePriority messagePriority = eje0Var.c;
                    Integer num = eje0Var.d;
                    int i2 = eje0Var.e;
                    Iterator it2 = it;
                    long j3 = eje0Var.f;
                    String str3 = eje0Var.g;
                    String str4 = eje0Var.h;
                    byte[] bytes = str4 != null ? str4.getBytes(emb.b) : null;
                    eje0.a aVar = eje0Var.i;
                    ArrayList arrayList2 = arrayList;
                    arrayList2.add(new dje0(0L, j, j2, str2, messagePriority, num, i2, Long.valueOf(j3), str3, bytes, new dje0.a(aVar != null ? aVar.a : null, aVar != null ? aVar.b : null, aVar != null ? aVar.c : null, aVar != null ? aVar.d : null, aVar != null ? aVar.e : null, aVar != null ? aVar.f : null, aVar != null ? aVar.g : null, aVar != null ? aVar.h : null), eje0Var.j, 0, receivedBy2));
                    it = it2;
                    arrayList = arrayList2;
                    receivedBy = receivedBy2;
                }
                ArrayList arrayList3 = arrayList;
                fje0 fje0Var = this.this$0.b;
                this.L$0 = e790Var;
                this.L$1 = arrayList3;
                this.label = 3;
                if (fje0Var.e(arrayList3, this) != coroutineSingletons) {
                    list = arrayList3;
                    Logger.DefaultImpls.debug$default((Logger) this.this$0.d.getValue(), "Saved " + list.size() + " to database", null, 2, null);
                    return e790Var;
                }
                return coroutineSingletons;
            }
            kotlin.a.a(obj);
            m = obj;
        }
        if (!((Boolean) m).booleanValue()) {
            Logger.DefaultImpls.warn$default((Logger) this.this$0.d.getValue(), "You are trying to save " + this.$messages.size() + " messages without saved token, probably it expired", null, 2, null);
            return null;
        }
        ske0 ske0Var2 = this.this$0.c;
        String str5 = this.$token;
        this.label = 2;
        h = ske0Var2.h(str5, this);
    }
}
