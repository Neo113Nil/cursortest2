package xsna;

import android.util.Log;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.google.firebase.sessions.DataCollectionState;
import com.google.firebase.sessions.EventType;
import com.google.firebase.sessions.api.SessionSubscriber;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SessionFirelogPublisher.kt */
/* loaded from: classes.dex */
public final class pti0 implements oti0 {
    public static final double f = Math.random();
    public static final /* synthetic */ int g = 0;
    public final vhr a;
    public final uir b;
    public final cyi0 c;
    public final xyp d;
    public final kotlin.coroutines.d e;

    /* compiled from: SessionFirelogPublisher.kt */
    @b6l(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1", f = "SessionFirelogPublisher.kt", l = {69, 70, TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ iti0 $sessionDetails;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(iti0 iti0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$sessionDetails = iti0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return pti0.this.new a(this.$sessionDetails, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x006a, code lost:
        
            if (r2 == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0053, code lost:
        
            if (r2 == r0) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:12:0x00db  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00e0  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x00c3  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object b;
            Object a;
            Object b2;
            vhr vhrVar;
            iti0 iti0Var;
            j6x j6xVar;
            pti0 pti0Var;
            lti0 lti0Var;
            cyi0 cyi0Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                pti0 pti0Var2 = pti0.this;
                this.label = 1;
                b = pti0.b(pti0Var2, this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        cyi0Var = (cyi0) this.L$5;
                        iti0Var = (iti0) this.L$4;
                        vhr vhrVar2 = (vhr) this.L$3;
                        lti0 lti0Var2 = (lti0) this.L$2;
                        pti0 pti0Var3 = (pti0) this.L$1;
                        j6x j6xVar2 = (j6x) this.L$0;
                        kotlin.a.a(obj);
                        j6xVar = j6xVar2;
                        pti0Var = pti0Var3;
                        lti0Var = lti0Var2;
                        vhrVar = vhrVar2;
                        b2 = obj;
                        Map map = (Map) b2;
                        String str = j6xVar.a;
                        String str2 = j6xVar.b;
                        lti0Var.getClass();
                        EventType eventType = EventType.SESSION_START;
                        String str3 = iti0Var.a;
                        String str4 = iti0Var.b;
                        int i2 = iti0Var.c;
                        long j = iti0Var.d;
                        cyi0 cyi0Var2 = cyi0Var;
                        SessionSubscriber sessionSubscriber = (SessionSubscriber) map.get(SessionSubscriber.Name.PERFORMANCE);
                        DataCollectionState dataCollectionState = sessionSubscriber != null ? DataCollectionState.COLLECTION_SDK_NOT_INSTALLED : sessionSubscriber.a() ? DataCollectionState.COLLECTION_ENABLED : DataCollectionState.COLLECTION_DISABLED;
                        SessionSubscriber sessionSubscriber2 = (SessionSubscriber) map.get(SessionSubscriber.Name.CRASHLYTICS);
                        kti0 kti0Var = new kti0(eventType, new wti0(str3, str4, i2, j, new ztk(dataCollectionState, sessionSubscriber2 != null ? DataCollectionState.COLLECTION_SDK_NOT_INSTALLED : sessionSubscriber2.a() ? DataCollectionState.COLLECTION_ENABLED : DataCollectionState.COLLECTION_DISABLED, cyi0Var2.a()), str, str2), lti0.a(vhrVar));
                        int i3 = pti0.g;
                        pti0Var.getClass();
                        try {
                            pti0Var.d.a(kti0Var);
                        } catch (RuntimeException e) {
                            Log.e("SessionFirelogPublisher", "Error logging Session Start event to DataTransport: ", e);
                        }
                        return s3q0.a;
                    }
                    kotlin.a.a(obj);
                    a = obj;
                    j6x j6xVar3 = (j6x) a;
                    pti0 pti0Var4 = pti0.this;
                    lti0 lti0Var3 = lti0.a;
                    vhr vhrVar3 = pti0Var4.a;
                    iti0 iti0Var2 = this.$sessionDetails;
                    cyi0 cyi0Var3 = pti0Var4.c;
                    com.google.firebase.sessions.api.a aVar = com.google.firebase.sessions.api.a.a;
                    this.L$0 = j6xVar3;
                    this.L$1 = pti0Var4;
                    this.L$2 = lti0Var3;
                    this.L$3 = vhrVar3;
                    this.L$4 = iti0Var2;
                    this.L$5 = cyi0Var3;
                    this.label = 3;
                    b2 = aVar.b(this);
                    if (b2 != coroutineSingletons) {
                        vhrVar = vhrVar3;
                        iti0Var = iti0Var2;
                        j6xVar = j6xVar3;
                        pti0Var = pti0Var4;
                        lti0Var = lti0Var3;
                        cyi0Var = cyi0Var3;
                        Map map2 = (Map) b2;
                        String str5 = j6xVar.a;
                        String str22 = j6xVar.b;
                        lti0Var.getClass();
                        EventType eventType2 = EventType.SESSION_START;
                        String str32 = iti0Var.a;
                        String str42 = iti0Var.b;
                        int i22 = iti0Var.c;
                        long j2 = iti0Var.d;
                        cyi0 cyi0Var22 = cyi0Var;
                        SessionSubscriber sessionSubscriber3 = (SessionSubscriber) map2.get(SessionSubscriber.Name.PERFORMANCE);
                        if (sessionSubscriber3 != null) {
                        }
                        SessionSubscriber sessionSubscriber22 = (SessionSubscriber) map2.get(SessionSubscriber.Name.CRASHLYTICS);
                        kti0 kti0Var2 = new kti0(eventType2, new wti0(str32, str42, i22, j2, new ztk(dataCollectionState, sessionSubscriber22 != null ? DataCollectionState.COLLECTION_SDK_NOT_INSTALLED : sessionSubscriber22.a() ? DataCollectionState.COLLECTION_ENABLED : DataCollectionState.COLLECTION_DISABLED, cyi0Var22.a()), str5, str22), lti0.a(vhrVar));
                        int i32 = pti0.g;
                        pti0Var.getClass();
                        pti0Var.d.a(kti0Var2);
                        return s3q0.a;
                    }
                    return coroutineSingletons;
                }
                kotlin.a.a(obj);
                b = obj;
            }
            if (((Boolean) b).booleanValue()) {
                uir uirVar = pti0.this.b;
                this.label = 2;
                a = j6x.c.a(uirVar, this);
            }
            return s3q0.a;
        }
    }

    public pti0(vhr vhrVar, uir uirVar, cyi0 cyi0Var, xyp xypVar, @wv5 kotlin.coroutines.d dVar) {
        this.a = vhrVar;
        this.b = uirVar;
        this.c = cyi0Var;
        this.d = xypVar;
        this.e = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(pti0 pti0Var, ContinuationImpl continuationImpl) {
        qti0 qti0Var;
        int i;
        boolean z;
        Boolean c;
        pti0Var.getClass();
        if (continuationImpl instanceof qti0) {
            qti0Var = (qti0) continuationImpl;
            int i2 = qti0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qti0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = qti0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qti0Var.label;
                z = true;
                if (i != 0) {
                    kotlin.a.a(obj);
                    cyi0 cyi0Var = pti0Var.c;
                    qti0Var.L$0 = pti0Var;
                    qti0Var.label = 1;
                    if (cyi0Var.b(qti0Var) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pti0Var = (pti0) qti0Var.L$0;
                    kotlin.a.a(obj);
                }
                cyi0 cyi0Var2 = pti0Var.c;
                c = cyi0Var2.a.c();
                if (c == null) {
                    z = c.booleanValue();
                } else {
                    Boolean c2 = cyi0Var2.b.c();
                    if (c2 != null) {
                        z = c2.booleanValue();
                    }
                }
                if (z) {
                    return Boolean.FALSE;
                }
                return f <= pti0Var.c.a() ? Boolean.TRUE : Boolean.FALSE;
            }
        }
        qti0Var = new qti0(pti0Var, continuationImpl);
        Object obj2 = qti0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qti0Var.label;
        z = true;
        if (i != 0) {
        }
        cyi0 cyi0Var22 = pti0Var.c;
        c = cyi0Var22.a.c();
        if (c == null) {
        }
        if (z) {
        }
    }

    @Override // xsna.oti0
    public final void a(iti0 iti0Var) {
        myc0.h(zvj.a(this.e), null, null, new a(iti0Var, null), 3);
    }
}
