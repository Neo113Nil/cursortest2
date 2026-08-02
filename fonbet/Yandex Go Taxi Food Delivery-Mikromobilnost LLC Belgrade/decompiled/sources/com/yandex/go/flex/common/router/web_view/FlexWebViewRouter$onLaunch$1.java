package com.yandex.go.flex.common.router.web_view;

import defpackage.ab60;
import defpackage.bnr;
import defpackage.d82;
import defpackage.dg41;
import defpackage.enr;
import defpackage.fnr;
import defpackage.gym;
import defpackage.io60;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pne;
import defpackage.qu;
import defpackage.scg;
import defpackage.tse;
import defpackage.u5o;
import defpackage.ua41;
import defpackage.wls;
import defpackage.wui;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.am.AuthType;
import ru.yandex.taxi.am.o;
import ru.yandex.taxi.widget.progress.SimpleSpinnerModalView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.flex.common.router.web_view.FlexWebViewRouter$onLaunch$1", f = "FlexWebViewRouter.kt", l = {83}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class FlexWebViewRouter$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ fnr $payload;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexWebViewRouter$onLaunch$1(b bVar, fnr fnrVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$payload = fnrVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FlexWebViewRouter$onLaunch$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FlexWebViewRouter$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:0|1|(1:2)|(1:(2:5|6)(2:53|54))(3:55|56|(2:58|(1:60)(1:61))(15:62|9|10|11|(1:15)|16|(1:18)(2:31|(2:40|41))|19|20|(1:22)|23|24|(1:26)(1:30)|27|28))|7|8|9|10|11|(2:13|15)|16|(0)(0)|19|20|(0)|23|24|(0)(0)|27|28|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0077, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0073, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0074, code lost:
    
        r15 = r0;
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c4, code lost:
    
        defpackage.jst.e.k(r15, "FlexWebViewRouter can`t get api state");
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cb, code lost:
    
        r15 = r1.Q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cd, code lost:
    
        if (r15 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cf, code lost:
    
        r15.dismiss();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d2, code lost:
    
        r1.Q = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080 A[Catch: all -> 0x0073, CancellationException -> 0x0077, TryCatch #5 {CancellationException -> 0x0077, all -> 0x0073, blocks: (B:10:0x0066, B:13:0x006c, B:15:0x0070, B:16:0x007c, B:18:0x0080, B:19:0x009f, B:31:0x0085, B:34:0x008a, B:36:0x008e, B:40:0x0099, B:41:0x009e), top: B:9:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085 A[Catch: all -> 0x0073, CancellationException -> 0x0077, TryCatch #5 {CancellationException -> 0x0077, all -> 0x0073, blocks: (B:10:0x0066, B:13:0x006c, B:15:0x0070, B:16:0x007c, B:18:0x0080, B:19:0x009f, B:31:0x0085, B:34:0x008a, B:36:0x008e, B:40:0x0099, B:41:0x009e), top: B:9:0x0066 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.yandex.go.flex.common.router.web_view.b, int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        fnr fnrVar;
        b bVar;
        ua41 ua41Var;
        b bVar2;
        b bVar3;
        SimpleSpinnerModalView simpleSpinnerModalView;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.label;
        enr enrVar = null;
        try {
            try {
            } catch (Throwable th) {
                SimpleSpinnerModalView simpleSpinnerModalView2 = r1.Q;
                if (simpleSpinnerModalView2 != null) {
                    simpleSpinnerModalView2.dismiss();
                }
                r1.Q = null;
                throw th;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th2) {
            Throwable th3 = th2;
            b bVar4 = r1;
        }
        if (r1 == 0) {
            kotlin.b.b(obj);
            b bVar5 = this.this$0;
            fnr fnrVar2 = this.$payload;
            bVar5.Q = bVar5.J.b(new d82(1));
            AuthType authType = fnrVar2.b;
            if (authType == null) {
                fnrVar = fnrVar2;
                bVar = bVar5;
                ua41Var = null;
                bVar3 = bVar5;
                AuthType authType2 = fnrVar.b;
                String str = fnrVar.a;
                if (ua41Var != null && !(ua41Var instanceof u5o)) {
                    boolean z = ua41Var instanceof ab60;
                }
                if (!(ua41Var instanceof pne)) {
                    str = ((pne) ua41Var).a;
                } else if (!(ua41Var instanceof io60) && !(ua41Var instanceof u5o) && !jl40.l(ua41Var, ab60.a) && ua41Var != null) {
                    throw new NoWhenBranchMatchedException();
                }
                FlexWebApi a = ((bnr) bVar3.I).a(fnrVar.c, fnrVar.d, new gym(bVar3));
                enr enrVar2 = new enr(str, a, bVar3.Q(str, a, fnrVar));
                simpleSpinnerModalView = bVar.Q;
                if (simpleSpinnerModalView != null) {
                    simpleSpinnerModalView.dismiss();
                }
                bVar.Q = null;
                enrVar = enrVar2;
                b bVar6 = this.this$0;
                if (enrVar == null) {
                    bVar6.r(new qu(9));
                } else {
                    bVar6.getClass();
                    bVar6.A(((scg) bVar6.R()).b(), new dg41(enrVar.c, new a(enrVar, bVar6), null, null, null, null, null, 252), new wui(bVar6, 7));
                }
                return zy11.a;
            }
            o oVar = bVar5.K;
            String str2 = fnrVar2.a;
            this.L$0 = bVar5;
            this.L$1 = fnrVar2;
            this.L$2 = bVar5;
            this.L$3 = null;
            this.label = 1;
            Object b = oVar.b(str2, authType, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
            fnrVar = fnrVar2;
            obj = b;
            bVar2 = bVar5;
            r1 = bVar5;
        } else {
            if (r1 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b bVar7 = (b) this.L$2;
            fnrVar = (fnr) this.L$1;
            bVar2 = (b) this.L$0;
            kotlin.b.b(obj);
            r1 = bVar7;
        }
        ua41Var = (ua41) obj;
        b bVar8 = bVar2;
        bVar = r1;
        bVar3 = bVar8;
        AuthType authType22 = fnrVar.b;
        String str3 = fnrVar.a;
        if (ua41Var != null) {
            boolean z2 = ua41Var instanceof ab60;
        }
        if (!(ua41Var instanceof pne)) {
        }
        FlexWebApi a2 = ((bnr) bVar3.I).a(fnrVar.c, fnrVar.d, new gym(bVar3));
        enr enrVar22 = new enr(str3, a2, bVar3.Q(str3, a2, fnrVar));
        simpleSpinnerModalView = bVar.Q;
        if (simpleSpinnerModalView != null) {
        }
        bVar.Q = null;
        enrVar = enrVar22;
        b bVar62 = this.this$0;
        if (enrVar == null) {
        }
        return zy11.a;
    }
}
