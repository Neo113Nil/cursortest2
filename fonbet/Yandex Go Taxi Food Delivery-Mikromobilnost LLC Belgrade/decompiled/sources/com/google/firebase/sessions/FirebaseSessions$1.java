package com.google.firebase.sessions;

import android.util.Log;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p2f;
import defpackage.qje;
import defpackage.tse;
import defpackage.wls;
import defpackage.yhl;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.google.firebase.sessions.FirebaseSessions$1", f = "FirebaseSessions.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class FirebaseSessions$1 extends SuspendLambda implements wls {
    final /* synthetic */ SessionsActivityLifecycleCallbacks $sessionsActivityLifecycleCallbacks;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseSessions$1(a aVar, SessionsActivityLifecycleCallbacks sessionsActivityLifecycleCallbacks, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$sessionsActivityLifecycleCallbacks = sessionsActivityLifecycleCallbacks;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FirebaseSessions$1(this.this$0, this.$sessionsActivityLifecycleCallbacks, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FirebaseSessions$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0063, code lost:
    
        if (r6.b(r5) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0065, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0028, code lost:
    
        if (r6 == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            kotlin.b.b(obj);
            com.google.firebase.sessions.api.a aVar = com.google.firebase.sessions.api.a.a;
            this.label = 1;
            obj = aVar.b(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                com.google.firebase.sessions.settings.b bVar = this.this$0.b;
                Boolean c = bVar.a.c();
                if (c != null) {
                    z = c.booleanValue();
                } else {
                    Boolean c2 = bVar.b.c();
                    if (c2 != null) {
                        z = c2.booleanValue();
                    }
                }
                if (z) {
                    com.google.firebase.a aVar2 = this.this$0.a;
                    yhl yhlVar = new yhl(27);
                    aVar2.a();
                    aVar2.j.add(yhlVar);
                } else {
                    qje.e(Log.d("FirebaseSessions", "Sessions SDK disabled. Not listening to lifecycle events."));
                }
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        Collection values = ((Map) obj).values();
        if (!(values instanceof Collection) || !values.isEmpty()) {
            Iterator it = values.iterator();
            while (it.hasNext()) {
                if (((p2f) it.next()).a.c()) {
                    com.google.firebase.sessions.settings.b bVar2 = this.this$0.b;
                    this.label = 2;
                }
            }
        }
        qje.e(Log.d("FirebaseSessions", "No Sessions subscribers. Not listening to lifecycle events."));
        return zy11.a;
    }
}
