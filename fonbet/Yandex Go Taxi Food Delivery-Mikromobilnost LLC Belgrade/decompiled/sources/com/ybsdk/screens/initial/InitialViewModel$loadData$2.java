package com.ybsdk.screens.initial;

import com.ybsdk.common.InternalSdkState;
import com.ybsdk.common.StartSessionCallSource;
import com.ybsdk.common.entities.SessionApplicationEntity;
import com.ybsdk.core.navigation.cicerone.Screen;
import defpackage.dwv;
import defpackage.em3;
import defpackage.k03;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.tse;
import defpackage.vrp0;
import defpackage.wls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.screens.initial.InitialViewModel$loadData$2", f = "InitialViewModel.kt", l = {207, HProv.PP_AUTH_INFO, 219, 222, 225, 227}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class InitialViewModel$loadData$2 extends SuspendLambda implements wls {
    final /* synthetic */ InternalSdkState $cashedSdkState;
    final /* synthetic */ List<Screen> $targetScreens;
    final /* synthetic */ String $verificationToken;
    Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitialViewModel$loadData$2(InternalSdkState internalSdkState, d dVar, String str, List list, Continuation continuation) {
        super(2, continuation);
        this.$cashedSdkState = internalSdkState;
        this.this$0 = dVar;
        this.$verificationToken = str;
        this.$targetScreens = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InitialViewModel$loadData$2(this.$cashedSdkState, this.this$0, this.$verificationToken, this.$targetScreens, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((InitialViewModel$loadData$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f8, code lost:
    
        if (r8 == r0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0100 A[Catch: Exception -> 0x0015, CancellationException -> 0x0133, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0133, Exception -> 0x0015, blocks: (B:7:0x0010, B:8:0x00fb, B:12:0x0100, B:15:0x010c, B:17:0x0112, B:19:0x0018, B:21:0x0023, B:22:0x00e3, B:23:0x00e6, B:27:0x002c, B:28:0x00cb, B:30:0x00d5, B:33:0x0031, B:34:0x00b2, B:35:0x00b4, B:39:0x0036, B:40:0x006f, B:42:0x0075, B:43:0x007b, B:48:0x0092, B:50:0x0096, B:54:0x0043, B:56:0x0048, B:57:0x0063), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d5 A[Catch: Exception -> 0x0015, CancellationException -> 0x0133, TryCatch #2 {CancellationException -> 0x0133, Exception -> 0x0015, blocks: (B:7:0x0010, B:8:0x00fb, B:12:0x0100, B:15:0x010c, B:17:0x0112, B:19:0x0018, B:21:0x0023, B:22:0x00e3, B:23:0x00e6, B:27:0x002c, B:28:0x00cb, B:30:0x00d5, B:33:0x0031, B:34:0x00b2, B:35:0x00b4, B:39:0x0036, B:40:0x006f, B:42:0x0075, B:43:0x007b, B:48:0x0092, B:50:0x0096, B:54:0x0043, B:56:0x0048, B:57:0x0063), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075 A[Catch: Exception -> 0x0015, CancellationException -> 0x0133, TryCatch #2 {CancellationException -> 0x0133, Exception -> 0x0015, blocks: (B:7:0x0010, B:8:0x00fb, B:12:0x0100, B:15:0x010c, B:17:0x0112, B:19:0x0018, B:21:0x0023, B:22:0x00e3, B:23:0x00e6, B:27:0x002c, B:28:0x00cb, B:30:0x00d5, B:33:0x0031, B:34:0x00b2, B:35:0x00b4, B:39:0x0036, B:40:0x006f, B:42:0x0075, B:43:0x007b, B:48:0x0092, B:50:0x0096, B:54:0x0043, B:56:0x0048, B:57:0x0063), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092 A[Catch: Exception -> 0x0015, CancellationException -> 0x0133, TryCatch #2 {CancellationException -> 0x0133, Exception -> 0x0015, blocks: (B:7:0x0010, B:8:0x00fb, B:12:0x0100, B:15:0x010c, B:17:0x0112, B:19:0x0018, B:21:0x0023, B:22:0x00e3, B:23:0x00e6, B:27:0x002c, B:28:0x00cb, B:30:0x00d5, B:33:0x0031, B:34:0x00b2, B:35:0x00b4, B:39:0x0036, B:40:0x006f, B:42:0x0075, B:43:0x007b, B:48:0x0092, B:50:0x0096, B:54:0x0043, B:56:0x0048, B:57:0x0063), top: B:2:0x0007 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        Object e0;
        Throwable a;
        InternalSdkState internalSdkState;
        r0 r0Var2;
        Object value2;
        k03 k03Var;
        List<SessionApplicationEntity> applications;
        InternalSdkState internalSdkState2;
        List<Screen> list;
        List list2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        try {
        } catch (CancellationException unused) {
        } catch (Exception e) {
            pz40 Y = this.this$0.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, new dwv(e)));
        }
        switch (i) {
            case 0:
                kotlin.b.b(obj);
                InternalSdkState internalSdkState3 = this.$cashedSdkState;
                if (internalSdkState3 != null) {
                    em3 em3Var = this.this$0.I.d;
                    String b = com.ybsdk.common.c.b(internalSdkState3);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(1);
                    linkedHashMap.put("value", b);
                    em3Var.a.a("start_session.has_predefined_value", linkedHashMap);
                }
                d dVar = this.this$0;
                this.label = 1;
                e0 = d.e0(dVar, this);
                if (e0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                a = Result.a(e0);
                if (a != null) {
                    internalSdkState = this.$cashedSdkState;
                    if (internalSdkState == null) {
                        d dVar2 = this.this$0;
                        vrp0 b2 = dVar2.E.b(this.$verificationToken, StartSessionCallSource.InitialScreen.INSTANCE, dVar2.C.a());
                        this.label = 2;
                        obj = kotlinx.coroutines.flow.e.y(b2, this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        internalSdkState = (InternalSdkState) obj;
                    }
                    k03Var = this.this$0.F;
                    applications = internalSdkState.getApplications();
                    this.L$0 = internalSdkState;
                    this.label = 3;
                    if (((com.ybsdk.common.repositiories.applications.b) k03Var).e(applications, this) == coroutineSingletons) {
                        internalSdkState2 = internalSdkState;
                        d dVar3 = this.this$0;
                        dVar3.S.b = internalSdkState2;
                        list = this.$targetScreens;
                        if (list == null) {
                            e eVar = dVar3.W;
                            this.L$0 = internalSdkState2;
                            this.label = 4;
                            obj = eVar.a(this);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            list = (List) obj;
                        }
                        this.this$0.V.getClass();
                        d dVar4 = this.this$0;
                        this.L$0 = null;
                        this.label = 6;
                        obj = d.c0(dVar4, internalSdkState2, list, this);
                        break;
                    } else {
                        return coroutineSingletons;
                    }
                } else {
                    pz40 Y2 = this.this$0.Y();
                    do {
                        r0Var2 = (r0) Y2;
                        value2 = r0Var2.getValue();
                    } while (!r0Var2.k(value2, new dwv(a)));
                    return zy11Var;
                }
            case 1:
                kotlin.b.b(obj);
                e0 = ((Result) obj).getValue();
                a = Result.a(e0);
                if (a != null) {
                }
                break;
            case 2:
                kotlin.b.b(obj);
                internalSdkState = (InternalSdkState) obj;
                k03Var = this.this$0.F;
                applications = internalSdkState.getApplications();
                this.L$0 = internalSdkState;
                this.label = 3;
                if (((com.ybsdk.common.repositiories.applications.b) k03Var).e(applications, this) == coroutineSingletons) {
                }
                break;
            case 3:
                internalSdkState2 = (InternalSdkState) this.L$0;
                kotlin.b.b(obj);
                d dVar32 = this.this$0;
                dVar32.S.b = internalSdkState2;
                list = this.$targetScreens;
                if (list == null) {
                }
                this.this$0.V.getClass();
                d dVar42 = this.this$0;
                this.L$0 = null;
                this.label = 6;
                obj = d.c0(dVar42, internalSdkState2, list, this);
                break;
            case 4:
                internalSdkState2 = (InternalSdkState) this.L$0;
                kotlin.b.b(obj);
                list = (List) obj;
                this.this$0.V.getClass();
                d dVar422 = this.this$0;
                this.L$0 = null;
                this.label = 6;
                obj = d.c0(dVar422, internalSdkState2, list, this);
                break;
            case 5:
                kotlin.b.b(obj);
                list2 = (List) obj;
                if (list2 != null) {
                    return zy11Var;
                }
                boolean dropBackStack = this.this$0.B.getDropBackStack();
                d dVar5 = this.this$0;
                if (dropBackStack) {
                    dVar5.Q.i(list2);
                    return zy11Var;
                }
                dVar5.Q.m(list2);
                return zy11Var;
            case 6:
                kotlin.b.b(obj);
                list2 = (List) obj;
                if (list2 != null) {
                }
                break;
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
