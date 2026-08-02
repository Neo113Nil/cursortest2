package com.yandex.messaging.profile;

import com.yandex.messaging.MessengerEnvironment;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p8g;
import defpackage.rnp0;
import defpackage.tse;
import defpackage.v320;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.profile.SdkComponentManager$dispatchComponents$1", f = "SdkComponentManager.kt", l = {35, 36, 37, 38, 40, 50, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE, 64}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class SdkComponentManager$dispatchComponents$1 extends SuspendLambda implements wls {
    final /* synthetic */ v320 $profile;
    Object L$0;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdkComponentManager$dispatchComponents$1(v320 v320Var, h hVar, Continuation continuation) {
        super(2, continuation);
        this.$profile = v320Var;
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SdkComponentManager$dispatchComponents$1(this.$profile, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SdkComponentManager$dispatchComponents$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x015a, code lost:
    
        if (r1 == com.yandex.messaging.MessengerEnvironment.ALPHA) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x012d, code lost:
    
        if (r1 == com.yandex.messaging.MessengerEnvironment.PRODUCTION) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x013f, code lost:
    
        if (r6 != r0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0100, code lost:
    
        if (r1 == com.yandex.messaging.MessengerEnvironment.PRODUCTION) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0112, code lost:
    
        if (r6 != r0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d1, code lost:
    
        if (r1 != com.yandex.messaging.MessengerEnvironment.ALPHA) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e4, code lost:
    
        if (r6 != r0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ad, code lost:
    
        if (r6 == r0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0099, code lost:
    
        if (r6 == r0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0086, code lost:
    
        if (r6 == r0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0073, code lost:
    
        if (r6 == r0) goto L82;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MessengerEnvironment messengerEnvironment;
        boolean z;
        boolean z2;
        boolean z3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z4 = false;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                kotlin.b.b(obj);
                messengerEnvironment = (MessengerEnvironment) ((p8g) this.$profile).i.get();
                h hVar = this.this$0;
                SdkComponentManager$Component sdkComponentManager$Component = SdkComponentManager$Component.CHAT_OPEN;
                boolean z5 = hVar.b.a;
                this.L$0 = messengerEnvironment;
                this.label = 1;
                h.a(hVar, sdkComponentManager$Component, z5, this);
                break;
            case 1:
                messengerEnvironment = (MessengerEnvironment) this.L$0;
                kotlin.b.b(obj);
                h hVar2 = this.this$0;
                SdkComponentManager$Component sdkComponentManager$Component2 = SdkComponentManager$Component.SHARE;
                boolean z6 = hVar2.b.b;
                this.L$0 = messengerEnvironment;
                this.label = 2;
                h.a(hVar2, sdkComponentManager$Component2, z6, this);
                break;
            case 2:
                messengerEnvironment = (MessengerEnvironment) this.L$0;
                kotlin.b.b(obj);
                h hVar3 = this.this$0;
                SdkComponentManager$Component sdkComponentManager$Component3 = SdkComponentManager$Component.DEEPLINK;
                boolean z7 = hVar3.b.c;
                this.L$0 = messengerEnvironment;
                this.label = 3;
                h.a(hVar3, sdkComponentManager$Component3, z7, this);
                break;
            case 3:
                messengerEnvironment = (MessengerEnvironment) this.L$0;
                kotlin.b.b(obj);
                h hVar4 = this.this$0;
                SdkComponentManager$Component sdkComponentManager$Component4 = SdkComponentManager$Component.CALLS;
                boolean z8 = hVar4.b.d;
                this.L$0 = messengerEnvironment;
                this.label = 4;
                h.a(hVar4, sdkComponentManager$Component4, z8, this);
                break;
            case 4:
                messengerEnvironment = (MessengerEnvironment) this.L$0;
                kotlin.b.b(obj);
                h hVar5 = this.this$0;
                SdkComponentManager$Component sdkComponentManager$Component5 = SdkComponentManager$Component.INVITE_LINK_PROD_TEAM;
                int i2 = rnp0.a[hVar5.b.e.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            w511.b();
                            return null;
                        }
                        if (messengerEnvironment != MessengerEnvironment.PRODUCTION_TEAM) {
                            if (messengerEnvironment != MessengerEnvironment.PRODUCTION) {
                                break;
                            }
                        }
                    }
                    z = true;
                    this.L$0 = messengerEnvironment;
                    this.label = 5;
                    h.a(hVar5, sdkComponentManager$Component5, z, this);
                    break;
                }
                z = false;
                this.L$0 = messengerEnvironment;
                this.label = 5;
                h.a(hVar5, sdkComponentManager$Component5, z, this);
            case 5:
                messengerEnvironment = (MessengerEnvironment) this.L$0;
                kotlin.b.b(obj);
                h hVar6 = this.this$0;
                SdkComponentManager$Component sdkComponentManager$Component6 = SdkComponentManager$Component.INVITE_LINK_PROD;
                int i3 = rnp0.a[hVar6.b.e.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            w511.b();
                            return null;
                        }
                        break;
                    }
                    z2 = true;
                    this.L$0 = messengerEnvironment;
                    this.label = 6;
                    h.a(hVar6, sdkComponentManager$Component6, z2, this);
                    break;
                }
                z2 = false;
                this.L$0 = messengerEnvironment;
                this.label = 6;
                h.a(hVar6, sdkComponentManager$Component6, z2, this);
            case 6:
                messengerEnvironment = (MessengerEnvironment) this.L$0;
                kotlin.b.b(obj);
                h hVar7 = this.this$0;
                SdkComponentManager$Component sdkComponentManager$Component7 = SdkComponentManager$Component.PRODLEGAL;
                int i4 = rnp0.a[hVar7.b.e.ordinal()];
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            w511.b();
                            return null;
                        }
                        break;
                    }
                    z3 = true;
                    this.L$0 = messengerEnvironment;
                    this.label = 7;
                    h.a(hVar7, sdkComponentManager$Component7, z3, this);
                    break;
                }
                z3 = false;
                this.L$0 = messengerEnvironment;
                this.label = 7;
                h.a(hVar7, sdkComponentManager$Component7, z3, this);
            case 7:
                messengerEnvironment = (MessengerEnvironment) this.L$0;
                kotlin.b.b(obj);
                h hVar8 = this.this$0;
                SdkComponentManager$Component sdkComponentManager$Component8 = SdkComponentManager$Component.INVITE_LINK_ALPHA;
                int i5 = rnp0.a[hVar8.b.e.ordinal()];
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            w511.b();
                            return null;
                        }
                        break;
                    }
                    z4 = true;
                }
                this.L$0 = null;
                this.label = 8;
                h.a(hVar8, sdkComponentManager$Component8, z4, this);
                return zy11Var == coroutineSingletons ? coroutineSingletons : zy11Var;
            case 8:
                kotlin.b.b(obj);
                return zy11Var;
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
