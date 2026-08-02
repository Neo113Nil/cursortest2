package com.yandex.go.inapp_calls.navigation;

import defpackage.fkv;
import defpackage.g8e;
import defpackage.hkv;
import defpackage.ljv;
import defpackage.mjv;
import defpackage.mvg;
import defpackage.njv;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.inapp_calls.navigation.InAppOutgoingCallRouterImpl$downloadAndLaunchInAppCall$1$closeWithResult$1", f = "InAppOutgoingCallRouterImpl.kt", l = {208, 213, 215}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class InAppOutgoingCallRouterImpl$downloadAndLaunchInAppCall$1$closeWithResult$1 extends SuspendLambda implements wls {
    final /* synthetic */ hkv $payload;
    boolean Z$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppOutgoingCallRouterImpl$downloadAndLaunchInAppCall$1$closeWithResult$1(f fVar, hkv hkvVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$payload = hkvVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InAppOutgoingCallRouterImpl$downloadAndLaunchInAppCall$1$closeWithResult$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((InAppOutgoingCallRouterImpl$downloadAndLaunchInAppCall$1$closeWithResult$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c5, code lost:
    
        if (com.yandex.go.inapp_calls.navigation.f.Q(r1, r9, r14) == r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0129, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0127, code lost:
    
        if (((com.yandex.go.inapp_calls.ui.permission.a) r1.J.get()).a(new defpackage.tkv(), new defpackage.tkv(), r14) == r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007a, code lost:
    
        if (r15 == r0) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c8  */
    /* JADX WARN: Type inference failed for: r2v8, types: [tkv] */
    /* JADX WARN: Type inference failed for: r4v2, types: [tkv] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        final int i2 = 1;
        if (i == 0) {
            kotlin.b.b(obj);
            a = ((com.yandex.go.permission.b) this.this$0.I.a).a(14);
            if (!a) {
                njv njvVar = this.this$0.K;
                hkv hkvVar = this.$payload;
                fkv fkvVar = hkvVar.a;
                String str = fkvVar != null ? fkvVar.a : null;
                String str2 = hkvVar.d.b;
                mjv mjvVar = njvVar.b;
                if (str == null) {
                    str = "";
                }
                mjvVar.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("forwarding_id", str);
                hashMap.put("linkage_id", str2);
                mjvVar.a.a("InAppCalls.Permissions.Requested", hashMap, 2, new HashMap());
                com.yandex.go.inapp_calls.interactor.permissions.a aVar = this.this$0.I;
                this.Z$0 = a;
                this.label = 1;
                obj = ((com.yandex.go.permission.b) aVar.a).d(14, this);
            }
            final f fVar = this.this$0;
            final hkv hkvVar2 = this.$payload;
            if (a) {
                this.Z$0 = a;
                this.label = 3;
                njv njvVar2 = fVar.K;
                ljv ljvVar = njvVar2.e;
                ((AtomicBoolean) ljvVar.b).set(true);
                final int i3 = 0;
                ((njv) ljvVar.c).k((String) ljvVar.a, "Show", new Pair[0]);
                fkv fkvVar2 = hkvVar2.a;
                String str3 = fkvVar2 != null ? fkvVar2.a : null;
                String str4 = hkvVar2.d.b;
                mjv mjvVar2 = njvVar2.b;
                String str5 = str3 != null ? str3 : "";
                mjvVar2.getClass();
                HashMap hashMap2 = new HashMap();
                hashMap2.put("forwarding_id", str5);
                hashMap2.put("linkage_id", str4);
                mjvVar2.a.a("InAppCalls.PermissionsSettingsDialog.Shown", hashMap2, 2, new HashMap());
            } else {
                this.Z$0 = a;
                this.label = 2;
            }
        } else {
            if (i != 1) {
                if (i == 2 || i == 3) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        Boolean bool = (Boolean) obj;
        boolean booleanValue = bool.booleanValue();
        njv njvVar3 = this.this$0.K;
        hkv hkvVar3 = this.$payload;
        fkv fkvVar3 = hkvVar3.a;
        String str6 = fkvVar3 != null ? fkvVar3.a : null;
        String str7 = hkvVar3.d.b;
        mjv mjvVar3 = njvVar3.b;
        if (str6 == null) {
            str6 = "";
        }
        mjvVar3.getClass();
        HashMap hashMap3 = new HashMap();
        hashMap3.put("forwarding_id", str6);
        hashMap3.put("linkage_id", str7);
        mjvVar3.a.a("InAppCalls.Permissions.Received", hashMap3, 2, g8e.v(hashMap3, "is_granted", bool));
        a = booleanValue;
        final f fVar2 = this.this$0;
        final hkv hkvVar22 = this.$payload;
        if (a) {
        }
    }
}
