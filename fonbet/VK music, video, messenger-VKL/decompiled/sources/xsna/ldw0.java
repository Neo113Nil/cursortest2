package xsna;

import com.vk.log.L;
import java.util.HashMap;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import xsna.ndw0;

/* compiled from: VoipAnalyticsDelegateBase.kt */
/* loaded from: classes11.dex */
public abstract class ldw0<Event extends ndw0> {
    public boolean a;
    public final io.reactivex.rxjava3.disposables.b b = new io.reactivex.rxjava3.disposables.b();
    public final HashMap<io.reactivex.rxjava3.core.q<Event>, io.reactivex.rxjava3.disposables.c> c = new HashMap<>();

    /* compiled from: VoipAnalyticsDelegateBase.kt */
    /* loaded from: classes7.dex */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Event, s3q0> {
        public a(ldw0 ldw0Var) {
            super(1, ldw0Var, ldw0.class, "onEvent", "onEvent(Lcom/vk/voip/analytics/base/VoipAnalyticsEvent;)V", 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.izs
        public final s3q0 invoke(Object obj) {
            ((ldw0) this.receiver).d((ndw0) obj);
            return s3q0.a;
        }
    }

    /* compiled from: VoipAnalyticsDelegateBase.kt */
    /* loaded from: classes7.dex */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        public b(ldw0 ldw0Var) {
            super(1, ldw0Var, ldw0.class, BatchApiRequest.FIELD_NAME_ON_ERROR, "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.C(((ldw0) this.receiver).b(), th);
            return s3q0.a;
        }
    }

    public final synchronized void a(io.reactivex.rxjava3.core.q<Event> qVar) {
        if (this.a) {
            io.reactivex.rxjava3.disposables.c f = io.reactivex.rxjava3.kotlin.c.f(2, qVar, null, new b(this), new a(this));
            this.c.put(qVar, f);
            this.b.b(f);
        }
    }

    public abstract String b();

    public synchronized void c() {
        this.a = true;
    }

    public abstract void d(Event event);

    public synchronized void e() {
        this.c.clear();
        this.b.e();
        this.a = false;
    }
}
