package com.yandex.go.inapp_calls.preload;

import com.yandex.go.inapp_calls.repository.InAppCallsFeatureWrapper$State;
import com.yandex.go.inapp_calls.repository.c;
import com.yandex.go.proxyprovision.i;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.jst;
import defpackage.mjv;
import defpackage.mvg;
import defpackage.njv;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.x4e;
import defpackage.xby;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import ru.yandex.taxi.experiments.d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.inapp_calls.preload.InAppCallsFeaturePreloader$onLargestContentfulPaint$1", f = "InAppCallsFeaturePreloader.kt", l = {50, 52, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class InAppCallsFeaturePreloader$onLargestContentfulPaint$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "inAppCallsForceDisabled"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @mvg(c = "com.yandex.go.inapp_calls.preload.InAppCallsFeaturePreloader$onLargestContentfulPaint$1$1", f = "InAppCallsFeaturePreloader.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.inapp_calls.preload.InAppCallsFeaturePreloader$onLargestContentfulPaint$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, continuation);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            return ((AnonymousClass1) create(bool, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z = this.Z$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                b.b(obj);
                return Boolean.valueOf(!z);
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppCallsFeaturePreloader$onLargestContentfulPaint$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InAppCallsFeaturePreloader$onLargestContentfulPaint$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((InAppCallsFeaturePreloader$onLargestContentfulPaint$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d6, code lost:
    
        if (r11.i(r10) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d8, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ac, code lost:
    
        if (r11 == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006d, code lost:
    
        if (r11 == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0055, code lost:
    
        if (kotlinx.coroutines.flow.e.x(r11, r1, r10) == r0) goto L37;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            tpr t = e.t(new i(d.b(this.this$0.f.a)));
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, null);
            this.label = 1;
        } else if (i == 1) {
            b.b(obj);
        } else {
            if (i == 2) {
                b.b(obj);
                InAppCallsFeatureWrapper$State inAppCallsFeatureWrapper$State = (InAppCallsFeatureWrapper$State) obj;
                njv njvVar = this.this$0.e;
                boolean z = inAppCallsFeatureWrapper$State == InAppCallsFeatureWrapper$State.READY;
                njvVar.getClass();
                if (!njv.f) {
                    njv.f = true;
                    mjv mjvVar = njvVar.b;
                    mjvVar.getClass();
                    HashMap hashMap = new HashMap();
                    mjvVar.a.a("InAppCalls.LoadingStatus.Check", hashMap, 1, x4e.r(z, hashMap, "installed"));
                }
                if (inAppCallsFeatureWrapper$State == InAppCallsFeatureWrapper$State.NOT_LOADED) {
                    a aVar = this.this$0;
                    this.L$0 = null;
                    this.label = 3;
                    obj = a.d(aVar, this);
                }
                return zy11.a;
            }
            if (i != 3) {
                if (i != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                a aVar2 = this.this$0;
                aVar2.h.setValue(aVar2, a.j[0], Boolean.TRUE);
                return zy11.a;
            }
            b.b(obj);
            boolean booleanValue = ((Boolean) obj).booleanValue();
            a aVar3 = this.this$0;
            if (!booleanValue) {
                aVar3.e.getClass();
                xby.l(jst.e, "InAppCalls.Error.Prefetch", null, null, "Error on prefetch", 6);
                return zy11.a;
            }
            aVar3.e.k("Prefetch", "Start", new Pair[0]);
            c cVar = (c) this.this$0.d.get();
            this.L$0 = null;
            this.label = 4;
        }
        g c = ((c) this.this$0.d.get()).c();
        this.label = 2;
        obj = e.y(c, this);
    }
}
