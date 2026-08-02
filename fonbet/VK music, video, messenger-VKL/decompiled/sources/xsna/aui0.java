package xsna;

import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.firebase.sessions.api.SessionSubscriber;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SessionLifecycleClient.kt */
@b6l(c = "com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1", f = "SessionLifecycleClient.kt", l = {151}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class aui0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ List<Message> $messages;
    int label;
    final /* synthetic */ zti0 this$0;

    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Long.valueOf(((Message) t).getWhen()), Long.valueOf(((Message) t2).getWhen()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aui0(zti0 zti0Var, List<Message> list, spj<? super aui0> spjVar) {
        super(2, spjVar);
        this.this$0 = zti0Var;
        this.$messages = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new aui0(this.this$0, this.$messages, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((aui0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            com.google.firebase.sessions.api.a aVar = com.google.firebase.sessions.api.a.a;
            this.label = 1;
            obj = aVar.b(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        Map map = (Map) obj;
        if (!map.isEmpty()) {
            Collection values = map.values();
            if (!(values instanceof Collection) || !values.isEmpty()) {
                Iterator it = values.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((SessionSubscriber) it.next()).a()) {
                        List<Message> D0 = j5g.D0(new a(), j5g.V(e43.o(zti0.a(this.this$0, this.$messages, 2), zti0.a(this.this$0, this.$messages, 1))));
                        zti0 zti0Var = this.this$0;
                        for (Message message : D0) {
                            Messenger messenger = zti0Var.b;
                            LinkedBlockingDeque<Message> linkedBlockingDeque = zti0Var.c;
                            if (messenger != null) {
                                try {
                                    int i2 = message.what;
                                    messenger.send(message);
                                } catch (RemoteException unused) {
                                    int i3 = message.what;
                                    if (linkedBlockingDeque.offer(message)) {
                                        linkedBlockingDeque.size();
                                    }
                                }
                            } else if (linkedBlockingDeque.offer(message)) {
                                int i4 = message.what;
                                linkedBlockingDeque.size();
                            } else {
                                int i5 = message.what;
                            }
                        }
                    }
                }
            }
        }
        return s3q0.a;
    }
}
