package com.yandex.passport.internal.methods.performer.ui;

import com.yandex.passport.api.PassportAccountUpgradeStatus;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.common.logger.c;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.methods.t0;
import com.yandex.passport.internal.report.reporters.f;
import com.yandex.passport.internal.report.t;
import com.yandex.passport.internal.report.td;
import com.yandex.passport.internal.report.u;
import com.yandex.passport.internal.report.x;
import com.yandex.passport.internal.report.yd;
import com.yandex.passport.internal.upgrader.UpgradeStatusRequestSource;
import com.yandex.passport.internal.upgrader.UpgradeStatusRequestType;
import com.yandex.passport.internal.util.p;
import defpackage.d6z;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lcom/yandex/passport/api/PassportAccountUpgradeStatus;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.methods.performer.ui.GetAccountUpgradeStatusPerformer$performMethod$1", f = "GetAccountUpgradeStatusPerformer.kt", l = {33, 34}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetAccountUpgradeStatusPerformer$performMethod$1 extends SuspendLambda implements wls {
    final /* synthetic */ t0 $method;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAccountUpgradeStatusPerformer$performMethod$1(t0 t0Var, b bVar, Continuation continuation) {
        super(2, continuation);
        this.$method = t0Var;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GetAccountUpgradeStatusPerformer$performMethod$1(this.$method, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetAccountUpgradeStatusPerformer$performMethod$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        if (r1 == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        r0 = r14;
        r14 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        if (r1 == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        PassportAccountUpgradeStatus passportAccountUpgradeStatus;
        Uid uid;
        Object obj2;
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Uid B = p.B((PassportUidImpl) this.$method.b.c);
            int i2 = a.a[((UpgradeStatusRequestType) this.$method.c.c).ordinal()];
            if (i2 == 1) {
                b bVar = this.this$0;
                bVar.getClass();
                c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "getCached for Uid=" + B, 8);
                }
                ModernAccount e = bVar.a.a().e(B);
                if (e == null || (passportAccountUpgradeStatus = e.getUpgradeStatus()) == null) {
                    passportAccountUpgradeStatus = PassportAccountUpgradeStatus.NOT_NEEDED;
                }
                Object d = d6z.d(passportAccountUpgradeStatus);
                uid = B;
                obj2 = d;
            } else if (i2 == 2) {
                b bVar2 = this.this$0;
                UpgradeStatusRequestSource upgradeStatusRequestSource = UpgradeStatusRequestSource.REQUEST;
                this.L$0 = B;
                this.label = 1;
                b = b.b(bVar2, B, upgradeStatusRequestSource, this);
            } else {
                if (i2 != 3) {
                    w511.b();
                    return null;
                }
                b bVar3 = this.this$0;
                UpgradeStatusRequestSource upgradeStatusRequestSource2 = UpgradeStatusRequestSource.RELEVANCE;
                this.L$0 = B;
                this.label = 2;
                b = b.b(bVar3, B, upgradeStatusRequestSource2, this);
            }
        } else {
            if (i != 1 && i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uid = (Uid) this.L$0;
            kotlin.b.b(obj);
            obj2 = ((Result) obj).getValue();
        }
        Result result = new Result(obj2);
        b bVar4 = this.this$0;
        t0 t0Var = this.$method;
        Object value = result.getValue();
        f fVar = bVar4.c;
        UpgradeStatusRequestType upgradeStatusRequestType = (UpgradeStatusRequestType) t0Var.c.c;
        fVar.getClass();
        fVar.f(x.w, new yd(uid), new yd(upgradeStatusRequestType), new td(new com.yandex.passport.internal.core.announcing.f(7), value));
        if (upgradeStatusRequestType == UpgradeStatusRequestType.RELEVANCE_CHECK) {
            p.p(fVar.b, Result.a(value) == null ? com.yandex.passport.internal.ui.c.p((PassportAccountUpgradeStatus) value) : false ? u.w : t.w, new yd(uid));
        }
        return result;
    }
}
