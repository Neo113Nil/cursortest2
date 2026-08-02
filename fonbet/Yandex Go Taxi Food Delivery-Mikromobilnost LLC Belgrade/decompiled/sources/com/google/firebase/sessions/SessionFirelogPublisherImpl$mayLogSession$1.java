package com.google.firebase.sessions;

import android.util.Log;
import com.google.firebase.sessions.api.SessionSubscriber$Name;
import defpackage.e3w;
import defpackage.gfo;
import defpackage.gzq0;
import defpackage.hcr;
import defpackage.i211;
import defpackage.j211;
import defpackage.jeo;
import defpackage.jzq0;
import defpackage.kzq0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p2f;
import defpackage.pzn;
import defpackage.s59;
import defpackage.tse;
import defpackage.uzq0;
import defpackage.wls;
import defpackage.wng;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl$mayLogSession$1", f = "SessionFirelogPublisher.kt", l = {70, 71, HProv.ALG_SID_SHA3_224}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SessionFirelogPublisherImpl$mayLogSession$1 extends SuspendLambda implements wls {
    final /* synthetic */ gzq0 $sessionDetails;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionFirelogPublisherImpl$mayLogSession$1(c cVar, gzq0 gzq0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$sessionDetails = gzq0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SessionFirelogPublisherImpl$mayLogSession$1(this.this$0, this.$sessionDetails, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SessionFirelogPublisherImpl$mayLogSession$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0066, code lost:
    
        if (r2 == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x004f, code lost:
    
        if (r2 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00b1  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        Object a2;
        e3w e3wVar;
        c cVar;
        kzq0 kzq0Var;
        gzq0 gzq0Var;
        Object b;
        com.google.firebase.a aVar;
        com.google.firebase.sessions.settings.b bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar2 = this.this$0;
            this.label = 1;
            a = c.a(cVar2, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bVar = (com.google.firebase.sessions.settings.b) this.L$5;
                    gzq0 gzq0Var2 = (gzq0) this.L$4;
                    aVar = (com.google.firebase.a) this.L$3;
                    kzq0Var = (kzq0) this.L$2;
                    cVar = (c) this.L$1;
                    e3w e3wVar2 = (e3w) this.L$0;
                    kotlin.b.b(obj);
                    gzq0Var = gzq0Var2;
                    e3wVar = e3wVar2;
                    b = obj;
                    Map map = (Map) b;
                    String str = e3wVar.a;
                    String str2 = e3wVar.b;
                    kzq0Var.getClass();
                    EventType eventType = EventType.SESSION_START;
                    String str3 = gzq0Var.a;
                    String str4 = gzq0Var.b;
                    int i2 = gzq0Var.c;
                    long j = gzq0Var.d;
                    p2f p2fVar = (p2f) map.get(SessionSubscriber$Name.PERFORMANCE);
                    DataCollectionState dataCollectionState = p2fVar != null ? DataCollectionState.COLLECTION_SDK_NOT_INSTALLED : p2fVar.a.c() ? DataCollectionState.COLLECTION_ENABLED : DataCollectionState.COLLECTION_DISABLED;
                    com.google.firebase.sessions.settings.b bVar2 = bVar;
                    p2f p2fVar2 = (p2f) map.get(SessionSubscriber$Name.CRASHLYTICS);
                    jzq0 jzq0Var = new jzq0(eventType, new uzq0(str3, str4, i2, j, new wng(dataCollectionState, p2fVar2 != null ? DataCollectionState.COLLECTION_SDK_NOT_INSTALLED : p2fVar2.a.c() ? DataCollectionState.COLLECTION_ENABLED : DataCollectionState.COLLECTION_DISABLED, bVar2.a()), str, str2), kzq0.a(aVar));
                    int i3 = c.g;
                    cVar.getClass();
                    try {
                        gfo gfoVar = cVar.d;
                        ((j211) ((i211) gfoVar.a.get())).a("FIREBASE_APPQUALITY_SESSION", new pzn("json"), new s59(gfoVar)).b(jeo.f(jzq0Var));
                    } catch (RuntimeException e) {
                        Log.e("FirebaseSessions", "Error logging Session Start event to DataTransport: ", e);
                    }
                    return zy11.a;
                }
                kotlin.b.b(obj);
                a2 = obj;
                e3wVar = (e3w) a2;
                cVar = this.this$0;
                kzq0Var = kzq0.a;
                com.google.firebase.a aVar2 = cVar.a;
                gzq0Var = this.$sessionDetails;
                com.google.firebase.sessions.settings.b bVar3 = cVar.c;
                com.google.firebase.sessions.api.a aVar3 = com.google.firebase.sessions.api.a.a;
                this.L$0 = e3wVar;
                this.L$1 = cVar;
                this.L$2 = kzq0Var;
                this.L$3 = aVar2;
                this.L$4 = gzq0Var;
                this.L$5 = bVar3;
                this.label = 3;
                b = aVar3.b(this);
                if (b != coroutineSingletons) {
                    aVar = aVar2;
                    bVar = bVar3;
                    Map map2 = (Map) b;
                    String str5 = e3wVar.a;
                    String str22 = e3wVar.b;
                    kzq0Var.getClass();
                    EventType eventType2 = EventType.SESSION_START;
                    String str32 = gzq0Var.a;
                    String str42 = gzq0Var.b;
                    int i22 = gzq0Var.c;
                    long j2 = gzq0Var.d;
                    p2f p2fVar3 = (p2f) map2.get(SessionSubscriber$Name.PERFORMANCE);
                    if (p2fVar3 != null) {
                    }
                    com.google.firebase.sessions.settings.b bVar22 = bVar;
                    p2f p2fVar22 = (p2f) map2.get(SessionSubscriber$Name.CRASHLYTICS);
                    jzq0 jzq0Var2 = new jzq0(eventType2, new uzq0(str32, str42, i22, j2, new wng(dataCollectionState, p2fVar22 != null ? DataCollectionState.COLLECTION_SDK_NOT_INSTALLED : p2fVar22.a.c() ? DataCollectionState.COLLECTION_ENABLED : DataCollectionState.COLLECTION_DISABLED, bVar22.a()), str5, str22), kzq0.a(aVar));
                    int i32 = c.g;
                    cVar.getClass();
                    gfo gfoVar2 = cVar.d;
                    ((j211) ((i211) gfoVar2.a.get())).a("FIREBASE_APPQUALITY_SESSION", new pzn("json"), new s59(gfoVar2)).b(jeo.f(jzq0Var2));
                    return zy11.a;
                }
                return coroutineSingletons;
            }
            kotlin.b.b(obj);
            a = obj;
        }
        if (((Boolean) a).booleanValue()) {
            hcr hcrVar = this.this$0.b;
            this.label = 2;
            a2 = e3w.c.a(hcrVar, this);
        }
        return zy11.a;
    }
}
